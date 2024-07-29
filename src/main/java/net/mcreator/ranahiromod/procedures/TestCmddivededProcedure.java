package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.StringArgumentType;

public class TestCmddivededProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		if ((StringArgumentType.getString(arguments, "cmdtypes")).equals("blockbreak")) {
			BlockDestroyCMDProcedure.execute(world, x, y, z, entity);
		} else if ((StringArgumentType.getString(arguments, "cmdtypes")).equals("checkfly")) {
			CheckflyCMDProcedure.execute(entity);
		} else if ((StringArgumentType.getString(arguments, "cmdtypes")).equals("decimal")) {
			entity.getPersistentData().putString("decimal_16", "deb6");
			UUID16DecimalConverted10DecimalProcedure.execute(entity);
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal((entity.getPersistentData().getString("decimal_10_text"))), false);
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal((StringArgumentType.getString(arguments, "cmdtypes") + "is warning")), false);
		}
	}
}
