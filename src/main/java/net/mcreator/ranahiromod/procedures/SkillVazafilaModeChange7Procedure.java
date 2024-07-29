package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;

import net.mcreator.ranahiromod.init.RanahiromodModItems;

public class SkillVazafilaModeChange7Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		boolean UseSK = false;
		boolean logic_attack = false;
		boolean UseVazafila = false;
		boolean muki = false;
		boolean type = false;
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
		double dis_start = 0;
		double x_center = 0;
		double y_center = 0;
		double z_center = 0;
		ItemStack sword = ItemStack.EMPTY;
		ItemStack katana = ItemStack.EMPTY;
		sword = new ItemStack(RanahiromodModItems.VAZAFILA_SWORD.get());
		katana = new ItemStack(RanahiromodModItems.VAZAFILA_KATANA.get());
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == sword.getItem()) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = katana.copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == sword.getItem()) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = katana.copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == katana.getItem()) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = sword.copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == katana.getItem()) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = sword.copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		}
		entity.getPersistentData().putDouble("skill2", 0);
	}
}
