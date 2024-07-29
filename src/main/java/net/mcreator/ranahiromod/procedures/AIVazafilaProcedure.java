package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;

import net.mcreator.ranahiromod.init.RanahiromodModItems;

public class AIVazafilaProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double rnd = 0;
		double dis = 0;
		if (entity.isAlive()) {
			ActiveHashiraProcedure.execute(world, x, y, z, entity);
			if (entity.getPersistentData().getDouble("mode") == 1) {
				SkillVazafila1Procedure.execute(world, entity);
			} else if (entity.getPersistentData().getDouble("mode") == 2) {
				SkillVazafila2Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("mode") == 3) {
				SkillVazafila3Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("mode") == 4) {
				SkillVazafila4Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("mode") == 5) {
				SkillVazafila5Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("mode") == 6) {
				SkillVazafila6Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("mode") == 7) {
				SkillVazafila8Procedure.execute(world, entity);
			} else if (entity.getPersistentData().getDouble("mode") == 8) {
				SkillVazafila9Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("mode") == 9) {
				SkillVazafila10Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("mode") == 10) {
				SkillVazafila11Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("mode") == 11) {
				SkillVazafila12Procedure.execute(world, x, y, z, entity);
			} else if (!((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity)) {
				entity.getPersistentData().putDouble("cnt_target", 0);
				if (entity.getPersistentData().getDouble("cnt_x") > 50) {
					entity.getPersistentData().putDouble("cnt_x", 50);
				}
			} else {
				entity.getPersistentData().putDouble("cnt_target", (entity.getPersistentData().getDouble("cnt_target") + 1));
				entity.getPersistentData().putDouble("cnt_x", (entity.getPersistentData().getDouble("cnt_x") + 1));
				if (entity.getPersistentData().getDouble("cnt_x") > 60) {
					entity.getPersistentData().putDouble("cnt_x", 0);
					entity.getPersistentData().putDouble("cnt1", 0);
					entity.getPersistentData().putDouble("cnt2", 0);
					entity.getPersistentData().putDouble("cnt3", 0);
					entity.getPersistentData().putDouble("cnt4", 0);
					entity.getPersistentData().putDouble("cnt5", 0);
					entity.getPersistentData().putDouble("skill2", 1);
					for (int index0 = 0; index0 < 50; index0++) {
						rnd = Math.ceil(Math.random() * 11);
						dis = GetDistanceProcedure.execute(entity);
					}
					entity.getPersistentData().putDouble("mode", rnd);
					if (entity.getPersistentData().getDouble("mode") >= 7 && entity.getPersistentData().getDouble("mode") <= 11) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack = new ItemStack(RanahiromodModItems.VAZAFILA_KATANA.get()).copy();
							_setstack.setCount(1);
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack = new ItemStack(RanahiromodModItems.VAZAFILA_SWORD.get()).copy();
							_setstack.setCount(1);
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
					DirectionProcedure.execute(entity);
				}
			}
			if (entity.getPersistentData().getDouble("skill2") == 0) {
				entity.getPersistentData().putDouble("mode", 0);
			}
		}
	}
}
