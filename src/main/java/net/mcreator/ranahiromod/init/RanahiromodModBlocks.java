
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ranahiromod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.ranahiromod.block.WindrPortalBlock;
import net.mcreator.ranahiromod.block.WawawawawawawawawawawawawawawawawawawawawawawawawawawawawawaPortalBlock;
import net.mcreator.ranahiromod.block.WaterPortalBlock;
import net.mcreator.ranahiromod.block.WarderPortalBlock;
import net.mcreator.ranahiromod.block.VoltrPortalBlock;
import net.mcreator.ranahiromod.block.TopazOreBlock;
import net.mcreator.ranahiromod.block.StructureSummonBlockBlock;
import net.mcreator.ranahiromod.block.SoulBlockBlock;
import net.mcreator.ranahiromod.block.ShowcaseBlock;
import net.mcreator.ranahiromod.block.ServerBlock;
import net.mcreator.ranahiromod.block.SapphireOreBlock;
import net.mcreator.ranahiromod.block.RubyOreBlock;
import net.mcreator.ranahiromod.block.RicePlantStage7Block;
import net.mcreator.ranahiromod.block.RicePlantStage6Block;
import net.mcreator.ranahiromod.block.RicePlantStage5Block;
import net.mcreator.ranahiromod.block.RicePlantStage4Block;
import net.mcreator.ranahiromod.block.RicePlantStage3Block;
import net.mcreator.ranahiromod.block.RicePlantStage2Block;
import net.mcreator.ranahiromod.block.RicePlantStage1Block;
import net.mcreator.ranahiromod.block.RicePlantStage0Block;
import net.mcreator.ranahiromod.block.PinkDiamondOreBlock;
import net.mcreator.ranahiromod.block.OverHardenedStoneBlock;
import net.mcreator.ranahiromod.block.MyHouseStructureBlockBlock;
import net.mcreator.ranahiromod.block.MiningDimensionPortalBlock;
import net.mcreator.ranahiromod.block.LavarPortalBlock;
import net.mcreator.ranahiromod.block.LavahiroSummonBlockBlock;
import net.mcreator.ranahiromod.block.LavahiroKeyfillBlockBlock;
import net.mcreator.ranahiromod.block.LavahiroKeyEmptyBlockBlock;
import net.mcreator.ranahiromod.block.KeyHardenedGlassBlock;
import net.mcreator.ranahiromod.block.JewelOreBlock;
import net.mcreator.ranahiromod.block.GroundPortalBlock;
import net.mcreator.ranahiromod.block.GlassCaseBlock;
import net.mcreator.ranahiromod.block.FlashlightBlockBlock;
import net.mcreator.ranahiromod.block.FieldStrucutreBlockBlock;
import net.mcreator.ranahiromod.block.DragrPortalBlock;
import net.mcreator.ranahiromod.block.DomainBarrierBlock;
import net.mcreator.ranahiromod.block.DemerPortalBlock;
import net.mcreator.ranahiromod.block.DeepslateJewelOreBlock;
import net.mcreator.ranahiromod.block.CrystalOreBlock;
import net.mcreator.ranahiromod.block.AirConditionBlockBlock;
import net.mcreator.ranahiromod.block.AirBariierBlock;
import net.mcreator.ranahiromod.RanahiromodMod;

