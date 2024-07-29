
package net.mcreator.ranahiromod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class GoldenShortSwordItem extends SwordItem {
	public GoldenShortSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 32;
			}

			public float getSpeed() {
				return 12f;
			}

			public float getAttackDamageBonus() {
				return -4f;
			}

			public int getLevel() {
				return 0;
			}

			public int getEnchantmentValue() {
				return 22;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.GOLD_INGOT));
			}
		}, 3, 96f, new Item.Properties());
	}
}
