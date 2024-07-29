package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.Difficulty;

public class DifficultyLevelProcedure {
	public static double execute(LevelAccessor world) {
		double magnification = 0;
		if (world.getDifficulty() == Difficulty.HARD) {
			magnification = 1.75;
		} else if (world.getDifficulty() == Difficulty.NORMAL) {
			magnification = 1.5;
		} else if (world.getDifficulty() == Difficulty.EASY) {
			magnification = 1;
		} else {
			magnification = 0.5;
		}
		return magnification;
	}
}
