package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.LargeFireball;
import net.minecraft.world.entity.projectile.AbstractHurtingProjectile;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

public class HealingWandRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double upper_speed = 0;
		double speed = 0;
		double yaw = 0;
		double x_power = 0;
		double y_power = 0;
		double z_power = 0;
		GetPowerFowardProcedure.execute(world, x, y, z, entity);
		x_power = entity.getPersistentData().getDouble("x_power") * 0.3;
		y_power = entity.getPersistentData().getDouble("y_power") * 0.3;
		z_power = entity.getPersistentData().getDouble("z_power") * 0.3;
		{
			Entity _shootFrom = entity;
			Level projectileLevel = _shootFrom.level();
			if (!projectileLevel.isClientSide()) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getFireball(Level level, Entity shooter, double ax, double ay, double az) {
						AbstractHurtingProjectile entityToSpawn = new LargeFireball(EntityType.FIREBALL, level);
						entityToSpawn.setOwner(shooter);
						entityToSpawn.xPower = ax;
						entityToSpawn.yPower = ay;
						entityToSpawn.zPower = az;
						return entityToSpawn;
					}
				}.getFireball(projectileLevel, entity, x_power, y_power, z_power);
				_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
				_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1, 0);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
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
			_level.sendParticles(ParticleTypes.FLAME, x, y, z, 40, (entity.getBbWidth()), (entity.getBbHeight()), (entity.getBbWidth()), 0.05);
	}
}
