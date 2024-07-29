package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

public class SkillVolthiro2Procedure {
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
		entity.getPersistentData().putDouble("cnt1", (entity.getPersistentData().getDouble("cnt1") + 1));
		entity.setDeltaMovement(new Vec3(0, Math.min(entity.getDeltaMovement().y(), 0), 0));
		if (entity instanceof LivingEntity _entity)
			_entity.swing(InteractionHand.MAIN_HAND, true);
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, (float) 0.5, (float) 1.5);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, (float) 0.5, (float) 1.5, false);
			}
		}
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ranahiromod:bachi")), SoundSource.NEUTRAL, (float) 0.5, (float) 0.75);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ranahiromod:bachi")), SoundSource.NEUTRAL, (float) 0.5, (float) 0.75, false);
			}
		}
		entity.getPersistentData().putDouble("start_r", (Math.random() * 360));
		rad_now = Math.toRadians((Math.random() - 0.5) * 180);
		yaw_now = Math.toRadians(Math.random() * 360);
		x_pos = x;
		y_pos = y + 2;
		z_pos = z;
		dis_set = 1.5 + entity.getPersistentData().getDouble("cnt1") / 5;
		for (int index0 = 0; index0 < 18; index0++) {
			rad = Math.toRadians(entity.getPersistentData().getDouble("start_r") + entity.getPersistentData().getDouble("cnt3"));
			dis = dis_set;
			for (int index1 = 0; index1 < 6; index1++) {
				xPos = x_pos + Math.cos(rad) * (Math.cos(rad_now) + Math.abs(Math.sin(yaw_now) * Math.sin(rad_now))) * dis;
				yPos = y_pos + Math.sin(Math.toRadians(entity.getPersistentData().getDouble("cnt3"))) * Math.sin(rad_now) * (-1) * dis;
				zPos = z_pos + Math.sin(rad) * (Math.cos(rad_now) + Math.abs(Math.cos(yaw_now) * Math.sin(rad_now))) * dis;
				if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.SWEEP_ATTACK, xPos, yPos, zPos, 1, 0.1, 0.1, 0.1, 1);
				}
				if (Math.random() < 0.5) {
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.ENCHANTED_HIT, xPos, yPos, zPos, 1, 0.1, 0.1, 0.1, 0.1);
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.CRIT, xPos, yPos, zPos, 2, 0.1, 0.1, 0.1, 0.1);
				if (entity.getPersistentData().getDouble("cnt1") % 3 == 0 && Math.random() < 0.01) {
					x_pos = x + (Math.random() - 0.5) * 8;
					y_pos = y;
					z_pos = z + (Math.random() - 0.5) * 8;
					if (world instanceof ServerLevel _level) {
						LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
						entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(x_pos, y_pos, z_pos)));
						entityToSpawn.setVisualOnly(true);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.EXPLOSION, x_pos, y_pos, z_pos, 1, 0, 0, 0, 0.1);
				}
				entity.getPersistentData().putDouble("damage", (18 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
				entity.getPersistentData().putDouble("range", 3);
				entity.getPersistentData().putDouble("knockback", 1);
				DodamageProcedure.execute(world, xPos, yPos, zPos, entity);
				dis = dis + 0.25;
			}
			entity.getPersistentData().putDouble("cnt3", (entity.getPersistentData().getDouble("cnt3") + 10));
		}
		if (entity.getPersistentData().getDouble("cnt1") > 15) {
			entity.getPersistentData().putDouble("skill2", 0);
		}
	}
}
