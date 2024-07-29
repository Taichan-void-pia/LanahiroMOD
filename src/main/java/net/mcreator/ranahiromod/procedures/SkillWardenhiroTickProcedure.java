package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

public class SkillWardenhiroTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean WIP = false;
		if (entity.getPersistentData().getDouble("skill2") != 0) {
			if (entity.getPersistentData().getDouble("skill2") == 801 || entity.getPersistentData().getDouble("skill2") == 41) {
				SkillWardenhiro1Procedure.execute(world, entity);
			} else if (entity.getPersistentData().getDouble("skill2") == 802 || entity.getPersistentData().getDouble("skill2") == 42) {
				SkillWardenhiro2Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("skill2") == 803 || entity.getPersistentData().getDouble("skill2") == 43) {
				SkillWardenhiro3Procedure.execute(world, entity);
			} else if (entity.getPersistentData().getDouble("skill2") == 804) {
				SkillWardenhiro4Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("skill2") == 805) {
				SkillWardenhiro5Procedure.execute(world, entity);
			}
		}
		if (WIP) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("WIP"), false);
			entity.getPersistentData().putDouble("skill2", 0);
		}
	}
}
