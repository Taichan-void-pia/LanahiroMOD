package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.Component;

import java.util.List;
import java.util.Comparator;

public class AIDragonhiroProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double rnd = 0;
		double dis = 0;
		if (entity.isAlive()) {
			ActiveHashiraProcedure.execute(world, x, y, z, entity);
			if (entity.getPersistentData().getDouble("mode") == 1) {
				SkillDragonhiro1Procedure.execute(world, entity);
			} else if (entity.getPersistentData().getDouble("mode") == 2) {
				SkillDragonhiro2Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("mode") == 3) {
				SkillDragonhiro3Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("mode") == 4) {
				SkillDragonhiro4Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("mode") == 5) {
				entity.getPersistentData().putDouble("skill2", 0);
			} else if (entity.getPersistentData().getDouble("mode") == 6) {
				if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity) {
					{
						Entity _ent = entity;
						_ent.teleportTo(((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX()), ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY()),
								((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ()));
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport(((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX()), ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY()),
									((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ()), _ent.getYRot(), _ent.getXRot());
					}
					entity.getPersistentData().putDouble("skill2", 0);
					if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal((("\uFF0A" + entity.getDisplayName().getString()) + "\u306F\u30C6\u30EC\u30DD\u30FC\u30C8\u3092\u5531\u3048\u305F\uFF01")), false);
				}
			} else if (!((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity)) {
				entity.getPersistentData().putDouble("cnt_target", 0);
				if (entity.getPersistentData().getDouble("cnt_x") > 50) {
					entity.getPersistentData().putDouble("cnt_x", 50);
				}
			} else {
				entity.getPersistentData().putDouble("cnt_target", (entity.getPersistentData().getDouble("cnt_target") + 1));
				entity.getPersistentData().putDouble("cnt_x", (entity.getPersistentData().getDouble("cnt_x") + 1));
				if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof Player) {
					entity.getPersistentData().putDouble("cnt_y", (entity.getPersistentData().getDouble("cnt_y") + 1));
					if (entity.getPersistentData().getDouble("cnt_y") > 300) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(32 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
							for (Entity entityiterator : _entfound) {
								if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == entityiterator) {
									if (entityiterator instanceof Player) {
										if (entityiterator.getRemainingFireTicks() != 0 && !(entityiterator instanceof LivingEntity _livEnt39 && _livEnt39.hasEffect(MobEffects.FIRE_RESISTANCE))) {
											if (entityiterator instanceof LivingEntity _entity)
												_entity.setHealth(0);
										}
										if (entityiterator instanceof Player _player && !_player.level().isClientSide())
											_player.displayClientMessage(Component.literal((("\uFF0A" + entity.getDisplayName().getString()) + "\u306F\u30B5\u30F3\u30D5\u30EC\u30A2\u3092\u5531\u3048\u305F\uFF01")), false);
										if ((entityiterator instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) >= 20
												&& Math.round((entityiterator instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) * 0.25) < (entityiterator instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1)) {
											if (entityiterator instanceof Player _player && !_player.level().isClientSide())
												_player.displayClientMessage(Component.literal((("\uFF0A" + entity.getDisplayName().getString()) + "\u306F\u5438\u547D\u3092\u5531\u3048\u305F\uFF01")), false);
											if (entityiterator instanceof LivingEntity _entity)
												_entity.setHealth(Math.round((entityiterator instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) * 0.25));
										}
									}
									entityiterator.setSecondsOnFire(24);
									SkillEpicZombieSummonProcedure.execute(world, x, y, z, entity);
									SkillNetherEntitySummonProcedure.execute(world, x, y, z, entity);
									SkillDragonhiroKnightSummonProcedure.execute(world, x, y, z, entity);
								}
								if (entityiterator instanceof Player _player && !_player.level().isClientSide())
									_player.displayClientMessage(Component.literal((("\uFF0A" + entity.getDisplayName().getString()) + "\u306F\u30D0\u30FC\u30CB\u30F3\u30B0\u3092\u5531\u3048\u305F\uFF01")), false);
								if (entityiterator instanceof Player _player && !_player.level().isClientSide())
									_player.displayClientMessage(Component.literal((("\uFF0A" + entity.getDisplayName().getString()) + "\u306F\u6028\u970A\u53EC\u559A\u3092\u5531\u3048\u305F\uFF01")), false);
								if (entityiterator instanceof Player _player && !_player.level().isClientSide())
									_player.displayClientMessage(Component.literal((("\uFF0A" + entity.getDisplayName().getString()) + "\u306F\u5175\u3092\u6226\u3078...\u3092\u5531\u3048\u305F\uFF01")), false);
							}
						}
						entity.getPersistentData().putDouble("cnt_y", 0);
					}
				}
				if (entity.getPersistentData().getDouble("cnt_x") > 60) {
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
						rnd = Math.ceil(Math.random() * 4);
						if (rnd != 5) {
							break;
						}
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
