
package net.mcreator.ranahiromod.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.ranahiromod.world.inventory.SumahiroPhoneWarpGUIMenu;
import net.mcreator.ranahiromod.procedures.SumahiroPhonePlaceLinkProcedure;
import net.mcreator.ranahiromod.procedures.SumahiroPhonePlace3Procedure;
import net.mcreator.ranahiromod.procedures.SumahiroPhonePlace2Procedure;
import net.mcreator.ranahiromod.procedures.SumahiroPhonePlace1Procedure;
import net.mcreator.ranahiromod.procedures.SumahiroPhoneHomeButtonProcedure;
import net.mcreator.ranahiromod.procedures.SumahirPhonePositiondel4Procedure;
import net.mcreator.ranahiromod.procedures.SumahirPhonePositiondel3Procedure;
import net.mcreator.ranahiromod.procedures.SumahirPhonePositiondel2Procedure;
import net.mcreator.ranahiromod.procedures.SumahirPhonePositiondel1Procedure;
import net.mcreator.ranahiromod.RanahiromodMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SumahiroPhoneWarpGUIButtonMessage {
	private final int buttonID, x, y, z;

	public SumahiroPhoneWarpGUIButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public SumahiroPhoneWarpGUIButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(SumahiroPhoneWarpGUIButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(SumahiroPhoneWarpGUIButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = SumahiroPhoneWarpGUIMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			SumahiroPhonePlaceLinkProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			SumahiroPhonePlace1Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			SumahiroPhonePlace2Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			SumahiroPhonePlace3Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 4) {

			SumahiroPhoneHomeButtonProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 5) {

			SumahirPhonePositiondel1Procedure.execute(entity);
		}
		if (buttonID == 6) {

			SumahirPhonePositiondel2Procedure.execute(entity);
		}
		if (buttonID == 7) {

			SumahirPhonePositiondel3Procedure.execute(entity);
		}
		if (buttonID == 8) {

			SumahirPhonePositiondel4Procedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		RanahiromodMod.addNetworkMessage(SumahiroPhoneWarpGUIButtonMessage.class, SumahiroPhoneWarpGUIButtonMessage::buffer, SumahiroPhoneWarpGUIButtonMessage::new, SumahiroPhoneWarpGUIButtonMessage::handler);
	}
}
