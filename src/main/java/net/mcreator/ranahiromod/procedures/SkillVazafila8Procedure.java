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

public class SkillVazafila8Procedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double range = 0;
		double data = 0;
		double rad = 0;
		double rad_now = 0;
		double xPos = 0;
		double yPos = 0;
		double zPos = 0;
		double yaw_now = 0;
		double dis = 0;
		double rotate = 0;
		double dis_start = 0;
		boolean UseSK = false;
		boolean logic_attack = false;
		boolean UseVazafila = false;
		boolean muki = false;
		entity.getPersistentData().putDouble("cnt1", (entity.getPersistentData().getDouble("cnt1") + 1));
		entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x() / 8), (entity.getDeltaMovement().y()), (entity.getDeltaMovement().z() / 8)));
		UseVazafila = true;
		if (entity.getPersistentData().getDouble("cnt3") < 9 && entity.getPersistentData().getDouble("cnt1") > 0) {
			entity.getPersistentData().putDouble("cnt1", (-1));
			entity.getPersistentData().putDouble("cnt3", (entity.getPersistentData().getDouble("cnt3") + 1));
			for (int index0 = 0; index0 < 2; index0++) {
				dis_start = 2 + entity.getPersistentData().getDouble("cnt3") * 0.4;
				if (UseVazafila) {
					dis_start = dis_start * 1.5;
				}
				if (Math.random() < 0.5) {
					muki = true;
				} else {
					muki = false;
				}
				if (muki) {
					entity.getPersistentData().putDouble("cnt2", 0);
					entity.getPersistentData().putDouble("start_r", (entity.getYRot() + 180));
					rad_now = Math.toRadians(entity.getXRot() + Math.random() * 80);
					yaw_now = Math.toRadians(entity.getYRot() + 90);
				} else {
					entity.getPersistentData().putDouble("cnt2", (entity.getXRot() + 66.5));
					rad_now = Math.toRadians(entity.getYRot() + 90 + (Math.random() - 0.5) * 150);
				}
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
				for (int index1 = 0; index1 < 36; index1++) {
					dis = dis_start * 1.5;
					for (int index2 = 0; index2 < 4; index2++) {
						if (muki) {
							rad = Math.toRadians(entity.getPersistentData().getDouble("start_r") + entity.getPersistentData().getDouble("cnt2"));
							xPos = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(1)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()
									+ Math.cos(rad) * (Math.cos(rad_now) + Math.abs(Math.sin(yaw_now) * Math.sin(rad_now))) * dis;
							yPos = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(1)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY()
									+ Math.sin(rad_now) * Math.sin(rad) * (-1) * dis;
							zPos = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(1)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()
									+ Math.sin(rad) * (Math.cos(rad_now) + Math.abs(Math.cos(yaw_now) * Math.sin(rad_now))) * dis;
						} else {
							rad = Math.toRadians(entity.getPersistentData().getDouble("cnt2"));
							xPos = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(1)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()
									+ Math.cos(rad) * Math.cos(rad_now) * dis;
							yPos = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(1)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY()
									+ Math.sin(rad) * (-1) * dis;
							zPos = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(1)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()
									+ Math.cos(rad) * Math.sin(rad_now) * dis;
						}
						if (Math.random() < 0.5) {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"particle dust 1.000 0.596 0.071 1 ~ ~ ~ 0 0 0 1 0 force");
						} else {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"particle dust 0.631 0.345 0.063 1 ~ ~ ~ 0 0 0 1 0 force");
						}
						entity.getPersistentData().putDouble("damage", (24 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
						if (UseVazafila) {
							entity.getPersistentData().putDouble("range", 4);
						} else {
							entity.getPersistentData().putDouble("range", 3);
						}
						entity.getPersistentData().putDouble("knockback", 1);
						entity.getPersistentData().putDouble("projectile_type", 2);
						DodamageProcedure.execute(world, xPos, yPos, zPos, entity);
						dis = dis + 0.25;
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(xPos, yPos, zPos), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(xPos, yPos, zPos, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					if (UseVazafila) {
						if (Math.random() < 0.15) {
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.PORTAL, xPos, yPos, zPos, 10, 0, 0, 0, 1);
						}
						if (Math.random() < 0.075) {
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.REVERSE_PORTAL, xPos, yPos, zPos, 10, 0, 0, 0, 1);
						}
					}
					entity.getPersistentData().putDouble("cnt2", (entity.getPersistentData().getDouble("cnt2") - 5));
				}
			}
		}
		if (entity.getPersistentData().getDouble("cnt1") > 7) {
			entity.getPersistentData().putDouble("skill2", 0);
		}
	}
}
