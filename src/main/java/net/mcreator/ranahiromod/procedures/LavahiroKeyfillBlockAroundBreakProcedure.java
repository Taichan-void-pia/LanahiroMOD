package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.ranahiromod.init.RanahiromodModBlocks;

public class LavahiroKeyfillBlockAroundBreakProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		sx = -1;
		for (int index0 = 0; index0 < 3; index0++) {
			sy = -1;
			for (int index1 = 0; index1 < 3; index1++) {
				sz = -1;
				for (int index2 = 0; index2 < 3; index2++) {
					if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == RanahiromodModBlocks.KEY_HARDENED_GLASS.get()) {
						found = true;
					} else {
						found = false;
					}
					if (found) {
						world.destroyBlock(BlockPos.containing(x + sx, y + sy, z + sz), false);
					}
					sz = sz + 1;
				}
				sy = sy + 1;
			}
			sx = sx + 1;
		}
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.ENCHANT, (x + 0.5), (y + 0.5), (z + 0.5), 50, 0.25, 0.25, 0.25, 0.5);
		world.destroyBlock(BlockPos.containing(x, y, z), false);
	}
}
