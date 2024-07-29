package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.tags.BlockTags;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.ranahiromod.init.RanahiromodModBlocks;

public class SkillDomainExpansionBattleProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		BlockState air_blockstate = Blocks.AIR.defaultBlockState();
		BlockState blockstate_now = Blocks.AIR.defaultBlockState();
		boolean noBarrier = false;
		boolean failed = false;
		boolean t = false;
		boolean logic_a = false;
		String outside = "";
		String inside = "";
		String floor = "";
		String old_block = "";
		double domain_num = 0;
		double range = 0;
		double x_pos = 0;
		double y_pos = 0;
		double z_pos = 0;
		double x_dis = 0;
		double y_dis = 0;
		double z_dis = 0;
		double dis = 0;
		double cnt1 = 0;
		double loop_num = 0;
		double cnt2 = 0;
		double y_floor = 0;
		double x_dis_p = 0;
		double y_dis_p = 0;
		double z_dis_p = 0;
		double dis_p = 0;
		outside = ForgeRegistries.BLOCKS.getKey(RanahiromodModBlocks.DOMAIN_BARRIER.get()).toString();
		inside = ForgeRegistries.BLOCKS.getKey(RanahiromodModBlocks.DOMAIN_BARRIER.get()).toString();
		floor = ForgeRegistries.BLOCKS.getKey(RanahiromodModBlocks.DOMAIN_BARRIER.get()).toString();
		air_blockstate = Blocks.AIR.defaultBlockState();
		if (entity.getPersistentData().getDouble("skill2_domain") > 0) {
			domain_num = entity.getPersistentData().getDouble("skill2_domain");
		} else {
			domain_num = entity.getPersistentData().getDouble("domain_select");
		}
		noBarrier = false;
		if (domain_num == 1) {
			if (entity.getPersistentData().getBoolean("domain_off")) {
				outside = ForgeRegistries.BLOCKS.getKey(air_blockstate.getBlock()).toString();
				inside = ForgeRegistries.BLOCKS.getKey(air_blockstate.getBlock()).toString();
				floor = ForgeRegistries.BLOCKS.getKey(air_blockstate.getBlock()).toString();
				noBarrier = true;
			} else {
				inside = ForgeRegistries.BLOCKS.getKey(RanahiromodModBlocks.DOMAIN_BARRIER.get()).toString();
				floor = ForgeRegistries.BLOCKS.getKey(RanahiromodModBlocks.DOMAIN_BARRIER.get()).toString();
			}
		}
		failed = entity.getPersistentData().getBoolean("failed") && !entity.getPersistentData().getBoolean("cover");
		if (failed) {
			if ((floor).equals(ForgeRegistries.BLOCKS.getKey(air_blockstate.getBlock()).toString())) {
				t = false;
			}
			range = 8;
			x_pos = Math.round(x - range);
			for (int index0 = 0; index0 < (int) Math.round(range * 2); index0++) {
				x_dis = Math.pow(Math.round(x) - x_pos, 2);
				y_pos = Math.round(y - range);
				for (int index1 = 0; index1 < (int) Math.round(range * 2); index1++) {
					y_dis = Math.pow(Math.round(y) - y_pos, 2);
					z_pos = Math.round(z - range);
					for (int index2 = 0; index2 < (int) Math.round(range * 2); index2++) {
						z_dis = Math.pow(Math.round(z) - z_pos, 2);
						if (Math.random() < 0.05) {
							blockstate_now = (world.getBlockState(BlockPos.containing(x_pos, y_pos, z_pos)));
							if (blockstate_now.is(BlockTags.create(new ResourceLocation("ranahiromod:barrier"))) && !(blockstate_now.getBlock() == RanahiromodModBlocks.AIR_BARIIER.get())) {
								outside = (("" + blockstate_now).replace("}", "")).replace("Block{", "");
								if (!(floor).equals(outside)) {
									logic_a = false;
									dis = Math.sqrt(x_dis + y_dis + z_dis);
									if (dis < 2) {
										logic_a = true;
									} else if (!(floor).equals((("" + world.getBlockState(BlockPos.containing(x_pos + 1, y_pos + 0, z_pos + 0))).replace("}", "")).replace("Block{", ""))
											&& !(floor).equals((("" + world.getBlockState(BlockPos.containing(x_pos + -1, y_pos + 0, z_pos + 0))).replace("}", "")).replace("Block{", ""))) {
										if (!(floor).equals((("" + world.getBlockState(BlockPos.containing(x_pos + 0, y_pos + 1, z_pos + 0))).replace("}", "")).replace("Block{", ""))
												&& !(floor).equals((("" + world.getBlockState(BlockPos.containing(x_pos + 0, y_pos + -1, z_pos + 0))).replace("}", "")).replace("Block{", ""))) {
											if (!(floor).equals((("" + world.getBlockState(BlockPos.containing(x_pos + 0, y_pos + 0, z_pos + 1))).replace("}", "")).replace("Block{", ""))
													&& !(floor).equals((("" + world.getBlockState(BlockPos.containing(x_pos + 0, y_pos + 0, z_pos + -1))).replace("}", "")).replace("Block{", ""))) {
												logic_a = true;
											}
										} else {
											logic_a = true;
										}
									} else {
										logic_a = true;
									}
									if (logic_a) {
										cnt1 = new Object() {
											public double getValue(LevelAccessor world, BlockPos pos, String tag) {
												BlockEntity blockEntity = world.getBlockEntity(pos);
												if (blockEntity != null)
													return blockEntity.getPersistentData().getDouble(tag);
												return -1;
											}
										}.getValue(world, BlockPos.containing(x_pos, y_pos, z_pos), "cnt");
										old_block = new Object() {
											public String getValue(LevelAccessor world, BlockPos pos, String tag) {
												BlockEntity blockEntity = world.getBlockEntity(pos);
												if (blockEntity != null)
													return blockEntity.getPersistentData().getString(tag);
												return "";
											}
										}.getValue(world, BlockPos.containing(x_pos, y_pos, z_pos), "old_block");
										if (world instanceof ServerLevel _level)
											_level.getServer().getCommands().performPrefixedCommand(
													new CommandSourceStack(CommandSource.NULL, new Vec3(x_pos, y_pos, z_pos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
													("setblock ~ ~ ~ " + floor));
										if (!world.isClientSide()) {
											BlockPos _bp = BlockPos.containing(x_pos, y_pos, z_pos);
											BlockEntity _blockEntity = world.getBlockEntity(_bp);
											BlockState _bs = world.getBlockState(_bp);
											if (_blockEntity != null)
												_blockEntity.getPersistentData().putDouble("cnt", cnt1);
											if (world instanceof Level _level)
												_level.sendBlockUpdated(_bp, _bs, _bs, 3);
										}
										if (!world.isClientSide()) {
											BlockPos _bp = BlockPos.containing(x_pos, y_pos, z_pos);
											BlockEntity _blockEntity = world.getBlockEntity(_bp);
											BlockState _bs = world.getBlockState(_bp);
											if (_blockEntity != null)
												_blockEntity.getPersistentData().putString("old_block", old_block);
											if (world instanceof Level _level)
												_level.sendBlockUpdated(_bp, _bs, _bs, 3);
										}
									}
									if (world instanceof ServerLevel _level)
										_level.sendParticles(ParticleTypes.FLASH, x_pos, y_pos, z_pos, 1, 0.25, 0.25, 0.25, 1);
									if (Math.random() < 0.05) {
										world.levelEvent(2001, BlockPos.containing(x_pos, y_pos, z_pos), Block.getId(blockstate_now));
									}
								}
							}
						}
						z_pos = z_pos + 1;
					}
					y_pos = y_pos + 1;
				}
				x_pos = x_pos + 1;
			}
		}
		if (!failed) {
			range = 25;
			loop_num = Math.round(range * 2 + 1);
			if (entity.getPersistentData().getBoolean("Cover")) {
				cnt1 = Math.ceil((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) * 0.05);
				cnt2 = entity.getPersistentData().getDouble("cnt_cover");
			} else {
				cnt1 = 0;
				cnt2 = entity.getPersistentData().getDouble("cnt1");
			}
			y_floor = entity.getPersistentData().getDouble("y_pos_domain") - 1;
			x_pos = Math.round(x) - range;
			for (int index3 = 0; index3 < (int) loop_num; index3++) {
				x_dis = Math.pow(x_pos - Math.round(x), 2);
				x_dis_p = Math.pow(x_pos - Math.round(entity.getPersistentData().getDouble("x_pos_domain2")), 2);
				if (Math.sqrt(x_dis_p) <= cnt2) {
					y_pos = Math.round(y) - range;
					for (int index4 = 0; index4 < (int) loop_num; index4++) {
						y_dis = Math.pow(y_pos - Math.round(y), 2);
						y_dis_p = Math.pow(y_pos - Math.round(entity.getPersistentData().getDouble("y_pos_domain2")), 2);
						if (Math.sqrt(y_dis_p) <= cnt2 && y_pos >= -64 && y_pos <= 320) {
							z_pos = Math.round(z) - range;
							for (int index5 = 0; index5 < (int) loop_num; index5++) {
								z_dis = Math.pow(z_pos - Math.round(z), 2);
								z_dis_p = Math.pow(z_pos - Math.round(entity.getPersistentData().getDouble("z_pos_domain2")), 2);
								if (Math.sqrt(z_dis_p) <= cnt2) {
									dis_p = Math.sqrt(x_dis_p + y_dis_p + z_dis_p);
									if (dis_p <= cnt2 + 0 && dis_p >= cnt2 - 1) {
										dis = Math.sqrt(x_dis + y_dis + z_dis);
										if (dis < range + 0.5) {
											blockstate_now = (world.getBlockState(BlockPos.containing(x_pos, y_pos, z_pos)));
											if (blockstate_now.is(BlockTags.create(new ResourceLocation("ranahiromod:barrier")))) {
												old_block = new Object() {
													public String getValue(LevelAccessor world, BlockPos pos, String tag) {
														BlockEntity blockEntity = world.getBlockEntity(pos);
														if (blockEntity != null)
															return blockEntity.getPersistentData().getString(tag);
														return "";
													}
												}.getValue(world, BlockPos.containing(x_pos, y_pos, z_pos), "old_block");
											} else {
												old_block = (("" + blockstate_now).replace("}", "")).replace("Block{", "");
											}
											if (noBarrier) {
												if (blockstate_now.is(BlockTags.create(new ResourceLocation("ranahiromod:barrier")))) {
													if (y_pos <= y_floor) {
														if (world instanceof ServerLevel _level)
															_level.getServer().getCommands().performPrefixedCommand(
																	new CommandSourceStack(CommandSource.NULL, new Vec3(x_pos, y_pos, z_pos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
																	("setblock ~ ~ ~ " + old_block));
													} else {
														if (world instanceof ServerLevel _level)
															_level.getServer().getCommands().performPrefixedCommand(
																	new CommandSourceStack(CommandSource.NULL, new Vec3(x_pos, y_pos, z_pos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
																	("setblock ~ ~ ~ " + inside));
													}
												}
											} else {
												logic_a = false;
												if (blockstate_now.is(BlockTags.create(new ResourceLocation("ranahiromod:barrier")))) {
													logic_a = true;
												} else if (y_pos > y_floor - 1) {
													logic_a = true;
												} else if (world.getBlockState(BlockPos.containing(x_pos, y_pos, z_pos)).canOcclude()) {
													logic_a = true;
												} else if (!world.getBlockState(BlockPos.containing(x_pos + 1, y_pos, z_pos)).canOcclude() && !world.getBlockState(BlockPos.containing(x_pos - 1, y_pos, z_pos)).canOcclude()) {
													if (!world.getBlockState(BlockPos.containing(x_pos, y_pos + 1, z_pos)).canOcclude() && !world.getBlockState(BlockPos.containing(x_pos, y_pos - 1, z_pos)).canOcclude()) {
														if (world.getBlockState(BlockPos.containing(x_pos, y_pos, z_pos + 1)).canOcclude() || world.getBlockState(BlockPos.containing(x_pos, y_pos, z_pos - 1)).canOcclude()) {
															logic_a = true;
														}
													} else {
														logic_a = true;
													}
												} else {
													logic_a = true;
												}
												if (logic_a) {
													if (dis < range + 0.5 && dis >= range - 1) {
														if (world instanceof ServerLevel _level)
															_level.getServer().getCommands().performPrefixedCommand(
																	new CommandSourceStack(CommandSource.NULL, new Vec3(x_pos, y_pos, z_pos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
																	("setblock ~ ~ ~ " + outside));
													} else if (dis < range - 1 && dis >= range - 2) {
														if (world instanceof ServerLevel _level)
															_level.getServer().getCommands().performPrefixedCommand(
																	new CommandSourceStack(CommandSource.NULL, new Vec3(x_pos, y_pos, z_pos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
																	("setblock ~ ~ ~ " + inside));
													} else if (y_pos <= y_floor && true) {
														if (world instanceof ServerLevel _level)
															_level.getServer().getCommands().performPrefixedCommand(
																	new CommandSourceStack(CommandSource.NULL, new Vec3(x_pos, y_pos, z_pos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
																	("setblock ~ ~ ~ " + floor));
													} else if (world.getBlockState(BlockPos.containing(x_pos, y_pos, z_pos)).canOcclude() && !(blockstate_now.getBlock() == RanahiromodModBlocks.AIR_BARIIER.get())) {
														logic_a = false;
													} else {
														if (world instanceof ServerLevel _level)
															_level.getServer().getCommands().performPrefixedCommand(
																	new CommandSourceStack(CommandSource.NULL, new Vec3(x_pos, y_pos, z_pos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
																	("setblock ~ ~ ~ " + ForgeRegistries.BLOCKS.getKey(RanahiromodModBlocks.AIR_BARIIER.get()).toString()));
													}
												}
											}
											if (logic_a) {
												if (!world.isClientSide()) {
													BlockPos _bp = BlockPos.containing(x_pos, y_pos, z_pos);
													BlockEntity _blockEntity = world.getBlockEntity(_bp);
													BlockState _bs = world.getBlockState(_bp);
													if (_blockEntity != null)
														_blockEntity.getPersistentData().putDouble("cnt", cnt1);
													if (world instanceof Level _level)
														_level.sendBlockUpdated(_bp, _bs, _bs, 3);
												}
												if (!world.isClientSide()) {
													BlockPos _bp = BlockPos.containing(x_pos, y_pos, z_pos);
													BlockEntity _blockEntity = world.getBlockEntity(_bp);
													BlockState _bs = world.getBlockState(_bp);
													if (_blockEntity != null)
														_blockEntity.getPersistentData().putString("old_block", old_block);
													if (world instanceof Level _level)
														_level.sendBlockUpdated(_bp, _bs, _bs, 3);
												}
											}
										}
									}
								}
								z_pos = z_pos + 1;
							}
						}
						y_pos = y_pos + 1;
					}
				}
				x_pos = x_pos + 1;
			}
		}
	}
}
