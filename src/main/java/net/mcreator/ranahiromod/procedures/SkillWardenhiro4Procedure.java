package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class SkillWardenhiro4Procedure {
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
		double pitch = 0;
		double num1 = 0;
		double num2 = 0;
		double num3 = 0;
		double tick = 0;
		double x_pos = 0;
		double y_pos = 0;
		double z_pos = 0;
		double DealDamage = 0;
		boolean UseSK = false;
		boolean logic_attack = false;
		boolean UseVazafila = false;
		entity.getPersistentData().putDouble("cnt1", (entity.getPersistentData().getDouble("cnt1") + 1));
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 10, 99, false, false));
		entity.setDeltaMovement(new Vec3(0, Math.min(entity.getDeltaMovement().y(), 0), 0));
		if (entity.getPersistentData().getDouble("cnt1") == 1) {
			entity.getPersistentData().putDouble("start_r", (entity.getYRot() + 90));
			entity.getPersistentData().putDouble("x_pos", x);
			entity.getPersistentData().putDouble("y_pos", y);
			entity.getPersistentData().putDouble("z_pos", z);
		}
		if (entity.getPersistentData().getDouble("cnt1") < 8) {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, (x + (Math.random() - 0.5) * 25), (y + Math.random() * 8), (z + (Math.random() - 0.5) * 25), 0, Level.ExplosionInteraction.NONE);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.FLASH, (x + (Math.random() - 0.5) * 10), (y + Math.random() * 5), (z + (Math.random() - 0.5) * 10), 5, 3, 3, 3, 1);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie.break_wooden_door")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie.break_wooden_door")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		}
		rotate = 0;
		for (int index0 = 0; index0 < 20; index0++) {
			rad = Math.toRadians(entity.getPersistentData().getDouble("start_r") + rotate);
			dis = entity.getPersistentData().getDouble("cnt1") - 0.5;
			for (int index1 = 0; index1 < 2; index1++) {
				logic_attack = true;
				xPos = entity.getPersistentData().getDouble("x_pos") + Math.cos(rad) * dis * 2.5;
				yPos = entity.getPersistentData().getDouble("y_pos");
				zPos = entity.getPersistentData().getDouble("z_pos") + Math.sin(rad) * dis * 2.5;
				if (world.getBlockState(BlockPos.containing(xPos, yPos, zPos)).canOcclude()) {
					yPos = entity.getPersistentData().getDouble("y_pos");
					for (int index2 = 0; index2 < (int) Math.round(dis * 5); index2++) {
						logic_attack = true;
						yPos = yPos + 0.5;
						if (!world.getBlockState(BlockPos.containing(xPos, yPos, zPos)).canOcclude()) {
							break;
						}
						logic_attack = false;
					}
				} else if (!world.getBlockState(BlockPos.containing(xPos, yPos - 0.6, zPos)).canOcclude()) {
					yPos = entity.getPersistentData().getDouble("y_pos");
					for (int index3 = 0; index3 < (int) Math.round(dis * 5); index3++) {
						yPos = yPos - 0.5;
						if (world.getBlockState(BlockPos.containing(xPos, yPos - 0.6, zPos)).canOcclude()) {
							break;
						}
					}
				}
				if (logic_attack) {
					if (Math.random() < 0.5) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"particle dust 0.000 0.337 0.722 1 ~ ~ ~ 0.1 0.1 0.1 0.25 5 force");
					} else {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"particle dust 0.000 0.125 0.271 1 ~ ~ ~ 0.1 0.1 0.1 0.25 5 force");
					}
					entity.getPersistentData().putDouble("damage", (20 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
					entity.getPersistentData().putDouble("range", 2.5);
					entity.getPersistentData().putDouble("knockback", 1);
					entity.getPersistentData().putDouble("projectile_type", 2);
					DodamageProcedure.execute(world, xPos, yPos, zPos, entity);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(xPos, yPos, zPos), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie.break_wooden_door")), SoundSource.NEUTRAL, (float) 0.2, 1);
						} else {
							_level.playLocalSound(xPos, yPos, zPos, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie.break_wooden_door")), SoundSource.NEUTRAL, (float) 0.2, 1, false);
						}
					}
				}
				dis = dis + 0.8;
			}
			rotate = rotate + 18;
		}
		if (entity.getPersistentData().getDouble("cnt1") > 10) {
			entity.getPersistentData().putDouble("skill2", 0);
		}
	}
}
