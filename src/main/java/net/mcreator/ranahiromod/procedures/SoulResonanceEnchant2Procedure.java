package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SoulResonanceEnchant2Procedure {
	@SubscribeEvent
	public static void onPlayerRespawned(PlayerEvent.PlayerRespawnEvent event) {
		execute(event, event.getEntity().level(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double Level = 0;
		double level_math = 0;
		ItemStack armor_item1 = ItemStack.EMPTY;
		ItemStack armor_item2 = ItemStack.EMPTY;
		ItemStack armor_item3 = ItemStack.EMPTY;
		ItemStack armor_item0 = ItemStack.EMPTY;
		if (entity.getPersistentData().getBoolean("SoulResonance")) {
			entity.getPersistentData().putBoolean("SoulResonance", false);
			world.getLevelData().getGameRules().getRule(GameRules.RULE_KEEPINVENTORY).set(false, world.getServer());
		}
	}
}
