package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import java.util.List;
import java.util.Comparator;

public class AIBlueAndRedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean logic_ab = false;
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(128 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (!(entityiterator == entity)) {
					if (entity.getPersistentData().getDouble("NameRanged_ranged") == entityiterator.getPersistentData().getDouble("NameRanged")) {
						if (!logic_ab) {
							logic_ab = true;
						}
					} else {
						if (!entity.level().isClientSide())
							entity.discard();
					}
					if (logic_ab) {
						entity.setDeltaMovement(new Vec3((entityiterator.getDeltaMovement().x()), (entityiterator.getDeltaMovement().y()), (entityiterator.getDeltaMovement().z())));
						{
							Entity _ent = entity;
							_ent.setYRot(entityiterator.getYRot());
							_ent.setXRot(entityiterator.getXRot());
							_ent.setYBodyRot(_ent.getYRot());
							_ent.setYHeadRot(_ent.getYRot());
							_ent.yRotO = _ent.getYRot();
							_ent.xRotO = _ent.getXRot();
							if (_ent instanceof LivingEntity _entity) {
								_entity.yBodyRotO = _entity.getYRot();
								_entity.yHeadRotO = _entity.getYRot();
							}
						}
						if (entity.getPersistentData().getBoolean("flag_purple")) {
							if (entityiterator.getPersistentData().getDouble("cnt1") > 30 || entityiterator.getPersistentData().getDouble("skill2") == 0 || !entityiterator.isAlive()) {
								if (!entity.level().isClientSide())
									entity.discard();
							}
						} else if (entityiterator.getPersistentData().getDouble("cnt1") > 10 || entityiterator.getPersistentData().getDouble("skill2") == 0) {
							entity.getPersistentData().putBoolean("flag_start", true);
						}
						entity.getPersistentData().putDouble("x_power", (entityiterator.getPersistentData().getDouble("x_power")));
						entity.getPersistentData().putDouble("y_power", (entityiterator.getPersistentData().getDouble("y_power")));
						entity.getPersistentData().putDouble("z_power", (entityiterator.getPersistentData().getDouble("z_power")));
					}
				}
			}
		}
	}
}
