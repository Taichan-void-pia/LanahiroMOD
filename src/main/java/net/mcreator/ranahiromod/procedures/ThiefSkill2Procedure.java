package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.ranahiromod.RanahiromodMod;

import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Comparator;

public class ThiefSkill2Procedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		boolean UseSK = false;
		boolean logic_attack = false;
		double range = 0;
		double data = 0;
		double rad = 0;
		double rad_now = 0;
		double xPos = 0;
		double yPos = 0;
		double zPos = 0;
		double yaw_now = 0;
		double dis = 0;
		double rotate = 0;
		double pitch = 0;
		double num1 = 0;
		double num2 = 0;
		double num3 = 0;
		double tick = 0;
		double x_pos = 0;
		double y_pos = 0;
		double z_pos = 0;
		double DealDamage = 0;
		double dis_count = 0;
		double yaw = 0;
		double look_z = 0;
		double itemNum = 0;
		double look_y = 0;
		double look_x = 0;
		double loopNum = 0;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
			for (int index0 = 0; index0 < 7; index0++) {
				look_x = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(dis)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX();
				look_y = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(dis)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY();
				look_z = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(dis)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ();
				{
					final Vec3 _center = new Vec3(look_x, look_y, look_z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(3 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if (entityiterator instanceof LivingEntity) {
							if (!(entityiterator == entity)) {
								if (!((entityiterator instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem())) {
									if (entity instanceof LivingEntity _entity)
										_entity.swing(InteractionHand.MAIN_HAND, true);
									if (world instanceof ServerLevel _level)
										_level.sendParticles(ParticleTypes.POOF, look_x, look_y, look_z, 5, 0, 0, 0, 0);
									loopNum = 0;
									itemNum = 0;
									for (int index1 = 0; index1 < 36; index1++) {
										if ((entityiterator instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == (new Object() {
											public ItemStack getItemStack(int sltid, Entity entity) {
												AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
												entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
													_retval.set(capability.getStackInSlot(sltid).copy());
												});
												return _retval.get();
											}
										}.getItemStack((int) loopNum, entityiterator)).getItem()) {
											itemNum = itemNum + (new Object() {
												public ItemStack getItemStack(int sltid, Entity entity) {
													AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
													entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
														_retval.set(capability.getStackInSlot(sltid).copy());
													});
													return _retval.get();
												}
											}.getItemStack((int) loopNum, entityiterator)).getCount();
										}
										loopNum = loopNum + 1;
									}
									if ((entityiterator instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) <= 100) {
										if (entity instanceof LivingEntity _entity) {
											ItemStack _setstack = ((entityiterator instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).copy()).copy();
											_setstack.setCount((int) itemNum);
											_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
											if (_entity instanceof Player _player)
												_player.getInventory().setChanged();
										}
										RanahiromodMod.queueServerWork(2, () -> {
											if (entityiterator instanceof LivingEntity _entity) {
												ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
												_setstack.setCount(1);
												_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
												if (_entity instanceof Player _player)
													_player.getInventory().setChanged();
											}
										});
										break;
									} else {
										if (entity instanceof Player _player && !_player.level().isClientSide())
											_player.displayClientMessage(Component.literal("\u6240\u6301\u3067\u304D\u307E\u305B\u3093\uFF01"), true);
									}
								}
							}
						}
					}
				}
				dis = dis + 1;
			}
			entity.getPersistentData().putDouble("skill2", 0);
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u6240\u6301\u3067\u304D\u307E\u305B\u3093\uFF01"), true);
			entity.getPersistentData().putDouble("skill2", 0);
		}
	}
}
