package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
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

public class SkillSKLiner6Procedure {
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
		double dis_range = 0;
		entity.getPersistentData().putDouble("cnt1", (entity.getPersistentData().getDouble("cnt1") + 1));
		UseSK = UsePlayerLogicProcedure.execute(entity);
		if (entity.getPersistentData().getDouble("cnt1") < 15) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 5, 99, false, false));
		} else if (entity.getPersistentData().getDouble("cnt1") < 20) {
			entity.fallDistance = 0;
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 10, 5, false, false));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 2, 5, false, false));
			if (entity.getPersistentData().getDouble("cnt2") == 0) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ranahiromod:sword_sweep")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ranahiromod:sword_sweep")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				entity.getPersistentData().putDouble("cnt2", (entity.getPersistentData().getDouble("cnt2") + 1));
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"particle dust_color_transition 0.500 1.000 1.000 1 0.350 0.250 1.000 ~ ~ ~ 0 0 0 1 40 force");
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.FLASH, x, y, z, 5, 0, 0, 0, 1);
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.END_ROD, x, (y + 1), z, 200, 0.25, 0.5, 0.25, 0);
				if (UseSK) {
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (RanahiromodModParticleTypes.SK_LINER_BLADE_PARTICLE.get()), x, (y + 1), z, 25, 0.25, 0.5, 0.25, 0.5);
				}
				if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity) {
					GetPowerProcedure.execute(world, x, y, z, entity);
				} else {
					GetPowerFowardProcedure.execute(world, x, y, z, entity);
				}
			}
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"particle dust_color_transition 0.500 1.000 1.000 1 0.350 0.250 1.000 ~ ~ ~ 0 0 0 1 10 force");
			entity.getPersistentData().putDouble("damage", (22 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
			if (UseSK) {
				entity.getPersistentData().putDouble("range", 4);
			} else {
				entity.getPersistentData().putDouble("range", 3);
			}
			dis = 0;
			for (int index0 = 0; index0 < 7; index0++) {
				entity.getPersistentData().putDouble("effect", 1);
				entity.getPersistentData().putBoolean("swing", true);
				DodamageProcedure.execute(world, x + entity.getPersistentData().getDouble("x_power") * dis, y + 1 + entity.getPersistentData().getDouble("y_power") * dis, z + entity.getPersistentData().getDouble("z_power") * dis, entity);
				dis = dis - 0.5;
			}
			dis = 3;
			if (UseSK) {
				dis = 4;
			}
			entity.setDeltaMovement(new Vec3((entity.getPersistentData().getDouble("x_power") * dis), (entity.getPersistentData().getDouble("y_power") * dis), (entity.getPersistentData().getDouble("z_power") * dis)));
		} else if (entity.getPersistentData().getDouble("cnt1") < 28) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 5, 99, false, false));
			entity.setDeltaMovement(new Vec3(0, 0, 0));
			if (entity.getPersistentData().getDouble("cnt1") == 19) {
				if (UseSK) {
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (RanahiromodModParticleTypes.SK_LINER_BLADE_PARTICLE.get()), x, y, z, 40, 0, 0, 0, 1);
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.FIREWORK, x, y, z, 40, 0, 0, 0, 1);
				} else {
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.FIREWORK, x, y, z, 80, 0, 0, 0, 1);
				}
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"particle dust_color_transition 0.500 1.000 1.000 1 0.350 0.250 1.000 ~ ~ ~ 0 0 0 1 10 force");
			}
		} else {
			entity.getPersistentData().putDouble("skill2", 0);
		}
	}
}
