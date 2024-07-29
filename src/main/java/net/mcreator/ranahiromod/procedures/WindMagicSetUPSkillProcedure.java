package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.entity.Entity;

public class WindMagicSetUPSkillProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		boolean logic_glow = false;
		if (entity.getPersistentData().getDouble("skill2") == 0) {
			logic_glow = true;
		} else {
			logic_glow = false;
		}
		return logic_glow;
	}
}
