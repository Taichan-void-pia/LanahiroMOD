package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class BlockDestroyProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		String destroy_type = "";
		BlockState block_a = Blocks.AIR.defaultBlockState();
		boolean logic_gamerule = false;
		boolean CanDestroy = false;
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
		logic_gamerule = true;
		if (logic_gamerule) {
			if (entity.getPersistentData().getBoolean("noParticle")) {
				destroy_type = "replace";
			} else {
				destroy_type = "destroy";
			}
			if (entity.getPersistentData().getDouble("BlockRange") == 0) {
				entity.getPersistentData().putDouble("BlockRange", 10);
				entity.getPersistentData().putDouble("BlockDamage", 100);
			}
			range = Math.floor(entity.getPersistentData().getDouble("BlockRange") * 2);
			sx = Math.floor(x - entity.getPersistentData().getDouble("BlockRange"));
			for (int index0 = 0; index0 < (int) range; index0++) {
				x_dis = Math.pow(sx - x, 2);
				sy = Math.floor(y - entity.getPersistentData().getDouble("BlockRange"));
				for (int index1 = 0; index1 < (int) range; index1++) {
					y_dis = Math.pow(sy - y, 2);
					sz = Math.floor(z - entity.getPersistentData().getDouble("BlockRange"));
					for (int index2 = 0; index2 < (int) range; index2++) {
						z_dis = Math.pow(sz - z, 2);
						hardness = world.getBlockState(BlockPos.containing(sx, sy, sz)).getDestroySpeed(world, BlockPos.containing(sx, sy, sz));
						block_a = (world.getBlockState(BlockPos.containing(x, y, z)));
						dis = Math.sqrt(x_dis + y_dis + z_dis);
						if (dis <= entity.getPersistentData().getDouble("BlockRange")) {
							world.getLevelData().getGameRules().getRule(GameRules.RULE_DOBLOCKDROPS).set(false, world.getServer());
							CanDestroy = hardness <= entity.getPersistentData().getDouble("BlockDamage") + 0.1;
							if (false) {
								CanDestroy = entity.getPersistentData().getDouble("BlockDamage") >= 0.5;
								BreakParticleVelo = Math.min(0.25 + entity.getPersistentData().getDouble("BlockDamage"), 1.5);
								if (world instanceof ServerLevel _level)
									_level.sendParticles(ParticleTypes.SPLASH, x, y, z, 2, 0.2, 0.2, 0.2, BreakParticleVelo);
								if (world instanceof ServerLevel _level)
									_level.sendParticles(ParticleTypes.BUBBLE, x, y, z, 2, 0.2, 0.2, 0.2, BreakParticleVelo);
								if (world instanceof ServerLevel _level)
									_level.sendParticles(ParticleTypes.CLOUD, x, y, z, 2, 0.2, 0.2, 0.2, BreakParticleVelo);
								if (dis * 0.5 <= entity.getPersistentData().getDouble("BlockRange") && CanDestroy) {
									if (world instanceof ServerLevel _level)
										_level.getServer().getCommands().performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, new Vec3(sx, sy, sz), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
												("setblock ~ ~ ~ air " + destroy_type));
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.splash.high_speed")), SoundSource.NEUTRAL,
													(float) Math.min(entity.getPersistentData().getDouble("BlockDamage") + 1, 5), 1);
										} else {
											_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.splash.high_speed")), SoundSource.NEUTRAL,
													(float) Math.min(entity.getPersistentData().getDouble("BlockDamage") + 1, 5), 1, false);
										}
									}
								}
							} else {
								if (CanDestroy) {
									if (world instanceof ServerLevel _level)
										_level.getServer().getCommands().performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, new Vec3(sx, sy, sz), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
												("setblock ~ ~ ~ air " + destroy_type));
								}
							}
						}
						sz = sz + 1;
					}
					sy = sy + 1;
				}
				sx = sx + 1;
			}
			world.getLevelData().getGameRules().getRule(GameRules.RULE_DOBLOCKDROPS).set(true, world.getServer());
		}
		entity.getPersistentData().putDouble("BlockRange", 0);
		entity.getPersistentData().putDouble("BlockDamage", 0);
		entity.getPersistentData().putBoolean("noParticle", false);
	}
}
