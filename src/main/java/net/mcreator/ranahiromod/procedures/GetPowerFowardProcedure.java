package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.core.BlockPos;

public class GetPowerFowardProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double dis = 0;
		double power_mag = 0;
		entity.getPersistentData().putDouble("power_mag", Math.max(entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0, 1));
		if (entity.getPersistentData().getDouble("power_mag") > 0) {
			power_mag = 1 + entity.getPersistentData().getDouble("power_mag") / 30;
		} else {
			power_mag = 0;
		}
		entity.getPersistentData().putDouble("x_power",
				(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((10 * power_mag))), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()
						- entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(0)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()));
		entity.getPersistentData().putDouble("y_power",
				(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((10 * power_mag))), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getY()
						- entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(0)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getY()));
		entity.getPersistentData().putDouble("z_power",
				(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((10 * power_mag))), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()
						- entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(0)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()));
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
