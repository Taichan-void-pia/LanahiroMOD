
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ranahiromod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.ranahiromod.enchantment.SoulResonanceEnchantment;
import net.mcreator.ranahiromod.enchantment.RanahiroSlayerEnchantment;
import net.mcreator.ranahiromod.enchantment.RainbowProtectionEnchantment;
import net.mcreator.ranahiromod.enchantment.PerditionBladeEnchantment;
import net.mcreator.ranahiromod.enchantment.OPRespawnEnchantment;
import net.mcreator.ranahiromod.enchantment.InfinityEatEnchantment;
import net.mcreator.ranahiromod.enchantment.HolyPowerEnchantment;
import net.mcreator.ranahiromod.enchantment.DoubleBreakEnchantment;
import net.mcreator.ranahiromod.enchantment.DeathSongEnchantment;
import net.mcreator.ranahiromod.RanahiromodMod;

public class RanahiromodModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, RanahiromodMod.MODID);
	public static final RegistryObject<Enchantment> RANAHIRO_SLAYER = REGISTRY.register("ranahiro_slayer", () -> new RanahiroSlayerEnchantment());
	public static final RegistryObject<Enchantment> RAINBOW_FORCE_POWER = REGISTRY.register("rainbow_force_power", () -> new RainbowProtectionEnchantment());
	public static final RegistryObject<Enchantment> SOUL_POWER = REGISTRY.register("soul_power", () -> new SoulResonanceEnchantment());
	public static final RegistryObject<Enchantment> INFINITY_EAT = REGISTRY.register("infinity_eat", () -> new InfinityEatEnchantment());
	public static final RegistryObject<Enchantment> OP_RESPAWN = REGISTRY.register("op_respawn", () -> new OPRespawnEnchantment());
	public static final RegistryObject<Enchantment> HOLY_POWER = REGISTRY.register("holy_power", () -> new HolyPowerEnchantment());
	public static final RegistryObject<Enchantment> DEATH_SONG = REGISTRY.register("death_song", () -> new DeathSongEnchantment());
	public static final RegistryObject<Enchantment> PERDITION_BLADE = REGISTRY.register("perdition_blade", () -> new PerditionBladeEnchantment());
	public static final RegistryObject<Enchantment> DOUBLE_BREAK = REGISTRY.register("double_break", () -> new DoubleBreakEnchantment());
}
