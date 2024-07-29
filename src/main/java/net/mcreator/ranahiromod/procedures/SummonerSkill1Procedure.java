package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class SummonerSkill1Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean found = false;
		double zPos = 0;
		double yPos = 0;
		double xPos = 0;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		entity.getPersistentData().putDouble("cnt1", (entity.getPersistentData().getDouble("cnt1") + 1));
		if (entity.getPersistentData().getDouble("cnt1") > 1) {
			sx = -2;
			for (int index0 = 0; index0 < 5; index0++) {
				sz = -2;
				for (int index1 = 0; index1 < 5; index1++) {
					if ((world.getBlockState(BlockPos.containing(x + sx, y - 1 + sy, z + sz))).getBlock() == Blocks.AIR) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3((x + sx), (y - 1), (z + sz)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"setblock ~ ~ ~ minecraft:white_wool");
					}
					sz = sz + 1;
				}
				sx = sx + 1;
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.bat.takeoff")), SoundSource.NEUTRAL, 1, (float) 0.5);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.bat.takeoff")), SoundSource.NEUTRAL, 1, (float) 0.5, false);
				}
			}
			entity.getPersistentData().putDouble("skill2", 0);
		}
	}
}
