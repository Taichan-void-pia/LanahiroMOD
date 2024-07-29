package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.ranahiromod.init.RanahiromodModItems;

public class GachaDropLootProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double xPos = 0;
		double yPos = 0;
		double zPos = 0;
		double rnd = 0;
		xPos = x + 0.5;
		yPos = y + 0.5;
		zPos = z + 0.5;
		rnd = Math.ceil(Math.random() * 8);
		if (rnd == 1) {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, xPos, yPos, zPos, new ItemStack(RanahiromodModItems.LAVAHIRO_ITEM.get()));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		} else if (rnd == 2) {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, xPos, yPos, zPos, new ItemStack(RanahiromodModItems.WATERHIRO_ITEM.get()));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		} else if (rnd == 3) {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, xPos, yPos, zPos, new ItemStack(RanahiromodModItems.WINDHIRO_ITEM.get()));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		} else if (rnd == 4) {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, xPos, yPos, zPos, new ItemStack(RanahiromodModItems.DRAGONHIRO_ITEM.get()));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		} else if (rnd == 5) {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, xPos, yPos, zPos, new ItemStack(RanahiromodModItems.ONIHIRO_ITEM.get()));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		} else if (rnd == 6) {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, xPos, yPos, zPos, new ItemStack(RanahiromodModItems.BOLTHIRO_ITEM.get()));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		} else if (rnd == 7) {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, xPos, yPos, zPos, new ItemStack(RanahiromodModItems.FOSSILAOI_SWORD_ITEM.get()));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		} else if (rnd == 8) {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, xPos, yPos, zPos, new ItemStack(RanahiromodModItems.MOTTIE_HAMMER.get()));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		} else if (rnd == 9) {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, xPos, yPos, zPos, new ItemStack(RanahiromodModItems.SK_LINER_5077_BLADE.get()));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		} else if (rnd == 10) {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, xPos, yPos, zPos, new ItemStack(RanahiromodModItems.VAZAFILA_SWORD.get()));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		} else if (rnd == 11) {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, xPos, yPos, zPos, new ItemStack(RanahiromodModItems.WARDENHIRO_ITEM.get()));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		} else if (rnd == 12) {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, xPos, yPos, zPos, new ItemStack(RanahiromodModItems.SUMAHIRO_PHONE.get()));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		} else if (rnd == 13) {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, xPos, yPos, zPos, new ItemStack(RanahiromodModItems.PHOTON_SWORD.get()));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		} else if (rnd == 14) {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, xPos, yPos, zPos, new ItemStack(RanahiromodModItems.KEY.get()));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		} else if (rnd == 15) {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, xPos, yPos, zPos, new ItemStack(RanahiromodModItems.EPIC_DOWN_SWORD.get()));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		} else if (rnd == 16) {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, xPos, yPos, zPos, new ItemStack(RanahiromodModItems.EPIC_DOWN_BATTLE_AXE.get()));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		} else if (rnd == 17) {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, xPos, yPos, zPos, new ItemStack(RanahiromodModItems.EPIC_DOWN_SPEAR.get()));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		} else if (rnd == 18) {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, xPos, yPos, zPos, new ItemStack(RanahiromodModItems.MELAMAIN_ROD.get()));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		} else if (rnd == 19) {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, xPos, yPos, zPos, new ItemStack(RanahiromodModItems.FARION_GUN.get()));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		} else if (rnd == 20) {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, xPos, yPos, zPos, new ItemStack(RanahiromodModItems.FARION_SWORD.get()));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		}
	}
}
