package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

public class SkillVolthiro1Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double rad = 0;
		double rad_now = 0;
		double yaw_now = 0;
		double pitch = 0;
		double x_pos = 0;
		double y_pos = 0;
		double z_pos = 0;
		double dis = 0;
		double xPos = 0;
		double yPos = 0;
		double zPos = 0;
		boolean fang_logic = false;
		entity.getPersistentData().putDouble("cnt1", (entity.getPersistentData().getDouble("cnt1") + 1));
		if (entity.getPersistentData().getDouble("cnt3") == 0) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 2, 99, false, false));
			if (entity.getPersistentData().getDouble("cnt1") == 1) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.fire.ambient")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.fire.ambient")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 15, 0, false, false));
			}
			if (entity.getPersistentData().getDouble("cnt1") >= 80) {
				entity.getPersistentData().putDouble("skill2", 0);
			} else if (entity.onGround()) {
				entity.getPersistentData().putDouble("cnt3", 1);
				if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity) {
					GetPowerProcedure.execute(world, x, y, z, entity);
				} else {
					GetPowerFowardProcedure.execute(world, x, y, z, entity);
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.CLOUD, x, y, z, 50, 0.5, 0, 0.5, 0.5);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ranahiromod:sword_sweep")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ranahiromod:sword_sweep")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
		} else {
			entity.getPersistentData().putDouble("cnt2", (entity.getPersistentData().getDouble("cnt2") + 1));
			if (entity.getPersistentData().getDouble("cnt2") < 7) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 2, 2, false, false));
				entity.fallDistance = 0;
				xPos = x - entity.getPersistentData().getDouble("old_x");
				yPos = (y + entity.getBbHeight() / 2) - entity.getPersistentData().getDouble("old_y");
				zPos = z - entity.getPersistentData().getDouble("old_z");
				dis = Math.abs(xPos) + Math.abs(yPos) + Math.abs(zPos);
				entity.getPersistentData().putDouble("x_pos", (xPos / (dis * 5)));
				entity.getPersistentData().putDouble("y_pos", (yPos / (dis * 5)));
				entity.getPersistentData().putDouble("z_pos", (zPos / (dis * 5)));
				xPos = x;
				yPos = y + entity.getBbHeight() / 2;
				zPos = z;
				for (int index0 = 0; index0 < (int) Math.max(Math.round(dis * 5), 1); index0++) {
					entity.getPersistentData().putDouble("damage", (23 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
					entity.getPersistentData().putDouble("range", 3);
					entity.getPersistentData().putBoolean("swing", true);
					DodamageProcedure.execute(world, xPos, yPos, zPos, entity);
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.CRIT, xPos, yPos, zPos, 3, 0.2, 0.2, 0.2, 0);
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.ENCHANTED_HIT, xPos, yPos, zPos, 3, 0.2, 0.2, 0.2, 0);
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.EXPLOSION, xPos, yPos, zPos, 1, 0, 0, 0, 0);
					if (entity.getPersistentData().getDouble("cnt2") == 1) {
						break;
					}
					xPos = xPos + entity.getPersistentData().getDouble("x_pos");
					yPos = yPos + entity.getPersistentData().getDouble("y_pos");
					zPos = zPos + entity.getPersistentData().getDouble("z_pos");
				}
				entity.getPersistentData().putDouble("old_x", x);
				entity.getPersistentData().putDouble("old_y", (y + entity.getBbHeight() / 2));
				entity.getPersistentData().putDouble("old_z", z);
				entity.setDeltaMovement(new Vec3((entity.getPersistentData().getDouble("x_power") * 2), (entity.getPersistentData().getDouble("y_power") * 2), (entity.getPersistentData().getDouble("z_power") * 2)));
			} else {
				entity.setDeltaMovement(new Vec3(0, 0, 0));
				if (entity.getPersistentData().getDouble("cnt2") == 7) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.firework_rocket.blast")), SoundSource.NEUTRAL, 5, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.firework_rocket.blast")), SoundSource.NEUTRAL, 5, 1, false);
						}
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.EXPLOSION_EMITTER, x, y, z, 2, 1, 1, 1, 0);
				}
				if (entity.getPersistentData().getDouble("cnt2") == 13) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.blastfurnace.fire_crackle")), SoundSource.NEUTRAL, 5, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.blastfurnace.fire_crackle")), SoundSource.NEUTRAL, 5, 1, false);
						}
					}
				}
				if (Math.random() < 0.1) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.firework_rocket.blast")), SoundSource.NEUTRAL, 5, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.firework_rocket.blast")), SoundSource.NEUTRAL, 5, 1, false);
						}
					}
				}
				if (entity.getPersistentData().getDouble("cnt2") > 17) {
					entity.getPersistentData().putDouble("skill2", 0);
				}
			}
		}
	}
}
