package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.ranahiromod.network.RanahiromodModVariables;
import net.mcreator.ranahiromod.init.RanahiromodModItems;
import net.mcreator.ranahiromod.RanahiromodMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class RanahiroArmorCraftingProcedure {
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
		{
			double _setval = (entity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).gamer_score + Math.ceil(Math.random() * 3);
			entity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.gamer_score = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		if (itemstack.getItem() == RanahiromodModItems.RANAHIRO_PLATE_ARMOR_HELMET.get()) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = itemstack;
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			RanahiromodMod.queueServerWork(2, () -> {
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
										_ent.level().getServer(), _ent),
								"give @s ranahiromod:ranahiro_plate_armor_helmet{Enchantments:[{id:\"minecraft:protection\",lvl:5s}],AttributeModifiers:[{AttributeName:\"generic.max_health\",Name:\"generic.max_health\",Amount:10,Operation:0,UUID:[I;-1849741307,-1822145097,-1720481264,-123760472],Slot:\"head\"},{AttributeName:\"generic.armor\",Name:\"generic.armor\",Amount:7,Operation:0,UUID:[I;2134728688,81872191,-1500038455,1924191971],Slot:\"head\"},{AttributeName:\"generic.armor_toughness\",Name:\"generic.armor_toughness\",Amount:2,Operation:0,UUID:[I;-1568324462,-1745076143,-2142144050,1869547499],Slot:\"head\"}]} 1");
					}
				}
			});
		}
		if (itemstack.getItem() == RanahiromodModItems.RANAHIRO_PLATE_ARMOR_CHESTPLATE.get()) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = itemstack;
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			RanahiromodMod.queueServerWork(2, () -> {
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
										_ent.level().getServer(), _ent),
								"give @s ranahiromod:ranahiro_plate_armor_chestplate{Enchantments:[{id:\"minecraft:protection\",lvl:5s}],AttributeModifiers:[{AttributeName:\"generic.max_health\",Name:\"generic.max_health\",Amount:10,Operation:0,UUID:[I;-705460663,-2067707578,-1292809900,-1674386629],Slot:\"chest\"},{AttributeName:\"generic.armor\",Name:\"generic.armor\",Amount:18,Operation:0,UUID:[I;639396771,113854956,-1887759475,936292894],Slot:\"chest\"},{AttributeName:\"generic.armor_toughness\",Name:\"generic.armor_toughness\",Amount:4,Operation:0,UUID:[I;1717335268,1025855332,-1249466346,1740497392],Slot:\"chest\"}]} 1");
					}
				}
			});
		}
		if (itemstack.getItem() == RanahiromodModItems.RANAHIRO_PLATE_ARMOR_LEGGINGS.get()) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = itemstack;
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			RanahiromodMod.queueServerWork(2, () -> {
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
										_ent.level().getServer(), _ent),
								"give @s ranahiromod:ranahiro_plate_armor_leggings{Enchantments:[{id:\"minecraft:protection\",lvl:5s}],AttributeModifiers:[{AttributeName:\"generic.max_health\",Name:\"generic.max_health\",Amount:10,Operation:0,UUID:[I;1180858634,1727941524,-1292680669,-1285845422],Slot:\"legs\"},{AttributeName:\"generic.armor\",Name:\"generic.armor\",Amount:21,Operation:0,UUID:[I;983814661,-1364243975,-2040914497,-320797840],Slot:\"legs\"},{AttributeName:\"generic.armor_toughness\",Name:\"generic.armor_toughness\",Amount:3,Operation:0,UUID:[I;-237220931,-753186416,-1230086698,1647711371],Slot:\"legs\"}]} 1");
					}
				}
			});
		}
		if (itemstack.getItem() == RanahiromodModItems.RANAHIRO_PLATE_ARMOR_BOOTS.get()) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = itemstack;
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			RanahiromodMod.queueServerWork(2, () -> {
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
										_ent.level().getServer(), _ent),
								"give @s ranahiromod:ranahiro_plate_armor_boots{Enchantments:[{id:\"minecraft:protection\",lvl:5s}],AttributeModifiers:[{AttributeName:\"generic.max_health\",Name:\"generic.max_health\",Amount:10,Operation:0,UUID:[I;-898121805,-63158214,-1431326369,933709500],Slot:\"feet\"},{AttributeName:\"generic.armor\",Name:\"generic.armor\",Amount:7,Operation:0,UUID:[I;-421276971,1384530076,-1990543200,-1188832436],Slot:\"feet\"},{AttributeName:\"generic.armor_toughness\",Name:\"generic.armor_toughness\",Amount:2,Operation:0,UUID:[I;-909782112,-373276184,-1999760287,-9412823],Slot:\"feet\"}]} 1");
					}
				}
			});
		}
		if (itemstack.getItem() == RanahiromodModItems.MECHANISM_ARMOR_HELMET.get()) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = itemstack;
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			RanahiromodMod.queueServerWork(2, () -> {
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
										_ent.level().getServer(), _ent),
								"give @s ranahiromod:mechanism_armor_helmet{Unbreakable:1b,Enchantments:[{id:\"minecraft:protection\",lvl:15s},{id:\"minecraft:fire_protection\",lvl:15s},{id:\"minecraft:feather_falling\",lvl:15s},{id:\"minecraft:blast_protection\",lvl:15s},{id:\"minecraft:projectile_protection\",lvl:15s},{id:\"minecraft:respiration\",lvl:3s},{id:\"minecraft:aqua_affinity\",lvl:1s},{id:\"minecraft:thorns\",lvl:15s},{id:\"minecraft:depth_strider\",lvl:15s},{id:\"minecraft:soul_speed\",lvl:15s}],AttributeModifiers:[{AttributeName:\"generic.max_health\",Name:\"generic.max_health\",Amount:0.25,Operation:2,UUID:[I;-1461910030,-2036708305,-1797341074,-117958807],Slot:\"head\"},{AttributeName:\"generic.movement_speed\",Name:\"generic.movement_speed\",Amount:0.05,Operation:2,UUID:[I;-1460033364,1584089735,-1669545749,1866822559],Slot:\"head\"},{AttributeName:\"generic.attack_speed\",Name:\"generic.attack_speed\",Amount:0.4,Operation:2,UUID:[I;-152366735,1481853068,-1561881292,1204520023],Slot:\"head\"},{AttributeName:\"generic.attack_damage\",Name:\"generic.attack_damage\",Amount:0.35,Operation:2,UUID:[I;1043155332,1734100028,-1581487085,-15996985],Slot:\"head\"},{AttributeName:\"generic.armor_toughness\",Name:\"generic.armor_toughness\",Amount:10,Operation:0,UUID:[I;15172107,-289651664,-1801330033,563494717],Slot:\"head\"},{AttributeName:\"generic.knockback_resistance\",Name:\"generic.knockback_resistance\",Amount:1,Operation:0,UUID:[I;-1577179690,1227440531,-1576450109,-1273239769],Slot:\"head\"},{AttributeName:\"generic.armor\",Name:\"generic.armor\",Amount:30,Operation:0,UUID:[I;-1147580041,75252902,-1974706824,738243834],Slot:\"head\"}]} 1");
					}
				}
			});
		}
		if (itemstack.getItem() == RanahiromodModItems.MECHANISM_ARMOR_CHESTPLATE.get()) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = itemstack;
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			RanahiromodMod.queueServerWork(2, () -> {
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
										_ent.level().getServer(), _ent),
								"give @s ranahiromod:mechanism_armor_chestplate{Unbreakable:1b,Enchantments:[{id:\"minecraft:protection\",lvl:15s},{id:\"minecraft:fire_protection\",lvl:15s},{id:\"minecraft:feather_falling\",lvl:15s},{id:\"minecraft:blast_protection\",lvl:15s},{id:\"minecraft:projectile_protection\",lvl:15s},{id:\"minecraft:respiration\",lvl:3s},{id:\"minecraft:aqua_affinity\",lvl:1s},{id:\"minecraft:thorns\",lvl:15s},{id:\"minecraft:depth_strider\",lvl:15s},{id:\"minecraft:soul_speed\",lvl:15s}],AttributeModifiers:[{AttributeName:\"generic.armor\",Name:\"generic.armor\",Amount:30,Operation:0,UUID:[I;-685884512,-1201257566,-1753091674,-1994617786],Slot:\"chest\"},{AttributeName:\"generic.attack_damage\",Name:\"generic.attack_damage\",Amount:0.35,Operation:2,UUID:[I;724225784,-1283437890,-1319085226,171733561],Slot:\"chest\"},{AttributeName:\"generic.knockback_resistance\",Name:\"generic.knockback_resistance\",Amount:1,Operation:0,UUID:[I;1381572680,-558808294,-2060572622,1282446777],Slot:\"chest\"},{AttributeName:\"generic.movement_speed\",Name:\"generic.movement_speed\",Amount:0.05,Operation:2,UUID:[I;1692540515,312164584,-1456856801,-413518670],Slot:\"chest\"},{AttributeName:\"generic.max_health\",Name:\"generic.max_health\",Amount:0.25,Operation:2,UUID:[I;1931727692,1774272641,-2114358574,-1417447708],Slot:\"chest\"},{AttributeName:\"generic.armor_toughness\",Name:\"generic.armor_toughness\",Amount:10,Operation:0,UUID:[I;389398429,1906066852,-1296538295,-2130958741],Slot:\"chest\"},{AttributeName:\"generic.attack_speed\",Name:\"generic.attack_speed\",Amount:0.4,Operation:2,UUID:[I;-907985235,1380729027,-1514166545,1645071935],Slot:\"chest\"}]} 1");
					}
				}
			});
		}
		if (itemstack.getItem() == RanahiromodModItems.MECHANISM_ARMOR_LEGGINGS.get()) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = itemstack;
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			RanahiromodMod.queueServerWork(2, () -> {
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
										_ent.level().getServer(), _ent),
								"give @s ranahiromod:mechanism_armor_leggings{Unbreakable:1b,Enchantments:[{id:\"minecraft:protection\",lvl:15s},{id:\"minecraft:fire_protection\",lvl:15s},{id:\"minecraft:feather_falling\",lvl:15s},{id:\"minecraft:blast_protection\",lvl:15s},{id:\"minecraft:projectile_protection\",lvl:15s},{id:\"minecraft:respiration\",lvl:3s},{id:\"minecraft:aqua_affinity\",lvl:1s},{id:\"minecraft:thorns\",lvl:15s},{id:\"minecraft:depth_strider\",lvl:15s},{id:\"minecraft:soul_speed\",lvl:15s}],AttributeModifiers:[{AttributeName:\"generic.max_health\",Name:\"generic.max_health\",Amount:0.25,Operation:2,UUID:[I;-67376431,-968603207,-1434336930,374348649],Slot:\"legs\"},{AttributeName:\"generic.movement_speed\",Name:\"generic.movement_speed\",Amount:0.05,Operation:2,UUID:[I;278998190,-54899287,-1137673012,631158300],Slot:\"legs\"},{AttributeName:\"generic.attack_speed\",Name:\"generic.attack_speed\",Amount:0.4,Operation:2,UUID:[I;818096059,2050704775,-1664788111,-328477712],Slot:\"legs\"},{AttributeName:\"generic.attack_damage\",Name:\"generic.attack_damage\",Amount:0.35,Operation:2,UUID:[I;433862468,1706639996,-2143403344,-982975071],Slot:\"legs\"},{AttributeName:\"generic.armor_toughness\",Name:\"generic.armor_toughness\",Amount:10,Operation:0,UUID:[I;-1598282547,-1470413306,-1469427395,1408152894],Slot:\"legs\"},{AttributeName:\"generic.knockback_resistance\",Name:\"generic.knockback_resistance\",Amount:1,Operation:0,UUID:[I;-1705868601,837435924,-1593796696,532216824],Slot:\"legs\"},{AttributeName:\"generic.armor\",Name:\"generic.armor\",Amount:30,Operation:0,UUID:[I;1760848255,-1927396047,-1389899439,851546375],Slot:\"legs\"}]} 1");
					}
				}
			});
		}
		if (itemstack.getItem() == RanahiromodModItems.MECHANISM_ARMOR_BOOTS.get()) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = itemstack;
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			RanahiromodMod.queueServerWork(2, () -> {
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
										_ent.level().getServer(), _ent),
								"give @s ranahiromod:mechanism_armor_boots{Unbreakable:1b,Enchantments:[{id:\"minecraft:protection\",lvl:15s},{id:\"minecraft:fire_protection\",lvl:15s},{id:\"minecraft:feather_falling\",lvl:15s},{id:\"minecraft:blast_protection\",lvl:15s},{id:\"minecraft:projectile_protection\",lvl:15s},{id:\"minecraft:respiration\",lvl:3s},{id:\"minecraft:aqua_affinity\",lvl:1s},{id:\"minecraft:thorns\",lvl:15s},{id:\"minecraft:depth_strider\",lvl:15s},{id:\"minecraft:soul_speed\",lvl:15s}],AttributeModifiers:[{AttributeName:\"generic.max_health\",Name:\"generic.max_health\",Amount:0.25,Operation:2,UUID:[I;-1481604536,-927446623,-1112705031,1762107705],Slot:\"feet\"},{AttributeName:\"generic.movement_speed\",Name:\"generic.movement_speed\",Amount:0.05,Operation:2,UUID:[I;663269263,1517895854,-1888206894,1222358148],Slot:\"feet\"},{AttributeName:\"generic.attack_speed\",Name:\"generic.attack_speed\",Amount:0.4,Operation:2,UUID:[I;-1897587050,-1207483673,-1861015188,164859666],Slot:\"feet\"},{AttributeName:\"generic.attack_damage\",Name:\"generic.attack_damage\",Amount:0.35,Operation:2,UUID:[I;1889103504,214386034,-2040664621,-303015214],Slot:\"feet\"},{AttributeName:\"generic.armor_toughness\",Name:\"generic.armor_toughness\",Amount:10,Operation:0,UUID:[I;1845070599,791824867,-1827253757,2027466467],Slot:\"feet\"},{AttributeName:\"generic.knockback_resistance\",Name:\"generic.knockback_resistance\",Amount:1,Operation:0,UUID:[I;543119037,-695252951,-1482302052,-2135341990],Slot:\"feet\"},{AttributeName:\"generic.armor\",Name:\"generic.armor\",Amount:30,Operation:0,UUID:[I;-222143094,-1370338161,-1242564269,-620280767],Slot:\"feet\"}]} 1");
					}
				}
			});
		}
		if (itemstack.getItem() == RanahiromodModItems.TAICHAN_BOW.get()) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = itemstack;
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			RanahiromodMod.queueServerWork(2, () -> {
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
										_ent.level().getServer(), _ent),
								"give @s ranahiromod:taichan_bow{Enchantments:[{id:\"minecraft:power\",lvl:10s},{id:\"minecraft:punch\",lvl:10s},{id:\"minecraft:flame\",lvl:1s}],AttributeModifiers:[{AttributeName:\"generic.movement_speed\",Name:\"generic.movement_speed\",Amount:10,Operation:2,UUID:[I;-1943574472,-1742584909,-1790304205,1929555167],Slot:\"mainhand\"},{AttributeName:\"generic.movement_speed\",Name:\"generic.movement_speed\",Amount:10,Operation:2,UUID:[I;-1749562798,1110724231,-1903976372,1514267176],Slot:\"offhand\"}]} 1");
					}
				}
			});
		}
		if (itemstack.getItem() == RanahiromodModItems.TREASURE_CHEST_ITEM.get()) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = itemstack;
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			RanahiromodMod.queueServerWork(2, () -> {
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "give @s chest{BlockEntityTag:{LootTable:\"ranahiromod:chests/treasure\"}} 1");
					}
				}
			});
		}
		if (itemstack.getItem() == RanahiromodModItems.RANAHIRO_INGOT.get()) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u3053\u306E\u5BC6\u5EA6...\u30B3\u30EF\u30A4\u30CD\u30A7\uFF5E..."), false);
		}
		if (itemstack.getItem() == RanahiromodModItems.SOUL_GRIEF_INGOT.get()) {
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal((entity.getDisplayName().getString() + "\u304C\u3053\u308F\u3059\u3093\u304Ewwwww")), false);
		}
		if (itemstack.getItem() == RanahiromodModItems.RANAZMANIUM_INGOT.get()) {
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal((entity.getDisplayName().getString() + "\u3001\u3053\u306E\u4EBA\u3063\u3066\u30C1\u30FC\u30BF\u30FC\u3058\u3083\u306D!?")), false);
		}
		if (itemstack.getItem() == Items.DIAMOND_HELMET || itemstack.getItem() == Items.DIAMOND_CHESTPLATE || itemstack.getItem() == Items.DIAMOND_LEGGINGS || itemstack.getItem() == Items.DIAMOND_BOOTS) {
			if (Math.random() < 0.1) {
				itemstack.enchant(Enchantments.ALL_DAMAGE_PROTECTION, (int) Math.ceil(Math.random() * 4));
				itemstack.enchant(Enchantments.UNBREAKING, (int) Math.ceil(Math.random() * 3));
			}
		}
		if (itemstack.getItem() == Items.IRON_HELMET || itemstack.getItem() == Items.IRON_CHESTPLATE || itemstack.getItem() == Items.IRON_LEGGINGS || itemstack.getItem() == Items.IRON_BOOTS) {
			if (Math.random() < 0.15) {
				itemstack.enchant(Enchantments.ALL_DAMAGE_PROTECTION, (int) Math.ceil(Math.random() * 2));
				itemstack.enchant(Enchantments.UNBREAKING, (int) Math.ceil(Math.random() * 3));
			}
		}
	}
}
