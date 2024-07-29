package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.ranahiromod.network.RanahiromodModVariables;

public class ChangeLevelProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double level = 0;
		entity.getPersistentData().putDouble("level", ((entity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).health));
		HealthUPProcedure.execute(entity);
	}
}
