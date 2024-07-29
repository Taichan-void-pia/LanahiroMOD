package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Snowball;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.ranahiromod.network.RanahiromodModVariables;

import javax.annotation.Nullable;

import java.util.List;
import java.util.Comparator;

@Mod.EventBusSubscriber
public class SnowBallStartSkillProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player.getX(), event.player.getY(), event.player.getZ(), event.player);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		String trim_uuid = "";
		String color_param = "";
		double skill2 = 0;
		double cnt = 0;
		if ((entity.getPersistentData().getString("UUID")).equals("")) {
			entity.getPersistentData().putString("UUID", (entity.getStringUUID()));
		}
		if (!world.getEntitiesOfClass(Snowball.class, AABB.ofSize(new Vec3(x, y, z), 8, 8, 8), e -> true).isEmpty()) {
			if ((((Entity) world.getEntitiesOfClass(Snowball.class, AABB.ofSize(new Vec3(x, y, z), 8, 8, 8), e -> true).stream().sorted(new Object() {
				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
					return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
				}
			}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().getString("OwnerUUID")).equals("")) {
				((Entity) world.getEntitiesOfClass(Snowball.class, AABB.ofSize(new Vec3(x, y, z), 8, 8, 8), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putString("OwnerUUID", (entity.getPersistentData().getString("UUID")));
				entity.getPersistentData().putString("color4", "");
			}
		}
		if (!world.getEntitiesOfClass(Arrow.class, AABB.ofSize(new Vec3(x, y, z), 8, 8, 8), e -> true).isEmpty()) {
			if ((((Entity) world.getEntitiesOfClass(Arrow.class, AABB.ofSize(new Vec3(x, y, z), 8, 8, 8), e -> true).stream().sorted(new Object() {
				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
					return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
				}
			}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().getString("OwnerUUID")).equals("")) {
				((Entity) world.getEntitiesOfClass(Arrow.class, AABB.ofSize(new Vec3(x, y, z), 8, 8, 8), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putString("OwnerUUID", (entity.getPersistentData().getString("UUID")));
				entity.getPersistentData().putString("color4", "");
			}
		}
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(300 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof Arrow && (entity.getPersistentData().getString("UUID")).equals(entityiterator.getPersistentData().getString("OwnerUUID"))) {
					if ((entity.getPersistentData().getString("color4")).equals("")) {
						for (int index0 = 0; index0 < 3; index0++) {
							cnt = cnt + 5;
							entity.getPersistentData().putString("decimal_16", ((entity.getPersistentData().getString("UUID")).substring((int) (4 + cnt), (int) (8 + cnt))));
							UUID16DecimalConverted10DecimalProcedure.execute(entity);
							color_param = color_param + " " + ("0." + entity.getPersistentData().getString("decimal_10_text"));
						}
						entity.getPersistentData().putString("color4", color_param);
					}
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, new Vec3((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ())), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null)
										.withSuppressedOutput(),
								("particle dust" + entity.getPersistentData().getString("color4") + " 1 ~ ~ ~ 0.2 0.2 0.2 0.2 7 force"));
				}
				if (entityiterator instanceof Snowball && (entity.getPersistentData().getString("UUID")).equals(entityiterator.getPersistentData().getString("OwnerUUID"))) {
					if ((entity.getPersistentData().getString("color4")).equals("")) {
						for (int index1 = 0; index1 < 3; index1++) {
							cnt = cnt + 5;
							entity.getPersistentData().putString("decimal_16", ((entity.getPersistentData().getString("UUID")).substring((int) (4 + cnt), (int) (8 + cnt))));
							UUID16DecimalConverted10DecimalProcedure.execute(entity);
							color_param = color_param + " " + ("0." + entity.getPersistentData().getString("decimal_10_text"));
						}
						entity.getPersistentData().putString("color4", color_param);
					}
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, new Vec3((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ())), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null)
										.withSuppressedOutput(),
								("particle dust" + entity.getPersistentData().getString("color4") + " 1 ~ ~ ~ 0.2 0.2 0.2 0.2 7 force"));
					if ((entity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).Job == 3) {
						skill2 = (entity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).ChangeOtherSkillKeyCounter + 20201;
						if (skill2 == 20202) {
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.END_ROD, (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 4, 0.1, 0.1, 0.1, 0.2);
						} else if (skill2 == 20203) {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ())), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null)
												.withSuppressedOutput(),
										"particle dust_color_transition 10 10 10 1 1.000 1.000 1.000 ~ ~ ~ 1 1 1 0.1 15 force");
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.item.pickup")),
											SoundSource.NEUTRAL, 1, (float) 1.3);
								} else {
									_level.playLocalSound((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.item.pickup")), SoundSource.NEUTRAL, 1,
											(float) 1.3, false);
								}
							}
						} else if (skill2 == 20204) {
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.END_ROD, (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 7, 1, 1, 1, 0.5);
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.FIREWORK, (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 3, 1, 1, 1, 0.5);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.experience_orb.pickup")),
											SoundSource.NEUTRAL, 1, 2);
								} else {
									_level.playLocalSound((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.experience_orb.pickup")), SoundSource.NEUTRAL, 1,
											2, false);
								}
							}
							entity.getPersistentData().putDouble("range", 7);
							entity.getPersistentData().putDouble("damage", (30 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
							AllTargetDamage3Procedure.execute(world, entityiterator.getX(), entityiterator.getY(), entityiterator.getZ(), entity);
						} else if (skill2 == 20205) {
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.land")), SoundSource.NEUTRAL,
											1, (float) 1.2);
								} else {
									_level.playLocalSound((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.land")), SoundSource.NEUTRAL, 1, (float) 1.2,
											false);
								}
							}
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ())), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null)
												.withSuppressedOutput(),
										"particle block packed_ice ~ ~ ~ 0.5 0.5 0.5 0.3 15 force");
							entity.getPersistentData().putDouble("range", 4);
							entity.getPersistentData().putDouble("damage", (13 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
							AllTargetDamage3Procedure.execute(world, entityiterator.getX(), entityiterator.getY(), entityiterator.getZ(), entity);
							entity.getPersistentData().putString("render_type", "ice");
							entity.getPersistentData().putDouble("BlockRange", 3);
							BlockReplaceProcedure.execute(world, entityiterator.getX(), entityiterator.getY(), entityiterator.getZ(), entity);
						} else if (skill2 == 20206) {
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.blaze.shoot")),
											SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.blaze.shoot")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ())), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null)
												.withSuppressedOutput(),
										"particle flame ~ ~ ~ 2 0 0 0 10 force");
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ())), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null)
												.withSuppressedOutput(),
										"particle flame ~ ~ ~ 0 2 0 0 10 force");
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ())), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null)
												.withSuppressedOutput(),
										"particle flame ~ ~ ~ 0 0 2 0 10 force");
							entity.getPersistentData().putDouble("range", 4);
							entity.getPersistentData().putDouble("damage", (13 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
							entity.getPersistentData().putDouble("effect", 4);
							AllTargetDamage3Procedure.execute(world, entityiterator.getX(), entityiterator.getY(), entityiterator.getZ(), entity);
							entity.getPersistentData().putString("render_type", "fire");
							entity.getPersistentData().putDouble("BlockRange", 3);
							BlockReplaceProcedure.execute(world, entityiterator.getX(), entityiterator.getY(), entityiterator.getZ(), entity);
						}
					}
					if ((entity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).Job == 4) {
						skill2 = (entity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).ChangeOtherSkillKeyCounter + 20301;
						if (skill2 == 20303) {
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.mooshroom.shear")),
											SoundSource.NEUTRAL, 1, (float) 1.2);
								} else {
									_level.playLocalSound((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.mooshroom.shear")), SoundSource.NEUTRAL, 1,
											(float) 1.2, false);
								}
							}
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.SWEEP_ATTACK, (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 6, 0, 0, 0, 0);
						}
						if (skill2 == 20305) {
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.EXPLOSION, (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 6, 0, 0, 0, 0);
						}
					}
				}
			}
		}
	}
}
