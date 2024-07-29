package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;

import net.mcreator.ranahiromod.init.RanahiromodModGameRules;

import java.util.List;
import java.util.Comparator;

public class LogicAttack2Procedure {
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
					} else if ((entityiterator instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == entity) {
						logic_attack = true;
						if (entityiterator.getPersistentData().getBoolean("friendly") && entityiterator.getPersistentData().getDouble("cnt_target") < 4) {
							logic_attack = false;
						}
					}
				} else {
					if ((entityiterator instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == entity) {
						logic_attack = true;
					}
					if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == entityiterator) {
						logic_attack = true;
					}
					if (entityiterator.getPersistentData().getDouble("skill2") == 705) {
						logic_attack = false;
					}
				}
			}
		}
		return logic_attack;
	}
}
