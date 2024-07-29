package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class LogicAttackBulletProcedure {
	public static boolean execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return false;
		boolean logic_attack = false;
		if (sourceentity instanceof Player) {
			if (entity instanceof Player) {
				logic_attack = false;
				if (entity.getPersistentData().getBoolean("oni")) {
					logic_attack = true;
				}
			} else if (!sourceentity.getPersistentData().getBoolean("oni")) {
				if (!entity.getPersistentData().getBoolean("kisatsutai")) {
					logic_attack = true;
					if (entity instanceof Animal || entity instanceof Villager) {
						logic_attack = false;
					}
				} else if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == sourceentity) {
					logic_attack = true;
					if (entity.getPersistentData().getBoolean("kisatsutai") && entity.getPersistentData().getDouble("cnt_target") < 4) {
						logic_attack = false;
					}
				}
			} else {
				logic_attack = true;
			}
		} else if (entity.getPersistentData().getBoolean("kisatsutai")) {
			if (entity instanceof Monster && !entity.getPersistentData().getBoolean("kisatsutai")) {
				logic_attack = true;
			}
			if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("kimetsunoyaiba:tag_doll")))) {
				logic_attack = true;
			}
			if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == sourceentity) {
				logic_attack = true;
				if (entity.getPersistentData().getBoolean("kisatsutai") && entity.getPersistentData().getDouble("cnt_target") < 4) {
					logic_attack = false;
				}
			}
			if ((sourceentity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof Mob) {
				logic_attack = true;
			}
		} else {
			logic_attack = true;
		}
		if ((sourceentity.getVehicle()) == entity) {
			logic_attack = false;
		}
		if ((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) == entity && !((sourceentity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == entity)) {
			logic_attack = false;
		}
		if ((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) == sourceentity && !((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == sourceentity)) {
			logic_attack = false;
		}
		if (sourceentity.getPersistentData().getDouble("friend_num") != 0 && sourceentity.getPersistentData().getDouble("friend_num") == entity.getPersistentData().getDouble("friend_num")) {
			logic_attack = false;
		}
		if (entity.getPersistentData().getDouble("breathes") == 611 || entity.getPersistentData().getDouble("skill2") == 705 || entity.getPersistentData().getDouble("breathes") == 1711) {
			logic_attack = false;
		}
		return logic_attack;
	}
}
