package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

public class PhotonServantVanishAIProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.isAlive()) {
			entity.getPersistentData().putDouble("cnt1", (entity.getPersistentData().getDouble("cnt1") + 1));
			if (entity.getPersistentData().getDouble("cnt1") > 300) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.PORTAL, x, (y + 1), z, 15, 1, 1, 1, 1);
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.REVERSE_PORTAL, x, (y + 1), z, 15, 1, 1, 1, 1);
				if (!entity.level().isClientSide())
					entity.discard();
			}
		}
	}
}
