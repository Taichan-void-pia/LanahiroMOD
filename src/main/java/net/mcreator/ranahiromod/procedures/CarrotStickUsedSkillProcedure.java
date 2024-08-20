package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.ranahiromod.network.RanahiromodModVariables;

public class CarrotStickUsedSkillProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double num1 = 0;
		double waza_add_counter = 0;
		ItemStack mainhand_item = ItemStack.EMPTY;
		ItemStack offhand_item = ItemStack.EMPTY;
		boolean test_used_carrot = false;
		boolean test_failed = false;
		if ((entity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).Job != 7) {
			if (entity.getPersistentData().getDouble("skill2_swing") == 0) {
				if (entity.getPersistentData().getDouble("skill2") == 0) {
					entity.getPersistentData().putDouble("cnt1", 0);
					entity.getPersistentData().putDouble("cnt2", 0);
					entity.getPersistentData().putDouble("cnt3", 0);
					entity.getPersistentData().putDouble("cnt4", 0);
					entity.getPersistentData().putDouble("cnt5", 0);
					entity.getPersistentData().putDouble("cnt6", 0);
					entity.getPersistentData().putDouble("dis", 0);
					entity.getPersistentData().putDouble("NameRanged", 0);
					entity.getPersistentData().putDouble("x_pos", 0);
					entity.getPersistentData().putDouble("y_pos", 0);
					entity.getPersistentData().putDouble("z_pos", 0);
					entity.getPersistentData().putDouble("x_pos2", 0);
					entity.getPersistentData().putDouble("y_pos2", 0);
					entity.getPersistentData().putDouble("z_pos2", 0);
					entity.getPersistentData().putDouble("x_pos3", 0);
					entity.getPersistentData().putDouble("y_pos3", 0);
					entity.getPersistentData().putDouble("z_pos3", 0);
					entity.getPersistentData().putBoolean("loop", false);
					entity.getPersistentData().putBoolean("flag_a", false);
					entity.getPersistentData().putBoolean("flag_b", false);
					entity.getPersistentData().putDouble("skill2", 0);
					mainhand_item = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
					offhand_item = (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY);
					if (mainhand_item.getItem() == Items.CARROT_ON_A_STICK || offhand_item.getItem() == Items.CARROT_ON_A_STICK) {
						if ((entity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).Job == 3) {
							if (mainhand_item.getItem() == Items.CARROT_ON_A_STICK && mainhand_item.getOrCreateTag().getDouble("skill2_num") != 0) {
								entity.getPersistentData().putDouble("skill2", (mainhand_item.getOrCreateTag().getDouble("skill2_num")));
							} else if ((mainhand_item.getItem() == (entity instanceof LivingEntity _entUseItem31 ? _entUseItem31.getUseItem() : ItemStack.EMPTY).getItem() ? false : offhand_item.getItem() == Items.CARROT_ON_A_STICK)
									&& offhand_item.getOrCreateTag().getDouble("skill2_num") != 0) {
								entity.getPersistentData().putDouble("skill2", (offhand_item.getOrCreateTag().getDouble("skill2_num")));
								test_used_carrot = true;
							} else {
								test_failed = true;
							}
						} else if ((entity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).Job == 6) {
							if (mainhand_item.getItem() == Items.CARROT_ON_A_STICK && mainhand_item.getOrCreateTag().getDouble("skill2_num") != 0) {
								entity.getPersistentData().putDouble("skill2", (mainhand_item.getOrCreateTag().getDouble("skill2_num")));
							} else if ((mainhand_item.getItem() == (entity instanceof LivingEntity _entUseItem41 ? _entUseItem41.getUseItem() : ItemStack.EMPTY).getItem() ? false : offhand_item.getItem() == Items.CARROT_ON_A_STICK)
									&& offhand_item.getOrCreateTag().getDouble("skill2_num") != 0) {
								entity.getPersistentData().putDouble("skill2", (offhand_item.getOrCreateTag().getDouble("skill2_num")));
								test_used_carrot = true;
							} else {
								test_failed = true;
							}
						}
						if (test_failed) {
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal("\u30A2\u30A4\u30C6\u30E0\u306E\u4F7F\u7528\u4E2D\u3067\u3059\u3002"), true);
						} else {
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal(((entity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).WazaString)), true);
						}
					}
				} else {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("\u4ED6\u306E\u6280\u3092\u4F7F\u7528\u4E2D\u3067\u3059\u3002"), true);
				}
			}
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u3042\u306A\u305F\u306F\u30CB\u30FC\u30C8\u306A\u306E\u3067\u6280\u3092\u4F7F\u7528\u3067\u304D\u307E\u305B\u3093\uFF01"), false);
		}
	}
}
