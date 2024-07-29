package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;

import net.mcreator.ranahiromod.init.RanahiromodModMobEffects;
import net.mcreator.ranahiromod.init.RanahiromodModItems;

public class FlyAllowItemLogicProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		boolean logic_a = false;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(RanahiromodModMobEffects.FLIGHT.get())) {
			logic_a = entity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(RanahiromodModMobEffects.FLIGHT.get());
		}
		logic_a = (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == RanahiromodModItems.HOROSHA_BACK_ARMOR.get()
				|| (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == RanahiromodModItems.MECHANISM_ARMOR_CHESTPLATE.get()
				|| (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == RanahiromodModItems.DRAGONHIRO_WING_CHESTPLATE.get()
				|| (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == RanahiromodModItems.BOSSHIRO_2_WING_CHESTPLATE.get();
		return logic_a;
	}
}
