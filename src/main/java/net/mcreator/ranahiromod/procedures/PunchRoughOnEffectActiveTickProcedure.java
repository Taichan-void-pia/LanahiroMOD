package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;

import net.mcreator.ranahiromod.init.RanahiromodModMobEffects;

import java.util.List;
import java.util.Comparator;

public class PunchRoughOnEffectActiveTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean flag_a = false;
		double range_sensing = 0;
		double zPos = 0;
		double yPos = 0;
		double xPos = 0;
		if (entity.getPersistentData().getDouble("breathes") == 0 && entity.getPersistentData().getDouble("breathes2") == 0 && entity.getPersistentData().getDouble("demon_art") == 0 && entity.getPersistentData().getDouble("skill") == 0
				&& entity.getPersistentData().getDouble("skill2") == 0) {
			if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(RanahiromodModMobEffects.PUNCH_ROUGH.get()) ? _livEnt.getEffect(RanahiromodModMobEffects.PUNCH_ROUGH.get()).getAmplifier() : 0) >= 0) {
				ArrowSweepAroundThrowProcedure.execute(world, x, y, z, entity);
				if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(RanahiromodModMobEffects.PUNCH_ROUGH.get()) ? _livEnt.getEffect(RanahiromodModMobEffects.PUNCH_ROUGH.get()).getDuration() : 0) % 6 == 3) {
					range_sensing = 3;
					flag_a = true;
				}
			}
			if (flag_a) {
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(range_sensing / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if (!((entityiterator instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == entity) && !((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == entityiterator)
								&& !(entityiterator instanceof Player)) {
							entity.getPersistentData().putDouble("damage", (5 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
							entity.getPersistentData().putDouble("knockback", 0.75);
							entity.getPersistentData().putDouble("range", range_sensing);
							entity.getPersistentData().putBoolean("swing", true);
							DodamageProcedure.execute(world, entityiterator.getX(), entityiterator.getY(), entityiterator.getZ(), entity);
						}
					}
				}
			}
		}
	}
}
