package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.CommandSourceStack;

import net.mcreator.ranahiromod.network.RanahiromodModVariables;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;

public class Showlevel2commmandProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		String text_create = "";
		String text_a = "";
		Entity player_entity = null;
		text_a = ",";
		player_entity = new Object() {
			public Entity getEntity() {
				try {
					return EntityArgument.getEntity(arguments, "select_player");
				} catch (CommandSyntaxException e) {
					e.printStackTrace();
					return null;
				}
			}
		}.getEntity();
		text_create = "\u30D7\u30EC\u30A4\u30E4\u30FC" + "(" + player_entity.getDisplayName().getString() + ")" + "\u306E\u73FE\u5728\u306E\u30EC\u30D9\u30EB" + "" + "" + "health_level:"
				+ (player_entity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).health + text_a + "defense_level:"
				+ (player_entity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).defense + text_a + "strength_level:"
				+ (player_entity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).strength + text_a + "attack_speed_level:"
				+ (player_entity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).attackspeed + text_a + "knockback_resistance_level:"
				+ (player_entity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).knockback_resistance + text_a + "speed_level:"
				+ (player_entity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).speed;
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal(text_create), false);
	}
}
