package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.ranahiromod.init.RanahiromodModParticleTypes;
import net.mcreator.ranahiromod.init.RanahiromodModMobEffects;

public class SkillVazafila5Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean UseSK = false;
		boolean logic_attack = false;
		boolean UseVazafila = false;
		boolean muki = false;
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
		double yaw = 0;
		double pitch = 0;
		entity.getPersistentData().putDouble("cnt1", (entity.getPersistentData().getDouble("cnt1") + 1));
		UseVazafila = UsePlayerLogicvazafilaProcedure.execute(entity);
		entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x() / 5), (entity.getDeltaMovement().y()), (entity.getDeltaMovement().z() / 5)));
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (RanahiromodModParticleTypes.LIGHT_SCATTER.get()), x, (y + entity.getBbHeight() / 2), z, 20, (entity.getBbWidth()), (entity.getBbHeight() / 2), (entity.getBbWidth()), 0.2);
		if (UseVazafila) {
			data = 2;
		} else {
			data = 1;
		}
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100,
					(int) ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.MOVEMENT_SPEED) ? _livEnt.getEffect(MobEffects.MOVEMENT_SPEED).getAmplifier() : 0) + data), false, false));
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.JUMP, 100, (int) data, false, false));
		if (UseVazafila) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(RanahiromodModMobEffects.LOW_ATTACK_REINFORCED.get(), 1200,
						(int) ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) * 0.6), false, false));
		} else {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(RanahiromodModMobEffects.LOW_ATTACK_REINFORCED.get(), 600,
						(int) ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) * 0.4), false, false));
		}
		if (entity.getPersistentData().getDouble("cnt1") > 20) {
			entity.getPersistentData().putDouble("skill2", 0);
		}
	}
}
