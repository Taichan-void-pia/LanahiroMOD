package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.ranahiromod.init.RanahiromodModItems;

public class SkillHorosha2Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		boolean logic_a = false;
		double zPos = 0;
		double yPos = 0;
		double xPos = 0;
		double dmg = 0;
		double dis = 0;
		double rad = 0;
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
			if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(3, new ItemStack(RanahiromodModItems.HOROSHA_BACK_ARMOR.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(RanahiromodModItems.HOROSHA_BACK_ARMOR.get()));
					}
				}
			}
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal((Component.translatable("on.armor.chest").getString())), false);
		}
		entity.getPersistentData().putDouble("skill2", 0);
	}
}
