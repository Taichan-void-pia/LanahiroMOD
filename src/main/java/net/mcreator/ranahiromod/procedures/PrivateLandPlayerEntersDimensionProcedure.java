package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.ranahiromod.init.RanahiromodModBlocks;

public class PrivateLandPlayerEntersDimensionProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double x_pos = 0;
		boolean logic_a = false;
		if (entity instanceof Player && !(entity instanceof ServerPlayer _plr1 && _plr1.level() instanceof ServerLevel
				&& _plr1.getAdvancements().getOrStartProgress(_plr1.server.getAdvancements().getAdvancement(new ResourceLocation("ranahiromod:join_private"))).isDone())) {
			if (entity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("ranahiromod:join_private"));
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					for (String criteria : _ap.getRemainingCriteria())
						_player.getAdvancements().award(_adv, criteria);
				}
			}
			{
				Entity _ent = entity;
				_ent.teleportTo(0, 60, 0);
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport(0, 60, 0, _ent.getYRot(), _ent.getXRot());
			}
			x_pos = 0;
			while (true) {
				x_pos = x_pos + 60;
				if (!((world.getBlockState(BlockPos.containing(x_pos, 60, 0))).getBlock() == RanahiromodModBlocks.AIR_CONDITION_BLOCK.get())) {
					world.setBlock(BlockPos.containing(x_pos, 60, 0), RanahiromodModBlocks.AIR_CONDITION_BLOCK.get().defaultBlockState(), 3);
					logic_a = true;
					break;
				}
			}
			if (logic_a) {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x_pos, 60, 0);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putString("PlayerUUID", (entity.getStringUUID()));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("ranahiromod", "private_box"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x_pos + 1, 55, 1), BlockPos.containing(x_pos + 1, 55, 1), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
				{
					Entity _ent = entity;
					_ent.teleportTo((x_pos + 22), 60, 23);
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport((x_pos + 22), 60, 23, _ent.getYRot(), _ent.getXRot());
				}
			}
		} else if (entity instanceof Player) {
			{
				Entity _ent = entity;
				_ent.teleportTo(0, 60, 0);
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport(0, 60, 0, _ent.getYRot(), _ent.getXRot());
			}
			x_pos = 0;
			while (true) {
				x_pos = x_pos + 60;
				if ((world.getBlockState(BlockPos.containing(x_pos, 60, 0))).getBlock() == RanahiromodModBlocks.AIR_CONDITION_BLOCK.get() && (entity.getStringUUID()).equals(new Object() {
					public String getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getPersistentData().getString(tag);
						return "";
					}
				}.getValue(world, BlockPos.containing(x_pos, 60, 0), "PlayerUUID"))) {
					logic_a = true;
					break;
				}
			}
			if (logic_a) {
				{
					Entity _ent = entity;
					_ent.teleportTo((x_pos + 22), 60, 23);
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport((x_pos + 22), 60, 23, _ent.getYRot(), _ent.getXRot());
				}
			}
		}
	}
}
