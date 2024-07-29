
package net.mcreator.ranahiromod.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.ranahiromod.procedures.NullPotionOnEffectActiveTickProcedure;
import net.mcreator.ranahiromod.procedures.NullPotionEffectStartedappliedProcedure;
import net.mcreator.ranahiromod.procedures.NullPotionEffectExpiresProcedure;

public class NullPotionMobEffect extends MobEffect {
	public NullPotionMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -1);
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		NullPotionEffectStartedappliedProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		NullPotionOnEffectActiveTickProcedure.execute(entity.level(), entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		NullPotionEffectExpiresProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ());
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
