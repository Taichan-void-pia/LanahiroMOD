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

public class SkillSKLiner3Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
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
		boolean UseSK = false;
		boolean logic_attack = false;
		entity.getPersistentData().putDouble("cnt1", (entity.getPersistentData().getDouble("cnt1") + 1));
		UseSK = UsePlayerLogicProcedure.execute(entity);
		if (entity.getPersistentData().getDouble("cnt1") == 1) {
			entity.getPersistentData().putDouble("start_r", (entity.getYRot()));
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
		}
		if (entity.getPersistentData().getDouble("cnt1") < 7) {
			for (int index0 = 0; index0 < 15; index0++) {
				dis = 1.5 + entity.getPersistentData().getDouble("cnt1") / 3;
				if (UseSK) {
					dis = dis * 1.5;
				}
				for (int index1 = 0; index1 < 5; index1++) {
					rad = Math.toRadians(entity.getPersistentData().getDouble("start_r") + entity.getPersistentData().getDouble("cnt2"));
					xPos = x + Math.cos(rad) * dis;
					yPos = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((Math.cos(rad - Math.toRadians(entity.getYRot() + 90)) * dis))), ClipContext.Block.OUTLINE,
							ClipContext.Fluid.NONE, entity)).getBlockPos().getY();
					zPos = z + Math.sin(rad) * dis;
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"particle dust_color_transition 0.500 1.000 1.000 2 0.350 0.250 1.000 ~ ~ ~ 0 0 0 0.1 1 force");
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.SWEEP_ATTACK, xPos, yPos, zPos, 1, 0, 0, 0, 0);
					if (UseSK) {
						if (Math.random() < 0.15) {
							if (world instanceof ServerLevel _level)
								_level.sendParticles((SimpleParticleType) (RanahiromodModParticleTypes.SK_LINER_BLADE_PARTICLE.get()), xPos, yPos, zPos, 1, 0.3, 0.3, 0.3, 0.01);
						}
						if (Math.random() < 0.075) {
							if (world instanceof ServerLevel _level)
								_level.sendParticles((SimpleParticleType) (RanahiromodModParticleTypes.SK_LINER_BLADE_PARTICLE_2.get()), xPos, yPos, zPos, 1, 0.1, 0.1, 0.1, 0.01);
						}
					}
					entity.getPersistentData().putDouble("damage", (18 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
					if (UseSK) {
						entity.getPersistentData().putDouble("range", 4);
					} else {
						entity.getPersistentData().putDouble("range", 3);
					}
					entity.getPersistentData().putDouble("knockback", 2);
					entity.getPersistentData().putDouble("projectile_type", 1);
					DodamageProcedure.execute(world, xPos, yPos, zPos, entity);
					entity.getPersistentData().putDouble("cnt2", (entity.getPersistentData().getDouble("cnt2") + 4.37));
					dis = dis + 0.6;
				}
			}
		} else {
			for (int index2 = 0; index2 < 15; index2++) {
				dis = entity.getPersistentData().getDouble("cnt1") - 2;
				if (UseSK) {
					dis = dis * 1.5;
				}
				for (int index3 = 0; index3 < 5; index3++) {
					rad = Math.toRadians(entity.getPersistentData().getDouble("start_r") + entity.getPersistentData().getDouble("cnt2"));
					xPos = x + Math.cos(rad) * dis;
					yPos = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((Math.cos(rad - Math.toRadians(entity.getYRot() + 90)) * dis))), ClipContext.Block.OUTLINE,
							ClipContext.Fluid.NONE, entity)).getBlockPos().getY();
					zPos = z + Math.sin(rad) * dis;
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"particle dust_color_transition 0.500 1.000 1.000 2 0.350 0.250 1.000 ~ ~ ~ 0 0 0 0.1 1 force");
					if (UseSK) {
						entity.getPersistentData().putDouble("range", 5);
					} else {
						entity.getPersistentData().putDouble("range", 4);
					}
					if (UseSK) {
						entity.getPersistentData().putDouble("knockback", 0.4);
					} else {
						entity.getPersistentData().putDouble("knockback", 0.3);
					}
					KnockbackProcedure.execute(world, xPos, yPos, zPos, entity);
					entity.getPersistentData().putDouble("cnt2", (entity.getPersistentData().getDouble("cnt2") + 4.37));
					dis = dis + 0.4;
				}
			}
		}
		entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x() / 4), (entity.getDeltaMovement().y()), (entity.getDeltaMovement().z() / 4)));
		if (entity.getPersistentData().getDouble("cnt1") > 12) {
			entity.getPersistentData().putDouble("skill2", 0);
		}
	}
}
