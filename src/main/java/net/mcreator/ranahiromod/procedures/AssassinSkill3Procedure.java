package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;

public class AssassinSkill3Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double zPos = 0;
		double yPos = 0;
		double xPos = 0;
		entity.getPersistentData().putDouble("cnt1", (entity.getPersistentData().getDouble("cnt1") + 1));
		entity.getPersistentData().putDouble("damage", (19 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
		entity.getPersistentData().putDouble("knockback", 0);
		entity.getPersistentData().putDouble("range", 1);
		entity.getPersistentData().putDouble("projectile_type", 1);
		entity.getPersistentData().putDouble("effect", 13);
		DodamageProcedure.execute(world, x, y, z, entity);
		if (entity.getPersistentData().getDouble("cnt1") > 3) {
			entity.getPersistentData().putDouble("skill2", 0);
		}
	}
}
