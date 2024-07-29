package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.ranahiromod.init.RanahiromodModEntities;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class RandomSpawnSpawnerProcedureProcedure {
	@SubscribeEvent
	public static void onEntitySpawned(EntityJoinLevelEvent event) {
		execute(event, event.getLevel(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double rnd = 0;
		if (entity instanceof Villager) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) == 0) {
				if (Math.random() < 0.3) {
					rnd = Math.ceil(Math.random() * 10);
					if (rnd == 1) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = EntityType.ZOMBIE.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
							}
						}
					}
					if (rnd == 2) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = EntityType.WITHER_SKELETON.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
							}
						}
					}
					if (rnd == 3) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = EntityType.SKELETON.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
							}
						}
					}
					if (rnd == 4) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = EntityType.HUSK.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
							}
						}
					}
					if (rnd == 5) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = EntityType.STRAY.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
							}
						}
					}
					if (rnd == 6) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = RanahiromodModEntities.EPIC_DOWN_ZOMBIE.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
							}
						}
					}
					if (rnd == 7) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = RanahiromodModEntities.EPIC_DOWN_SKELETON.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
							}
						}
					}
					if (rnd == 8) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = RanahiromodModEntities.EPIC_DOWN_ENDERMAN.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
							}
						}
					}
					if (rnd == 9) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = RanahiromodModEntities.EPIC_DOWN_BLAZE.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
							}
						}
					}
					if (rnd == 10) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = EntityType.BLAZE.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
							}
						}
					}
				}
			}
		}
	}
}
