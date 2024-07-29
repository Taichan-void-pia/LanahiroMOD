package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

public class EpicDownEndermanAIProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean logic_do = false;
		double rnd = 0;
		double dis = 0;
		double xPos = 0;
		double yPos = 0;
		double zPos = 0;
		double xVector = 0;
		double yVector = 0;
		double zVector = 0;
		double old_x = 0;
		double old_y = 0;
		double old_z = 0;
		if (entity.isAlive()) {
			if (entity.getPersistentData().getDouble("cnt_y") == 0) {
				if (!((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) >= 0)
						|| (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) < 2) {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, (int) Double.POSITIVE_INFINITY, 7, false, false));
				}
				if (!((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_RESISTANCE) ? _livEnt.getEffect(MobEffects.DAMAGE_RESISTANCE).getAmplifier() : 0) >= 0)
						|| (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_RESISTANCE) ? _livEnt.getEffect(MobEffects.DAMAGE_RESISTANCE).getAmplifier() : 0) < 1) {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, (int) Double.POSITIVE_INFINITY, 3, false, false));
				}
				entity.getPersistentData().putDouble("cnt_y", 1);
			}
			if (!((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity)) {
				entity.getPersistentData().putDouble("cnt_target", 0);
			} else if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity) {
				entity.getPersistentData().putDouble("cnt_x", (entity.getPersistentData().getDouble("cnt_x") + 1));
				entity.getPersistentData().putDouble("cnt_target", (entity.getPersistentData().getDouble("cnt_target") + 1));
				if (entity.getPersistentData().getDouble("cnt_x") > 60) {
					if (entity.getPersistentData().getDouble("cnt_x") == 61) {
						entity.getPersistentData().putDouble("x_data", x);
						entity.getPersistentData().putDouble("y_data", y);
						entity.getPersistentData().putDouble("z_data", z);
					}
					xPos = entity.getPersistentData().getDouble("x_data") + (Math.random() - 0.5) * 18;
					zPos = entity.getPersistentData().getDouble("z_data") + (Math.random() - 0.5) * 18;
					yPos = entity.getPersistentData().getDouble("y_data");
					for (int index0 = 0; index0 < 320; index0++) {
						if (world.getBlockState(BlockPos.containing(xPos, yPos, zPos)).canOcclude()) {
							yPos = yPos + 1;
							if (!world.getBlockState(BlockPos.containing(xPos, yPos, zPos)).canOcclude()) {
								logic_do = true;
								break;
							}
						} else if (!world.getBlockState(BlockPos.containing(xPos, yPos - 0.3, zPos)).canOcclude()) {
							yPos = yPos - 1;
							if (world.getBlockState(BlockPos.containing(xPos, yPos - 0.3, zPos)).canOcclude()) {
								logic_do = true;
								break;
							}
						}
					}
					if (logic_do) {
						old_x = x;
						old_y = y;
						old_z = z;
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.REVERSE_PORTAL, x, (y + entity.getBbHeight() / 2), z, 30, (entity.getBbWidth() / 2), (entity.getBbHeight() / 2), (entity.getBbWidth() / 2), 1);
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
						{
							Entity _ent = entity;
							_ent.teleportTo(xPos, yPos, zPos);
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport(xPos, yPos, zPos, _ent.getYRot(), _ent.getXRot());
						}
						xVector = xPos - old_x;
						yVector = yPos - old_y;
						zVector = zPos - old_z;
						dis = Math.sqrt(Math.pow(xVector, 2) + Math.pow(yVector, 2) + Math.pow(zVector, 2));
						entity.getPersistentData().putDouble("damage", (15 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
						entity.getPersistentData().putDouble("knockback", 0.2);
						entity.getPersistentData().putDouble("range", dis);
						DodamageProcedure.execute(world, xPos, yPos, zPos, entity);
					}
					if (entity.getPersistentData().getDouble("cnt_x") > 75) {
						entity.getPersistentData().putDouble("cnt_x", 0);
					}
				}
				DirectionProcedure.execute(entity);
			}
		}
	}
}
