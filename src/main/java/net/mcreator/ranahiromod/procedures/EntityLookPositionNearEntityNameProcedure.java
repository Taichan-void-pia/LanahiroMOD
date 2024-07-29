package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;

import java.util.Comparator;

public class EntityLookPositionNearEntityNameProcedure {
	public static Entity execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return null;
		Entity nearest_entity = null;
		String name = "";
		double x_pos = 0;
		double y_pos = 0;
		double z_pos = 0;
		double dis = 0;
		boolean logic_a = false;
		dis = 0;
		for (int index0 = 0; index0 < 30; index0++) {
			x_pos = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(dis)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX();
			y_pos = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(dis)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY();
			z_pos = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(dis)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ();
			dis = dis + 1;
			if (!world.getEntitiesOfClass(Mob.class, AABB.ofSize(new Vec3(x_pos, y_pos, z_pos), 4, 4, 4), e -> true).isEmpty()) {
				logic_a = true;
				break;
			}
		}
		if (logic_a) {
			if (!world.getEntitiesOfClass(Mob.class, AABB.ofSize(new Vec3(x_pos, y_pos, z_pos), 4, 4, 4), e -> true).isEmpty()) {
				nearest_entity = (Entity) world.getEntitiesOfClass(Mob.class, AABB.ofSize(new Vec3(x_pos, y_pos, z_pos), 4, 4, 4), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x_pos, y_pos, z_pos)).findFirst().orElse(null);
			}
		}
		return nearest_entity;
	}
}
