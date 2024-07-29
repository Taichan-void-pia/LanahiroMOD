package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class Melamain3rdAmmoWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity immediatesourceentity) {
		if (entity == null || immediatesourceentity == null)
			return;
		double y_power = 0;
		double z_power = 0;
		double x_power = 0;
		double dis = 0;
		entity.getPersistentData().putBoolean("bullet_logic_attack", true);
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					"particle dust 0.824 0.412 1.000 1 ~ ~ ~ 0.1 0.1 0.1 0.05 5 normal");
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.FIREWORK, x, y, z, 2, 0.1, 0.1, 0.1, 0.2);
		immediatesourceentity.getPersistentData().putDouble("life", (immediatesourceentity.getPersistentData().getDouble("life") + 1));
		if (immediatesourceentity.getPersistentData().getDouble("life") == 1) {
			immediatesourceentity.getPersistentData().putDouble("x_fix", (Math.random() * 8 - 4));
			immediatesourceentity.getPersistentData().putDouble("y_fix", (Math.random() * 8 - 4));
			immediatesourceentity.getPersistentData().putDouble("z_fix", (Math.random() * 8 - 4));
		}
		if (immediatesourceentity.getPersistentData().getDouble("life") < 25) {
			if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity) {
				x_power = ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).level()
						.clip(new ClipContext((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getEyePosition(1f),
								(entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getEyePosition(1f).add((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getViewVector(1f).scale(0)), ClipContext.Block.OUTLINE,
								ClipContext.Fluid.NONE, (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null)))
						.getBlockPos().getX() + immediatesourceentity.getPersistentData().getDouble("x_fix")) - x;
				y_power = ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).level()
						.clip(new ClipContext((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getEyePosition(1f),
								(entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getEyePosition(1f).add((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getViewVector(1f).scale(0)), ClipContext.Block.OUTLINE,
								ClipContext.Fluid.NONE, (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null)))
						.getBlockPos().getY() + immediatesourceentity.getPersistentData().getDouble("y_fix")) - y;
				z_power = ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).level()
						.clip(new ClipContext((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getEyePosition(1f),
								(entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getEyePosition(1f).add((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getViewVector(1f).scale(0)), ClipContext.Block.OUTLINE,
								ClipContext.Fluid.NONE, (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null)))
						.getBlockPos().getZ() + immediatesourceentity.getPersistentData().getDouble("z_fix")) - z;
			} else {
				x_power = (entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(15)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()
						+ immediatesourceentity.getPersistentData().getDouble("x_fix")) - x;
				y_power = (entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(15)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY()
						+ immediatesourceentity.getPersistentData().getDouble("y_fix")) - y;
				z_power = (entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(15)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()
						+ immediatesourceentity.getPersistentData().getDouble("z_fix")) - z;
			}
			dis = Math.abs(x_power) + Math.abs(y_power) + Math.abs(z_power);
			if (dis != 0) {
				x_power = (x_power / dis) * 1.5;
				y_power = (y_power / dis) * 1.5;
				z_power = (z_power / dis) * 1.5;
			} else {
				x_power = 0;
				y_power = 0;
				z_power = 0;
			}
			if (immediatesourceentity.getDeltaMovement().x() > x_power) {
				x_power = immediatesourceentity.getDeltaMovement().x() - 0.1;
			} else {
				x_power = immediatesourceentity.getDeltaMovement().x() + 0.1;
			}
			if (immediatesourceentity.getDeltaMovement().y() > y_power) {
				y_power = immediatesourceentity.getDeltaMovement().y() - 0.1;
			} else {
				y_power = immediatesourceentity.getDeltaMovement().y() + 0.1;
			}
			if (immediatesourceentity.getDeltaMovement().z() > z_power) {
				z_power = immediatesourceentity.getDeltaMovement().z() - 0.1;
			} else {
				z_power = immediatesourceentity.getDeltaMovement().z() + 0.1;
			}
			immediatesourceentity.setDeltaMovement(new Vec3(x_power, y_power, z_power));
		} else {
			for (int index0 = 0; index0 < 5; index0++) {
				if (Math.pow(immediatesourceentity.getDeltaMovement().x(), 2) + Math.pow(immediatesourceentity.getDeltaMovement().y(), 2) + Math.pow(immediatesourceentity.getDeltaMovement().z(), 2) < 2.25) {
					immediatesourceentity.setDeltaMovement(new Vec3((immediatesourceentity.getDeltaMovement().x() * 1.1), (immediatesourceentity.getDeltaMovement().y() * 1.1), (immediatesourceentity.getDeltaMovement().z() * 1.1)));
				}
			}
		}
		if (immediatesourceentity.getPersistentData().getDouble("life") > 80) {
			if (!immediatesourceentity.level().isClientSide())
				immediatesourceentity.discard();
		}
	}
}
