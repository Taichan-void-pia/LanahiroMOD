package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.ranahiromod.init.RanahiromodModMobEffects;

import javax.annotation.Nullable;

import java.util.List;
import java.util.Comparator;

@Mod.EventBusSubscriber
public class NodamagePotionprojectileProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double dis = 0;
		boolean type = false;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(RanahiromodModMobEffects.NO_DAMAGE.get())) {
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if ((entityiterator instanceof Projectile _projEnt ? _projEnt.getDeltaMovement().length() : 0) > 0) {
						if (entityiterator.isNoGravity()) {
							entityiterator.setDeltaMovement(new Vec3((1000 * entityiterator.getDeltaMovement().x()), (1000 * entityiterator.getDeltaMovement().y()), (1000 * entityiterator.getDeltaMovement().z())));
							entityiterator.setNoGravity(false);
						}
					}
				}
			}
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if ((entityiterator instanceof Projectile _projEnt ? _projEnt.getDeltaMovement().length() : 0) > 0) {
						dis = Math.sqrt(Math.pow(entityiterator.getX() - entity.getX(), 2) + Math.pow(entityiterator.getY() - entity.getY(), 2) + Math.pow(entityiterator.getZ() - entity.getZ(), 2));
						if (!entityiterator.getPersistentData().getBoolean("check_projectile")) {
							if (dis <= 3) {
								type = true;
							} else {
								type = false;
							}
							entityiterator.getPersistentData().putBoolean("check_projectile", true);
						}
						if (!type) {
							if (!entityiterator.isNoGravity()) {
								entityiterator.setDeltaMovement(new Vec3((0.001 * entityiterator.getDeltaMovement().x()), (0.001 * entityiterator.getDeltaMovement().y()), (0.001 * entityiterator.getDeltaMovement().z())));
								entityiterator.setNoGravity(true);
							}
							if (entityiterator.isNoGravity()) {
								entityiterator.setDeltaMovement(new Vec3((1.005 * entityiterator.getDeltaMovement().x()), (1.005 * entityiterator.getDeltaMovement().y()), (1.005 * entityiterator.getDeltaMovement().z())));
							}
						}
					}
				}
			}
		}
	}
}
