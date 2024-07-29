package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingExperienceDropEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.ExperienceOrb;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ExpDoublingPerkProcedure {
	@SubscribeEvent
	public static void onLivingDropXp(LivingExperienceDropEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity(), event.getAttackingPlayer(), event.getDroppedExperience());
		}
	}

	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity, double droppedexperience) {
		execute(null, world, entity, sourceentity, droppedexperience);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity, Entity sourceentity, double droppedexperience) {
		if (entity == null || sourceentity == null)
			return;
		double rnd = 0;
		if (entity.isShiftKeyDown()) {
			if (sourceentity instanceof ServerPlayer _plr1 && _plr1.level() instanceof ServerLevel
					&& _plr1.getAdvancements().getOrStartProgress(_plr1.server.getAdvancements().getAdvancement(new ResourceLocation("ranahiromod:doubling_exp_1"))).isDone()) {
				rnd = 0.1;
			}
			if (sourceentity instanceof ServerPlayer _plr2 && _plr2.level() instanceof ServerLevel
					&& _plr2.getAdvancements().getOrStartProgress(_plr2.server.getAdvancements().getAdvancement(new ResourceLocation("ranahiromod:doubling_exp_2"))).isDone()) {
				rnd = 0.2;
			}
			if (sourceentity instanceof ServerPlayer _plr3 && _plr3.level() instanceof ServerLevel
					&& _plr3.getAdvancements().getOrStartProgress(_plr3.server.getAdvancements().getAdvancement(new ResourceLocation("ranahiromod:doubling_exp_3"))).isDone()) {
				rnd = 0.3;
			}
			if (Math.random() < rnd) {
				for (int index0 = 0; index0 < 2; index0++) {
					for (int index1 = 0; index1 < 4; index1++) {
						if (world instanceof ServerLevel _level)
							_level.addFreshEntity(new ExperienceOrb(_level, (entity.getX() + 0.5), (entity.getY() + 0.5), (entity.getZ() + 0.5), (int) Math.round(droppedexperience / 4)));
					}
				}
			}
		}
	}
}
