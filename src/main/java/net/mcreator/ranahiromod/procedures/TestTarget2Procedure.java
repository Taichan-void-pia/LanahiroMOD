package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.Creeper;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.ranahiromod.entity.PhotonServantEntity;

import java.util.List;
import java.util.Comparator;

public class TestTarget2Procedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return false;
		Entity TargetEntity = null;
		double tick = 0;
		boolean logic_a = false;
		boolean friendlyl_iterator_logic = false;
		boolean ranahirofriendly_iterator_logic = false;
		String friendly = "";
		String ranahiro_friendly = "";
		logic_a = true;
		ranahiro_friendly = "ranahiromod:ranahiro_friendly";
		friendly = "ranahiromod:friendly";
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(32 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				TargetEntity = entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null;
				if (!(entityiterator == entity) && entityiterator instanceof LivingEntity) {
					if (entityiterator == TargetEntity) {
						friendlyl_iterator_logic = entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("ranahiromod:friendly")));
						ranahirofriendly_iterator_logic = entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("ranahiromod:ranahiro_friendly")));
						if (entity instanceof Mob) {
							if (entityiterator instanceof Monster) {
								if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation((ranahiro_friendly).toLowerCase(java.util.Locale.ENGLISH))))) {
									logic_a = false;
								} else if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation((friendly).toLowerCase(java.util.Locale.ENGLISH))))) {
									logic_a = true;
								} else {
									logic_a = true;
								}
								if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation((ranahiro_friendly).toLowerCase(java.util.Locale.ENGLISH))))) {
									if (ranahirofriendly_iterator_logic) {
										logic_a = false;
									} else if (friendlyl_iterator_logic) {
										logic_a = true;
									} else {
										logic_a = true;
									}
								}
								if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation((friendly).toLowerCase(java.util.Locale.ENGLISH))))) {
									if (friendlyl_iterator_logic) {
										logic_a = false;
									} else if (ranahirofriendly_iterator_logic) {
										logic_a = true;
									} else {
										logic_a = false;
									}
								}
								if (entityiterator instanceof Player) {
									if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation((ranahiro_friendly).toLowerCase(java.util.Locale.ENGLISH))))) {
										logic_a = true;
									} else if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation((friendly).toLowerCase(java.util.Locale.ENGLISH))))) {
										logic_a = false;
										if (entity.getPersistentData().getBoolean("enemy")) {
											logic_a = true;
										}
									} else {
										logic_a = false;
									}
								}
								if (entityiterator instanceof Animal) {
									if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation((ranahiro_friendly).toLowerCase(java.util.Locale.ENGLISH))))) {
										logic_a = true;
									} else if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation((friendly).toLowerCase(java.util.Locale.ENGLISH))))) {
										logic_a = false;
									} else {
										logic_a = false;
									}
								}
							}
							if (entity instanceof PhotonServantEntity) {
								if (entityiterator instanceof PhotonServantEntity) {
									logic_a = false;
								} else if (ranahirofriendly_iterator_logic) {
									logic_a = true;
								} else if (friendlyl_iterator_logic) {
									logic_a = false;
								}
							}
							if (entityiterator instanceof Creeper) {
								if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation((ranahiro_friendly).toLowerCase(java.util.Locale.ENGLISH))))) {
									logic_a = false;
								} else if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation((friendly).toLowerCase(java.util.Locale.ENGLISH))))) {
									logic_a = true;
								} else {
									logic_a = true;
								}
							}
							if (entity.getPersistentData().getDouble("friend_num") != 0) {
								if (entity.getPersistentData().getDouble("friend_num") == entityiterator.getPersistentData().getDouble("friend_num")) {
									logic_a = false;
								}
								if ((entityiterator instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity
										&& entity.getPersistentData().getDouble("friend_num") == (entityiterator instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getPersistentData().getDouble("friend_num")
										&& entityiterator.getPersistentData().getDouble("cnt_target") > 4) {
									logic_a = true;
								}
								if ((entityiterator instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) == entity) {
									logic_a = true;
								}
							}
							if ((entityiterator instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == entity && entityiterator.getPersistentData().getDouble("cnt_target") > 4) {
								logic_a = true;
							}
						}
					}
				}
			}
		}
		return logic_a;
	}
}
