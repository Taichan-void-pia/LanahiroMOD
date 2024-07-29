package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingFallEvent;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.animal.Pig;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class WhenPigsFlyTriggerProcedure {
	@SubscribeEvent
	public static void onEntityFall(LivingFallEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity(), event.getDistance());
		}
	}

	public static void execute(Entity entity, double distance) {
		execute(null, entity, distance);
	}

	private static void execute(@Nullable Event event, Entity entity, double distance) {
		if (entity == null)
			return;
		double falldistance = 0;
		double damage_mag = 0;
		Entity riding_player = null;
		if (entity instanceof Pig) {
			if (entity.isVehicle()) {
				riding_player = entity.getControllingPassenger();
				if (riding_player instanceof Player) {
					falldistance = distance;
					if (riding_player instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal(("" + falldistance)), false);
					if (!(riding_player instanceof ServerPlayer _plr5 && _plr5.level() instanceof ServerLevel
							&& _plr5.getAdvancements().getOrStartProgress(_plr5.server.getAdvancements().getAdvancement(new ResourceLocation("ranahiromod:when_pigs_fly"))).isDone()) && falldistance > 8) {
						if (riding_player instanceof ServerPlayer _player) {
							Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("ranahiromod:when_pigs_fly"));
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
				}
			}
		}
	}
}
