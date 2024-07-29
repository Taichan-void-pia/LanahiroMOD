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

public class SkillWaterhiro7Procedure {
	public static void execute(LevelAccessor world, Entity entity) {
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
		double x_num = 0;
		double y_num = 0;
		double z_num = 0;
		if (entity.getPersistentData().getDouble("cnt2") <= 20) {
			entity.getPersistentData().putDouble("cnt1", (entity.getPersistentData().getDouble("cnt1") + 1));
			if (entity.getPersistentData().getDouble("cnt1") <= 3) {
				if (entity.getPersistentData().getDouble("cnt1") == 1) {
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					dis_num = 25;
					entity.getPersistentData().putDouble("x_pos",
							(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(dis_num)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()
									+ (Math.random() - 0.5) * 10));
					entity.getPersistentData().putDouble("y_pos", (entity.getY()));
					entity.getPersistentData().putDouble("z_pos",
							(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(dis_num)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()
									+ (Math.random() - 0.5) * 10));
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(entity.getPersistentData().getDouble("x_pos"), entity.getPersistentData().getDouble("y_pos"), entity.getPersistentData().getDouble("z_pos")),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound((entity.getPersistentData().getDouble("x_pos")), (entity.getPersistentData().getDouble("y_pos")), (entity.getPersistentData().getDouble("z_pos")),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
				yPos = entity.getPersistentData().getDouble("y_pos");
				for (int index0 = 0; index0 < 12; index0++) {
					xPos = entity.getPersistentData().getDouble("x_pos");
					zPos = entity.getPersistentData().getDouble("z_pos");
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.END_ROD, xPos, yPos, zPos, 5, 0, 0, 0, 0);
					yPos = yPos + 1;
				}
			} else if (entity.getPersistentData().getDouble("cnt1") <= 10) {
				if (entity.getPersistentData().getDouble("cnt1") == 4) {
					dis_num = 25;
					entity.getPersistentData().putDouble("x_pos", (entity.getPersistentData().getDouble("x_pos")));
					entity.getPersistentData().putDouble("y_pos", (entity.getY() + 5));
					entity.getPersistentData().putDouble("z_pos", (entity.getPersistentData().getDouble("z_pos")));
				}
				xPos = entity.getPersistentData().getDouble("x_pos");
				yPos = entity.getPersistentData().getDouble("y_pos") - (entity.getPersistentData().getDouble("cnt1") - 3);
				zPos = entity.getPersistentData().getDouble("z_pos");
				if (Math.random() < 0.5) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"particle dust 0.361 0.765 1.000 1 ~ ~ ~ 1 1 1 0.5 25 force");
				} else {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"particle dust 0 0 0.5 1 ~ ~ ~ 1 1 1 0.5 25 force");
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.SONIC_BOOM, xPos, yPos, zPos, 1, 0, 0, 0, 1);
				if (world.getBlockState(BlockPos.containing(xPos, yPos, zPos)).canOcclude()) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(xPos, yPos, zPos), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.end_gateway.spawn")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(xPos, yPos, zPos, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.end_gateway.spawn")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.EXPLOSION, xPos, yPos, zPos, 15, 1, 1, 1, 1);
				}
				entity.getPersistentData().putDouble("damage", (23 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
				entity.getPersistentData().putDouble("range", 8);
				DodamageProcedure.execute(world, xPos, yPos, zPos, entity);
			} else {
				entity.getPersistentData().putDouble("cnt1", 0);
				entity.getPersistentData().putDouble("cnt2", (entity.getPersistentData().getDouble("cnt2") + 1));
			}
		} else {
			entity.getPersistentData().putDouble("skill2", 0);
		}
	}
}
