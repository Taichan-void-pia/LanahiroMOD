package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.BonemealEvent;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.core.BlockPos;

import net.mcreator.ranahiromod.init.RanahiromodModBlocks;

import javax.annotation.Nullable;

import java.util.Map;

@Mod.EventBusSubscriber
public class BonemealUsedBlockProcedure {
	@SubscribeEvent
	public static void onBonemeal(BonemealEvent event) {
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getEntity(), event.getStack());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		execute(null, world, x, y, z, entity, itemstack);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double random = 0;
		if (!world.isClientSide()) {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == RanahiromodModBlocks.RICE_PLANT_STAGE_0.get() || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == RanahiromodModBlocks.RICE_PLANT_STAGE_1.get()
					|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == RanahiromodModBlocks.RICE_PLANT_STAGE_2.get() || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == RanahiromodModBlocks.RICE_PLANT_STAGE_3.get()
					|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == RanahiromodModBlocks.RICE_PLANT_STAGE_4.get() || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == RanahiromodModBlocks.RICE_PLANT_STAGE_5.get()
					|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == RanahiromodModBlocks.RICE_PLANT_STAGE_6.get()) {
				if (itemstack.getItem() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
				} else if (itemstack.getItem() == (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem()) {
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.OFF_HAND, true);
				}
				if (event != null && event.hasResult()) {
					event.setResult(Event.Result.ALLOW);
				}
				if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == RanahiromodModBlocks.RICE_PLANT_STAGE_6.get()) {
					random = Math.ceil(Math.random() * 1);
					if (random == 1) {
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
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == RanahiromodModBlocks.RICE_PLANT_STAGE_5.get()) {
					random = Math.ceil(Math.random() * 2);
					if (random == 1) {
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
					} else if (random == 2) {
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
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == RanahiromodModBlocks.RICE_PLANT_STAGE_4.get()) {
					random = Math.ceil(Math.random() * 3);
					if (random == 1) {
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
					} else if (random == 2) {
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
					} else if (random == 3) {
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
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == RanahiromodModBlocks.RICE_PLANT_STAGE_3.get()) {
					random = Math.ceil(Math.random() * 3);
					if (random == 1) {
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
					} else if (random == 2) {
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
					} else if (random == 3) {
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
					}
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == RanahiromodModBlocks.RICE_PLANT_STAGE_2.get()) {
					random = Math.ceil(Math.random() * 3);
					if (random == 1) {
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
					} else if (random == 2) {
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
					} else if (random == 3) {
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
					}
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == RanahiromodModBlocks.RICE_PLANT_STAGE_1.get()) {
					random = Math.ceil(Math.random() * 3);
					if (random == 1) {
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
					} else if (random == 2) {
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
					} else if (random == 3) {
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
					}
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == RanahiromodModBlocks.RICE_PLANT_STAGE_0.get()) {
					random = Math.ceil(Math.random() * 4);
					if (random == 1) {
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
					} else if (random == 2) {
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
					} else if (random == 3) {
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
					} else if (random == 4) {
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
					}
				}
			}
		}
	}
}
