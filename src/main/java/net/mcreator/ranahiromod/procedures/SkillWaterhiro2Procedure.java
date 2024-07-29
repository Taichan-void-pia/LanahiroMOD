package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class SkillWaterhiro2Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean type = false;
		double zPos = 0;
		double yPos = 0;
		double xPos = 0;
		double dis2 = 0;
		double dis = 0;
		double y_power = 0;
		double z_power = 0;
		double rad = 0;
		double rad_now = 0;
		double x_power = 0;
		double num1 = 0;
		double pitch = 0;
		double num3 = 0;
		double num2 = 0;
		double dis_range = 0;
		entity.getPersistentData().putDouble("cnt1", (entity.getPersistentData().getDouble("cnt1") + 1));
		entity.fallDistance = 0;
		if (entity.getPersistentData().getDouble("cnt1") == 1 && entity.getPersistentData().getBoolean("logic_a") == false) {
			entity.getPersistentData().putBoolean("logic_a", true);
			entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), 1.75, (entity.getDeltaMovement().z())));
		}
		if (entity.getPersistentData().getDouble("cnt1") > 20) {
			entity.getPersistentData().putDouble("start_r", (entity.getYRot()));
			entity.getPersistentData().putDouble("cnt3", 1);
			entity.getPersistentData().putDouble("cnt1", 0);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.swim")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.swim")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		}
		if (entity.getPersistentData().getDouble("cnt3") > 0) {
			if (entity.getPersistentData().getDouble("cnt3") == 1) {
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
			}
			entity.getPersistentData().putDouble("cnt3", (entity.getPersistentData().getDouble("cnt3") + 1));
			for (int index0 = 0; index0 < 3; index0++) {
				xPos = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(3)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX();
				yPos = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(3)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY() - 2.5;
				zPos = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(3)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ();
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.SPLASH, xPos, yPos, zPos, 25, 0.5, 0.5, 0.5, 0.1);
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"particle dust 0.361 0.765 1.000 2 ~ ~ ~ 0.5 0.5 0.5 0.1 20 force");
				entity.getPersistentData().putDouble("damage", (15 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
				entity.getPersistentData().putDouble("knockback", 0.5);
				entity.getPersistentData().putDouble("range", 3);
				entity.getPersistentData().putDouble("projectile_type", 0);
				DodamageProcedure.execute(world, xPos, yPos, zPos, entity);
				if (!world.getBlockState(BlockPos.containing(xPos, yPos, zPos)).canOcclude()) {
					yPos = yPos + 0.75;
					if (entity.getPersistentData().getDouble("cnt3") > 40) {
						entity.getPersistentData().putBoolean("type", true);
					}
				} else {
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.SPLASH, xPos, (yPos - 1.2), zPos, 30, 1, 1, 1, 2);
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.BUBBLE, xPos, (yPos - 1.2), zPos, 10, 1, 1, 1, 2);
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.CLOUD, xPos, (yPos - 1.2), zPos, 15, 1, 1, 1, 0.25);
					if (entity.getPersistentData().getDouble("cnt2") == 0) {
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.EXPLOSION, xPos, (yPos - 1.2), zPos, 30, 2, 2, 2, 0.25);
						if (world instanceof Level _level && !_level.isClientSide())
							_level.explode(null, xPos, (yPos - 1.2), zPos, 0, Level.ExplosionInteraction.NONE);
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.splash")), SoundSource.NEUTRAL, (float) 0.5, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.splash")), SoundSource.NEUTRAL, (float) 0.5, 1, false);
							}
						}
						entity.getPersistentData().putDouble("cnt2", 1);
					}
				}
			}
		}
		if (entity.getPersistentData().getDouble("cnt2") > 0) {
			entity.getPersistentData().putDouble("cnt2", (entity.getPersistentData().getDouble("cnt2") + 1));
			entity.setDeltaMovement(new Vec3(0, Math.min(entity.getDeltaMovement().y(), 0), 0));
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.splash")), SoundSource.NEUTRAL, (float) 0.5, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.splash")), SoundSource.NEUTRAL, (float) 0.5, 1, false);
				}
			}
			entity.getPersistentData().putBoolean("type", true);
		}
		if (entity.getPersistentData().getDouble("cnt1") >= 20 && entity.getPersistentData().getBoolean("type") == true) {
			entity.getPersistentData().putDouble("skill2", 0);
			entity.getPersistentData().putBoolean("type", false);
			entity.getPersistentData().putBoolean("logic_a", false);
		}
	}
}
