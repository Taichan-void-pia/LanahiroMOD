
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ranahiromod.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.ranahiromod.client.gui.SumahiroPhoneWeatherControlScreen;
import net.mcreator.ranahiromod.client.gui.SumahiroPhoneWarpGUIScreen;
import net.mcreator.ranahiromod.client.gui.SumahiroPhoneNoteGUIScreen;
import net.mcreator.ranahiromod.client.gui.SumahiroPhoneMusicGUIScreen;
import net.mcreator.ranahiromod.client.gui.SmahirophoneBaseGUIScreen;
import net.mcreator.ranahiromod.client.gui.ShowcaseSettingsScreen;
import net.mcreator.ranahiromod.client.gui.LevelingGUIScreen;
import net.mcreator.ranahiromod.client.gui.GUIMysteriousDocumentScreen;
import net.mcreator.ranahiromod.client.gui.EnchantGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class RanahiromodModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(RanahiromodModMenus.LEVELING_GUI.get(), LevelingGUIScreen::new);
			MenuScreens.register(RanahiromodModMenus.GUI_MYSTERIOUS_DOCUMENT.get(), GUIMysteriousDocumentScreen::new);
			MenuScreens.register(RanahiromodModMenus.ENCHANT_GUI.get(), EnchantGUIScreen::new);
			MenuScreens.register(RanahiromodModMenus.SHOWCASE_SETTINGS.get(), ShowcaseSettingsScreen::new);
			MenuScreens.register(RanahiromodModMenus.SMAHIROPHONE_BASE_GUI.get(), SmahirophoneBaseGUIScreen::new);
			MenuScreens.register(RanahiromodModMenus.SUMAHIRO_PHONE_WEATHER_CONTROL.get(), SumahiroPhoneWeatherControlScreen::new);
			MenuScreens.register(RanahiromodModMenus.SUMAHIRO_PHONE_WARP_GUI.get(), SumahiroPhoneWarpGUIScreen::new);
			MenuScreens.register(RanahiromodModMenus.SUMAHIRO_PHONE_NOTE_GUI.get(), SumahiroPhoneNoteGUIScreen::new);
			MenuScreens.register(RanahiromodModMenus.SUMAHIRO_PHONE_MUSIC_GUI.get(), SumahiroPhoneMusicGUIScreen::new);
		});
	}
}
