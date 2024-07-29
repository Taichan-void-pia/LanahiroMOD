package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;

import net.mcreator.ranahiromod.init.RanahiromodModItems;

public class ProjectileItemShootKeyLeaveProcedure {
	public static void execute(Entity entity, double pressedms) {
		if (entity == null)
			return;
		double PressTime = 0;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RanahiromodModItems.FARION_GUN.get()) {
			entity.getPersistentData().putDouble("PressTime", (pressedms - entity.getPersistentData().getDouble("PressTime")));
			if (entity.getPersistentData().getDouble("PressTime") <= 20) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(RanahiromodModItems.FARION_GUN_1.get()).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			} else if (entity.getPersistentData().getDouble("PressTime") <= 40) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(RanahiromodModItems.FARION_GUN_2.get()).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			} else if (entity.getPersistentData().getDouble("PressTime") <= 60) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(RanahiromodModItems.FARION_GUN_3.get()).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			} else if (entity.getPersistentData().getDouble("PressTime") >= 61) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(RanahiromodModItems.FARION_GUN_3.get()).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == RanahiromodModItems.FARION_GUN.get()) {
			entity.getPersistentData().putDouble("PressTime", (pressedms - entity.getPersistentData().getDouble("PressTime")));
			if (entity.getPersistentData().getDouble("PressTime") <= 20) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(RanahiromodModItems.FARION_GUN_1.get()).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			} else if (entity.getPersistentData().getDouble("PressTime") <= 40) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(RanahiromodModItems.FARION_GUN_2.get()).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			} else if (entity.getPersistentData().getDouble("PressTime") <= 60) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(RanahiromodModItems.FARION_GUN_3.get()).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			} else if (entity.getPersistentData().getDouble("PressTime") >= 61) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(RanahiromodModItems.FARION_GUN_3.get()).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			}
		}
	}
}
