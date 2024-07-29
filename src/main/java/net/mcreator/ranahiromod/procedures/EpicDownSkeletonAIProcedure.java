package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.ranahiromod.init.RanahiromodModItems;
import net.mcreator.ranahiromod.init.RanahiromodModEntities;
import net.mcreator.ranahiromod.entity.UndefinedSkeletonEntity;
import net.mcreator.ranahiromod.entity.FarionGun3ProjectileEntity;

import java.util.List;
import java.util.Comparator;

public class EpicDownSkeletonAIProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double rnd = 0;
		double dis = 0;
		double xPower = 0;
		double zPower = 0;
		if (entity.isAlive()) {
			entity.getPersistentData().putDouble("cnt_x", (entity.getPersistentData().getDouble("cnt_x") + 1));
			entity.getPersistentData().putDouble("cnt_target", (entity.getPersistentData().getDouble("cnt_target") + 1));
			if (!((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) >= 0)
					|| (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) < 2) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, (int) Double.POSITIVE_INFINITY, 6, false, false));
			}
			if (!((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_RESISTANCE) ? _livEnt.getEffect(MobEffects.DAMAGE_RESISTANCE).getAmplifier() : 0) >= 0)
					|| (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_RESISTANCE) ? _livEnt.getEffect(MobEffects.DAMAGE_RESISTANCE).getAmplifier() : 0) < 1) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, (int) Double.POSITIVE_INFINITY, 3, false, false));
			}
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (!(entityiterator == entity)) {
						if (entityiterator == (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null)) {
							if (entityiterator instanceof LivingEntity) {
								if (entity instanceof LivingEntity _entity) {
									ItemStack _setstack = new ItemStack(RanahiromodModItems.FARION_GUN_3.get()).copy();
									_setstack.setCount(1);
									_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
									if (_entity instanceof Player _player)
										_player.getInventory().setChanged();
								}
							}
						}
					}
				}
			}
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (!(entityiterator == entity)) {
						if (entityiterator == (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null)) {
							if (entityiterator instanceof LivingEntity) {
								if (entity instanceof LivingEntity _entity) {
									ItemStack _setstack = new ItemStack(RanahiromodModItems.FARION_SWORD.get()).copy();
									_setstack.setCount(1);
									_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
									if (_entity instanceof Player _player)
										_player.getInventory().setChanged();
								}
							}
						}
					}
				}
			}
			if (entity.getPersistentData().getDouble("cnt_x") > 60) {
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RanahiromodModItems.FARION_GUN_3.get()) {
					{
						Entity _shootFrom = entity;
						Level projectileLevel = _shootFrom.level();
						if (!projectileLevel.isClientSide()) {
							Projectile _entityToSpawn = new Object() {
								public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
									AbstractArrow entityToSpawn = new FarionGun3ProjectileEntity(RanahiromodModEntities.FARION_GUN_3_PROJECTILE.get(), level);
									entityToSpawn.setOwner(shooter);
									entityToSpawn.setBaseDamage(damage);
									entityToSpawn.setKnockback(knockback);
									entityToSpawn.setSilent(true);
									entityToSpawn.setSecondsOnFire(100);
									entityToSpawn.setCritArrow(true);
									return entityToSpawn;
								}
							}.getArrow(projectileLevel, entity, (float) (entity instanceof UndefinedSkeletonEntity ? 50 : 25), 0);
							_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
							_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 3, 0);
							projectileLevel.addFreshEntity(_entityToSpawn);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.shoot")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.shoot")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RanahiromodModItems.FARION_SWORD.get()) {
					xPower = GetPowerIteratorXProcedure.execute(world, x, y, z, entity);
					zPower = GetPowerIteratorZProcedure.execute(world, x, y, z, entity);
					entity.setDeltaMovement(new Vec3((xPower * (-1.25)), 0.5, (zPower * (-1.25))));
				}
				entity.getPersistentData().putDouble("cnt_x", 0);
			}
			if (!((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity)) {
				entity.getPersistentData().putDouble("cnt_target", 0);
			} else if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity) {
				DirectionProcedure.execute(entity);
			}
		}
	}
}
