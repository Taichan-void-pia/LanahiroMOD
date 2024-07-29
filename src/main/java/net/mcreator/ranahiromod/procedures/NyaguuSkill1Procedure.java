package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

public class NyaguuSkill1Procedure {
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
		if (entity.getPersistentData().getDouble("cnt3") < 12) {
			entity.getPersistentData().putDouble("cnt3", (entity.getPersistentData().getDouble("cnt3") + 1));
			if (entity.getPersistentData().getDouble("cnt3") == 1) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.breath")), SoundSource.NEUTRAL, 1, (float) 0.5);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.breath")), SoundSource.NEUTRAL, 1, (float) 0.5, false);
					}
				}
			}
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.SOUL_FIRE_FLAME, x, y, z, 8, 0, 0, 0, 0.35);
		} else {
			entity.getPersistentData().putDouble("cnt1", (entity.getPersistentData().getDouble("cnt1") + 1));
			x_c = x;
			y_c = y;
			z_c = z;
			if (entity.getPersistentData().getDouble("cnt1") == 3) {
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
			if (entity.getPersistentData().getDouble("cnt1") > 3 && entity.getPersistentData().getDouble("cnt1") <= 6) {
				bachi_sound = (entity.getPersistentData().getDouble("cnt_wave") - 3) * 0.2;
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x_c, y_c, z_c), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ranahiromod:bachi")), SoundSource.NEUTRAL,
								(float) (1 + entity.getPersistentData().getDouble("cnt1") * 0.3), (float) bachi_sound);
					} else {
						_level.playLocalSound(x_c, y_c, z_c, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ranahiromod:bachi")), SoundSource.NEUTRAL, (float) (1 + entity.getPersistentData().getDouble("cnt1") * 0.3), (float) bachi_sound,
								false);
					}
				}
				dis_start = 10;
				dis = dis_start;
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
						_level.sendParticles(ParticleTypes.WITCH, xPos, yPos, zPos, 4, 0, 0, 0, 0.025);
					cnt = cnt + 5;
				}
				entity.getPersistentData().putDouble("damage", (20 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
				entity.getPersistentData().putDouble("range", dis_start);
				entity.getPersistentData().putDouble("knockback", 2);
				DodamageProcedure.execute(world, x_c, y_c, z_c, entity);
			} else if (entity.getPersistentData().getDouble("cnt1") > 10) {
				entity.getPersistentData().putDouble("skill2", 0);
			}
		}
	}
}
