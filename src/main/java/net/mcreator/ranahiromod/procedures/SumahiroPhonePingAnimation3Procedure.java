package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.ranahiromod.init.RanahiromodModItems;

public class SumahiroPhonePingAnimation3Procedure {
	public static boolean execute(double x, double y, double z, Entity entity) {
		if (entity == null)
			return false;
		boolean logic_s = false;
		double server_distance = 0;
		logic_s = false;
		server_distance = SumahirPhonePingDistanceProcedure.execute(x, y, z, entity);
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RanahiromodModItems.SUMAHIRO_PHONE.get()) {
			if (server_distance >= 50 && server_distance < 100) {
				logic_s = true;
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == RanahiromodModItems.SUMAHIRO_PHONE.get()) {
			if (server_distance >= 50 && server_distance < 100) {
				logic_s = true;
			}
		}
		return logic_s;
	}
}
