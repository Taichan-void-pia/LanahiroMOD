
package net.mcreator.ranahiromod.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import net.mcreator.ranahiromod.procedures.BarrierBreakerBarrierClickedProcedure;

public class BarrierBreakerItem extends Item {
	public BarrierBreakerItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.EPIC));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		BarrierBreakerBarrierClickedProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getPlayer());
		return InteractionResult.SUCCESS;
	}
}
