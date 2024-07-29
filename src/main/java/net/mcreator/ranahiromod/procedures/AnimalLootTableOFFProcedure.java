package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import java.util.concurrent.atomic.AtomicReference;

public class AnimalLootTableOFFProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double num1 = 0;
		ItemStack itemstack_copy_registry = ItemStack.EMPTY;
		String text_view = "";
		num1 = 0;
		for (int index0 = 0; index0 < 36; index0++) {
			if (!(entity instanceof ServerPlayer _plr0 && _plr0.level() instanceof ServerLevel && _plr0.getAdvancements().getOrStartProgress(_plr0.server.getAdvancements().getAdvancement(new ResourceLocation("ranahiromod:pig_kill_100"))).isDone())) {
				if ((new Object() {
					public ItemStack getItemStack(int sltid, Entity entity) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
						return _retval.get();
					}
				}.getItemStack((int) num1, entity)).getItem() == Items.PORKCHOP) {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal(("\u00A7c" + "\u8CB4\u69D8\u306B\u8DB3\u308A\u306A\u3044\u3082\u306E\u306F\u3001\u8C5A\u8089\u3092\u98DF\u3079\u308B\u4FE1\u5FF5\u304C\u8DB3\u308A\u3093\uFF01")), false);
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "clear @s minecraft:porkchop");
						}
					}
					break;
				}
				if ((new Object() {
					public ItemStack getItemStack(int sltid, Entity entity) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
						return _retval.get();
					}
				}.getItemStack((int) num1, entity)).getItem() == Items.COOKED_PORKCHOP) {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal(("\u00A7c" + "\u8CB4\u69D8\u306B\u8DB3\u308A\u306A\u3044\u3082\u306E\u306F\u3001\u8C5A\u8089\u3092\u98DF\u3079\u308B\u4FE1\u5FF5\u304C\u8DB3\u308A\u3093\uFF01")), false);
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "clear @s minecraft:cooked_porkchop");
						}
					}
					break;
				}
			}
			if (!(entity instanceof ServerPlayer _plr9 && _plr9.level() instanceof ServerLevel
					&& _plr9.getAdvancements().getOrStartProgress(_plr9.server.getAdvancements().getAdvancement(new ResourceLocation("ranahiromod:chicken_kill_100"))).isDone())) {
				if ((new Object() {
					public ItemStack getItemStack(int sltid, Entity entity) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
						return _retval.get();
					}
				}.getItemStack((int) num1, entity)).getItem() == Items.CHICKEN) {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal(("\u00A7c" + "\u8CB4\u69D8\u306B\u8DB3\u308A\u306A\u3044\u3082\u306E\u306F\u3001\u9D8F\u8089\u3092\u98DF\u3079\u308B\u4FE1\u5FF5\u304C\u8DB3\u308A\u3093\uFF01")), false);
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "clear @s minecraft:chicken");
						}
					}
					break;
				}
				if ((new Object() {
					public ItemStack getItemStack(int sltid, Entity entity) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
						return _retval.get();
					}
				}.getItemStack((int) num1, entity)).getItem() == Items.COOKED_CHICKEN) {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal(("\u00A7c" + "\u8CB4\u69D8\u306B\u8DB3\u308A\u306A\u3044\u3082\u306E\u306F\u3001\u9D8F\u8089\u3092\u98DF\u3079\u308B\u4FE1\u5FF5\u304C\u8DB3\u308A\u3093\uFF01")), false);
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "clear @s minecraft:cooked_chicken");
						}
					}
					break;
				}
			}
			if (!(entity instanceof ServerPlayer _plr18 && _plr18.level() instanceof ServerLevel
					&& _plr18.getAdvancements().getOrStartProgress(_plr18.server.getAdvancements().getAdvancement(new ResourceLocation("ranahiromod:sheep_kill_100"))).isDone())) {
				if ((new Object() {
					public ItemStack getItemStack(int sltid, Entity entity) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
						return _retval.get();
					}
				}.getItemStack((int) num1, entity)).getItem() == Items.MUTTON) {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal(("\u00A7c" + "\u8CB4\u69D8\u306B\u8DB3\u308A\u306A\u3044\u3082\u306E\u306F\u3001\u7F8A\u8089\u3092\u98DF\u3079\u308B\u4FE1\u5FF5\u304C\u8DB3\u308A\u3093\uFF01")), false);
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "clear @s minecraft:mutton");
						}
					}
					break;
				}
				if ((new Object() {
					public ItemStack getItemStack(int sltid, Entity entity) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
						return _retval.get();
					}
				}.getItemStack((int) num1, entity)).getItem() == Items.COOKED_MUTTON) {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal(("\u00A7c" + "\u8CB4\u69D8\u306B\u8DB3\u308A\u306A\u3044\u3082\u306E\u306F\u3001\u7F8A\u8089\u3092\u98DF\u3079\u308B\u4FE1\u5FF5\u304C\u8DB3\u308A\u3093\uFF01")), false);
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "clear @s minecraft:cooked_mutton");
						}
					}
					break;
				}
			}
			if (!(entity instanceof ServerPlayer _plr27 && _plr27.level() instanceof ServerLevel
					&& _plr27.getAdvancements().getOrStartProgress(_plr27.server.getAdvancements().getAdvancement(new ResourceLocation("ranahiromod:rabbit_kill_100"))).isDone())) {
				if ((new Object() {
					public ItemStack getItemStack(int sltid, Entity entity) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
						return _retval.get();
					}
				}.getItemStack((int) num1, entity)).getItem() == Items.RABBIT) {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal(("\u00A7c" + "\u8CB4\u69D8\u306B\u8DB3\u308A\u306A\u3044\u3082\u306E\u306F\u3001\u514E\u8089\u3092\u98DF\u3079\u308B\u4FE1\u5FF5\u304C\u8DB3\u308A\u3093\uFF01")), false);
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "clear @s minecraft:rabbit");
						}
					}
					break;
				}
				if ((new Object() {
					public ItemStack getItemStack(int sltid, Entity entity) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
						return _retval.get();
					}
				}.getItemStack((int) num1, entity)).getItem() == Items.COOKED_RABBIT) {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal(("\u00A7c" + "\u8CB4\u69D8\u306B\u8DB3\u308A\u306A\u3044\u3082\u306E\u306F\u3001\u514E\u8089\u3092\u98DF\u3079\u308B\u4FE1\u5FF5\u304C\u8DB3\u308A\u3093\uFF01")), false);
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "clear @s minecraft:cooked_rabbit");
						}
					}
					break;
				}
			}
			if (!(entity instanceof ServerPlayer _plr36 && _plr36.level() instanceof ServerLevel
					&& _plr36.getAdvancements().getOrStartProgress(_plr36.server.getAdvancements().getAdvancement(new ResourceLocation("ranahiromod:cowkill_100"))).isDone())) {
				if ((new Object() {
					public ItemStack getItemStack(int sltid, Entity entity) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
						return _retval.get();
					}
				}.getItemStack((int) num1, entity)).getItem() == Items.BEEF) {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal(("\u00A7c" + "\u8CB4\u69D8\u306B\u8DB3\u308A\u306A\u3044\u3082\u306E\u306F\u3001\u725B\u8089\u3092\u98DF\u3079\u308B\u4FE1\u5FF5\u304C\u8DB3\u308A\u3093\uFF01")), false);
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "clear @s minecraft:beef");
						}
					}
					break;
				}
				if ((new Object() {
					public ItemStack getItemStack(int sltid, Entity entity) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
						return _retval.get();
					}
				}.getItemStack((int) num1, entity)).getItem() == Items.COOKED_BEEF) {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal(("\u00A7c" + "\u8CB4\u69D8\u306B\u8DB3\u308A\u306A\u3044\u3082\u306E\u306F\u3001\u725B\u8089\u3092\u98DF\u3079\u308B\u4FE1\u5FF5\u304C\u8DB3\u308A\u3093\uFF01")), false);
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "clear @s minecraft:cooked_beef");
						}
					}
					break;
				}
			}
			if (!(entity instanceof ServerPlayer _plr45 && _plr45.level() instanceof ServerLevel
					&& _plr45.getAdvancements().getOrStartProgress(_plr45.server.getAdvancements().getAdvancement(new ResourceLocation("ranahiromod:catch_fish_1000"))).isDone())) {
				itemstack_copy_registry = (new Object() {
					public ItemStack getItemStack(int sltid, Entity entity) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
						return _retval.get();
					}
				}.getItemStack((int) num1, entity));
				text_view = "\u00A7c" + "\u8CB4\u69D8\u306B\u8DB3\u308A\u306A\u3044\u3082\u306E\u306F\u3001\u9B5A\u3092\u98DF\u3079\u308B\u4FE1\u5FF5\u304C\u8DB3\u308A\u3093\uFF01";
				if (itemstack_copy_registry.getItem() == Items.COD) {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal(text_view), false);
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "clear @s minecraft:cod");
						}
					}
					break;
				}
				if (itemstack_copy_registry.getItem() == Items.SALMON) {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal(text_view), false);
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "clear @s minecraft:salmon");
						}
					}
					break;
				}
				if (itemstack_copy_registry.getItem() == Items.TROPICAL_FISH) {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal(text_view), false);
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "clear @s minecraft:tropical_fish");
						}
					}
					break;
				}
				if (itemstack_copy_registry.getItem() == Items.PUFFERFISH) {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal(text_view), false);
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "clear @s minecraft:pufferfish");
						}
					}
					break;
				}
				if (itemstack_copy_registry.getItem() == Items.COOKED_COD) {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal(text_view), false);
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "clear @s minecraft:cooked_cod");
						}
					}
					break;
				}
				if (itemstack_copy_registry.getItem() == Items.COOKED_SALMON) {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal(text_view), false);
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "clear @s minecraft:cooked_salmon");
						}
					}
					break;
				}
			}
			if (!(entity instanceof ServerPlayer _plr65 && _plr65.level() instanceof ServerLevel
					&& _plr65.getAdvancements().getOrStartProgress(_plr65.server.getAdvancements().getAdvancement(new ResourceLocation("ranahiromod:carrot_pickup_1000"))).isDone())) {
				if ((new Object() {
					public ItemStack getItemStack(int sltid, Entity entity) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
						return _retval.get();
					}
				}.getItemStack((int) num1, entity)).getItem() == Items.CARROT) {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal(("\u00A7c" + "\u8CB4\u69D8\u306B\u8DB3\u308A\u306A\u3044\u3082\u306E\u306F\u3001\u30CB\u30F3\u30B8\u30F3\u3092\u98DF\u3079\u308B\u4FE1\u5FF5\u304C\u8DB3\u308A\u3093\uFF01")),
								false);
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "clear @s minecraft:carrot");
						}
					}
					break;
				}
				if ((new Object() {
					public ItemStack getItemStack(int sltid, Entity entity) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
						return _retval.get();
					}
				}.getItemStack((int) num1, entity)).getItem() == Items.GOLDEN_CARROT) {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(
								Component.literal(("\u00A7c" + "\u8CB4\u69D8\u306B\u8DB3\u308A\u306A\u3044\u3082\u306E\u306F\u3001\u91D1\u30CB\u30F3\u30B8\u30F3\u3092\u98DF\u3079\u308B\u4FE1\u5FF5\u304C\u8DB3\u308A\u3093\uFF01")), false);
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "clear @s minecraft:golden_carrot");
						}
					}
					break;
				}
			}
			if (!(entity instanceof ServerPlayer _plr74 && _plr74.level() instanceof ServerLevel
					&& _plr74.getAdvancements().getOrStartProgress(_plr74.server.getAdvancements().getAdvancement(new ResourceLocation("ranahiromod:potato_pickup_1000"))).isDone())) {
				if ((new Object() {
					public ItemStack getItemStack(int sltid, Entity entity) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
						return _retval.get();
					}
				}.getItemStack((int) num1, entity)).getItem() == Items.POTATO) {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal(("\u00A7c" + "\u8CB4\u69D8\u306B\u8DB3\u308A\u306A\u3044\u3082\u306E\u306F\u3001\u30DD\u30C6\u30C8\u3092\u98DF\u3079\u308B\u4FE1\u5FF5\u304C\u8DB3\u308A\u3093\uFF01")), false);
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "clear @s minecraft:potato");
						}
					}
					break;
				}
				if ((new Object() {
					public ItemStack getItemStack(int sltid, Entity entity) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
						return _retval.get();
					}
				}.getItemStack((int) num1, entity)).getItem() == Items.BAKED_POTATO) {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(
								Component.literal(("\u00A7c" + "\u8CB4\u69D8\u306B\u8DB3\u308A\u306A\u3044\u3082\u306E\u306F\u3001\u30D9\u30A4\u30AF\u30C9\u30DD\u30C6\u30C8\u3092\u98DF\u3079\u308B\u4FE1\u5FF5\u304C\u8DB3\u308A\u3093\uFF01")), false);
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "clear @s minecraft:baked_potato");
						}
					}
					break;
				}
			}
			num1 = num1 + 1;
		}
	}
}
