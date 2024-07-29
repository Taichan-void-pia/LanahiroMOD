package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.Entity;

import net.mcreator.ranahiromod.network.RanahiromodModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class CheckAllowFlyingArmorProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (FlyAllowItemLogicProcedure.execute(entity)) {
			if (!entity.getPersistentData().getBoolean("check_wear")) {
				{
					boolean _setval = true;
					entity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.CheckFly = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				entity.getPersistentData().putBoolean("check_wear", true);
			}
		}
		if (!FlyAllowItemLogicProcedure.execute(entity)) {
			if (entity.getPersistentData().getBoolean("check_wear")) {
				{
					boolean _setval = true;
					entity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.CheckFly = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				entity.getPersistentData().putBoolean("check_wear", false);
			}
		}
	}
}
