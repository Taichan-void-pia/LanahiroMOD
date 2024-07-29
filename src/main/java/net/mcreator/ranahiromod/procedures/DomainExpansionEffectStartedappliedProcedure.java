package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

public class DomainExpansionEffectStartedappliedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double level = 0;
		double tick = 0;
		if (!entity.getPersistentData().getBoolean("flag_domain")) {
			entity.getPersistentData().putBoolean("flag_domain", true);
			level = (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) + 1;
			tick = Math.round((level + 5) / level + Math.round(Math.sqrt(level * 25)));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, (int) tick, (int) level, false, false));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, (int) tick, 0, false, false));
		}
	}
}
