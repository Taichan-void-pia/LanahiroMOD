package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

public class DEVStickRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!entity.getPersistentData().getBoolean("Devlopment")) {
			entity.getPersistentData().putBoolean("Devlopment", true);
		} else {
			entity.getPersistentData().putBoolean("Devlopment", false);
		}
		SkillVerticalCircleProcedure.execute(world, x, y, z, entity);
	}
}
