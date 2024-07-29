package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
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

import java.util.List;
import java.util.Comparator;

public class SkillDragonhiro3Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean UseSK = false;
		boolean logic_attack = false;
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
		entity.getPersistentData().putDouble("cnt1", (entity.getPersistentData().getDouble("cnt1") + 1));
		if (entity.getPersistentData().getDouble("cnt1") < 8) {
			rad_now = Math.toRadians(Math.random() * 360);
			pitch = Math.toRadians(0);
			num1 = (Math.random() - 0.5) * 1.6;
			num2 = (Math.random() - 0.5) * 1.6;
			num3 = (Math.random() - 0.5) * 1.6;
			entity.getPersistentData().putDouble("cnt2", 0);
			entity.getPersistentData().putDouble("x_pos", x);
			entity.getPersistentData().putDouble("y_pos", (y + 1));
			entity.getPersistentData().putDouble("z_pos", z);
			for (int index0 = 0; index0 < 25; index0++) {
				xPos = entity.getPersistentData().getDouble("x_pos") + Math.cos(rad_now) * (Math.cos(pitch) + Math.abs(Math.sin(rad_now) * Math.sin(pitch))) * (entity.getPersistentData().getDouble("cnt2") + 1);
				yPos = entity.getPersistentData().getDouble("y_pos") + Math.sin(pitch) * (entity.getPersistentData().getDouble("cnt2") + 1) * (-1);
				zPos = entity.getPersistentData().getDouble("z_pos") + Math.sin(rad_now) * (Math.cos(pitch) + Math.abs(Math.cos(rad_now) * Math.sin(pitch))) * (entity.getPersistentData().getDouble("cnt2") + 1);
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"particle dust 0.490 0.490 0.490 1 ~ ~ ~ 0.2 0.2 0.2 0 5 normal");
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.END_ROD, xPos, yPos, zPos, 3, 0.2, 0.2, 0.2, 0);
				entity.getPersistentData().putDouble("cnt2", (entity.getPersistentData().getDouble("cnt2") + 0.25));
				if (entity.getPersistentData().getDouble("cnt2") % 4 < 2) {
					entity.getPersistentData().putDouble("x_pos", (entity.getPersistentData().getDouble("x_pos") + num1));
					entity.getPersistentData().putDouble("y_pos", (entity.getPersistentData().getDouble("y_pos") + num2));
					entity.getPersistentData().putDouble("z_pos", (entity.getPersistentData().getDouble("z_pos") + num3));
				} else {
					entity.getPersistentData().putDouble("x_pos", (entity.getPersistentData().getDouble("x_pos") - num1));
					entity.getPersistentData().putDouble("y_pos", (entity.getPersistentData().getDouble("y_pos") - num2));
					entity.getPersistentData().putDouble("z_pos", (entity.getPersistentData().getDouble("z_pos") - num3));
				}
			}
			entity.getPersistentData().putDouble("knockback", 0.5);
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(30 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (!(entityiterator == entity) && (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) > 0) {
						entityiterator.setDeltaMovement(new Vec3((GetPowerIteratorXProcedure.execute(world, x, y, z, entity) * entity.getPersistentData().getDouble("knockback")),
								(GetPowerIteratorYProcedure.execute(world, x, y, z, entity) * entity.getPersistentData().getDouble("knockback")),
								(GetPowerIteratorZProcedure.execute(world, x, y, z, entity) * entity.getPersistentData().getDouble("knockback"))));
					}
					if ((entityiterator instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_RESISTANCE) ? _livEnt.getEffect(MobEffects.DAMAGE_RESISTANCE).getAmplifier() : 0) < 3) {
						tick = entityiterator instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_RESISTANCE) ? _livEnt.getEffect(MobEffects.DAMAGE_RESISTANCE).getDuration() : 0;
						if (entity instanceof LivingEntity _entity)
							_entity.removeEffect(MobEffects.DAMAGE_RESISTANCE);
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, (int) tick, 3, false, false));
					}
				}
			}
			entity.getPersistentData().putDouble("damage", (22 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
			entity.getPersistentData().putDouble("range", 40);
			entity.getPersistentData().putDouble("knockback", 2.5);
			entity.getPersistentData().putDouble("projectile_type", 1);
			DodamageProcedure.execute(world, x, y, z, entity);
			for (int index1 = 0; index1 < 10; index1++) {
				x_pos = x + (Math.random() - 0.5) * 40;
				y_pos = y + (Math.random() - 0.5) * 40;
				z_pos = z + (Math.random() - 0.5) * 40;
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x_pos, y_pos, z_pos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"particle dust 0.490 0.490 0.490 1 ~ ~ ~ 0.2 0.2 0.2 0 5 normal");
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.END_ROD, x_pos, y_pos, z_pos, 3, 0.2, 0.2, 0.2, 0);
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.FLASH, x_pos, y_pos, z_pos, 10, 1, 1, 1, 0.25);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x_pos, y_pos, z_pos), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie.break_wooden_door")), SoundSource.NEUTRAL, 3, 1);
					} else {
						_level.playLocalSound(x_pos, y_pos, z_pos, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie.break_wooden_door")), SoundSource.NEUTRAL, 3, 1, false);
					}
				}
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, (x + (Math.random() - 0.5) * 4), y, (z + (Math.random() - 0.5) * 4), 0, Level.ExplosionInteraction.NONE);
			}
		}
		if (entity.getPersistentData().getDouble("cnt1") > 20) {
			entity.getPersistentData().putDouble("skill2", 0);
		}
	}
}
