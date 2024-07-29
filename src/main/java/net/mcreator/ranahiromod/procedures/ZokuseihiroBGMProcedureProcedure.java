package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.ranahiromod.init.RanahiromodModGameRules;
import net.mcreator.ranahiromod.entity.WindhiroEntity;
import net.mcreator.ranahiromod.entity.WaterhiroEntity;
import net.mcreator.ranahiromod.entity.OnihiroEntity;
import net.mcreator.ranahiromod.entity.LavahiroEntity;
import net.mcreator.ranahiromod.entity.HIROMARUTVEntity;
import net.mcreator.ranahiromod.entity.GroundhiroEntity;
import net.mcreator.ranahiromod.entity.DragonhiroEntity;

public class ZokuseihiroBGMProcedureProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world.getLevelData().getGameRules().getBoolean(RanahiromodModGameRules.TOGGLEBGM) == true) {
			if (entity instanceof LavahiroEntity) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ranahiromod:lavahiro_battle")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ranahiromod:lavahiro_battle")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
			if (entity instanceof WaterhiroEntity) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ranahiromod:waterhiro_battle")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ranahiromod:waterhiro_battle")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
			if (entity instanceof WindhiroEntity) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ranahiromod:windhiro_battle")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ranahiromod:windhiro_battle")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
			if (entity instanceof DragonhiroEntity) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ranahiromod:dragonhiro_battle")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ranahiromod:dragonhiro_battle")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
			if (entity instanceof OnihiroEntity) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ranahiromod:demonhiro_battle")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ranahiromod:demonhiro_battle")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
			if (entity instanceof GroundhiroEntity) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ranahiromod:groundhiro_battle")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ranahiromod:groundhiro_battle")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
			if (entity instanceof HIROMARUTVEntity) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ranahiromod:hiromaru")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ranahiromod:hiromaru")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
		}
	}
}
