package net.mcreator.ranahiromod.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.Minecraft;

import net.mcreator.ranahiromod.world.inventory.ShowcaseSettingsMenu;
import net.mcreator.ranahiromod.network.ShowcaseSettingsButtonMessage;
import net.mcreator.ranahiromod.RanahiromodMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class ShowcaseSettingsScreen extends AbstractContainerScreen<ShowcaseSettingsMenu> {
	private final static HashMap<String, Object> guistate = ShowcaseSettingsMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox datatag;
	EditBox item_id;
	Button button_confirmwan_liao;
	Button button_breakshowcasesiyokesuwohuai_su;

	public ShowcaseSettingsScreen(ShowcaseSettingsMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("ranahiromod:textures/screens/showcase_settings.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		datatag.render(guiGraphics, mouseX, mouseY, partialTicks);
		item_id.render(guiGraphics, mouseX, mouseY, partialTicks);
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
		if (datatag.isFocused())
			return datatag.keyPressed(key, b, c);
		if (item_id.isFocused())
			return item_id.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		datatag.tick();
		item_id.tick();
	}

	@Override
	public void resize(Minecraft minecraft, int width, int height) {
		String datatagValue = datatag.getValue();
		String item_idValue = item_id.getValue();
		super.resize(minecraft, width, height);
		datatag.setValue(datatagValue);
		item_id.setValue(item_idValue);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
	}

	@Override
	public void init() {
		super.init();
		datatag = new EditBox(this.font, this.leftPos + 28, this.topPos + 54, 118, 18, Component.translatable("gui.ranahiromod.showcase_settings.datatag")) {
			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.ranahiromod.showcase_settings.datatag").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.ranahiromod.showcase_settings.datatag").getString());
				else
					setSuggestion(null);
			}
		};
		datatag.setSuggestion(Component.translatable("gui.ranahiromod.showcase_settings.datatag").getString());
		datatag.setMaxLength(32767);
		guistate.put("text:datatag", datatag);
		this.addWidget(this.datatag);
		item_id = new EditBox(this.font, this.leftPos + 28, this.topPos + 33, 118, 18, Component.translatable("gui.ranahiromod.showcase_settings.item_id")) {
			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.ranahiromod.showcase_settings.item_id").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.ranahiromod.showcase_settings.item_id").getString());
				else
					setSuggestion(null);
			}
		};
		item_id.setSuggestion(Component.translatable("gui.ranahiromod.showcase_settings.item_id").getString());
		item_id.setMaxLength(32767);
		guistate.put("text:item_id", item_id);
		this.addWidget(this.item_id);
		button_confirmwan_liao = Button.builder(Component.translatable("gui.ranahiromod.showcase_settings.button_confirmwan_liao"), e -> {
			if (true) {
				RanahiromodMod.PACKET_HANDLER.sendToServer(new ShowcaseSettingsButtonMessage(0, x, y, z));
				ShowcaseSettingsButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 48, this.topPos + 83, 77, 20).build();
		guistate.put("button:button_confirmwan_liao", button_confirmwan_liao);
		this.addRenderableWidget(button_confirmwan_liao);
		button_breakshowcasesiyokesuwohuai_su = Button.builder(Component.translatable("gui.ranahiromod.showcase_settings.button_breakshowcasesiyokesuwohuai_su"), e -> {
			if (true) {
				RanahiromodMod.PACKET_HANDLER.sendToServer(new ShowcaseSettingsButtonMessage(1, x, y, z));
				ShowcaseSettingsButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 15, this.topPos + 115, 145, 20).build();
		guistate.put("button:button_breakshowcasesiyokesuwohuai_su", button_breakshowcasesiyokesuwohuai_su);
		this.addRenderableWidget(button_breakshowcasesiyokesuwohuai_su);
	}
}
