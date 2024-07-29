package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class SkillRashinProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double rotate = 0;
		double dis = 0;
		double dis2 = 0;
		double repeat = 0;
		if (entity.isShiftKeyDown()) {
			rotate = 0;
			for (int index0 = 0; index0 < 72; index0++) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							("execute rotated " + rotate + " 0 run particle dust 0.800 0.922 1.000 1 ^ ^ ^0.75 0.05 0 0.05 0 3 force"));
				if (rotate % 45 < 20 || rotate % 45 > 25) {
					dis = 1.5;
					dis2 = (22.5 - Math.abs(rotate % 45 - 22.5)) / 12;
					for (int index1 = 0; index1 < 2; index1++) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									("execute rotated " + rotate + " 0 run particle dust 0.800 0.922 1.000 1 ^ ^ ^" + (dis + dis2) + " 0.05 0 0.05 0 2 force"));
						dis = dis + 1;
					}
				}
				if (rotate % 45 == 0) {
					if (rotate % 90 == 0) {
						repeat = 8;
					} else {
						repeat = 6;
					}
					dis = 1;
					for (int index2 = 0; index2 < (int) repeat; index2++) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									("execute rotated " + rotate + " 0 run particle dust 0.800 0.922 1.000 1 ^ ^ ^" + dis + " 0.05 0 0.05 0 4 force"));
						dis = dis + 0.5;
					}
				}
				rotate = rotate + 5;
			}
		}
	}
}
