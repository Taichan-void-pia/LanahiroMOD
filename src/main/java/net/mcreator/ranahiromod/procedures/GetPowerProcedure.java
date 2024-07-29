package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

public class GetPowerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double dis = 0;
		if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity) {
			entity.getPersistentData().putDouble("x_power", ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX() - entity.getX()));
			entity.getPersistentData().putDouble("y_power", ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY() - entity.getY()));
			entity.getPersistentData().putDouble("z_power", ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ() - entity.getZ()));
			dis = Math.sqrt(Math.pow(entity.getPersistentData().getDouble("x_power"), 2) + Math.pow(entity.getPersistentData().getDouble("y_power"), 2) + Math.pow(entity.getPersistentData().getDouble("z_power"), 2));
			if (dis != 0) {
				entity.getPersistentData().putDouble("x_power", ((entity.getPersistentData().getDouble("x_power") / dis) * 3));
				entity.getPersistentData().putDouble("y_power", ((entity.getPersistentData().getDouble("y_power") / dis) * 3));
				entity.getPersistentData().putDouble("z_power", ((entity.getPersistentData().getDouble("z_power") / dis) * 3));
			} else {
				entity.getPersistentData().putDouble("x_power", 0);
				entity.getPersistentData().putDouble("y_power", 0);
				entity.getPersistentData().putDouble("z_power", 0);
			}
			if (!entity.getPersistentData().getBoolean("canFly")) {
				if (!world.getBlockState(BlockPos.containing(x + 1, y, z)).canOcclude() && !world.getBlockState(BlockPos.containing(x, y, z + 1)).canOcclude() && !world.getBlockState(BlockPos.containing(x, y, z - 1)).canOcclude()
						&& !world.getBlockState(BlockPos.containing(x - 1, y, z)).canOcclude() && !world.getBlockState(BlockPos.containing(x, y - 0.5, z)).canOcclude()) {
					entity.getPersistentData().putDouble("y_power", 0);
				}
			}
			GetPowerFixProcedure.execute(entity);
		}
	}
}
