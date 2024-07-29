package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

public class Effect16Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double xPos = 0;
		double yPos = 0;
		double zPos = 0;
		yPos = y + entity.getBbHeight() / 2;
		for (int index0 = 0; index0 < (int) (entity.getBbHeight() * 10); index0++) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.CRIT, (x + entity.getBbWidth() / 2), yPos, (z + entity.getBbWidth() / 2), 2, 0, 0, 0, 0);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.ENCHANTED_HIT, (x + entity.getBbWidth() / 2), (y + entity.getBbHeight()), (z + entity.getBbWidth() / 2), 2, 0, 0, 0, 0.2);
			yPos = yPos + entity.getBbHeight() / 5;
		}
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.CLOUD, (x + entity.getBbWidth() / 2), y, (z + entity.getBbWidth() / 2), 10, 0.3, 0.3, 0.3, 0.6);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.FLASH, (x + entity.getBbWidth() / 2), y, (z + entity.getBbWidth() / 2), 3, 0.3, 0.6, 0.3, 0.6);
	}
}
