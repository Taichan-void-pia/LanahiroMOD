package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.ranahiromod.init.RanahiromodModBlocks;

public class FlashLightHandTickProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double xPos = 0;
		double yPos = 0;
		double zPos = 0;
		if (itemstack.getOrCreateTag().getBoolean("light_on")) {
			xPos = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(10)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getX();
			yPos = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(10)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getY() + 1;
			zPos = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(10)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ();
			if ((world.getBlockState(BlockPos.containing(xPos, yPos, zPos))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(xPos, yPos, zPos))).getBlock() == Blocks.VOID_AIR
					|| (world.getBlockState(BlockPos.containing(xPos, yPos, zPos))).getBlock() == Blocks.CAVE_AIR) {
				world.setBlock(BlockPos.containing(xPos, yPos, zPos), RanahiromodModBlocks.FLASHLIGHT_BLOCK.get().defaultBlockState(), 3);
			}
		}
	}
}
