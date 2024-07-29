package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.ranahiromod.init.RanahiromodModItems;
import net.mcreator.ranahiromod.RanahiromodMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class MysteriousDocumentItemIsCraftedsmeltedProcedure {
	@SubscribeEvent
	public static void onItemCrafted(PlayerEvent.ItemCraftedEvent event) {
		execute(event, event.getEntity().level(), event.getEntity(), event.getCrafting());
	}

	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		execute(null, world, entity, itemstack);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getItem() == RanahiromodModItems.MYSTERIOUS_DOCUMENT.get()) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(RanahiromodModItems.MYSTERIOUS_DOCUMENT.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			RanahiromodMod.queueServerWork(2, () -> {
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
										_ent.level().getServer(), _ent),
								"give @s ranahiromod:mysterious_document{AttributeModifiers:[{AttributeName:\"generic.max_health\",Name:\"generic.max_health\",Amount:30,Operation:0,UUID:[I;-334600150,-1132642189,-1999782570,-1416455489],Slot:\"offhand\"},{AttributeName:\"generic.movement_speed\",Name:\"generic.movement_speed\",Amount:0.1,Operation:0,UUID:[I;1339294416,1717650574,-1083738480,121952975],Slot:\"offhand\"},{AttributeName:\"generic.attack_speed\",Name:\"generic.attack_speed\",Amount:-2.5,Operation:0,UUID:[I;-198713216,-713931094,-1704178180,1371285892],Slot:\"offhand\"},{AttributeName:\"generic.attack_damage\",Name:\"generic.attack_damage\",Amount:20,Operation:0,UUID:[I;321251940,-1677571775,-1777773274,-233498709],Slot:\"offhand\"},{AttributeName:\"generic.armor\",Name:\"generic.armor\",Amount:10,Operation:0,UUID:[I;1299490251,286281721,-2042698928,-2002309156],Slot:\"offhand\"},{AttributeName:\"generic.armor_toughness\",Name:\"generic.armor_toughness\",Amount:10,Operation:0,UUID:[I;856885791,45171427,-1470682154,107705515],Slot:\"offhand\"},{AttributeName:\"generic.knockback_resistance\",Name:\"generic.knockback_resistance\",Amount:-0.5,Operation:0,UUID:[I;497801215,966085576,-2121760843,-2012789010],Slot:\"offhand\"}]} 1");
					}
				}
			});
		} else if (itemstack.getItem() == RanahiromodModItems.SEALED_MYSTERIOUS_DOCUMENT.get()) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(RanahiromodModItems.SEALED_MYSTERIOUS_DOCUMENT.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			RanahiromodMod.queueServerWork(2, () -> {
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
										_ent.level().getServer(), _ent),
								"give @s ranahiromod:sealed_mysterious_document{AttributeModifiers:[{AttributeName:\"generic.max_health\",Name:\"generic.max_health\",Amount:30,Operation:0,UUID:[I;-334600150,-1132642189,-1999782570,-1416455489],Slot:\"offhand\"},{AttributeName:\"generic.movement_speed\",Name:\"generic.movement_speed\",Amount:0.1,Operation:0,UUID:[I;1339294416,1717650574,-1083738480,121952975],Slot:\"offhand\"},{AttributeName:\"generic.attack_speed\",Name:\"generic.attack_speed\",Amount:2.5,Operation:0,UUID:[I;-198713216,-713931094,-1704178180,1371285892],Slot:\"offhand\"},{AttributeName:\"generic.attack_damage\",Name:\"generic.attack_damage\",Amount:20,Operation:0,UUID:[I;321251940,-1677571775,-1777773274,-233498709],Slot:\"offhand\"},{AttributeName:\"generic.armor\",Name:\"generic.armor\",Amount:10,Operation:0,UUID:[I;1299490251,286281721,-2042698928,-2002309156],Slot:\"offhand\"},{AttributeName:\"generic.armor_toughness\",Name:\"generic.armor_toughness\",Amount:10,Operation:0,UUID:[I;856885791,45171427,-1470682154,107705515],Slot:\"offhand\"},{AttributeName:\"generic.knockback_resistance\",Name:\"generic.knockback_resistance\",Amount:0.5,Operation:0,UUID:[I;497801215,966085576,-2121760843,-2012789010],Slot:\"offhand\"}]} 1");
					}
				}
			});
		}
	}
}
