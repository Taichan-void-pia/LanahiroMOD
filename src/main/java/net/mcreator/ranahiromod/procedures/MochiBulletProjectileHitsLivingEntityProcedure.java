package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.entity.Entity;

public class MochiBulletProjectileHitsLivingEntityProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setSecondsOnFire(5);
	}
}
