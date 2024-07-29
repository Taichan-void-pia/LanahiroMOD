package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.ranahiromod.init.RanahiromodModParticleTypes;

import java.util.List;
import java.util.Comparator;

public class OffsetShockWaveProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double xPos = 0;
		double yPos = 0;
		double zPos = 0;
		double strength = 0;
		double strength_source = 0;
		double max_strength = 0;
		double min_strength = 0;
		double dis = 0;
		double rad = 0;
		double rad_now = 0;
		double yaw_now = 0;
		double y_power = 0;
		double z_power = 0;
		double num_y = 0;
		double num_z = 0;
		double x_power = 0;
		double pitch = 0;
		double num_x = 0;
		double cnt = 0;
		double dis_start = 0;
		double bachi_sound = 0;
		double x_c = 0;
		double y_c = 0;
		double z_c = 0;
		if (entity.getPersistentData().getBoolean("offset_shockwave") && entity.getPersistentData().getDouble("cnt_wave") != 0) {
			x_c = entity.getPersistentData().getDouble("x_c");
			y_c = entity.getPersistentData().getDouble("y_c");
			z_c = entity.getPersistentData().getDouble("z_c");
			entity.getPersistentData().putDouble("cnt_wave", (entity.getPersistentData().getDouble("cnt_wave") + 1));
			if (entity.getPersistentData().getDouble("cnt_wave") == 3) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x_c, y_c, z_c), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.lightning_bolt.impact")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x_c, y_c, z_c, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.lightning_bolt.impact")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x_c, y_c, z_c), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.lightning_bolt.thunder")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x_c, y_c, z_c, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.lightning_bolt.thunder")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
			if (entity.getPersistentData().getDouble("cnt_wave") > 3 && entity.getPersistentData().getDouble("cnt_wave") <= 6) {
				bachi_sound = (entity.getPersistentData().getDouble("cnt_wave") - 3) * 0.2;
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x_c, y_c, z_c), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ranahiromod:bachi")), SoundSource.NEUTRAL,
								(float) (1 + entity.getPersistentData().getDouble("cnt_wave") * 0.3), (float) bachi_sound);
					} else {
						_level.playLocalSound(x_c, y_c, z_c, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ranahiromod:bachi")), SoundSource.NEUTRAL, (float) (1 + entity.getPersistentData().getDouble("cnt_wave") * 0.3),
								(float) bachi_sound, false);
					}
				}
			}
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(12 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (!(entityiterator == entity)) {
						if (LogicTargetPlayerIteratorProcedure.execute(world, x, y, z, entity)) {
							if ((entityiterator instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) >= 0) {
								strength = entityiterator instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0;
							}
							if ((entityiterator instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof Mob) {
								if (((entityiterator instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST)
										? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier()
										: 0) >= 0) {
									strength_source = (entityiterator instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST)
											? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier()
											: 0;
								}
							} else {
								if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) >= 0) {
									strength_source = entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0;
								}
							}
							max_strength = Math.max(Math.max(strength, strength_source), 1);
							min_strength = Math.max(Math.min(strength, strength_source), 1);
							if (entity.getPersistentData().getDouble("cnt_wave_repeat") <= 2) {
								if (entity.getPersistentData().getDouble("cnt_wave_repeat") == 0) {
									entity.getPersistentData().putDouble("cnt_wave_repeat", 1);
								}
								dis_start = min_strength * (max_strength / min_strength);
								dis = dis_start * entity.getPersistentData().getDouble("cnt_wave_repeat");
								yaw_now = Math.toRadians(Math.random() * 360);
								rad_now = Math.toRadians((Math.random() - 0.5) * 180);
								for (int index0 = 0; index0 < 72; index0++) {
									rad = Math.toRadians(cnt);
									if (Math.random() < 0.5) {
										xPos = x_c + Math.cos(rad) * (Math.cos(rad_now) + Math.abs(Math.sin(yaw_now) * Math.sin(rad_now))) * dis;
										yPos = y_c + Math.sin(Math.toRadians(cnt)) * Math.sin(rad_now) * (-1) * dis;
										zPos = z_c + Math.sin(rad) * (Math.cos(rad_now) + Math.abs(Math.cos(yaw_now) * Math.sin(rad_now))) * dis;
									} else {
										xPos = x_c + Math.cos(rad) * Math.cos(rad_now) * dis;
										yPos = y_c + Math.sin(rad_now) * dis;
										zPos = z_c + Math.cos(rad) * Math.sin(rad_now) * dis;
									}
									if (Math.random() < 0.5) {
										if (world instanceof ServerLevel _level)
											_level.sendParticles(ParticleTypes.ENCHANTED_HIT, xPos, yPos, zPos, 1, 0.2, 0.2, 0.2, 0.05);
									} else {
										if (world instanceof ServerLevel _level)
											_level.sendParticles(ParticleTypes.CRIT, xPos, yPos, zPos, 1, 0.2, 0.2, 0.2, 0.05);
									}
									if (world instanceof ServerLevel _level)
										_level.sendParticles(ParticleTypes.EXPLOSION, xPos, yPos, zPos, 1, 0, 0, 0, 0.01);
									if (world instanceof ServerLevel _level)
										_level.sendParticles((SimpleParticleType) (RanahiromodModParticleTypes.OFFSET_WAVE_PARTICLE.get()), xPos, yPos, zPos, 5, 0.25, 0.25, 0.25, 0.05);
									cnt = cnt + 5;
								}
								entity.getPersistentData().putDouble("cnt_wave_repeat", (entity.getPersistentData().getDouble("cnt_wave_repeat") + 0.25));
							} else {
								entity.getPersistentData().putDouble("cnt_wave_repeat", 1);
							}
							if (entity.getPersistentData().getDouble("cnt_wave") < 15) {
								rad_now = Math.toRadians(Math.random() * 360);
								pitch = Math.toRadians(0);
								num_x = (Math.random() - 0.5) * 1.2;
								num_y = (Math.random() - 0.5) * 1.2;
								num_z = (Math.random() - 0.5) * 1.2;
								entity.getPersistentData().putDouble("cnt_wave2", 0);
								x_power = x_c;
								y_power = y_c;
								z_power = z_c;
								for (int index1 = 0; index1 < (int) (36 + entity.getPersistentData().getDouble("cnt_wave") * 3); index1++) {
									xPos = x_power + Math.cos(rad_now) * (Math.cos(pitch) + Math.abs(Math.sin(rad_now) * Math.sin(pitch))) * (entity.getPersistentData().getDouble("cnt_wave2") + 1);
									yPos = y_power + Math.sin(pitch) * (-1) * (entity.getPersistentData().getDouble("cnt_wave2") + 1);
									zPos = z_power + Math.sin(rad_now) * (Math.cos(pitch) + Math.abs(Math.cos(rad_now) * Math.sin(pitch))) * (entity.getPersistentData().getDouble("cnt_wave2") + 1);
									if (Math.random() < 0.5) {
										if (world instanceof ServerLevel _level)
											_level.sendParticles(ParticleTypes.ENCHANTED_HIT, xPos, yPos, zPos, 1, 0.2, 0.2, 0.2, 0.05);
									} else {
										if (world instanceof ServerLevel _level)
											_level.sendParticles(ParticleTypes.CRIT, xPos, yPos, zPos, 1, 0.2, 0.2, 0.2, 0.05);
									}
									if (world instanceof ServerLevel _level)
										_level.sendParticles(ParticleTypes.FLASH, xPos, yPos, zPos, 1, 0, 0, 0, 0.5);
									if (world instanceof ServerLevel _level)
										_level.sendParticles((SimpleParticleType) (RanahiromodModParticleTypes.LIGHT_SCATTER.get()), xPos, yPos, zPos, 3, 0.1, 0.1, 0.1, 0.1);
									entity.getPersistentData().putDouble("cnt_wave2", (entity.getPersistentData().getDouble("cnt_wave2") + 0.25));
									if (entity.getPersistentData().getDouble("cnt_wave2") % 4 < 2) {
										x_power = x_power + num_x;
										y_power = y_power + num_y;
										z_power = z_power + num_z;
									} else {
										x_power = x_power - num_x;
										y_power = y_power - num_y;
										z_power = z_power - num_z;
									}
								}
							}
							entity.getPersistentData().putDouble("damage", (20 - dis));
							entity.getPersistentData().putDouble("range", (dis_start * (dis / dis_start)));
							entity.getPersistentData().putDouble("knockback", (2.5 - dis * 0.1));
							DodamageProcedure.execute(world, x_c, y_c, z_c, entity);
							if (entityiterator instanceof Mob) {
								entityiterator.setDeltaMovement(new Vec3(0, 0, 0));
							}
						}
					}
				}
			}
			if (entity.getPersistentData().getDouble("cnt_wave") > 20) {
				entity.getPersistentData().putDouble("cnt_wave", 0);
				entity.getPersistentData().putDouble("cnt_wave2", 0);
				entity.getPersistentData().putDouble("cnt_wave_repeat", 0);
				entity.getPersistentData().putBoolean("offset_shockwave", false);
			}
		}
	}
}
