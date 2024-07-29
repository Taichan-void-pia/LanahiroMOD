package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;

import java.util.Comparator;

public class OverlayEntityProcedure {
	public static boolean execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return false;
		double xPos = 0;
		double yPos = 0;
		double zPos = 0;
		double dis = 0;
		boolean logic_a = false;
		boolean logic_b = false;
		logic_a = false;
		dis = 0;
		for (int index0 = 0; index0 < 30; index0++) {
			xPos = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(dis)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX();
			yPos = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(dis)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY();
			zPos = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(dis)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ();
			dis = dis + 1;
			if (!world.getEntitiesOfClass(Mob.class, AABB.ofSize(new Vec3(xPos, yPos, zPos), 4, 4, 4), e -> true).isEmpty()) {
				logic_b = true;
				break;
			}
		}
		if (logic_b) {
			if (!world.getEntitiesOfClass(Mob.class, AABB.ofSize(new Vec3(xPos, yPos, zPos), 4, 4, 4), e -> true).isEmpty()) {
				if (((Entity) world.getEntitiesOfClass(Mob.class, AABB.ofSize(new Vec3(xPos, yPos, zPos), 4, 4, 4), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(xPos, yPos, zPos)).findFirst().orElse(null)).isAlive()) {
					logic_a = true;
				}
			}
		}
		return logic_a;
	}
}