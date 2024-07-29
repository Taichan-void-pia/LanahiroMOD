package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import java.util.List;
import java.util.Comparator;

public class KnockbackProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double x_knockback = 0;
		double z_knockback = 0;
		double y_knockback = 0;
		double dis = 0;
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate((entity.getPersistentData().getDouble("range") / 2) / 2d), e -> true).stream()
					.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (!(entityiterator == entity)) {
					if ((entityiterator instanceof Projectile _projEnt ? _projEnt.getDeltaMovement().length() : 0) > 0 || LogicAttackProcedure.execute(world, x, y, z, entity) && entityiterator instanceof LivingEntity) {
						x_knockback = entityiterator.getX() - entity.getX();
						y_knockback = entityiterator.getY() - entity.getY();
						z_knockback = entityiterator.getZ() - entity.getZ();
						dis = Math.sqrt(Math.pow(x_knockback, 2) + Math.pow(y_knockback, 2) + Math.pow(z_knockback, 2));
						if (dis != 0) {
							x_knockback = (x_knockback / dis) * 3 * entity.getPersistentData().getDouble("knockback");
							y_knockback = (y_knockback / dis) * 3 * entity.getPersistentData().getDouble("knockback");
							z_knockback = (z_knockback / dis) * 3 * entity.getPersistentData().getDouble("knockback");
						} else {
							x_knockback = entityiterator.getDeltaMovement().x();
							y_knockback = entityiterator.getDeltaMovement().y();
							z_knockback = entityiterator.getDeltaMovement().z();
						}
						entityiterator.setDeltaMovement(new Vec3(x_knockback, y_knockback, z_knockback));
					}
				}
			}
		}
		entity.getPersistentData().putDouble("knockback", 0);
	}
}
