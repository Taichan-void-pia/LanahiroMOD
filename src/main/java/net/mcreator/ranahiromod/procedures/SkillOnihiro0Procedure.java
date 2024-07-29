package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.ranahiromod.init.RanahiromodModParticleTypes;
import net.mcreator.ranahiromod.init.RanahiromodModMobEffects;

public class SkillOnihiro0Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean logic_a = false;
		double zPos = 0;
		double yPos = 0;
		double rad = 0;
		double rad_now = 0;
		double yaw_now = 0;
		double xPos = 0;
		double dis = 0;
		double yaw = 0;
		double pitch = 0;
		double yaw2 = 0;
		double pitch2 = 0;
		double num1 = 0;
		double num2 = 0;
		double time = 0;
		entity.getPersistentData().putDouble("cnt1", (entity.getPersistentData().getDouble("cnt1") + 1));
		if (entity.getPersistentData().getDouble("cnt1") == 1) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.breath")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.breath")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 15, 0, false, false));
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.END_ROD, xPos, yPos, zPos, 3, 0, 0, 0, 0.05);
		}
		if (entity.getPersistentData().getDouble("cnt1") > 15) {
			entity.getPersistentData().putDouble("skill2", 0);
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (RanahiromodModParticleTypes.BLACKFLAME.get()), x, y, z, 20, (entity.getBbWidth()), (entity.getBbHeight()), (entity.getBbWidth()), 0.05);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.CLOUD, x, y, z, 20, (entity.getBbWidth()), (entity.getBbHeight()), (entity.getBbWidth()), 0.2);
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(RanahiromodModMobEffects.PUNCH_ROUGH.get(), 3600, 0, false, false));
		}
	}
}
