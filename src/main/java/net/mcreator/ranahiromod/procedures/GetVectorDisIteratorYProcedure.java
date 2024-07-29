package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import java.util.List;
import java.util.Comparator;

public class GetVectorDisIteratorYProcedure {
	public static double execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return 0;
		double x_knockback = 0;
		double z_knockback = 0;
		double y_knockback = 0;
		double dis = 0;
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				x_knockback = entityiterator.getX() - entity.getX();
				y_knockback = entityiterator.getY() - entity.getY();
				z_knockback = entityiterator.getZ() - entity.getZ();
				dis = Math.sqrt(Math.pow(x_knockback, 2) + Math.pow(y_knockback, 2) + Math.pow(z_knockback, 2));
			}
		}
		return y_knockback;
	}
}
