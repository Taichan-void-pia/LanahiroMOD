package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.AdvancementEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.ranahiromod.network.RanahiromodModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class UnlockAchievementProcedure {
	@SubscribeEvent
	public static void onAdvancement(AdvancementEvent event) {
		execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.NEUTRAL, 1, 2);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.NEUTRAL, 1, 2, false);
			}
		}
		if (Math.random() < 1 && entity instanceof ServerPlayer _plr1 && _plr1.level() instanceof ServerLevel
				&& _plr1.getAdvancements().getOrStartProgress(_plr1.server.getAdvancements().getAdvancement(new ResourceLocation("ranahiromod:doubling_score_4"))).isDone()) {
			{
				double _setval = (entity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).gamer_score + 10;
				entity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.gamer_score = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (Math.random() < 0.6 && entity instanceof ServerPlayer _plr2 && _plr2.level() instanceof ServerLevel
				&& _plr2.getAdvancements().getOrStartProgress(_plr2.server.getAdvancements().getAdvancement(new ResourceLocation("ranahiromod:doubling_score_3"))).isDone()) {
			{
				double _setval = (entity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).gamer_score + 5;
				entity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.gamer_score = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (Math.random() < 0.3 && entity instanceof ServerPlayer _plr3 && _plr3.level() instanceof ServerLevel
				&& _plr3.getAdvancements().getOrStartProgress(_plr3.server.getAdvancements().getAdvancement(new ResourceLocation("ranahiromod:doubling_score_2"))).isDone()) {
			{
				double _setval = (entity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).gamer_score + 3;
				entity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.gamer_score = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (Math.random() < 0.075 && entity instanceof ServerPlayer _plr4 && _plr4.level() instanceof ServerLevel
				&& _plr4.getAdvancements().getOrStartProgress(_plr4.server.getAdvancements().getAdvancement(new ResourceLocation("ranahiromod:doubling_score"))).isDone()) {
			{
				double _setval = (entity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).gamer_score + 1;
				entity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.gamer_score = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (Math.random() < 0.01) {
			{
				double _setval = (entity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).gamer_score + 1;
				entity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.gamer_score = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
