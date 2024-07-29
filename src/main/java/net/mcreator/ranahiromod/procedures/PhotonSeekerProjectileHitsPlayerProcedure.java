package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.ranahiromod.init.RanahiromodModMobEffects;

public class PhotonSeekerProjectileHitsPlayerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity immediatesourceentity) {
		if (entity == null || immediatesourceentity == null)
			return;
		Entity imme = null;
		double x_power = 0;
		double y_power = 0;
		double z_power = 0;
		double dis = 0;
		double zPos = 0;
		double yPos = 0;
		double xPos = 0;
		immediatesourceentity.getPersistentData().putBoolean("bullet_logic_attack", true);
		if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(RanahiromodModMobEffects.LOW_ATTACK_REINFORCED.get()) ? _livEnt.getEffect(RanahiromodModMobEffects.LOW_ATTACK_REINFORCED.get()).getAmplifier() : 0) >= 0) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"particle dust 1.000 0.596 0.071 1 ~ ~ ~ 0.05 0.05 0.05 0 1 force");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"particle dust 0.631 0.345 0.063 1 ~ ~ ~ 0.05 0.05 0.05 0 1 force");
		} else {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"particle dust 0.627 0.141 1.000 1 ~ ~ ~ 0.05 0.05 0.05 0 1 force");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"particle dust 0.271 0.063 0.431 1 ~ ~ ~ 0.05 0.05 0.05 0 1 force");
		}
		imme = immediatesourceentity;
		if (imme.getPersistentData().getDouble("friend_num") == 0) {
			if (entity.getPersistentData().getDouble("friend_num") == 0) {
				entity.getPersistentData().putDouble("friend_num", Math.random());
			}
			imme.getPersistentData().putDouble("friend_num", (entity.getPersistentData().getDouble("friend_num")));
		}
		imme.setNoGravity(true);
		imme.getPersistentData().putBoolean("strong", true);
		imme.getPersistentData().putDouble("life", (imme.getPersistentData().getDouble("life") + 1));
		if (imme.getPersistentData().getDouble("life") % 2 == 1) {
			if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity) {
				x_power = (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).level()
						.clip(new ClipContext((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getEyePosition(1f),
								(entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getEyePosition(1f).add((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getViewVector(1f).scale(0)), ClipContext.Block.OUTLINE,
								ClipContext.Fluid.NONE, (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null)))
						.getBlockPos().getX() - x;
				y_power = (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).level()
						.clip(new ClipContext((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getEyePosition(1f),
								(entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getEyePosition(1f).add((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getViewVector(1f).scale(0)), ClipContext.Block.OUTLINE,
								ClipContext.Fluid.NONE, (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null)))
						.getBlockPos().getY() - y;
				z_power = (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).level()
						.clip(new ClipContext((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getEyePosition(1f),
								(entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getEyePosition(1f).add((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getViewVector(1f).scale(0)), ClipContext.Block.OUTLINE,
								ClipContext.Fluid.NONE, (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null)))
						.getBlockPos().getZ() - z;
			} else {
				x_power = entity.getX() - x;
				y_power = entity.getY() - y;
				z_power = entity.getZ() - z;
				dis = Math.abs(x_power) + Math.abs(y_power) + Math.abs(z_power);
				x_power = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(dis)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX() - x;
				y_power = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(dis)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY() - y;
				z_power = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(dis)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ() - z;
			}
			dis = Math.abs(x_power) + Math.abs(y_power) + Math.abs(z_power);
			if (dis != 0) {
				x_power = (x_power / dis) * 2;
				y_power = (y_power / dis) * 2;
				z_power = (z_power / dis) * 2;
				if (!imme.getPersistentData().getBoolean("Stop")) {
					if (imme.getDeltaMovement().x() > x_power) {
						x_power = imme.getDeltaMovement().x() - 0.25;
					} else {
						x_power = imme.getDeltaMovement().x() + 0.25;
					}
					if (imme.getDeltaMovement().y() > y_power) {
						y_power = imme.getDeltaMovement().y() - 0.25;
					} else {
						y_power = imme.getDeltaMovement().y() + 0.25;
					}
					if (imme.getDeltaMovement().z() > z_power) {
						z_power = imme.getDeltaMovement().z() - 0.25;
					} else {
						z_power = imme.getDeltaMovement().z() + 0.25;
					}
					imme.setDeltaMovement(new Vec3(x_power, y_power, z_power));
				} else {
					imme.getPersistentData().putBoolean("Stop", false);
				}
			}
		}
		if (imme.getPersistentData().getDouble("life") > 200) {
			if (!imme.level().isClientSide())
				imme.discard();
		}
		if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(RanahiromodModMobEffects.LOW_ATTACK_REINFORCED.get()) ? _livEnt.getEffect(RanahiromodModMobEffects.LOW_ATTACK_REINFORCED.get()).getAmplifier() : 0) >= 0) {
			entity.getPersistentData().putDouble("damage", (15 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
		} else {
			entity.getPersistentData().putDouble("damage", (15 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
		}
		entity.getPersistentData().putDouble("knockback", 0.5);
		if (UsePlayerLogicvazafilaProcedure.execute(entity)) {
			entity.getPersistentData().putDouble("range", 2.25);
		} else {
			entity.getPersistentData().putDouble("range", 1.25);
		}
		DodamageProcedure.execute(world, x, y, z, entity);
	}
}
