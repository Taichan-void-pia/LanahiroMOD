package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.ranahiromod.init.RanahiromodModMobEffects;
import net.mcreator.ranahiromod.init.RanahiromodModItems;

public class SwingVazafilaProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RanahiromodModItems.VAZAFILA_KATANA.get()) {
			entity.getPersistentData().putString("color1", "1.000 0.596 0.071 1");
			entity.getPersistentData().putString("color2", "0.631 0.345 0.063 1");
		} else {
			if (entity instanceof LivingEntity _livEnt4 && _livEnt4.hasEffect(RanahiromodModMobEffects.LOW_ATTACK_REINFORCED.get())) {
				entity.getPersistentData().putString("color1", "1.000 0.596 0.071 1");
				entity.getPersistentData().putString("color2", "0.631 0.345 0.063 1");
			} else {
				entity.getPersistentData().putString("color1", "0.627 0.141 1.000 1");
				entity.getPersistentData().putString("color2", "0.271 0.063 0.431 1");
			}
		}
		if (UsePlayerLogicvazafilaProcedure.execute(entity)) {
			entity.getPersistentData().putString("color3", "minecraft:portal");
		} else {
			entity.getPersistentData().putString("color3", "");
		}
		if (entity.getPersistentData().getDouble("skill2") == 0) {
			if (entity.getPersistentData().getDouble("skill2_swing") == 0) {
				if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(RanahiromodModMobEffects.COOLDOWN.get()) ? _livEnt.getEffect(RanahiromodModMobEffects.COOLDOWN.get()).getAmplifier() : 0) <= entity.getPersistentData()
						.getDouble("swing_limit")) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, 1, (float) 0.6);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, 1, (float) 0.6, false);
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
