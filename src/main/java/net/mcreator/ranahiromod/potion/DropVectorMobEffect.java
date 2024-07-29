
package net.mcreator.ranahiromod.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.ranahiromod.procedures.DropVectorOnEffectActiveTickProcedure;

public class DropVectorMobEffect extends MobEffect {
	public DropVectorMobEffect() {
		super(MobEffectCategory.HARMFUL, -1);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		DropVectorOnEffectActiveTickProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
