package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

public class ThiefSkill3Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double rad = 0;
		double rad_now = 0;
		double yaw_now = 0;
		double x_pos = 0;
		double y_pos = 0;
		double z_pos = 0;
		double dis = 0;
		double zPos = 0;
		double yPos = 0;
		double xPos = 0;
		double count = 0;
		double cnt = 0;
		double speed = 0;
		Entity range_entity = null;
		boolean muki = false;
		boolean logic_a = false;
		entity.getPersistentData().putDouble("cnt1", (entity.getPersistentData().getDouble("cnt1") + 1));
		if (entity.getPersistentData().getDouble("cnt1") < 6) {
			entity.fallDistance = 0;
			if (entity.getPersistentData().getDouble("cnt1") == 1) {
				dis = 1;
				for (int index0 = 0; index0 < 10; index0++) {
					xPos = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(dis)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getX();
					yPos = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(dis)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getY();
					zPos = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(dis)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ();
					if (dis == 1) {
						if (world instanceof Level _level && !_level.isClientSide())
							_level.explode(null, x, y, z, 0, Level.ExplosionInteraction.NONE);
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.WITCH, xPos, yPos, zPos, 5, 0.25, 0.25, 0.25, 0.2);
					entity.getPersistentData().putDouble("damage", (20 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
					entity.getPersistentData().putDouble("range", 5);
					entity.getPersistentData().putDouble("knockback", 1.25);
					entity.getPersistentData().putDouble("projectile_type", 2);
					DodamageProcedure.execute(world, xPos, yPos, zPos, entity);
					dis = dis + 0.5;
				}
				{
					Entity _ent = entity;
					_ent.teleportTo(xPos, yPos, zPos);
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport(xPos, yPos, zPos, _ent.getYRot(), _ent.getXRot());
				}
			}
		} else {
			entity.getPersistentData().putDouble("skill2", 0);
		}
	}
}
