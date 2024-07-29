package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.entity.Entity;

public class TestTarget1Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		boolean logic_a = false;
		logic_a = true;
		if (entity.getPersistentData().getDouble("cnt_target") < 5) {
			logic_a = false;
		}
		if (entity.getPersistentData().getBoolean("NoAI")) {
			logic_a = false;
		}
		return logic_a;
	}
}
