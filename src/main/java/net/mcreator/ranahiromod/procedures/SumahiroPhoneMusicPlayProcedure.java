package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.client.gui.components.EditBox;

import net.mcreator.ranahiromod.init.RanahiromodModItems;

import java.util.HashMap;

public class SumahiroPhoneMusicPlayProcedure {
	public static void execute(Entity entity, HashMap guistate) {
		if (entity == null || guistate == null)
			return;
		String sound_id = "";
		String sound_type = "";
		String sound_settings = "";
		String space = "";
		ItemStack mainhand = ItemStack.EMPTY;
		boolean logic_a = false;
		logic_a = !((guistate.containsKey("text:music_name") ? ((EditBox) guistate.get("text:music_name")).getValue() : "").equals("")
				&& (guistate.containsKey("text:music_type") ? ((EditBox) guistate.get("text:music_type")).getValue() : "").equals("")
				&& (guistate.containsKey("text:music_volume") ? ((EditBox) guistate.get("text:music_volume")).getValue() : "").equals("")
				&& (guistate.containsKey("text:music_pitch") ? ((EditBox) guistate.get("text:music_pitch")).getValue() : "").equals(""));
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RanahiromodModItems.SUMAHIRO_PHONE.get()) {
			mainhand = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == RanahiromodModItems.SUMAHIRO_PHONE.get()) {
			mainhand = (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY);
		}
		mainhand.getOrCreateTag().putBoolean("play_music", (logic_a && !mainhand.getOrCreateTag().getBoolean("play_music") ? true : false));
		if (mainhand.getOrCreateTag().getBoolean("play_music")) {
			sound_id = guistate.containsKey("text:music_name") ? ((EditBox) guistate.get("text:music_name")).getValue() : "";
			sound_type = guistate.containsKey("text:music_type") ? ((EditBox) guistate.get("text:music_type")).getValue() : "";
			space = " ";
			sound_settings = ((guistate.containsKey("text:music_volume") ? ((EditBox) guistate.get("text:music_volume")).getValue() : "") + "" + space) + ""
					+ (guistate.containsKey("text:music_pitch") ? ((EditBox) guistate.get("text:music_pitch")).getValue() : "");
			{
				Entity _ent = entity;
				if (!_ent.level().isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "stopsound @s");
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level().isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), (("playsound" + space) + "" + (sound_id + "" + space) + (sound_type + "" + space) + ("@s" + space) + ("~ ~ ~" + space) + sound_settings));
				}
			}
		}
		if (entity instanceof Player _player)
			_player.closeContainer();
	}
}
