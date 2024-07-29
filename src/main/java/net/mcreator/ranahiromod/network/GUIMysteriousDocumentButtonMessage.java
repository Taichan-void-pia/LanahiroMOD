
package net.mcreator.ranahiromod.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.ranahiromod.world.inventory.GUIMysteriousDocumentMenu;
import net.mcreator.ranahiromod.procedures.MysteriousDocumentPage3TickStartProcedure;
import net.mcreator.ranahiromod.procedures.MysteriousDocumentPage2Procedure;
import net.mcreator.ranahiromod.procedures.MysteriousDocumentPage1Procedure;
import net.mcreator.ranahiromod.procedures.CloseButtonProcedure;
import net.mcreator.ranahiromod.RanahiromodMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class GUIMysteriousDocumentButtonMessage {
	private final int buttonID, x, y, z;

	public GUIMysteriousDocumentButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public GUIMysteriousDocumentButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(GUIMysteriousDocumentButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(GUIMysteriousDocumentButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = GUIMysteriousDocumentMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			MysteriousDocumentPage1Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			MysteriousDocumentPage2Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			MysteriousDocumentPage3TickStartProcedure.execute(entity);
		}
		if (buttonID == 4) {

			CloseButtonProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		RanahiromodMod.addNetworkMessage(GUIMysteriousDocumentButtonMessage.class, GUIMysteriousDocumentButtonMessage::buffer, GUIMysteriousDocumentButtonMessage::new, GUIMysteriousDocumentButtonMessage::handler);
	}
}
