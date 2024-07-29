package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.ranahiromod.init.RanahiromodModItems;

public class DieZokuseihiroBukaProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double yaw = 0;
		double pitch = 0;
		if (Math.random() < 0.01) {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RanahiromodModItems.KEY.get()));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		}
	}
}
