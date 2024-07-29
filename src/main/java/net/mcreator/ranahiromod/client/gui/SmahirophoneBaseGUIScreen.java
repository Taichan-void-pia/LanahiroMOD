package net.mcreator.ranahiromod.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.InventoryScreen;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.ranahiromod.world.inventory.SmahirophoneBaseGUIMenu;
import net.mcreator.ranahiromod.procedures.SumahiroPhonePingAnimation4Procedure;
import net.mcreator.ranahiromod.procedures.SumahiroPhonePingAnimation3Procedure;
import net.mcreator.ranahiromod.procedures.SumahiroPhonePingAnimation2Procedure;
import net.mcreator.ranahiromod.procedures.SumahiroPhonePingAnimation1Procedure;
import net.mcreator.ranahiromod.procedures.SumahiroPhoneBatteryAnimation4Procedure;
import net.mcreator.ranahiromod.procedures.SumahiroPhoneBatteryAnimation3Procedure;
import net.mcreator.ranahiromod.procedures.SumahiroPhoneBatteryAnimation2Procedure;
import net.mcreator.ranahiromod.procedures.SumahiroPhoneBatteryAnimation1Procedure;
import net.mcreator.ranahiromod.procedures.GUIPlayerModelProcedure;
import net.mcreator.ranahiromod.network.SmahirophoneBaseGUIButtonMessage;
import net.mcreator.ranahiromod.RanahiromodMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class SmahirophoneBaseGUIScreen extends AbstractContainerScreen<SmahirophoneBaseGUIMenu> {
	private final static HashMap<String, Object> guistate = SmahirophoneBaseGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_iphone_button;
	ImageButton imagebutton_app_music;
	ImageButton imagebutton_app_notes;
	ImageButton imagebutton_app_warp;
	ImageButton imagebutton_leveling_app;
	ImageButton imagebutton_app_weather;

	public SmahirophoneBaseGUIScreen(SmahirophoneBaseGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 100;
		this.imageHeight = 205;
	}

	private static final ResourceLocation texture = new ResourceLocation("ranahiromod:textures/screens/smahirophone_base_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		if (GUIPlayerModelProcedure.execute(entity) instanceof LivingEntity livingEntity) {
			InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + 50, this.topPos + 73, 30, 0f + (float) Math.atan((this.leftPos + 50 - mouseX) / 40.0), (float) Math.atan((this.topPos + 24 - mouseY) / 40.0), livingEntity);
		}
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
		guiGraphics.drawString(this.font, Component.translatable("gui.ranahiromod.smahirophone_base_gui.label_music"), 10, 160, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.ranahiromod.smahirophone_base_gui.label_note"), 42, 104, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.ranahiromod.smahirophone_base_gui.label_warp"), 40, 132, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.ranahiromod.smahirophone_base_gui.label_level"), 10, 132, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.ranahiromod.smahirophone_base_gui.label_weather"), 4, 104, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.ranahiromod.smahirophone_base_gui.label_000"), 8, 2, -1, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_iphone_button = new ImageButton(this.leftPos + 43, this.topPos + 186, 16, 16, 0, 0, 16, new ResourceLocation("ranahiromod:textures/screens/atlas/imagebutton_iphone_button.png"), 16, 32, e -> {
			if (true) {
				RanahiromodMod.PACKET_HANDLER.sendToServer(new SmahirophoneBaseGUIButtonMessage(0, x, y, z));
				SmahirophoneBaseGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_iphone_button", imagebutton_iphone_button);
		this.addRenderableWidget(imagebutton_iphone_button);
		imagebutton_app_music = new ImageButton(this.leftPos + 15, this.topPos + 144, 16, 16, 0, 0, 16, new ResourceLocation("ranahiromod:textures/screens/atlas/imagebutton_app_music.png"), 16, 32, e -> {
			if (true) {
				RanahiromodMod.PACKET_HANDLER.sendToServer(new SmahirophoneBaseGUIButtonMessage(1, x, y, z));
				SmahirophoneBaseGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_app_music", imagebutton_app_music);
		this.addRenderableWidget(imagebutton_app_music);
		imagebutton_app_notes = new ImageButton(this.leftPos + 43, this.topPos + 88, 16, 16, 0, 0, 16, new ResourceLocation("ranahiromod:textures/screens/atlas/imagebutton_app_notes.png"), 16, 32, e -> {
			if (true) {
				RanahiromodMod.PACKET_HANDLER.sendToServer(new SmahirophoneBaseGUIButtonMessage(2, x, y, z));
				SmahirophoneBaseGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_app_notes", imagebutton_app_notes);
		this.addRenderableWidget(imagebutton_app_notes);
		imagebutton_app_warp = new ImageButton(this.leftPos + 43, this.topPos + 116, 16, 16, 0, 0, 16, new ResourceLocation("ranahiromod:textures/screens/atlas/imagebutton_app_warp.png"), 16, 32, e -> {
			if (true) {
				RanahiromodMod.PACKET_HANDLER.sendToServer(new SmahirophoneBaseGUIButtonMessage(3, x, y, z));
				SmahirophoneBaseGUIButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:imagebutton_app_warp", imagebutton_app_warp);
		this.addRenderableWidget(imagebutton_app_warp);
		imagebutton_leveling_app = new ImageButton(this.leftPos + 15, this.topPos + 116, 16, 16, 0, 0, 16, new ResourceLocation("ranahiromod:textures/screens/atlas/imagebutton_leveling_app.png"), 16, 32, e -> {
			if (true) {
				RanahiromodMod.PACKET_HANDLER.sendToServer(new SmahirophoneBaseGUIButtonMessage(4, x, y, z));
				SmahirophoneBaseGUIButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		guistate.put("button:imagebutton_leveling_app", imagebutton_leveling_app);
		this.addRenderableWidget(imagebutton_leveling_app);
		imagebutton_app_weather = new ImageButton(this.leftPos + 15, this.topPos + 88, 16, 16, 0, 0, 16, new ResourceLocation("ranahiromod:textures/screens/atlas/imagebutton_app_weather.png"), 16, 32, e -> {
			if (true) {
				RanahiromodMod.PACKET_HANDLER.sendToServer(new SmahirophoneBaseGUIButtonMessage(5, x, y, z));
				SmahirophoneBaseGUIButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		});
		guistate.put("button:imagebutton_app_weather", imagebutton_app_weather);
		this.addRenderableWidget(imagebutton_app_weather);
	}
}
