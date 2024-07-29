package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

import net.mcreator.ranahiromod.network.RanahiromodModVariables;
import net.mcreator.ranahiromod.init.RanahiromodModItems;

import java.util.concurrent.atomic.AtomicReference;

public class StartSkillsProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double num1 = 0;
		double waza_add_counter = 0;
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
					if (itemstack.getItem() == RanahiromodModItems.SWORD_OF_BOSSHIRO.get()) {
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("WIP"), false);
					}
					if (itemstack.getItem() == RanahiromodModItems.RANAHIRO_SWORD.get()) {
						entity.getPersistentData().putDouble("skill2", (1 + itemstack.getOrCreateTag().getDouble("select2")));
					}
					if (itemstack.getItem() == RanahiromodModItems.LAVAHIRO_ITEM.get()) {
						entity.getPersistentData().putDouble("skill2", (101 + itemstack.getOrCreateTag().getDouble("select2")));
					}
					if (itemstack.getItem() == RanahiromodModItems.WATERHIRO_ITEM.get()) {
						entity.getPersistentData().putDouble("skill2", (201 + itemstack.getOrCreateTag().getDouble("select2")));
					}
					if (itemstack.getItem() == RanahiromodModItems.WINDHIRO_ITEM.get()) {
						entity.getPersistentData().putDouble("skill2", (301 + itemstack.getOrCreateTag().getDouble("select2")));
					}
					if (itemstack.getItem() == RanahiromodModItems.DRAGONHIRO_ITEM.get()) {
						entity.getPersistentData().putDouble("skill2", (401 + itemstack.getOrCreateTag().getDouble("select2")));
					}
					if (itemstack.getItem() == RanahiromodModItems.ONIHIRO_ITEM.get()) {
						entity.getPersistentData().putDouble("skill2", (501 + itemstack.getOrCreateTag().getDouble("select2")));
					}
					if (itemstack.getItem() == RanahiromodModItems.BOLTHIRO_ITEM.get()) {
						entity.getPersistentData().putDouble("skill2", (601 + itemstack.getOrCreateTag().getDouble("select2")));
					}
					if (itemstack.getItem() == RanahiromodModItems.FOSSILAOI_SWORD_ITEM.get()) {
						entity.getPersistentData().putDouble("skill2", (10000 + itemstack.getOrCreateTag().getDouble("select2")));
					}
					if (UsePlayerLogicMochiProcedure.execute(entity)) {
						if (itemstack.getItem() == RanahiromodModItems.MOTTIE_HAMMER.get()) {
							entity.getPersistentData().putDouble("skill2", (10101 + itemstack.getOrCreateTag().getDouble("select2")));
						}
					}
					if (itemstack.getItem() == RanahiromodModItems.SK_LINER_5077_BLADE.get()) {
						entity.getPersistentData().putDouble("skill2", (701 + itemstack.getOrCreateTag().getDouble("select2")));
					}
					if (itemstack.getItem() == RanahiromodModItems.WARDENHIRO_ITEM.get()) {
						entity.getPersistentData().putDouble("skill2", (801 + itemstack.getOrCreateTag().getDouble("select2")));
					}
					if (itemstack.getItem() == RanahiromodModItems.VAZAFILA_SWORD.get()) {
						entity.getPersistentData().putDouble("skill2", (901 + itemstack.getOrCreateTag().getDouble("select2")));
					}
					if (itemstack.getItem() == RanahiromodModItems.VAZAFILA_KATANA.get()) {
						entity.getPersistentData().putDouble("skill2", (907 + itemstack.getOrCreateTag().getDouble("select2")));
					}
					if (itemstack.getItem() == RanahiromodModItems.WEAPONHIRO_ITEM.get()) {
						itemstack.getOrCreateTag().putDouble("cnt_num", 1);
						itemstack.getOrCreateTag().putDouble("skilluse_num", 0);
						entity.getPersistentData().putDouble("skill2", 1001);
					}
					if (itemstack.getItem() == RanahiromodModItems.HOLY_SWORD.get() || itemstack.getItem() == RanahiromodModItems.DEVIL_SWORD.get() || itemstack.getItem() == RanahiromodModItems.YOTO.get()) {
						entity.getPersistentData().putDouble("skill2", (1002 + itemstack.getOrCreateTag().getDouble("select2")));
					}
					if (itemstack.getItem() == RanahiromodModItems.MELAMAIN_ROD.get()) {
						entity.getPersistentData().putDouble("skill2", (1101 + itemstack.getOrCreateTag().getDouble("select2")));
					}
					if (itemstack.getItem() == RanahiromodModItems.MARUCHI_100_SWORD.get()) {
						entity.getPersistentData().putDouble("skill2", (1201 + itemstack.getOrCreateTag().getDouble("select2")));
					}
					if (itemstack.getItem() == RanahiromodModItems.SPLADOT_ROD.get()) {
						entity.getPersistentData().putDouble("skill2", (1301 + itemstack.getOrCreateTag().getDouble("select2")));
					}
					if (itemstack.getItem() == RanahiromodModItems.WIND_MAGIC.get()) {
						entity.getPersistentData().putDouble("skill2", (1401 + itemstack.getOrCreateTag().getDouble("select2")));
					}
					if (itemstack.getItem() == RanahiromodModItems.GROUNDHIRO_ITEM.get()) {
						entity.getPersistentData().putDouble("skill2", (1501 + itemstack.getOrCreateTag().getDouble("select2")));
					}
					if ((entity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).Job == 3 && itemstack.getItem() == RanahiromodModItems.SUN_ROD.get()) {
						entity.getPersistentData().putDouble("skill2", (20201 + (entity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).ChangeOtherSkillKeyCounter));
					} else if ((entity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).Job == 6 && itemstack.getItem() == RanahiromodModItems.SUN_ROD.get()) {
						entity.getPersistentData().putDouble("skill2", (20501 + (entity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).ChangeOtherSkillKeyCounter));
					} else {
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal((itemstack.getOrCreateTag().getString("waza_name"))), true);
						{
							AtomicReference<IItemHandler> _iitemhandlerref = new AtomicReference<>();
							entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(_iitemhandlerref::set);
							if (_iitemhandlerref.get() != null) {
								for (int _idx = 0; _idx < _iitemhandlerref.get().getSlots(); _idx++) {
									ItemStack itemstackiterator = _iitemhandlerref.get().getStackInSlot(_idx).copy();
									if (itemstackiterator.is(ItemTags.create(new ResourceLocation("ranahiromod:ranahiro_mod_art_tag")))) {
										if (entity instanceof Player _player)
											_player.getCooldowns().addCooldown(itemstackiterator.getItem(), (int) CooltimeProcedure.execute(entity));
									}
								}
							}
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
