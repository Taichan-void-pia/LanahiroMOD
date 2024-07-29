package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.level.BlockEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.ranahiromod.init.RanahiromodModItems;
import net.mcreator.ranahiromod.init.RanahiromodModBlocks;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class RicePlantSeedDropProcedure {
	@SubscribeEvent
	public static void onBlockBreak(BlockEvent.BreakEvent event) {
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ());
	}

	public static void execute(LevelAccessor world, double x, double y, double z) {
		execute(null, world, x, y, z);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.GRASS || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.FERN
				|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.TALL_GRASS || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == RanahiromodModBlocks.RICE_PLANT_STAGE_7.get()) {
			if (Math.random() < 0.3) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RanahiromodModBlocks.RICE_PLANT_STAGE_0.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.SEAGRASS || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.TALL_SEAGRASS) {
			if (Math.random() < 0.3) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RanahiromodModItems.WET_NORI.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
	}
}
