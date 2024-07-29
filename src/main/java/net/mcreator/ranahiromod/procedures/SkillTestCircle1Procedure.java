package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.ranahiromod.entity.GeneralWitherSkeletonEntity;

public class SkillTestCircle1Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean general_logic = false;
		double zPos = 0;
		double yPos = 0;
		double rad = 0;
		double rad_now = 0;
		double yaw_now = 0;
		double xPos = 0;
		double dis = 0;
		double level = 0;
		double cnt = 0;
		general_logic = entity instanceof GeneralWitherSkeletonEntity;
		for (int index0 = 0; index0 < 10; index0++) {
			entity.getPersistentData().putDouble("cnt1", (entity.getPersistentData().getDouble("cnt1") + 1));
			if (entity.getPersistentData().getDouble("cnt1") == 1) {
				entity.getPersistentData().putDouble("start_r", (entity.getYRot() + 20));
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
			}
			if (entity.getPersistentData().getDouble("cnt1") < 3) {
				for (int index1 = 0; index1 < 10; index1++) {
					rad = Math.toRadians(entity.getPersistentData().getDouble("start_r") + entity.getPersistentData().getDouble("cnt2"));
					rad_now = Math.toRadians(entity.getXRot() + cnt * (Math.PI / 4));
					yaw_now = Math.toRadians(entity.getYRot() + 90 + cnt * (Math.PI / 2));
					dis = 2.4;
					for (int index2 = 0; index2 < 8; index2++) {
						xPos = x + Math.cos(rad) * (Math.cos(rad_now) + Math.abs(Math.sin(yaw_now) * Math.sin(rad_now))) * dis;
						yPos = y + 1 + Math.sin(Math.toRadians(entity.getPersistentData().getDouble("cnt2"))) * Math.sin(rad_now) * (-1) * dis;
						zPos = z + Math.sin(rad) * (Math.cos(rad_now) + Math.abs(Math.cos(yaw_now) * Math.sin(rad_now))) * dis;
						entity.getPersistentData().putDouble("damage", (10 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
						entity.getPersistentData().putDouble("knockback", 1);
						entity.getPersistentData().putDouble("range", 4);
						if (general_logic) {
							if (Math.random() < 0.5) {
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
											"particle dust 0.125 0.125 0.125 1 ~ ~ ~ 0 0 0 0 1 force");
							} else {
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
											"particle dust 0.35 0.35 0.35 1 ~ ~ ~ 0 0 0 0 1 force");
							}
							entity.getPersistentData().putDouble("effect", 15);
						} else {
							if (Math.random() < 0.5) {
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
											"particle dust 1 1 1 1 ~ ~ ~ 0 0 0 0 1 force");
							} else {
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
											"particle dust 0.5 0.5 0.5 1 ~ ~ ~ 0 0 0 0 1 force");
							}
						}
						DodamageProcedure.execute(world, xPos, yPos, zPos, entity);
						dis = dis + 0.4;
						cnt = cnt + 1;
					}
					entity.getPersistentData().putDouble("cnt2", (entity.getPersistentData().getDouble("cnt2") + 7));
				}
			}
			if (entity.getPersistentData().getDouble("cnt1") > 10) {
				entity.getPersistentData().putDouble("cnt1", 0);
				entity.getPersistentData().putDouble("cnt2", 0);
				entity.getPersistentData().putDouble("cnt3", 0);
			}
		}
	}
}
