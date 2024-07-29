package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

public class SkillWindhiroTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean wip = false;
		if (entity.getPersistentData().getDouble("skill2") != 0) {
			if (entity.getPersistentData().getDouble("skill2") == 301 || entity.getPersistentData().getDouble("skill2") == 23) {
				SkillWindhiro1Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("skill2") == 302 || entity.getPersistentData().getDouble("skill2") == 24) {
				SkillWindhiro2Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("skill2") == 303 || entity.getPersistentData().getDouble("skill2") == 25) {
				SkillWindhiro3Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("skill2") == 304 || entity.getPersistentData().getDouble("skill2") == 26) {
				SkillWindhiro4Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("skill2") == 305 || entity.getPersistentData().getDouble("skill2") == 27) {
				SkillWindhiro5Procedure.execute(world, entity);
			}
		}
	}
}
