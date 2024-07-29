package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.mcreator.ranahiromod.entity.WaterhiroEntity;

import java.util.Map;

public class StageCreateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean lava = false;
		boolean water = false;
		boolean logic_a = false;
		double rad = 0;
		double dis = 0;
		double xPos = 0;
		double yPos = 0;
		double zPos = 0;
		double tsuki7_mode = 0;
		for (int index0 = 0; index0 < 10; index0++) {
			if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("ranahiromod:ranahiro_tag")))) {
				if (entity instanceof WaterhiroEntity) {
					water = true;
				}
				entity.getPersistentData().putDouble("cnt1_r", (entity.getPersistentData().getDouble("cnt1_r") + 1));
				if (entity.getPersistentData().getDouble("cnt1_r") == 1) {
					entity.getPersistentData().putDouble("x_pos", x);
					entity.getPersistentData().putDouble("y_pos", y);
					entity.getPersistentData().putDouble("z_pos", z);
				}
				dis = entity.getPersistentData().getDouble("cnt1_r") / 2;
				for (int index1 = 0; index1 < 180; index1++) {
					rad = Math.toRadians(tsuki7_mode);
					xPos = entity.getPersistentData().getDouble("x_pos") + Math.cos(rad) * dis;
					yPos = entity.getPersistentData().getDouble("y_pos");
					zPos = entity.getPersistentData().getDouble("z_pos") + Math.sin(rad) * dis;
					tsuki7_mode = tsuki7_mode + 2;
					yPos = yPos - 1;
					logic_a = true;
					if (logic_a) {
						if (world.getBlockState(BlockPos.containing(xPos, yPos, zPos)).canOcclude()) {
							if (lava) {
								{
									BlockPos _bp = BlockPos.containing(xPos, yPos, zPos);
									BlockState _bs = Blocks.LAVA.defaultBlockState();
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
							} else if (water) {
								{
									BlockPos _bp = BlockPos.containing(xPos, yPos, zPos);
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
							}
						}
					}
				}
				if (entity.getPersistentData().getDouble("cnt1_r") >= 10) {
					entity.getPersistentData().putDouble("cnt1_r", 0);
				}
			}
		}
	}
}
