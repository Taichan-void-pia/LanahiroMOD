package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;

import net.mcreator.ranahiromod.init.RanahiromodModMobEffects;

public class SwingCooltimeMathProcedure {
	public static double execute(Entity entity) {
		if (entity == null)
			return 0;
		double cooldown = 0;
		double level_TotalConcentrationConstant = 0;
		double math_a = 0;
		if (entity instanceof Player _plr ? _plr.getAbilities().instabuild : false) {
			math_a = 1;
		} else {
			math_a = 7;
			if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) >= 0) {
				cooldown = Math.min(entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0, 10);
				cooldown = Math.min((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0)
						+ (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(RanahiromodModMobEffects.LOW_ATTACK_REINFORCED.get()) ? _livEnt.getEffect(RanahiromodModMobEffects.LOW_ATTACK_REINFORCED.get()).getAmplifier() : 0), 25);
				math_a = Math.round(math_a * (1 - cooldown / 25) + 1);
			}
		}
		return math_a;
	}
}
