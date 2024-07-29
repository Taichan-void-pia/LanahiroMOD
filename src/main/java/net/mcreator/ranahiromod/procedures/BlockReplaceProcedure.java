package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class BlockReplaceProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		BlockState block_a = Blocks.AIR.defaultBlockState();
		boolean logic_gamerule = false;
		boolean CanDestroy = false;
		String destroy_type = "";
		String block_type = "";
		String Render_type = "";
		double sx = 0;
		double sy = 0;
		double sz = 0;
		double range = 0;
		double x_dis = 0;
		double y_dis = 0;
		double z_dis = 0;
		double hardness = 0;
		double dis = 0;
		double BreakParticleVelo = 0;
		double rnd = 0;
		logic_gamerule = true;
		if (logic_gamerule) {
			Render_type = entity.getPersistentData().getString("render_type");
			range = Math.floor(entity.getPersistentData().getDouble("BlockRange") * 2);
			sx = Math.floor(x - entity.getPersistentData().getDouble("BlockRange"));
			for (int index0 = 0; index0 < (int) range; index0++) {
				x_dis = Math.pow(sx - x, 2);
				sy = Math.floor(y - entity.getPersistentData().getDouble("BlockRange") * 0.5);
				for (int index1 = 0; index1 < (int) range; index1++) {
					y_dis = Math.pow(sy - y, 2);
					sz = Math.floor(z - entity.getPersistentData().getDouble("BlockRange"));
					for (int index2 = 0; index2 < (int) range; index2++) {
						z_dis = Math.pow(sz - z, 2);
						hardness = world.getBlockState(BlockPos.containing(sx, sy, sz)).getDestroySpeed(world, BlockPos.containing(sx, sy, sz));
						block_a = (world.getBlockState(BlockPos.containing(x, y, z)));
						dis = Math.sqrt(x_dis + y_dis + z_dis);
						if (dis <= entity.getPersistentData().getDouble("BlockRange")) {
							if (world.getBlockState(BlockPos.containing(sx, sy, sz)).canOcclude()) {
								if (Math.random() < 0.8) {
									if ((Render_type).equals("ash")) {
										destroy_type = "replace";
										rnd = Math.random();
										if (rnd <= 0.3) {
											block_type = "netherrack";
										} else if (rnd <= 0.7) {
											block_type = "tuff";
										} else {
											block_type = "gravel";
										}
										if (world instanceof ServerLevel _level)
											_level.getServer().getCommands().performPrefixedCommand(
													new CommandSourceStack(CommandSource.NULL, new Vec3(sx, sy, sz), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
													(("setblock ~ ~ ~ " + block_type + " ") + "" + destroy_type));
									}
								}
							} else if (!world.getBlockState(BlockPos.containing(sx, sy, sz)).canOcclude()) {
								if (world.getBlockState(BlockPos.containing(sx, sy - 1, sz)).canOcclude()) {
									if ((Render_type).equals("ash") || (Render_type).equals("fire")) {
										if (Math.random() < 0.1) {
											destroy_type = "keep";
											block_type = "fire";
											if (world instanceof ServerLevel _level)
												_level.getServer().getCommands().performPrefixedCommand(
														new CommandSourceStack(CommandSource.NULL, new Vec3(sx, sy, sz), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
														(("setblock ~ ~ ~ " + block_type + " ") + "" + destroy_type));
										}
									}
								}
							}
							if ((world.getBlockState(BlockPos.containing(sx, sy, sz))).getBlock() == Blocks.WATER || (world.getBlockState(BlockPos.containing(sx, sy, sz))).getBlock() == Blocks.WATER) {
								if ((Render_type).equals("ice")) {
									destroy_type = "replace";
									block_type = "ice";
									if (world instanceof ServerLevel _level)
										_level.getServer().getCommands().performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, new Vec3(sx, sy, sz), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
												(("setblock ~ ~ ~ " + block_type + " ") + "" + destroy_type));
								}
							}
							if ((world.getBlockState(BlockPos.containing(sx, sy, sz))).getBlock() == Blocks.ICE) {
								if ((Render_type).equals("fire")) {
									destroy_type = "destroy";
									block_type = "water";
									world.getLevelData().getGameRules().getRule(GameRules.RULE_DOBLOCKDROPS).set(false, world.getServer());
									if (world instanceof ServerLevel _level)
										_level.getServer().getCommands().performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, new Vec3(sx, sy, sz), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
												(("setblock ~ ~ ~ " + block_type + " ") + "" + destroy_type));
									world.getLevelData().getGameRules().getRule(GameRules.RULE_DOBLOCKDROPS).set(true, world.getServer());
								}
							}
						}
						sz = sz + 1;
					}
					sy = sy + 1;
				}
				sx = sx + 1;
			}
		}
		entity.getPersistentData().putDouble("BlockRange", 0);
	}
}
