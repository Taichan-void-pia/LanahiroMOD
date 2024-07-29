package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.ranahiromod.init.RanahiromodModMobEffects;

public class DoubleJumpCoolDown2TickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING,
					entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(RanahiromodModMobEffects.DOUBLE_JUMP_COOL_DOWN_2.get()) ? _livEnt.getEffect(RanahiromodModMobEffects.DOUBLE_JUMP_COOL_DOWN_2.get()).getDuration() : 0, 0, false, false));
	}
}
