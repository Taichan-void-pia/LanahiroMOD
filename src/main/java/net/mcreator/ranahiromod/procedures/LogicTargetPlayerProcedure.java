package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.level.GameType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.client.Minecraft;

public class LogicTargetPlayerProcedure {
	public static boolean execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return false;
		boolean logic___ = false;
		logic___ = false;
		if ((sourceentity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity) {
			if ((sourceentity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == entity) {
				logic___ = true;
			} else if (sourceentity instanceof Player && !(new Object() {
				public boolean checkGamemode(Entity _ent) {
					if (_ent instanceof ServerPlayer _serverPlayer) {
						return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
					} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
						return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
								&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
					}
					return false;
				}
			}.checkGamemode(entity))) {
				if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == sourceentity) {
					logic___ = true;
				}
			}
		}
		return logic___;
	}
}
