package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

public class SkillVerticalCircleProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double rotate_x = 0;
		double rotate_z = 0;
		double x_pos = 0;
		double y_pos = 0;
		double z_pos = 0;
		double rotate_y = 0;
		double rad = 0;
		double rotate = 0;
		double dis = 0;
		double yaw = 0;
		double pitch = 0;
		x_pos = x;
		y_pos = y;
		z_pos = z;
		dis = 4;
		yaw = Math.toRadians(entity.getYRot() % 360);
		pitch = Math.toRadians(entity.getXRot() / 2);
		for (int index0 = 0; index0 < 72; index0++) {
			rad = Math.toRadians(rotate);
			x_pos = x + Math.cos(rad) * dis;
			y_pos = y + 1 + Math.sin(rad) * dis;
			z_pos = z;
			rotate_x = x + (x_pos - x) * Math.cos(yaw) - (z_pos - z) * Math.sin(yaw);
			rotate_z = z + (x_pos - x) * Math.sin(yaw) + (z_pos - z) * Math.cos(yaw);
			rotate_y = y + 1 + (y_pos - (y + 1)) * Math.cos(pitch) - (rotate_z - z) * Math.sin(pitch);
			rotate_z = z + (y_pos - (y + 1)) * Math.sin(pitch) + (rotate_z - z) * Math.cos(pitch);
			rotate_x = x + (rotate_x - x) * Math.cos(pitch) - (rotate_y - (y + 1)) * Math.sin(pitch);
			rotate_y = y + 1 + (rotate_x - x) * Math.sin(pitch) + (rotate_y - (y + 1)) * Math.cos(pitch);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.SWEEP_ATTACK, rotate_x, rotate_y, rotate_z, 2, 0, 0, 0, 0);
			rotate = rotate + 5;
		}
	}
}
