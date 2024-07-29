package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;

import net.mcreator.ranahiromod.init.RanahiromodModItems;

public class WhenFarionGunHavingProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getItem() == RanahiromodModItems.FARION_GUN_1.get() || itemstack.getItem() == RanahiromodModItems.FARION_GUN_2.get() || itemstack.getItem() == RanahiromodModItems.FARION_GUN_3.get()) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RanahiromodModItems.FARION_GUN.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if (itemstack.getItem() == RanahiromodModItems.FARION_GUN_1.get() || itemstack.getItem() == RanahiromodModItems.FARION_GUN_2.get() || itemstack.getItem() == RanahiromodModItems.FARION_GUN_3.get()) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RanahiromodModItems.FARION_GUN.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		}
	}
}
