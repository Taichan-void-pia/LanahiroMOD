package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

public class SkillOnihiroTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean WIP = false;
		if (entity.getPersistentData().getDouble("skill2") != 0) {
			if (entity.getPersistentData().getDouble("skill2") == 501 || entity.getPersistentData().getDouble("skill2") == 32) {
				SkillOnihiro0Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("skill2") == 502 || entity.getPersistentData().getDouble("skill2") == 33) {
				SkillOnihiro1Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("skill2") == 503 || entity.getPersistentData().getDouble("skill2") == 34) {
				SkillOnihiro2Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("skill2") == 504 || entity.getPersistentData().getDouble("skill2") == 35) {
				SkillOnihiro3no2Procedure.execute(world, entity);
			} else if (entity.getPersistentData().getDouble("skill2") == 505 || entity.getPersistentData().getDouble("skill2") == 36) {
				SkillOnihiro5Procedure.execute(world, x, y, z, entity);
			}
		}
		if (WIP) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("WIP"), false);
			entity.getPersistentData().putDouble("skill2", 0);
		}
	}
}
