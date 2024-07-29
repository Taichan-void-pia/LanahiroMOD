
package net.mcreator.ranahiromod.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class DiscordRanahiroMobEffect extends MobEffect {
	public DiscordRanahiroMobEffect() {
		super(MobEffectCategory.NEUTRAL, -3407872);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
