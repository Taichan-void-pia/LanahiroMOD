package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import java.util.List;
import java.util.Comparator;

public class RotateEntity2Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double data_x = 0;
		double data_z = 0;
		double data_y = 0;
		double pitch = 0;
		double yaw = 0;
		double dis = 0;
		double max_num = 0;
		double TodegreeMath = 0;
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(75 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (entity.getPersistentData().getDouble("NameRanged_ranged") == entityiterator.getPersistentData().getDouble("NameRanged")) {
					if ((entityiterator instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity) {
						data_x = x - (entityiterator instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).level()
								.clip(new ClipContext((entityiterator instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getEyePosition(1f),
										(entityiterator instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getEyePosition(1f).add((entityiterator instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getViewVector(1f).scale(0)),
										ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, (entityiterator instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null)))
								.getBlockPos().getX();
						data_y = y - (entityiterator instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).level()
								.clip(new ClipContext((entityiterator instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getEyePosition(1f),
										(entityiterator instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getEyePosition(1f).add((entityiterator instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getViewVector(1f).scale(0)),
										ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, (entityiterator instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null)))
								.getBlockPos().getY();
						data_z = z - (entityiterator instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).level()
								.clip(new ClipContext((entityiterator instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getEyePosition(1f),
										(entityiterator instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getEyePosition(1f).add((entityiterator instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getViewVector(1f).scale(0)),
										ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, (entityiterator instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null)))
								.getBlockPos().getZ();
						dis = Math.sqrt(Math.pow(data_x, 2) + Math.pow(data_y, 2) + Math.pow(data_z, 2));
						TodegreeMath = Math.toDegrees(Math.atan(data_z / data_x));
						if (data_x > 0) {
							yaw = TodegreeMath - 90;
						} else if (data_x < 0) {
							if (data_z < 0) {
								yaw = TodegreeMath - 270;
							} else {
								yaw = TodegreeMath + 90;
							}
						} else if (data_z > 0) {
							yaw = 0;
						} else if (data_z < 0) {
							yaw = -180;
						} else {
							yaw = -90;
						}
						max_num = Math.sqrt(Math.pow(data_x, 2) + Math.pow(data_z, 2));
						if (max_num == 0) {
							max_num = 0.01;
						}
						pitch = Math.toRadians(Math.atan((data_y * (-1)) / max_num));
						{
							Entity _ent = entity;
							_ent.setYRot((float) yaw);
							_ent.setXRot((float) pitch);
							_ent.setYBodyRot(_ent.getYRot());
							_ent.setYHeadRot(_ent.getYRot());
							_ent.yRotO = _ent.getYRot();
							_ent.xRotO = _ent.getXRot();
							if (_ent instanceof LivingEntity _entity) {
								_entity.yBodyRotO = _entity.getYRot();
								_entity.yHeadRotO = _entity.getYRot();
							}
						}
					}
				}
			}
		}
	}
}
