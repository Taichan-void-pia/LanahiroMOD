package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;

import net.mcreator.ranahiromod.init.RanahiromodModGameRules;

import java.util.List;
import java.util.Comparator;

public class LogicAttackProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return false;
		boolean logic_attack = false;
		logic_attack = true;
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(16 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (entity instanceof Player) {
					if (entityiterator instanceof Player) {
						logic_attack = world.getLevelData().getGameRules().getBoolean(RanahiromodModGameRules.LANAHIROMODPVP);
					} else if (entityiterator.getPersistentData().getBoolean("friendly")) {
						if ((entityiterator instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == entity) {
							logic_attack = true;
							if (entityiterator.getPersistentData().getDouble("cnt_target") < 4) {
								logic_attack = false;
							}
						} else {
							logic_attack = false;
						}
					} else if (entityiterator.getPersistentData().getBoolean("ranahiro_friendly")) {
						logic_attack = true;
					}
					if (entityiterator instanceof Monster) {
						logic_attack = true;
					}
					if (entityiterator instanceof Animal || entityiterator instanceof Villager) {
						logic_attack = false;
					}
				} else {
					if (entity.getPersistentData().getBoolean("friendly")) {
						if (entityiterator.getPersistentData().getBoolean("ranahiro_friendly")) {
							logic_attack = true;
						}
						if (entityiterator.getPersistentData().getBoolean("friendly")) {
							if ((entityiterator instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == entity) {
								logic_attack = true;
								if (entityiterator.getPersistentData().getDouble("cnt_target") < 4) {
									logic_attack = false;
								}
							} else {
								logic_attack = false;
							}
						}
						if (entityiterator instanceof Monster) {
							logic_attack = true;
						}
						if (entityiterator instanceof Player) {
							if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == entityiterator) {
								logic_attack = true;
								if (entity.getPersistentData().getDouble("cnt_target") < 4) {
									logic_attack = false;
								}
							} else {
								logic_attack = false;
							}
						}
					} else if (entity.getPersistentData().getBoolean("ranahiro_friendly")) {
						if (entityiterator.getPersistentData().getBoolean("friendly")) {
							logic_attack = true;
						}
						if (entityiterator.getPersistentData().getBoolean("ranahiro_friendly")) {
							if ((entityiterator instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == entity) {
								logic_attack = true;
								if (entityiterator.getPersistentData().getDouble("cnt_target") < 4) {
									logic_attack = false;
								}
							} else {
								logic_attack = false;
							}
						}
						if (entityiterator instanceof Monster) {
							logic_attack = true;
						}
						if (entityiterator instanceof Player) {
							logic_attack = true;
						}
					}
				}
				if ((entity.getVehicle()) == entityiterator) {
					logic_attack = false;
				}
				if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) == entityiterator && !((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == entityiterator)) {
					logic_attack = false;
				}
				if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) == entity && !((entityiterator instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == entity)) {
					logic_attack = false;
				}
				if (entity.getPersistentData().getDouble("friend_num") != 0 && entity.getPersistentData().getDouble("friend_num") == entityiterator.getPersistentData().getDouble("friend_num")) {
					logic_attack = false;
				}
				if (entityiterator.getPersistentData().getDouble("skill2") == 705) {
					logic_attack = false;
				}
			}
		}
		return logic_attack;
	}
}
