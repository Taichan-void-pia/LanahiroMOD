package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.Component;

import net.mcreator.ranahiromod.init.RanahiromodModMobEffects;

import java.util.List;
import java.util.Comparator;

public class AIBosshiro2Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double rnd = 0;
		double dis = 0;
		String jigenmon_text = "";
		if (entity.isAlive()) {
			ActiveHashiraProcedure.execute(world, x, y, z, entity);
			if (entity.getPersistentData().getDouble("mode") == 1) {
				SkillBosshiro1Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("mode") == 2) {
				SkillBosshiro2Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("mode") == 3) {
				SkillBosshiro3Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("mode") == 4) {
				SkillBosshiro4Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("mode") == 5) {
				SkillBosshiro6Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("mode") == 6) {
				SkillBosshiro7Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("mode") == 7) {
				SkillBosshiro72Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("mode") == 8) {
				SkillBosshiro8Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("mode") == 9) {
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
									if (!(entityiterator instanceof LivingEntity _livEnt36 && _livEnt36.hasEffect(RanahiromodModMobEffects.DISCORD_RANAHIRO.get()))) {
										if (entityiterator instanceof LivingEntity _entity)
											_entity.setHealth(0);
									}
									if (entityiterator instanceof Player _player && !_player.level().isClientSide())
										_player.displayClientMessage(Component.literal(("\uFF0A" + entity.getDisplayName().getString() + "\u306F\u30B8\u30FB\u30A8\u30F3\u30C9\u3092\u5531\u3048\u305F\uFF01")), false);
									if ((entityiterator instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) >= 20
											&& Math.round((entityiterator instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) * 0.25) < (entityiterator instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1)) {
										if (entityiterator instanceof Player _player && !_player.level().isClientSide())
											_player.displayClientMessage(Component.literal(("\uFF0A" + entity.getDisplayName().getString() + "\u306F\u5438\u547D\u3092\u5531\u3048\u305F\uFF01")), false);
										if (entityiterator instanceof LivingEntity _entity)
											_entity.setHealth(Math.round((entityiterator instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) * 0.25));
									}
									if (entityiterator instanceof Player _player && !_player.level().isClientSide())
										_player.displayClientMessage(Component.literal(("\uFF0A" + entity.getDisplayName().getString() + "\u306F\u6B21\u5143\u30CE\u9580\u3092\u5531\u3048\u305F\uFF01")), false);
									if (entityiterator instanceof Player _player && !_player.level().isClientSide())
										_player.displayClientMessage(Component.literal(("\uFF0A" + entity.getDisplayName().getString() + "\u6B21\u5143\u30CE\u9580\u306E\u52B9\u679C\u3092\u767A\u63EE\u3055\u305B\u305F")), false);
									SkillEpicZombieSummonProcedure.execute(world, x, y, z, entity);
									SkillNetherEntitySummonProcedure.execute(world, x, y, z, entity);
									SkillWaterEntitySummonProcedure.execute(world, x, y, z, entity);
									SkillFlyingEntitySummonProcedure.execute(world, x, y, z, entity);
									SkillDragonhiroKnightSummonProcedure.execute(world, x, y, z, entity);
									SkillOnlyPiglinBruteSummonProcedure.execute(world, x, y, z, entity);
									SkillVolthiroSummonProcedure.execute(world, x, y, z, entity);
									SkillWardenSummonProcedure.execute(world, x, y, z, entity);
									SkillTeshitaSummonProcedure.execute(world, x, y, z, entity);
								}
								jigenmon_text = "\u00A75\u00A7k||||||||||||||||\u00A7r\u00A7d\u00A7l==" + "\u6B21\u5143\u30CE\u9580" + "==\u00A7r\u00A75\u00A7k||||||||||||||||\u00A7r";
								if (entityiterator instanceof Player _player && !_player.level().isClientSide())
									_player.displayClientMessage(Component.literal(("\uFF0A" + jigenmon_text + "\u306F\u6028\u970A\u53EC\u559A\u3092\u5531\u3048\u305F\uFF01")), false);
								if (entityiterator instanceof Player _player && !_player.level().isClientSide())
									_player.displayClientMessage(Component.literal(("\uFF0A" + jigenmon_text + "\u306F\u4F7F\u8005\u53EC\u559A\u3092\u5531\u3048\u305F\uFF01")), false);
								if (entityiterator instanceof Player _player && !_player.level().isClientSide())
									_player.displayClientMessage(Component.literal(("\uFF0A" + jigenmon_text + "\u306F\u6C34\u9B54\u53EC\u559A\u3092\u5531\u3048\u305F\uFF01")), false);
								if (entityiterator instanceof Player _player && !_player.level().isClientSide())
									_player.displayClientMessage(Component.literal(("\uFF0A" + jigenmon_text + "\u306F\u81EA\u7531\u7363\u53EC\u559A\u3092\u5531\u3048\u305F\uFF01")), false);
								if (entityiterator instanceof Player _player && !_player.level().isClientSide())
									_player.displayClientMessage(Component.literal(("\uFF0A" + jigenmon_text + "\u306F\u5175\u3092\u6226\u3078...\u3092\u5531\u3048\u305F\uFF01")), false);
								if (entityiterator instanceof Player _player && !_player.level().isClientSide())
									_player.displayClientMessage(Component.literal(("\uFF0A" + jigenmon_text + "\u306F\u5C6F\u7530\u5175\u53EC\u559A\u3092\u5531\u3048\u305F\uFF01")), false);
								if (entityiterator instanceof Player _player && !_player.level().isClientSide())
									_player.displayClientMessage(Component.literal(("\uFF0A" + jigenmon_text + "\u306F\u91D1\u525B\u56E3\u53EC\u559A\u3092\u5531\u3048\u305F\uFF01")), false);
								if (entityiterator instanceof Player _player && !_player.level().isClientSide())
									_player.displayClientMessage(Component.literal(("\uFF0A" + jigenmon_text + "\u306F\u770B\u5B88\u53EC\u559A\u3092\u5531\u3048\u305F\uFF01")), false);
								if (entityiterator instanceof Player _player && !_player.level().isClientSide())
									_player.displayClientMessage(Component.literal(("\uFF0A" + jigenmon_text + "\u306F\u4E0B\u50D5\u53EC\u559A\u3092\u5531\u3048\u305F\uFF01")), false);
							}
						}
						entity.getPersistentData().putDouble("cnt_y", 0);
					}
				}
				if (entity.getPersistentData().getDouble("cnt_x") > 60) {
					entity.getPersistentData().putDouble("cnt_x", 0);
					entity.getPersistentData().putDouble("cnt1", 0);
					entity.getPersistentData().putDouble("cnt2", 0);
					entity.getPersistentData().putDouble("cnt3", 0);
					entity.getPersistentData().putDouble("cnt4", 0);
					entity.getPersistentData().putDouble("cnt5", 0);
					entity.getPersistentData().putDouble("skill2", 1);
					for (int index0 = 0; index0 < 50; index0++) {
						rnd = Math.ceil(Math.random() * 9);
						dis = GetDistanceProcedure.execute(entity);
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
