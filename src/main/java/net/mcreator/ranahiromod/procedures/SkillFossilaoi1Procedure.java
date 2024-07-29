package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.ranahiromod.init.RanahiromodModItems;

import java.util.List;
import java.util.Comparator;

public class SkillFossilaoi1Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double zPos = 0;
		double yPos = 0;
		double rad = 0;
		double rad_now = 0;
		double yaw_now = 0;
		double xPos = 0;
		double dis = 0;
		double yaw = 0;
		double pitch = 0;
		double yaw2 = 0;
		double pitch2 = 0;
		double xPos2 = 0;
		double yPos2 = 0;
		double zPos2 = 0;
		boolean logic_a = false;
		boolean logic_player = false;
		entity.getPersistentData().putDouble("cnt1", (entity.getPersistentData().getDouble("cnt1") + 1));
		logic_player = entity instanceof Player;
		if (logic_player) {
			GetPowerFowardProcedure.execute(world, x, y, z, entity);
		} else {
			GetPowerProcedure.execute(world, x, y, z, entity);
		}
		if (!logic_player) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RanahiromodModItems.FOSSILAOI_SWORD_ITEM.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		}
		if (entity.getPersistentData().getDouble("cnt2") == 0) {
			entity.setDeltaMovement(new Vec3((entity.getPersistentData().getDouble("x_power") * 1), (entity.getPersistentData().getDouble("y_power") * 1), (entity.getPersistentData().getDouble("z_power") * 1)));
			xPos = entity.getX();
			yPos = entity.getY();
			zPos = entity.getZ();
			{
				final Vec3 _center = new Vec3(xPos, yPos, zPos);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(3 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (!(entityiterator == entity)) {
						if (entityiterator instanceof LivingEntity) {
							xPos = entityiterator.getX();
							yPos = entityiterator.getY();
							zPos = entityiterator.getZ();
							entity.getPersistentData().putDouble("damage", (10 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
							entity.getPersistentData().putDouble("knockback", 0.5);
							entity.getPersistentData().putDouble("range", 1);
							entity.getPersistentData().putDouble("projectile_type", 1);
							entity.getPersistentData().putBoolean("swing", true);
							DodamageProcedure.execute(world, xPos, yPos, zPos, entity);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(xPos, yPos, zPos), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(xPos, yPos, zPos, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
							entity.getPersistentData().putDouble("cnt2", 1);
						}
					}
				}
			}
		}
		if (entity.getPersistentData().getDouble("cnt1") > 40 || entity.getPersistentData().getDouble("cnt2") >= 1) {
			entity.setDeltaMovement(new Vec3((entity.getPersistentData().getDouble("x_power") * (-1)), (entity.getDeltaMovement().y() + 0.15), (entity.getPersistentData().getDouble("z_power") * (-1))));
			entity.getPersistentData().putDouble("skill2", 0);
		}
	}
}
