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
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.ranahiromod.init.RanahiromodModParticleTypes;

public class SkillBosshiro4Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double rad = 0;
		double rad_now = 0;
		double yaw_now = 0;
		double x_pos = 0;
		double y_pos = 0;
		double z_pos = 0;
		double dis = 0;
		double zPos = 0;
		double yPos = 0;
		double xPos = 0;
		double count = 0;
		boolean muki = false;
		boolean UseBoss2 = false;
		entity.getPersistentData().putDouble("cnt3", (entity.getPersistentData().getDouble("cnt3") + 1));
		entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x() / 5), (entity.getDeltaMovement().y()), (entity.getDeltaMovement().z() / 5)));
		UseBoss2 = UsePlayerLogicRanahiroProcedure.execute(entity);
		dis = 2.5;
		if (UseBoss2) {
			dis = dis * 1.25;
		}
		if (entity instanceof LivingEntity _entity)
			_entity.swing(InteractionHand.MAIN_HAND, true);
		if (entity.getPersistentData().getDouble("cnt3") % 2 == 1) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			entity.getPersistentData().putDouble("cnt2", 0);
			entity.getPersistentData().putDouble("start_r", (entity.getYRot() + 180));
			if (entity.getPersistentData().getDouble("cnt3") % 4 == 1) {
				entity.getPersistentData().putDouble("x_pos", (entity.getPersistentData().getDouble("cnt3") * 10));
			} else {
				entity.getPersistentData().putDouble("x_pos", (entity.getPersistentData().getDouble("cnt3") * (-10)));
			}
			entity.getPersistentData().putDouble("y_pos", (entity.getPersistentData().getDouble("x_pos") / (-18)));
			rad_now = Math.toRadians(entity.getXRot());
			yaw_now = Math.toRadians(entity.getYRot() + 90);
		} else {
			entity.getPersistentData().putDouble("cnt2", (entity.getXRot() + 90));
			if (entity.getPersistentData().getDouble("cnt3") % 4 == 0) {
				entity.getPersistentData().putDouble("start_r", (entity.getYRot() + 90 + entity.getPersistentData().getDouble("cnt3") * 10));
			} else {
				entity.getPersistentData().putDouble("start_r", (entity.getYRot() + 90 + entity.getPersistentData().getDouble("cnt3") * (-10)));
			}
		}
		count = 0;
		for (int index0 = 0; index0 < 36; index0++) {
			if (entity.getPersistentData().getDouble("cnt3") % 2 == 1) {
				rad_now = Math.toRadians(entity.getXRot() + entity.getPersistentData().getDouble("x_pos"));
				rad = Math.toRadians(entity.getPersistentData().getDouble("start_r") + entity.getPersistentData().getDouble("cnt2"));
				xPos = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(1.5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()
						+ Math.cos(rad) * (Math.cos(rad_now) + Math.abs(Math.sin(yaw_now) * Math.sin(rad_now))) * dis;
				yPos = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(1.5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY()
						+ Math.sin(rad_now) * Math.sin(rad) * dis;
				zPos = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(1.5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()
						+ Math.sin(rad) * (Math.cos(rad_now) + Math.abs(Math.cos(yaw_now) * Math.sin(rad_now))) * dis;
				if (Math.random() < 0.4) {
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.SWEEP_ATTACK, xPos, yPos, zPos, 1, 0, 0, 0, 0.1);
				}
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"particle dust 0.6 0.05 0.1 1 ~ ~ ~ 0.15 0.15 0.15 1 6 force");
				if (UseBoss2 && Math.random() < 0.1) {
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (RanahiromodModParticleTypes.LIGHT_SCATTER.get()), xPos, yPos, zPos, 5, 0, 0, 0, 0.25);
				}
				entity.getPersistentData().putDouble("x_pos", (entity.getPersistentData().getDouble("x_pos") + entity.getPersistentData().getDouble("y_pos")));
			} else {
				rad = Math.toRadians(entity.getPersistentData().getDouble("cnt2"));
				rad_now = Math.toRadians(entity.getPersistentData().getDouble("start_r"));
				xPos = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(1)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()
						+ Math.cos(rad) * Math.cos(rad_now) * dis;
				yPos = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(1)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY()
						+ Math.sin(rad) * (-1) * dis;
				zPos = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(1)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()
						+ Math.cos(rad) * Math.sin(rad_now) * dis;
				if (Math.random() < 0.4) {
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.SWEEP_ATTACK, xPos, yPos, zPos, 1, 0, 0, 0, 0.1);
				}
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"particle dust 0.6 0.05 0.1 1 ~ ~ ~ 0.15 0.15 0.15 1 6 force");
				if (UseBoss2 && Math.random() < 0.1) {
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (RanahiromodModParticleTypes.LIGHT_SCATTER.get()), xPos, yPos, zPos, 5, 0, 0, 0, 0.25);
				}
				if (entity.getPersistentData().getDouble("cnt3") % 4 == 0) {
					entity.getPersistentData().putDouble("start_r", (entity.getPersistentData().getDouble("start_r") - entity.getPersistentData().getDouble("cnt3") / 1.8));
				} else {
					entity.getPersistentData().putDouble("start_r", (entity.getPersistentData().getDouble("start_r") - entity.getPersistentData().getDouble("cnt3") / (-1.8)));
				}
			}
			entity.getPersistentData().putDouble("damage", (15 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
			entity.getPersistentData().putDouble("range", 2.5);
			if (UseBoss2) {
				entity.getPersistentData().putDouble("damage", (17 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
				entity.getPersistentData().putDouble("range", 3.5);
			}
			entity.getPersistentData().putDouble("knockback", 0.75);
			entity.getPersistentData().putDouble("projectile_type", 1);
			DodamageProcedure.execute(world, xPos, yPos, zPos, entity);
			entity.getPersistentData().putDouble("cnt2", (entity.getPersistentData().getDouble("cnt2") - 5));
			count = count + 5;
		}
		if (entity.getPersistentData().getDouble("cnt3") >= 18) {
			entity.getPersistentData().putDouble("skill2", 0);
		}
	}
}
