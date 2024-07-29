
package net.mcreator.ranahiromod.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.ranahiromod.procedures.AddictionEffectExpiresProcedure;

public class AddictionMobEffect extends MobEffect {
	public AddictionMobEffect() {
		super(MobEffectCategory.HARMFUL, -3407770);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		AddictionEffectExpiresProcedure.execute(entity.level(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
