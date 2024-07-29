package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.ranahiromod.init.RanahiromodModMobEffects;

public class DropVectorOnEffectActiveTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double level = 0;
		double math_a = 0;
		level = entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(RanahiromodModMobEffects.DROP_VECTOR.get()) ? _livEnt.getEffect(RanahiromodModMobEffects.DROP_VECTOR.get()).getAmplifier() : 0;
		math_a = (level / 10) * (-1);
		if (!entity.onGround()) {
			entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (-1), (entity.getDeltaMovement().z())));
		}
	}
}
