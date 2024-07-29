package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.ranahiromod.network.RanahiromodModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class RightClickPaperProcedure {
	@SubscribeEvent
	public static void onRightClickItem(PlayerInteractEvent.RightClickItem event) {
		if (event.getHand() != event.getEntity().getUsedItemHand())
			return;
		execute(event, event.getLevel(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double hour_time = 0;
		double minutes_time = 0;
		String text_2 = "";
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.PAPER) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal((Component.translatable("your.coordinate").getString() + "" + (("X:" + entity.getX()) + "," + (("Y:" + entity.getY()) + "," + ("Z:" + entity.getZ()))))), false);
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(Items.PAPER);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.COMPASS) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal((Component.translatable("your.coordinate").getString() + "" + (("X:" + entity.getX()) + "," + (("Y:" + entity.getY()) + "," + ("Z:" + entity.getZ()))))), false);
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.CLOCK) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal((Component.translatable("world.time").getString() + "" + world.dayTime())), false);
			hour_time = Math.floor(((world.dayTime() + 5000) - RanahiromodModVariables.MapVariables.get(world).world_share_hour) / 1000);
			if (hour_time >= 24) {
				RanahiromodModVariables.MapVariables.get(world).world_share_hour = world.dayTime() + 5000;
				RanahiromodModVariables.MapVariables.get(world).syncData(world);
				hour_time = 0;
			}
			minutes_time = Math.floor(((world.dayTime() + 255) - RanahiromodModVariables.MapVariables.get(world).world_share_minute) / 17);
			if (minutes_time >= 60) {
				RanahiromodModVariables.MapVariables.get(world).world_share_minute = world.dayTime() + 255;
				RanahiromodModVariables.MapVariables.get(world).syncData(world);
				minutes_time = 0;
			}
			text_2 = Component.translatable("world.time").getString() + "" + (Math.round(hour_time) + ":" + Math.round(minutes_time));
			if (minutes_time < 10) {
				text_2 = Component.translatable("world.time").getString() + "" + (Math.round(hour_time) + ":" + (Math.round(0) + "" + Math.round(minutes_time)));
			}
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(text_2), false);
		}
	}
}
