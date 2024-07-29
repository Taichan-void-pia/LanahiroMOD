
package net.mcreator.ranahiromod.item;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class WoodenShortSwordItem extends SwordItem {
	public WoodenShortSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 59;
			}

			public float getSpeed() {
				return 8f;
			}

			public float getAttackDamageBonus() {
				return -4f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 15;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Blocks.OAK_PLANKS), new ItemStack(Blocks.SPRUCE_PLANKS), new ItemStack(Blocks.BIRCH_PLANKS), new ItemStack(Blocks.JUNGLE_PLANKS), new ItemStack(Blocks.ACACIA_PLANKS),
						new ItemStack(Blocks.DARK_OAK_PLANKS), new ItemStack(Blocks.CRIMSON_PLANKS), new ItemStack(Blocks.WARPED_PLANKS), new ItemStack(Blocks.MANGROVE_PLANKS), new ItemStack(Blocks.CHERRY_PLANKS),
						new ItemStack(Blocks.BAMBOO_PLANKS));
			}
		}, 3, 96f, new Item.Properties());
	}
}
