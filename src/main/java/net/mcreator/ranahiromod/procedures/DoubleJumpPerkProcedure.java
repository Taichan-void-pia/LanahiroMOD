package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.ranahiromod.init.RanahiromodModMobEffects;

public class DoubleJumpPerkProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double y_power = 0;
		double rad = 0;
		double xPos = 0;
		double yPos = 0;
		double zPos = 0;
		double rotate = 0;
		y_power = 0.4 * (1 + 0.5 * (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.JUMP) ? _livEnt.getEffect(MobEffects.JUMP).getAmplifier() : 0));
		if (!(entity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(RanahiromodModMobEffects.DOUBLE_JUMP_COOL_DOWN.get()))) {
			if (!entity.onGround()) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ender_dragon.flap")), SoundSource.NEUTRAL, 1, (float) 0.9);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ender_dragon.flap")), SoundSource.NEUTRAL, 1, (float) 0.9, false);
					}
				}
				rotate = entity.getYRot();
				for (int index0 = 0; index0 < 72; index0++) {
					rad = Math.toRadians(rotate);
					xPos = x + Math.cos(rad) * 1;
					yPos = y;
					zPos = z + Math.sin(rad) * 1;
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.GLOW, xPos, yPos, zPos, 1, 0, 0, 0, 0);
					rotate = rotate + 5;
				}
				entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), y_power, (entity.getDeltaMovement().z())));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(RanahiromodModMobEffects.DOUBLE_JUMP_COOL_DOWN.get(), (int) Double.POSITIVE_INFINITY, 0, false, false));
			}
		}
		if (!(entity instanceof LivingEntity _livEnt10 && _livEnt10.hasEffect(RanahiromodModMobEffects.DOUBLE_JUMP_COOL_DOWN_2.get()))) {
			if (world.getBlockState(BlockPos.containing(x + 1, y, z)).canOcclude() || world.getBlockState(BlockPos.containing(x - 1, y, z)).canOcclude() || world.getBlockState(BlockPos.containing(x, y, z + 1)).canOcclude()
					|| world.getBlockState(BlockPos.containing(x, y, z - 1)).canOcclude()) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ender_dragon.flap")), SoundSource.NEUTRAL, 1, (float) 0.9);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ender_dragon.flap")), SoundSource.NEUTRAL, 1, (float) 0.9, false);
					}
				}
				for (int index1 = 0; index1 < 72; index1++) {
					rad = Math.toRadians(rotate);
					xPos = x + Math.cos(rad) * 1;
					yPos = y;
					zPos = z + Math.sin(rad) * 1;
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.GLOW, xPos, yPos, zPos, 1, 0, 0, 0, 0);
					rotate = rotate + 5;
				}
				entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), y_power, (entity.getDeltaMovement().z())));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(RanahiromodModMobEffects.DOUBLE_JUMP_COOL_DOWN_2.get(), 10, 0, false, false));
			}
		}
	}
}
