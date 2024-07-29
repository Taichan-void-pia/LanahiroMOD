package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.ranahiromod.init.RanahiromodModItems;

public class BarrierBreakerBarrierClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RanahiromodModItems.BARRIER_BREAKER.get()) {
			found = true;
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == RanahiromodModItems.BARRIER_BREAKER.get()) {
			found = true;
		}
		if (found) {
			sx = -1;
			for (int index0 = 0; index0 < 3; index0++) {
				sy = -1;
				for (int index1 = 0; index1 < 3; index1++) {
					sz = -1;
					for (int index2 = 0; index2 < 3; index2++) {
						if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.BARRIER) {
							world.destroyBlock(BlockPos.containing(x + sx, y + sy, z + sz), false);
						}
						sz = sz + 1;
					}
					sy = sy + 1;
				}
				sx = sx + 1;
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(RanahiromodModItems.BARRIER_BREAKER.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
	}
}
