package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.core.registries.Registries;

import net.mcreator.ranahiromod.init.RanahiromodModMobEffects;

public class PoisonGasOnEffectActiveTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)),
				(float) (20 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(RanahiromodModMobEffects.POISON_GAS.get()) ? _livEnt.getEffect(RanahiromodModMobEffects.POISON_GAS.get()).getAmplifier() : 0) * 2));
	}
}
