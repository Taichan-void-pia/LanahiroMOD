
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ranahiromod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.ranahiromod.entity.WindhiroEntity;
import net.mcreator.ranahiromod.entity.WaterhiroEntity;
import net.mcreator.ranahiromod.entity.WaterDragonEntity;
import net.mcreator.ranahiromod.entity.WardenhiroEntity;
import net.mcreator.ranahiromod.entity.WardenHandEntity;
import net.mcreator.ranahiromod.entity.VazafilaEntity;
import net.mcreator.ranahiromod.entity.UndefinedZombieEntity;
import net.mcreator.ranahiromod.entity.UndefinedWitchEntity;
import net.mcreator.ranahiromod.entity.UndefinedSkeletonEntity;
import net.mcreator.ranahiromod.entity.UndefinedGunProjectileEntity;
import net.mcreator.ranahiromod.entity.UndefinedGhastEntityProjectile;
import net.mcreator.ranahiromod.entity.UndefinedGhastEntity;
import net.mcreator.ranahiromod.entity.UndefinedCreeperEntity;
import net.mcreator.ranahiromod.entity.TaichanEntity;
import net.mcreator.ranahiromod.entity.TaichanBowProjectileEntity;
import net.mcreator.ranahiromod.entity.SweepEntity;
import net.mcreator.ranahiromod.entity.SpladotEntity;
import net.mcreator.ranahiromod.entity.SeahouseNightmareEntity;
import net.mcreator.ranahiromod.entity.SKLiner5077Entity;
import net.mcreator.ranahiromod.entity.PirokichihawaiiEntity;
import net.mcreator.ranahiromod.entity.PhotonShotProjectileEntity;
import net.mcreator.ranahiromod.entity.PhotonServantEntity;
import net.mcreator.ranahiromod.entity.PhotonSeekerProjectileEntity;
import net.mcreator.ranahiromod.entity.OnihiroEntity;
import net.mcreator.ranahiromod.entity.NightmareVazafilaEntity;
import net.mcreator.ranahiromod.entity.NightmareRanahiroEntity;
import net.mcreator.ranahiromod.entity.NightmareMottieEntity;
import net.mcreator.ranahiromod.entity.Mottie07172Entity;
import net.mcreator.ranahiromod.entity.MoneyBulletProjectileEntity;
import net.mcreator.ranahiromod.entity.MochiMeteoEntity;
import net.mcreator.ranahiromod.entity.MochiExplodeBulletProjectileEntity;
import net.mcreator.ranahiromod.entity.MochiBulletProjectileEntity;
import net.mcreator.ranahiromod.entity.MinerSkeletonEntity;
import net.mcreator.ranahiromod.entity.Melamain3rdAmmoProjectileEntity;
import net.mcreator.ranahiromod.entity.Melamain0105Entity;
import net.mcreator.ranahiromod.entity.Maruchi100Entity;
import net.mcreator.ranahiromod.entity.LavanicalTrackerEntity;
import net.mcreator.ranahiromod.entity.LavanicBreakerEntity;
import net.mcreator.ranahiromod.entity.LavahiroEntity;
import net.mcreator.ranahiromod.entity.KnightOfLightningEntity;
import net.mcreator.ranahiromod.entity.IronPickaxeBulletProjectileEntity;
import net.mcreator.ranahiromod.entity.HypocriteEntity;
import net.mcreator.ranahiromod.entity.HIROMARUTVEntity;
import net.mcreator.ranahiromod.entity.GroundhiroEntity;
import net.mcreator.ranahiromod.entity.GodTaichanEntity;
import net.mcreator.ranahiromod.entity.GodRanahiroEntity;
import net.mcreator.ranahiromod.entity.GeneralWitherSkeletonEntity;
import net.mcreator.ranahiromod.entity.GeneralSkeletonEntity;
import net.mcreator.ranahiromod.entity.GaleSlasherEntity;
import net.mcreator.ranahiromod.entity.GachaEntity;
import net.mcreator.ranahiromod.entity.FossilaoiEntity;
import net.mcreator.ranahiromod.entity.FarionGunProjectileEntity;
import net.mcreator.ranahiromod.entity.FarionGunNullProjectileEntity;
import net.mcreator.ranahiromod.entity.FarionGun3ProjectileEntity;
import net.mcreator.ranahiromod.entity.FarionGun2ProjectileEntity;
import net.mcreator.ranahiromod.entity.FarionGun1ProjectileEntity;
import net.mcreator.ranahiromod.entity.FairySpiritEntity;
import net.mcreator.ranahiromod.entity.EpicDownZombieEntity;
import net.mcreator.ranahiromod.entity.EpicDownSkeletonEntity;
import net.mcreator.ranahiromod.entity.EpicDownEndermanEntity;
import net.mcreator.ranahiromod.entity.EpicDownCreeperEntity;
import net.mcreator.ranahiromod.entity.EpicDownBlazeEntity;
import net.mcreator.ranahiromod.entity.EntitySummonerUpdateMarkerEntity;
import net.mcreator.ranahiromod.entity.EntityRedEntity;
import net.mcreator.ranahiromod.entity.EntityDomainExpansionEntity;
import net.mcreator.ranahiromod.entity.EntityBlueEntity;
import net.mcreator.ranahiromod.entity.EnergyRifleProjectileEntity;
import net.mcreator.ranahiromod.entity.DragonhiroKnightEntity;
import net.mcreator.ranahiromod.entity.DragonhiroEntity;
import net.mcreator.ranahiromod.entity.DebugSummonEntity;
import net.mcreator.ranahiromod.entity.BresoldierEntity;
import net.mcreator.ranahiromod.entity.BosshiroEntity;
import net.mcreator.ranahiromod.entity.Bosshiro3CodePhoenixEntity;
import net.mcreator.ranahiromod.entity.Bosshiro2Entity;
import net.mcreator.ranahiromod.entity.BolthiroEntity;
import net.mcreator.ranahiromod.entity.BigRanahiroEntity;
import net.mcreator.ranahiromod.RanahiromodMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RanahiromodModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, RanahiromodMod.MODID);
	public static final RegistryObject<EntityType<WaterhiroEntity>> WATERHIRO = register("waterhiro",
			EntityType.Builder.<WaterhiroEntity>of(WaterhiroEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(WaterhiroEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<WindhiroEntity>> WINDHIRO = register("windhiro",
			EntityType.Builder.<WindhiroEntity>of(WindhiroEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(WindhiroEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DragonhiroEntity>> DRAGONHIRO = register("dragonhiro",
			EntityType.Builder.<DragonhiroEntity>of(DragonhiroEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DragonhiroEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<OnihiroEntity>> ONIHIRO = register("onihiro",
			EntityType.Builder.<OnihiroEntity>of(OnihiroEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(OnihiroEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GodRanahiroEntity>> GOD_RANAHIRO = register("god_ranahiro", EntityType.Builder.<GodRanahiroEntity>of(GodRanahiroEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GodRanahiroEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GodTaichanEntity>> GOD_TAICHAN = register("god_taichan", EntityType.Builder.<GodTaichanEntity>of(GodTaichanEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).setCustomClientFactory(GodTaichanEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BosshiroEntity>> BOSSHIRO = register("bosshiro",
			EntityType.Builder.<BosshiroEntity>of(BosshiroEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BosshiroEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<WardenhiroEntity>> WARDENHIRO = register("wardenhiro",
			EntityType.Builder.<WardenhiroEntity>of(WardenhiroEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(WardenhiroEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FossilaoiEntity>> FOSSILAOI = register("fossilaoi",
			EntityType.Builder.<FossilaoiEntity>of(FossilaoiEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FossilaoiEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GachaEntity>> GACHA = register("gacha",
			EntityType.Builder.<GachaEntity>of(GachaEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GachaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BolthiroEntity>> BOLTHIRO = register("bolthiro",
			EntityType.Builder.<BolthiroEntity>of(BolthiroEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BolthiroEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<WaterDragonEntity>> WATER_DRAGON = register("water_dragon", EntityType.Builder.<WaterDragonEntity>of(WaterDragonEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(WaterDragonEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MochiMeteoEntity>> MOCHI_METEOR = register("mochi_meteor",
			EntityType.Builder.<MochiMeteoEntity>of(MochiMeteoEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MochiMeteoEntity::new).fireImmune().sized(5f, 5f));
	public static final RegistryObject<EntityType<Mottie07172Entity>> MOTTIE_0717 = register("mottie_0717",
			EntityType.Builder.<Mottie07172Entity>of(Mottie07172Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Mottie07172Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SKLiner5077Entity>> SK_LINER_5077 = register("sk_liner_5077",
			EntityType.Builder.<SKLiner5077Entity>of(SKLiner5077Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SKLiner5077Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<VazafilaEntity>> VAZAFILA = register("vazafila",
			EntityType.Builder.<VazafilaEntity>of(VazafilaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(VazafilaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<WardenHandEntity>> WARDEN_HAND = register("warden_hand", EntityType.Builder.<WardenHandEntity>of(WardenHandEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).setCustomClientFactory(WardenHandEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PhotonServantEntity>> PHOTON_SERVANT = register("photon_servant",
			EntityType.Builder.<PhotonServantEntity>of(PhotonServantEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PhotonServantEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Bosshiro2Entity>> BOSSHIRO_2 = register("bosshiro_2", EntityType.Builder.<Bosshiro2Entity>of(Bosshiro2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).setCustomClientFactory(Bosshiro2Entity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PirokichihawaiiEntity>> PIROKICHIHAWAII = register("pirokichihawaii",
			EntityType.Builder.<PirokichihawaiiEntity>of(PirokichihawaiiEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PirokichihawaiiEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EpicDownZombieEntity>> EPIC_DOWN_ZOMBIE = register("epic_down_zombie",
			EntityType.Builder.<EpicDownZombieEntity>of(EpicDownZombieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EpicDownZombieEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<LavanicBreakerEntity>> LAVANICAL_GOLEM = register("lavanical_golem", EntityType.Builder.<LavanicBreakerEntity>of(LavanicBreakerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LavanicBreakerEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Maruchi100Entity>> YUU_2434 = register("yuu_2434",
			EntityType.Builder.<Maruchi100Entity>of(Maruchi100Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Maruchi100Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Melamain0105Entity>> MELAMAIN_0105 = register("melamain_0105",
			EntityType.Builder.<Melamain0105Entity>of(Melamain0105Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Melamain0105Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<NightmareRanahiroEntity>> NIGHTMARE_RANAHIRO = register("nightmare_ranahiro", EntityType.Builder.<NightmareRanahiroEntity>of(NightmareRanahiroEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NightmareRanahiroEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<NightmareVazafilaEntity>> NIGHTMARE_VAZAFILA = register("nightmare_vazafila", EntityType.Builder.<NightmareVazafilaEntity>of(NightmareVazafilaEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NightmareVazafilaEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<NightmareMottieEntity>> NIGHTMARE_MOTTIE = register("nightmare_mottie", EntityType.Builder.<NightmareMottieEntity>of(NightmareMottieEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NightmareMottieEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Bosshiro3CodePhoenixEntity>> BOSSHIRO_3_CODE_PHOENIX = register("bosshiro_3_code_phoenix", EntityType.Builder.<Bosshiro3CodePhoenixEntity>of(Bosshiro3CodePhoenixEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Bosshiro3CodePhoenixEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GroundhiroEntity>> GROUNDHIRO = register("groundhiro", EntityType.Builder.<GroundhiroEntity>of(GroundhiroEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).setCustomClientFactory(GroundhiroEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EpicDownSkeletonEntity>> EPIC_DOWN_SKELETON = register("epic_down_skeleton",
			EntityType.Builder.<EpicDownSkeletonEntity>of(EpicDownSkeletonEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EpicDownSkeletonEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MinerSkeletonEntity>> MINER_SKELETON = register("miner_skeleton",
			EntityType.Builder.<MinerSkeletonEntity>of(MinerSkeletonEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MinerSkeletonEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DragonhiroKnightEntity>> DRAGONHIRO_KNIGHT = register("dragonhiro_knight",
			EntityType.Builder.<DragonhiroKnightEntity>of(DragonhiroKnightEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DragonhiroKnightEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SeahouseNightmareEntity>> SEAHOUSE_NIGHTMARE = register("seahouse_nightmare",
			EntityType.Builder.<SeahouseNightmareEntity>of(SeahouseNightmareEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SeahouseNightmareEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GaleSlasherEntity>> GALE_SLASHER = register("gale_slasher",
			EntityType.Builder.<GaleSlasherEntity>of(GaleSlasherEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GaleSlasherEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BresoldierEntity>> BRESOLDIER = register("bresoldier",
			EntityType.Builder.<BresoldierEntity>of(BresoldierEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BresoldierEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<LavahiroEntity>> LAVAHIRO = register("lavahiro",
			EntityType.Builder.<LavahiroEntity>of(LavahiroEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LavahiroEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GeneralSkeletonEntity>> GENERAL_SKELETON = register("general_skeleton",
			EntityType.Builder.<GeneralSkeletonEntity>of(GeneralSkeletonEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GeneralSkeletonEntity::new)

					.sized(2f, 3f));
	public static final RegistryObject<EntityType<GeneralWitherSkeletonEntity>> GENERAL_WITHER_SKELETON = register("general_wither_skeleton", EntityType.Builder.<GeneralWitherSkeletonEntity>of(GeneralWitherSkeletonEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GeneralWitherSkeletonEntity::new).fireImmune().sized(2f, 3f));
	public static final RegistryObject<EntityType<EpicDownCreeperEntity>> EPIC_DOWN_CREEPER = register("epic_down_creeper",
			EntityType.Builder.<EpicDownCreeperEntity>of(EpicDownCreeperEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EpicDownCreeperEntity::new)

					.sized(0.6f, 1.7f));
	public static final RegistryObject<EntityType<HypocriteEntity>> HYPOCRITE = register("hypocrite",
			EntityType.Builder.<HypocriteEntity>of(HypocriteEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HypocriteEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SweepEntity>> SWEEP = register("sweep",
			EntityType.Builder.<SweepEntity>of(SweepEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SweepEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SpladotEntity>> SPLADOT = register("spladot",
			EntityType.Builder.<SpladotEntity>of(SpladotEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SpladotEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HIROMARUTVEntity>> HIROMARUTV = register("hiromarutv",
			EntityType.Builder.<HIROMARUTVEntity>of(HIROMARUTVEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HIROMARUTVEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DebugSummonEntity>> DEBUG_SUMMON = register("debug_summon", EntityType.Builder.<DebugSummonEntity>of(DebugSummonEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DebugSummonEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EpicDownEndermanEntity>> EPIC_DOWN_ENDERMAN = register("epic_down_enderman",
			EntityType.Builder.<EpicDownEndermanEntity>of(EpicDownEndermanEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EpicDownEndermanEntity::new)

					.sized(0.6f, 3f));
	public static final RegistryObject<EntityType<KnightOfLightningEntity>> KNIGHT_OF_LIGHTNING = register("knight_of_lightning", EntityType.Builder.<KnightOfLightningEntity>of(KnightOfLightningEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(KnightOfLightningEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TaichanEntity>> TAICHAN = register("taichan",
			EntityType.Builder.<TaichanEntity>of(TaichanEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TaichanEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EpicDownBlazeEntity>> EPIC_DOWN_BLAZE = register("epic_down_blaze", EntityType.Builder.<EpicDownBlazeEntity>of(EpicDownBlazeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EpicDownBlazeEntity::new).fireImmune().sized(0.6f, 3f));
	public static final RegistryObject<EntityType<LavanicalTrackerEntity>> LAVANICAL_TRACKER = register("lavanical_tracker", EntityType.Builder.<LavanicalTrackerEntity>of(LavanicalTrackerEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LavanicalTrackerEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EntityBlueEntity>> ENTITY_BLUE = register("entity_blue", EntityType.Builder.<EntityBlueEntity>of(EntityBlueEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).setCustomClientFactory(EntityBlueEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EntityRedEntity>> ENTITY_RED = register("entity_red", EntityType.Builder.<EntityRedEntity>of(EntityRedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).setCustomClientFactory(EntityRedEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<UndefinedCreeperEntity>> UNDEFINED_CREEPER = register("undefined_creeper", EntityType.Builder.<UndefinedCreeperEntity>of(UndefinedCreeperEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(UndefinedCreeperEntity::new).fireImmune().sized(0.6f, 1.7f));
	public static final RegistryObject<EntityType<UndefinedZombieEntity>> UNDEFINED_ZOMBIE = register("undefined_zombie", EntityType.Builder.<UndefinedZombieEntity>of(UndefinedZombieEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(UndefinedZombieEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<UndefinedSkeletonEntity>> UNDEFINED_SKELETON = register("undefined_skeleton", EntityType.Builder.<UndefinedSkeletonEntity>of(UndefinedSkeletonEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(UndefinedSkeletonEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<UndefinedGhastEntity>> UNDEFINED_GHAST = register("undefined_ghast", EntityType.Builder.<UndefinedGhastEntity>of(UndefinedGhastEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(UndefinedGhastEntity::new).fireImmune().sized(1f, 1f));
	public static final RegistryObject<EntityType<UndefinedGhastEntityProjectile>> UNDEFINED_GHAST_PROJECTILE = register("projectile_undefined_ghast",
			EntityType.Builder.<UndefinedGhastEntityProjectile>of(UndefinedGhastEntityProjectile::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1)
					.setCustomClientFactory(UndefinedGhastEntityProjectile::new).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<UndefinedWitchEntity>> UNDEFINED_WITCH = register("undefined_witch", EntityType.Builder.<UndefinedWitchEntity>of(UndefinedWitchEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(UndefinedWitchEntity::new).fireImmune().sized(0.6f, 1.95f));
	public static final RegistryObject<EntityType<EntityDomainExpansionEntity>> ENTITY_DOMAIN_EXPANSION = register("entity_domain_expansion", EntityType.Builder.<EntityDomainExpansionEntity>of(EntityDomainExpansionEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EntityDomainExpansionEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MochiBulletProjectileEntity>> MOCHI_BULLET_PROJECTILE = register("mochi_bullet_projectile", EntityType.Builder.<MochiBulletProjectileEntity>of(MochiBulletProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(MochiBulletProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<MochiExplodeBulletProjectileEntity>> MOCHI_EXPLODE_BULLET_PROJECTILE = register("mochi_explode_bullet_projectile",
			EntityType.Builder.<MochiExplodeBulletProjectileEntity>of(MochiExplodeBulletProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(MochiExplodeBulletProjectileEntity::new).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<PhotonSeekerProjectileEntity>> PHOTON_SEEKER_PROJECTILE = register("photon_seeker_projectile", EntityType.Builder.<PhotonSeekerProjectileEntity>of(PhotonSeekerProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(PhotonSeekerProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<PhotonShotProjectileEntity>> PHOTON_SHOT_PROJECTILE = register("photon_shot_projectile", EntityType.Builder.<PhotonShotProjectileEntity>of(PhotonShotProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(PhotonShotProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<UndefinedGunProjectileEntity>> UNDEFINED_GUN_PROJECTILE = register("undefined_gun_projectile", EntityType.Builder.<UndefinedGunProjectileEntity>of(UndefinedGunProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(UndefinedGunProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<Melamain3rdAmmoProjectileEntity>> MELAMAIN_3RD_AMMO_PROJECTILE = register("melamain_3rd_ammo_projectile",
			EntityType.Builder.<Melamain3rdAmmoProjectileEntity>of(Melamain3rdAmmoProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(Melamain3rdAmmoProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<FarionGunProjectileEntity>> FARION_GUN_PROJECTILE = register("farion_gun_projectile", EntityType.Builder.<FarionGunProjectileEntity>of(FarionGunProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(FarionGunProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<FarionGun1ProjectileEntity>> FARION_GUN_1_PROJECTILE = register("farion_gun_1_projectile", EntityType.Builder.<FarionGun1ProjectileEntity>of(FarionGun1ProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(FarionGun1ProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<FarionGun2ProjectileEntity>> FARION_GUN_2_PROJECTILE = register("farion_gun_2_projectile", EntityType.Builder.<FarionGun2ProjectileEntity>of(FarionGun2ProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(FarionGun2ProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<FarionGun3ProjectileEntity>> FARION_GUN_3_PROJECTILE = register("farion_gun_3_projectile", EntityType.Builder.<FarionGun3ProjectileEntity>of(FarionGun3ProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(FarionGun3ProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<MoneyBulletProjectileEntity>> MONEY_BULLET_PROJECTILE = register("money_bullet_projectile", EntityType.Builder.<MoneyBulletProjectileEntity>of(MoneyBulletProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(MoneyBulletProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<EnergyRifleProjectileEntity>> ENERGY_RIFLE_PROJECTILE = register("energy_rifle_projectile", EntityType.Builder.<EnergyRifleProjectileEntity>of(EnergyRifleProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(EnergyRifleProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<IronPickaxeBulletProjectileEntity>> IRON_PICKAXE_BULLET_PROJECTILE = register("iron_pickaxe_bullet_projectile",
			EntityType.Builder.<IronPickaxeBulletProjectileEntity>of(IronPickaxeBulletProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(IronPickaxeBulletProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<TaichanBowProjectileEntity>> TAICHAN_BOW_PROJECTILE = register("taichan_bow_projectile", EntityType.Builder.<TaichanBowProjectileEntity>of(TaichanBowProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(TaichanBowProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<FarionGunNullProjectileEntity>> FARION_GUN_NULL_PROJECTILE = register("farion_gun_null_projectile",
			EntityType.Builder.<FarionGunNullProjectileEntity>of(FarionGunNullProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(FarionGunNullProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BigRanahiroEntity>> BIG_RANAHIRO = register("big_ranahiro",
			EntityType.Builder.<BigRanahiroEntity>of(BigRanahiroEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BigRanahiroEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FairySpiritEntity>> FAIRY_SPIRIT = register("fairy_spirit", EntityType.Builder.<FairySpiritEntity>of(FairySpiritEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FairySpiritEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EntitySummonerUpdateMarkerEntity>> ENTITY_SUMMONER_UPDATE_MARKER = register("entity_summoner_update_marker",
			EntityType.Builder.<EntitySummonerUpdateMarkerEntity>of(EntitySummonerUpdateMarkerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(EntitySummonerUpdateMarkerEntity::new).fireImmune().sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			WaterhiroEntity.init();
			WindhiroEntity.init();
			DragonhiroEntity.init();
			OnihiroEntity.init();
			GodRanahiroEntity.init();
			GodTaichanEntity.init();
			BosshiroEntity.init();
			WardenhiroEntity.init();
			FossilaoiEntity.init();
			GachaEntity.init();
			BolthiroEntity.init();
			WaterDragonEntity.init();
			MochiMeteoEntity.init();
			Mottie07172Entity.init();
			SKLiner5077Entity.init();
			VazafilaEntity.init();
			WardenHandEntity.init();
			PhotonServantEntity.init();
			Bosshiro2Entity.init();
			PirokichihawaiiEntity.init();
			EpicDownZombieEntity.init();
			LavanicBreakerEntity.init();
			Maruchi100Entity.init();
			Melamain0105Entity.init();
			NightmareRanahiroEntity.init();
			NightmareVazafilaEntity.init();
			NightmareMottieEntity.init();
			Bosshiro3CodePhoenixEntity.init();
			GroundhiroEntity.init();
			EpicDownSkeletonEntity.init();
			MinerSkeletonEntity.init();
			DragonhiroKnightEntity.init();
			SeahouseNightmareEntity.init();
			GaleSlasherEntity.init();
			BresoldierEntity.init();
			LavahiroEntity.init();
			GeneralSkeletonEntity.init();
			GeneralWitherSkeletonEntity.init();
			EpicDownCreeperEntity.init();
			HypocriteEntity.init();
			SweepEntity.init();
			SpladotEntity.init();
			HIROMARUTVEntity.init();
			DebugSummonEntity.init();
			EpicDownEndermanEntity.init();
			KnightOfLightningEntity.init();
			TaichanEntity.init();
			EpicDownBlazeEntity.init();
			LavanicalTrackerEntity.init();
			EntityBlueEntity.init();
			EntityRedEntity.init();
			UndefinedCreeperEntity.init();
			UndefinedZombieEntity.init();
			UndefinedSkeletonEntity.init();
			UndefinedGhastEntity.init();
			UndefinedWitchEntity.init();
			EntityDomainExpansionEntity.init();
			BigRanahiroEntity.init();
			FairySpiritEntity.init();
			EntitySummonerUpdateMarkerEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(WATERHIRO.get(), WaterhiroEntity.createAttributes().build());
		event.put(WINDHIRO.get(), WindhiroEntity.createAttributes().build());
		event.put(DRAGONHIRO.get(), DragonhiroEntity.createAttributes().build());
		event.put(ONIHIRO.get(), OnihiroEntity.createAttributes().build());
		event.put(GOD_RANAHIRO.get(), GodRanahiroEntity.createAttributes().build());
		event.put(GOD_TAICHAN.get(), GodTaichanEntity.createAttributes().build());
		event.put(BOSSHIRO.get(), BosshiroEntity.createAttributes().build());
		event.put(WARDENHIRO.get(), WardenhiroEntity.createAttributes().build());
		event.put(FOSSILAOI.get(), FossilaoiEntity.createAttributes().build());
		event.put(GACHA.get(), GachaEntity.createAttributes().build());
		event.put(BOLTHIRO.get(), BolthiroEntity.createAttributes().build());
		event.put(WATER_DRAGON.get(), WaterDragonEntity.createAttributes().build());
		event.put(MOCHI_METEOR.get(), MochiMeteoEntity.createAttributes().build());
		event.put(MOTTIE_0717.get(), Mottie07172Entity.createAttributes().build());
		event.put(SK_LINER_5077.get(), SKLiner5077Entity.createAttributes().build());
		event.put(VAZAFILA.get(), VazafilaEntity.createAttributes().build());
		event.put(WARDEN_HAND.get(), WardenHandEntity.createAttributes().build());
		event.put(PHOTON_SERVANT.get(), PhotonServantEntity.createAttributes().build());
		event.put(BOSSHIRO_2.get(), Bosshiro2Entity.createAttributes().build());
		event.put(PIROKICHIHAWAII.get(), PirokichihawaiiEntity.createAttributes().build());
		event.put(EPIC_DOWN_ZOMBIE.get(), EpicDownZombieEntity.createAttributes().build());
		event.put(LAVANICAL_GOLEM.get(), LavanicBreakerEntity.createAttributes().build());
		event.put(YUU_2434.get(), Maruchi100Entity.createAttributes().build());
		event.put(MELAMAIN_0105.get(), Melamain0105Entity.createAttributes().build());
		event.put(NIGHTMARE_RANAHIRO.get(), NightmareRanahiroEntity.createAttributes().build());
		event.put(NIGHTMARE_VAZAFILA.get(), NightmareVazafilaEntity.createAttributes().build());
		event.put(NIGHTMARE_MOTTIE.get(), NightmareMottieEntity.createAttributes().build());
		event.put(BOSSHIRO_3_CODE_PHOENIX.get(), Bosshiro3CodePhoenixEntity.createAttributes().build());
		event.put(GROUNDHIRO.get(), GroundhiroEntity.createAttributes().build());
		event.put(EPIC_DOWN_SKELETON.get(), EpicDownSkeletonEntity.createAttributes().build());
		event.put(MINER_SKELETON.get(), MinerSkeletonEntity.createAttributes().build());
		event.put(DRAGONHIRO_KNIGHT.get(), DragonhiroKnightEntity.createAttributes().build());
		event.put(SEAHOUSE_NIGHTMARE.get(), SeahouseNightmareEntity.createAttributes().build());
		event.put(GALE_SLASHER.get(), GaleSlasherEntity.createAttributes().build());
		event.put(BRESOLDIER.get(), BresoldierEntity.createAttributes().build());
		event.put(LAVAHIRO.get(), LavahiroEntity.createAttributes().build());
		event.put(GENERAL_SKELETON.get(), GeneralSkeletonEntity.createAttributes().build());
		event.put(GENERAL_WITHER_SKELETON.get(), GeneralWitherSkeletonEntity.createAttributes().build());
		event.put(EPIC_DOWN_CREEPER.get(), EpicDownCreeperEntity.createAttributes().build());
		event.put(HYPOCRITE.get(), HypocriteEntity.createAttributes().build());
		event.put(SWEEP.get(), SweepEntity.createAttributes().build());
		event.put(SPLADOT.get(), SpladotEntity.createAttributes().build());
		event.put(HIROMARUTV.get(), HIROMARUTVEntity.createAttributes().build());
		event.put(DEBUG_SUMMON.get(), DebugSummonEntity.createAttributes().build());
		event.put(EPIC_DOWN_ENDERMAN.get(), EpicDownEndermanEntity.createAttributes().build());
		event.put(KNIGHT_OF_LIGHTNING.get(), KnightOfLightningEntity.createAttributes().build());
		event.put(TAICHAN.get(), TaichanEntity.createAttributes().build());
		event.put(EPIC_DOWN_BLAZE.get(), EpicDownBlazeEntity.createAttributes().build());
		event.put(LAVANICAL_TRACKER.get(), LavanicalTrackerEntity.createAttributes().build());
		event.put(ENTITY_BLUE.get(), EntityBlueEntity.createAttributes().build());
		event.put(ENTITY_RED.get(), EntityRedEntity.createAttributes().build());
		event.put(UNDEFINED_CREEPER.get(), UndefinedCreeperEntity.createAttributes().build());
		event.put(UNDEFINED_ZOMBIE.get(), UndefinedZombieEntity.createAttributes().build());
		event.put(UNDEFINED_SKELETON.get(), UndefinedSkeletonEntity.createAttributes().build());
		event.put(UNDEFINED_GHAST.get(), UndefinedGhastEntity.createAttributes().build());
		event.put(UNDEFINED_WITCH.get(), UndefinedWitchEntity.createAttributes().build());
		event.put(ENTITY_DOMAIN_EXPANSION.get(), EntityDomainExpansionEntity.createAttributes().build());
		event.put(BIG_RANAHIRO.get(), BigRanahiroEntity.createAttributes().build());
		event.put(FAIRY_SPIRIT.get(), FairySpiritEntity.createAttributes().build());
		event.put(ENTITY_SUMMONER_UPDATE_MARKER.get(), EntitySummonerUpdateMarkerEntity.createAttributes().build());
	}
}
