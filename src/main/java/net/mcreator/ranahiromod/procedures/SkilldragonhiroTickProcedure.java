package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

public class SkilldragonhiroTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean WIP = false;
		if (entity.getPersistentData().getDouble("skill2") != 0) {
			if (entity.getPersistentData().getDouble("skill2") == 401 || entity.getPersistentData().getDouble("skill2") == 28) {
				SkillDragonhiro1Procedure.execute(world, entity);
			} else if (entity.getPersistentData().getDouble("skill2") == 402 || entity.getPersistentData().getDouble("skill2") == 29) {
				SkillDragonhiro2Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("skill2") == 403 || entity.getPersistentData().getDouble("skill2") == 30) {
				SkillDragonhiro3Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("skill2") == 404 || entity.getPersistentData().getDouble("skill2") == 31) {
				SkillDragonhiro4Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("skill2") == 405) {
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
