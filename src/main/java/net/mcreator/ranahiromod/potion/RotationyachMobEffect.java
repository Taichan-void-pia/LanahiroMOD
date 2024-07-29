
package net.mcreator.ranahiromod.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.ranahiromod.procedures.RotationyachOnEffectActiveTickProcedure;

public class RotationyachMobEffect extends MobEffect {
	public RotationyachMobEffect() {
		super(MobEffectCategory.HARMFUL, -1);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		RotationyachOnEffectActiveTickProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}