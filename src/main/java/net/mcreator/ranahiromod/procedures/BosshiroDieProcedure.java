package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.ranahiromod.init.RanahiromodModEntities;
import net.mcreator.ranahiromod.entity.BosshiroEntity;
import net.mcreator.ranahiromod.entity.Bosshiro2Entity;

public class BosshiroDieProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double yaw = 0;
		double pitch = 0;
		yaw = entity.getYRot();
		pitch = entity.getXRot();
		if (entity instanceof BosshiroEntity) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = RanahiromodModEntities.BOSSHIRO_2.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot((float) yaw);
					entityToSpawn.setYBodyRot((float) yaw);
					entityToSpawn.setYHeadRot((float) yaw);
					entityToSpawn.setXRot((float) pitch);
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ranahiromod:bosshiro_battle")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ranahiromod:bosshiro_battle")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		} else if (entity instanceof Bosshiro2Entity) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = RanahiromodModEntities.BOSSHIRO_3_CODE_PHOENIX.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot((float) yaw);
					entityToSpawn.setYBodyRot((float) yaw);
					entityToSpawn.setYHeadRot((float) yaw);
					entityToSpawn.setXRot((float) pitch);
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ranahiromod:phoenixhiro_battle")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ranahiromod:phoenixhiro_battle")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		}
		if (!entity.level().isClientSide())
			entity.discard();
	}
}
