package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

public class SkillSpladotTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean WIP = false;
		if (entity.getPersistentData().getDouble("skill2") != 0) {
			if (entity.getPersistentData().getDouble("skill2") == 1301) {
				SpladotSkill1Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("skill2") == 1302) {
				SpladotSkill2Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("skill2") == 1303) {
				SpladotSkill3Procedure.execute(world, y, entity);
			} else if (entity.getPersistentData().getDouble("skill2") == 1304) {
				SpladotSkill4Procedure.execute(world, entity);
			} else if (entity.getPersistentData().getDouble("skill2") == 1305) {
				SpladotSkill6Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("skill2") == 1306) {
				SpladotSkill5Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("skill2") == 1307) {
				WIP = true;
			}
		}
		if (WIP) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("WIP"), false);
			entity.getPersistentData().putDouble("skill2", 0);
		}
	}
}
