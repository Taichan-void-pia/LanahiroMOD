package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class RotateEntityProcedure {
	public static void execute(double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double data_x = 0;
		double data_z = 0;
		double data_y = 0;
		double pitch = 0;
		double yaw = 0;
		double dis = 0;
		double TodegreeMath = 0;
		double max_num = 0;
		data_x = x - entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(0)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX();
		data_y = y - entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(0)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY();
		data_z = z - entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(0)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ();
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
