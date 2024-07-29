package net.mcreator.ranahiromod.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.ranahiromod.world.inventory.GUIMysteriousDocumentMenu;
import net.mcreator.ranahiromod.network.GUIMysteriousDocumentButtonMessage;
import net.mcreator.ranahiromod.RanahiromodMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class GUIMysteriousDocumentScreen extends AbstractContainerScreen<GUIMysteriousDocumentMenu> {
	private final static HashMap<String, Object> guistate = GUIMysteriousDocumentMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_1pezimu_si_womotarasuzhou_wen;
	Button button_2pezimu_jiao_tu_nizhui_titali_shi;
	Button button_3pezimu_di_nodi_heyin_kizhe_riip_mucha_hui;
	Button button_4pezimu_shui_kanoyi_shu_toqi_yue_shu;
	Button button_ben_wobi_ziru;

	public GUIMysteriousDocumentScreen(GUIMysteriousDocumentMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("ranahiromod:textures/screens/gui_mysterious_document.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.ranahiromod.gui_mysterious_document.label_empty"), 76, 6, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_1pezimu_si_womotarasuzhou_wen = Button.builder(Component.translatable("gui.ranahiromod.gui_mysterious_document.button_1pezimu_si_womotarasuzhou_wen"), e -> {
			if (true) {
				RanahiromodMod.PACKET_HANDLER.sendToServer(new GUIMysteriousDocumentButtonMessage(0, x, y, z));
				GUIMysteriousDocumentButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 38, this.topPos + 24, 98, 20).build();
		guistate.put("button:button_1pezimu_si_womotarasuzhou_wen", button_1pezimu_si_womotarasuzhou_wen);
		this.addRenderableWidget(button_1pezimu_si_womotarasuzhou_wen);
		button_2pezimu_jiao_tu_nizhui_titali_shi = Button.builder(Component.translatable("gui.ranahiromod.gui_mysterious_document.button_2pezimu_jiao_tu_nizhui_titali_shi"), e -> {
			if (true) {
				RanahiromodMod.PACKET_HANDLER.sendToServer(new GUIMysteriousDocumentButtonMessage(1, x, y, z));
				GUIMysteriousDocumentButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 38, this.topPos + 54, 98, 20).build();
		guistate.put("button:button_2pezimu_jiao_tu_nizhui_titali_shi", button_2pezimu_jiao_tu_nizhui_titali_shi);
		this.addRenderableWidget(button_2pezimu_jiao_tu_nizhui_titali_shi);
		button_3pezimu_di_nodi_heyin_kizhe_riip_mucha_hui = Button.builder(Component.translatable("gui.ranahiromod.gui_mysterious_document.button_3pezimu_di_nodi_heyin_kizhe_riip_mucha_hui"), e -> {
			if (true) {
				RanahiromodMod.PACKET_HANDLER.sendToServer(new GUIMysteriousDocumentButtonMessage(2, x, y, z));
				GUIMysteriousDocumentButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 27, this.topPos + 82, 119, 20).build();
		guistate.put("button:button_3pezimu_di_nodi_heyin_kizhe_riip_mucha_hui", button_3pezimu_di_nodi_heyin_kizhe_riip_mucha_hui);
		this.addRenderableWidget(button_3pezimu_di_nodi_heyin_kizhe_riip_mucha_hui);
		button_4pezimu_shui_kanoyi_shu_toqi_yue_shu = Button.builder(Component.translatable("gui.ranahiromod.gui_mysterious_document.button_4pezimu_shui_kanoyi_shu_toqi_yue_shu"), e -> {
		}).bounds(this.leftPos + 38, this.topPos + 114, 103, 20).build();
		guistate.put("button:button_4pezimu_shui_kanoyi_shu_toqi_yue_shu", button_4pezimu_shui_kanoyi_shu_toqi_yue_shu);
		this.addRenderableWidget(button_4pezimu_shui_kanoyi_shu_toqi_yue_shu);
		button_ben_wobi_ziru = Button.builder(Component.translatable("gui.ranahiromod.gui_mysterious_document.button_ben_wobi_ziru"), e -> {
			if (true) {
				RanahiromodMod.PACKET_HANDLER.sendToServer(new GUIMysteriousDocumentButtonMessage(4, x, y, z));
				GUIMysteriousDocumentButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}).bounds(this.leftPos + 60, this.topPos + 141, 51, 20).build();
		guistate.put("button:button_ben_wobi_ziru", button_ben_wobi_ziru);
		this.addRenderableWidget(button_ben_wobi_ziru);
	}
}
