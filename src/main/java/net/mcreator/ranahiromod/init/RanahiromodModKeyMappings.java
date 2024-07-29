
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ranahiromod.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.ranahiromod.network.ProjectileItemShootKeyMessage;
import net.mcreator.ranahiromod.network.EnchantKeyMessage;
import net.mcreator.ranahiromod.network.EkeyMessage;
import net.mcreator.ranahiromod.network.DoubleJumpKeyMessage;
import net.mcreator.ranahiromod.network.ChangeSkillMessage;
import net.mcreator.ranahiromod.network.ChangeOtherSkillMessage;
import net.mcreator.ranahiromod.network.AvoidTriggerVkeyMessage;
import net.mcreator.ranahiromod.RanahiromodMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class RanahiromodModKeyMappings {
	public static final KeyMapping CHANGE_SKILL = new KeyMapping("key.ranahiromod.change_skill", GLFW.GLFW_KEY_R, "key.categories.ranahiromod") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				RanahiromodMod.PACKET_HANDLER.sendToServer(new ChangeSkillMessage(0, 0));
				ChangeSkillMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping CHANGE_OTHER_SKILL = new KeyMapping("key.ranahiromod.change_other_skill", GLFW.GLFW_KEY_G, "key.categories.ranahiromod") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				RanahiromodMod.PACKET_HANDLER.sendToServer(new ChangeOtherSkillMessage(0, 0));
				ChangeOtherSkillMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping DOUBLE_JUMP_KEY = new KeyMapping("key.ranahiromod.double_jump_key", GLFW.GLFW_KEY_SPACE, "key.categories.ranahiromod") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				RanahiromodMod.PACKET_HANDLER.sendToServer(new DoubleJumpKeyMessage(0, 0));
				DoubleJumpKeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping PROJECTILE_ITEM_SHOOT_KEY = new KeyMapping("key.ranahiromod.projectile_item_shoot_key", GLFW.GLFW_KEY_LEFT_SHIFT, "key.categories.ranahiromod") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				PROJECTILE_ITEM_SHOOT_KEY_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - PROJECTILE_ITEM_SHOOT_KEY_LASTPRESS);
				RanahiromodMod.PACKET_HANDLER.sendToServer(new ProjectileItemShootKeyMessage(1, dt));
				ProjectileItemShootKeyMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping ENCHANT_KEY = new KeyMapping("key.ranahiromod.enchant_key", GLFW.GLFW_KEY_X, "key.categories.ranahiromod") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				RanahiromodMod.PACKET_HANDLER.sendToServer(new EnchantKeyMessage(0, 0));
				EnchantKeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping EKEY = new KeyMapping("key.ranahiromod.ekey", GLFW.GLFW_KEY_E, "key.categories.a") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				RanahiromodMod.PACKET_HANDLER.sendToServer(new EkeyMessage(0, 0));
				EkeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping AVOID_TRIGGER_VKEY = new KeyMapping("key.ranahiromod.avoid_trigger_vkey", GLFW.GLFW_KEY_V, "key.categories.ranahiromod") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				RanahiromodMod.PACKET_HANDLER.sendToServer(new AvoidTriggerVkeyMessage(0, 0));
				AvoidTriggerVkeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	private static long PROJECTILE_ITEM_SHOOT_KEY_LASTPRESS = 0;

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(CHANGE_SKILL);
		event.register(CHANGE_OTHER_SKILL);
		event.register(DOUBLE_JUMP_KEY);
		event.register(PROJECTILE_ITEM_SHOOT_KEY);
		event.register(ENCHANT_KEY);
		event.register(EKEY);
		event.register(AVOID_TRIGGER_VKEY);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				CHANGE_SKILL.consumeClick();
				CHANGE_OTHER_SKILL.consumeClick();
				DOUBLE_JUMP_KEY.consumeClick();
				PROJECTILE_ITEM_SHOOT_KEY.consumeClick();
				ENCHANT_KEY.consumeClick();
				EKEY.consumeClick();
				AVOID_TRIGGER_VKEY.consumeClick();
			}
		}
	}
}
