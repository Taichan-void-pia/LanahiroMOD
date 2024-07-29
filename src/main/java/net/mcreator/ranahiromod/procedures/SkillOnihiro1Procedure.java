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

public class SkillOnihiro1Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
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
		boolean logic_a = false;
		if (entity.getPersistentData().getDouble("cnt3") == 0) {
			entity.getPersistentData().putDouble("cnt1", (entity.getPersistentData().getDouble("cnt1") + 1));
			if (entity.getPersistentData().getDouble("cnt1") == 1) {
				entity.getPersistentData().putDouble("start_r", (entity.getYRot() + 20));
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
			if (entity.getPersistentData().getDouble("cnt1") < 3) {
				for (int index0 = 0; index0 < 10; index0++) {
					rad = Math.toRadians(entity.getPersistentData().getDouble("start_r") + entity.getPersistentData().getDouble("cnt2"));
					rad_now = Math.toRadians(entity.getXRot());
					yaw_now = Math.toRadians(entity.getYRot() + 90);
					dis = 2.4;
					for (int index1 = 0; index1 < 4; index1++) {
						xPos = x + Math.cos(rad) * (Math.cos(rad_now) + Math.abs(Math.sin(yaw_now) * Math.sin(rad_now))) * dis;
						yPos = y + 1 + Math.sin(Math.toRadians(entity.getPersistentData().getDouble("cnt2"))) * Math.sin(rad_now) * (-1) * dis;
						zPos = z + Math.sin(rad) * (Math.cos(rad_now) + Math.abs(Math.cos(yaw_now) * Math.sin(rad_now))) * dis;
						dis = dis + 0.2;
						if (Math.random() < 0.5) {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"particle dust 1 0.2 0.227 1 ~ ~ ~ 0.05 0.05 0.05 0 3 normal");
						} else {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"particle dust 0.5 0 0 1 ~ ~ ~ 0.05 0.05 0.05 0 3 normal");
						}
						if (world instanceof ServerLevel _level)
							_level.sendParticles((SimpleParticleType) (RanahiromodModParticleTypes.BLACKFLAME.get()), xPos, yPos, zPos, 5, 0, 0, 0, 0.05);
						entity.getPersistentData().putDouble("damage", (16 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
						entity.getPersistentData().putDouble("knockback", 1.5);
						entity.getPersistentData().putDouble("range", 3);
						entity.getPersistentData().putDouble("projectile_type", 2);
						DodamageProcedure.execute(world, xPos, yPos, zPos, entity);
						dis = dis + 0.2;
					}
					entity.getPersistentData().putDouble("cnt2", (entity.getPersistentData().getDouble("cnt2") + 7));
				}
			}
			if (entity.getPersistentData().getDouble("cnt1") > 10) {
				if (entity.isShiftKeyDown()) {
					entity.getPersistentData().putDouble("skill2", 0);
				} else {
					entity.getPersistentData().putDouble("cnt3", 1);
				}
			}
		} else {
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ranahiromod:sword_sweep")), SoundSource.NEUTRAL, (float) 0.3, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ranahiromod:sword_sweep")), SoundSource.NEUTRAL, (float) 0.3, 1, false);
				}
			}
			yaw = entity.getYRot();
			pitch = entity.getXRot();
			entity.getPersistentData().putDouble("cnt4", (Math.random() * 4 - 2));
			entity.getPersistentData().putDouble("cnt5", (Math.abs(entity.getPersistentData().getDouble("cnt4")) - 2));
			yaw2 = yaw - entity.getPersistentData().getDouble("cnt4") * 15;
			pitch2 = pitch - entity.getPersistentData().getDouble("cnt5") * 15;
			for (int index2 = 0; index2 < 30; index2++) {
				{
					Entity _ent = entity;
					_ent.setYRot((float) yaw2);
					_ent.setXRot((float) pitch2);
					_ent.setYBodyRot(_ent.getYRot());
					_ent.setYHeadRot(_ent.getYRot());
					_ent.yRotO = _ent.getYRot();
					_ent.xRotO = _ent.getXRot();
					if (_ent instanceof LivingEntity _entity) {
						_entity.yBodyRotO = _entity.getYRot();
						_entity.yHeadRotO = _entity.getYRot();
					}
				}
				yaw2 = yaw2 + entity.getPersistentData().getDouble("cnt4");
				pitch2 = pitch2 + entity.getPersistentData().getDouble("cnt5");
				dis = 0;
				for (int index3 = 0; index3 < 20; index3++) {
					xPos = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(dis)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX();
					yPos = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(dis)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY();
					zPos = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(dis)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ();
					entity.getPersistentData().putDouble("damage", (18 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
					entity.getPersistentData().putDouble("knockback", 1);
					entity.getPersistentData().putDouble("range", 3);
					DodamageProcedure.execute(world, xPos, yPos, zPos, entity);
					if (world.getBlockState(BlockPos.containing(xPos, yPos, zPos)).canOcclude()) {
						if (world instanceof Level _level && !_level.isClientSide())
							_level.explode(null, xPos, yPos, zPos, 0, Level.ExplosionInteraction.NONE);
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.EXPLOSION, xPos, yPos, zPos, 1, 0, 0, 0, 0);
						if (Math.random() < 0.5) {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"particle dust 1 0.2 0.227 2 ~ ~ ~ 0.05 0.05 0.05 0 3 normal");
						} else {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"particle dust 0.5 0 0 2 ~ ~ ~ 0.05 0.05 0.05 0 3 normal");
						}
						logic_a = true;
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(xPos, yPos, zPos), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ranahiromod:sword_sweep")), SoundSource.NEUTRAL, (float) 0.05, (float) 1.1);
						} else {
							_level.playLocalSound(xPos, yPos, zPos, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ranahiromod:sword_sweep")), SoundSource.NEUTRAL, (float) 0.05, (float) 1.1, false);
						}
					}
					dis = dis + 1;
					if (logic_a) {
						logic_a = false;
						break;
					}
				}
			}
			{
				Entity _ent = entity;
				_ent.setYRot((float) yaw);
				_ent.setXRot((float) pitch);
				_ent.setYBodyRot(_ent.getYRot());
				_ent.setYHeadRot(_ent.getYRot());
				_ent.yRotO = _ent.getYRot();
				_ent.xRotO = _ent.getXRot();
				if (_ent instanceof LivingEntity _entity) {
					_entity.yBodyRotO = _entity.getYRot();
					_entity.yHeadRotO = _entity.getYRot();
				}
			}
			entity.getPersistentData().putDouble("skill2", 0);
		}
	}
}
