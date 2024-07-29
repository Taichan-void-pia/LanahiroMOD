package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import java.util.List;
import java.util.Comparator;

public class EffectProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double xPos = 0;
		double yPos = 0;
		double zPos = 0;
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate((entity.getPersistentData().getDouble("range")) / 2d), e -> true).stream()
					.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (!(entityiterator == entity)) {
					if (entityiterator instanceof LivingEntity) {
						xPos = entityiterator.getX();
						yPos = entityiterator.getY();
						zPos = entityiterator.getZ();
						if (entity.getPersistentData().getDouble("effect") == 1) {
							Effect1Procedure.execute(world, xPos, yPos, zPos);
						} else if (entity.getPersistentData().getDouble("effect") == 2) {
							Effect2Procedure.execute(world, xPos, yPos, zPos, entity);
						} else if (entity.getPersistentData().getDouble("effect") == 3) {
							Effect3Procedure.execute(world, xPos, yPos, zPos, entity);
						} else if (entity.getPersistentData().getDouble("effect") == 4) {
							Effect4Procedure.execute(world, xPos, yPos, zPos, entity);
						} else if (entity.getPersistentData().getDouble("effect") == 5) {
							Effect5Procedure.execute(world, xPos, yPos, zPos, entity);
						} else if (entity.getPersistentData().getDouble("effect") == 6) {
							Effect6Procedure.execute(world, xPos, yPos, zPos, entity);
						} else if (entity.getPersistentData().getDouble("effect") == 7) {
							Effect7Procedure.execute(world, xPos, yPos, zPos, entity);
						} else if (entity.getPersistentData().getDouble("effect") == 8) {
							Effect8Procedure.execute(world, xPos, yPos, zPos, entity);
						} else if (entity.getPersistentData().getDouble("effect") == 9) {
							Effect9Procedure.execute(world, xPos, yPos, zPos, entity);
						} else if (entity.getPersistentData().getDouble("effect") == 10) {
							Effect10Procedure.execute(world, xPos, yPos, zPos);
						} else if (entity.getPersistentData().getDouble("effect") == 11) {
							Effect11Procedure.execute(world, xPos, yPos, zPos, entity);
						} else if (entity.getPersistentData().getDouble("effect") == 12) {
							Effect12Procedure.execute(world, xPos, yPos, zPos, entity);
						}
						if (entity.getPersistentData().getDouble("effect") == 13) {
							Effect13Procedure.execute(world, xPos, yPos, zPos, entity);
						} else if (entity.getPersistentData().getDouble("effect") == 14) {
							Effect14Procedure.execute(world, xPos, yPos, zPos, entity);
						} else if (entity.getPersistentData().getDouble("effect") == 15) {
							Effect15Procedure.execute(world, xPos, yPos, zPos, entity);
						} else if (entity.getPersistentData().getDouble("effect") == 16) {
							Effect16Procedure.execute(world, xPos, yPos, zPos, entity);
						} else if (entity.getPersistentData().getDouble("effect") == 17) {
							Effect17Procedure.execute(world, xPos, yPos, zPos, entity);
						}
						if (entity.getPersistentData().getDouble("effect") == 18) {
							NagashigiriProcedure.execute(world, xPos, yPos, zPos, entity);
						} else if (entity.getPersistentData().getDouble("effect") == 19) {
							NagiharaiProcedure.execute(world, xPos, yPos, zPos, entity);
						} else if (entity.getPersistentData().getDouble("effect") == 20) {
							MajingiriProcedure.execute(world, xPos, yPos, zPos, entity);
						} else if (entity.getPersistentData().getDouble("effect") == 21) {
							ZantetsuProcedure.execute(world, xPos, yPos, zPos, entity);
						} else if (entity.getPersistentData().getDouble("effect") == 22) {
							FatalShotProcedure.execute(world, xPos, yPos, zPos, entity);
						}
						if (entity.getPersistentData().getDouble("effect") == 23) {
							Dia2Procedure.execute(world, xPos, yPos, zPos, entity);
						} else if (entity.getPersistentData().getDouble("effect") == 24) {
							FlowerGiftProcedure.execute(world, xPos, yPos, zPos, entity);
						} else if (entity.getPersistentData().getDouble("effect") == 25) {
							SurikenProcedure.execute(world, xPos, yPos, zPos, entity);
						} else if (entity.getPersistentData().getDouble("effect") == 26) {
							IsukumiProcedure.execute(world, xPos, yPos, zPos, entity);
						}
					}
				}
			}
		}
	}
}
