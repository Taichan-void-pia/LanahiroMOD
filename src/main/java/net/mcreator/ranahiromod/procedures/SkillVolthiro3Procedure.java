package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

public class SkillVolthiro3Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean fang_logic = false;
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
		double dis_set = 0;
		double num_x = 0;
		double num_y = 0;
		double num_z = 0;
		double x_power = 0;
		double y_power = 0;
		double z_power = 0;
		entity.getPersistentData().putDouble("cnt1", (entity.getPersistentData().getDouble("cnt1") + 1));
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 10, 99, false, false));
		if (entity.getPersistentData().getDouble("cnt1") < 15) {
			if (entity.getPersistentData().getDouble("cnt1") == 1) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.lightning_bolt.impact")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.lightning_bolt.impact")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.lightning_bolt.thunder")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.lightning_bolt.thunder")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ranahiromod:bachi")), SoundSource.NEUTRAL, 1, (float) 0.75);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ranahiromod:bachi")), SoundSource.NEUTRAL, 1, (float) 0.75, false);
				}
			}
			rad_now = Math.toRadians(Math.random() * 360);
			pitch = Math.toRadians(0);
			num_x = (Math.random() - 0.5) * 1.2;
			num_y = (Math.random() - 0.5) * 1.2;
			num_z = (Math.random() - 0.5) * 1.2;
			entity.getPersistentData().putDouble("cnt2", 0);
			x_power = x;
			y_power = y;
			z_power = z;
			for (int index0 = 0; index0 < (int) (36 + entity.getPersistentData().getDouble("cnt1") * 3); index0++) {
				xPos = x_power + Math.cos(rad_now) * (Math.cos(pitch) + Math.abs(Math.sin(rad_now) * Math.sin(pitch))) * (entity.getPersistentData().getDouble("cnt2") + 1);
				yPos = y_power + Math.sin(pitch) * (-1) * (entity.getPersistentData().getDouble("cnt2") + 1);
				zPos = z_power + Math.sin(rad_now) * (Math.cos(pitch) + Math.abs(Math.cos(rad_now) * Math.sin(pitch))) * (entity.getPersistentData().getDouble("cnt2") + 1);
				if (Math.random() < 0.5) {
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.ENCHANTED_HIT, xPos, yPos, zPos, 1, 0, 0, 0, 0.05);
				} else {
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.CRIT, xPos, yPos, zPos, 1, 0, 0, 0, 0.05);
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.EXPLOSION, xPos, yPos, zPos, 1, 0, 0, 0, 1);
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.FLASH, xPos, yPos, zPos, 1, 0, 0, 0, 0.5);
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.FIREWORK, xPos, yPos, zPos, 1, 0, 0, 0, 0);
				if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.FLAME, xPos, yPos, zPos, 1, 0, 0, 0, 0);
				}
				entity.getPersistentData().putDouble("cnt2", (entity.getPersistentData().getDouble("cnt2") + 0.25));
				if (entity.getPersistentData().getDouble("cnt2") % 4 < 2) {
					x_power = x_power + num_x;
					y_power = y_power + num_y;
					z_power = z_power + num_z;
				} else {
					x_power = x_power - num_x;
					y_power = y_power - num_y;
					z_power = z_power - num_z;
				}
				entity.getPersistentData().putDouble("damage", (20 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
				entity.getPersistentData().putDouble("range", 3);
				entity.getPersistentData().putDouble("knockback", 0.5);
				DodamageProcedure.execute(world, xPos, yPos, zPos, entity);
			}
		}
		if (entity.getPersistentData().getDouble("cnt1") > 25) {
			entity.getPersistentData().putDouble("skill2", 0);
		}
	}
}
