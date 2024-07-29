package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.ranahiromod.network.RanahiromodModVariables;
import net.mcreator.ranahiromod.init.RanahiromodModGameRules;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class WorldBandeleteLockClearProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player);
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!RanahiromodModVariables.MapVariables.get(world).LanahiroModClear) {
			if ((world.getLevelData().getGameRules().getInt(RanahiromodModGameRules.WORLDBANDELETEDSYSTEM)) == RanahiromodModVariables.MapVariables.get(world).password) {
				{
					double _setval = 0;
					entity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.worldban = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				RanahiromodModVariables.MapVariables.get(world).LanahiroModClear = true;
				RanahiromodModVariables.MapVariables.get(world).syncData(world);
			}
		}
	}
}
