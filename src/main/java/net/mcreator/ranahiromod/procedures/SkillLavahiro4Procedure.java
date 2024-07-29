package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.Mob;
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

public class SkillLavahiro4Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
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
		boolean type = false;
		boolean flag_end = false;
		if (entity instanceof LivingEntity _entity)
			_entity.swing(InteractionHand.MAIN_HAND, true);
		entity.getPersistentData().putDouble("cnt1", (entity.getPersistentData().getDouble("cnt1") + 1));
		if (entity.getPersistentData().getDouble("cnt1") == 1) {
			if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity) {
				xPos = (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX();
				yPos = (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY();
				zPos = (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ();
			} else {
				xPos = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(20)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX();
				yPos = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(20)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY();
				zPos = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(20)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ();
			}
			yPos = yPos + 24;
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(xPos, yPos, zPos), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.fire.ambient")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(xPos, yPos, zPos, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.fire.ambient")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(xPos, yPos, zPos), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.swim")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(xPos, yPos, zPos, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.swim")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(xPos, yPos, zPos), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.splash")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(xPos, yPos, zPos, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.splash")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(xPos, yPos, zPos), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.lava.ambient")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(xPos, yPos, zPos, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.lava.ambient")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
			entity.getPersistentData().putDouble("x_pos", xPos);
			entity.getPersistentData().putDouble("y_pos", yPos);
			entity.getPersistentData().putDouble("z_pos", zPos);
			entity.getPersistentData().putDouble("x_power", ((Math.random() - 0.5) / 5));
			entity.getPersistentData().putDouble("z_power", ((Math.random() - 0.5) / 5));
		}
		entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x() / 5), (entity.getDeltaMovement().y()), (entity.getDeltaMovement().z() / 5)));
		if (entity.getPersistentData().getDouble("cnt1") % 2 == 0) {
			entity.getPersistentData().putDouble("x_power", (entity.getPersistentData().getDouble("x_power") * (-1)));
			entity.getPersistentData().putDouble("z_power", (entity.getPersistentData().getDouble("z_power") * (-1)));
		}
		flag_end = false;
		for (int index0 = 0; index0 < 3; index0++) {
			entity.getPersistentData().putDouble("y_pos", (entity.getPersistentData().getDouble("y_pos") - 1));
			for (int index1 = 0; index1 < 6; index1++) {
				entity.getPersistentData().putDouble("x_pos", (entity.getPersistentData().getDouble("x_pos") + entity.getPersistentData().getDouble("x_power")));
				entity.getPersistentData().putDouble("z_pos", (entity.getPersistentData().getDouble("z_pos") + entity.getPersistentData().getDouble("z_power")));
				xPos = entity.getPersistentData().getDouble("x_pos");
				yPos = entity.getPersistentData().getDouble("y_pos");
				zPos = entity.getPersistentData().getDouble("z_pos");
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.FLAME, xPos, yPos, zPos, 20, 0.1, 0.1, 0.1, 0.01);
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.LAVA, xPos, yPos, zPos, 3, 0.1, 0.1, 0.1, 0.1);
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.FIREWORK, xPos, yPos, zPos, 1, 0, 0, 0, 0);
				world.levelEvent(2001, BlockPos.containing(xPos, yPos, zPos), Block.getId(Blocks.LAVA.defaultBlockState()));
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"particle dust 1.000 0.200 0.227 2 ~ ~ ~ 0.1 0.1 0.1 1 8 force");
				entity.getPersistentData().putDouble("damage", (16 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
				entity.getPersistentData().putDouble("knockback", 0.1);
				entity.getPersistentData().putDouble("range", 3);
				entity.getPersistentData().putDouble("projectile_type", 2);
				DodamageProcedure.execute(world, xPos, yPos, zPos, entity);
				if (world.getBlockState(BlockPos.containing(xPos, yPos, zPos)).canOcclude()) {
					flag_end = true;
					break;
				}
			}
			if (flag_end) {
				break;
			}
		}
		if (entity.getPersistentData().getDouble("cnt1") > 10 || flag_end) {
			entity.getPersistentData().putDouble("cnt1", 0);
			entity.getPersistentData().putDouble("cnt2", (entity.getPersistentData().getDouble("cnt2") + 1));
			xPos = entity.getPersistentData().getDouble("x_pos");
			yPos = entity.getPersistentData().getDouble("y_pos");
			zPos = entity.getPersistentData().getDouble("z_pos");
			entity.getPersistentData().putDouble("damage", (18 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
			entity.getPersistentData().putDouble("knockback", 0.2);
			entity.getPersistentData().putDouble("range", 5);
			entity.getPersistentData().putDouble("projectile_type", 2);
			DodamageProcedure.execute(world, xPos, yPos, zPos, entity);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.FLAME, xPos, yPos, zPos, 25, 1, 1, 1, 0.5);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.LAVA, xPos, yPos, zPos, 3, 2, 2, 2, 0.5);
			world.levelEvent(2001, BlockPos.containing(xPos, yPos, zPos), Block.getId(Blocks.LAVA.defaultBlockState()));
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"particle dust 1.000 0.200 0.227 2 ~ ~ ~ 0.5 0.5 0.5 1 50 force");
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.splash")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.splash")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		}
		if (entity.getPersistentData().getDouble("cnt2") > 4) {
			entity.getPersistentData().putDouble("skill2", 0);
		}
	}
}
