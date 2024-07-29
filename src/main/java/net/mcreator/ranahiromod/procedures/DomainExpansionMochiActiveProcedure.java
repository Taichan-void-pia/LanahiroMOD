package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.ranahiromod.init.RanahiromodModParticleTypes;
import net.mcreator.ranahiromod.init.RanahiromodModMobEffects;

public class DomainExpansionMochiActiveProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double num1 = 0;
		double num2 = 0;
		double range = 0;
		double x_pos = 0;
		double y_pos = 0;
		double z_pos = 0;
		range = 50;
		if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(RanahiromodModMobEffects.DOMAIN_EXPANSION.get()) ? _livEnt.getEffect(RanahiromodModMobEffects.DOMAIN_EXPANSION.get()).getDuration() : 0) % 10 == 0) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (RanahiromodModParticleTypes.MOCHI_PARTICLE.get()), (entity.getPersistentData().getDouble("x_pos_domain")), (entity.getPersistentData().getDouble("y_pos_domain")),
						(entity.getPersistentData().getDouble("z_pos_domain")), 15, 8, 8, 8, 0);
			if (Math.random() < 0.5) {
				num1 = Math.toRadians(Math.random() * 360);
				num2 = Math.random() * range - range / 2;
				x_pos = entity.getPersistentData().getDouble("x_pos_domain") + Math.sin(num1) * num2;
				y_pos = entity.getPersistentData().getDouble("y_pos_domain");
				z_pos = entity.getPersistentData().getDouble("z_pos_domain") + Math.cos(num1) * num2;
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x_pos, y_pos, z_pos), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ranahiromod:flame_explode")), SoundSource.NEUTRAL, (float) 0.25, 1);
					} else {
						_level.playLocalSound(x_pos, y_pos, z_pos, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ranahiromod:flame_explode")), SoundSource.NEUTRAL, (float) 0.25, 1, false);
					}
				}
				if (Math.random() < 0.3) {
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.FLAME, x_pos, y_pos, z_pos, 50, 0.25, 3, 0.25, 0);
					entity.getPersistentData().putDouble("damage", (12 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
					entity.getPersistentData().putDouble("range", 5);
					entity.getPersistentData().putDouble("effect", 4);
					DodamageProcedure.execute(world, x_pos, y_pos, z_pos, entity);
				}
			}
			if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(RanahiromodModMobEffects.DOMAIN_EXPANSION.get()) ? _livEnt.getEffect(RanahiromodModMobEffects.DOMAIN_EXPANSION.get()).getDuration() : 0) % 20 == 0) {
				entity.getPersistentData().putDouble("damage", (9 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
				entity.getPersistentData().putDouble("range", range);
				entity.getPersistentData().putDouble("effect", 4);
				DodamageProcedure.execute(world, entity.getPersistentData().getDouble("x_pos_domain"), entity.getPersistentData().getDouble("y_pos_domain"), entity.getPersistentData().getDouble("z_pos_domain"), entity);
			}
		}
		num1 = Math.toRadians(Math.random() * 360);
		num2 = range / 2 - 2;
		x_pos = entity.getPersistentData().getDouble("x_pos_domain") + Math.sin(num1) * num2;
		y_pos = entity.getPersistentData().getDouble("y_pos_domain");
		z_pos = entity.getPersistentData().getDouble("z_pos_domain") + Math.cos(num1) * num2;
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.FLAME, x_pos, y_pos, z_pos, 15, 0.25, 1, 0.25, 0);
	}
}
