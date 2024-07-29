package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.ranahiromod.network.RanahiromodModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PasswordRndProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event, event.getEntity().level());
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		boolean logic_p = false;
		boolean logic_q = false;
		boolean divide_check = false;
		double p = 0;
		double q = 0;
		double repeat = 0;
		double repeat_2 = 0;
		double n = 0;
		double temp = 0;
		double r = 0;
		double a = 0;
		double b = 0;
		double e = 0;
		double d = 0;
		double password_local = 0;
		double output_X = 0;
		repeat_2 = 0;
		while (repeat_2 == 0) {
			if (!logic_p) {
				p = Mth.nextInt(RandomSource.create(), 10000, 40000);
				if (Math.round(p % 2) > 0) {
					if (Math.round(p % 3) > 0) {
						if (Math.round(p % 5) > 0) {
							if (Math.round(p % 7) > 0) {
								logic_p = true;
							}
						}
					}
				}
			} else {
				if (logic_p) {
					q = Mth.nextInt(RandomSource.create(), 10000, 40000);
					repeat = 0;
					while (repeat == 0) {
						if (p == q) {
							q = Mth.nextInt(RandomSource.create(), 10000, 40000);
						} else {
							repeat = 1;
							break;
						}
					}
					if (Math.round(q % 2) > 0) {
						if (Math.round(q % 3) > 0) {
							if (Math.round(q % 5) > 0) {
								if (Math.round(q % 7) > 0) {
									logic_q = true;
								}
							}
						}
					}
				}
				if (logic_p && logic_q) {
					repeat_2 = 1;
					break;
				}
			}
		}
		n = p * q;
		RanahiromodModVariables.MapVariables.get(world).password = Math.round(n);
		RanahiromodModVariables.MapVariables.get(world).syncData(world);
	}
}
