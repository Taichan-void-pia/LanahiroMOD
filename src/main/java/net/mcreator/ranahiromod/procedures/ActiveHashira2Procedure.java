package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.InteractionHand;

import net.mcreator.ranahiromod.init.RanahiromodModMobEffects;

import java.util.List;
import java.util.Comparator;

public class ActiveHashira2Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean logic_avoid = false;
		double x_knockback = 0;
		double z_knockback = 0;
		double y_knockback = 0;
		if (entity.getPersistentData().getDouble("breathes") == 0 && entity.getPersistentData().getDouble("breathes2") == 0 && entity.getPersistentData().getDouble("skill2") == 0 && entity.getPersistentData().getDouble("demon_art") == 0
				&& (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity) {
			if (entity.getPersistentData().getDouble("cnt_target") % 10 == 5) {
				if (entity.getPersistentData().getDouble("cnt_target") % 15 == 10 && GetDistanceProcedure.execute(entity) < 4 && entity instanceof LivingEntity) {
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
				}
				if (entity.onGround() && Math.random() < 0.5 && !(entity instanceof LivingEntity _livEnt11 && _livEnt11.hasEffect(RanahiromodModMobEffects.HI_SLOWNESS.get()))) {
					logic_avoid = false;
					{
						final Vec3 _center = new Vec3(x, y, z);
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(32 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
						for (Entity entityiterator : _entfound) {
							if (GetDistanceProcedure.execute(entity) < 9
									&& ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == entityiterator || (entityiterator instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == entity)
									&& (entityiterator.getPersistentData().getDouble("breathes") != 0 || entityiterator.getPersistentData().getDouble("breathes2") != 0 || entityiterator.getPersistentData().getDouble("skill2") != 0
											|| entityiterator.getPersistentData().getDouble("demon_art") != 0)) {
								logic_avoid = true;
							}
							if (logic_avoid) {
								entity.getPersistentData().putDouble("x_power", GetPowerIteratorXProcedure.execute(world, x, y, z, entity));
								entity.getPersistentData().putDouble("z_power", GetPowerIteratorZProcedure.execute(world, x, y, z, entity));
							}
						}
					}
				}
			}
			if (logic_avoid) {
				x_knockback = entity.getPersistentData().getDouble("x_power") * (-1.25);
				y_knockback = 0.5;
				z_knockback = entity.getPersistentData().getDouble("z_power") * (-1.25);
				entity.setDeltaMovement(new Vec3(x_knockback, y_knockback, z_knockback));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 10, 99, false, false));
			}
		}
	}
}
