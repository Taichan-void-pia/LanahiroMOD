package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.core.registries.Registries;

import net.mcreator.ranahiromod.init.RanahiromodModMobEffects;

public class NullPotionOnEffectActiveTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		entity.setSecondsOnFire(10);
		entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MAGIC)),
				Math.round((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(RanahiromodModMobEffects.NULL_POTION.get()) ? _livEnt.getEffect(RanahiromodModMobEffects.NULL_POTION.get()).getAmplifier() : 0) * 2));
		{
			Entity _ent = entity;
			_ent.setYRot(entity.getYRot());
			_ent.setXRot(-30);
			_ent.setYBodyRot(_ent.getYRot());
			_ent.setYHeadRot(_ent.getYRot());
			_ent.yRotO = _ent.getYRot();
			_ent.xRotO = _ent.getXRot();
			if (_ent instanceof LivingEntity _entity) {
				_entity.yBodyRotO = _entity.getYRot();
				_entity.yHeadRotO = _entity.getYRot();
			}
		}
	}
}
