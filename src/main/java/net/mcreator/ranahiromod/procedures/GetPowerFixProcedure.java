package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;

public class GetPowerFixProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double fix = 0;
		double PlayerPower = 0;
		PlayerPower = Math.min(entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0, 9);
		if (entity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(MobEffects.DAMAGE_BOOST)) {
			PlayerPower = PlayerPower + 1;
		}
		fix = 0.75 + PlayerPower / 40;
		if (false) {
			fix = fix + 0.25;
		}
		entity.getPersistentData().putDouble("x_power", (entity.getPersistentData().getDouble("x_power") * fix));
		entity.getPersistentData().putDouble("y_power", (entity.getPersistentData().getDouble("y_power") * fix));
		entity.getPersistentData().putDouble("z_power", (entity.getPersistentData().getDouble("z_power") * fix));
	}
}
