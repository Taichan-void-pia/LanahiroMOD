package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.ranahiromod.init.RanahiromodModItems;

public class PositionDelCondition2Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		ItemStack hand_item = ItemStack.EMPTY;
		String place = "";
		boolean logic_s = false;
		logic_s = false;
		place = "place1";
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RanahiromodModItems.SUMAHIRO_PHONE.get()) {
			hand_item = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
			if (hand_item.getOrCreateTag().getBoolean((place + "_pos"))) {
				logic_s = true;
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == RanahiromodModItems.SUMAHIRO_PHONE.get()) {
			hand_item = (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY);
			if (hand_item.getOrCreateTag().getBoolean((place + "_pos"))) {
				logic_s = true;
			}
		}
		return logic_s;
	}
}
