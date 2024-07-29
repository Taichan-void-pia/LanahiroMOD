package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.ranahiromod.init.RanahiromodModMobEffects;

public class SwingSKLinerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putString("color1", "0.500 1.000 1.000 1");
		entity.getPersistentData().putString("color2", "0.450 0.850 0.850 1");
		if (UsePlayerLogicProcedure.execute(entity)) {
			entity.getPersistentData().putString("color3", "ranahiromod:sk_liner_blade_particle");
		}
		if (entity.getPersistentData().getDouble("skill2") == 0) {
			if (entity.getPersistentData().getDouble("skill2_swing") == 0) {
				if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(RanahiromodModMobEffects.COOLDOWN.get()) ? _livEnt.getEffect(RanahiromodModMobEffects.COOLDOWN.get()).getAmplifier() : 0) <= entity.getPersistentData()
						.getDouble("swing_limit")) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ranahiromod:sword_sweep")), SoundSource.NEUTRAL, 1, (float) 0.8);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ranahiromod:sword_sweep")), SoundSource.NEUTRAL, 1, (float) 0.8, false);
						}
					}
				}
				SwingLogicProcedure.execute(world, x, y, z, entity);
				entity.getPersistentData().putDouble("swing_limit", SwingCntmathProcedure.execute(entity));
				entity.getPersistentData().putDouble("swing_skillcnt", SwingCooltimeMathProcedure.execute(entity));
			}
		}
	}
}
