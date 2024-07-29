package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import java.util.List;
import java.util.Comparator;

public class AILavahiroProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double rnd = 0;
		if (entity.isAlive()) {
			ActiveHashiraProcedure.execute(world, x, y, z, entity);
			if (entity.getPersistentData().getDouble("mode") == 1) {
				SkillBosshiro5Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("mode") == 2) {
				SkillLavahiro2Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("mode") == 3) {
				SkillLavahiro3Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("mode") == 4) {
				SkillLavahiro4Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("mode") == 5) {
				SkillLavahiro5Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("mode") == 6) {
				SkillLavahiro6Procedure.execute(world, entity);
			} else if (entity.getPersistentData().getDouble("mode") == 7) {
				SkillLavahiro7Procedure.execute(entity);
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
									if (entityiterator.getRemainingFireTicks() != 0) {
										if (!(entityiterator instanceof LivingEntity _livEnt25 && _livEnt25.hasEffect(MobEffects.FIRE_RESISTANCE))) {
											if (entityiterator instanceof LivingEntity _entity)
												_entity.setHealth(0);
										}
									}
									if (entityiterator instanceof Player _player && !_player.level().isClientSide())
										_player.displayClientMessage(Component.literal((("\uFF0A" + entity.getDisplayName().getString()) + "\u306F\u30DC\u30EB\u30B1\u30FC\u30CE\u3092\u5531\u3048\u305F\uFF01")), false);
									if ((entityiterator instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) >= 20
											&& Math.round((entityiterator instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) * 0.25) < (entityiterator instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1)) {
										if (entityiterator instanceof Player _player && !_player.level().isClientSide())
											_player.displayClientMessage(Component.literal((("\uFF0A" + entity.getDisplayName().getString()) + "\u306F\u5438\u547D\u3092\u5531\u3048\u305F\uFF01")), false);
										if (entityiterator instanceof LivingEntity _entity)
											_entity.setHealth(Math.round((entityiterator instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) * 0.25));
									}
									entityiterator.setSecondsOnFire(24);
									SkillEpicZombieSummonProcedure.execute(world, x, y, z, entity);
									SkillNetherEntitySummonProcedure.execute(world, x, y, z, entity);
								}
								if (entityiterator instanceof Player _player && !_player.level().isClientSide())
									_player.displayClientMessage(Component.literal((("\uFF0A" + entity.getDisplayName().getString()) + "\u306F\u30D0\u30FC\u30CB\u30F3\u30B0\u3092\u5531\u3048\u305F\uFF01")), false);
								if (entityiterator instanceof Player _player && !_player.level().isClientSide())
									_player.displayClientMessage(Component.literal((("\uFF0A" + entity.getDisplayName().getString()) + "\u306F\u6028\u970A\u53EC\u559A\u3092\u5531\u3048\u305F\uFF01")), false);
								if (entityiterator instanceof Player _player && !_player.level().isClientSide())
									_player.displayClientMessage(Component.literal((("\uFF0A" + entity.getDisplayName().getString()) + "\u306F\u4F7F\u8005\u53EC\u559A\u3092\u5531\u3048\u305F\uFF01")), false);
							}
						}
						for (int index0 = 0; index0 < 5; index0++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = EntityType.BLAZE.spawn(_level, BlockPos.containing(x + (Math.random() - 0.5) * 10, y, z + (Math.random() - 0.5) * 10), MobSpawnType.MOB_SUMMONED);
								if (entityToSpawn != null) {
									entityToSpawn.setYRot(entity.getYRot());
									entityToSpawn.setYBodyRot(entity.getYRot());
									entityToSpawn.setYHeadRot(entity.getYRot());
									entityToSpawn.setXRot(entity.getXRot());
									entityToSpawn.setDeltaMovement(0, 1, 0);
								}
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
					for (int index1 = 0; index1 < 50; index1++) {
						rnd = Math.ceil(Math.random() * 7);
						if (GetDistanceProcedure.execute(entity) > 6) {
							if (rnd == 1 || rnd == 7) {
								break;
							}
						} else {
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
