package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;

public class EntityLookPositionNearEntityStrengthProcedure {
	public static String execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return "";
		double x_pos = 0;
		double y_pos = 0;
		double z_pos = 0;
		Entity nearest_entity = null;
		String name = "";
		nearest_entity = EntityLookPositionNearEntityNameProcedure.execute(world, entity);
		name = "Power:" + ("" + Math.round(Math.max(nearest_entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0, 0)));
		return name;
	}
}
