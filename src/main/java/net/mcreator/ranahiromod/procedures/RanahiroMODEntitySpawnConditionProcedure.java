package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class RanahiroMODEntitySpawnConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		boolean logic_a = false;
		logic_a = world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("ranahiromod:everest")) || world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("ranahiromod:neo_everest"));
		if (logic_a) {
			if (!(Math.random() < 0.1)) {
				logic_a = false;
			}
		}
		return logic_a;
	}
}
