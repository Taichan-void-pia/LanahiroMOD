package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

public class DevilEyeOnArmorHeadProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double x_pos = 0;
		double y_pos = 0;
		double z_pos = 0;
		double dis = 0;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 240, 0, false, false));
	}
}
