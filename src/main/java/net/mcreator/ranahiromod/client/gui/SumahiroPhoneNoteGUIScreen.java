package net.mcreator.ranahiromod.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.Minecraft;

import net.mcreator.ranahiromod.world.inventory.SumahiroPhoneNoteGUIMenu;
import net.mcreator.ranahiromod.procedures.SumahiroPhonePingAnimation4Procedure;
import net.mcreator.ranahiromod.procedures.SumahiroPhonePingAnimation3Procedure;
import net.mcreator.ranahiromod.procedures.SumahiroPhonePingAnimation2Procedure;
import net.mcreator.ranahiromod.procedures.SumahiroPhonePingAnimation1Procedure;
import net.mcreator.ranahiromod.procedures.SumahiroPhoneBatteryAnimation4Procedure;
import net.mcreator.ranahiromod.procedures.SumahiroPhoneBatteryAnimation3Procedure;
import net.mcreator.ranahiromod.procedures.SumahiroPhoneBatteryAnimation2Procedure;
import net.mcreator.ranahiromod.procedures.SumahiroPhoneBatteryAnimation1Procedure;
import net.mcreator.ranahiromod.network.SumahiroPhoneNoteGUIButtonMessage;
import net.mcreator.ranahiromod.RanahiromodMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class SumahiroPhoneNoteGUIScreen extends AbstractContainerScreen<SumahiroPhoneNoteGUIMenu> {
	private final static HashMap<String, Object> guistate = SumahiroPhoneNoteGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox note;
	EditBox note2;
	EditBox note3;
	EditBox note4;
	EditBox note5;
	EditBox note6;
	EditBox note7;
	ImageButton imagebutton_iphone_button;

	public SumahiroPhoneNoteGUIScreen(SumahiroPhoneNoteGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 100;
		this.imageHeight = 205;
	}

	private static final ResourceLocation texture = new ResourceLocation("ranahiromod:textures/screens/sumahiro_phone_note_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		note.render(guiGraphics, mouseX, mouseY, partialTicks);
		note2.render(guiGraphics, mouseX, mouseY, partialTicks);
		note3.render(guiGraphics, mouseX, mouseY, partialTicks);
		note4.render(guiGraphics, mouseX, mouseY, partialTicks);
		note5.render(guiGraphics, mouseX, mouseY, partialTicks);
		note6.render(guiGraphics, mouseX, mouseY, partialTicks);
		note7.render(guiGraphics, mouseX, mouseY, partialTicks);
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
		if (note.isFocused())
			return note.keyPressed(key, b, c);
		if (note2.isFocused())
			return note2.keyPressed(key, b, c);
		if (note3.isFocused())
			return note3.keyPressed(key, b, c);
		if (note4.isFocused())
			return note4.keyPressed(key, b, c);
		if (note5.isFocused())
			return note5.keyPressed(key, b, c);
		if (note6.isFocused())
			return note6.keyPressed(key, b, c);
		if (note7.isFocused())
			return note7.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		note.tick();
		note2.tick();
		note3.tick();
		note4.tick();
		note5.tick();
		note6.tick();
		note7.tick();
	}

	@Override
	public void resize(Minecraft minecraft, int width, int height) {
		String noteValue = note.getValue();
		String note2Value = note2.getValue();
		String note3Value = note3.getValue();
		String note4Value = note4.getValue();
		String note5Value = note5.getValue();
		String note6Value = note6.getValue();
		String note7Value = note7.getValue();
		super.resize(minecraft, width, height);
		note.setValue(noteValue);
		note2.setValue(note2Value);
		note3.setValue(note3Value);
		note4.setValue(note4Value);
		note5.setValue(note5Value);
		note6.setValue(note6Value);
		note7.setValue(note7Value);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.ranahiromod.sumahiro_phone_note_gui.label_000"), 8, 2, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.ranahiromod.sumahiro_phone_note_gui.label_weather"), 39, 10, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		note = new EditBox(this.font, this.leftPos + -9, this.topPos + 26, 118, 18, Component.translatable("gui.ranahiromod.sumahiro_phone_note_gui.note"));
		note.setMaxLength(32767);
		guistate.put("text:note", note);
		this.addWidget(this.note);
		note2 = new EditBox(this.font, this.leftPos + -9, this.topPos + 46, 118, 18, Component.translatable("gui.ranahiromod.sumahiro_phone_note_gui.note2"));
		note2.setMaxLength(32767);
		guistate.put("text:note2", note2);
		this.addWidget(this.note2);
		note3 = new EditBox(this.font, this.leftPos + -9, this.topPos + 66, 118, 18, Component.translatable("gui.ranahiromod.sumahiro_phone_note_gui.note3"));
		note3.setMaxLength(32767);
		guistate.put("text:note3", note3);
		this.addWidget(this.note3);
		note4 = new EditBox(this.font, this.leftPos + -9, this.topPos + 86, 118, 18, Component.translatable("gui.ranahiromod.sumahiro_phone_note_gui.note4"));
		note4.setMaxLength(32767);
		guistate.put("text:note4", note4);
		this.addWidget(this.note4);
		note5 = new EditBox(this.font, this.leftPos + -9, this.topPos + 106, 118, 18, Component.translatable("gui.ranahiromod.sumahiro_phone_note_gui.note5"));
		note5.setMaxLength(32767);
		guistate.put("text:note5", note5);
		this.addWidget(this.note5);
		note6 = new EditBox(this.font, this.leftPos + -9, this.topPos + 126, 118, 18, Component.translatable("gui.ranahiromod.sumahiro_phone_note_gui.note6"));
		note6.setMaxLength(32767);
		guistate.put("text:note6", note6);
		this.addWidget(this.note6);
		note7 = new EditBox(this.font, this.leftPos + -9, this.topPos + 146, 118, 18, Component.translatable("gui.ranahiromod.sumahiro_phone_note_gui.note7"));
		note7.setMaxLength(32767);
		guistate.put("text:note7", note7);
		this.addWidget(this.note7);
		imagebutton_iphone_button = new ImageButton(this.leftPos + 43, this.topPos + 186, 16, 16, 0, 0, 16, new ResourceLocation("ranahiromod:textures/screens/atlas/imagebutton_iphone_button.png"), 16, 32, e -> {
			if (true) {
				RanahiromodMod.PACKET_HANDLER.sendToServer(new SumahiroPhoneNoteGUIButtonMessage(0, x, y, z));
				SumahiroPhoneNoteGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_iphone_button", imagebutton_iphone_button);
		this.addRenderableWidget(imagebutton_iphone_button);
	}
}
