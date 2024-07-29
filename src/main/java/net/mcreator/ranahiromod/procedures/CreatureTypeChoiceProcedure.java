package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;

import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class CreatureTypeChoiceProcedure {
	@SubscribeEvent
	public static void onEntitySpawned(EntityJoinLevelEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.getMobType() == MobType.UNDEAD) {
			if (!entity.getPersistentData().getBoolean("undead")) {
				entity.getPersistentData().putBoolean("undead", true);
			}
		} else if (entity instanceof LivingEntity _livEnt3 && _livEnt3.getMobType() == MobType.ARTHROPOD) {
			if (!entity.getPersistentData().getBoolean("arthropod")) {
				entity.getPersistentData().putBoolean("arthropod", true);
			}
		}
	}
}
