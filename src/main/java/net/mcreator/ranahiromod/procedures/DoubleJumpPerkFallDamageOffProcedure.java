package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.ranahiromod.init.RanahiromodModMobEffects;

public class DoubleJumpPerkFallDamageOffProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double y_power = 0;
		if (entity.onGround()) {
			if (entity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(RanahiromodModMobEffects.DOUBLE_JUMP_COOL_DOWN.get())) {
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(RanahiromodModMobEffects.DOUBLE_JUMP_COOL_DOWN.get());
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(RanahiromodModMobEffects.DOUBLE_JUMP_COOL_DOWN_2.get());
			}
		}
		if (entity instanceof ServerPlayer _plr4 && _plr4.level() instanceof ServerLevel && _plr4.getAdvancements().getOrStartProgress(_plr4.server.getAdvancements().getAdvancement(new ResourceLocation("ranahiromod:double_jump_2"))).isDone()) {
			if (entity.getDeltaMovement().y() <= -0.5) {
				entity.fallDistance = 0;
			}
		}
	}
}
