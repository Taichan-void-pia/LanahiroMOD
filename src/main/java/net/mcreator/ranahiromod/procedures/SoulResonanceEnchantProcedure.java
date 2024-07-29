package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;

import net.mcreator.ranahiromod.init.RanahiromodModEnchantments;

import javax.annotation.Nullable;

import java.util.concurrent.atomic.AtomicReference;

@Mod.EventBusSubscriber
public class SoulResonanceEnchantProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity());
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		ItemStack armor_item1 = ItemStack.EMPTY;
		ItemStack armor_item2 = ItemStack.EMPTY;
		ItemStack armor_item3 = ItemStack.EMPTY;
		ItemStack armor_item0 = ItemStack.EMPTY;
		boolean logic_do = false;
		double Level = 0;
		double level_math = 0;
		double look_z = 0;
		double itemNum = 0;
		double look_y = 0;
		double look_x = 0;
		double loopNum = 0;
		double dis = 0;
		if (EnchantmentHelper.getItemEnchantmentLevel(RanahiromodModEnchantments.SOUL_POWER.get(), (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)) != 0
				|| EnchantmentHelper.getItemEnchantmentLevel(RanahiromodModEnchantments.SOUL_POWER.get(), (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY)) != 0
				|| EnchantmentHelper.getItemEnchantmentLevel(RanahiromodModEnchantments.SOUL_POWER.get(), (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY)) != 0
				|| EnchantmentHelper.getItemEnchantmentLevel(RanahiromodModEnchantments.SOUL_POWER.get(), (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)) != 0) {
			logic_do = true;
		}
		for (int index0 = 0; index0 < 36; index0++) {
			if (EnchantmentHelper.getItemEnchantmentLevel(RanahiromodModEnchantments.SOUL_POWER.get(), (new Object() {
				public ItemStack getItemStack(int sltid, Entity entity) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).copy());
					});
					return _retval.get();
				}
			}.getItemStack((int) level_math, entity))) != 0) {
				logic_do = true;
			}
			level_math = level_math + 1;
		}
		if (logic_do) {
			entity.getPersistentData().putBoolean("SoulResonance", true);
			world.getLevelData().getGameRules().getRule(GameRules.RULE_KEEPINVENTORY).set(true, world.getServer());
		}
	}
}
