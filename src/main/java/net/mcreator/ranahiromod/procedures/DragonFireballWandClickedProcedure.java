package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.DragonFireball;
import net.minecraft.world.entity.projectile.AbstractHurtingProjectile;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

public class DragonFireballWandClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double upper_speed = 0;
		double speed = 0;
		double yaw = 0;
		double x_power = 0;
		double y_power = 0;
		double z_power = 0;
		double xPos = 0;
		double yPos = 0;
		double zPos = 0;
		double rad = 0;
		double rad_now = 0;
		double dis = 0;
		double loop = 0;
		double yaw_now = 0;
		double random = 0;
		GetPowerFowardProcedure.execute(world, x, y, z, entity);
		x_power = entity.getPersistentData().getDouble("x_power") * 0.3;
		y_power = entity.getPersistentData().getDouble("y_power") * 0.3;
		z_power = entity.getPersistentData().getDouble("z_power") * 0.3;
		rad = Math.toRadians(entity.getYRot());
		dis = 3;
		for (int index0 = 0; index0 < 2; index0++) {
			xPos = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(2)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()
					+ Math.cos(rad) * dis;
			yPos = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(2)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY();
			zPos = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(2)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()
					+ Math.sin(rad) * dis;
			if (world instanceof ServerLevel projectileLevel) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getFireball(Level level, Entity shooter, double ax, double ay, double az) {
						AbstractHurtingProjectile entityToSpawn = new DragonFireball(EntityType.DRAGON_FIREBALL, level);
						entityToSpawn.setOwner(shooter);
						entityToSpawn.xPower = ax;
						entityToSpawn.yPower = ay;
						entityToSpawn.zPower = az;
						return entityToSpawn;
					}
				}.getFireball(projectileLevel, entity, x_power, y_power, z_power);
				_entityToSpawn.setPos(xPos, yPos, zPos);
				_entityToSpawn.shoot((entity.getLookAngle().x), (entity.getLookAngle().y), (entity.getLookAngle().z), (float) 0.3, 0);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
			rad = Math.toRadians(rad + 180);
		}
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(itemstack.getItem(), 40);
		{
			ItemStack _ist = itemstack;
			if (_ist.hurt(1, RandomSource.create(), null)) {
				_ist.shrink(1);
				_ist.setDamageValue(0);
			}
		}
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.DRAGON_BREATH, x, y, z, 40, (entity.getBbWidth()), (entity.getBbHeight()), (entity.getBbWidth()), 0.05);
	}
}
