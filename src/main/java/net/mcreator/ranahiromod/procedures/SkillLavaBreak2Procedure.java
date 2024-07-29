package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.WitherSkull;
import net.minecraft.world.entity.projectile.SmallFireball;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.LargeFireball;
import net.minecraft.world.entity.projectile.DragonFireball;
import net.minecraft.world.entity.projectile.AbstractHurtingProjectile;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

public class SkillLavaBreak2Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean type = false;
		double zPos = 0;
		double yPos = 0;
		double xPos = 0;
		double dis2 = 0;
		double dis = 0;
		double y_power = 0;
		double z_power = 0;
		double rad = 0;
		double rad_now = 0;
		double x_power = 0;
		double num1 = 0;
		double pitch = 0;
		double num3 = 0;
		double num2 = 0;
		double dis_range = 0;
		double rotate = 0;
		entity.getPersistentData().putDouble("cnt1", (entity.getPersistentData().getDouble("cnt1") + 1));
		if (entity.getPersistentData().getDouble("cnt1") > 30) {
			entity.getPersistentData().putDouble("cnt2", (entity.getPersistentData().getDouble("cnt2") + 1));
			if (entity.getPersistentData().getDouble("cnt2") > 10) {
				entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), 0, (entity.getDeltaMovement().z())));
				if (entity.getPersistentData().getDouble("cnt2") % 3 == 1) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.blaze.shoot")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.blaze.shoot")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					num1 = Math.random();
					num2 = 5;
					if (num1 <= 0.25) {
						for (int index0 = 0; index0 < (int) num2; index0++) {
							{
								Entity _shootFrom = entity;
								Level projectileLevel = _shootFrom.level();
								if (!projectileLevel.isClientSide()) {
									Projectile _entityToSpawn = new Object() {
										public Projectile getFireball(Level level, Entity shooter) {
											AbstractHurtingProjectile entityToSpawn = new LargeFireball(EntityType.FIREBALL, level);
											entityToSpawn.setOwner(shooter);
											return entityToSpawn;
										}
									}.getFireball(projectileLevel, entity);
									_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
									_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1, 5);
									projectileLevel.addFreshEntity(_entityToSpawn);
								}
							}
						}
					} else if (num1 <= 0.5) {
						for (int index1 = 0; index1 < (int) num2; index1++) {
							{
								Entity _shootFrom = entity;
								Level projectileLevel = _shootFrom.level();
								if (!projectileLevel.isClientSide()) {
									Projectile _entityToSpawn = new Object() {
										public Projectile getFireball(Level level, Entity shooter) {
											AbstractHurtingProjectile entityToSpawn = new SmallFireball(EntityType.SMALL_FIREBALL, level);
											entityToSpawn.setOwner(shooter);
											return entityToSpawn;
										}
									}.getFireball(projectileLevel, entity);
									_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
									_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1, 5);
									projectileLevel.addFreshEntity(_entityToSpawn);
								}
							}
						}
					} else if (num1 <= 0.75) {
						for (int index2 = 0; index2 < (int) num2; index2++) {
							{
								Entity _shootFrom = entity;
								Level projectileLevel = _shootFrom.level();
								if (!projectileLevel.isClientSide()) {
									Projectile _entityToSpawn = new Object() {
										public Projectile getFireball(Level level, Entity shooter) {
											AbstractHurtingProjectile entityToSpawn = new DragonFireball(EntityType.DRAGON_FIREBALL, level);
											entityToSpawn.setOwner(shooter);
											return entityToSpawn;
										}
									}.getFireball(projectileLevel, entity);
									_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
									_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1, 5);
									projectileLevel.addFreshEntity(_entityToSpawn);
								}
							}
						}
					} else if (num1 <= 1) {
						for (int index3 = 0; index3 < (int) num2; index3++) {
							{
								Entity _shootFrom = entity;
								Level projectileLevel = _shootFrom.level();
								if (!projectileLevel.isClientSide()) {
									Projectile _entityToSpawn = new Object() {
										public Projectile getFireball(Level level, Entity shooter) {
											AbstractHurtingProjectile entityToSpawn = new WitherSkull(EntityType.WITHER_SKULL, level);
											entityToSpawn.setOwner(shooter);
											return entityToSpawn;
										}
									}.getFireball(projectileLevel, entity);
									_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
									_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1, 5);
									projectileLevel.addFreshEntity(_entityToSpawn);
								}
							}
						}
					}
				}
				if (entity.getPersistentData().getDouble("cnt2") > 70) {
					entity.getPersistentData().putDouble("skill2", 0);
				}
			} else {
				if (entity.getPersistentData().getDouble("cnt2") == 1) {
					entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), 0.3, (entity.getDeltaMovement().z())));
				}
			}
		} else {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.LAVA, x, y, z, 15, 0.2, 0.2, 0.2, 1);
		}
	}
}
