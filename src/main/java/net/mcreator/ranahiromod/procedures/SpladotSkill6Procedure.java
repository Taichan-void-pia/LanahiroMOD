package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.ranahiromod.init.RanahiromodModEntities;
import net.mcreator.ranahiromod.entity.FairySpiritEntity;

import java.util.Comparator;

public class SpladotSkill6Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double zPos = 0;
		double yPos = 0;
		double xPos = 0;
		double num1 = 0;
		entity.getPersistentData().putDouble("cnt1", (entity.getPersistentData().getDouble("cnt1") + 1));
		if (entity.getPersistentData().getDouble("cnt1") > 3) {
			if (entity.getPersistentData().getBoolean("fairy_spirit_spawn") && entity.isShiftKeyDown()) {
				entity.getPersistentData().putBoolean("fairy_spirit_spawn", false);
			} else {
				if (!entity.getPersistentData().getBoolean("fairy_spirit_spawn")) {
					entity.getPersistentData().putBoolean("fairy_spirit_spawn", true);
					entity.getPersistentData().putDouble("limit_fairy_spawn", 0);
				}
				if (entity.getPersistentData().getDouble("limit_fairy_spawn") <= 5) {
					entity.getPersistentData().putDouble("limit_fairy_spawn", (entity.getPersistentData().getDouble("limit_fairy_spawn") + 1));
					xPos = x + Math.random();
					yPos = y;
					zPos = z + Math.random();
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = RanahiromodModEntities.FAIRY_SPIRIT.get().spawn(_level, BlockPos.containing(xPos, yPos, zPos), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
					if (!world.getEntitiesOfClass(FairySpiritEntity.class, AABB.ofSize(new Vec3(xPos, yPos, zPos), 1, 1, 1), e -> true).isEmpty()) {
						if ((((Entity) world.getEntitiesOfClass(FairySpiritEntity.class, AABB.ofSize(new Vec3(xPos, yPos, zPos), 1, 1, 1), e -> true).stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
							}
						}.compareDistOf(xPos, yPos, zPos)).findFirst().orElse(null)).getPersistentData().getString("owner")).equals("")) {
							((Entity) world.getEntitiesOfClass(FairySpiritEntity.class, AABB.ofSize(new Vec3(xPos, yPos, zPos), 1, 1, 1), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(xPos, yPos, zPos)).findFirst().orElse(null)).getPersistentData().putString("owner", (entity.getStringUUID()));
						}
					}
				} else {
					if (entity.getPersistentData().getBoolean("fairy_spirit_spawn")) {
						entity.getPersistentData().putBoolean("fairy_spirit_spawn", false);
						entity.getPersistentData().putDouble("limit_fairy_spawn", 0);
					}
				}
			}
			entity.getPersistentData().putDouble("cnt1", 0);
			entity.getPersistentData().putDouble("skill2", 0);
		}
	}
}
