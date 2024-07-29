package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

public class MochiExplodeBulletProjectileHitsLivingEntityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double zPos = 0;
		double yPos = 0;
		double xPos = 0;
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, x, y, z, 0, Level.ExplosionInteraction.NONE);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.EXPLOSION_EMITTER, x, y, z, 5, 1, 1, 1, 0.5);
		entity.getPersistentData().putDouble("damage", (5 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
		entity.getPersistentData().putDouble("knockback", 0.3);
		entity.getPersistentData().putDouble("range", 3);
		DodamageProcedure.execute(world, x, y, z, entity);
	}
}
