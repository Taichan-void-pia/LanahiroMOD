package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

import net.mcreator.ranahiromod.network.RanahiromodModVariables;

public class PasswordFindProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof ServerPlayer _plr0 && _plr0.level() instanceof ServerLevel && _plr0.getAdvancements().getOrStartProgress(_plr0.server.getAdvancements().getAdvancement(new ResourceLocation("ranahiromod:kill_bosshiro"))).isDone()
				|| (entity.getDisplayName().getString()).equals("Dev") || (entity.getDisplayName().getString()).equals("taichan_") || (entity.getDisplayName().getString()).equals("pirokichihawaii")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u89E3\u8AAD\u306B\u6210\u529F\u3057\u307E\u3057\u305F\uFF01"), false);
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("" + Math.round(RanahiromodModVariables.MapVariables.get(world).password))), false);
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u307E\u3060\u6761\u4EF6\u3092\u6E80\u305F\u3057\u3066\u3044\u307E\u305B\u3093\uFF01"), false);
		}
	}
}
