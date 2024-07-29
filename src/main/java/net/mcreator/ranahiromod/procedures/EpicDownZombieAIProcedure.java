package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.ranahiromod.init.RanahiromodModParticleTypes;
import net.mcreator.ranahiromod.init.RanahiromodModItems;
import net.mcreator.ranahiromod.entity.UndefinedZombieEntity;
import net.mcreator.ranahiromod.entity.EpicDownZombieEntity;

import java.util.List;
import java.util.Comparator;

public class EpicDownZombieAIProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double rnd = 0;
		double dis = 0;
		if (entity.isAlive()) {
			if (entity.getPersistentData().getDouble("cnt_x") == 0) {
				if (!((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) >= 0)
						|| (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) < 4) {
					if (entity instanceof EpicDownZombieEntity) {
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, (int) Double.POSITIVE_INFINITY, 6, false, false));
					}
				}
				if (!((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_RESISTANCE) ? _livEnt.getEffect(MobEffects.DAMAGE_RESISTANCE).getAmplifier() : 0) >= 0)
						|| (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_RESISTANCE) ? _livEnt.getEffect(MobEffects.DAMAGE_RESISTANCE).getAmplifier() : 0) < 1) {
					if (entity instanceof EpicDownZombieEntity) {
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, (int) Double.POSITIVE_INFINITY, 3, false, false));
					}
				}
				if (entity instanceof EpicDownZombieEntity) {
					if (Math.random() < 0.2) {
						rnd = Math.random();
						if (rnd < 0.33) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack = new ItemStack(RanahiromodModItems.EPIC_DOWN_BATTLE_AXE.get()).copy();
								_setstack.setCount(1);
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						} else if (rnd < 0.66) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack = new ItemStack(RanahiromodModItems.EPIC_DOWN_SWORD.get()).copy();
								_setstack.setCount(1);
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						} else if (rnd < 1) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack = new ItemStack(RanahiromodModItems.EPIC_DOWN_SPEAR.get()).copy();
								_setstack.setCount(1);
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						}
					}
				}
				entity.getPersistentData().putDouble("cnt_x", 1);
			}
			entity.getPersistentData().putDouble("cnt_target", (entity.getPersistentData().getDouble("cnt_target") + 1));
			if (entity instanceof UndefinedZombieEntity) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (RanahiromodModParticleTypes.NULL_PARTICLE.get()), x, y, z, 5, 1, 1, 1, 0.01);
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if (!(entityiterator == entity)) {
							if (entityiterator instanceof LivingEntity) {
								if (!entityiterator.getPersistentData().getBoolean("teshita")) {
									entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MAGIC)), 40);
								}
							}
						}
					}
				}
			}
			if (!((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity)) {
				entity.getPersistentData().putDouble("cnt_target", 0);
			} else if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity) {
				DirectionProcedure.execute(entity);
			}
		}
	}
}
