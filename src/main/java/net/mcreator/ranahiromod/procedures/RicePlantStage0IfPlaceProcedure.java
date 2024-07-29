package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class RicePlantStage0IfPlaceProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		return Blocks.WHEAT.defaultBlockState().canSurvive(world, BlockPos.containing(x, y, z));
	}
}
