
package net.mcreator.ranahiromod.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class LowAttackReinforcedMobEffect extends MobEffect {
	public LowAttackReinforcedMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -154);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
