package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;

import net.mcreator.ranahiromod.init.RanahiromodModMobEffects;

public class SwingCntmathProcedure {
	public static double execute(Entity entity) {
		if (entity == null)
			return 0;
		double math_a = 0;
		math_a = Math.round(Math.random() * (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0));
		math_a = Math.round(math_a * (Math.min(entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0, 10) / 10));
		math_a = math_a + 15
				+ Math.round((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(RanahiromodModMobEffects.LOW_ATTACK_REINFORCED.get()) ? _livEnt.getEffect(RanahiromodModMobEffects.LOW_ATTACK_REINFORCED.get()).getAmplifier() : 0) * 1.25);
		return math_a;
	}
}
