package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

public class SkillWaterhiroTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("skill2") != 0) {
			if (entity.getPersistentData().getDouble("skill2") == 201 || entity.getPersistentData().getDouble("skill2") == 16) {
				SkillWaterhiro1Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("skill2") == 202 || entity.getPersistentData().getDouble("skill2") == 17) {
				SkillWaterhiro2Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("skill2") == 203 || entity.getPersistentData().getDouble("skill2") == 18) {
				SkillWaterhiro3Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("skill2") == 204 || entity.getPersistentData().getDouble("skill2") == 19) {
				SkillWaterhiro4Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("skill2") == 205 || entity.getPersistentData().getDouble("skill2") == 20) {
				SkillWaterhiro5Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("skill2") == 206 || entity.getPersistentData().getDouble("skill2") == 21) {
				SkillWaterhiro6Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("skill2") == 207 || entity.getPersistentData().getDouble("skill2") == 22) {
				SkillWaterhiro7Procedure.execute(world, entity);
			}
		}
	}
}
