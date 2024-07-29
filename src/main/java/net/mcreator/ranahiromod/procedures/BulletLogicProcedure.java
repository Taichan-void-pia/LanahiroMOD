package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.entity.Entity;

public class BulletLogicProcedure {
	public static void execute(Entity immediatesourceentity) {
		if (immediatesourceentity == null)
			return;
		immediatesourceentity.getPersistentData().putBoolean("bullet_logic_attack", true);
	}
}
