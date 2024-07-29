
package net.mcreator.ranahiromod.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.ranahiromod.world.inventory.SmahirophoneBaseGUIMenu;
import net.mcreator.ranahiromod.procedures.WeatherGUIOpenProcedure;
import net.mcreator.ranahiromod.procedures.WarpGUIOpenProcedure;
import net.mcreator.ranahiromod.procedures.SumahiroPhoneRightClickProcedure;
import net.mcreator.ranahiromod.procedures.NoteGUIOpenProcedure;
import net.mcreator.ranahiromod.procedures.MusicGUIOpenProcedure;
import net.mcreator.ranahiromod.procedures.CloseButtonProcedure;
import net.mcreator.ranahiromod.RanahiromodMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SmahirophoneBaseGUIButtonMessage {
	private final int buttonID, x, y, z;

	public SmahirophoneBaseGUIButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public SmahirophoneBaseGUIButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(SmahirophoneBaseGUIButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(SmahirophoneBaseGUIButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level();
		HashMap guistate = SmahirophoneBaseGUIMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			CloseButtonProcedure.execute(entity);
		}
		if (buttonID == 1) {

			MusicGUIOpenProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			NoteGUIOpenProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			WarpGUIOpenProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 4) {

			SumahiroPhoneRightClickProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 5) {

			WeatherGUIOpenProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		RanahiromodMod.addNetworkMessage(SmahirophoneBaseGUIButtonMessage.class, SmahirophoneBaseGUIButtonMessage::buffer, SmahirophoneBaseGUIButtonMessage::new, SmahirophoneBaseGUIButtonMessage::handler);
	}
}
