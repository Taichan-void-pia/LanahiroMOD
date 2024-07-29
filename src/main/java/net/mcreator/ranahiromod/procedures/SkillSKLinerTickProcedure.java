package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

public class SkillSKLinerTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean WIP = false;
		if (entity.getPersistentData().getDouble("skill2") != 0) {
			if (entity.getPersistentData().getDouble("skill2") == 701) {
				SkillSKLiner1Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("skill2") == 702) {
				SkillSKLiner2Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("skill2") == 703) {
				SkillSKLiner3Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("skill2") == 704) {
				SkillSKLiner4Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("skill2") == 705) {
				SkillSKLiner5Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("skill2") == 706) {
				SkillSKLiner6Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("skill2") == 707) {
				SkillSKLiner7Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("skill2") == 708) {
				SkillSKLiner8Procedure.execute(world, x, y, z, entity);
			}
		}
		if (WIP) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("WIP"), false);
			entity.getPersistentData().putDouble("skill2", 0);
		}
	}
}
