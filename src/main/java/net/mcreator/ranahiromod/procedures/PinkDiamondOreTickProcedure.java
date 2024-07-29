package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class PinkDiamondOreTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() < 0.9) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.STONE.defaultBlockState(), 3);
		}
	}
}
