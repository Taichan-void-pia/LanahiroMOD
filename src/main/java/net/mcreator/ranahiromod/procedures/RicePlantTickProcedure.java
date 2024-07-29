package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.ranahiromod.init.RanahiromodModBlocks;

import java.util.Map;

public class RicePlantTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!world.isClientSide()) {
			if (Math.round(Math.random() * 9) == 5) {
				if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == RanahiromodModBlocks.RICE_PLANT_STAGE_0.get()) {
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = RanahiromodModBlocks.RICE_PLANT_STAGE_1.get().defaultBlockState();
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
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == RanahiromodModBlocks.RICE_PLANT_STAGE_1.get()) {
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = RanahiromodModBlocks.RICE_PLANT_STAGE_2.get().defaultBlockState();
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
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == RanahiromodModBlocks.RICE_PLANT_STAGE_2.get()) {
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = RanahiromodModBlocks.RICE_PLANT_STAGE_3.get().defaultBlockState();
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
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == RanahiromodModBlocks.RICE_PLANT_STAGE_3.get()) {
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = RanahiromodModBlocks.RICE_PLANT_STAGE_4.get().defaultBlockState();
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
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == RanahiromodModBlocks.RICE_PLANT_STAGE_4.get()) {
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = RanahiromodModBlocks.RICE_PLANT_STAGE_5.get().defaultBlockState();
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
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == RanahiromodModBlocks.RICE_PLANT_STAGE_5.get()) {
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = RanahiromodModBlocks.RICE_PLANT_STAGE_6.get().defaultBlockState();
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
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == RanahiromodModBlocks.RICE_PLANT_STAGE_6.get()) {
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = RanahiromodModBlocks.RICE_PLANT_STAGE_7.get().defaultBlockState();
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
				}
			}
		}
	}
}
