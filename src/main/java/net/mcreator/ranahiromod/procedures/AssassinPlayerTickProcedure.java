package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

public class AssassinPlayerTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean WIP = false;
		if (entity.getPersistentData().getDouble("skill2") != 0) {
			if (entity.getPersistentData().getDouble("skill2") == 20401) {
				AssassinSkill1Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("skill2") == 20402) {
				AssassinSkill2Procedure.execute(entity);
			} else if (entity.getPersistentData().getDouble("skill2") == 20403) {
				AssassinSkill3Procedure.execute(world, entity.getPersistentData().getDouble("x_pos"), entity.getPersistentData().getDouble("y_pos"), entity.getPersistentData().getDouble("z_pos"), entity);
			} else if (entity.getPersistentData().getDouble("skill2") == 20404) {
				AssassinSkill4Procedure.execute(world, entity.getPersistentData().getDouble("x_pos"), entity.getPersistentData().getDouble("y_pos"), entity.getPersistentData().getDouble("z_pos"), entity);
			}
		}
		if (WIP) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("WIP"), false);
			entity.getPersistentData().putDouble("skill2", 0);
		}
	}
}
