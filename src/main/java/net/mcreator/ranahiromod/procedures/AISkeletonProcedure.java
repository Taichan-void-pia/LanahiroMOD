package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.Skeleton;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import javax.annotation.Nullable;

import java.util.List;
import java.util.Comparator;

@Mod.EventBusSubscriber
public class AISkeletonProcedure {
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
		boolean target_logic = false;
		double damage = 0;
		double x_power = 0;
		double z_power = 0;
		double dis = 0;
		double xPos = 0;
		double yPos = 0;
		double zPos = 0;
		if (entity instanceof Skeleton) {
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(100 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					target_logic = !(entityiterator == entity) && entityiterator == (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null);
					if (target_logic) {
						if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity) {
							xPos = entityiterator.getX() - entity.getX();
							yPos = entityiterator.getY() - entity.getY();
							zPos = entityiterator.getZ() - entity.getZ();
							dis = Math.sqrt(Math.pow(xPos, 2) + Math.pow(yPos, 2) + Math.pow(zPos, 2));
							if (dis <= 6) {
								if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.BOW) {
									if (entity instanceof LivingEntity _entity) {
										ItemStack _setstack = new ItemStack(Items.NETHERITE_SWORD).copy();
										_setstack.setCount(1);
										_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
										if (_entity instanceof Player _player)
											_player.getInventory().setChanged();
									}
									damage = 8 + 12;
									damage = damage - 9;
									damage = damage * 2 + 1;
									(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).enchant(Enchantments.SHARPNESS, (int) Math.round(damage));
								}
							} else {
								if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.NETHERITE_SWORD) {
									if (entity instanceof LivingEntity _entity) {
										ItemStack _setstack = new ItemStack(Items.BOW).copy();
										_setstack.setCount(1);
										_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
										if (_entity instanceof Player _player)
											_player.getInventory().setChanged();
									}
									damage = 10 + 10;
									damage = (damage - 1) * 0.25;
									damage = damage + 10 * 1.5 + 0.25;
									(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).enchant(Enchantments.POWER_ARROWS, (int) Math.round(damage));
								}
							}
							if (dis <= 3) {
								if (Math.random() < 0.01) {
									x_power = GetPowerIteratorXProcedure.execute(world, x, y, z, entity);
									z_power = GetPowerIteratorZProcedure.execute(world, x, y, z, entity);
									entity.setDeltaMovement(new Vec3((x_power * (-0.3)), 0.5, (z_power * (-0.3))));
								}
							}
							entity.getPersistentData().putDouble("cnt_x", (entity.getPersistentData().getDouble("cnt_x") + 1));
							if (entity.getPersistentData().getDouble("cnt_x") > 200) {
								if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() instanceof SwordItem) {
									if (world instanceof ServerLevel _level)
										_level.sendParticles(ParticleTypes.ANGRY_VILLAGER, (x + entity.getBbWidth() / 2), (y + entity.getBbHeight() / 2), (z + entity.getBbWidth() / 2), 5, (entity.getBbWidth() / 2), (entity.getBbHeight() / 2),
												(entity.getBbWidth() / 2), 0.3);
									if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
										_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 140, 4));
									if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
										_entity.addEffect(new MobEffectInstance(MobEffects.JUMP, 140, 4));
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.blaze.shoot")), SoundSource.NEUTRAL, 1, 1);
										} else {
											_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.blaze.shoot")), SoundSource.NEUTRAL, 1, 1, false);
										}
									}
									entity.getPersistentData().putDouble("cnt_x", 0);
								}
							}
						} else if (!((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity)) {
							if (entity.getPersistentData().getDouble("cnt_x") > 100) {
								entity.getPersistentData().putDouble("cnt_x", 100);
							}
						}
					}
				}
			}
		}
	}
}
