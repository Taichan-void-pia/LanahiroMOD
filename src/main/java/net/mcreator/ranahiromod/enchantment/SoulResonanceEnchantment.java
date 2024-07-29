
package net.mcreator.ranahiromod.enchantment;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.entity.EquipmentSlot;

public class SoulResonanceEnchantment extends Enchantment {
	public SoulResonanceEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.RARE, EnchantmentCategory.ARMOR, slots);
	}

	@Override
	public boolean isTreasureOnly() {
		return true;
	}
}
