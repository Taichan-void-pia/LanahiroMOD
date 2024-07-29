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

import net.mcreator.ranahiromod.world.inventory.SumahiroPhoneWarpGUIMenu;
import net.mcreator.ranahiromod.procedures.SumahiroPhonePingAnimation4Procedure;
import net.mcreator.ranahiromod.procedures.SumahiroPhonePingAnimation3Procedure;
import net.mcreator.ranahiromod.procedures.SumahiroPhonePingAnimation2Procedure;
import net.mcreator.ranahiromod.procedures.SumahiroPhonePingAnimation1Procedure;
import net.mcreator.ranahiromod.procedures.SumahiroPhoneBatteryAnimation4Procedure;
import net.mcreator.ranahiromod.procedures.SumahiroPhoneBatteryAnimation3Procedure;
import net.mcreator.ranahiromod.procedures.SumahiroPhoneBatteryAnimation2Procedure;
import net.mcreator.ranahiromod.procedures.SumahiroPhoneBatteryAnimation1Procedure;
import net.mcreator.ranahiromod.procedures.PositionDelCondtion3Procedure;
import net.mcreator.ranahiromod.procedures.PositionDelCondition4Procedure;
import net.mcreator.ranahiromod.procedures.PositionDelCondition2Procedure;
import net.mcreator.ranahiromod.procedures.PositionDelCondition1Procedure;
import net.mcreator.ranahiromod.network.SumahiroPhoneWarpGUIButtonMessage;
import net.mcreator.ranahiromod.RanahiromodMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class SumahiroPhoneWarpGUIScreen extends AbstractContainerScreen<SumahiroPhoneWarpGUIMenu> {
	private final static HashMap<String, Object> guistate = SumahiroPhoneWarpGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_home;
	Button button_favoriteplace1;
	Button button_favoriteplace2;
	Button button_favoriteplace3;
	ImageButton imagebutton_iphone_button;
	ImageButton imagebutton_cross_close;
	ImageButton imagebutton_cross_close1;
	ImageButton imagebutton_cross_close2;
	ImageButton imagebutton_cross_close3;

	public SumahiroPhoneWarpGUIScreen(SumahiroPhoneWarpGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 100;
		this.imageHeight = 205;
	}

	private static final ResourceLocation texture = new ResourceLocation("ranahiromod:textures/screens/sumahiro_phone_warp_gui.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.ranahiromod.sumahiro_phone_warp_gui.label_000"), 8, 2, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.ranahiromod.sumahiro_phone_warp_gui.label_weather"), 39, 10, -12829636, false);
		if (PositionDelCondition1Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.ranahiromod.sumahiro_phone_warp_gui.label_delete_position"), 4, 53, -154, false);
		if (PositionDelCondition2Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.ranahiromod.sumahiro_phone_warp_gui.label_delete_position1"), 4, 93, -154, false);
		if (PositionDelCondtion3Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.ranahiromod.sumahiro_phone_warp_gui.label_delete_position2"), 4, 121, -154, false);
		if (PositionDelCondition4Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.ranahiromod.sumahiro_phone_warp_gui.label_delete_position3"), 4, 150, -154, false);
	}

	@Override
	public void init() {
		super.init();
		button_home = Button.builder(Component.translatable("gui.ranahiromod.sumahiro_phone_warp_gui.button_home"), e -> {
			if (true) {
				RanahiromodMod.PACKET_HANDLER.sendToServer(new SumahiroPhoneWarpGUIButtonMessage(0, x, y, z));
				SumahiroPhoneWarpGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 27, this.topPos + 32, 46, 20).build();
		guistate.put("button:button_home", button_home);
		this.addRenderableWidget(button_home);
		button_favoriteplace1 = Button.builder(Component.translatable("gui.ranahiromod.sumahiro_phone_warp_gui.button_favoriteplace1"), e -> {
			if (true) {
				RanahiromodMod.PACKET_HANDLER.sendToServer(new SumahiroPhoneWarpGUIButtonMessage(1, x, y, z));
				SumahiroPhoneWarpGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 1, this.topPos + 74, 98, 20).build();
		guistate.put("button:button_favoriteplace1", button_favoriteplace1);
		this.addRenderableWidget(button_favoriteplace1);
		button_favoriteplace2 = Button.builder(Component.translatable("gui.ranahiromod.sumahiro_phone_warp_gui.button_favoriteplace2"), e -> {
			if (true) {
				RanahiromodMod.PACKET_HANDLER.sendToServer(new SumahiroPhoneWarpGUIButtonMessage(2, x, y, z));
				SumahiroPhoneWarpGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 1, this.topPos + 102, 98, 20).build();
		guistate.put("button:button_favoriteplace2", button_favoriteplace2);
		this.addRenderableWidget(button_favoriteplace2);
		button_favoriteplace3 = Button.builder(Component.translatable("gui.ranahiromod.sumahiro_phone_warp_gui.button_favoriteplace3"), e -> {
			if (true) {
				RanahiromodMod.PACKET_HANDLER.sendToServer(new SumahiroPhoneWarpGUIButtonMessage(3, x, y, z));
				SumahiroPhoneWarpGUIButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 1, this.topPos + 130, 98, 20).build();
		guistate.put("button:button_favoriteplace3", button_favoriteplace3);
		this.addRenderableWidget(button_favoriteplace3);
		imagebutton_iphone_button = new ImageButton(this.leftPos + 43, this.topPos + 186, 16, 16, 0, 0, 16, new ResourceLocation("ranahiromod:textures/screens/atlas/imagebutton_iphone_button.png"), 16, 32, e -> {
			if (true) {
				RanahiromodMod.PACKET_HANDLER.sendToServer(new SumahiroPhoneWarpGUIButtonMessage(4, x, y, z));
				SumahiroPhoneWarpGUIButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		guistate.put("button:imagebutton_iphone_button", imagebutton_iphone_button);
		this.addRenderableWidget(imagebutton_iphone_button);
		imagebutton_cross_close = new ImageButton(this.leftPos + 87, this.topPos + 54, 8, 8, 0, 0, 8, new ResourceLocation("ranahiromod:textures/screens/atlas/imagebutton_cross_close.png"), 8, 16, e -> {
			if (PositionDelCondition1Procedure.execute(entity)) {
				RanahiromodMod.PACKET_HANDLER.sendToServer(new SumahiroPhoneWarpGUIButtonMessage(5, x, y, z));
				SumahiroPhoneWarpGUIButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (PositionDelCondition1Procedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_cross_close", imagebutton_cross_close);
		this.addRenderableWidget(imagebutton_cross_close);
		imagebutton_cross_close1 = new ImageButton(this.leftPos + 87, this.topPos + 94, 8, 8, 0, 0, 8, new ResourceLocation("ranahiromod:textures/screens/atlas/imagebutton_cross_close1.png"), 8, 16, e -> {
			if (PositionDelCondition2Procedure.execute(entity)) {
				RanahiromodMod.PACKET_HANDLER.sendToServer(new SumahiroPhoneWarpGUIButtonMessage(6, x, y, z));
				SumahiroPhoneWarpGUIButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (PositionDelCondition2Procedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_cross_close1", imagebutton_cross_close1);
		this.addRenderableWidget(imagebutton_cross_close1);
		imagebutton_cross_close2 = new ImageButton(this.leftPos + 87, this.topPos + 122, 8, 8, 0, 0, 8, new ResourceLocation("ranahiromod:textures/screens/atlas/imagebutton_cross_close2.png"), 8, 16, e -> {
			if (PositionDelCondtion3Procedure.execute(entity)) {
				RanahiromodMod.PACKET_HANDLER.sendToServer(new SumahiroPhoneWarpGUIButtonMessage(7, x, y, z));
				SumahiroPhoneWarpGUIButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (PositionDelCondtion3Procedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_cross_close2", imagebutton_cross_close2);
		this.addRenderableWidget(imagebutton_cross_close2);
		imagebutton_cross_close3 = new ImageButton(this.leftPos + 87, this.topPos + 150, 8, 8, 0, 0, 8, new ResourceLocation("ranahiromod:textures/screens/atlas/imagebutton_cross_close3.png"), 8, 16, e -> {
			if (PositionDelCondition4Procedure.execute(entity)) {
				RanahiromodMod.PACKET_HANDLER.sendToServer(new SumahiroPhoneWarpGUIButtonMessage(8, x, y, z));
				SumahiroPhoneWarpGUIButtonMessage.handleButtonAction(entity, 8, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (PositionDelCondition4Procedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_cross_close3", imagebutton_cross_close3);
		this.addRenderableWidget(imagebutton_cross_close3);
	}
}
