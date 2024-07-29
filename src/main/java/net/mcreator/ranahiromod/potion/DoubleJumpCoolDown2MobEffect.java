
package net.mcreator.ranahiromod.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.ranahiromod.procedures.DoubleJumpCoolDown2TickProcedure;

public class DoubleJumpCoolDown2MobEffect extends MobEffect {
	public DoubleJumpCoolDown2MobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		DoubleJumpCoolDown2TickProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
