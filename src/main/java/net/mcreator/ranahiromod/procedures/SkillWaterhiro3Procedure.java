package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class SkillWaterhiro3Procedure {
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
		if (entity.getPersistentData().getDouble("cnt2") == 0) {
			entity.getPersistentData().putDouble("cnt1", (entity.getPersistentData().getDouble("cnt1") + 1));
			entity.fallDistance = 0;
			if (entity.getPersistentData().getDouble("cnt1") <= 40) {
				if (entity.getPersistentData().getDouble("cnt1") == 1) {
					entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), 1.25, (entity.getDeltaMovement().z())));
				}
				if (entity.getPersistentData().getDouble("cnt1") > 2) {
					if (entity.onGround()) {
						entity.getPersistentData().putDouble("cnt1", 0);
						entity.getPersistentData().putDouble("cnt2", 1);
						if (entity instanceof LivingEntity _entity)
							_entity.swing(InteractionHand.MAIN_HAND, true);
					}
				}
			} else {
				entity.getPersistentData().putDouble("skill2", 0);
			}
		}
		if (entity.getPersistentData().getDouble("cnt2") > 0) {
			entity.getPersistentData().putDouble("cnt2", (entity.getPersistentData().getDouble("cnt2") + 1));
			if (entity.getPersistentData().getDouble("cnt2") >= 2) {
				if (entity.getPersistentData().getDouble("cnt2") == 2) {
					entity.getPersistentData().putDouble("start_r", (entity.getYRot() + 90));
					entity.getPersistentData().putDouble("x_pos", x);
					entity.getPersistentData().putDouble("y_pos", y);
					entity.getPersistentData().putDouble("z_pos", z);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.splash")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.splash")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					if (world instanceof Level _level && !_level.isClientSide())
						_level.explode(null, x, y, z, 0, Level.ExplosionInteraction.NONE);
				}
				tsuki7_mode = 0;
				for (int index0 = 0; index0 < 8; index0++) {
					rad = Math.toRadians(entity.getPersistentData().getDouble("start_r") + tsuki7_mode);
					dis = (entity.getPersistentData().getDouble("cnt2") - 2) / 2.5;
					for (int index1 = 0; index1 < 3; index1++) {
						xPos = entity.getPersistentData().getDouble("x_pos");
						yPos = entity.getPersistentData().getDouble("y_pos");
						zPos = entity.getPersistentData().getDouble("z_pos");
						xPos = xPos + Math.cos(rad) * dis * 2.5;
						zPos = zPos + Math.sin(rad) * dis * 2.5;
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.SPLASH, xPos, yPos, zPos, 20, 0.1, 0.1, 0.1, 0.05);
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"particle dust 0.361 0.765 1.000 2 ~ ~ ~ 0.1 0.1 0.1 0.1 10 force");
						entity.getPersistentData().putDouble("damage", (17 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
						entity.getPersistentData().putDouble("knockback", 1.5);
						entity.getPersistentData().putDouble("range", 2.5);
						entity.getPersistentData().putDouble("projectile_type", 1);
						DodamageProcedure.execute(world, xPos, yPos, zPos, entity);
						if (entity.getPersistentData().getDouble("cnt2") > 7) {
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.SPLASH, xPos, yPos, zPos, 10, 0.5, 0.5, 0.5, 0.05);
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.BUBBLE, xPos, yPos, zPos, 10, 0.75, 0.75, 0.75, 0.05);
							for (int index2 = 0; index2 < 10; index2++) {
								if (world instanceof ServerLevel _level)
									_level.sendParticles(ParticleTypes.BUBBLE, xPos, yPos, zPos, 10, 0.75, 0.75, 0.75, 0.05);
								if (world instanceof ServerLevel _level)
									_level.sendParticles(ParticleTypes.SPLASH, xPos, yPos, zPos, 10, 0.5, 0.5, 0.5, 0.05);
								if (world instanceof ServerLevel _level)
									_level.sendParticles(ParticleTypes.CLOUD, xPos, yPos, zPos, 20, 0.3, 0.5, 0.3, 0.3);
								entity.getPersistentData().putDouble("damage", (19 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
								entity.getPersistentData().putDouble("knockback", 1.5);
								entity.getPersistentData().putDouble("range", 4);
								entity.getPersistentData().putDouble("projectile_type", 1);
								DodamageProcedure.execute(world, xPos, yPos, zPos, entity);
								yPos = yPos + 1;
							}
							dis = dis + 0.5;
						}
					}
					tsuki7_mode = tsuki7_mode + 45;
				}
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, x, y, z, 0, Level.ExplosionInteraction.NONE);
			}
			if (entity.getPersistentData().getDouble("cnt2") > 7) {
				entity.getPersistentData().putDouble("skill2", 0);
			}
		}
	}
}
