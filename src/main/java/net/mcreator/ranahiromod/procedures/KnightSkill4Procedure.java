package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.ranahiromod.entity.GeneralWitherSkeletonEntity;

public class KnightSkill4Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean type = false;
		double zPos = 0;
		double yPos = 0;
		double xPos = 0;
		double dis2 = 0;
		double dis = 0;
		double y_power = 0;
		double z_power = 0;
		double rad = 0;
		double rad_now = 0;
		double x_power = 0;
		double num1 = 0;
		double pitch = 0;
		double num3 = 0;
		double num2 = 0;
		double dis_range = 0;
		double tsuki7_mode = 0;
		double HP = 0;
		double yaw_now = 0;
		double cnt = 0;
		entity.getPersistentData().putDouble("cnt1", (entity.getPersistentData().getDouble("cnt1") + 1));
		type = entity instanceof GeneralWitherSkeletonEntity;
		if (entity.getPersistentData().getDouble("cnt1") < 12) {
			if (entity.getPersistentData().getDouble("cnt1") < 7) {
				if (entity.getPersistentData().getDouble("cnt1") == 1) {
					entity.getPersistentData().putDouble("x_pos", (entity.getX()));
					entity.getPersistentData().putDouble("y_pos", (entity.getY()));
					entity.getPersistentData().putDouble("z_pos", (entity.getZ()));
					entity.getPersistentData().putDouble("start_r", (entity.getYRot() + 17.5));
					entity.getPersistentData().putDouble("yaw", (entity.getYRot() + 90));
					entity.getPersistentData().putDouble("pitch", (entity.getXRot()));
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ranahiromod:sword_sweep")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ranahiromod:sword_sweep")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
				rad_now = Math.toRadians(entity.getPersistentData().getDouble("pitch"));
				yaw_now = Math.toRadians(entity.getPersistentData().getDouble("yaw"));
				for (int index0 = 0; index0 < 18; index0++) {
					rad = Math.toRadians(entity.getPersistentData().getDouble("start_r") + entity.getPersistentData().getDouble("cnt2"));
					num1 = Math.cos(rad) * (Math.cos(rad_now) + Math.abs(Math.sin(yaw_now) * Math.sin(rad_now)));
					num2 = Math.sin(Math.toRadians(entity.getPersistentData().getDouble("cnt2"))) * Math.sin(rad_now) * (-1);
					num3 = Math.sin(rad) * (Math.cos(rad_now) + Math.abs(Math.cos(yaw_now) * Math.sin(rad_now)));
					dis = 2;
					dis_range = 7;
					for (int index1 = 0; index1 < (int) Math.round(dis_range); index1++) {
						xPos = entity.getPersistentData().getDouble("x_pos") + num1 * (dis - 0.5);
						yPos = entity.getPersistentData().getDouble("y_pos") + entity.getBbHeight() * 0.5 + num2 * (dis - 0.5);
						zPos = entity.getPersistentData().getDouble("z_pos") + num3 * (dis - 0.5);
						if (Math.round(dis) * 10 == Math.round(dis * 10)) {
							entity.getPersistentData().putDouble("damage", (21 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
							entity.getPersistentData().putDouble("knockback", 2.5);
							entity.getPersistentData().putDouble("range", 2.5);
							entity.getPersistentData().putDouble("projectile_type", 1);
							if (type) {
								entity.getPersistentData().putDouble("effect", 15);
							}
							DodamageProcedure.execute(world, xPos, yPos, zPos, entity);
						}
						if (type) {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"particle dust 0.125 0.125 0.125 1 ~ ~ ~ 0.05 0.05 0.05 0.05 2 force");
						} else {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"particle dust 1 1 1 1 ~ ~ ~ 0.05 0.05 0.05 0.05 2 force");
						}
						dis = dis + 0.2;
					}
					if (type) {
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.DRAGON_BREATH, xPos, yPos, zPos, 2, 0, 0, 0, 0.1);
					} else {
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.CLOUD, xPos, yPos, zPos, 2, 0, 0, 0, 0.1);
					}
					entity.getPersistentData().putDouble("cnt2", (entity.getPersistentData().getDouble("cnt2") + 5));
				}
			} else {
				rad_now = Math.toRadians(entity.getPersistentData().getDouble("pitch"));
				yaw_now = Math.toRadians(entity.getPersistentData().getDouble("yaw"));
				for (int index2 = 0; index2 < 72; index2++) {
					rad = Math.toRadians(entity.getPersistentData().getDouble("start_r") + cnt);
					num1 = Math.cos(rad) * (Math.cos(rad_now) + Math.abs(Math.sin(yaw_now) * Math.sin(rad_now)));
					num2 = Math.sin(Math.toRadians(cnt)) * Math.sin(rad_now) * (-1);
					num3 = Math.sin(rad) * (Math.cos(rad_now) + Math.abs(Math.cos(yaw_now) * Math.sin(rad_now)));
					dis = 2 + entity.getPersistentData().getDouble("cnt1") - 6;
					dis_range = 7;
					for (int index3 = 0; index3 < (int) Math.round(dis_range); index3++) {
						xPos = entity.getPersistentData().getDouble("x_pos") + num1 * (dis - 0.5);
						yPos = entity.getPersistentData().getDouble("y_pos") + entity.getBbHeight() * 0.5 + num2 * (dis - 0.5);
						zPos = entity.getPersistentData().getDouble("z_pos") + num3 * (dis - 0.5);
						if (Math.round(dis) * 10 == Math.round(dis * 10)) {
							entity.getPersistentData().putDouble("damage", (21 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
							entity.getPersistentData().putDouble("knockback", 2.5);
							entity.getPersistentData().putDouble("range", 2.5);
							entity.getPersistentData().putDouble("projectile_type", 1);
							if (type) {
								entity.getPersistentData().putDouble("effect", 15);
							}
							DodamageProcedure.execute(world, xPos, yPos, zPos, entity);
						}
						if (type) {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"particle dust 0.125 0.125 0.125 1 ~ ~ ~ 0.05 0.05 0.05 0.05 2 force");
						} else {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"particle dust 1 1 1 1 ~ ~ ~ 0.05 0.05 0.05 0.05 2 force");
						}
						dis = dis + 0.2;
					}
					if (type) {
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.DRAGON_BREATH, xPos, yPos, zPos, 2, 0, 0, 0, 0.1);
					} else {
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.CLOUD, xPos, yPos, zPos, 2, 0, 0, 0, 0.1);
					}
					cnt = cnt + 5;
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.NEUTRAL, 1, (float) 0.4);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.NEUTRAL, 1, (float) 0.4, false);
					}
				}
			}
		} else {
			entity.getPersistentData().putDouble("skill2", 0);
		}
	}
}
