package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.ranahiromod.init.RanahiromodModItems;

public class SumahiroPhoneMusicConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		boolean logic_s = false;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RanahiromodModItems.SUMAHIRO_PHONE.get()) {
			logic_s = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getBoolean("play_music");
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == RanahiromodModItems.SUMAHIRO_PHONE.get()) {
			logic_s = (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getOrCreateTag().getBoolean("play_music");
		}
		return !logic_s;
	}
}
