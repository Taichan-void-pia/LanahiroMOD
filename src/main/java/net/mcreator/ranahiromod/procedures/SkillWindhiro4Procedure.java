package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class SkillWindhiro4Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean type = false;
		double xPos = 0;
		double yPos = 0;
		double zPos = 0;
		double range = 0;
		double rad = 0;
		double rad_now = 0;
		double dis = 0;
		double x_power = 0;
		double y_power = 0;
		double z_power = 0;
		double dis2 = 0;
		double yaw_now = 0;
		entity.getPersistentData().putDouble("cnt1", (entity.getPersistentData().getDouble("cnt1") + 1));
		if (entity.getPersistentData().getDouble("cnt2") == 0) {
			entity.getPersistentData().putDouble("start_r", (entity.getYRot()));
			if (entity.onGround()) {
				entity.getPersistentData().putDouble("cnt2", 1);
				if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity) {
					GetPowerProcedure.execute(world, x, y, z, entity);
				} else {
					GetPowerFowardProcedure.execute(world, x, y, z, entity);
				}
			}
		}
		rad = Math.toRadians(Math.random() * 360);
		for (int index0 = 0; index0 < 18; index0++) {
			rad = rad + Math.toRadians(10);
			rad_now = Math.toRadians(entity.getPersistentData().getDouble("start_r"));
			xPos = entity.getX() + Math.cos(rad) * Math.cos(rad_now) * 2;
			yPos = entity.getY() + entity.getBbHeight() / 2 + Math.sin(rad) * 2;
			zPos = entity.getZ() + Math.cos(rad) * Math.sin(rad_now) * 2;
			range = 0.25;
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						("particle dust 0.000 1.000 0.533 1 ~ ~ ~ " + range + " " + range + " " + range + " " + "1 5 force"));
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						("particle dust 0.722 1.000 0.831 1 ~ ~ ~ " + range + " " + range + " " + range + " " + "1 5 force"));
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.SWEEP_ATTACK, xPos, yPos, zPos, 2, range, range, range, 0.1);
		}
		entity.getPersistentData().putDouble("damage", (18 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
		entity.getPersistentData().putDouble("knockback", 1);
		entity.getPersistentData().putDouble("range", 5);
		entity.getPersistentData().putBoolean("swing", true);
		DodamageProcedure.execute(world, x, y + entity.getBbHeight() / 2, z, entity);
		if (entity.getPersistentData().getDouble("cnt1") % 2 == 0) {
			entity.getPersistentData().putDouble("cnt3", (Math.random() * 360));
			for (int index1 = 0; index1 < 10; index1++) {
				rad = Math.toRadians(entity.getPersistentData().getDouble("cnt3"));
				rad_now = Math.toRadians(entity.getPersistentData().getDouble("start_r"));
				xPos = entity.getX() + Math.cos(rad) * Math.cos(rad_now) * 2;
				yPos = entity.getY() + entity.getBbHeight() / 2 + Math.sin(rad) * 2;
				zPos = entity.getZ() + Math.cos(rad) * Math.sin(rad_now) * 2;
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"particle dust 1 1 1 2 ~ ~ ~ 0.2 0.2 0.2 1 5 force");
				entity.getPersistentData().putDouble("cnt3", (entity.getPersistentData().getDouble("cnt3") + 8));
			}
		}
		if (entity.onGround() && entity.getPersistentData().getDouble("cnt2") == 1) {
			x_power = entity.getPersistentData().getDouble("x_power") * 0.6;
			y_power = Math.min(entity.getDeltaMovement().y(), 0);
			z_power = entity.getPersistentData().getDouble("z_power") * 0.6;
			entity.setDeltaMovement(new Vec3(x_power, y_power, z_power));
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 0, Level.ExplosionInteraction.NONE);
			for (int index2 = 0; index2 < 4; index2++) {
				xPos = x + Math.random() * 4 - 2;
				yPos = y + Math.random() * 2 - 1;
				zPos = z + Math.random() * 4 - 2;
				world.levelEvent(2001, BlockPos.containing(xPos, yPos, zPos), Block.getId((world.getBlockState(BlockPos.containing(xPos, yPos, zPos)))));
			}
		}
		if (entity.getPersistentData().getDouble("cnt1") > 22) {
			entity.getPersistentData().putDouble("skill2", 0);
		}
	}
}
