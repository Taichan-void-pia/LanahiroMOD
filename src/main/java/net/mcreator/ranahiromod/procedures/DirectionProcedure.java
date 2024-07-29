package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class DirectionProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double data_x = 0;
		double data_z = 0;
		double data_y = 0;
		double pitch = 0;
		double yaw = 0;
		double dis = 0;
		data_x = (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).level()
				.clip(new ClipContext((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getEyePosition(1f),
						(entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getEyePosition(1f).add((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getViewVector(1f).scale(0)), ClipContext.Block.COLLIDER,
						ClipContext.Fluid.NONE, (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null)))
				.getBlockPos().getX()
				- entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(0)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getX();
		data_y = (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).level()
				.clip(new ClipContext((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getEyePosition(1f),
						(entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getEyePosition(1f).add((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getViewVector(1f).scale(0)), ClipContext.Block.COLLIDER,
						ClipContext.Fluid.NONE, (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null)))
				.getBlockPos().getY()
				- entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(0)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getY();
		data_z = (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).level()
				.clip(new ClipContext((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getEyePosition(1f),
						(entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getEyePosition(1f).add((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getViewVector(1f).scale(0)), ClipContext.Block.COLLIDER,
						ClipContext.Fluid.NONE, (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null)))
				.getBlockPos().getZ()
				- entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(0)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ();
		dis = Math.abs(data_x) + Math.abs(data_y) + Math.abs(data_z);
		if (dis != 0) {
			data_x = data_x / dis;
			data_y = data_y / dis;
			data_z = data_z / dis;
		} else {
			data_x = 0;
			data_y = 0;
			data_z = 0;
		}
		if (data_x != 0) {
			yaw = Math.toDegrees(Math.atan(data_z / data_x));
		} else {
			yaw = 0;
		}
		if (yaw < 0) {
			yaw = yaw + 180;
		}
		yaw = yaw - 90;
		if (data_z < 0) {
			yaw = yaw + 180;
		}
		pitch = Math.sin(Math.toRadians(data_y * 90)) * (-90);
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
