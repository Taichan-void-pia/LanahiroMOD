package net.mcreator.ranahiromod.procedures;

import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class RandomScaleMobProcedure {
	public static double execute() {
		return Math.max(Mth.nextDouble(RandomSource.create(), 1, 2), 0);
	}
}
