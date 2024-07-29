package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;

import net.mcreator.ranahiromod.entity.PirokichihawaiiEntity;
import net.mcreator.ranahiromod.entity.Bosshiro2Entity;

public class UsePlayerLogicRanahiroProcedure {
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
		if (entity instanceof Bosshiro2Entity || entity instanceof PirokichihawaiiEntity && Math.random() < 0.5
				|| entity instanceof Player && ((entity.getDisplayName().getString()).equals("pirokichihawaii")
						&& Math.random() < Math.min((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 10, 1)
						|| ((entity.getDisplayName().getString()).equals("Dev") || (entity.getDisplayName().getString()).equals("pirokichihawaii") || (entity.getDisplayName().getString()).equals("taichan_"))
								&& entity.getPersistentData().getBoolean("Devlopment"))) {
			UseSK = true;
		}
		return UseSK;
	}
}
