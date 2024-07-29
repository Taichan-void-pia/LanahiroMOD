package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.level.LevelAccessor;

public class StructureCoreProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double rnd = 0;
		rnd = Math.random();
		if (rnd <= 1) {
			StructureUNDProcedure.execute(world, x, y, z);
		}
	}
}
