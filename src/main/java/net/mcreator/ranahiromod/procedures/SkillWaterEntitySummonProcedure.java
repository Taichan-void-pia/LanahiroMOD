package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.monster.Guardian;
import net.minecraft.world.entity.monster.ElderGuardian;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import java.util.Comparator;

public class SkillWaterEntitySummonProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean type = false;
		double zPos = 0;
		double yPos = 0;
		double xPos = 0;
		double dis2 = 0;
		double dis = 0;
		double y_power = 0;
		double z_power = 0;
		double rad = 0;
		double rad_now = 0;
		double x_power = 0;
		double num1 = 0;
		double pitch = 0;
		double num3 = 0;
		double num2 = 0;
		double dis_range = 0;
		double rotate = 0;
		for (int index0 = 0; index0 < (int) (2 + Math.round(Math.random() * 0)); index0++) {
			xPos = x + (Math.random() - 0.5) * 10;
			yPos = y + 1;
			zPos = z + (Math.random() - 0.5) * 10;
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = EntityType.GUARDIAN.spawn(_level, BlockPos.containing(xPos, yPos, zPos), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(entity.getYRot());
					entityToSpawn.setYBodyRot(entity.getYRot());
					entityToSpawn.setYHeadRot(entity.getYRot());
					entityToSpawn.setXRot(entity.getXRot());
					entityToSpawn.setDeltaMovement(0, 0.3, 0);
				}
			}
			if (!world.getEntitiesOfClass(Guardian.class, AABB.ofSize(new Vec3(xPos, yPos, zPos), 1, 1, 1), e -> true).isEmpty()) {
				if (((Entity) world.getEntitiesOfClass(Guardian.class, AABB.ofSize(new Vec3(xPos, yPos, zPos), 1, 1, 1), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(xPos, yPos, zPos)).findFirst().orElse(null)) instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, (int) Double.POSITIVE_INFINITY, 4, false, false));
			}
		}
		for (int index1 = 0; index1 < (int) (1 + Math.round(Math.random() * 0)); index1++) {
			xPos = x + (Math.random() - 0.5) * 10;
			yPos = y + 1;
			zPos = z + (Math.random() - 0.5) * 10;
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = EntityType.ELDER_GUARDIAN.spawn(_level, BlockPos.containing(xPos, yPos, zPos), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(entity.getYRot());
					entityToSpawn.setYBodyRot(entity.getYRot());
					entityToSpawn.setYHeadRot(entity.getYRot());
					entityToSpawn.setXRot(entity.getXRot());
					entityToSpawn.setDeltaMovement(0, 0.3, 0);
				}
			}
			if (!world.getEntitiesOfClass(ElderGuardian.class, AABB.ofSize(new Vec3(xPos, yPos, zPos), 1, 1, 1), e -> true).isEmpty()) {
				if (((Entity) world.getEntitiesOfClass(ElderGuardian.class, AABB.ofSize(new Vec3(xPos, yPos, zPos), 1, 1, 1), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(xPos, yPos, zPos)).findFirst().orElse(null)) instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, (int) Double.POSITIVE_INFINITY, 4, false, false));
			}
		}
		for (int index2 = 0; index2 < (int) (1 + Math.round(Math.random() * 0)); index2++) {
			xPos = x + (Math.random() - 0.5) * 10;
			yPos = y + 1;
			zPos = z + (Math.random() - 0.5) * 10;
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = EntityType.DROWNED.spawn(_level, BlockPos.containing(xPos, yPos, zPos), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(entity.getYRot());
					entityToSpawn.setYBodyRot(entity.getYRot());
					entityToSpawn.setYHeadRot(entity.getYRot());
					entityToSpawn.setXRot(entity.getXRot());
					entityToSpawn.setDeltaMovement(0, 0.3, 0);
				}
			}
		}
	}
}
