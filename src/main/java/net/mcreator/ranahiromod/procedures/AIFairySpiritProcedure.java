package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.ranahiromod.entity.FairySpiritEntity;

import java.util.List;
import java.util.Comparator;

public class AIFairySpiritProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		String owner = "";
		Entity near_player = null;
		double rnd = 0;
		double dis = 0;
		double follow_num = 0;
		double x_pos = 0;
		double pitch = 0;
		double yaw = 0;
		double y_pos = 0;
		double z_pos = 0;
		if (entity.isAlive()) {
			follow_num = entity.getPersistentData().getDouble("follow_num");
			owner = entity.getPersistentData().getString("owner");
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (!(entityiterator == entity) && (entityiterator.getStringUUID()).equals(owner)) {
						if (!(entityiterator instanceof FairySpiritEntity)) {
							if (entityiterator.getPersistentData().getBoolean("fairy_spirit_spawn")) {
								near_player = entityiterator;
								if (!entity.getPersistentData().getBoolean("RandomLocation")) {
									entity.getPersistentData().putDouble("x_pos", ((Math.random() - 0.5) * 2));
									entity.getPersistentData().putDouble("y_pos", ((Math.random() - 0.5) * 1.5));
									entity.getPersistentData().putDouble("z_pos", ((Math.random() - 0.5) * 2));
									entity.getPersistentData().putBoolean("RandomLocation", true);
								}
								yaw = Math.toRadians(near_player.getYRot() - 90);
								pitch = Math.toRadians(near_player.getXRot());
								x_pos = near_player.getX() + Math.cos(yaw) * Math.cos(pitch) * (1 + near_player.getBbWidth());
								y_pos = near_player.getY() + near_player.getBbHeight() * 0.75 + Math.sin(pitch) * (-1) * (1 + near_player.getBbWidth());
								z_pos = near_player.getZ() + Math.sin(yaw) * Math.cos(pitch) * (1 + near_player.getBbWidth());
								{
									Entity _ent = entity;
									_ent.teleportTo((x_pos + entity.getPersistentData().getDouble("x_pos")), (y_pos + entity.getPersistentData().getDouble("y_pos")), (z_pos + entity.getPersistentData().getDouble("z_pos")));
									if (_ent instanceof ServerPlayer _serverPlayer)
										_serverPlayer.connection.teleport((x_pos + entity.getPersistentData().getDouble("x_pos")), (y_pos + entity.getPersistentData().getDouble("y_pos")), (z_pos + entity.getPersistentData().getDouble("z_pos")),
												_ent.getYRot(), _ent.getXRot());
								}
								{
									Entity _ent = entity;
									_ent.setYRot((float) (Math.toDegrees(yaw) + 90));
									_ent.setXRot((float) Math.toDegrees(pitch));
									_ent.setYBodyRot(_ent.getYRot());
									_ent.setYHeadRot(_ent.getYRot());
									_ent.yRotO = _ent.getYRot();
									_ent.xRotO = _ent.getXRot();
									if (_ent instanceof LivingEntity _entity) {
										_entity.yBodyRotO = _entity.getYRot();
										_entity.yHeadRotO = _entity.getYRot();
									}
								}
							} else {
								if (world instanceof ServerLevel _level)
									_level.sendParticles(ParticleTypes.GLOW_SQUID_INK, x, y, z, 5, 0, 0, 0, 0.3);
								if (!entity.level().isClientSide())
									entity.discard();
							}
						}
					}
				}
			}
		}
	}
}
