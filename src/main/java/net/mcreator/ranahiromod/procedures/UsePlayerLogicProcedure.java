package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.ranahiromod.entity.SKLiner5077Entity;

public class UsePlayerLogicProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
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
		boolean UseSK = false;
		boolean logic_attack = false;
		UseSK = false;
		if (entity instanceof SKLiner5077Entity || entity instanceof Player && ((entity.getDisplayName().getString()).equals("SKLiner_5077")
				|| ((entity.getDisplayName().getString()).equals("Dev") || (entity.getDisplayName().getString()).equals("pirokichihawaii") || (entity.getDisplayName().getString()).equals("taichan_"))
						&& entity.getPersistentData().getBoolean("Devlopment"))) {
			UseSK = true;
		}
		return UseSK;
	}
}
