package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.level.BlockEvent;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.BlockTags;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class Mining3times3PerkProcedure {
	@SubscribeEvent
	public static void onBlockBreak(BlockEvent.BreakEvent event) {
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getPlayer());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		boolean found = false;
		boolean logic_notBreak = false;
		BlockState block_stats = Blocks.AIR.defaultBlockState();
		if (entity.isShiftKeyDown()) {
			if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
				if (entity instanceof ServerPlayer _plr2 && _plr2.level() instanceof ServerLevel
						&& _plr2.getAdvancements().getOrStartProgress(_plr2.server.getAdvancements().getAdvancement(new ResourceLocation("ranahiromod:mining_3times_3"))).isDone()) {
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.END_ROD, (x + 0.5), (y + 0.5), (z + 0.5), 10, 0, 0, 0, 0.1);
					if (entity.getXRot() > 40 || entity.getXRot() < -40) {
						block_stats = (world.getBlockState(BlockPos.containing(x + 1, y, z)));
						if (!(false || block_stats.is(BlockTags.create(new ResourceLocation("minecraft:portals"))) || false)) {
							BlockBreakPlayerFortuneProcedure.execute(world, x + 1, y, z, entity);
						}
						block_stats = (world.getBlockState(BlockPos.containing(x - 1, y, z)));
						if (!(false || block_stats.is(BlockTags.create(new ResourceLocation("minecraft:portals"))) || false)) {
							BlockBreakPlayerFortuneProcedure.execute(world, x - 1, y, z, entity);
						}
						block_stats = (world.getBlockState(BlockPos.containing(x + 1, y, z + 1)));
						if (!(false || block_stats.is(BlockTags.create(new ResourceLocation("minecraft:portals"))) || false)) {
							BlockBreakPlayerFortuneProcedure.execute(world, x + 1, y, z + 1, entity);
						}
						block_stats = (world.getBlockState(BlockPos.containing(x + 1, y, z - 1)));
						if (!(false || block_stats.is(BlockTags.create(new ResourceLocation("minecraft:portals"))) || false)) {
							BlockBreakPlayerFortuneProcedure.execute(world, x + 1, y, z - 1, entity);
						}
						block_stats = (world.getBlockState(BlockPos.containing(x - 1, y, z - 1)));
						if (!(false || block_stats.is(BlockTags.create(new ResourceLocation("minecraft:portals"))) || false)) {
							BlockBreakPlayerFortuneProcedure.execute(world, x - 1, y, z - 1, entity);
						}
						block_stats = (world.getBlockState(BlockPos.containing(x - 1, y, z + 1)));
						if (!(false || block_stats.is(BlockTags.create(new ResourceLocation("minecraft:portals"))) || false)) {
							BlockBreakPlayerFortuneProcedure.execute(world, x - 1, y, z + 1, entity);
						}
						block_stats = (world.getBlockState(BlockPos.containing(x, y, z + 1)));
						if (!(false || block_stats.is(BlockTags.create(new ResourceLocation("minecraft:portals"))) || false)) {
							BlockBreakPlayerFortuneProcedure.execute(world, x, y, z + 1, entity);
						}
						block_stats = (world.getBlockState(BlockPos.containing(x, y, z - 1)));
						if (!(false || block_stats.is(BlockTags.create(new ResourceLocation("minecraft:portals"))) || false)) {
							BlockBreakPlayerFortuneProcedure.execute(world, x, y, z - 1, entity);
						}
					} else if ((entity.getDirection()) == Direction.NORTH || (entity.getDirection()) == Direction.SOUTH) {
						block_stats = (world.getBlockState(BlockPos.containing(x + 1, y, z)));
						if (!(false || block_stats.is(BlockTags.create(new ResourceLocation("minecraft:portals"))) || false)) {
							BlockBreakPlayerFortuneProcedure.execute(world, x + 1, y, z, entity);
						}
						block_stats = (world.getBlockState(BlockPos.containing(x - 1, y, z)));
						if (!(false || block_stats.is(BlockTags.create(new ResourceLocation("minecraft:portals"))) || false)) {
							BlockBreakPlayerFortuneProcedure.execute(world, x - 1, y, z, entity);
						}
						block_stats = (world.getBlockState(BlockPos.containing(x + 1, y + 1, z)));
						if (!(false || block_stats.is(BlockTags.create(new ResourceLocation("minecraft:portals"))) || false)) {
							BlockBreakPlayerFortuneProcedure.execute(world, x + 1, y + 1, z, entity);
						}
						block_stats = (world.getBlockState(BlockPos.containing(x + 1, y - 1, z)));
						if (!(false || block_stats.is(BlockTags.create(new ResourceLocation("minecraft:portals"))) || false)) {
							BlockBreakPlayerFortuneProcedure.execute(world, x + 1, y - 1, z, entity);
						}
						block_stats = (world.getBlockState(BlockPos.containing(x - 1, y - 1, z)));
						if (!(false || block_stats.is(BlockTags.create(new ResourceLocation("minecraft:portals"))) || false)) {
							BlockBreakPlayerFortuneProcedure.execute(world, x - 1, y - 1, z, entity);
						}
						block_stats = (world.getBlockState(BlockPos.containing(x - 1, y + 1, z)));
						if (!(false || block_stats.is(BlockTags.create(new ResourceLocation("minecraft:portals"))) || false)) {
							BlockBreakPlayerFortuneProcedure.execute(world, x - 1, y + 1, z, entity);
						}
						block_stats = (world.getBlockState(BlockPos.containing(x, y + 1, z)));
						if (!(false || block_stats.is(BlockTags.create(new ResourceLocation("minecraft:portals"))) || false)) {
							BlockBreakPlayerFortuneProcedure.execute(world, x, y + 1, z, entity);
						}
						block_stats = (world.getBlockState(BlockPos.containing(x, y - 1, z)));
						if (!(false || block_stats.is(BlockTags.create(new ResourceLocation("minecraft:portals"))) || false)) {
							BlockBreakPlayerFortuneProcedure.execute(world, x, y - 1, z, entity);
						}
					} else if ((entity.getDirection()) == Direction.WEST || (entity.getDirection()) == Direction.EAST) {
						block_stats = (world.getBlockState(BlockPos.containing(x, y, z + 1)));
						if (!(false || block_stats.is(BlockTags.create(new ResourceLocation("minecraft:portals"))) || false)) {
							BlockBreakPlayerFortuneProcedure.execute(world, x, y, z + 1, entity);
						}
						block_stats = (world.getBlockState(BlockPos.containing(x, y, z - 1)));
						if (!(false || block_stats.is(BlockTags.create(new ResourceLocation("minecraft:portals"))) || false)) {
							BlockBreakPlayerFortuneProcedure.execute(world, x, y, z - 1, entity);
						}
						block_stats = (world.getBlockState(BlockPos.containing(x, y + 1, z + 1)));
						if (!(false || block_stats.is(BlockTags.create(new ResourceLocation("minecraft:portals"))) || false)) {
							BlockBreakPlayerFortuneProcedure.execute(world, x, y + 1, z + 1, entity);
						}
						block_stats = (world.getBlockState(BlockPos.containing(x, y - 1, z + 1)));
						if (!(false || block_stats.is(BlockTags.create(new ResourceLocation("minecraft:portals"))) || false)) {
							BlockBreakPlayerFortuneProcedure.execute(world, x, y - 1, z + 1, entity);
						}
						block_stats = (world.getBlockState(BlockPos.containing(x, y - 1, z - 1)));
						if (!(false || block_stats.is(BlockTags.create(new ResourceLocation("minecraft:portals"))) || false)) {
							BlockBreakPlayerFortuneProcedure.execute(world, x, y - 1, z - 1, entity);
						}
						block_stats = (world.getBlockState(BlockPos.containing(x, y + 1, z - 1)));
						if (!(false || block_stats.is(BlockTags.create(new ResourceLocation("minecraft:portals"))) || false)) {
							BlockBreakPlayerFortuneProcedure.execute(world, x, y + 1, z - 1, entity);
						}
						block_stats = (world.getBlockState(BlockPos.containing(x, y + 1, z)));
						if (!(false || block_stats.is(BlockTags.create(new ResourceLocation("minecraft:portals"))) || false)) {
							BlockBreakPlayerFortuneProcedure.execute(world, x, y + 1, z, entity);
						}
						block_stats = (world.getBlockState(BlockPos.containing(x, y - 1, z)));
						if (!(false || block_stats.is(BlockTags.create(new ResourceLocation("minecraft:portals"))) || false)) {
							BlockBreakPlayerFortuneProcedure.execute(world, x, y - 1, z, entity);
						}
					}
				}
			}
		}
	}
}
