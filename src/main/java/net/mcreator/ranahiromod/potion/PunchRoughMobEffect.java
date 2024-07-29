
package net.mcreator.ranahiromod.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.ranahiromod.procedures.PunchRoughOnEffectActiveTickProcedure;

public class PunchRoughMobEffect extends MobEffect {
	public PunchRoughMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -16711732);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		PunchRoughOnEffectActiveTickProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
