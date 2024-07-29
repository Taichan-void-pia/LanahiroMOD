
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ranahiromod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.ranahiromod.client.renderer.WindhiroRenderer;
import net.mcreator.ranahiromod.client.renderer.WaterhiroRenderer;
import net.mcreator.ranahiromod.client.renderer.WaterDragonRenderer;
import net.mcreator.ranahiromod.client.renderer.WardenhiroRenderer;
import net.mcreator.ranahiromod.client.renderer.WardenHandRenderer;
import net.mcreator.ranahiromod.client.renderer.VazafilaRenderer;
import net.mcreator.ranahiromod.client.renderer.UndefinedZombieRenderer;
import net.mcreator.ranahiromod.client.renderer.UndefinedWitchRenderer;
import net.mcreator.ranahiromod.client.renderer.UndefinedSkeletonRenderer;
import net.mcreator.ranahiromod.client.renderer.UndefinedGhastRenderer;
import net.mcreator.ranahiromod.client.renderer.UndefinedCreeperRenderer;
import net.mcreator.ranahiromod.client.renderer.TaichanRenderer;
import net.mcreator.ranahiromod.client.renderer.TaichanBowProjectileRenderer;
import net.mcreator.ranahiromod.client.renderer.SweepRenderer;
import net.mcreator.ranahiromod.client.renderer.SpladotRenderer;
import net.mcreator.ranahiromod.client.renderer.SeahouseNightmareRenderer;
import net.mcreator.ranahiromod.client.renderer.SKLiner5077Renderer;
import net.mcreator.ranahiromod.client.renderer.PirokichihawaiiRenderer;
import net.mcreator.ranahiromod.client.renderer.PhotonShotProjectileRenderer;
import net.mcreator.ranahiromod.client.renderer.PhotonServantRenderer;
import net.mcreator.ranahiromod.client.renderer.PhotonSeekerProjectileRenderer;
import net.mcreator.ranahiromod.client.renderer.OnihiroRenderer;
import net.mcreator.ranahiromod.client.renderer.NightmareVazafilaRenderer;
import net.mcreator.ranahiromod.client.renderer.NightmareRanahiroRenderer;
import net.mcreator.ranahiromod.client.renderer.NightmareMottieRenderer;
import net.mcreator.ranahiromod.client.renderer.Mottie07172Renderer;
import net.mcreator.ranahiromod.client.renderer.MochiMeteoRenderer;
import net.mcreator.ranahiromod.client.renderer.MinerSkeletonRenderer;
import net.mcreator.ranahiromod.client.renderer.Melamain0105Renderer;
import net.mcreator.ranahiromod.client.renderer.Maruchi100Renderer;
import net.mcreator.ranahiromod.client.renderer.LavanicalTrackerRenderer;
import net.mcreator.ranahiromod.client.renderer.LavanicBreakerRenderer;
import net.mcreator.ranahiromod.client.renderer.LavahiroRenderer;
import net.mcreator.ranahiromod.client.renderer.KnightOfLightningRenderer;
import net.mcreator.ranahiromod.client.renderer.HypocriteRenderer;
import net.mcreator.ranahiromod.client.renderer.HIROMARUTVRenderer;
import net.mcreator.ranahiromod.client.renderer.GroundhiroRenderer;
import net.mcreator.ranahiromod.client.renderer.GodTaichanRenderer;
import net.mcreator.ranahiromod.client.renderer.GodRanahiroRenderer;
import net.mcreator.ranahiromod.client.renderer.GeneralWitherSkeletonRenderer;
import net.mcreator.ranahiromod.client.renderer.GeneralSkeletonRenderer;
import net.mcreator.ranahiromod.client.renderer.GaleSlasherRenderer;
import net.mcreator.ranahiromod.client.renderer.GachaRenderer;
import net.mcreator.ranahiromod.client.renderer.FossilaoiRenderer;
import net.mcreator.ranahiromod.client.renderer.FairySpiritRenderer;
import net.mcreator.ranahiromod.client.renderer.EpicDownZombieRenderer;
import net.mcreator.ranahiromod.client.renderer.EpicDownSkeletonRenderer;
import net.mcreator.ranahiromod.client.renderer.EpicDownEndermanRenderer;
import net.mcreator.ranahiromod.client.renderer.EpicDownCreeperRenderer;
import net.mcreator.ranahiromod.client.renderer.EpicDownBlazeRenderer;
import net.mcreator.ranahiromod.client.renderer.EntitySummonerUpdateMarkerRenderer;
import net.mcreator.ranahiromod.client.renderer.EntityRedRenderer;
import net.mcreator.ranahiromod.client.renderer.EntityDomainExpansionRenderer;
import net.mcreator.ranahiromod.client.renderer.EntityBlueRenderer;
import net.mcreator.ranahiromod.client.renderer.DragonhiroRenderer;
import net.mcreator.ranahiromod.client.renderer.DragonhiroKnightRenderer;
import net.mcreator.ranahiromod.client.renderer.DebugSummonRenderer;
import net.mcreator.ranahiromod.client.renderer.BresoldierRenderer;
import net.mcreator.ranahiromod.client.renderer.BosshiroRenderer;
import net.mcreator.ranahiromod.client.renderer.Bosshiro3CodePhoenixRenderer;
import net.mcreator.ranahiromod.client.renderer.Bosshiro2Renderer;
import net.mcreator.ranahiromod.client.renderer.BolthiroRenderer;
import net.mcreator.ranahiromod.client.renderer.BigRanahiroRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class RanahiromodModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(RanahiromodModEntities.WATERHIRO.get(), WaterhiroRenderer::new);
		event.registerEntityRenderer(RanahiromodModEntities.WINDHIRO.get(), WindhiroRenderer::new);
		event.registerEntityRenderer(RanahiromodModEntities.DRAGONHIRO.get(), DragonhiroRenderer::new);
		event.registerEntityRenderer(RanahiromodModEntities.ONIHIRO.get(), OnihiroRenderer::new);
		event.registerEntityRenderer(RanahiromodModEntities.GOD_RANAHIRO.get(), GodRanahiroRenderer::new);
		event.registerEntityRenderer(RanahiromodModEntities.GOD_TAICHAN.get(), GodTaichanRenderer::new);
		event.registerEntityRenderer(RanahiromodModEntities.BOSSHIRO.get(), BosshiroRenderer::new);
		event.registerEntityRenderer(RanahiromodModEntities.WARDENHIRO.get(), WardenhiroRenderer::new);
		event.registerEntityRenderer(RanahiromodModEntities.FOSSILAOI.get(), FossilaoiRenderer::new);
		event.registerEntityRenderer(RanahiromodModEntities.GACHA.get(), GachaRenderer::new);
		event.registerEntityRenderer(RanahiromodModEntities.BOLTHIRO.get(), BolthiroRenderer::new);
		event.registerEntityRenderer(RanahiromodModEntities.WATER_DRAGON.get(), WaterDragonRenderer::new);
		event.registerEntityRenderer(RanahiromodModEntities.MOCHI_METEOR.get(), MochiMeteoRenderer::new);
		event.registerEntityRenderer(RanahiromodModEntities.MOTTIE_0717.get(), Mottie07172Renderer::new);
		event.registerEntityRenderer(RanahiromodModEntities.SK_LINER_5077.get(), SKLiner5077Renderer::new);
		event.registerEntityRenderer(RanahiromodModEntities.VAZAFILA.get(), VazafilaRenderer::new);
		event.registerEntityRenderer(RanahiromodModEntities.WARDEN_HAND.get(), WardenHandRenderer::new);
		event.registerEntityRenderer(RanahiromodModEntities.PHOTON_SERVANT.get(), PhotonServantRenderer::new);
		event.registerEntityRenderer(RanahiromodModEntities.BOSSHIRO_2.get(), Bosshiro2Renderer::new);
		event.registerEntityRenderer(RanahiromodModEntities.PIROKICHIHAWAII.get(), PirokichihawaiiRenderer::new);
		event.registerEntityRenderer(RanahiromodModEntities.EPIC_DOWN_ZOMBIE.get(), EpicDownZombieRenderer::new);
		event.registerEntityRenderer(RanahiromodModEntities.LAVANICAL_GOLEM.get(), LavanicBreakerRenderer::new);
		event.registerEntityRenderer(RanahiromodModEntities.YUU_2434.get(), Maruchi100Renderer::new);
		event.registerEntityRenderer(RanahiromodModEntities.MELAMAIN_0105.get(), Melamain0105Renderer::new);
		event.registerEntityRenderer(RanahiromodModEntities.NIGHTMARE_RANAHIRO.get(), NightmareRanahiroRenderer::new);
		event.registerEntityRenderer(RanahiromodModEntities.NIGHTMARE_VAZAFILA.get(), NightmareVazafilaRenderer::new);
		event.registerEntityRenderer(RanahiromodModEntities.NIGHTMARE_MOTTIE.get(), NightmareMottieRenderer::new);
		event.registerEntityRenderer(RanahiromodModEntities.BOSSHIRO_3_CODE_PHOENIX.get(), Bosshiro3CodePhoenixRenderer::new);
		event.registerEntityRenderer(RanahiromodModEntities.GROUNDHIRO.get(), GroundhiroRenderer::new);
		event.registerEntityRenderer(RanahiromodModEntities.EPIC_DOWN_SKELETON.get(), EpicDownSkeletonRenderer::new);
		event.registerEntityRenderer(RanahiromodModEntities.MINER_SKELETON.get(), MinerSkeletonRenderer::new);
		event.registerEntityRenderer(RanahiromodModEntities.DRAGONHIRO_KNIGHT.get(), DragonhiroKnightRenderer::new);
		event.registerEntityRenderer(RanahiromodModEntities.SEAHOUSE_NIGHTMARE.get(), SeahouseNightmareRenderer::new);
		event.registerEntityRenderer(RanahiromodModEntities.GALE_SLASHER.get(), GaleSlasherRenderer::new);
		event.registerEntityRenderer(RanahiromodModEntities.BRESOLDIER.get(), BresoldierRenderer::new);
		event.registerEntityRenderer(RanahiromodModEntities.LAVAHIRO.get(), LavahiroRenderer::new);
		event.registerEntityRenderer(RanahiromodModEntities.GENERAL_SKELETON.get(), GeneralSkeletonRenderer::new);
		event.registerEntityRenderer(RanahiromodModEntities.GENERAL_WITHER_SKELETON.get(), GeneralWitherSkeletonRenderer::new);
		event.registerEntityRenderer(RanahiromodModEntities.EPIC_DOWN_CREEPER.get(), EpicDownCreeperRenderer::new);
		event.registerEntityRenderer(RanahiromodModEntities.HYPOCRITE.get(), HypocriteRenderer::new);
		event.registerEntityRenderer(RanahiromodModEntities.SWEEP.get(), SweepRenderer::new);
		event.registerEntityRenderer(RanahiromodModEntities.SPLADOT.get(), SpladotRenderer::new);
		event.registerEntityRenderer(RanahiromodModEntities.HIROMARUTV.get(), HIROMARUTVRenderer::new);
		event.registerEntityRenderer(RanahiromodModEntities.DEBUG_SUMMON.get(), DebugSummonRenderer::new);
		event.registerEntityRenderer(RanahiromodModEntities.EPIC_DOWN_ENDERMAN.get(), EpicDownEndermanRenderer::new);
		event.registerEntityRenderer(RanahiromodModEntities.KNIGHT_OF_LIGHTNING.get(), KnightOfLightningRenderer::new);
		event.registerEntityRenderer(RanahiromodModEntities.TAICHAN.get(), TaichanRenderer::new);
		event.registerEntityRenderer(RanahiromodModEntities.EPIC_DOWN_BLAZE.get(), EpicDownBlazeRenderer::new);
		event.registerEntityRenderer(RanahiromodModEntities.LAVANICAL_TRACKER.get(), LavanicalTrackerRenderer::new);
		event.registerEntityRenderer(RanahiromodModEntities.ENTITY_BLUE.get(), EntityBlueRenderer::new);
		event.registerEntityRenderer(RanahiromodModEntities.ENTITY_RED.get(), EntityRedRenderer::new);
		event.registerEntityRenderer(RanahiromodModEntities.UNDEFINED_CREEPER.get(), UndefinedCreeperRenderer::new);
		event.registerEntityRenderer(RanahiromodModEntities.UNDEFINED_ZOMBIE.get(), UndefinedZombieRenderer::new);
		event.registerEntityRenderer(RanahiromodModEntities.UNDEFINED_SKELETON.get(), UndefinedSkeletonRenderer::new);
		event.registerEntityRenderer(RanahiromodModEntities.UNDEFINED_GHAST.get(), UndefinedGhastRenderer::new);
		event.registerEntityRenderer(RanahiromodModEntities.UNDEFINED_GHAST_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(RanahiromodModEntities.UNDEFINED_WITCH.get(), UndefinedWitchRenderer::new);
		event.registerEntityRenderer(RanahiromodModEntities.ENTITY_DOMAIN_EXPANSION.get(), EntityDomainExpansionRenderer::new);
		event.registerEntityRenderer(RanahiromodModEntities.MOCHI_BULLET_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(RanahiromodModEntities.MOCHI_EXPLODE_BULLET_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(RanahiromodModEntities.PHOTON_SEEKER_PROJECTILE.get(), PhotonSeekerProjectileRenderer::new);
		event.registerEntityRenderer(RanahiromodModEntities.PHOTON_SHOT_PROJECTILE.get(), PhotonShotProjectileRenderer::new);
		event.registerEntityRenderer(RanahiromodModEntities.UNDEFINED_GUN_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(RanahiromodModEntities.MELAMAIN_3RD_AMMO_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(RanahiromodModEntities.FARION_GUN_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(RanahiromodModEntities.FARION_GUN_1_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(RanahiromodModEntities.FARION_GUN_2_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(RanahiromodModEntities.FARION_GUN_3_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(RanahiromodModEntities.MONEY_BULLET_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(RanahiromodModEntities.ENERGY_RIFLE_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(RanahiromodModEntities.IRON_PICKAXE_BULLET_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(RanahiromodModEntities.TAICHAN_BOW_PROJECTILE.get(), TaichanBowProjectileRenderer::new);
		event.registerEntityRenderer(RanahiromodModEntities.FARION_GUN_NULL_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(RanahiromodModEntities.BIG_RANAHIRO.get(), BigRanahiroRenderer::new);
		event.registerEntityRenderer(RanahiromodModEntities.FAIRY_SPIRIT.get(), FairySpiritRenderer::new);
		event.registerEntityRenderer(RanahiromodModEntities.ENTITY_SUMMONER_UPDATE_MARKER.get(), EntitySummonerUpdateMarkerRenderer::new);
	}
}
