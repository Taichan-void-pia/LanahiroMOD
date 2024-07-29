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

public class SkillVazafila9Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean UseSK = false;
		boolean logic_attack = false;
		boolean UseVazafila = false;
		boolean muki = false;
		double range = 0;
		double data = 0;
		double rad = 0;
		double rad_now = 0;
		double xPos = 0;
		double yPos = 0;
		double zPos = 0;
		double yaw_now = 0;
		double dis = 0;
		double rotate = 0;
		double dis_start = 0;
		double xPos2 = 0;
		double yPos2 = 0;
		double zPos2 = 0;
		entity.getPersistentData().putDouble("cnt1", (entity.getPersistentData().getDouble("cnt1") + 1));
		entity.fallDistance = 0;
		if (entity.getPersistentData().getDouble("cnt1") == 1) {
			if (entity.getDeltaMovement().y() >= -0.5) {
				entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), 1.75, (entity.getDeltaMovement().z())));
			}
			entity.getPersistentData().putBoolean("flag_skill", false);
		}
		if ((entity.getPersistentData().getDouble("cnt1") > 20 || entity.getDeltaMovement().y() <= 0.2) && !entity.getPersistentData().getBoolean("flag_skill")) {
			entity.getPersistentData().putBoolean("flag_skill", true);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.end_gateway.spawn")), SoundSource.NEUTRAL, 2, (float) 0.5);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.end_gateway.spawn")), SoundSource.NEUTRAL, 2, (float) 0.5, false);
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.end_gateway.spawn")), SoundSource.NEUTRAL, 2, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.end_gateway.spawn")), SoundSource.NEUTRAL, 2, 1, false);
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.end_gateway.spawn")), SoundSource.NEUTRAL, 2, 2);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.end_gateway.spawn")), SoundSource.NEUTRAL, 2, 2, false);
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, 2, (float) 0.5);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, 2, (float) 0.5, false);
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, 2, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, 2, 1, false);
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, 2, 2);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, 2, 2, false);
				}
			}
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
			entity.getPersistentData().putDouble("start_r", (entity.getXRot() - 160));
			entity.getPersistentData().putDouble("rad", (entity.getYRot() + 90));
			entity.getPersistentData().putDouble("x_pos", x);
			entity.getPersistentData().putDouble("y_pos", (y + 1));
			entity.getPersistentData().putDouble("z_pos", z);
		}
		if (entity.getPersistentData().getBoolean("flag_skill")) {
			entity.getPersistentData().putDouble("cnt3", (entity.getPersistentData().getDouble("cnt3") + 1));
			if (entity.getPersistentData().getDouble("cnt3") < 17) {
				if (entity.getPersistentData().getDouble("cnt3") % 2 == 1) {
					entity.getPersistentData().putDouble("cnt2", 0);
				} else {
					entity.getPersistentData().putDouble("cnt2", 160);
				}
				dis = entity.getPersistentData().getDouble("cnt3") * 1.5;
				rad = Math.toRadians(entity.getPersistentData().getDouble("rad"));
				xPos2 = entity.getPersistentData().getDouble("x_pos") + Math.cos(rad) * dis;
				yPos2 = entity.getPersistentData().getDouble("y_pos") + Math.sin(Math.toRadians(entity.getPersistentData().getDouble("start_r") + 160)) * (-1) * dis;
				zPos2 = entity.getPersistentData().getDouble("z_pos") + Math.sin(rad) * dis;
				rad_now = Math.toRadians(entity.getPersistentData().getDouble("rad"));
				dis = entity.getPersistentData().getDouble("cnt3") * 1.6;
				for (int index0 = 0; index0 < 36; index0++) {
					rad = Math.toRadians(entity.getPersistentData().getDouble("start_r") + entity.getPersistentData().getDouble("cnt2"));
					xPos = xPos2 + Math.cos(rad) * Math.cos(rad_now) * dis;
					yPos = yPos2 + Math.sin(rad) * dis;
					zPos = zPos2 + Math.cos(rad) * Math.sin(rad_now) * dis;
					if (Math.random() < 0.5) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"particle dust 1.000 0.596 0.071 1 ~ ~ ~ 0.5 0.5 0.5 0.3 8 force");
					} else {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"particle dust 0.631 0.345 0.063 1 ~ ~ ~ 0.5 0.5 0.5 0.3 8 force");
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.SWEEP_ATTACK, xPos, yPos, zPos, 1, 0.5, 0.5, 0.5, 1);
					if (UseVazafila) {
						if (Math.random() < 0.15) {
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.PORTAL, xPos, yPos, zPos, 10, 0, 0, 0, 1);
						}
						if (Math.random() < 0.075) {
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.REVERSE_PORTAL, xPos, yPos, zPos, 10, 0, 0, 0, 1);
						}
					}
					entity.getPersistentData().putDouble("damage", (24 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
					entity.getPersistentData().putDouble("range", 5);
					entity.getPersistentData().putDouble("knockback", 1.5);
					entity.getPersistentData().putDouble("projectile_type", 2);
					DodamageProcedure.execute(world, xPos, yPos, zPos, entity);
					entity.getPersistentData().putDouble("cnt2", (entity.getPersistentData().getDouble("cnt2") - 5));
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(xPos, yPos, zPos), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, (float) 0.5, (float) 0.5);
						} else {
							_level.playLocalSound(xPos, yPos, zPos, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, (float) 0.5, (float) 0.5, false);
						}
					}
				}
			}
		}
		if (entity.getPersistentData().getDouble("cnt3") > 30 || entity.getPersistentData().getDouble("cnt3") == 0 && entity.getPersistentData().getDouble("cnt1") > 50) {
			entity.getPersistentData().putDouble("skill2", 0);
		}
	}
}
