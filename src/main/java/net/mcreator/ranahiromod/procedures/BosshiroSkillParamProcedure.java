package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.ranahiromod.init.RanahiromodModItems;

public class BosshiroSkillParamProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		String color = "";
		String name = "";
		String base = "";
		double cooltime = 0;
		double item_select_num = 0;
		double waza_add_counter = 0;
		double num1 = 0;
		double num2 = 0;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RanahiromodModItems.SWORD_OF_BOSSHIRO.get()) {
			item_select_num = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("select2");
			num1 = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("select2") + 1;
			if (num1 > 43 && num1 <= 46) {
				base = "weapon";
				color = "\u00A71\u00A7l";
				num2 = num1 - 43;
			} else if (num1 > 40) {
				base = "warden";
				color = "\u00A71\u00A7l";
				num2 = num1 - 40;
			} else if (num1 > 36) {
				base = "volt";
				color = "\u00A7e\u00A7l";
				num2 = num1 - 36;
			} else if (num1 > 31) {
				base = "oni";
				color = "\u00A74\u00A7l";
				num2 = num1 - 31;
			} else if (num1 > 27) {
				base = "dragon";
				color = "\u00A77\u00A7l";
				num2 = num1 - 27;
			} else if (num1 > 22) {
				base = "wind";
				color = "\u00A7a\u00A7l";
				num2 = num1 - 22;
			} else if (num1 > 15) {
				base = "water";
				color = "\u00A7b\u00A7l";
				num2 = num1 - 15;
			} else if (num1 > 8) {
				base = "lava";
				color = "\u00A7c\u00A7l";
				num2 = num1 - 8;
			} else if (num1 >= 1) {
				base = "rana";
				color = "\u00A74\u00A7l";
				num2 = num1;
			}
			if (item_select_num > 44) {
				(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("select2", 0);
				base = "rana";
				color = "\u00A74\u00A7l";
			} else if (item_select_num < 0) {
				(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("select2", 44);
				base = "weapon";
			}
			name = color + "" + Component.translatable((base + "hiro.skill." + Math.round(num2))).getString();
			(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putString("waza_name", name);
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(name), false);
		} else {
			base = "rana";
			color = "\u00A74\u00A7l";
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("select2") == 0) {
				cooltime = 80;
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("select2") == 1) {
				cooltime = 100;
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("select2") == 2) {
				cooltime = 70;
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("select2") == 3) {
				cooltime = 100;
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("select2") == 4) {
				cooltime = 110;
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("select2") == 5) {
				cooltime = 90;
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("select2") == 6) {
				cooltime = 130;
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("select2") == 7) {
				cooltime = 120;
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("select2") > 7) {
				(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("select2", 0);
				cooltime = 80;
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("select2") < 0) {
				(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("select2", 7);
				cooltime = 120;
			}
			name = color + "" + (Component.translatable((base + "hiro.skill." + Math.round((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("select2") + 1))).getString());
			(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putString("waza_name", name);
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(name), false);
		}
	}
}
