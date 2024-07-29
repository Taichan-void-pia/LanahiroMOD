
package net.mcreator.ranahiromod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.ranahiromod.init.RanahiromodModItems;

public class Topaz_toolShovelItem extends ShovelItem {
	public Topaz_toolShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 1164;
			}

			public float getSpeed() {
				return 12f;
			}

			public float getAttackDamageBonus() {
				return 4f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 42;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(RanahiromodModItems.TOPAZ.get()));
			}
		}, 1, -3f, new Item.Properties());
	}
}
