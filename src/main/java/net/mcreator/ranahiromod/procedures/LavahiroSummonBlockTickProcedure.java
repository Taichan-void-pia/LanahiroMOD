package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.ranahiromod.init.RanahiromodModParticleTypes;

public class LavahiroSummonBlockTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean guard = false;
		boolean swing_off = false;
		boolean calc_armor = false;
		boolean noDamaged = false;
		boolean sword = false;
		boolean swing = false;
		boolean logic_attack = false;
		boolean swing_main = false;
		double dis = 0;
		double dis2 = 0;
		double degree = 0;
		double degree2 = 0;
		double xPos = 0;
		double yPos = 0;
		double zPos = 0;
		double old_health = 0;
		double range = 0;
		double knockback_sorce = 0;
		double x_knockback = 0;
		double damage_sorce_set = 0;
		double num1 = 0;
		double z_knockback = 0;
		double damage_sorce = 0;
		double change_projectile = 0;
		double num2 = 0;
		double y_knockback = 0;
		if (world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("ranahiromod:lava_everest"))) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.SMALL_FLAME, (x + 0.5), (y + 0.5), (z + 0.5), 10, 0.5, 0.5, 0.5, 0.1);
		}
		if (world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("ranahiromod:water_everest"))) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.SPLASH, (x + 0.5), (y + 0.5), (z + 0.5), 10, 0.5, 0.5, 0.5, 0.1);
		}
		if (world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("ranahiromod:wind_everest"))) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.SNEEZE, (x + 0.5), (y + 0.5), (z + 0.5), 10, 0.5, 0.5, 0.5, 0.1);
		}
		if (world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("ranahiromod:dragon_everest"))) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.WITCH, (x + 0.5), (y + 0.5), (z + 0.5), 10, 0.5, 0.5, 0.5, 0.1);
		}
		if (world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("ranahiromod:demon_everest"))) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.LAVA, (x + 0.5), (y + 0.5), (z + 0.5), 10, 0.5, 0.5, 0.5, 0.1);
		}
		if (world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("ranahiromod:thunder_everest"))) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (RanahiromodModParticleTypes.LIGHT_SCATTER.get()), (x + 0.5), (y + 0.5), (z + 0.5), 10, 0.5, 0.5, 0.5, 0.1);
		}
		if (world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("ranahiromod:ancient_everest"))) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.SONIC_BOOM, (x + 0.5), (y + 0.5), (z + 0.5), 10, 0.5, 0.5, 0.5, 0.1);
		}
		if (world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("ranahiromod:himalayas"))) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.TOTEM_OF_UNDYING, (x + 0.5), (y + 0.5), (z + 0.5), 10, 0.5, 0.5, 0.5, 0.1);
		}
	}
}
