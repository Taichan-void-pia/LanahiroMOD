package net.mcreator.ranahiromod.network;

import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.capabilities.CapabilityToken;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.Capability;

import net.minecraft.world.level.saveddata.SavedData;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.nbt.Tag;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.Direction;
import net.minecraft.client.Minecraft;

import net.mcreator.ranahiromod.RanahiromodMod;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RanahiromodModVariables {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		RanahiromodMod.addNetworkMessage(SavedDataSyncMessage.class, SavedDataSyncMessage::buffer, SavedDataSyncMessage::new, SavedDataSyncMessage::handler);
		RanahiromodMod.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new, PlayerVariablesSyncMessage::handler);
	}

	@SubscribeEvent
	public static void init(RegisterCapabilitiesEvent event) {
		event.register(PlayerVariables.class);
	}

	@Mod.EventBusSubscriber
	public static class EventBusVariableHandlers {
		@SubscribeEvent
		public static void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getEntity().level().isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
			if (!event.getEntity().level().isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getEntity().level().isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void clonePlayer(PlayerEvent.Clone event) {
			event.getOriginal().revive();
			PlayerVariables original = ((PlayerVariables) event.getOriginal().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			PlayerVariables clone = ((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			clone.cooltime = original.cooltime;
			clone.health = original.health;
			clone.defense = original.defense;
			clone.strength = original.strength;
			clone.attackspeed = original.attackspeed;
			clone.knockback_resistance = original.knockback_resistance;
			clone.speed = original.speed;
			clone.jump = original.jump;
			clone.AutoSmeltInfire = original.AutoSmeltInfire;
			clone.BlockBreakCounter = original.BlockBreakCounter;
			clone.XPChangeCounter = original.XPChangeCounter;
			clone.ReceiveDamageCounter = original.ReceiveDamageCounter;
			clone.AttributePoint = original.AttributePoint;
			clone.WazaString = original.WazaString;
			clone.ConsumptionMP = original.ConsumptionMP;
			clone.consumMPText = original.consumMPText;
			clone.Manaa = original.Manaa;
			clone.ChangeOtherSkillKeyCounter = original.ChangeOtherSkillKeyCounter;
			clone.worldban = original.worldban;
			clone.JumpCounter = original.JumpCounter;
			clone.Job = original.Job;
			clone.ShieldUse = original.ShieldUse;
			clone.CowKillCounter = original.CowKillCounter;
			clone.PigKillCounter = original.PigKillCounter;
			clone.ChickenKillCounter = original.ChickenKillCounter;
			clone.RabbitKillCounter = original.RabbitKillCounter;
			clone.SheepKillCounter = original.SheepKillCounter;
			clone.CarrotPickup = original.CarrotPickup;
			clone.PotatoPickup = original.PotatoPickup;
			clone.DeathCount = original.DeathCount;
			clone.allow_fly = original.allow_fly;
			clone.CheckFly = original.CheckFly;
			clone.FlyEndFall = original.FlyEndFall;
			clone.spawn_y = original.spawn_y;
			clone.spawn_z = original.spawn_z;
			clone.spawn_x = original.spawn_x;
			clone.respawn_enchant = original.respawn_enchant;
			clone.change_health_boost = original.change_health_boost;
			clone.DoFishing = original.DoFishing;
			clone.MobScale = original.MobScale;
			clone.gamer_score = original.gamer_score;
			if (!event.isWasDeath()) {
			}
		}

		@SubscribeEvent
		public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getEntity().level().isClientSide()) {
				SavedData mapdata = MapVariables.get(event.getEntity().level());
				SavedData worlddata = WorldVariables.get(event.getEntity().level());
				if (mapdata != null)
					RanahiromodMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getEntity()), new SavedDataSyncMessage(0, mapdata));
				if (worlddata != null)
					RanahiromodMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getEntity()), new SavedDataSyncMessage(1, worlddata));
			}
		}

		@SubscribeEvent
		public static void onPlayerChangedDimension(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getEntity().level().isClientSide()) {
				SavedData worlddata = WorldVariables.get(event.getEntity().level());
				if (worlddata != null)
					RanahiromodMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getEntity()), new SavedDataSyncMessage(1, worlddata));
			}
		}
	}

	public static class WorldVariables extends SavedData {
		public static final String DATA_NAME = "ranahiromod_worldvars";

		public static WorldVariables load(CompoundTag tag) {
			WorldVariables data = new WorldVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof Level level && !level.isClientSide())
				RanahiromodMod.PACKET_HANDLER.send(PacketDistributor.DIMENSION.with(level::dimension), new SavedDataSyncMessage(1, this));
		}

		static WorldVariables clientSide = new WorldVariables();

		public static WorldVariables get(LevelAccessor world) {
			if (world instanceof ServerLevel level) {
				return level.getDataStorage().computeIfAbsent(e -> WorldVariables.load(e), WorldVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class MapVariables extends SavedData {
		public static final String DATA_NAME = "ranahiromod_mapvars";
		public boolean LanahiroModClear = false;
		public double password = 0;
		public boolean SpawnHouseSummon = false;
		public double time = 0;
		public double world_share_hour = 0;
		public double world_share_minute = 0;
		public double rnd_tick_speed = 0;
		public boolean endstonefill = false;

		public static MapVariables load(CompoundTag tag) {
			MapVariables data = new MapVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
			LanahiroModClear = nbt.getBoolean("LanahiroModClear");
			password = nbt.getDouble("password");
			SpawnHouseSummon = nbt.getBoolean("SpawnHouseSummon");
			time = nbt.getDouble("time");
			world_share_hour = nbt.getDouble("world_share_hour");
			world_share_minute = nbt.getDouble("world_share_minute");
			rnd_tick_speed = nbt.getDouble("rnd_tick_speed");
			endstonefill = nbt.getBoolean("endstonefill");
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			nbt.putBoolean("LanahiroModClear", LanahiroModClear);
			nbt.putDouble("password", password);
			nbt.putBoolean("SpawnHouseSummon", SpawnHouseSummon);
			nbt.putDouble("time", time);
			nbt.putDouble("world_share_hour", world_share_hour);
			nbt.putDouble("world_share_minute", world_share_minute);
			nbt.putDouble("rnd_tick_speed", rnd_tick_speed);
			nbt.putBoolean("endstonefill", endstonefill);
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof Level && !world.isClientSide())
				RanahiromodMod.PACKET_HANDLER.send(PacketDistributor.ALL.noArg(), new SavedDataSyncMessage(0, this));
		}

		static MapVariables clientSide = new MapVariables();

		public static MapVariables get(LevelAccessor world) {
			if (world instanceof ServerLevelAccessor serverLevelAcc) {
				return serverLevelAcc.getLevel().getServer().getLevel(Level.OVERWORLD).getDataStorage().computeIfAbsent(e -> MapVariables.load(e), MapVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class SavedDataSyncMessage {
		private final int type;
		private SavedData data;

		public SavedDataSyncMessage(FriendlyByteBuf buffer) {
			this.type = buffer.readInt();
			CompoundTag nbt = buffer.readNbt();
			if (nbt != null) {
				this.data = this.type == 0 ? new MapVariables() : new WorldVariables();
				if (this.data instanceof MapVariables mapVariables)
					mapVariables.read(nbt);
				else if (this.data instanceof WorldVariables worldVariables)
					worldVariables.read(nbt);
			}
		}

		public SavedDataSyncMessage(int type, SavedData data) {
			this.type = type;
			this.data = data;
		}

		public static void buffer(SavedDataSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeInt(message.type);
			if (message.data != null)
				buffer.writeNbt(message.data.save(new CompoundTag()));
		}

		public static void handler(SavedDataSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer() && message.data != null) {
					if (message.type == 0)
						MapVariables.clientSide = (MapVariables) message.data;
					else
						WorldVariables.clientSide = (WorldVariables) message.data;
				}
			});
			context.setPacketHandled(true);
		}
	}

	public static final Capability<PlayerVariables> PLAYER_VARIABLES_CAPABILITY = CapabilityManager.get(new CapabilityToken<PlayerVariables>() {
	});

	@Mod.EventBusSubscriber
	private static class PlayerVariablesProvider implements ICapabilitySerializable<Tag> {
		@SubscribeEvent
		public static void onAttachCapabilities(AttachCapabilitiesEvent<Entity> event) {
			if (event.getObject() instanceof Player && !(event.getObject() instanceof FakePlayer))
				event.addCapability(new ResourceLocation("ranahiromod", "player_variables"), new PlayerVariablesProvider());
		}

		private final PlayerVariables playerVariables = new PlayerVariables();
		private final LazyOptional<PlayerVariables> instance = LazyOptional.of(() -> playerVariables);

		@Override
		public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
			return cap == PLAYER_VARIABLES_CAPABILITY ? instance.cast() : LazyOptional.empty();
		}

		@Override
		public Tag serializeNBT() {
			return playerVariables.writeNBT();
		}

		@Override
		public void deserializeNBT(Tag nbt) {
			playerVariables.readNBT(nbt);
		}
	}

	public static class PlayerVariables {
		public double cooltime = 0;
		public double health = 0;
		public double defense = 0;
		public double strength = 0;
		public double attackspeed = 0;
		public double knockback_resistance = 0;
		public double speed = 0;
		public double jump = 0;
		public boolean AutoSmeltInfire = false;
		public double BlockBreakCounter = 0;
		public double XPChangeCounter = 0;
		public double ReceiveDamageCounter = 0;
		public double AttributePoint = 0;
		public String WazaString = "\"\"";
		public double ConsumptionMP = 0;
		public String consumMPText = "\"\"";
		public double Manaa = 0;
		public double ChangeOtherSkillKeyCounter = 0;
		public double worldban = 0.0;
		public double JumpCounter = 0;
		public double Job = 0;
		public boolean ShieldUse = false;
		public double CowKillCounter = 0;
		public double PigKillCounter = 0;
		public double ChickenKillCounter = 0;
		public double RabbitKillCounter = 0;
		public double SheepKillCounter = 0;
		public double CarrotPickup = 0;
		public double PotatoPickup = 0;
		public double DeathCount = 0;
		public boolean allow_fly = false;
		public boolean CheckFly = false;
		public boolean FlyEndFall = false;
		public double spawn_y = 0;
		public double spawn_z = 0;
		public double spawn_x = 0;
		public boolean respawn_enchant = false;
		public double change_health_boost = 0;
		public double DoFishing = 0;
		public double MobScale = 0;
		public double gamer_score = 0;

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayer serverPlayer)
				RanahiromodMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> serverPlayer), new PlayerVariablesSyncMessage(this));
		}

		public Tag writeNBT() {
			CompoundTag nbt = new CompoundTag();
			nbt.putDouble("cooltime", cooltime);
			nbt.putDouble("health", health);
			nbt.putDouble("defense", defense);
			nbt.putDouble("strength", strength);
			nbt.putDouble("attackspeed", attackspeed);
			nbt.putDouble("knockback_resistance", knockback_resistance);
			nbt.putDouble("speed", speed);
			nbt.putDouble("jump", jump);
			nbt.putBoolean("AutoSmeltInfire", AutoSmeltInfire);
			nbt.putDouble("BlockBreakCounter", BlockBreakCounter);
			nbt.putDouble("XPChangeCounter", XPChangeCounter);
			nbt.putDouble("ReceiveDamageCounter", ReceiveDamageCounter);
			nbt.putDouble("AttributePoint", AttributePoint);
			nbt.putString("WazaString", WazaString);
			nbt.putDouble("ConsumptionMP", ConsumptionMP);
			nbt.putString("consumMPText", consumMPText);
			nbt.putDouble("Manaa", Manaa);
			nbt.putDouble("ChangeOtherSkillKeyCounter", ChangeOtherSkillKeyCounter);
			nbt.putDouble("worldban", worldban);
			nbt.putDouble("JumpCounter", JumpCounter);
			nbt.putDouble("Job", Job);
			nbt.putBoolean("ShieldUse", ShieldUse);
			nbt.putDouble("CowKillCounter", CowKillCounter);
			nbt.putDouble("PigKillCounter", PigKillCounter);
			nbt.putDouble("ChickenKillCounter", ChickenKillCounter);
			nbt.putDouble("RabbitKillCounter", RabbitKillCounter);
			nbt.putDouble("SheepKillCounter", SheepKillCounter);
			nbt.putDouble("CarrotPickup", CarrotPickup);
			nbt.putDouble("PotatoPickup", PotatoPickup);
			nbt.putDouble("DeathCount", DeathCount);
			nbt.putBoolean("allow_fly", allow_fly);
			nbt.putBoolean("CheckFly", CheckFly);
			nbt.putBoolean("FlyEndFall", FlyEndFall);
			nbt.putDouble("spawn_y", spawn_y);
			nbt.putDouble("spawn_z", spawn_z);
			nbt.putDouble("spawn_x", spawn_x);
			nbt.putBoolean("respawn_enchant", respawn_enchant);
			nbt.putDouble("change_health_boost", change_health_boost);
			nbt.putDouble("DoFishing", DoFishing);
			nbt.putDouble("MobScale", MobScale);
			nbt.putDouble("gamer_score", gamer_score);
			return nbt;
		}

		public void readNBT(Tag tag) {
			CompoundTag nbt = (CompoundTag) tag;
			cooltime = nbt.getDouble("cooltime");
			health = nbt.getDouble("health");
			defense = nbt.getDouble("defense");
			strength = nbt.getDouble("strength");
			attackspeed = nbt.getDouble("attackspeed");
			knockback_resistance = nbt.getDouble("knockback_resistance");
			speed = nbt.getDouble("speed");
			jump = nbt.getDouble("jump");
			AutoSmeltInfire = nbt.getBoolean("AutoSmeltInfire");
			BlockBreakCounter = nbt.getDouble("BlockBreakCounter");
			XPChangeCounter = nbt.getDouble("XPChangeCounter");
			ReceiveDamageCounter = nbt.getDouble("ReceiveDamageCounter");
			AttributePoint = nbt.getDouble("AttributePoint");
			WazaString = nbt.getString("WazaString");
			ConsumptionMP = nbt.getDouble("ConsumptionMP");
			consumMPText = nbt.getString("consumMPText");
			Manaa = nbt.getDouble("Manaa");
			ChangeOtherSkillKeyCounter = nbt.getDouble("ChangeOtherSkillKeyCounter");
			worldban = nbt.getDouble("worldban");
			JumpCounter = nbt.getDouble("JumpCounter");
			Job = nbt.getDouble("Job");
			ShieldUse = nbt.getBoolean("ShieldUse");
			CowKillCounter = nbt.getDouble("CowKillCounter");
			PigKillCounter = nbt.getDouble("PigKillCounter");
			ChickenKillCounter = nbt.getDouble("ChickenKillCounter");
			RabbitKillCounter = nbt.getDouble("RabbitKillCounter");
			SheepKillCounter = nbt.getDouble("SheepKillCounter");
			CarrotPickup = nbt.getDouble("CarrotPickup");
			PotatoPickup = nbt.getDouble("PotatoPickup");
			DeathCount = nbt.getDouble("DeathCount");
			allow_fly = nbt.getBoolean("allow_fly");
			CheckFly = nbt.getBoolean("CheckFly");
			FlyEndFall = nbt.getBoolean("FlyEndFall");
			spawn_y = nbt.getDouble("spawn_y");
			spawn_z = nbt.getDouble("spawn_z");
			spawn_x = nbt.getDouble("spawn_x");
			respawn_enchant = nbt.getBoolean("respawn_enchant");
			change_health_boost = nbt.getDouble("change_health_boost");
			DoFishing = nbt.getDouble("DoFishing");
			MobScale = nbt.getDouble("MobScale");
			gamer_score = nbt.getDouble("gamer_score");
		}
	}

	public static class PlayerVariablesSyncMessage {
		private final PlayerVariables data;

		public PlayerVariablesSyncMessage(FriendlyByteBuf buffer) {
			this.data = new PlayerVariables();
			this.data.readNBT(buffer.readNbt());
		}

		public PlayerVariablesSyncMessage(PlayerVariables data) {
			this.data = data;
		}

		public static void buffer(PlayerVariablesSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeNbt((CompoundTag) message.data.writeNBT());
		}

		public static void handler(PlayerVariablesSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					PlayerVariables variables = ((PlayerVariables) Minecraft.getInstance().player.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
					variables.cooltime = message.data.cooltime;
					variables.health = message.data.health;
					variables.defense = message.data.defense;
					variables.strength = message.data.strength;
					variables.attackspeed = message.data.attackspeed;
					variables.knockback_resistance = message.data.knockback_resistance;
					variables.speed = message.data.speed;
					variables.jump = message.data.jump;
					variables.AutoSmeltInfire = message.data.AutoSmeltInfire;
					variables.BlockBreakCounter = message.data.BlockBreakCounter;
					variables.XPChangeCounter = message.data.XPChangeCounter;
					variables.ReceiveDamageCounter = message.data.ReceiveDamageCounter;
					variables.AttributePoint = message.data.AttributePoint;
					variables.WazaString = message.data.WazaString;
					variables.ConsumptionMP = message.data.ConsumptionMP;
					variables.consumMPText = message.data.consumMPText;
					variables.Manaa = message.data.Manaa;
					variables.ChangeOtherSkillKeyCounter = message.data.ChangeOtherSkillKeyCounter;
					variables.worldban = message.data.worldban;
					variables.JumpCounter = message.data.JumpCounter;
					variables.Job = message.data.Job;
					variables.ShieldUse = message.data.ShieldUse;
					variables.CowKillCounter = message.data.CowKillCounter;
					variables.PigKillCounter = message.data.PigKillCounter;
					variables.ChickenKillCounter = message.data.ChickenKillCounter;
					variables.RabbitKillCounter = message.data.RabbitKillCounter;
					variables.SheepKillCounter = message.data.SheepKillCounter;
					variables.CarrotPickup = message.data.CarrotPickup;
					variables.PotatoPickup = message.data.PotatoPickup;
					variables.DeathCount = message.data.DeathCount;
					variables.allow_fly = message.data.allow_fly;
					variables.CheckFly = message.data.CheckFly;
					variables.FlyEndFall = message.data.FlyEndFall;
					variables.spawn_y = message.data.spawn_y;
					variables.spawn_z = message.data.spawn_z;
					variables.spawn_x = message.data.spawn_x;
					variables.respawn_enchant = message.data.respawn_enchant;
					variables.change_health_boost = message.data.change_health_boost;
					variables.DoFishing = message.data.DoFishing;
					variables.MobScale = message.data.MobScale;
					variables.gamer_score = message.data.gamer_score;
				}
			});
			context.setPacketHandled(true);
		}
	}
}
