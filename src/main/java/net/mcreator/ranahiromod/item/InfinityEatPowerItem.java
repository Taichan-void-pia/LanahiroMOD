
package net.mcreator.ranahiromod.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class InfinityEatPowerItem extends Item {
	public InfinityEatPowerItem() {
		super(new Item.Properties().stacksTo(10).rarity(Rarity.EPIC));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}
}
