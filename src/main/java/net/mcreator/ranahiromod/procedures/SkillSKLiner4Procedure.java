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
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.ranahiromod.init.RanahiromodModParticleTypes;

public class SkillSKLiner4Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean UseSK = false;
		boolean logic_attack = false;
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
		double dis_range = 0;
		double rad2 = 0;
		double num1 = 0;
		double num2 = 0;
		entity.getPersistentData().putDouble("cnt1", (entity.getPersistentData().getDouble("cnt1") + 1));
		UseSK = UsePlayerLogicProcedure.execute(entity);
		entity.fallDistance = 0;
		if (entity.getPersistentData().getDouble("cnt3") < 2) {
			if (entity.getPersistentData().getDouble("cnt1") == 1) {
				if (entity.getPersistentData().getDouble("cnt3") == 0) {
					entity.getPersistentData().putDouble("cnt2", (entity.getXRot() - 90));
				} else {
					entity.getPersistentData().putDouble("cnt2", 0);
					entity.getPersistentData().putDouble("start_r", (entity.getYRot()));
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ranahiromod:sword_sweep")), SoundSource.NEUTRAL, 1, (float) 0.5);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ranahiromod:sword_sweep")), SoundSource.NEUTRAL, 1, (float) 0.5, false);
					}
				}
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
			}
			if (entity.getPersistentData().getDouble("cnt1") < 5) {
				for (int index0 = 0; index0 < 9; index0++) {
					if (entity.getPersistentData().getDouble("cnt3") == 0) {
						dis = 2.5;
						rad = Math.toRadians(entity.getPersistentData().getDouble("cnt2"));
						rad_now = Math.toRadians(entity.getYRot() + 90);
					} else {
						dis = 2.5;
						rad = Math.toRadians(entity.getPersistentData().getDouble("start_r") + entity.getPersistentData().getDouble("cnt2"));
						rad_now = Math.toRadians(entity.getXRot());
						yaw_now = Math.toRadians(entity.getYRot() + 90);
					}
					if (UseSK) {
						dis = dis * 1.5;
					}
					for (int index1 = 0; index1 < 6; index1++) {
						if (entity.getPersistentData().getDouble("cnt3") == 0) {
							xPos = entity.getX() + Math.cos(rad) * Math.cos(rad_now) * dis;
							yPos = entity.getY() + Math.sin(rad * (-1)) * dis;
							zPos = entity.getZ() + Math.cos(rad) * Math.sin(rad_now) * dis;
						} else {
							xPos = x + Math.cos(rad) * (Math.cos(rad_now) + Math.abs(Math.sin(yaw_now) * Math.sin(rad_now))) * dis;
							yPos = y + 1 + Math.sin(Math.toRadians(entity.getPersistentData().getDouble("cnt2"))) * Math.sin(rad_now * (-1)) * dis;
							zPos = z + Math.sin(rad) * (Math.cos(rad_now) + Math.abs(Math.cos(yaw_now) * Math.sin(rad_now))) * dis;
						}
						if (UseSK) {
							dis_range = 3 * 1.5;
						} else {
							dis_range = 3;
						}
						if (dis < dis_range) {
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.SWEEP_ATTACK, xPos, yPos, zPos, 1, 0, 0, 0, 0);
							if (UseSK) {
								if (Math.random() < (dis_range - 3.5) / 10) {
									if (world instanceof ServerLevel _level)
										_level.sendParticles((SimpleParticleType) (RanahiromodModParticleTypes.SK_LINER_BLADE_PARTICLE.get()), xPos, yPos, zPos, 1, 0.1, 0.1, 0.1, 0.01);
								}
							}
						}
						if (UseSK) {
							dis_range = 5 * 1.5;
						} else {
							dis_range = 5;
						}
						if (dis < dis_range) {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"particle dust_color_transition 0.500 1.000 1.000 2 0.350 0.250 1.000 ~ ~ ~ 0 0 0 1 1 force");
							if (UseSK) {
								if (Math.random() < (dis_range - 6.5) / 10) {
									if (Math.random() < 0.5) {
										if (world instanceof ServerLevel _level)
											_level.sendParticles((SimpleParticleType) (RanahiromodModParticleTypes.SK_LINER_BLADE_PARTICLE.get()), xPos, yPos, zPos, 1, 0.3, 0.3, 0.3, 0.01);
									} else {
										if (world instanceof ServerLevel _level)
											_level.sendParticles((SimpleParticleType) (RanahiromodModParticleTypes.SK_LINER_BLADE_PARTICLE_2.get()), xPos, yPos, zPos, 1, 0.1, 0.1, 0.1, 0.01);
									}
								}
							}
						}
						entity.getPersistentData().putDouble("damage", (19 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
						if (UseSK) {
							entity.getPersistentData().putDouble("range", 4);
						} else {
							entity.getPersistentData().putDouble("range", 3);
						}
						entity.getPersistentData().putDouble("knockback", 1);
						entity.getPersistentData().putDouble("projectile_type", 2);
						DodamageProcedure.execute(world, xPos, yPos, zPos, entity);
						dis = dis + 0.6;
					}
					entity.getPersistentData().putDouble("cnt2", (entity.getPersistentData().getDouble("cnt2") + 5));
				}
			} else {
				entity.getPersistentData().putDouble("cnt1", 0);
				entity.getPersistentData().putDouble("cnt3", (entity.getPersistentData().getDouble("cnt3") + 1));
			}
		} else if (entity.getPersistentData().getDouble("cnt1") > 10) {
			entity.getPersistentData().putDouble("skill2", 0);
		}
	}
}
