
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ranahiromod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.ranahiromod.RanahiromodMod;

public class RanahiromodModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, RanahiromodMod.MODID);
	public static final RegistryObject<SimpleParticleType> BLACKFLAME = REGISTRY.register("blackflame", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> SK_LINER_BLADE_PARTICLE = REGISTRY.register("sk_liner_blade_particle", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> SK_LINER_BLADE_PARTICLE_2 = REGISTRY.register("sk_liner_blade_particle_2", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> MOCHI_PARTICLE = REGISTRY.register("mochi_particle", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> LIGHT_SCATTER = REGISTRY.register("light_scatter", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> VOID_PARTICLE = REGISTRY.register("void_particle", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> OFFSET_WAVE_PARTICLE = REGISTRY.register("offset_wave_particle", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> SMOKE_WIND = REGISTRY.register("smoke_wind", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> JUGEKI_HOROSHA = REGISTRY.register("jugeki_horosha", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> NULL_PARTICLE = REGISTRY.register("null_particle", () -> new SimpleParticleType(false));
}
