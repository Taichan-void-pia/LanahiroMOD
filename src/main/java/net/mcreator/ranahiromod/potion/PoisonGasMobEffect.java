
package net.mcreator.ranahiromod.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.ranahiromod.procedures.PoisonGasOnEffectActiveTickProcedure;

public class PoisonGasMobEffect extends MobEffect {
	public PoisonGasMobEffect() {
		super(MobEffectCategory.HARMFUL, -1);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		PoisonGasOnEffectActiveTickProcedure.execute(entity.level(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
