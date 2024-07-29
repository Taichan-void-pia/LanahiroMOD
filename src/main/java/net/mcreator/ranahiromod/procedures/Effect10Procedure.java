package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.ranahiromod.RanahiromodMod;

public class Effect10Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double xPos = 0;
		double yPos = 0;
		double zPos = 0;
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.CLOUD, x, (y + 3), z, 8, 0.35, 0, 0.35, 0.2);
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					"summon falling_block ~ ~3 ~ {BlockState:{Name:\"minecraft:anvil\"},Time:1,DropItem:0b,HurtEntities:0b,Tags:[\"effect10\"]}");
		RanahiromodMod.queueServerWork(1, () -> {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"kill @e[type=falling_block,tag=effect10,nbt={BlockState:{Name:\"minecraft:anvil\"},Time:1}]");
		});
	}
}
