package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import java.util.List;
import java.util.Comparator;

public class WizardSkill9Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double zPos = 0;
		double yPos = 0;
		double xPos = 0;
		double distance = 0;
		double rad = 0;
		double rad_now = 0;
		entity.getPersistentData().putDouble("cnt1", (entity.getPersistentData().getDouble("cnt1") + 1));
		if (entity.getPersistentData().getDouble("cnt1") >= 1) {
			if (entity.getPersistentData().getDouble("cnt1") == 1) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")), SoundSource.NEUTRAL, 1, 0);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")), SoundSource.NEUTRAL, 1, 0, false);
					}
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.REVERSE_PORTAL, x, (y + entity.getBbHeight() / 2), z, 50, 1, 1, 1, 1);
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.END_ROD, x, (y + entity.getBbHeight() / 2), z, 20, (entity.getBbWidth()), (entity.getBbHeight() / 4), (entity.getBbWidth()), 1);
			}
			if (entity.getPersistentData().getDouble("cnt1") == 2) {
				entity.getPersistentData().putDouble("damage", (20 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
				entity.getPersistentData().putDouble("knockback", 0);
				entity.getPersistentData().putDouble("range", 1);
				entity.getPersistentData().putDouble("effect", 11);
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(25 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if (!(entityiterator == entity) && entityiterator instanceof LivingEntity) {
							AllTargetDamage3Procedure.execute(world, entityiterator.getX(), entityiterator.getY(), entityiterator.getZ(), entity);
						}
					}
				}
			} else if (entity.getPersistentData().getDouble("cnt1") > 2) {
				if (entity instanceof LivingEntity _entity)
					_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + Math.round(Math.min(entity.getPersistentData().getDouble("drain_enemy_count") * 4, 60) / 3)));
				if (entity.getPersistentData().getDouble("cnt1") >= 5) {
					entity.getPersistentData().putDouble("drain_enemy_count", 0);
					entity.getPersistentData().putDouble("skill2", 0);
				}
			}
		}
	}
}
