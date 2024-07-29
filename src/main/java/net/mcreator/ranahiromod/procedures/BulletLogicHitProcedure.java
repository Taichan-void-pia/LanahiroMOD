package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class BulletLogicHitProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity(), event.getSource().getDirectEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(Entity entity, Entity immediatesourceentity, Entity sourceentity) {
		execute(null, entity, immediatesourceentity, sourceentity);
	}

	private static void execute(@Nullable Event event, Entity entity, Entity immediatesourceentity, Entity sourceentity) {
		if (entity == null || immediatesourceentity == null || sourceentity == null)
			return;
		boolean logic_attack = false;
		if ((immediatesourceentity instanceof Projectile _projEnt ? _projEnt.getDeltaMovement().length() : 0) > 0) {
			if (immediatesourceentity.getPersistentData().getBoolean("bullet_logic_attack")) {
				logic_attack = LogicAttackBulletProcedure.execute(entity, sourceentity);
				if (!logic_attack) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					} else if (event != null && event.hasResult()) {
						event.setResult(Event.Result.DENY);
					}
					entity.clearFire();
					if (!immediatesourceentity.level().isClientSide())
						immediatesourceentity.discard();
				}
			}
		}
	}
}
