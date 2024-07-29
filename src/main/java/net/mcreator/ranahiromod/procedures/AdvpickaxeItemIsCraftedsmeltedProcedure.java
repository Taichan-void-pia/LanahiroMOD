package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.ranahiromod.init.RanahiromodModItems;
import net.mcreator.ranahiromod.RanahiromodMod;

public class AdvpickaxeItemIsCraftedsmeltedProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getItem() == RanahiromodModItems.ADVPICKAXE.get()) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(RanahiromodModItems.ADVPICKAXE.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			RanahiromodMod.queueServerWork(2, () -> {
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
										_ent.level().getServer(), _ent),
								"give @s wooden_pickaxe{CanDestroy:[\"minecraft:spawner\",\"minecraft:torch\",\"minecraft:vine\"],display:{Name:'{\"text\":\"\u30A2\u30C9\u30D9\u30F3\u30C1\u30E3\u30FC\u30D4\u30C3\u30B1\u30EB\",\"color\":\"red\",\"bold\":true,\"underlined\":true}'},Enchantments:[{}],AttributeModifiers:[{AttributeName:\"generic.knockback_resistance\",Name:\"generic.knockback_resistance\",Amount:-1,Operation:1,UUID:[I;2093979814,923093626,-1495513270,-1645623530],Slot:\"mainhand\"},{AttributeName:\"generic.knockback_resistance\",Name:\"generic.knockback_resistance\",Amount:-1,Operation:1,UUID:[I;-765483519,-1127594466,-2100397268,1212422770],Slot:\"offhand\"}]} 1");
					}
				}
			});
		}
		if (itemstack.getItem() == RanahiromodModItems.SPAWNER_BREAKER.get()) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(RanahiromodModItems.SPAWNER_BREAKER.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			RanahiromodMod.queueServerWork(2, () -> {
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
										_ent.level().getServer(), _ent),
								"give @s diamond_pickaxe{CanDestroy:[\"minecraft:spawner\",\"minecraft:torch\",\"minecraft:vine\"],display:{Name:'{\"text\":\"\u30B9\u30DD\u30CA\u30FC\u30D6\u30EC\u30A4\u30AB\u30FC\",\"color\":\"aqua\",\"bold\":true,\"underlined\":true}'},Enchantments:[{}],AttributeModifiers:[{AttributeName:\"generic.knockback_resistance\",Name:\"generic.knockback_resistance\",Amount:-1,Operation:1,UUID:[I;2093979814,923093626,-1495513270,-1645623530],Slot:\"mainhand\"},{AttributeName:\"generic.knockback_resistance\",Name:\"generic.knockback_resistance\",Amount:-1,Operation:1,UUID:[I;-765483519,-1127594466,-2100397268,1212422770],Slot:\"offhand\"}]} 1");
					}
				}
			});
		}
	}
}
