package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class DecreaseDamageProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event);
		}
	}

	public static void execute() {
		execute(null);
	}

	private static void execute(@Nullable Event event) {
		double Damage_amount = 0;
		double resistance = 0;
		double damage_num = 0;
		double x_knockback = 0;
		double knockback_amount = 0;
		double z_knockback = 0;
		double y_knockback = 0;
		double dis = 0;
		double PerNoDamaged = 0;
		double strength = 0;
		double strength_source = 0;
		double old_health = 0;
		double kb_resisitance = 0;
		double enemy_kb_amount = 0;
		double hit_damage = 0;
		boolean changeDamage = false;
		boolean guard = false;
		boolean zero_kb = false;
		boolean zero_kb2 = false;
	}
}
