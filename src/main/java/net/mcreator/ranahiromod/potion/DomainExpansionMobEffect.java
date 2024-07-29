
package net.mcreator.ranahiromod.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.ranahiromod.procedures.DomainExpansionOnEffectActiveTickProcedure;
import net.mcreator.ranahiromod.procedures.DomainExpansionEffectStartedappliedProcedure;

public class DomainExpansionMobEffect extends MobEffect {
	public DomainExpansionMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -1);
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		DomainExpansionEffectStartedappliedProcedure.execute(entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		DomainExpansionOnEffectActiveTickProcedure.execute(entity.level(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
