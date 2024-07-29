package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class EntityLookPositionNearEntityHealthProcedure {
	public static String execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return "";
		double x_pos = 0;
		double y_pos = 0;
		double z_pos = 0;
		Entity nearest_entity = null;
		String name = "";
		nearest_entity = EntityLookPositionNearEntityNameProcedure.execute(world, entity);
		name = "HP:" + (Math.round(nearest_entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + "/" + Math.round(nearest_entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1));
		return name;
	}
}
