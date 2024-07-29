package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

public class SkillVolthiroTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean WIP = false;
		if (entity.getPersistentData().getDouble("skill2") != 0) {
			if (entity.getPersistentData().getDouble("skill2") == 601 || entity.getPersistentData().getDouble("skill2") == 37) {
				SkillVolthiro1Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("skill2") == 602 || entity.getPersistentData().getDouble("skill2") == 38) {
				SkillVolthiro2Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("skill2") == 603 || entity.getPersistentData().getDouble("skill2") == 39) {
				SkillVolthiro3Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("skill2") == 604 || entity.getPersistentData().getDouble("skill2") == 40) {
				SkillVolthiro4Procedure.execute(world, entity);
			} else if (entity.getPersistentData().getDouble("skill2") == 605 || entity.getPersistentData().getDouble("skill2") == 41) {
				SkillVolthiro5Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("skill2") == 606 || entity.getPersistentData().getDouble("skill2") == 42) {
				SkillVolthiro6Procedure.execute(world, x, y, z, entity);
			}
		}
		if (WIP) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("WIP"), false);
			entity.getPersistentData().putDouble("skill2", 0);
		}
	}
}
