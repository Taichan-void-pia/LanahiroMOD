package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class OverlayPlayerModelDashProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		boolean logic_a = false;
		logic_a = false;
		if (entity instanceof Player) {
			if (entity.isSprinting() || entity instanceof LivingEntity _livEnt2 && _livEnt2.isFallFlying() || entity.isSwimming() || entity.isShiftKeyDown()) {
				logic_a = true;
			} else {
				logic_a = false;
			}
		}
		return logic_a;
	}
}
