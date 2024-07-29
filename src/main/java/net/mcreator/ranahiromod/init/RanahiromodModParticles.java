
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ranahiromod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.ranahiromod.client.particle.VoidParticleParticle;
import net.mcreator.ranahiromod.client.particle.SmokeWindParticle;
import net.mcreator.ranahiromod.client.particle.SKLinerBladeParticleParticle;
import net.mcreator.ranahiromod.client.particle.SKLinerBladeParticle2Particle;
import net.mcreator.ranahiromod.client.particle.OffsetWaveParticleParticle;
import net.mcreator.ranahiromod.client.particle.NullParticleParticle;
import net.mcreator.ranahiromod.client.particle.MochiParticleParticle;
import net.mcreator.ranahiromod.client.particle.LightScatterParticle;
import net.mcreator.ranahiromod.client.particle.JugekiHoroshaParticle;
import net.mcreator.ranahiromod.client.particle.BlackflameParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class RanahiromodModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(RanahiromodModParticleTypes.BLACKFLAME.get(), BlackflameParticle::provider);
		event.registerSpriteSet(RanahiromodModParticleTypes.SK_LINER_BLADE_PARTICLE.get(), SKLinerBladeParticleParticle::provider);
		event.registerSpriteSet(RanahiromodModParticleTypes.SK_LINER_BLADE_PARTICLE_2.get(), SKLinerBladeParticle2Particle::provider);
		event.registerSpriteSet(RanahiromodModParticleTypes.MOCHI_PARTICLE.get(), MochiParticleParticle::provider);
		event.registerSpriteSet(RanahiromodModParticleTypes.LIGHT_SCATTER.get(), LightScatterParticle::provider);
		event.registerSpriteSet(RanahiromodModParticleTypes.VOID_PARTICLE.get(), VoidParticleParticle::provider);
		event.registerSpriteSet(RanahiromodModParticleTypes.OFFSET_WAVE_PARTICLE.get(), OffsetWaveParticleParticle::provider);
		event.registerSpriteSet(RanahiromodModParticleTypes.SMOKE_WIND.get(), SmokeWindParticle::provider);
		event.registerSpriteSet(RanahiromodModParticleTypes.JUGEKI_HOROSHA.get(), JugekiHoroshaParticle::provider);
		event.registerSpriteSet(RanahiromodModParticleTypes.NULL_PARTICLE.get(), NullParticleParticle::provider);
	}
}
