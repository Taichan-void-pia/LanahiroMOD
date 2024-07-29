package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.ranahiromod.init.RanahiromodModParticleTypes;

import java.util.List;
import java.util.Comparator;

public class AIKnightOfLightningProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double rnd = 0;
		double x_knockback = 0;
		double z_knockback = 0;
		double y_knockback = 0;
		double dis = 0;
		if (entity.isAlive()) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (RanahiromodModParticleTypes.LIGHT_SCATTER.get()), x, y, z, 10, 0.3, 1, 0.3, 0.05);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.FLASH, x, y, z, 10, 0.3, 1, 0.3, 0.05);
			ActiveHashiraProcedure.execute(world, x, y, z, entity);
			if (entity.getPersistentData().getDouble("mode") == 1) {
				SkillVolthiro1Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("mode") == 2) {
				SkillVolthiro2Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("mode") == 3) {
				SkillVolthiro5Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("mode") == 4) {
				SkillVolthiro6Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("mode") == 5) {
				SkillLavaBreak2Procedure.execute(world, x, y, z, entity);
			} else if (!((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity)) {
				entity.getPersistentData().putDouble("cnt_target", 0);
				if (entity.getPersistentData().getDouble("cnt_x") > 50) {
					entity.getPersistentData().putDouble("cnt_x", 50);
				}
				entity.getPersistentData().putDouble("cnt_z", 0);
			} else {
				entity.getPersistentData().putDouble("cnt_target", (entity.getPersistentData().getDouble("cnt_target") + 1));
				entity.getPersistentData().putDouble("cnt_x", (entity.getPersistentData().getDouble("cnt_x") + 1));
				entity.getPersistentData().putDouble("cnt_y", (entity.getPersistentData().getDouble("cnt_y") + 1));
				if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof Player) {
					if (entity.getPersistentData().getDouble("cnt_z") == 0) {
						SemiBossTargetPlayBGMProcedure.execute(world, x, y, z, entity);
						entity.getPersistentData().putDouble("cnt_z", 1);
					}
				}
				if (entity.getPersistentData().getDouble("cnt_y") > 150) {
					{
						final Vec3 _center = new Vec3(x, y, z);
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(32 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
						for (Entity entityiterator : _entfound) {
							if (!(entityiterator == entity)) {
								if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == entityiterator) {
									if (entityiterator instanceof Player) {
										SkillVolthiroSummonProcedure.execute(world, x, y, z, entity);
										{
											Entity _ent = entity;
											_ent.teleportTo((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()));
											if (_ent instanceof ServerPlayer _serverPlayer)
												_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), _ent.getYRot(), _ent.getXRot());
										}
										if (entityiterator instanceof Player _player && !_player.level().isClientSide())
											_player.displayClientMessage(Component.literal((("\uFF0A" + entity.getDisplayName().getString()) + "\u306F\u91D1\u525B\u56E3\u53EC\u559A\u3092\u5531\u3048\u305F\uFF01")), false);
										if (entityiterator instanceof Player _player && !_player.level().isClientSide())
											_player.displayClientMessage(Component.literal((("\uFF0A" + entity.getDisplayName().getString()) + "\u306F\u30C6\u30EC\u30DD\u30FC\u30C8\u3092\u5531\u3048\u305F\uFF01")), false);
									}
								}
							}
						}
					}
					entity.getPersistentData().putDouble("cnt_y", 0);
				}
				if (entity.getPersistentData().getDouble("cnt_x") > 70) {
					KillEntityProceProcedure.execute(entity);
					entity.getPersistentData().putDouble("cnt_x", 0);
					entity.getPersistentData().putDouble("cnt1", 0);
					entity.getPersistentData().putDouble("cnt2", 0);
					entity.getPersistentData().putDouble("cnt3", 0);
					entity.getPersistentData().putDouble("cnt4", 0);
					entity.getPersistentData().putDouble("cnt5", 0);
					entity.getPersistentData().putDouble("cnt6", 0);
					entity.getPersistentData().putDouble("dis", 0);
					entity.getPersistentData().putDouble("NameRanged", 0);
					entity.getPersistentData().putDouble("x_pos", 0);
					entity.getPersistentData().putDouble("y_pos", 0);
					entity.getPersistentData().putDouble("z_pos", 0);
					entity.getPersistentData().putDouble("x_pos2", 0);
					entity.getPersistentData().putDouble("y_pos2", 0);
					entity.getPersistentData().putDouble("z_pos2", 0);
					entity.getPersistentData().putDouble("x_pos3", 0);
					entity.getPersistentData().putDouble("y_pos3", 0);
					entity.getPersistentData().putDouble("z_pos3", 0);
					entity.getPersistentData().putBoolean("loop", false);
					entity.getPersistentData().putBoolean("flag_a", false);
					entity.getPersistentData().putBoolean("flag_b", false);
					entity.getPersistentData().putDouble("skill2", 1);
					for (int index0 = 0; index0 < 50; index0++) {
						rnd = Math.ceil(Math.random() * 5);
						break;
					}
					entity.getPersistentData().putDouble("mode", rnd);
					DirectionProcedure.execute(entity);
				}
			}
			if (entity.getPersistentData().getDouble("skill2") == 0) {
				entity.getPersistentData().putDouble("mode", 0);
			}
		}
	}
}
