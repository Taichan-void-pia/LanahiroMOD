package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;

import net.mcreator.ranahiromod.init.RanahiromodModItems;

public class SkillFossilaoi4Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double zPos = 0;
		double yPos = 0;
		double rad = 0;
		double rad_now = 0;
		double yaw_now = 0;
		double xPos = 0;
		double dis = 0;
		double yaw = 0;
		double pitch = 0;
		double yaw2 = 0;
		double pitch2 = 0;
		double xPos2 = 0;
		double yPos2 = 0;
		double zPos2 = 0;
		boolean logic_a = false;
		boolean logic_player = false;
		if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity) {
			dis = GetDistanceProcedure.execute(entity);
			if (dis < 6) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(RanahiromodModItems.FOSSILAOI_SWORD_ITEM.get()).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			} else {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(RanahiromodModItems.FOSSILAOI_BOW_ITEM.get()).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			}
		}
	}
}
