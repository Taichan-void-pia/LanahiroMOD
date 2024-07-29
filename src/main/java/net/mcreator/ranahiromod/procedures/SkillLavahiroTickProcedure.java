package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

public class SkillLavahiroTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("skill2") != 0) {
			if (entity.getPersistentData().getDouble("skill2") == 101 || entity.getPersistentData().getDouble("skill2") == 9) {
				SkillBosshiro5Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("skill2") == 102 || entity.getPersistentData().getDouble("skill2") == 10) {
				SkillLavahiro2Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("skill2") == 103 || entity.getPersistentData().getDouble("skill2") == 11) {
				SkillLavahiro3Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("skill2") == 104 || entity.getPersistentData().getDouble("skill2") == 12) {
				SkillLavahiro4Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("skill2") == 105 || entity.getPersistentData().getDouble("skill2") == 13) {
				SkillLavahiro5Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("skill2") == 106 || entity.getPersistentData().getDouble("skill2") == 14) {
				SkillLavahiro6Procedure.execute(world, entity);
			} else if (entity.getPersistentData().getDouble("skill2") == 107 || entity.getPersistentData().getDouble("skill2") == 15) {
				SkillLavahiro7Procedure.execute(entity);
			}
		}
	}
}
