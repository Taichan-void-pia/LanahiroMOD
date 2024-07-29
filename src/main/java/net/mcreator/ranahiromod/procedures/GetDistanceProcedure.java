package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class GetDistanceProcedure {
	public static double execute(Entity entity) {
		if (entity == null)
			return 0;
		double dis = 0;
		if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity) {
			dis = Math.sqrt(Math.pow((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX() - entity.getX(), 2) + Math.pow((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY() - entity.getY(), 2)
					+ Math.pow((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ() - entity.getZ(), 2));
		} else {
			dis = 999;
		}
		return dis;
	}
}
