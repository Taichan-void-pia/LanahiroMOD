
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ranahiromod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.ranahiromod.RanahiromodMod;

public class RanahiromodModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, RanahiromodMod.MODID);
	public static final RegistryObject<Potion> DISCORD_RANAHIRO_POTION = REGISTRY.register("discord_ranahiro_potion", () -> new Potion(new MobEffectInstance(RanahiromodModMobEffects.DISCORD_RANAHIRO.get(), 12000, 0, true, true)));
}
