package net.mcreator.ranahiromod.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.ranahiromod.world.inventory.EnchantGUIMenu;
import net.mcreator.ranahiromod.network.EnchantGUIButtonMessage;
import net.mcreator.ranahiromod.RanahiromodMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class EnchantGUIScreen extends AbstractContainerScreen<EnchantGUIMenu> {
	private final static HashMap<String, Object> guistate = EnchantGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_enchant_lvl10;
	Button button_enchant_lvl20;
	Button button_enchant_lvl30;

	public EnchantGUIScreen(EnchantGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("ranahiromod:textures/screens/enchant_gui.png");

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
	}

	@Override
	public void init() {
		super.init();
		button_enchant_lvl10 = Button.builder(Component.translatable("gui.ranahiromod.enchant_gui.button_enchant_lvl10"), e -> {
			if (true) {
				RanahiromodMod.PACKET_HANDLER.sendToServer(new EnchantGUIButtonMessage(0, x, y, z));
				EnchantGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 60, this.topPos + 16, 93, 20).build();
		guistate.put("button:button_enchant_lvl10", button_enchant_lvl10);
		this.addRenderableWidget(button_enchant_lvl10);
		button_enchant_lvl20 = Button.builder(Component.translatable("gui.ranahiromod.enchant_gui.button_enchant_lvl20"), e -> {
			if (true) {
				RanahiromodMod.PACKET_HANDLER.sendToServer(new EnchantGUIButtonMessage(1, x, y, z));
				EnchantGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 60, this.topPos + 34, 93, 20).build();
		guistate.put("button:button_enchant_lvl20", button_enchant_lvl20);
		this.addRenderableWidget(button_enchant_lvl20);
		button_enchant_lvl30 = Button.builder(Component.translatable("gui.ranahiromod.enchant_gui.button_enchant_lvl30"), e -> {
			if (true) {
				RanahiromodMod.PACKET_HANDLER.sendToServer(new EnchantGUIButtonMessage(2, x, y, z));
				EnchantGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 60, this.topPos + 52, 93, 20).build();
		guistate.put("button:button_enchant_lvl30", button_enchant_lvl30);
		this.addRenderableWidget(button_enchant_lvl30);
	}
}
