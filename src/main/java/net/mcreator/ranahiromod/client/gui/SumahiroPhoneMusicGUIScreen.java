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

import net.mcreator.ranahiromod.world.inventory.SumahiroPhoneMusicGUIMenu;
import net.mcreator.ranahiromod.procedures.SumahiroPhonePingAnimation4Procedure;
import net.mcreator.ranahiromod.procedures.SumahiroPhonePingAnimation3Procedure;
import net.mcreator.ranahiromod.procedures.SumahiroPhonePingAnimation2Procedure;
import net.mcreator.ranahiromod.procedures.SumahiroPhonePingAnimation1Procedure;
import net.mcreator.ranahiromod.procedures.SumahiroPhoneMusicConditionProcedure;
import net.mcreator.ranahiromod.procedures.SumahiroPhoneMusicCondition1Procedure;
import net.mcreator.ranahiromod.procedures.SumahiroPhoneBatteryAnimation4Procedure;
import net.mcreator.ranahiromod.procedures.SumahiroPhoneBatteryAnimation3Procedure;
import net.mcreator.ranahiromod.procedures.SumahiroPhoneBatteryAnimation2Procedure;
import net.mcreator.ranahiromod.procedures.SumahiroPhoneBatteryAnimation1Procedure;
import net.mcreator.ranahiromod.network.SumahiroPhoneMusicGUIButtonMessage;
import net.mcreator.ranahiromod.RanahiromodMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class SumahiroPhoneMusicGUIScreen extends AbstractContainerScreen<SumahiroPhoneMusicGUIMenu> {
	private final static HashMap<String, Object> guistate = SumahiroPhoneMusicGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox music_name;
	EditBox music_type;
	EditBox music_volume;
	EditBox music_pitch;
	ImageButton imagebutton_iphone_button;
	ImageButton imagebutton_play_button;
	ImageButton imagebutton_pause_button;

	public SumahiroPhoneMusicGUIScreen(SumahiroPhoneMusicGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 100;
		this.imageHeight = 205;
	}

	private static final ResourceLocation texture = new ResourceLocation("ranahiromod:textures/screens/sumahiro_phone_music_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		music_name.render(guiGraphics, mouseX, mouseY, partialTicks);
		music_type.render(guiGraphics, mouseX, mouseY, partialTicks);
		music_volume.render(guiGraphics, mouseX, mouseY, partialTicks);
		music_pitch.render(guiGraphics, mouseX, mouseY, partialTicks);
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
		if (music_name.isFocused())
			return music_name.keyPressed(key, b, c);
		if (music_type.isFocused())
			return music_type.keyPressed(key, b, c);
		if (music_volume.isFocused())
			return music_volume.keyPressed(key, b, c);
		if (music_pitch.isFocused())
			return music_pitch.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		music_name.tick();
		music_type.tick();
		music_volume.tick();
		music_pitch.tick();
	}

	@Override
	public void resize(Minecraft minecraft, int width, int height) {
		String music_nameValue = music_name.getValue();
		String music_typeValue = music_type.getValue();
		String music_volumeValue = music_volume.getValue();
		String music_pitchValue = music_pitch.getValue();
		super.resize(minecraft, width, height);
		music_name.setValue(music_nameValue);
		music_type.setValue(music_typeValue);
		music_volume.setValue(music_volumeValue);
		music_pitch.setValue(music_pitchValue);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.ranahiromod.sumahiro_phone_music_gui.label_000"), 8, 2, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.ranahiromod.sumahiro_phone_music_gui.label_weather"), 36, 11, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		music_name = new EditBox(this.font, this.leftPos + -9, this.topPos + 47, 118, 18, Component.translatable("gui.ranahiromod.sumahiro_phone_music_gui.music_name")) {
			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.ranahiromod.sumahiro_phone_music_gui.music_name").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.ranahiromod.sumahiro_phone_music_gui.music_name").getString());
				else
					setSuggestion(null);
			}
		};
		music_name.setSuggestion(Component.translatable("gui.ranahiromod.sumahiro_phone_music_gui.music_name").getString());
		music_name.setMaxLength(32767);
		guistate.put("text:music_name", music_name);
		this.addWidget(this.music_name);
		music_type = new EditBox(this.font, this.leftPos + -9, this.topPos + 75, 118, 18, Component.translatable("gui.ranahiromod.sumahiro_phone_music_gui.music_type")) {
			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.ranahiromod.sumahiro_phone_music_gui.music_type").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.ranahiromod.sumahiro_phone_music_gui.music_type").getString());
				else
					setSuggestion(null);
			}
		};
		music_type.setSuggestion(Component.translatable("gui.ranahiromod.sumahiro_phone_music_gui.music_type").getString());
		music_type.setMaxLength(32767);
		guistate.put("text:music_type", music_type);
		this.addWidget(this.music_type);
		music_volume = new EditBox(this.font, this.leftPos + -9, this.topPos + 103, 118, 18, Component.translatable("gui.ranahiromod.sumahiro_phone_music_gui.music_volume")) {
			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.ranahiromod.sumahiro_phone_music_gui.music_volume").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.ranahiromod.sumahiro_phone_music_gui.music_volume").getString());
				else
					setSuggestion(null);
			}
		};
		music_volume.setSuggestion(Component.translatable("gui.ranahiromod.sumahiro_phone_music_gui.music_volume").getString());
		music_volume.setMaxLength(32767);
		guistate.put("text:music_volume", music_volume);
		this.addWidget(this.music_volume);
		music_pitch = new EditBox(this.font, this.leftPos + -9, this.topPos + 131, 118, 18, Component.translatable("gui.ranahiromod.sumahiro_phone_music_gui.music_pitch")) {
			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.ranahiromod.sumahiro_phone_music_gui.music_pitch").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.ranahiromod.sumahiro_phone_music_gui.music_pitch").getString());
				else
					setSuggestion(null);
			}
		};
		music_pitch.setSuggestion(Component.translatable("gui.ranahiromod.sumahiro_phone_music_gui.music_pitch").getString());
		music_pitch.setMaxLength(32767);
		guistate.put("text:music_pitch", music_pitch);
		this.addWidget(this.music_pitch);
		imagebutton_iphone_button = new ImageButton(this.leftPos + 43, this.topPos + 186, 16, 16, 0, 0, 16, new ResourceLocation("ranahiromod:textures/screens/atlas/imagebutton_iphone_button.png"), 16, 32, e -> {
			if (true) {
				RanahiromodMod.PACKET_HANDLER.sendToServer(new SumahiroPhoneMusicGUIButtonMessage(0, x, y, z));
				SumahiroPhoneMusicGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_iphone_button", imagebutton_iphone_button);
		this.addRenderableWidget(imagebutton_iphone_button);
		imagebutton_play_button = new ImageButton(this.leftPos + 46, this.topPos + 162, 11, 11, 0, 0, 11, new ResourceLocation("ranahiromod:textures/screens/atlas/imagebutton_play_button.png"), 11, 22, e -> {
			if (SumahiroPhoneMusicConditionProcedure.execute(entity)) {
				RanahiromodMod.PACKET_HANDLER.sendToServer(new SumahiroPhoneMusicGUIButtonMessage(1, x, y, z));
				SumahiroPhoneMusicGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (SumahiroPhoneMusicConditionProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_play_button", imagebutton_play_button);
		this.addRenderableWidget(imagebutton_play_button);
		imagebutton_pause_button = new ImageButton(this.leftPos + 46, this.topPos + 162, 11, 11, 0, 0, 11, new ResourceLocation("ranahiromod:textures/screens/atlas/imagebutton_pause_button.png"), 11, 22, e -> {
			if (SumahiroPhoneMusicCondition1Procedure.execute(entity)) {
				RanahiromodMod.PACKET_HANDLER.sendToServer(new SumahiroPhoneMusicGUIButtonMessage(2, x, y, z));
				SumahiroPhoneMusicGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (SumahiroPhoneMusicCondition1Procedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_pause_button", imagebutton_pause_button);
		this.addRenderableWidget(imagebutton_pause_button);
	}
}
