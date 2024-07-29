package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.ranahiromod.network.RanahiromodModVariables;

public class CheckflyCMDProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			boolean _setval = true;
			entity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.CheckFly = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
