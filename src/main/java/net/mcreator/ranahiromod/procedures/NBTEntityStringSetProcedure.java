package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.CommandSourceStack;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.StringArgumentType;

public class NBTEntityStringSetProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		(new Object() {
			public Entity getEntity() {
				try {
					return EntityArgument.getEntity(arguments, "selector");
				} catch (CommandSyntaxException e) {
					e.printStackTrace();
					return null;
				}
			}
		}.getEntity()).getPersistentData().putString((StringArgumentType.getString(arguments, "tagname")), (StringArgumentType.getString(arguments, "string")));
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
			}.getEntity()).getDisplayName().getString() + "" + ("\u306E" + StringArgumentType.getString(arguments, "tagname") + "\u3092" + StringArgumentType.getString(arguments, "string") + "\u306B\u8A2D\u5B9A\u3057\u307E\u3057\u305F\u3002"))),
					false);
	}
}
