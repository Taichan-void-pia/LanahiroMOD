package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

public class SkillFossilaoi5Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double zPos = 0;
		double yPos = 0;
		double rad = 0;
		double rad_now = 0;
		double yaw_now = 0;
		double xPos = 0;
		double dis = 0;
		double yaw = 0;
		double pitch = 0;
		double yaw2 = 0;
		double pitch2 = 0;
		double xPos2 = 0;
		double yPos2 = 0;
		double zPos2 = 0;
		boolean logic_a = false;
		boolean logic_player = false;
		if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity) {
			if (entity.getPersistentData().getDouble("skill2") == 0) {
				if (GetDistanceProcedure.execute(entity) > 6) {
					entity.getPersistentData().putDouble("cnt1_bow", (entity.getPersistentData().getDouble("cnt1_bow") + 1));
					if (entity.getPersistentData().getDouble("cnt1_bow") % 40 == 10) {
						{
							Entity _shootFrom = entity;
							Level projectileLevel = _shootFrom.level();
							if (!projectileLevel.isClientSide()) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
										AbstractArrow entityToSpawn = new Arrow(EntityType.ARROW, level);
										entityToSpawn.setOwner(shooter);
										entityToSpawn.setBaseDamage(damage);
										entityToSpawn.setKnockback(knockback);
										return entityToSpawn;
									}
								}.getArrow(projectileLevel, entity, 5, 0);
								_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
								_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 5, 0);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
						}
					}
				} else {
					entity.getPersistentData().putDouble("cnt1_bow", 0);
				}
			}
			if (entity.getPersistentData().getDouble("skill2") != 0) {
				entity.getPersistentData().putDouble("cnt1_bow", 0);
			}
		}
	}
}
