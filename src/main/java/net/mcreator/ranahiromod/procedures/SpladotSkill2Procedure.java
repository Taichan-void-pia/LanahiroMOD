package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.LargeFireball;
import net.minecraft.world.entity.projectile.AbstractHurtingProjectile;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.ranahiromod.RanahiromodMod;

public class SpladotSkill2Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double zPos = 0;
		double yPos = 0;
		double xPos = 0;
		entity.getPersistentData().putDouble("cnt1", (entity.getPersistentData().getDouble("cnt1") + 1));
		xPos = x + (Math.random() - 0.5) * 40;
		yPos = y + 50;
		zPos = z + (Math.random() - 0.5) * 40;
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.CLOUD, xPos, yPos, zPos, 5, 0.3, 0.3, 0.3, 0.45);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.FLAME, xPos, yPos, zPos, 20, 0.3, 0.3, 0.3, 0.45);
		if (world instanceof ServerLevel projectileLevel) {
			Projectile _entityToSpawn = new Object() {
				public Projectile getFireball(Level level, Entity shooter, double ax, double ay, double az) {
					AbstractHurtingProjectile entityToSpawn = new LargeFireball(EntityType.FIREBALL, level);
					entityToSpawn.setOwner(shooter);
					entityToSpawn.xPower = ax;
					entityToSpawn.yPower = ay;
					entityToSpawn.zPower = az;
					return entityToSpawn;
				}
			}.getFireball(projectileLevel, entity, 0, (-1), 0);
			_entityToSpawn.setPos(xPos, yPos, zPos);
			_entityToSpawn.shoot(0, (-1), 0, (float) 0.3, 0);
			projectileLevel.addFreshEntity(_entityToSpawn);
		}
		entity.getPersistentData().putDouble("x_pos", xPos);
		entity.getPersistentData().putDouble("y_pos", (yPos - 50));
		entity.getPersistentData().putDouble("z_pos", zPos);
		RanahiromodMod.queueServerWork(40, () -> {
			entity.getPersistentData().putDouble("damage", (25 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
			entity.getPersistentData().putDouble("knockback", 0.2);
			entity.getPersistentData().putDouble("range", 7);
			DodamageProcedure.execute(world, entity.getPersistentData().getDouble("x_pos"), entity.getPersistentData().getDouble("y_pos"), entity.getPersistentData().getDouble("z_pos"), entity);
		});
		if (entity.getPersistentData().getDouble("cnt1") > 80) {
			entity.getPersistentData().putDouble("skill2", 0);
		}
	}
}