public class RanahiromodModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, RanahiromodMod.MODID);
	public static final RegistryObject<Block> RUBY_ORE = REGISTRY.register("ruby_ore", () -> new RubyOreBlock());
	public static final RegistryObject<Block> SAPPHIRE_ORE = REGISTRY.register("sapphire_ore", () -> new SapphireOreBlock());
	public static final RegistryObject<Block> PINK_DIAMOND_ORE = REGISTRY.register("pink_diamond_ore", () -> new PinkDiamondOreBlock());
	public static final RegistryObject<Block> CRYSTAL_ORE = REGISTRY.register("crystal_ore", () -> new CrystalOreBlock());
	public static final RegistryObject<Block> RICE_PLANT_STAGE_0 = REGISTRY.register("rice_plant_stage_0", () -> new RicePlantStage0Block());
	public static final RegistryObject<Block> RICE_PLANT_STAGE_1 = REGISTRY.register("rice_plant_stage_1", () -> new RicePlantStage1Block());
	public static final RegistryObject<Block> RICE_PLANT_STAGE_2 = REGISTRY.register("rice_plant_stage_2", () -> new RicePlantStage2Block());
	public static final RegistryObject<Block> RICE_PLANT_STAGE_3 = REGISTRY.register("rice_plant_stage_3", () -> new RicePlantStage3Block());
	public static final RegistryObject<Block> RICE_PLANT_STAGE_4 = REGISTRY.register("rice_plant_stage_4", () -> new RicePlantStage4Block());
	public static final RegistryObject<Block> RICE_PLANT_STAGE_5 = REGISTRY.register("rice_plant_stage_5", () -> new RicePlantStage5Block());
	public static final RegistryObject<Block> RICE_PLANT_STAGE_6 = REGISTRY.register("rice_plant_stage_6", () -> new RicePlantStage6Block());
	public static final RegistryObject<Block> RICE_PLANT_STAGE_7 = REGISTRY.register("rice_plant_stage_7", () -> new RicePlantStage7Block());
	public static final RegistryObject<Block> FLASHLIGHT_BLOCK = REGISTRY.register("flashlight_block", () -> new FlashlightBlockBlock());
	public static final RegistryObject<Block> LAVAHIRO_SUMMON_BLOCK = REGISTRY.register("lavahiro_summon_block", () -> new LavahiroSummonBlockBlock());
	public static final RegistryObject<Block> KEY_EMPTY_BLOCK = REGISTRY.register("key_empty_block", () -> new LavahiroKeyEmptyBlockBlock());
	public static final RegistryObject<Block> KEY_FILL_BLOCK = REGISTRY.register("key_fill_block", () -> new LavahiroKeyfillBlockBlock());
	public static final RegistryObject<Block> KEY_HARDENED_GLASS = REGISTRY.register("key_hardened_glass", () -> new KeyHardenedGlassBlock());
	public static final RegistryObject<Block> TOPAZ_ORE = REGISTRY.register("topaz_ore", () -> new TopazOreBlock());
	public static final RegistryObject<Block> OVER_HARDENED_STONE = REGISTRY.register("over_hardened_stone", () -> new OverHardenedStoneBlock());
	public static final RegistryObject<Block> SOUL_BLOCK = REGISTRY.register("soul_block", () -> new SoulBlockBlock());
	public static final RegistryObject<Block> STRUCTURE_SUMMON_BLOCK = REGISTRY.register("structure_summon_block", () -> new StructureSummonBlockBlock());
	public static final RegistryObject<Block> WAWAWAWAWAWAWAWAWAWAWAWAWAWAWAWAWAWAWAWAWAWAWAWAWAWAWAWAWAWA_PORTAL = REGISTRY.register("wawawawawawawawawawawawawawawawawawawawawawawawawawawawawawa_portal",
			() -> new WawawawawawawawawawawawawawawawawawawawawawawawawawawawawawaPortalBlock());
	public static final RegistryObject<Block> JEWEL_ORE = REGISTRY.register("jewel_ore", () -> new JewelOreBlock());
	public static final RegistryObject<Block> DEEPSLATE_JEWEL_ORE = REGISTRY.register("deepslate_jewel_ore", () -> new DeepslateJewelOreBlock());
	public static final RegistryObject<Block> SHOWCASE = REGISTRY.register("showcase", () -> new ShowcaseBlock());
	public static final RegistryObject<Block> GLASS_CASE = REGISTRY.register("glass_case", () -> new GlassCaseBlock());
	public static final RegistryObject<Block> DOMAIN_BARRIER = REGISTRY.register("domain_barrier", () -> new DomainBarrierBlock());
	public static final RegistryObject<Block> AIR_BARIIER = REGISTRY.register("air_bariier", () -> new AirBariierBlock());
	public static final RegistryObject<Block> MINING_DIMENSION_PORTAL = REGISTRY.register("mining_dimension_portal", () -> new MiningDimensionPortalBlock());
	public static final RegistryObject<Block> MY_HOUSE_STRUCTURE_BLOCK = REGISTRY.register("my_house_structure_block", () -> new MyHouseStructureBlockBlock());
	public static final RegistryObject<Block> FIELD_STRUCUTRE_BLOCK = REGISTRY.register("field_strucutre_block", () -> new FieldStrucutreBlockBlock());
	public static final RegistryObject<Block> LAVAR_PORTAL = REGISTRY.register("lavar_portal", () -> new LavarPortalBlock());
	public static final RegistryObject<Block> WATER_PORTAL = REGISTRY.register("water_portal", () -> new WaterPortalBlock());
	public static final RegistryObject<Block> WINDR_PORTAL = REGISTRY.register("windr_portal", () -> new WindrPortalBlock());
	public static final RegistryObject<Block> DRAGR_PORTAL = REGISTRY.register("dragr_portal", () -> new DragrPortalBlock());
	public static final RegistryObject<Block> DEMER_PORTAL = REGISTRY.register("demer_portal", () -> new DemerPortalBlock());
	public static final RegistryObject<Block> VOLTR_PORTAL = REGISTRY.register("voltr_portal", () -> new VoltrPortalBlock());
	public static final RegistryObject<Block> WARDER_PORTAL = REGISTRY.register("warder_portal", () -> new WarderPortalBlock());
	public static final RegistryObject<Block> GROUND_PORTAL = REGISTRY.register("ground_portal", () -> new GroundPortalBlock());
	public static final RegistryObject<Block> SERVER = REGISTRY.register("server", () -> new ServerBlock());
	public static final RegistryObject<Block> AIR_CONDITION_BLOCK = REGISTRY.register("air_condition_block", () -> new AirConditionBlockBlock());

	// Start of user code block custom blocks
	// End of user code block custom blocks
	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class BlocksClientSideHandler {
		@SubscribeEvent
		public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
			FlashlightBlockBlock.blockColorLoad(event);
			AirBariierBlock.blockColorLoad(event);
		}
	}
}
