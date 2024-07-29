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

public class SkillBosshiro72Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean UseSK = false;
		boolean logic_attack = false;
		boolean UseBoss2 = false;
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
		double loop_num = 0;
		double dis_num = 0;
		entity.getPersistentData().putDouble("cnt1", (entity.getPersistentData().getDouble("cnt1") + 1));
		UseBoss2 = UsePlayerLogicRanahiroProcedure.execute(entity);
		if (entity.getPersistentData().getDouble("cnt1") > 0) {
			entity.getPersistentData().putDouble("cnt1", (-15));
			entity.getPersistentData().putDouble("cnt3", (entity.getPersistentData().getDouble("cnt3") + 1));
			dis_num = 25;
			if (UseBoss2) {
				dis_num = dis_num * 2;
			}
			entity.getPersistentData().putDouble("x_pos",
					(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(dis_num)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()
							+ Math.random() * 4 - 2));
			entity.getPersistentData().putDouble("y_pos", (entity.getY() + 12));
			entity.getPersistentData().putDouble("z_pos",
					(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(dis_num)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()
							+ Math.random() * 4 - 2));
			for (int index0 = 0; index0 < 12; index0++) {
				if (!world.getBlockState(BlockPos.containing(entity.getPersistentData().getDouble("x_pos"), entity.getPersistentData().getDouble("y_pos") + 1, entity.getPersistentData().getDouble("z_pos"))).canOcclude()) {
					entity.getPersistentData().putDouble("y_pos", (entity.getPersistentData().getDouble("y_pos") + 1));
				}
			}
			if (entity.getPersistentData().getDouble("cnt3") > 6) {
				entity.getPersistentData().putDouble("skill2", 0);
			} else {
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
		}
		if (entity.getPersistentData().getDouble("skill2") != 0) {
			for (int index1 = 0; index1 < 6; index1++) {
				xPos = entity.getPersistentData().getDouble("x_pos");
				yPos = entity.getPersistentData().getDouble("y_pos");
				zPos = entity.getPersistentData().getDouble("z_pos");
				if (!world.getBlockState(BlockPos.containing(entity.getPersistentData().getDouble("x_pos"), entity.getPersistentData().getDouble("y_pos"), entity.getPersistentData().getDouble("z_pos"))).canOcclude()) {
					if (Math.random() < 0.6) {
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.WITCH, xPos, yPos, zPos, 3, 0, 0, 0, 0.3);
					}
					if (UseBoss2 && Math.random() < 0.25) {
						if (world instanceof ServerLevel _level)
							_level.sendParticles((SimpleParticleType) (RanahiromodModParticleTypes.LIGHT_SCATTER.get()), xPos, yPos, zPos, 5, 0, 0, 0, 0.25);
					}
					if (Math.random() < 0.5) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"particle dust 0.6 0.05 0.1 2 ~ ~ ~ 0.5 0.5 0.5 3 15 force");
					} else {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"particle dust 0.75 0 0 2 ~ ~ ~ 0.5 0.5 0.5 3 15 force");
					}
				} else {
					if (world instanceof Level _level && !_level.isClientSide())
						_level.explode(null, xPos, yPos, zPos, 0, Level.ExplosionInteraction.NONE);
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.WITCH, xPos, yPos, zPos, 25, 1, 1, 1, 0.25);
					if (UseBoss2) {
						if (world instanceof ServerLevel _level)
							_level.sendParticles((SimpleParticleType) (RanahiromodModParticleTypes.LIGHT_SCATTER.get()), xPos, yPos, zPos, 15, 1, 1, 1, 0.25);
					}
					entity.getPersistentData().putDouble("cnt1", 0);
				}
				if (UseBoss2) {
					entity.getPersistentData().putDouble("damage", (21 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
					entity.getPersistentData().putDouble("range", 4);
					entity.getPersistentData().putDouble("knockback", 1.25);
				} else {
					entity.getPersistentData().putDouble("damage", (19 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
					entity.getPersistentData().putDouble("range", 3);
					entity.getPersistentData().putDouble("knockback", 0.75);
				}
				entity.getPersistentData().putDouble("projectile_type", 2);
				DodamageProcedure.execute(world, xPos, yPos, zPos, entity);
				entity.getPersistentData().putDouble("y_pos", (entity.getPersistentData().getDouble("y_pos") - 1));
			}
		}
	}
}
