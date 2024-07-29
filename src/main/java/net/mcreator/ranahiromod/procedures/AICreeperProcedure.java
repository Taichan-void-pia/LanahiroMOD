package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.Creeper;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.ranahiromod.init.RanahiromodModParticleTypes;
import net.mcreator.ranahiromod.entity.UndefinedCreeperEntity;
import net.mcreator.ranahiromod.entity.EpicDownCreeperEntity;

import javax.annotation.Nullable;

import java.util.List;
import java.util.Comparator;

@Mod.EventBusSubscriber
public class AICreeperProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		ItemStack air = ItemStack.EMPTY;
		boolean epic_explosive = false;
		if (entity instanceof Creeper) {
			if (entity instanceof UndefinedCreeperEntity) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (RanahiromodModParticleTypes.NULL_PARTICLE.get()), x, (y + entity.getBbHeight() / 2), z, 8, (entity.getBbWidth() / 2), (entity.getBbHeight() / 4), (entity.getBbWidth() / 2), 0.05);
			}
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(100 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (!(entityiterator == entity)) {
						if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity) {
							if (entityiterator == (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null)) {
								entity.getPersistentData().putDouble("cnt_x", (entity.getPersistentData().getDouble("cnt_x") + 1));
								entity.getPersistentData().putDouble("cnt_target", (entity.getPersistentData().getDouble("cnt_target") + 1));
								if (entity instanceof UndefinedCreeperEntity) {
									if (entity.getPersistentData().getDouble("cnt_x") > 30) {
										epic_explosive = true;
									} else {
										if (entity.getPersistentData().getDouble("cnt_x") % 10 == 0) {
											if (world instanceof ServerLevel _level)
												_level.getServer().getCommands().performPrefixedCommand(
														new CommandSourceStack(CommandSource.NULL, new Vec3((x + (Math.random() - 0.5) * 10), (y + Math.random() * 5), (z + (Math.random() - 0.5) * 10)), Vec2.ZERO, _level, 4, "", Component.literal(""),
																_level.getServer(), null).withSuppressedOutput(),
														"summon experience_orb ~ ~ ~ {NoGravity:1b,Passengers:[{id:\"minecraft:creeper\",powered:1b,Passengers:[{id:\"minecraft:spawner_minecart\",SpawnCount:4,SpawnRange:10,Delay:0,MinSpawnDelay:3,MaxSpawnDelay:3,DisplayState:{Name:\"minecraft:spawner\"},SpawnData:{entity:{id:\"minecraft:potion\",Item:{id:\"minecraft:splash_potion\",Count:1b,tag:{CustomPotionEffects:[{Id:4,Amplifier:3b,Duration:100},{Id:7,Amplifier:3b,Duration:20},{Id:19,Amplifier:4b,Duration:100},{Id:20,Amplifier:4b,Duration:100},{Id:33,Amplifier:0b,Duration:100}]}}}}}],CustomName:'{\"text\":\"\u5F3E\u982D\",\"color\":\"dark_green\",\"bold\":true,\"underlined\":true}'}],CustomName:'{\"text\":\"\u30DB\u30FC\u30DF\u30F3\u30B0\u5F3E\"}'}");
										}
									}
								} else if (entity instanceof EpicDownCreeperEntity) {
									if (entity.getPersistentData().getDouble("cnt_x") > 80) {
										epic_explosive = true;
									}
								} else {
									if (entity.getPersistentData().getDouble("cnt_x") > 200) {
										epic_explosive = true;
									}
								}
								if (epic_explosive) {
									if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
										_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 200, 4, false, false));
									{
										Entity _entity = entity;
										if (_entity instanceof Player _player) {
											_player.getInventory().armor.set(2, new ItemStack(Items.NETHERITE_CHESTPLATE));
											_player.getInventory().setChanged();
										} else if (_entity instanceof LivingEntity _living) {
											_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(Items.NETHERITE_CHESTPLATE));
										}
									}
									(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).enchant(Enchantments.BLAST_PROTECTION, 20);
									(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).enchant(Enchantments.VANISHING_CURSE, 1);
									if (entity instanceof UndefinedCreeperEntity) {
										for (int index0 = 0; index0 < 12; index0++) {
											if (world instanceof ServerLevel _level) {
												Entity entityToSpawn = EntityType.TNT_MINECART.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
												if (entityToSpawn != null) {
													entityToSpawn.setYRot(entity.getYRot());
													entityToSpawn.setYBodyRot(entity.getYRot());
													entityToSpawn.setYHeadRot(entity.getYRot());
													entityToSpawn.setXRot(entity.getXRot());
													entityToSpawn.setDeltaMovement(((Math.random() - 0.5) * 0.5), 1, ((Math.random() - 0.5) * 0.5));
												}
											}
										}
									} else if (entity instanceof EpicDownCreeperEntity) {
										for (int index1 = 0; index1 < 9; index1++) {
											if (world instanceof ServerLevel _level) {
												Entity entityToSpawn = EntityType.TNT_MINECART.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
												if (entityToSpawn != null) {
													entityToSpawn.setYRot(entity.getYRot());
													entityToSpawn.setYBodyRot(entity.getYRot());
													entityToSpawn.setYHeadRot(entity.getYRot());
													entityToSpawn.setXRot(entity.getXRot());
													entityToSpawn.setDeltaMovement(((Math.random() - 0.5) * 0.5), 1, ((Math.random() - 0.5) * 0.5));
												}
											}
										}
									} else {
										for (int index2 = 0; index2 < 6; index2++) {
											if (world instanceof ServerLevel _level) {
												Entity entityToSpawn = EntityType.TNT_MINECART.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
												if (entityToSpawn != null) {
													entityToSpawn.setYRot(entity.getYRot());
													entityToSpawn.setYBodyRot(entity.getYRot());
													entityToSpawn.setYHeadRot(entity.getYRot());
													entityToSpawn.setXRot(entity.getXRot());
													entityToSpawn.setDeltaMovement(((Math.random() - 0.5) * 0.5), 1, ((Math.random() - 0.5) * 0.5));
												}
											}
										}
									}
									if (entity instanceof UndefinedCreeperEntity || entity.getPersistentData().getDouble("cnt_y") > 3) {
										entity.getPersistentData().putDouble("cnt_y", 0);
										if (!entity.level().isClientSide())
											entity.discard();
									} else {
										entity.getPersistentData().putDouble("cnt_y", (entity.getPersistentData().getDouble("cnt_y") + 1));
									}
									entity.getPersistentData().putDouble("cnt_x", 0);
								}
							}
						} else if (!((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity)) {
							entity.getPersistentData().putDouble("cnt_target", 0);
							if (entity.getPersistentData().getDouble("cnt_x") > 20) {
								entity.getPersistentData().putDouble("cnt_x", 20);
							}
						}
					}
				}
			}
		}
	}
}
