package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import java.util.List;
import java.util.Comparator;

public class AIMochiMeteorProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean logic_a = false;
		boolean flag = false;
		double speed = 0;
		double xPos = 0;
		double yPos = 0;
		double zPos = 0;
		double dis = 0;
		double rad = 0;
		if (entity.isVehicle()) {
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(25 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (!logic_a && entityiterator.isPassenger() && (entityiterator.getVehicle()) == entity) {
						logic_a = true;
						entity.fallDistance = 0;
						entity.getPersistentData().putBoolean("canFly", true);
						if ((entityiterator instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity) {
							xPos = (entityiterator instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).level()
									.clip(new ClipContext((entityiterator instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getEyePosition(1f),
											(entityiterator instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getEyePosition(1f)
													.add((entityiterator instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getViewVector(1f).scale(0)),
											ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, (entityiterator instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null)))
									.getBlockPos().getX();
							yPos = (entityiterator instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).level()
									.clip(new ClipContext((entityiterator instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getEyePosition(1f),
											(entityiterator instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getEyePosition(1f)
													.add((entityiterator instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getViewVector(1f).scale(0)),
											ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, (entityiterator instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null)))
									.getBlockPos().getY();
							zPos = (entityiterator instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).level()
									.clip(new ClipContext((entityiterator instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getEyePosition(1f),
											(entityiterator instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getEyePosition(1f)
													.add((entityiterator instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getViewVector(1f).scale(0)),
											ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, (entityiterator instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null)))
									.getBlockPos().getZ();
						} else {
							xPos = entityiterator.level()
									.clip(new ClipContext(entityiterator.getEyePosition(1f), entityiterator.getEyePosition(1f).add(entityiterator.getViewVector(1f).scale(128)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entityiterator))
									.getBlockPos().getX();
							yPos = entityiterator.level()
									.clip(new ClipContext(entityiterator.getEyePosition(1f), entityiterator.getEyePosition(1f).add(entityiterator.getViewVector(1f).scale(128)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entityiterator))
									.getBlockPos().getY();
							zPos = entityiterator.level()
									.clip(new ClipContext(entityiterator.getEyePosition(1f), entityiterator.getEyePosition(1f).add(entityiterator.getViewVector(1f).scale(128)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entityiterator))
									.getBlockPos().getZ();
						}
						GetPowerFowardProcedure.execute(world, xPos, yPos, zPos, entity);
					}
				}
			}
		}
		entity.getPersistentData().putDouble("cnt1", (entity.getPersistentData().getDouble("cnt1") + 1));
		xPos = x;
		yPos = y - 1;
		zPos = z;
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.CAMPFIRE_SIGNAL_SMOKE, x, yPos, z, 30, 5, 5, 5, 0.5);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.FLAME, x, yPos, z, 30, 5, 5, 5, 0.5);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.CLOUD, x, yPos, z, 30, 5, 5, 5, 0.5);
		entity.getPersistentData().putDouble("damage", 30);
		entity.getPersistentData().putDouble("knockback", 2);
		entity.getPersistentData().putDouble("range", 20);
		{
			final Vec3 _center = new Vec3(x, yPos, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(20 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (!(entityiterator == entity) && !(entity.getPersistentData().getDouble("NameRanged_ranged") == entityiterator.getPersistentData().getDouble("NameRanged"))) {
					DodamageProcedure.execute(world, x, yPos, z, entity);
				}
			}
		}
		logic_a = false;
		for (int index0 = 0; index0 < 30; index0++) {
			dis = (Math.random() - 0.5) * 20;
			rad = Math.toRadians(Math.random() * 360);
			xPos = x + Math.sin(rad) * dis;
			zPos = z + Math.cos(rad) * dis;
			if (!world.getBlockState(BlockPos.containing(xPos, yPos, zPos)).canOcclude()) {
				logic_a = true;
			}
		}
		if (logic_a) {
			entity.setDeltaMovement(new Vec3(0, (-1), 0));
			entity.getPersistentData().putDouble("cnt1", (entity.getPersistentData().getDouble("cnt1") + 5));
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.CAMPFIRE_SIGNAL_SMOKE, xPos, yPos, zPos, 50, 5, 5, 5, 0.5);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.FLAME, xPos, yPos, zPos, 50, 5, 5, 5, 0);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.CLOUD, xPos, yPos, zPos, 50, 5, 5, 5, 0.5);
			entity.getPersistentData().putDouble("damage", 33);
			entity.getPersistentData().putDouble("knockback", 2);
			entity.getPersistentData().putDouble("range", 33);
			{
				final Vec3 _center = new Vec3(xPos, yPos, zPos);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(33 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (!(entityiterator == entity) && !(entity.getPersistentData().getDouble("NameRanged_ranged") == entityiterator.getPersistentData().getDouble("NameRanged"))) {
						DodamageProcedure.execute(world, xPos, yPos, zPos, entity);
					}
				}
			}
			for (int index1 = 0; index1 < 4; index1++) {
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, (xPos + (Math.random() - 0.5) * 40), yPos, (zPos + (Math.random() - 0.5) * 40), 2, Level.ExplosionInteraction.NONE);
			}
		} else {
			entity.setDeltaMovement(new Vec3((entity.getPersistentData().getDouble("x_power") * 0.25), (-1), (entity.getPersistentData().getDouble("z_power") * 0.25)));
		}
		if (!entity.isAlive() || entity.getPersistentData().getDouble("cnt1") > 200) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.CAMPFIRE_SIGNAL_SMOKE, x, (y + 10), z, 150, 8, 8, 8, 0.5);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.FLAME, x, (y + 10), z, 150, 8, 8, 8, 0.5);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.CLOUD, x, (y + 10), z, 150, 8, 8, 8, 0.5);
			entity.getPersistentData().putDouble("damage", 37);
			entity.getPersistentData().putDouble("knockback", 4);
			entity.getPersistentData().putDouble("range", 48);
			{
				final Vec3 _center = new Vec3(x, (y + 10), z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(48 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (!(entityiterator == entity) && !(entity.getPersistentData().getDouble("NameRanged_ranged") == entityiterator.getPersistentData().getDouble("NameRanged"))) {
						DodamageProcedure.execute(world, x, y + 10, z, entity);
					}
				}
			}
			if (!entity.level().isClientSide())
				entity.discard();
		}
	}
}
