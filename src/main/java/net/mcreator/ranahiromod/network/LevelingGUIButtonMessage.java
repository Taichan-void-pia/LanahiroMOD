
package net.mcreator.ranahiromod.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.ranahiromod.world.inventory.LevelingGUIMenu;
import net.mcreator.ranahiromod.procedures.SumahiroPhoneHomeButtonProcedure;
import net.mcreator.ranahiromod.procedures.ChangeLevelProcedure;
import net.mcreator.ranahiromod.procedures.ChangeLevel6Procedure;
import net.mcreator.ranahiromod.procedures.ChangeLevel5Procedure;
import net.mcreator.ranahiromod.procedures.ChangeLevel4Procedure;
import net.mcreator.ranahiromod.procedures.ChangeLevel3Procedure;
import net.mcreator.ranahiromod.procedures.ChangeLevel2Procedure;
import net.mcreator.ranahiromod.RanahiromodMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class LevelingGUIButtonMessage {
	private final int buttonID, x, y, z;

	public LevelingGUIButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public LevelingGUIButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(LevelingGUIButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(LevelingGUIButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = LevelingGUIMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			ChangeLevel5Procedure.execute(entity);
		}
		if (buttonID == 1) {

			ChangeLevel4Procedure.execute(entity);
		}
		if (buttonID == 2) {

			ChangeLevel3Procedure.execute(entity);
		}
		if (buttonID == 3) {

			ChangeLevel2Procedure.execute(entity);
		}
		if (buttonID == 4) {

			ChangeLevelProcedure.execute(entity);
		}
		if (buttonID == 5) {

			ChangeLevel6Procedure.execute(entity);
		}
		if (buttonID == 6) {

			SumahiroPhoneHomeButtonProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		RanahiromodMod.addNetworkMessage(LevelingGUIButtonMessage.class, LevelingGUIButtonMessage::buffer, LevelingGUIButtonMessage::new, LevelingGUIButtonMessage::handler);
	}
}
