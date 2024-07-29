package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.client.gui.components.EditBox;

import java.util.HashMap;

public class ShowcaseBlockConfirmProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, HashMap guistate) {
		if (guistate == null)
			return;
		String datatag = "";
		String item_id = "";
		if (!(guistate.containsKey("text:item_id") ? ((EditBox) guistate.get("text:item_id")).getValue() : "").equals("")) {
			datatag = guistate.containsKey("text:datatag") ? ((EditBox) guistate.get("text:datatag")).getValue() : "";
			item_id = guistate.containsKey("text:item_id") ? ((EditBox) guistate.get("text:item_id")).getValue() : "";
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3((x + 0.5), (y + 0.5), (z + 0.5)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"kill @e[type=item,distance=..3,sort=nearest,limit=1,nbt={Tags:[\"now_showcase\"],Item:{}}]");
			if ((datatag).equals("")) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, new Vec3((x + 0.5), (y + 0.5), (z + 0.5)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							("summon item ~ ~1 ~ {NoGravity:1b,Glowing:1b,PickupDelay:32767,Invulnerable:1b,Tags:[\"now_showcase\"],Item:{id:\"" + "" + item_id + "\",Count:1b}}"));
			} else {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, new Vec3((x + 0.5), (y + 0.5), (z + 0.5)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							("summon item ~ ~1 ~ {NoGravity:1b,Glowing:1b,PickupDelay:32767,Invulnerable:1b,Tags:[\"now_showcase\"],Item:{id:\"" + "" + item_id + "\",Count:1b,tag:" + datatag + "}}"));
			}
		}
	}
}
