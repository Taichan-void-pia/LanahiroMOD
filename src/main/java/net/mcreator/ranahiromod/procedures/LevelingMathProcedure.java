package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.entity.Entity;

public class LevelingMathProcedure {
	public static double execute(Entity entity) {
		if (entity == null)
			return 0;
		double math_a = 0;
		double level = 0;
		double leveling_mag = 0;
		double shokou = 0;
		double kouhi = 0;
		level = entity.getPersistentData().getDouble("level");
		leveling_mag = 1;
		shokou = 10;
		kouhi = 1.1;
		math_a = Math.round(Math.max(shokou * ((1 - Math.pow(kouhi, level - 1)) / (1 - kouhi)), 1));
		entity.getPersistentData().putString("level_announce", ("\u6B21\u306E\u30EC\u30D9\u30EB\u306B\u306F\u3001" + Math.round(math_a) + "\u30DD\u30A4\u30F3\u30C8\u5FC5\u8981\u3067\u3059\u3002"));
		return math_a;
	}
}
