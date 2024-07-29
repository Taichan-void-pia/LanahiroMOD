package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

public class SkillWeaponhiroTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean WIP = false;
		if (entity.getPersistentData().getDouble("skill2") != 0) {
			if (entity.getPersistentData().getDouble("skill2") == 1002) {
				SkillWeaponhiro1NeoProcedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("skill2") == 1003) {
				SkillWeaponhiro2NeoProcedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("skill2") == 1004) {
				SkillWeaponhiro3NeoProcedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("skill2") == 1005) {
				SkillWeaponhiro1Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("skill2") == 1006) {
				SkillWeaponhiro2Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("skill2") == 1007) {
				SkillWeaponhiro6NeoProcedure.execute(world, y, entity);
			}
		}
		if (WIP) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("WIP"), false);
			entity.getPersistentData().putDouble("skill2", 0);
		}
	}
}
