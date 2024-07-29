package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.ranahiromod.init.RanahiromodModItems;

public class SumahirPhonePositiondel2Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		ItemStack hand_item = ItemStack.EMPTY;
		String place = "";
		place = "place1";
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RanahiromodModItems.SUMAHIRO_PHONE.get()) {
			hand_item = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
			if (hand_item.getOrCreateTag().getBoolean((place + "_pos"))) {
				hand_item.getOrCreateTag().putBoolean((place + "_pos"), false);
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == RanahiromodModItems.SUMAHIRO_PHONE.get()) {
			hand_item = (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY);
			if (hand_item.getOrCreateTag().getBoolean((place + "_pos"))) {
				hand_item.getOrCreateTag().putBoolean((place + "_pos"), false);
			}
		}
	}
}
