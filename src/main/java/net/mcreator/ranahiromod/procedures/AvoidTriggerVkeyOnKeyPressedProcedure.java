package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.ranahiromod.init.RanahiromodModMobEffects;

public class AvoidTriggerVkeyOnKeyPressedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double x_power = 0;
		double z_power = 0;
		if ((entity.getDeltaMovement().x() != 0 || entity.getDeltaMovement().z() != 0) && entity.onGround()
				&& (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(RanahiromodModMobEffects.COOLDOWN_2.get()) ? _livEnt.getEffect(RanahiromodModMobEffects.COOLDOWN_2.get()).getDuration() : 0) <= 5
				&& (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(RanahiromodModMobEffects.COOLDOWN_2.get()) ? _livEnt.getEffect(RanahiromodModMobEffects.COOLDOWN_2.get()).getAmplifier() : 0) < 6) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.fire.extinguish")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.fire.extinguish")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			x_power = entity.getDeltaMovement().x();
			z_power = entity.getDeltaMovement().z();
			if (x_power > 1) {
				x_power = 1;
			}
			if (x_power < -1) {
				x_power = -1;
			}
			if (z_power > 1) {
				z_power = 1;
			}
			if (z_power < -1) {
				z_power = -1;
			}
			entity.setDeltaMovement(new Vec3((x_power * 10), 0.5, (z_power * 10)));
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(RanahiromodModMobEffects.COOLDOWN_2.get());
			if (!(entity instanceof LivingEntity _livEnt10 && _livEnt10.hasEffect(RanahiromodModMobEffects.COOLDOWN_2.get()))) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(RanahiromodModMobEffects.COOLDOWN_2.get(), 20, 0, false, false));
			} else if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(RanahiromodModMobEffects.COOLDOWN_2.get()) ? _livEnt.getEffect(RanahiromodModMobEffects.COOLDOWN_2.get()).getAmplifier() : 0) + 1 >= 6) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(RanahiromodModMobEffects.COOLDOWN_2.get(), 100,
							(int) ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(RanahiromodModMobEffects.COOLDOWN_2.get()) ? _livEnt.getEffect(RanahiromodModMobEffects.COOLDOWN_2.get()).getAmplifier() : 0) + 1), false, false));
			} else {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(RanahiromodModMobEffects.COOLDOWN_2.get(), 20,
							(int) ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(RanahiromodModMobEffects.COOLDOWN_2.get()) ? _livEnt.getEffect(RanahiromodModMobEffects.COOLDOWN_2.get()).getAmplifier() : 0) + 1), false, false));
			}
		}
	}
}
