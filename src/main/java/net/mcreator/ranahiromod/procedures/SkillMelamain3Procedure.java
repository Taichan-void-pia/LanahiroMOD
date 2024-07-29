package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.ranahiromod.init.RanahiromodModEntities;
import net.mcreator.ranahiromod.entity.Melamain3rdAmmoProjectileEntity;

public class SkillMelamain3Procedure {
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
		double pitch_now = 0;
		double loop = 0;
		double pitch = 0;
		double yaw = 0;
		entity.getPersistentData().putDouble("cnt3", (entity.getPersistentData().getDouble("cnt3") + 1));
		entity.fallDistance = 0;
		if (entity.getPersistentData().getDouble("cnt3") < 10) {
			entity.setDeltaMovement(new Vec3(0, 1, 0));
		} else {
			entity.getPersistentData().putDouble("cnt1", (entity.getPersistentData().getDouble("cnt1") + 1));
			if (entity.getPersistentData().getDouble("cnt2") < 5) {
				entity.setDeltaMovement(new Vec3(0, 0, 0));
				if (entity.getPersistentData().getDouble("cnt1") > 0) {
					if (entity.getPersistentData().getDouble("cnt2") < 3) {
						entity.getPersistentData().putDouble("cnt1", (-12));
						loop = 1;
					} else if (entity.getPersistentData().getDouble("cnt2") == 3) {
						loop = 1;
						entity.getPersistentData().putDouble("cnt1", (-24));
					} else {
						loop = 2;
					}
					for (int index0 = 0; index0 < (int) loop; index0++) {
						entity.getPersistentData().putDouble("cnt2", (entity.getPersistentData().getDouble("cnt2") + 1));
						yaw_now = entity.getYRot();
						pitch_now = entity.getXRot();
						if (entity.getPersistentData().getDouble("cnt2") % 2 == 1) {
							yaw = entity.getYRot() + 75;
						} else {
							yaw = entity.getYRot() - 75;
						}
						pitch = pitch_now - 15;
						for (int index1 = 0; index1 < 7; index1++) {
							{
								Entity _ent = entity;
								_ent.setYRot((float) (yaw + Math.random() * 20 - 10));
								_ent.setXRot((float) (pitch + Math.random() * 20 - 10));
								_ent.setYBodyRot(_ent.getYRot());
								_ent.setYHeadRot(_ent.getYRot());
								_ent.yRotO = _ent.getYRot();
								_ent.xRotO = _ent.getXRot();
								if (_ent instanceof LivingEntity _entity) {
									_entity.yBodyRotO = _entity.getYRot();
									_entity.yHeadRotO = _entity.getYRot();
								}
							}
							{
								Entity _shootFrom = entity;
								Level projectileLevel = _shootFrom.level();
								if (!projectileLevel.isClientSide()) {
									Projectile _entityToSpawn = new Object() {
										public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
											AbstractArrow entityToSpawn = new Melamain3rdAmmoProjectileEntity(RanahiromodModEntities.MELAMAIN_3RD_AMMO_PROJECTILE.get(), level);
											entityToSpawn.setOwner(shooter);
											entityToSpawn.setBaseDamage(damage);
											entityToSpawn.setKnockback(knockback);
											entityToSpawn.setSilent(true);
											return entityToSpawn;
										}
									}.getArrow(projectileLevel, entity, (float) (4 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)),
											0);
									_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
									_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, (float) (0.9 + Math.random() / 5), 0);
									projectileLevel.addFreshEntity(_entityToSpawn);
								}
							}
						}
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.CLOUD,
									(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(4)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()),
									(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(4)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY()),
									(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(4)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()),
									10, 0, 0, 0, 1);
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.blaze.shoot")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.blaze.shoot")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
						{
							Entity _ent = entity;
							_ent.setYRot((float) yaw_now);
							_ent.setXRot((float) pitch_now);
							_ent.setYBodyRot(_ent.getYRot());
							_ent.setYHeadRot(_ent.getYRot());
							_ent.yRotO = _ent.getYRot();
							_ent.xRotO = _ent.getXRot();
							if (_ent instanceof LivingEntity _entity) {
								_entity.yBodyRotO = _entity.getYRot();
								_entity.yHeadRotO = _entity.getYRot();
							}
						}
					}
				}
			} else if (entity.getPersistentData().getDouble("cnt1") > 40) {
				entity.getPersistentData().putDouble("skill2", 0);
			}
		}
	}
}
