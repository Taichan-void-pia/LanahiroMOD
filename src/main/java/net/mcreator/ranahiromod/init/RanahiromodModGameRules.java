
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ranahiromod.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RanahiromodModGameRules {
	public static final GameRules.Key<GameRules.IntegerValue> WORLDBANDELETEDSYSTEM = GameRules.register("worldBanDeletedSystem", GameRules.Category.PLAYER, GameRules.IntegerValue.create(0));
	public static final GameRules.Key<GameRules.BooleanValue> NOBODYRESTRAINTS = GameRules.register("nobodyRestraints", GameRules.Category.MISC, GameRules.BooleanValue.create(false));
	public static final GameRules.Key<GameRules.BooleanValue> LANAHIROMODPVP = GameRules.register("lanahiroModPVP", GameRules.Category.PLAYER, GameRules.BooleanValue.create(false));
	public static final GameRules.Key<GameRules.BooleanValue> TOGGLEBGM = GameRules.register("toggleBGM", GameRules.Category.MISC, GameRules.BooleanValue.create(true));
	public static final GameRules.Key<GameRules.BooleanValue> EASY_MODE = GameRules.register("easyMode", GameRules.Category.MISC, GameRules.BooleanValue.create(false));
	public static final GameRules.Key<GameRules.BooleanValue> NIGHTMARE_MODE = GameRules.register("nightmareMode", GameRules.Category.MISC, GameRules.BooleanValue.create(false));
	public static final GameRules.Key<GameRules.BooleanValue> TNT_RAIN = GameRules.register("tNTRain", GameRules.Category.MISC, GameRules.BooleanValue.create(false));
	public static final GameRules.Key<GameRules.BooleanValue> OLD_SOUND = GameRules.register("oldSound", GameRules.Category.MISC, GameRules.BooleanValue.create(true));
}
