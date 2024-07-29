package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

public class BlockDestroyCMDProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double xpos = 0;
		double ypos = 0;
		double zpos = 0;
		double rad = 0;
		double rotate = 0;
		entity.getPersistentData().putDouble("BlockRange", 10);
		entity.getPersistentData().putDouble("BlockDamage", 100);
		BlockDestroyProcedure.execute(world, x, y, z, entity);
	}
}
