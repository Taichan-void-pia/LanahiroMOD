package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

public class HIROMARUTVRightClickedOnEntityProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (sourceentity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal((("<" + entity.getDisplayName().getString() + "> ")
					+ "\u307B\u3093\u3068\u306B\u3054\u3081\u3093\u306A\u3055\u3044\u3082\u3046\u5411\u3053\u3046\u304B\u3089\u306A\u306B\u304B\u3057\u305F\u4EBA\u9593\u306B\u4EE5\u5916\u3057\u307E\u305B\u3093")), false);
		if (sourceentity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal((("<" + entity.getDisplayName().getString() + "> ") + "\u305D\u306E\u3042\u3068\u306B\u3001NBT\u30BF\u30B0\u3064\u3051\u308C\u3070\u3001TNT\u3060\u3051\u6D88\u3048\u307E\u3059")), false);
		if (sourceentity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal((("<" + entity.getDisplayName().getString() + "> ") + "\u3054\u3081\u3093\u306A\u3055\u3044 \u8105\u3057\u3067\u3059")), false);
		if (sourceentity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal((("<" + entity.getDisplayName().getString() + "> ") + "\u57F7\u884C\u7336\u4E88\u304F\u3060\u3055\u3044")), false);
		if (sourceentity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(
					Component.literal(
							(("<" + entity.getDisplayName().getString() + "> ") + "\u3044\u3064\u3067\u3059\u304B \u305D\u308C\u57F7\u884C\u7336\u4E88\u3058\u3083\u306A\u304F\u3066\u518D\u51E6\u5211\u3063\u3066\u3044\u3046\u3093\u3067\u3059\u3088")),
					false);
		if (sourceentity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal((("<" + entity.getDisplayName().getString() + "> ")
					+ "\u3054\u3081\u3093\u306A\u3055\u3044\u3054\u3081\u3093\u306A\u3055\u3044\u3054\u3081\u3093\u306A\u3055\u3044\u3054\u3081\u3093\u306A\u3055\u3044\u3054\u3081\u3093\u306A\u3055\u3044\u3054\u3081\u3093\u306A\u3055\u3044\u3054\u3081\u3093\u306A\u3055\u3044\u3054\u3081\u3093\u306A\u3055\u3044\u3054\u3081\u3093\u306A\u3055\u3044\u3054\u3081\u3093\u306A\u3055\u3044\u3054\u3081\u3093\u306A\u3055\u3044\u3054\u3081\u3093\u306A\u3055\u3044\u3054\u3081\u3093\u306A\u3055\u3044\u3054\u3081\u3093\u306A\u3055\u3044\u3054\u3081\u3093\u306A\u3055\u3044\u3054\u3081\u3093\u306A\u3055\u3044\u3054\u3081\u3093\u306A\u3055\u3044\u3054\u3081\u3093\u306A\u3055\u3044")),
					false);
		if (sourceentity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal((("<" + entity.getDisplayName().getString() + "> ") + "\u306F\u3044(\u3042\u308A\u304C\u3068\u3046\u3054\u3056\u3044\u307E\u3059)")), false);
	}
}
