
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ranahiromod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.ranahiromod.RanahiromodMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RanahiromodModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RanahiromodMod.MODID);
	public static final RegistryObject<CreativeModeTab> DOUBLE_HIRO_IN_RANAHIRO = REGISTRY.register("double_hiro_in_ranahiro",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.ranahiromod.double_hiro_in_ranahiro")).icon(() -> new ItemStack(RanahiromodModItems.RANAHIRO.get())).displayItems((parameters, tabData) -> {
				tabData.accept(RanahiromodModItems.RUBY.get());
				tabData.accept(RanahiromodModItems.SAPPHIRE.get());
				tabData.accept(RanahiromodModBlocks.RUBY_ORE.get().asItem());
				tabData.accept(RanahiromodModBlocks.SAPPHIRE_ORE.get().asItem());
				tabData.accept(RanahiromodModItems.RUBY_TOOL_PICKAXE.get());
				tabData.accept(RanahiromodModItems.RUBY_TOOL_AXE.get());
				tabData.accept(RanahiromodModItems.RUBY_TOOL_SWORD.get());
				tabData.accept(RanahiromodModItems.RUBY_TOOL_SHOVEL.get());
				tabData.accept(RanahiromodModItems.RUBY_TOOL_HOE.get());
				tabData.accept(RanahiromodModItems.SAPPHIRE_TOOL_PICKAXE.get());
				tabData.accept(RanahiromodModItems.SAPPHIRE_TOOL_AXE.get());
				tabData.accept(RanahiromodModItems.SAPPHIRE_TOOL_SWORD.get());
				tabData.accept(RanahiromodModItems.SAPPHIRE_TOOL_SHOVEL.get());
				tabData.accept(RanahiromodModItems.SAPPHIRE_TOOL_HOE.get());
				tabData.accept(RanahiromodModItems.PINK_DIAMOND.get());
				tabData.accept(RanahiromodModBlocks.PINK_DIAMOND_ORE.get().asItem());
				tabData.accept(RanahiromodModItems.PINK_DIAMONDT_PICKAXE.get());
				tabData.accept(RanahiromodModItems.PINK_DIAMONDT_AXE.get());
				tabData.accept(RanahiromodModItems.PINK_DIAMONDT_SWORD.get());
				tabData.accept(RanahiromodModItems.PINK_DIAMONDT_SHOVEL.get());
				tabData.accept(RanahiromodModItems.PINK_DIAMONDT_HOE.get());
				tabData.accept(RanahiromodModItems.CRYSTAL.get());
				tabData.accept(RanahiromodModBlocks.CRYSTAL_ORE.get().asItem());
				tabData.accept(RanahiromodModItems.RUBY_ARMOR_ARMOR_HELMET.get());
				tabData.accept(RanahiromodModItems.RUBY_ARMOR_ARMOR_CHESTPLATE.get());
				tabData.accept(RanahiromodModItems.RUBY_ARMOR_ARMOR_LEGGINGS.get());
				tabData.accept(RanahiromodModItems.RUBY_ARMOR_ARMOR_BOOTS.get());
				tabData.accept(RanahiromodModItems.SAPPHIRE_ARMOR_ARMOR_HELMET.get());
				tabData.accept(RanahiromodModItems.SAPPHIRE_ARMOR_ARMOR_CHESTPLATE.get());
				tabData.accept(RanahiromodModItems.SAPPHIRE_ARMOR_ARMOR_LEGGINGS.get());
				tabData.accept(RanahiromodModItems.SAPPHIRE_ARMOR_ARMOR_BOOTS.get());
				tabData.accept(RanahiromodModBlocks.RICE_PLANT_STAGE_0.get().asItem());
				tabData.accept(RanahiromodModItems.RICE_ITEM.get());
				tabData.accept(RanahiromodModItems.RICE_PLANT.get());
				tabData.accept(RanahiromodModItems.WET_NORI.get());
				tabData.accept(RanahiromodModItems.NORI.get());
				tabData.accept(RanahiromodModItems.CRYSTAL_TOOL_PICKAXE.get());
				tabData.accept(RanahiromodModItems.CRYSTAL_TOOL_AXE.get());
				tabData.accept(RanahiromodModItems.CRYSTAL_TOOL_SWORD.get());
				tabData.accept(RanahiromodModItems.CRYSTAL_TOOL_SHOVEL.get());
				tabData.accept(RanahiromodModItems.FLASH_LIGHT.get());
				tabData.accept(RanahiromodModItems.RICE.get());
				tabData.accept(RanahiromodModItems.RICE_2.get());
				tabData.accept(RanahiromodModItems.RICE_3.get());
				tabData.accept(RanahiromodModItems.RICEBALL.get());
				tabData.accept(RanahiromodModItems.MOCHI.get());
				tabData.accept(RanahiromodModItems.FOSSILAOIPOWER.get());
				tabData.accept(RanahiromodModItems.SK_LINER_5077_POWER.get());
				tabData.accept(RanahiromodModItems.MOTTIE_0717_POWER.get());
				tabData.accept(RanahiromodModItems.KEY.get());
				tabData.accept(RanahiromodModItems.BARRIER_BREAKER.get());
				tabData.accept(RanahiromodModItems.TOPAZ.get());
				tabData.accept(RanahiromodModItems.TOPAZ_TOOL_ARMOR_HELMET.get());
				tabData.accept(RanahiromodModItems.TOPAZ_TOOL_ARMOR_CHESTPLATE.get());
				tabData.accept(RanahiromodModItems.TOPAZ_TOOL_ARMOR_LEGGINGS.get());
				tabData.accept(RanahiromodModItems.TOPAZ_TOOL_ARMOR_BOOTS.get());
				tabData.accept(RanahiromodModItems.EMERALD_ARMOR_ARMOR_HELMET.get());
				tabData.accept(RanahiromodModItems.EMERALD_ARMOR_ARMOR_CHESTPLATE.get());
				tabData.accept(RanahiromodModItems.EMERALD_ARMOR_ARMOR_LEGGINGS.get());
				tabData.accept(RanahiromodModItems.EMERALD_ARMOR_ARMOR_BOOTS.get());
				tabData.accept(RanahiromodModItems.VAZAFILA_POWER.get());
				tabData.accept(RanahiromodModItems.RANDOM_DYE_GENERATOR.get());
				tabData.accept(RanahiromodModBlocks.TOPAZ_ORE.get().asItem());
				tabData.accept(RanahiromodModItems.MYSTERIOUS_DOCUMENT.get());
				tabData.accept(RanahiromodModItems.SEALED_MYSTERIOUS_DOCUMENT.get());
				tabData.accept(RanahiromodModItems.STRANGE_INK.get());
				tabData.accept(RanahiromodModItems.INFINITY_EAT_POWER.get());
				tabData.accept(RanahiromodModItems.TOPAZ_TOOL_PICKAXE.get());
				tabData.accept(RanahiromodModItems.TOPAZ_TOOL_AXE.get());
				tabData.accept(RanahiromodModItems.TOPAZ_TOOL_SWORD.get());
				tabData.accept(RanahiromodModItems.TOPAZ_TOOL_SHOVEL.get());
				tabData.accept(RanahiromodModItems.TOPAZ_TOOL_HOE.get());
				tabData.accept(RanahiromodModItems.RANAHIRO_INGOT.get());
				tabData.accept(RanahiromodModItems.RANAHIRO_PLATE_ARMOR_HELMET.get());
				tabData.accept(RanahiromodModItems.RANAHIRO_PLATE_ARMOR_CHESTPLATE.get());
				tabData.accept(RanahiromodModItems.RANAHIRO_PLATE_ARMOR_LEGGINGS.get());
				tabData.accept(RanahiromodModItems.RANAHIRO_PLATE_ARMOR_BOOTS.get());
				tabData.accept(RanahiromodModItems.RANAZMANIUM_INGOT.get());
				tabData.accept(RanahiromodModItems.SOUL_GRIEF_INGOT.get());
				tabData.accept(RanahiromodModBlocks.OVER_HARDENED_STONE.get().asItem());
				tabData.accept(RanahiromodModBlocks.SOUL_BLOCK.get().asItem());
				tabData.accept(RanahiromodModItems.SOUL_INGOT.get());
				tabData.accept(RanahiromodModItems.MECHANISM_ARMOR_HELMET.get());
				tabData.accept(RanahiromodModItems.MECHANISM_ARMOR_CHESTPLATE.get());
				tabData.accept(RanahiromodModItems.MECHANISM_ARMOR_LEGGINGS.get());
				tabData.accept(RanahiromodModItems.MECHANISM_ARMOR_BOOTS.get());
				tabData.accept(RanahiromodModBlocks.STRUCTURE_SUMMON_BLOCK.get().asItem());
				tabData.accept(RanahiromodModItems.SPLADOT_POWER.get());
				tabData.accept(RanahiromodModItems.RANAHIRO_POWER.get());
				tabData.accept(RanahiromodModItems.DAMAGE_SWORD.get());
				tabData.accept(RanahiromodModItems.RANA_ENERGY.get());
				tabData.accept(RanahiromodModBlocks.JEWEL_ORE.get().asItem());
				tabData.accept(RanahiromodModBlocks.DEEPSLATE_JEWEL_ORE.get().asItem());
				tabData.accept(RanahiromodModBlocks.MY_HOUSE_STRUCTURE_BLOCK.get().asItem());
				tabData.accept(RanahiromodModBlocks.FIELD_STRUCUTRE_BLOCK.get().asItem());
				tabData.accept(RanahiromodModItems.SAKURAMOCHI.get());
				tabData.accept(RanahiromodModItems.KASHIWA_MOCHI.get());
				tabData.accept(RanahiromodModItems.OKONOMIYAKI.get());
				tabData.accept(RanahiromodModItems.DORAYAKI.get());
				tabData.accept(RanahiromodModItems.ZONI.get());
				tabData.accept(RanahiromodModItems.YAKISOBA.get());
				tabData.accept(RanahiromodModItems.OKONOMIYAKI_2.get());
				tabData.accept(RanahiromodModItems.PIZZA.get());
				tabData.accept(RanahiromodModItems.RANAHIRO_MEAT.get());
				tabData.accept(RanahiromodModItems.RED_BEANS_ITEM.get());
				tabData.accept(RanahiromodModItems.THIS_IS_YOUR_MEAL.get());
				tabData.accept(RanahiromodModItems.DEVIL_EYE_ARMOR_HELMET.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> DOUBLE_HIRO_IN_SUMAHIRO = REGISTRY.register("double_hiro_in_sumahiro",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.ranahiromod.double_hiro_in_sumahiro")).icon(() -> new ItemStack(RanahiromodModItems.RANAHIRO.get())).displayItems((parameters, tabData) -> {
				tabData.accept(RanahiromodModItems.SWORD_OF_BOSSHIRO.get());
				tabData.accept(RanahiromodModItems.SUMAHIRO_PHONE.get());
				tabData.accept(RanahiromodModItems.CRYSTAL_ARMOR_ARMOR_HELMET.get());
				tabData.accept(RanahiromodModItems.CRYSTAL_ARMOR_ARMOR_CHESTPLATE.get());
				tabData.accept(RanahiromodModItems.CRYSTAL_ARMOR_ARMOR_LEGGINGS.get());
				tabData.accept(RanahiromodModItems.CRYSTAL_ARMOR_ARMOR_BOOTS.get());
				tabData.accept(RanahiromodModItems.LAVAHIRO_ITEM.get());
				tabData.accept(RanahiromodModItems.WATERHIRO_ITEM.get());
				tabData.accept(RanahiromodModItems.WINDHIRO_ITEM.get());
				tabData.accept(RanahiromodModItems.WATERHIRO_SPAWN_EGG.get());
				tabData.accept(RanahiromodModItems.WINDHIRO_SPAWN_EGG.get());
				tabData.accept(RanahiromodModItems.DRAGONHIRO_SPAWN_EGG.get());
				tabData.accept(RanahiromodModItems.ONIHIRO_SPAWN_EGG.get());
				tabData.accept(RanahiromodModItems.DRAGONHIRO_ITEM.get());
				tabData.accept(RanahiromodModItems.ONIHIRO_ITEM.get());
				tabData.accept(RanahiromodModItems.DRAGONHIRO_WING_CHESTPLATE.get());
				tabData.accept(RanahiromodModItems.WARDENHIRO_SPAWN_EGG.get());
				tabData.accept(RanahiromodModItems.FOSSILAOI_SPAWN_EGG.get());
				tabData.accept(RanahiromodModItems.BOSSHIRO_2_WING_CHESTPLATE.get());
				tabData.accept(RanahiromodModItems.BOLTHIRO_ITEM.get());
				tabData.accept(RanahiromodModItems.FOSSILAOI_SWORD_ITEM.get());
				tabData.accept(RanahiromodModItems.BOLTHIRO_SPAWN_EGG.get());
				tabData.accept(RanahiromodModItems.MOTTIE_HAMMER.get());
				tabData.accept(RanahiromodModItems.MOTTIE_0717_SPAWN_EGG.get());
				tabData.accept(RanahiromodModItems.SK_LINER_5077_SPAWN_EGG.get());
				tabData.accept(RanahiromodModItems.SK_LINER_5077_BLADE.get());
				tabData.accept(RanahiromodModItems.VAZAFILA_SPAWN_EGG.get());
				tabData.accept(RanahiromodModItems.VAZAFILA_SWORD.get());
				tabData.accept(RanahiromodModItems.WARDENHIRO_ITEM.get());
				tabData.accept(RanahiromodModItems.PHOTON_SWORD.get());
				tabData.accept(RanahiromodModItems.PIROKICHIHAWAII_SPAWN_EGG.get());
				tabData.accept(RanahiromodModItems.RANAHIRO_SWORD.get());
				tabData.accept(RanahiromodModItems.WEAPONHIRO_ITEM.get());
				tabData.accept(RanahiromodModItems.EPIC_DOWN_ZOMBIE_SPAWN_EGG.get());
				tabData.accept(RanahiromodModItems.EPIC_DOWN_SWORD.get());
				tabData.accept(RanahiromodModItems.EPIC_DOWN_BATTLE_AXE.get());
				tabData.accept(RanahiromodModItems.EPIC_DOWN_SPEAR.get());
				tabData.accept(RanahiromodModItems.LAVANICAL_GOLEM_SPAWN_EGG.get());
				tabData.accept(RanahiromodModItems.YUU_2434_SPAWN_EGG.get());
				tabData.accept(RanahiromodModItems.MELAMAIN_0105_SPAWN_EGG.get());
				tabData.accept(RanahiromodModItems.MELAMAIN_ROD.get());
				tabData.accept(RanahiromodModItems.GROUNDHIRO_SPAWN_EGG.get());
				tabData.accept(RanahiromodModItems.FARION_SWORD.get());
				tabData.accept(RanahiromodModItems.EPIC_DOWN_SKELETON_SPAWN_EGG.get());
				tabData.accept(RanahiromodModItems.MINER_SKELETON_SPAWN_EGG.get());
				tabData.accept(RanahiromodModItems.MARUCHI_100_SWORD.get());
				tabData.accept(RanahiromodModItems.DRAGON_SWORD.get());
				tabData.accept(RanahiromodModItems.DRAGON_HALBERD.get());
				tabData.accept(RanahiromodModItems.DRAGONHIRO_KNIGHT_SPAWN_EGG.get());
				tabData.accept(RanahiromodModItems.SEAHOUSE_NIGHTMARE_SPAWN_EGG.get());
				tabData.accept(RanahiromodModItems.GALE_SLASHER_SPAWN_EGG.get());
				tabData.accept(RanahiromodModItems.BRESOLDIER_SPAWN_EGG.get());
				tabData.accept(RanahiromodModItems.DIVINE_RANA_FORCE.get());
				tabData.accept(RanahiromodModItems.SOUL_GRIEF_SWORD.get());
				tabData.accept(RanahiromodModItems.DIVINE_RANA_REINFORCED.get());
				tabData.accept(RanahiromodModItems.LAVAHIRO_SPAWN_EGG.get());
				tabData.accept(RanahiromodModItems.GENERAL_SKELETON_SPAWN_EGG.get());
				tabData.accept(RanahiromodModItems.GENERAL_WITHER_SKELETON_SPAWN_EGG.get());
				tabData.accept(RanahiromodModItems.EPIC_DOWN_CREEPER_SPAWN_EGG.get());
				tabData.accept(RanahiromodModItems.HYPOCRITE_SPAWN_EGG.get());
				tabData.accept(RanahiromodModItems.SPLADOT_SPAWN_EGG.get());
				tabData.accept(RanahiromodModItems.SPLADOT_ROD.get());
				tabData.accept(RanahiromodModItems.VAZAFILA_KATANA.get());
				tabData.accept(RanahiromodModItems.WIND_MAGIC.get());
				tabData.accept(RanahiromodModItems.HOLY_SWORD.get());
				tabData.accept(RanahiromodModItems.DEVIL_SWORD.get());
				tabData.accept(RanahiromodModItems.YOTO.get());
				tabData.accept(RanahiromodModItems.EPIC_DOWN_ENDERMAN_SPAWN_EGG.get());
				tabData.accept(RanahiromodModItems.KNIGHT_OF_LIGHTNING_SPAWN_EGG.get());
				tabData.accept(RanahiromodModItems.TAICHAN_SPAWN_EGG.get());
				tabData.accept(RanahiromodModItems.EPIC_DOWN_BLAZE_SPAWN_EGG.get());
				tabData.accept(RanahiromodModItems.GROUNDHIRO_ITEM.get());
				tabData.accept(RanahiromodModItems.LAVANICAL_TRACKER_SPAWN_EGG.get());
				tabData.accept(RanahiromodModItems.GALRAD.get());
				tabData.accept(RanahiromodModItems.UNDEFINED_CREEPER_SPAWN_EGG.get());
				tabData.accept(RanahiromodModItems.UNDEFINED_ZOMBIE_SPAWN_EGG.get());
				tabData.accept(RanahiromodModItems.GALRADNULL.get());
				tabData.accept(RanahiromodModItems.UNDEFINED_SKELETON_SPAWN_EGG.get());
				tabData.accept(RanahiromodModItems.FARION_SWORD_NULL.get());
				tabData.accept(RanahiromodModItems.UNDEFINED_GHAST_SPAWN_EGG.get());
				tabData.accept(RanahiromodModItems.UNDEFINED_WITCH_SPAWN_EGG.get());
				tabData.accept(RanahiromodModItems.FARION_GUN.get());
				tabData.accept(RanahiromodModItems.TAICHAN_BOW.get());
				tabData.accept(RanahiromodModItems.FARION_GUN_NULL.get());
				tabData.accept(RanahiromodModItems.BIG_RANAHIRO_SPAWN_EGG.get());
				tabData.accept(RanahiromodModItems.WIND_MAGIC_2.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> DOUBLE_HIRO_IN_THIRDHIRO = REGISTRY.register("double_hiro_in_thirdhiro",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.ranahiromod.double_hiro_in_thirdhiro")).icon(() -> new ItemStack(RanahiromodModItems.RANAHIRO.get())).displayItems((parameters, tabData) -> {
				tabData.accept(RanahiromodModItems.HEALING_WAND.get());
				tabData.accept(RanahiromodModItems.BLAZE_WAND.get());
				tabData.accept(RanahiromodModItems.DRAGON_FIREBALL_WAND.get());
				tabData.accept(RanahiromodModItems.SUN_ROD.get());
				tabData.accept(RanahiromodModItems.WOODEN_SHORT_SWORD.get());
				tabData.accept(RanahiromodModItems.STONE_SHORT_SWORD.get());
				tabData.accept(RanahiromodModItems.IRON_SHORT_SWORD.get());
				tabData.accept(RanahiromodModItems.GOLDEN_SHORT_SWORD.get());
				tabData.accept(RanahiromodModItems.DIAMOND_SHORT_SWORD.get());
				tabData.accept(RanahiromodModItems.NETHERRITE_SHORT_SWORD.get());
				tabData.accept(RanahiromodModItems.LARGE_HEALING_WAND.get());
				tabData.accept(RanahiromodModItems.WAWAWAWAWAWAWAWAWAWAWAWAWAWAWAWAWAWAWAWAWAWAWAWAWAWAWAWAWAWA.get());
				tabData.accept(RanahiromodModItems.ENERGY_RIFLE.get());
				tabData.accept(RanahiromodModItems.OVER_HEALING_WAND.get());
				tabData.accept(RanahiromodModItems.ARROW_WAND.get());
				tabData.accept(RanahiromodModItems.LAVAR.get());
				tabData.accept(RanahiromodModItems.WATER.get());
				tabData.accept(RanahiromodModItems.WINDR.get());
				tabData.accept(RanahiromodModItems.DRAGR.get());
				tabData.accept(RanahiromodModItems.DEMER.get());
				tabData.accept(RanahiromodModItems.VOLTR.get());
				tabData.accept(RanahiromodModItems.WARDER.get());
				tabData.accept(RanahiromodModItems.GROUND.get());
				tabData.accept(RanahiromodModItems.PRIVATE_BOTTLE.get());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.REDSTONE_BLOCKS) {
			tabData.accept(RanahiromodModBlocks.SHOWCASE.get().asItem());
			tabData.accept(RanahiromodModBlocks.GLASS_CASE.get().asItem());
			tabData.accept(RanahiromodModBlocks.SERVER.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(RanahiromodModItems.DEBUG_SUMMON_SPAWN_EGG.get());
		}
	}
}
