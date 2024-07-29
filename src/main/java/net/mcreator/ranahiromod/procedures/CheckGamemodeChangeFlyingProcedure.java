package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.CommandEvent;

import net.minecraft.world.entity.Entity;

import net.mcreator.ranahiromod.network.RanahiromodModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class CheckGamemodeChangeFlyingProcedure {
	@SubscribeEvent
	public static void onCommand(CommandEvent event) {
		Entity entity = event.getParseResults().getContext().getSource().getEntity();
		if (entity != null) {
			execute(event, entity, event.getParseResults().getReader().getString());
		}
	}

	public static void execute(Entity entity, String command) {
		execute(null, entity, command);
	}

	private static void execute(@Nullable Event event, Entity entity, String command) {
		if (entity == null || command == null)
			return;
		String logic_text = "";
		logic_text = command;
		if (logic_text.contains("gamemode creative") || logic_text.contains("gamemode spectator") || logic_text.contains("gamemode adventure") || logic_text.contains("gamemode survival")) {
			{
				boolean _setval = true;
				entity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.CheckFly = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
