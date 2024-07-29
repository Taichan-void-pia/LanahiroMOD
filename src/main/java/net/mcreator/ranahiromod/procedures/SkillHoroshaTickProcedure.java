package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

public class SkillHoroshaTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean WIP = false;
		if (entity.getPersistentData().getDouble("skill2") != 0) {
			if (entity.getPersistentData().getDouble("skill2") == 1401) {
				SkillHorosha1Procedure.execute(world, entity);
			} else if (entity.getPersistentData().getDouble("skill2") == 1402) {
				SkillHorosha2Procedure.execute(entity);
			} else if (entity.getPersistentData().getDouble("skill2") == 1403) {
				SkillHorosha3Procedure.execute(world, entity);
			} else if (entity.getPersistentData().getDouble("skill2") == 1404) {
				SkillHorosha4Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("skill2") == 1405) {
				SkillHorosha5Procedure.execute(world, x, y, z, entity);
			}
		}
		if (WIP) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("WIP"), false);
			entity.getPersistentData().putDouble("skill2", 0);
		}
	}
}
