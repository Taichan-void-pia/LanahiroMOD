package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.entity.Entity;

public class CoolDownFinishProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("swing_cnt", 0);
	}
}
