package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.ranahiromod.init.RanahiromodModItems;

import java.util.Map;

public class SkillFossilaoi3Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double zPos = 0;
		double yPos = 0;
		double rad = 0;
		double rad_now = 0;
		double yaw_now = 0;
		double xPos = 0;
		double dis = 0;
		double yaw = 0;
		double pitch = 0;
		double yaw2 = 0;
		double pitch2 = 0;
		double xPos2 = 0;
		double yPos2 = 0;
		double zPos2 = 0;
		boolean logic_a = false;
		boolean logic_player = false;
		BlockState block_kinds = Blocks.AIR.defaultBlockState();
		entity.getPersistentData().putDouble("cnt1_water", (entity.getPersistentData().getDouble("cnt1_water") + 1));
		if (entity.getPersistentData().getDouble("cnt1_water") > 40) {
			if (entity.getPersistentData().getDouble("skill2") == 0) {
				if (!entity.onGround()) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(Items.WATER_BUCKET).copy();
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
					if (world.getBlockState(BlockPos.containing(x, y - 2, z)).canOcclude()) {
						{
							BlockPos _bp = BlockPos.containing(x, y, z);
							BlockState _bs = Blocks.WATER.defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
						entity.getPersistentData().putDouble("x_pos", x);
						entity.getPersistentData().putDouble("y_pos", y);
						entity.getPersistentData().putDouble("z_pos", z);
					}
				}
				if (entity.isInWater()) {
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = Blocks.AIR.defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						world.setBlock(_bp, _bs, 3);
					}
					{
						Entity _ent = entity;
						_ent.setYRot(entity.getYRot());
						_ent.setXRot(0);
						_ent.setYBodyRot(_ent.getYRot());
						_ent.setYHeadRot(_ent.getYRot());
						_ent.yRotO = _ent.getYRot();
						_ent.xRotO = _ent.getXRot();
						if (_ent instanceof LivingEntity _entity) {
							_entity.yBodyRotO = _entity.getYRot();
							_entity.yHeadRotO = _entity.getYRot();
						}
					}
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"fill ^-20 ^-3 ^-20 ^20 ^5 ^20 minecraft:air replace minecraft:water");
					entity.getPersistentData().putDouble("cnt2_water", 1);
				}
				if (entity.getPersistentData().getDouble("cnt2_water") >= 1) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(RanahiromodModItems.FOSSILAOI_SWORD_ITEM.get()).copy();
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
					entity.getPersistentData().putDouble("cnt1_water", 0);
					entity.getPersistentData().putDouble("cnt2_water", 0);
				}
			}
		} else {
			if (entity.onGround()) {
				entity.getPersistentData().putDouble("cnt1_water", 0);
				entity.getPersistentData().putDouble("cnt2_water", 0);
			}
		}
	}
}
