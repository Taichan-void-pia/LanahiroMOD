package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent;

import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.ranahiromod.init.RanahiromodModItems;
import net.mcreator.ranahiromod.init.RanahiromodModEnchantments;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class EatingMeatProcedure {
	@SubscribeEvent
	public static void onUseItemFinish(LivingEntityUseItemEvent.Finish event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity(), event.getItem());
		}
	}

	public static void execute(Entity entity, ItemStack itemstack) {
		execute(null, entity, itemstack);
	}

	private static void execute(@Nullable Event event, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (EnchantmentHelper.getItemEnchantmentLevel(RanahiromodModEnchantments.INFINITY_EAT.get(), itemstack) != 0) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = itemstack.copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		}
		if (!(EnchantmentHelper.getItemEnchantmentLevel(RanahiromodModEnchantments.INFINITY_EAT.get(), itemstack) != 0)) {
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(RanahiromodModItems.INFINITY_EAT_POWER.get())) : false) {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(RanahiromodModItems.INFINITY_EAT_POWER.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = itemstack.copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				itemstack.enchant(RanahiromodModEnchantments.INFINITY_EAT.get(), 53);
			}
		}
		if (itemstack.getItem() == Items.COOKED_BEEF || itemstack.getItem() == Items.COOKED_MUTTON || itemstack.getItem() == Items.COOKED_RABBIT || itemstack.getItem() == Items.COOKED_CHICKEN || itemstack.getItem() == Items.COOKED_PORKCHOP) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 100, Math.round((itemstack.getItem().isEdible() ? itemstack.getItem().getFoodProperties().getNutrition() : 0) / 2 - 1), false, false));
		}
		if (itemstack.getItem() == Items.ROTTEN_FLESH) {
			{
				Entity _ent = entity;
				if (!_ent.level().isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "execute as @e[distance=..30] run say \u3053\u306E\u4E2D\u306B\u8150\u8089\u3092\u98DF\u3063\u3066\u308B\u5974\u304C\u3044\u308B\uFF01");
				}
			}
		}
	}
}
