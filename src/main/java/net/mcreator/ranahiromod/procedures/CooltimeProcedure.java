package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;

import net.mcreator.ranahiromod.network.RanahiromodModVariables;

public class CooltimeProcedure {
	public static double execute(Entity entity) {
		if (entity == null)
			return 0;
		double cooldown = 0;
		double level_TotalConcentrationConstant = 0;
		double level_attackspeed = 0;
		if (entity instanceof Player _plr ? _plr.getAbilities().instabuild : false) {
			cooldown = 20;
		} else {
			cooldown = 100;
			if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) >= 0) {
				level_TotalConcentrationConstant = Math.min(entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0, 10);
				level_attackspeed = Math.min((entity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).attackspeed, 10);
				cooldown = cooldown * (1 - level_TotalConcentrationConstant / 25);
				cooldown = cooldown - level_attackspeed * 2;
			}
			if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.WEAKNESS) ? _livEnt.getEffect(MobEffects.WEAKNESS).getAmplifier() : 0) >= 0) {
				cooldown = cooldown * 3;
			}
			if (cooldown == 0) {
				cooldown = 1;
			}
		}
		return cooldown;
	}
}
