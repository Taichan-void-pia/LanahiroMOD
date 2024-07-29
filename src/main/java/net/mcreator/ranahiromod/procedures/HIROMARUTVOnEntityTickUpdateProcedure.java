package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

public class HIROMARUTVOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		entity.setDeltaMovement(new Vec3(((Math.random() - 0.5) * 2), ((Math.random() - 0.5) * 0.5), ((Math.random() - 0.5) * 2)));
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = EntityType.TNT_MINECART.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
			if (entityToSpawn != null) {
			}
		}
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = EntityType.TNT.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
			if (entityToSpawn != null) {
			}
		}
	}
}
