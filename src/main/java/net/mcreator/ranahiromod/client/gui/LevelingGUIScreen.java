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

import net.mcreator.ranahiromod.world.inventory.LevelingGUIMenu;
import net.mcreator.ranahiromod.procedures.SumahiroPhonePingAnimation4Procedure;
import net.mcreator.ranahiromod.procedures.SumahiroPhonePingAnimation3Procedure;
import net.mcreator.ranahiromod.procedures.SumahiroPhonePingAnimation2Procedure;
import net.mcreator.ranahiromod.procedures.SumahiroPhonePingAnimation1Procedure;
import net.mcreator.ranahiromod.procedures.SumahiroPhoneBatteryAnimation4Procedure;
import net.mcreator.ranahiromod.procedures.SumahiroPhoneBatteryAnimation3Procedure;
import net.mcreator.ranahiromod.procedures.SumahiroPhoneBatteryAnimation2Procedure;
import net.mcreator.ranahiromod.procedures.SumahiroPhoneBatteryAnimation1Procedure;
import net.mcreator.ranahiromod.network.LevelingGUIButtonMessage;
import net.mcreator.ranahiromod.RanahiromodMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class LevelingGUIScreen extends AbstractContainerScreen<LevelingGUIMenu> {
	private final static HashMap<String, Object> guistate = LevelingGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_kbresitance;
	Button button_attackspeed;
	Button button_strength;
	Button button_defense;
	Button button_health;
	Button button_speed;
	ImageButton imagebutton_iphone_button;

	public LevelingGUIScreen(LevelingGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 100;
		this.imageHeight = 205;
	}

	private static final ResourceLocation texture = new ResourceLocation("ranahiromod:textures/screens/leveling_gui.png");

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

		guiGraphics.blit(new ResourceLocation("ranahiromod:textures/screens/health_boost.png"), this.leftPos + 71, this.topPos + 25, 0, 0, 18, 18, 18, 18);

		guiGraphics.blit(new ResourceLocation("ranahiromod:textures/screens/resistance.png"), this.leftPos + 73, this.topPos + 53, 0, 0, 18, 18, 18, 18);

		guiGraphics.blit(new ResourceLocation("ranahiromod:textures/screens/strength.png"), this.leftPos + 80, this.topPos + 81, 0, 0, 18, 18, 18, 18);

		guiGraphics.blit(new ResourceLocation("ranahiromod:textures/screens/speed.png"), this.leftPos + 66, this.topPos + 165, 0, 0, 18, 18, 18, 18);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.ranahiromod.leveling_gui.label_leveling"), 29, 11, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.ranahiromod.leveling_gui.label_000"), 8, 2, -1, false);
	}

	@Override
	public void init() {
		super.init();
		button_kbresitance = Button.builder(Component.translatable("gui.ranahiromod.leveling_gui.button_kbresitance"), e -> {
			if (true) {
				RanahiromodMod.PACKET_HANDLER.sendToServer(new LevelingGUIButtonMessage(0, x, y, z));
				LevelingGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 10, this.topPos + 137, 82, 20).build();
		guistate.put("button:button_kbresitance", button_kbresitance);
		this.addRenderableWidget(button_kbresitance);
		button_attackspeed = Button.builder(Component.translatable("gui.ranahiromod.leveling_gui.button_attackspeed"), e -> {
			if (true) {
				RanahiromodMod.PACKET_HANDLER.sendToServer(new LevelingGUIButtonMessage(1, x, y, z));
				LevelingGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 10, this.topPos + 109, 82, 20).build();
		guistate.put("button:button_attackspeed", button_attackspeed);
		this.addRenderableWidget(button_attackspeed);
		button_strength = Button.builder(Component.translatable("gui.ranahiromod.leveling_gui.button_strength"), e -> {
			if (true) {
				RanahiromodMod.PACKET_HANDLER.sendToServer(new LevelingGUIButtonMessage(2, x, y, z));
				LevelingGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 10, this.topPos + 81, 67, 20).build();
		guistate.put("button:button_strength", button_strength);
		this.addRenderableWidget(button_strength);
		button_defense = Button.builder(Component.translatable("gui.ranahiromod.leveling_gui.button_defense"), e -> {
			if (true) {
				RanahiromodMod.PACKET_HANDLER.sendToServer(new LevelingGUIButtonMessage(3, x, y, z));
				LevelingGUIButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 10, this.topPos + 53, 61, 20).build();
		guistate.put("button:button_defense", button_defense);
		this.addRenderableWidget(button_defense);
		button_health = Button.builder(Component.translatable("gui.ranahiromod.leveling_gui.button_health"), e -> {
			if (true) {
				RanahiromodMod.PACKET_HANDLER.sendToServer(new LevelingGUIButtonMessage(4, x, y, z));
				LevelingGUIButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}).bounds(this.leftPos + 10, this.topPos + 25, 56, 20).build();
		guistate.put("button:button_health", button_health);
		this.addRenderableWidget(button_health);
		button_speed = Button.builder(Component.translatable("gui.ranahiromod.leveling_gui.button_speed"), e -> {
			if (true) {
				RanahiromodMod.PACKET_HANDLER.sendToServer(new LevelingGUIButtonMessage(5, x, y, z));
				LevelingGUIButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}).bounds(this.leftPos + 10, this.topPos + 165, 51, 20).build();
		guistate.put("button:button_speed", button_speed);
		this.addRenderableWidget(button_speed);
		imagebutton_iphone_button = new ImageButton(this.leftPos + 43, this.topPos + 186, 16, 16, 0, 0, 16, new ResourceLocation("ranahiromod:textures/screens/atlas/imagebutton_iphone_button.png"), 16, 32, e -> {
			if (true) {
				RanahiromodMod.PACKET_HANDLER.sendToServer(new LevelingGUIButtonMessage(6, x, y, z));
				LevelingGUIButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		});
		guistate.put("button:imagebutton_iphone_button", imagebutton_iphone_button);
		this.addRenderableWidget(imagebutton_iphone_button);
	}
}
