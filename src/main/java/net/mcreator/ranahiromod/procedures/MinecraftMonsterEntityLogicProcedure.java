package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.entity.monster.piglin.PiglinBrute;
import net.minecraft.world.entity.monster.piglin.Piglin;
import net.minecraft.world.entity.monster.ZombifiedPiglin;
import net.minecraft.world.entity.monster.ZombieVillager;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.monster.Zoglin;
import net.minecraft.world.entity.monster.WitherSkeleton;
import net.minecraft.world.entity.monster.Witch;
import net.minecraft.world.entity.monster.Vindicator;
import net.minecraft.world.entity.monster.Stray;
import net.minecraft.world.entity.monster.Spider;
import net.minecraft.world.entity.monster.Slime;
import net.minecraft.world.entity.monster.Skeleton;
import net.minecraft.world.entity.monster.Silverfish;
import net.minecraft.world.entity.monster.Shulker;
import net.minecraft.world.entity.monster.Ravager;
import net.minecraft.world.entity.monster.Pillager;
import net.minecraft.world.entity.monster.Phantom;
import net.minecraft.world.entity.monster.MagmaCube;
import net.minecraft.world.entity.monster.Illusioner;
import net.minecraft.world.entity.monster.Husk;
import net.minecraft.world.entity.monster.Guardian;
import net.minecraft.world.entity.monster.Ghast;
import net.minecraft.world.entity.monster.Evoker;
import net.minecraft.world.entity.monster.Endermite;
import net.minecraft.world.entity.monster.EnderMan;
import net.minecraft.world.entity.monster.Drowned;
import net.minecraft.world.entity.monster.Creeper;
import net.minecraft.world.entity.monster.CaveSpider;
import net.minecraft.world.entity.monster.Blaze;
import net.minecraft.world.entity.Entity;

public class MinecraftMonsterEntityLogicProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		boolean logic_monster = false;
		logic_monster = entity instanceof Blaze || entity instanceof CaveSpider || entity instanceof Creeper || entity instanceof Drowned || entity instanceof EnderMan || entity instanceof Endermite || entity instanceof Evoker
				|| entity instanceof Ghast || entity instanceof Guardian || entity instanceof Husk || entity instanceof Illusioner || entity instanceof MagmaCube || entity instanceof Phantom || entity instanceof Piglin
				|| entity instanceof PiglinBrute || entity instanceof Pillager || entity instanceof Ravager || entity instanceof Shulker || entity instanceof Skeleton || entity instanceof Silverfish || entity instanceof Slime
				|| entity instanceof Spider || entity instanceof Stray || entity instanceof Vindicator || entity instanceof Witch || entity instanceof WitherSkeleton || entity instanceof Zoglin || entity instanceof Zombie
				|| entity instanceof ZombieVillager || entity instanceof ZombifiedPiglin;
		return logic_monster;
	}
}
