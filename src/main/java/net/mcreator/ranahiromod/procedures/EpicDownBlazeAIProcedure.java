package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.SmallFireball;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.DragonFireball;
import net.minecraft.world.entity.projectile.AbstractHurtingProjectile;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.ranahiromod.RanahiromodMod;

public class EpicDownBlazeAIProcedure {
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
						_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, (int) Double.POSITIVE_INFINITY, 6, false, false));
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
				xVector = (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX() - entity.getX();
				yVector = (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY() - (entity.getY() + 1);
				zVector = (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ() - entity.getZ();
				dis = Math.sqrt(Math.pow(xVector, 2) + Math.pow(yVector, 2) + Math.pow(zVector, 2));
				if (dis != 0 && Math.abs(entity.getDeltaMovement().x()) + Math.abs(entity.getDeltaMovement().z()) > 0) {
					yVector = yVector / dis;
				} else {
					xVector = entity.getDeltaMovement().x();
					yVector = entity.getDeltaMovement().y();
					zVector = entity.getDeltaMovement().z();
				}
				entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), yVector, (entity.getDeltaMovement().z())));
				if (entity.getPersistentData().getDouble("cnt_x") > 60) {
					if (entity.getPersistentData().getDouble("cnt_x") == 61) {
						if (Math.random() < 0.5) {
							entity.getPersistentData().putBoolean("flag_skills", true);
						}
					}
					if (entity.getPersistentData().getDouble("cnt_x") % 3 == 1) {
						logic_do = entity.getPersistentData().getBoolean("flag_skills");
						if (logic_do) {
							old_x = Math.max(entity.getPersistentData().getDouble("cnt_x") - 60, 1) * 4;
							for (int index0 = 0; index0 < (int) old_x; index0++) {
								{
									Entity _shootFrom = entity;
									Level projectileLevel = _shootFrom.level();
									if (!projectileLevel.isClientSide()) {
										Projectile _entityToSpawn = new Object() {
											public Projectile getFireball(Level level, Entity shooter, double ax, double ay, double az) {
												AbstractHurtingProjectile entityToSpawn = new SmallFireball(EntityType.SMALL_FIREBALL, level);
												entityToSpawn.setOwner(shooter);
												entityToSpawn.xPower = ax;
												entityToSpawn.yPower = ay;
												entityToSpawn.zPower = az;
												return entityToSpawn;
											}
										}.getFireball(projectileLevel, entity, (entity.getLookAngle().x), (entity.getLookAngle().y), (entity.getLookAngle().z));
										_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
										_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1, (float) (old_x / 2));
										projectileLevel.addFreshEntity(_entityToSpawn);
									}
								}
							}
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.blaze.shoot")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.blaze.shoot")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
						} else {
							{
								Entity _shootFrom = entity;
								Level projectileLevel = _shootFrom.level();
								if (!projectileLevel.isClientSide()) {
									Projectile _entityToSpawn = new Object() {
										public Projectile getFireball(Level level, Entity shooter, double ax, double ay, double az) {
											AbstractHurtingProjectile entityToSpawn = new DragonFireball(EntityType.DRAGON_FIREBALL, level);
											entityToSpawn.setOwner(shooter);
											entityToSpawn.xPower = ax;
											entityToSpawn.yPower = ay;
											entityToSpawn.zPower = az;
											return entityToSpawn;
										}
									}.getFireball(projectileLevel, entity, (entity.getLookAngle().x), (entity.getLookAngle().y), (entity.getLookAngle().z));
									_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
									_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1, 5);
									projectileLevel.addFreshEntity(_entityToSpawn);
								}
							}
						}
					}
					if (entity.getPersistentData().getDouble("cnt_x") > 71) {
						RanahiromodMod.queueServerWork(40, () -> {
							KillEntityProceProcedure.execute(entity);
						});
						entity.getPersistentData().putBoolean("flag_skills", false);
						entity.getPersistentData().putDouble("cnt_x", 0);
					}
				}
				DirectionProcedure.execute(entity);
			}
		}
	}
}
