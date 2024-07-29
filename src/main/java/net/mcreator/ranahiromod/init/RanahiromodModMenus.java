
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ranahiromod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.ranahiromod.world.inventory.SumahiroPhoneWeatherControlMenu;
import net.mcreator.ranahiromod.world.inventory.SumahiroPhoneWarpGUIMenu;
import net.mcreator.ranahiromod.world.inventory.SumahiroPhoneNoteGUIMenu;
import net.mcreator.ranahiromod.world.inventory.SumahiroPhoneMusicGUIMenu;
import net.mcreator.ranahiromod.world.inventory.SmahirophoneBaseGUIMenu;
import net.mcreator.ranahiromod.world.inventory.ShowcaseSettingsMenu;
import net.mcreator.ranahiromod.world.inventory.LevelingGUIMenu;
import net.mcreator.ranahiromod.world.inventory.GUIMysteriousDocumentMenu;
import net.mcreator.ranahiromod.world.inventory.EnchantGUIMenu;
import net.mcreator.ranahiromod.RanahiromodMod;

public class RanahiromodModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, RanahiromodMod.MODID);
	public static final RegistryObject<MenuType<LevelingGUIMenu>> LEVELING_GUI = REGISTRY.register("leveling_gui", () -> IForgeMenuType.create(LevelingGUIMenu::new));
	public static final RegistryObject<MenuType<GUIMysteriousDocumentMenu>> GUI_MYSTERIOUS_DOCUMENT = REGISTRY.register("gui_mysterious_document", () -> IForgeMenuType.create(GUIMysteriousDocumentMenu::new));
	public static final RegistryObject<MenuType<EnchantGUIMenu>> ENCHANT_GUI = REGISTRY.register("enchant_gui", () -> IForgeMenuType.create(EnchantGUIMenu::new));
	public static final RegistryObject<MenuType<ShowcaseSettingsMenu>> SHOWCASE_SETTINGS = REGISTRY.register("showcase_settings", () -> IForgeMenuType.create(ShowcaseSettingsMenu::new));
	public static final RegistryObject<MenuType<SmahirophoneBaseGUIMenu>> SMAHIROPHONE_BASE_GUI = REGISTRY.register("smahirophone_base_gui", () -> IForgeMenuType.create(SmahirophoneBaseGUIMenu::new));
	public static final RegistryObject<MenuType<SumahiroPhoneWeatherControlMenu>> SUMAHIRO_PHONE_WEATHER_CONTROL = REGISTRY.register("sumahiro_phone_weather_control", () -> IForgeMenuType.create(SumahiroPhoneWeatherControlMenu::new));
	public static final RegistryObject<MenuType<SumahiroPhoneWarpGUIMenu>> SUMAHIRO_PHONE_WARP_GUI = REGISTRY.register("sumahiro_phone_warp_gui", () -> IForgeMenuType.create(SumahiroPhoneWarpGUIMenu::new));
	public static final RegistryObject<MenuType<SumahiroPhoneNoteGUIMenu>> SUMAHIRO_PHONE_NOTE_GUI = REGISTRY.register("sumahiro_phone_note_gui", () -> IForgeMenuType.create(SumahiroPhoneNoteGUIMenu::new));
	public static final RegistryObject<MenuType<SumahiroPhoneMusicGUIMenu>> SUMAHIRO_PHONE_MUSIC_GUI = REGISTRY.register("sumahiro_phone_music_gui", () -> IForgeMenuType.create(SumahiroPhoneMusicGUIMenu::new));
}
