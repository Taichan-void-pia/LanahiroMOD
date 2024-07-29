package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.ranahiromod.init.RanahiromodModGameRules;
import net.mcreator.ranahiromod.entity.SeahouseNightmareEntity;
import net.mcreator.ranahiromod.entity.LavanicBreakerEntity;
import net.mcreator.ranahiromod.entity.KnightOfLightningEntity;
import net.mcreator.ranahiromod.entity.GaleSlasherEntity;

public class SemiBossTargetPlayBGMProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world.getLevelData().getGameRules().getBoolean(RanahiromodModGameRules.TOGGLEBGM) == true) {
			if (entity instanceof LavanicBreakerEntity || entity instanceof SeahouseNightmareEntity || entity instanceof GaleSlasherEntity || entity instanceof KnightOfLightningEntity) {
				if (Math.random() < 0.5) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ranahiromod:semiboss_song_1")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ranahiromod:semiboss_song_1")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				} else {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ranahiromod:semiboss_song_2")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ranahiromod:semiboss_song_2")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
			}
		}
	}
}
