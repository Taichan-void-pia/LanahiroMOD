
package net.mcreator.ranahiromod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.ranahiromod.init.RanahiromodModItems;

public class PinkDiamondtPickaxeItem extends PickaxeItem {
	public PinkDiamondtPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 1741;
			}

			public float getSpeed() {
				return 30f;
			}

			public float getAttackDamageBonus() {
				return 6f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 56;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(RanahiromodModItems.PINK_DIAMOND.get()));
			}
		}, 1, -2.8f, new Item.Properties());
	}
}
