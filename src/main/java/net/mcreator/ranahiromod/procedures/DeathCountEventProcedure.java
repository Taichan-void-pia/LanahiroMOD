package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.ranahiromod.network.RanahiromodModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class DeathCountEventProcedure {
	@SubscribeEvent
	public static void onPlayerRespawned(PlayerEvent.PlayerRespawnEvent event) {
		execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double death = 0;
		double rnd = 0;
		double xPos = 0;
		double yPos = 0;
		double zPos = 0;
		double num_x = 0;
		double num_z = 0;
		{
			double _setval = (entity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).DeathCount + 1;
			entity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.DeathCount = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		death = (entity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).DeathCount;
		if (death == 1) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal((("<" + (entity.getDisplayName().getString() + "> ")) + "\u30D5\u30C3\uFF57")), false);
		} else if (death == 10) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal((("<" + ("WorldBanSystem" + "> ")) + "\u3082\u3057\u304B\u3057\u3066\u3060\u3051\u3069\u82E6\u6226\u3057\u3066\u308B\uFF1F\uFF57")), false);
		} else if (death == 100) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(
						(("<" + ("WorldBanSystem" + "> ")) + "\u6B7B\u4EA1\u56DE\u6570\u304C100\u56DE\u3092\u8D85\u3048\u305F\u306E\u3067\u30E9\u30CA\u30D2\u30ED\u3055\u3093\u304C\u30E2\u30CE\u30DE\u30CD\u3057\u307E\u3059\u3002(\u7FA9\u52D9)")),
						false);
		} else if (death == 200) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal((("<" + (entity.getDisplayName().getString() + "> ")) + "\u30D5\u30C3\u3001\u4ECA\u306E\u306F\u3061\u3087\u3063\u3068\u30DF\u30B9\u3063\u305F\u3060\u3051\u3055(200\u56DE)")), false);
		} else if (death == 500) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal((("<" + ("taichan_" + "> ")) + "\u3042\u3093\u3061\u3083\u3093\u3001\u82E6\u6226\u3057\u3059\u304E\u3066\u982D\u304A\u304B\u3057\u304F\u306A\u3063\u305F\u306E\u304B\u3044?")), false);
		} else if (death == 1000) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal((("<" + ("Bosshiro" + "> ")) + "\u304A\u524D1000\u56DE\u3082\u6B7B\u3093\u3060\u306E\uFF01wwww")), false);
		} else if (death == 2000) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal((("<" + ("taichan_" + "> ")) + "TUSBneo\u3067\u81EA\u5206\u304C\u7F8A\u6BDB\u3092\u6BBA\u3057\u305F\u6570\u3058\u3083\u3093\uFF01")), false);
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal((("<" + ("taichan_" + "> ")) + "(\u3002\u00B4\u30FB\u03C9\u30FB)\u3093\uFF1FTUSBneo\u3063\u3066\u4F55\u304B\u3063\u3066\uFF1F \u30B0\u30B0\u30EC\u30AB\u30B9w")), false);
		} else if (death == 5000) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal((("<" + ("taichan_" + "> ")) + "\u30B3\u30E1\u30F3\u30C8\u75B2\u308C\u305Fw")), false);
		} else if (death == 10000) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal((("<" + ("WorldBanSystem" + "> ")) + "\u795D\uFF01\u6B7B\u4EA1\u56DE\u657010000\u56DE\uFF01")), false);
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal((("<" + ("WorldBanSystem" + "> ")) + "\u3064\u307E\u308A\u3053\u3053\u304B\u3089\u78BA\u5B9A\u3067\u30C7\u30B9\u30DA\u30CA\u30EB\u30C6\u30A3\u304C\u5165\u308B\u3088\uFF01")), false);
		} else if (death <= 10000) {
			rnd = Math.random();
			if (Math.random() <= 0.2) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal((("<" + ("taichan_" + "> ")) + "\u82E6\u6226\u3057\u3066\u308B\uFF1F\u5B09\u3057\u3044\u306A\u3041w")), false);
			} else if (Math.random() <= 0.4) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal((("<" + ("taichan_" + "> ")) + "" + ("\u304A\u524D\u306E\u6B7B\u4EA1\u56DE\u6570" + death + "\u304B\u3088w")
							+ (death >= 500 ? "\u6B7B\u306B\u3059\u304E\u306A\u3001\u8EDF\u5F31\u304B\u3088w" : "\u307E\u3042\u9811\u5F35\u308C\uFF01"))), false);
			} else if (Math.random() <= 0.6) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal((("<" + (entity.getDisplayName().getString() + "> ")) + "\u4ECA\u306E\u306F\u7DF4\u7FD2\u3055(;'\u2200')")), false);
			} else if (Math.random() <= 0.8) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal((("<" + (entity.getDisplayName().getString() + "> ")) + "\u305F\u307E\u306B\u306F\u6B7B\u306C\u306E\u3082\u3044\u3044\u3082\u3093\u3060\u306A...")), false);
			} else {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(
							Component.literal(
									(("<" + ("taichan_" + "> ")) + "\u3082\u3063\u3068\u65E9\u304F\u6B7B\u3093\u3067\u30B7\u30E7\u30A6\u30BF\u3088\u308A\u6B7B\u4EA1RTA\u65E9\u304F\u3059\u308B\u3088\u3046\u66F4\u65B0\u3057\u308D\u3088\uFF01")),
							false);
			}
		}
		if (death >= 10000 || Math.random() < 0.4) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal((("<" + ("WorldBanSystem" + "> ")) + "\u30C7\u30B9\u30DA\u30CA\u30EB\u30C6\u30A3\u304C\u5165\u308A\u307E\u3059\u3002")), false);
			rnd = Math.random();
			if (rnd <= 0.2) {
				num_x = -6;
				for (int index0 = 0; index0 < 5; index0++) {
					xPos = entity.getX() + num_x;
					num_z = -6;
					for (int index1 = 0; index1 < 5; index1++) {
						zPos = entity.getZ() + num_z;
						yPos = entity.getY() + 25;
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "summon tnt_minecart ~ ~ ~");
						num_z = num_z + 3;
					}
					num_x = num_x + 3;
				}
			} else if (rnd <= 0.4) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, (y + 15), z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"summon ghast ~ ~ ~ {ExplosionPower:7,Passengers:[{id:\"minecraft:spawner_minecart\",SpawnCount:3,Delay:20,MinSpawnDelay:20,MaxSpawnDelay:20,DisplayState:{Name:\"minecraft:air\"},SpawnData:{entity:{id:\"minecraft:tnt_minecart\",CustomNameVisible:1b,CustomName:'{\"text\":\"\u5927\u9678\u9593\u5F3E\u9053\u30DF\u30B5\u30A4\u30EB\",\"color\":\"aqua\",\"bold\":true}'}}}]}");
			} else if (rnd <= 0.6) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, (int) Double.POSITIVE_INFINITY, 1, false, false));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.POISON, (int) Double.POSITIVE_INFINITY, 1, false, false));
			} else if (rnd <= 0.8) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.WITHER, (int) Double.POSITIVE_INFINITY, 1, false, false));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, (int) Double.POSITIVE_INFINITY, 4, false, false));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, (int) Double.POSITIVE_INFINITY, 99, false, false));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, (int) Double.POSITIVE_INFINITY, 99, false, false));
			} else {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.POISON, (int) Double.POSITIVE_INFINITY, 1, false, false));
			}
		}
	}
}
