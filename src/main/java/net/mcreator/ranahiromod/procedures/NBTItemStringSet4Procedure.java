package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.CommandSourceStack;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.StringArgumentType;

public class NBTItemStringSet4Procedure {
	public static void execute(CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		ItemStack item_stacks = ItemStack.EMPTY;
		if (!(((new Object() {
			public Entity getEntity() {
				try {
					return EntityArgument.getEntity(arguments, "selector");
				} catch (CommandSyntaxException e) {
					e.printStackTrace();
					return null;
				}
			}
		}.getEntity()) instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem())) {
			item_stacks = ((new Object() {
				public Entity getEntity() {
					try {
						return EntityArgument.getEntity(arguments, "selector");
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return null;
					}
				}
			}.getEntity()) instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY);
			item_stacks.getOrCreateTag().putString((StringArgumentType.getString(arguments, "tagname")), (StringArgumentType.getString(arguments, "string")));
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(((new Object() {
					public Entity getEntity() {
						try {
							return EntityArgument.getEntity(arguments, "selector");
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return null;
						}
					}
				}.getEntity()).getDisplayName().getString() + "" + ("\u306E\u30A2\u30A4\u30C6\u30E0\u300C" + item_stacks.getDisplayName().getString() + "\u300D\u306E\u30BF\u30B0\u540D\u300C" + StringArgumentType.getString(arguments, "tagname")
						+ "\u300D\u3092" + StringArgumentType.getString(arguments, "string") + "\u306B\u8A2D\u5B9A\u3057\u307E\u3057\u305F\u3002"))), false);
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(((new Object() {
					public Entity getEntity() {
						try {
							return EntityArgument.getEntity(arguments, "selector");
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return null;
						}
					}
				}.getEntity()).getDisplayName().getString() + "" + ("\u306E\u30A2\u30A4\u30C6\u30E0\u300C" + "\u7A7A\u6C17" + "\u300D\u306E\u30BF\u30B0\u306F" + "\u5909\u66F4\u3067\u304D\u307E\u305B\u3093\u3002" + "" + "" + ""))), false);
		}
	}
}
