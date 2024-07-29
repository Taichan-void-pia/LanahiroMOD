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

public class UndefinedPotionEffectStartedappliedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double X = 0;
		double Y = 0;
		double Z = 0;
		double cnt = 0;
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.enchantment_table.use")), SoundSource.NEUTRAL, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.enchantment_table.use")), SoundSource.NEUTRAL, 1, 1, false);
			}
		}
		for (int index0 = 0; index0 < 3; index0++) {
			X = x + (Math.random() - 0.5) * 4;
			Y = y + (Math.random() - 0.5) * 4;
			Z = z + (Math.random() - 0.5) * 4;
			cnt = cnt + 1;
			if (cnt == 1) {
				for (int index1 = 0; index1 < 2; index1++) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = RanahiromodModEntities.UNDEFINED_ZOMBIE.get().spawn(_level, BlockPos.containing(X, Y, Z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				}
			} else if (cnt == 2) {
				for (int index2 = 0; index2 < 2; index2++) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = RanahiromodModEntities.UNDEFINED_SKELETON.get().spawn(_level, BlockPos.containing(X, Y, Z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				}
			} else if (cnt == 3) {
				for (int index3 = 0; index3 < 2; index3++) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = RanahiromodModEntities.UNDEFINED_CREEPER.get().spawn(_level, BlockPos.containing(X, Y, Z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				}
			}
		}
	}
}
