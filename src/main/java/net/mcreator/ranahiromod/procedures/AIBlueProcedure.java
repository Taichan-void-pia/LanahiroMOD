package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import java.util.List;
import java.util.Comparator;

public class AIBlueProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean logic_a = false;
		double x_pos = 0;
		double y_pos = 0;
		double z_pos = 0;
		double cnt = 0;
		double x_power = 0;
		double y_power = 0;
		double z_power = 0;
		double dis = 0;
		double yaw = 0;
		double rad_now = 0;
		double rad = 0;
		if (entity.getPersistentData().getDouble("NameRanged_ranged") != 0) {
			if (!entity.getPersistentData().getBoolean("flag_start")) {
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(128 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if (!(entityiterator == entity) && entity.getPersistentData().getDouble("NameRanged_ranged") == entityiterator.getPersistentData().getDouble("NameRanged")) {
							if (entityiterator.getPersistentData().getDouble("cnt1") > 5) {
								entity.getPersistentData().putBoolean("flag_start", true);
							}
						}
					}
				}
			}
			if (entity.getPersistentData().getBoolean("flag_start")) {
				if (entity.getPersistentData().getBoolean("circle")) {
					{
						final Vec3 _center = new Vec3(x, y, z);
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(128 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
						for (Entity entityiterator : _entfound) {
							if (!logic_a && !(entityiterator == entity) && entity.getPersistentData().getDouble("NameRanged_ranged") == entityiterator.getPersistentData().getDouble("NameRanged")) {
								logic_a = true;
								RotateEntityProcedure.execute(
										entityiterator.level()
												.clip(new ClipContext(entityiterator.getEyePosition(1f), entityiterator.getEyePosition(1f).add(entityiterator.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
														entityiterator))
												.getBlockPos().getX(),
										entityiterator.level()
												.clip(new ClipContext(entityiterator.getEyePosition(1f), entityiterator.getEyePosition(1f).add(entityiterator.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE,
														entityiterator))
												.getBlockPos().getY(),
										entityiterator.level().clip(
												new ClipContext(entityiterator.getEyePosition(1f), entityiterator.getEyePosition(1f).add(entityiterator.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entityiterator))
												.getBlockPos().getZ(),
										entity);
							}
						}
					}
					{
						Entity _ent = entity;
						_ent.setYRot((float) (entity.getYRot() + 90));
						_ent.setXRot(entity.getXRot());
						_ent.setYBodyRot(_ent.getYRot());
						_ent.setYHeadRot(_ent.getYRot());
						_ent.yRotO = _ent.getYRot();
						_ent.xRotO = _ent.getXRot();
						if (_ent instanceof LivingEntity _entity) {
							_entity.yBodyRotO = _entity.getYRot();
							_entity.yHeadRotO = _entity.getYRot();
						}
					}
					entity.getPersistentData().putBoolean("canFly", true);
					entity.getPersistentData().putDouble("power_mag", 2.2);
					GetPowerFowardProcedure.execute(world, x, y, z, entity);
					entity.setDeltaMovement(new Vec3((entity.getPersistentData().getDouble("x_power") * 0.4), (entity.getPersistentData().getDouble("y_power") * 0.4), (entity.getPersistentData().getDouble("z_power") * 0.4)));
				}
				entity.getPersistentData().putDouble("cnt1", (entity.getPersistentData().getDouble("cnt1") + 1));
				if (entity.getPersistentData().getDouble("cnt1") == 1) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.end_gateway.spawn")), SoundSource.NEUTRAL, 5, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.end_gateway.spawn")), SoundSource.NEUTRAL, 5, 1, false);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.end_gateway.spawn")), SoundSource.NEUTRAL, 5, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.end_gateway.spawn")), SoundSource.NEUTRAL, 5, 1, false);
						}
					}
				}
				x_pos = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(0)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX();
				y_pos = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(0)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY();
				z_pos = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(0)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ();
				if (entity.getPersistentData().getBoolean("circle")) {
					entity.getPersistentData().putDouble("BlockRange", Math.min(entity.getPersistentData().getDouble("cnt1"), 4));
					entity.getPersistentData().putDouble("BlockDamage", 4);
					BlockDestroyProcedure.execute(world, x_pos, y_pos, z_pos, entity);
					entity.getPersistentData().putDouble("BlockRange", Math.min(entity.getPersistentData().getDouble("cnt1") * 2, 8));
					entity.getPersistentData().putDouble("BlockDamage", 0.1);
					BlockDestroyProcedure.execute(world, x_pos, y_pos, z_pos, entity);
				} else {
					entity.getPersistentData().putDouble("BlockRange", Math.min(entity.getPersistentData().getDouble("cnt1"), 8));
					entity.getPersistentData().putDouble("BlockDamage", 4);
					BlockDestroyProcedure.execute(world, x_pos, y_pos, z_pos, entity);
					entity.getPersistentData().putDouble("BlockRange", Math.min(entity.getPersistentData().getDouble("cnt1") * 2, 16));
					entity.getPersistentData().putDouble("BlockDamage", 0.1);
					BlockDestroyProcedure.execute(world, x_pos, y_pos, z_pos, entity);
				}
				for (int index0 = 0; index0 < 5; index0++) {
					entity.getPersistentData().putDouble("damage", (3.5 + cnt * 1.75));
					entity.getPersistentData().putDouble("range", (30 - cnt * 5));
					DodamageProcedure.execute(world, x_pos, y_pos, z_pos, entity);
					entity.getPersistentData().putDouble("range", (30 - cnt * 5));
					entity.getPersistentData().putDouble("knockback", ((-1) - cnt * 0.25));
					if (entity.getPersistentData().getDouble("knockback") != 0) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate((entity.getPersistentData().getDouble("range") / 2) / 2d), e -> true).stream()
									.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
							for (Entity entityiterator : _entfound) {
								if (!(entityiterator == entity)) {
									if ((entityiterator instanceof Projectile _projEnt ? _projEnt.getDeltaMovement().length() : 0) > 0
											|| LogicAttackProcedure.execute(world, x, y, z, entity) && entityiterator instanceof LivingEntity && entityiterator.isAlive()) {
										x_power = entityiterator.getX() - entity.getX();
										y_power = entityiterator.getY() - entity.getY();
										z_power = entityiterator.getZ() - entity.getZ();
										dis = Math.sqrt(Math.pow(x_power, 2) + Math.pow(y_power, 2) + Math.pow(z_power, 2));
										if (dis < 1) {
											entityiterator.setDeltaMovement(new Vec3(0, 0, 0));
										} else {
											x_power = (x_power / dis) * entity.getPersistentData().getDouble("knockback");
											y_power = (y_power / dis) * entity.getPersistentData().getDouble("knockback");
											z_power = (z_power / dis) * entity.getPersistentData().getDouble("knockback");
											if (!(x_power * 1.1 < entityiterator.getDeltaMovement().x()) && !(x_power * 0.9 > entityiterator.getDeltaMovement().x())) {
												x_power = entityiterator.getDeltaMovement().x();
											} else {
												x_power = entityiterator.getDeltaMovement().x() + x_power * 0.1;
											}
											if (!(y_power * 1.1 < entityiterator.getDeltaMovement().y()) && !(y_power * 0.9 > entityiterator.getDeltaMovement().y())) {
												y_power = entityiterator.getDeltaMovement().y();
											} else {
												y_power = entityiterator.getDeltaMovement().y() + y_power * 0.1;
											}
											if (!(z_power * 1.1 < entityiterator.getDeltaMovement().z()) && !(z_power * 0.9 > entityiterator.getDeltaMovement().z())) {
												z_power = entityiterator.getDeltaMovement().z();
											} else {
												z_power = entityiterator.getDeltaMovement().z() + z_power * 0.1;
											}
											entityiterator.setDeltaMovement(new Vec3(x_power, y_power, z_power));
										}
									}
								}
							}
						}
					} else {
						entity.getPersistentData().putDouble("knockback", 0);
					}
					if (Math.random() < 0.5) {
						logic_a = true;
					}
					if (cnt < 5) {
						dis = 4;
					} else {
						dis = 4 - (Math.random() - 0.5) * Math.min(2, cnt / 2);
					}
					yaw = Math.toRadians(Math.random() * 360);
					rad_now = Math.toRadians((Math.random() - 0.5) * 180);
					for (int index1 = 0; index1 < 72; index1++) {
						if (logic_a) {
							x_pos = x + Math.cos(rad) * (Math.cos(rad_now) + Math.abs(Math.sin(yaw)) * Math.sin(rad_now));
							y_pos = y + Math.sin(Math.toRadians(z_pos)) * Math.sin(rad_now) * (-1);
							z_pos = z + Math.sin(rad) * (Math.cos(rad_now) + Math.abs(Math.cos(yaw)) * Math.sin(rad_now));
						} else {
							x_pos = x + Math.cos(rad) * Math.cos(rad_now);
							y_pos = y + Math.sin(rad);
							z_pos = z + Math.cos(rad) * Math.sin(rad_now);
						}
						x_pos = x + (x_pos - x) * dis;
						y_pos = y + (y_pos - y) * dis;
						z_pos = z + (z_pos - z) * dis;
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3(x_pos, y_pos, z_pos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"particle dust 0.5 0.5 1.0 1 ~ ~ ~ 0 0 0 0.1 1 force");
						rad = rad + Math.toRadians(5);
					}
					cnt = cnt + 1;
				}
				if (entity.getPersistentData().getBoolean("circle")) {
					if (entity.getPersistentData().getDouble("cnt1") > 45) {
						if (!entity.level().isClientSide())
							entity.discard();
					}
				} else {
					if (entity.getPersistentData().getDouble("cnt1") > 20) {
						if (!entity.level().isClientSide())
							entity.discard();
					}
				}
			}
		}
	}
}
