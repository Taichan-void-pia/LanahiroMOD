package net.mcreator.ranahiromod.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.ranahiromod.world.inventory.SumahiroPhoneWeatherControlMenu;
import net.mcreator.ranahiromod.procedures.SumahiroPhonePingAnimation4Procedure;
import net.mcreator.ranahiromod.procedures.SumahiroPhonePingAnimation3Procedure;
import net.mcreator.ranahiromod.procedures.SumahiroPhonePingAnimation2Procedure;
import net.mcreator.ranahiromod.procedures.SumahiroPhonePingAnimation1Procedure;
import net.mcreator.ranahiromod.procedures.SumahiroPhoneBatteryAnimation4Procedure;
import net.mcreator.ranahiromod.procedures.SumahiroPhoneBatteryAnimation3Procedure;
import net.mcreator.ranahiromod.procedures.SumahiroPhoneBatteryAnimation2Procedure;
import net.mcreator.ranahiromod.procedures.SumahiroPhoneBatteryAnimation1Procedure;
import net.mcreator.ranahiromod.network.SumahiroPhoneWeatherControlButtonMessage;
import net.mcreator.ranahiromod.RanahiromodMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class SumahiroPhoneWeatherControlScreen extends AbstractContainerScreen<SumahiroPhoneWeatherControlMenu> {
	private final static HashMap<String, Object> guistate = SumahiroPhoneWeatherControlMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_sunny;
	Button button_rain;
	Button button_thunder;
	ImageButton imagebutton_iphone_button;

	public SumahiroPhoneWeatherControlScreen(SumahiroPhoneWeatherControlMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 100;
		this.imageHeight = 205;
	}

	private static final ResourceLocation texture = new ResourceLocation("ranahiromod:textures/screens/sumahiro_phone_weather_control.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("ranahiromod:textures/screens/iphone_gui.png"), this.leftPos + 0, this.topPos + 0, 0, 0, 100, 205, 100, 205);

		if (SumahiroPhonePingAnimation1Procedure.execute(x, y, z, entity)) {
			guiGraphics.blit(new ResourceLocation("ranahiromod:textures/screens/ping.png"), this.leftPos + 83, this.topPos + 4, 0, 0, 6, 6, 6, 6);
		}
		if (SumahiroPhoneBatteryAnimation1Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("ranahiromod:textures/screens/battery_1.png"), this.leftPos + 90, this.topPos + 4, 0, 0, 6, 6, 6, 6);
		}
		if (SumahiroPhoneBatteryAnimation2Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("ranahiromod:textures/screens/battery_2.png"), this.leftPos + 90, this.topPos + 4, 0, 0, 6, 6, 6, 6);
		}
		if (SumahiroPhoneBatteryAnimation3Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("ranahiromod:textures/screens/battery_3.png"), this.leftPos + 90, this.topPos + 4, 0, 0, 6, 6, 6, 6);
		}
		if (SumahiroPhoneBatteryAnimation4Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("ranahiromod:textures/screens/battery_4.png"), this.leftPos + 90, this.topPos + 4, 0, 0, 6, 6, 6, 6);
		}
		if (SumahiroPhonePingAnimation2Procedure.execute(x, y, z, entity)) {
			guiGraphics.blit(new ResourceLocation("ranahiromod:textures/screens/ping_2.png"), this.leftPos + 83, this.topPos + 4, 0, 0, 6, 6, 6, 6);
		}
		if (SumahiroPhonePingAnimation3Procedure.execute(x, y, z, entity)) {
			guiGraphics.blit(new ResourceLocation("ranahiromod:textures/screens/ping_3.png"), this.leftPos + 83, this.topPos + 4, 0, 0, 6, 6, 6, 6);
		}
		if (SumahiroPhonePingAnimation4Procedure.execute(x, y, z, entity)) {
			guiGraphics.blit(new ResourceLocation("ranahiromod:textures/screens/ping_4.png"), this.leftPos + 83, this.topPos + 4, 0, 0, 6, 6, 6, 6);
		}
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.ranahiromod.sumahiro_phone_weather_control.label_000"), 8, 2, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.ranahiromod.sumahiro_phone_weather_control.label_weather"), 33, 11, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_sunny = Button.builder(Component.translatable("gui.ranahiromod.sumahiro_phone_weather_control.button_sunny"), e -> {
			if (true) {
				RanahiromodMod.PACKET_HANDLER.sendToServer(new SumahiroPhoneWeatherControlButtonMessage(0, x, y, z));
				SumahiroPhoneWeatherControlButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 22, this.topPos + 32, 51, 20).build();
		guistate.put("button:button_sunny", button_sunny);
		this.addRenderableWidget(button_sunny);
		button_rain = Button.builder(Component.translatable("gui.ranahiromod.sumahiro_phone_weather_control.button_rain"), e -> {
			if (true) {
				RanahiromodMod.PACKET_HANDLER.sendToServer(new SumahiroPhoneWeatherControlButtonMessage(1, x, y, z));
				SumahiroPhoneWeatherControlButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 22, this.topPos + 81, 46, 20).build();
		guistate.put("button:button_rain", button_rain);
		this.addRenderableWidget(button_rain);
		button_thunder = Button.builder(Component.translatable("gui.ranahiromod.sumahiro_phone_weather_control.button_thunder"), e -> {
			if (true) {
				RanahiromodMod.PACKET_HANDLER.sendToServer(new SumahiroPhoneWeatherControlButtonMessage(2, x, y, z));
				SumahiroPhoneWeatherControlButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 22, this.topPos + 130, 61, 20).build();
		guistate.put("button:button_thunder", button_thunder);
		this.addRenderableWidget(button_thunder);
		imagebutton_iphone_button = new ImageButton(this.leftPos + 43, this.topPos + 186, 16, 16, 0, 0, 16, new ResourceLocation("ranahiromod:textures/screens/atlas/imagebutton_iphone_button.png"), 16, 32, e -> {
			if (true) {
				RanahiromodMod.PACKET_HANDLER.sendToServer(new SumahiroPhoneWeatherControlButtonMessage(3, x, y, z));
				SumahiroPhoneWeatherControlButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:imagebutton_iphone_button", imagebutton_iphone_button);
		this.addRenderableWidget(imagebutton_iphone_button);
	}
}
