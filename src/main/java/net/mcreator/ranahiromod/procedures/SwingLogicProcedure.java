package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.ranahiromod.init.RanahiromodModMobEffects;
import net.mcreator.ranahiromod.init.RanahiromodModItems;

public class SwingLogicProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean logic_special = false;
		if (entity.getPersistentData().getDouble("skill2") == 0) {
			if (entity.getPersistentData().getDouble("skill2_swing") == 0) {
				if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(RanahiromodModMobEffects.COOLDOWN.get()) ? _livEnt.getEffect(RanahiromodModMobEffects.COOLDOWN.get()).getAmplifier() : 0) <= entity.getPersistentData()
						.getDouble("swing_limit")) {
					entity.getPersistentData().putDouble("cnt1", 0);
					entity.getPersistentData().putDouble("cnt2", 0);
					entity.getPersistentData().putDouble("cnt3", 0);
					entity.getPersistentData().putDouble("cnt4", 0);
					entity.getPersistentData().putDouble("cnt5", 0);
					entity.getPersistentData().putDouble("cnt6", 0);
					entity.getPersistentData().putDouble("x_pos", 0);
					entity.getPersistentData().putDouble("y_pos", 0);
					entity.getPersistentData().putDouble("z_pos", 0);
					entity.getPersistentData().putDouble("start_r", 0);
					logic_special = !((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() instanceof SwordItem
							&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() instanceof AxeItem
							&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() instanceof PickaxeItem
							&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() instanceof ShovelItem
							&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() instanceof HoeItem);
					if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() instanceof SwordItem) {
						entity.getPersistentData().putDouble("skill2_swing", 1);
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() instanceof AxeItem
							|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RanahiromodModItems.LAVAHIRO_ITEM.get()
							|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RanahiromodModItems.RANDOM_DYE_GENERATOR.get()) {
						entity.getPersistentData().putDouble("skill2_swing", 2);
					} else if (logic_special) {
						entity.getPersistentData().putDouble("skill2_swing", 3);
					}
					if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RanahiromodModItems.WARDENHIRO_ITEM.get()) {
						entity.getPersistentData().putDouble("skill2_swing", 4);
					}
					if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RanahiromodModItems.WIND_MAGIC.get()) {
						entity.getPersistentData().putDouble("skill2_swing", 5);
					}
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(RanahiromodModMobEffects.COOLDOWN.get(), 40,
								(int) ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(RanahiromodModMobEffects.COOLDOWN.get()) ? _livEnt.getEffect(RanahiromodModMobEffects.COOLDOWN.get()).getAmplifier() : 0) + 1), false, false));
					if (entity.getPersistentData().getDouble("skill2_swing") == 1) {
						SwingSwordProcedure.execute(world, x, y, z, entity);
					} else if (entity.getPersistentData().getDouble("skill2_swing") == 2 || entity.getPersistentData().getDouble("skill2_swing") == 3) {
						SwingAxeProcedure.execute(world, x, y, z, entity);
					} else if (entity.getPersistentData().getDouble("skill2_swing") == 4) {
						SwingWardenhiroProcedure.execute(world, entity);
					} else if (entity.getPersistentData().getDouble("skill2_swing") == 5) {
						SwingWindMagicProcedure.execute(world, x, y, z, entity);
					}
				} else {
					if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(RanahiromodModMobEffects.COOLDOWN.get()) ? _livEnt.getEffect(RanahiromodModMobEffects.COOLDOWN.get()).getAmplifier() : 0) == entity.getPersistentData()
							.getDouble("swing_limit")) {
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(RanahiromodModMobEffects.COOLDOWN.get(), 40,
									entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(RanahiromodModMobEffects.COOLDOWN.get()) ? _livEnt.getEffect(RanahiromodModMobEffects.COOLDOWN.get()).getAmplifier() : 0, false, false));
					}
				}
			}
		}
	}
}
