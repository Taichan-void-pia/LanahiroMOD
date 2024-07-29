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

public class KnightNewSkill3Procedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		boolean general_logic = false;
		double zPos = 0;
		double yPos = 0;
		double rad = 0;
		double rad_now = 0;
		double yaw_now = 0;
		double xPos = 0;
		double dis = 0;
		double level = 0;
		double pitch = 0;
		double yaw = 0;
		entity.getPersistentData().putDouble("cnt1", (entity.getPersistentData().getDouble("cnt1") + 1));
		dis = entity.getPersistentData().getDouble("cnt1");
		if (entity.getPersistentData().getDouble("cnt1") == 1) {
			entity.getPersistentData().putDouble("yaw", (entity.getYRot() + 90));
			entity.getPersistentData().putDouble("pitch", (entity.getXRot()));
		}
		yaw = Math.toRadians(entity.getPersistentData().getDouble("yaw"));
		pitch = Math.toRadians(entity.getPersistentData().getDouble("pitch"));
		xPos = entity.getX() + Math.cos(yaw) * Math.cos(pitch) * (dis + entity.getBbWidth());
		yPos = entity.getY() + entity.getBbHeight() * 0.75 + Math.sin(pitch) * (-1) * (dis + entity.getBbWidth());
		zPos = entity.getZ() + Math.sin(yaw) * Math.cos(pitch) * (dis + entity.getBbWidth());
		if (entity.getPersistentData().getDouble("cnt1") % 3 == 0) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(xPos, yPos, zPos), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.fire.extinguish")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(xPos, yPos, zPos, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.fire.extinguish")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		}
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.SWEEP_ATTACK, xPos, yPos, zPos, 5, 0.5, 0.1, 0.5, 0);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.SNEEZE, xPos, yPos, zPos, 3, 0.5, 0.1, 0.5, 0);
		entity.getPersistentData().putDouble("damage", (13 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
		entity.getPersistentData().putDouble("range", 3);
		entity.getPersistentData().putDouble("knockback", 1);
		DodamageProcedure.execute(world, xPos, yPos, zPos, entity);
		if (entity.getPersistentData().getDouble("cnt1") > 30) {
			entity.getPersistentData().putDouble("skill2", 0);
		}
	}
}
