package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.protocol.game.ClientboundUpdateMobEffectPacket;
import net.minecraft.network.protocol.game.ClientboundPlayerAbilitiesPacket;
import net.minecraft.network.protocol.game.ClientboundLevelEventPacket;
import net.minecraft.network.protocol.game.ClientboundGameEventPacket;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class PrivateBottleDrankProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		boolean logic_dim = false;
		String text_t = "";
		if (!((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("ranahiromod:private_land")))) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.SONIC_BOOM, x, (y + 1), z, 1, 0, 0, 0, 0.1);
			itemstack.getOrCreateTag().putDouble("x_pos", (entity.getX()));
			itemstack.getOrCreateTag().putDouble("y_pos", (entity.getY()));
			itemstack.getOrCreateTag().putDouble("z_pos", (entity.getZ()));
			itemstack.getOrCreateTag().putString("SaveDimension", ("" + entity.level().dimension()));
			if (entity instanceof ServerPlayer _player && !_player.level().isClientSide()) {
				ResourceKey<Level> destinationType = ResourceKey.create(Registries.DIMENSION, new ResourceLocation("ranahiromod:private_land"));
				if (_player.level().dimension() == destinationType)
					return;
				ServerLevel nextLevel = _player.server.getLevel(destinationType);
				if (nextLevel != null) {
					_player.connection.send(new ClientboundGameEventPacket(ClientboundGameEventPacket.WIN_GAME, 0));
					_player.teleportTo(nextLevel, _player.getX(), _player.getY(), _player.getZ(), _player.getYRot(), _player.getXRot());
					_player.connection.send(new ClientboundPlayerAbilitiesPacket(_player.getAbilities()));
					for (MobEffectInstance _effectinstance : _player.getActiveEffects())
						_player.connection.send(new ClientboundUpdateMobEffectPacket(_player.getId(), _effectinstance));
					_player.connection.send(new ClientboundLevelEventPacket(1032, BlockPos.ZERO, 0, false));
				}
			}
			if (entity instanceof Player _player)
				_player.getFoodData().setFoodLevel((int) ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) - 4));
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.GLOW, x, y, z, 100, 0.2, 1, 0.2, 0.1);
		} else if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("ranahiromod:private_land"))) {
			text_t = ((itemstack.getOrCreateTag().getString("SaveDimension")).replace("ResourceKey[minecraft:dimension / ", "")).replace("]", "");
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.SONIC_BOOM, x, (y + 1), z, 1, 0.2, 0.35, 0.2, 0.1);
			{
				Entity _ent = entity;
				if (!_ent.level().isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level().getServer(), _ent),
							("execute in " + text_t + " run tp " + ((itemstack.getOrCreateTag().getDouble("x_pos") + " ") + "" + (itemstack.getOrCreateTag().getDouble("y_pos") + " ") + itemstack.getOrCreateTag().getDouble("z_pos"))));
				}
			}
			{
				Entity _ent = entity;
				_ent.teleportTo((itemstack.getOrCreateTag().getDouble("x_pos")), (itemstack.getOrCreateTag().getDouble("y_pos")), (itemstack.getOrCreateTag().getDouble("z_pos")));
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport((itemstack.getOrCreateTag().getDouble("x_pos")), (itemstack.getOrCreateTag().getDouble("y_pos")), (itemstack.getOrCreateTag().getDouble("z_pos")), _ent.getYRot(), _ent.getXRot());
			}
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.GLOW, x, y, z, 100, 0.2, 1, 0.2, 0.1);
		}
	}
}
