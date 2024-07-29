package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

public class PrivateBottleHasItemGlowingEffectProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("ranahiromod:private_land"));
	}
}
