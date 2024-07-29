package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import java.util.List;
import java.util.Comparator;

public class Effect5Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (!(entityiterator == entity)) {
					if (entityiterator instanceof LivingEntity) {
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.CRIT, x, (y + entityiterator.getBbHeight() / 2), z, 10, (entityiterator.getBbWidth()), (entityiterator.getBbHeight() / 2), (entityiterator.getBbWidth()), 0);
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.ENCHANTED_HIT, x, (y + entityiterator.getBbHeight() / 2), z, 1, (entityiterator.getBbWidth()), (entityiterator.getBbHeight() / 2), (entityiterator.getBbWidth()), 0.2);
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.hit")), SoundSource.NEUTRAL, 1, (float) 0.5);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.hit")), SoundSource.NEUTRAL, 1, (float) 0.5, false);
							}
						}
					}
				}
			}
		}
	}
}
