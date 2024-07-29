package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.ranahiromod.init.RanahiromodModBlocks;

public class ShowcaseBlockIsPlacedByProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x, y + 1, z), RanahiromodModBlocks.GLASS_CASE.get().defaultBlockState(), 3);
	}
}
