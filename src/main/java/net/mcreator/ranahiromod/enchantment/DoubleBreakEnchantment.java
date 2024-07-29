
package net.mcreator.ranahiromod.enchantment;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.entity.EquipmentSlot;

public class DoubleBreakEnchantment extends Enchantment {
	public DoubleBreakEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.RARE, EnchantmentCategory.DIGGER, slots);
	}

	@Override
	public int getMaxLevel() {
		return 10;
	}
}
