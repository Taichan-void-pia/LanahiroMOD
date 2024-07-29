package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.ranahiromod.entity.Maruchi100Entity;

public class ElderDragonSwordHandTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity instanceof Maruchi100Entity) {
			itemstack.getOrCreateTag().putDouble("cnt_num", (itemstack.getOrCreateTag().getDouble("cnt_num") + 1));
			if (itemstack.getOrCreateTag().getDouble("cnt_num") >= 5) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.fire.extinguish")), SoundSource.NEUTRAL, 1, (float) 0.5);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.fire.extinguish")), SoundSource.NEUTRAL, 1, (float) 0.5, false);
					}
				}
				itemstack.getOrCreateTag().putDouble("cnt_num", 0);
			}
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.SWEEP_ATTACK, x, (y + 1), z, 2, 1, 1, 1, 0);
			ArrowSweepDeleteProcedure.execute(world, x, y, z, entity);
		} else {
			if (entity.isShiftKeyDown()) {
				itemstack.getOrCreateTag().putDouble("cnt_num", (itemstack.getOrCreateTag().getDouble("cnt_num") + 1));
				if (itemstack.getOrCreateTag().getDouble("cnt_num") >= 5) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.fire.extinguish")), SoundSource.NEUTRAL, 1, (float) 0.5);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.fire.extinguish")), SoundSource.NEUTRAL, 1, (float) 0.5, false);
						}
					}
					itemstack.getOrCreateTag().putDouble("cnt_num", 0);
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.SWEEP_ATTACK, x, (y + 1), z, 2, 1, 1, 1, 0);
				ArrowSweepDeleteProcedure.execute(world, x, y, z, entity);
			}
		}
	}
}
