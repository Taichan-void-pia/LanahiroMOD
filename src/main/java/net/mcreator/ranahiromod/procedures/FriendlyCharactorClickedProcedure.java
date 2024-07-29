package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.InteractionHand;
import net.minecraft.tags.TagKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.ranahiromod.init.RanahiromodModItems;
import net.mcreator.ranahiromod.init.RanahiromodModEnchantments;
import net.mcreator.ranahiromod.entity.VazafilaEntity;
import net.mcreator.ranahiromod.entity.TaichanEntity;
import net.mcreator.ranahiromod.entity.SpladotEntity;
import net.mcreator.ranahiromod.entity.SKLiner5077Entity;
import net.mcreator.ranahiromod.entity.Mottie07172Entity;
import net.mcreator.ranahiromod.entity.FossilaoiEntity;

import java.util.concurrent.atomic.AtomicReference;

public class FriendlyCharactorClickedProcedure {
	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		double num1 = 0;
		boolean logic_a = false;
		boolean logic_b = false;
		boolean logic_c = false;
		boolean logic_d = false;
		if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("ranahiromod:friendly")))) {
			if (sourceentity.isShiftKeyDown()) {
				if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.COOKED_BEEF
						|| (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.ENCHANTED_GOLDEN_APPLE) {
					if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount() >= 10) {
						if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount() == 10) {
							if (sourceentity instanceof LivingEntity _entity) {
								ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
								_setstack.setCount(1);
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						} else {
							if (sourceentity instanceof Player _player) {
								ItemStack _stktoremove = new ItemStack(Items.COOKED_BEEF);
								_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 10, _player.inventoryMenu.getCraftSlots());
							}
						}
						if (entity instanceof FossilaoiEntity) {
							if (sourceentity instanceof Player _player) {
								ItemStack _setstack = new ItemStack(RanahiromodModItems.FOSSILAOIPOWER.get()).copy();
								_setstack.setCount(1);
								ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
							}
						} else if (entity instanceof SKLiner5077Entity) {
							if (sourceentity instanceof Player _player) {
								ItemStack _setstack = new ItemStack(RanahiromodModItems.SK_LINER_5077_POWER.get()).copy();
								_setstack.setCount(1);
								ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
							}
						} else if (entity instanceof VazafilaEntity) {
							if (sourceentity instanceof Player _player) {
								ItemStack _setstack = new ItemStack(RanahiromodModItems.VAZAFILA_POWER.get()).copy();
								_setstack.setCount(1);
								ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
							}
						} else if (entity instanceof Mottie07172Entity) {
							if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.ENCHANTED_GOLDEN_APPLE) {
								if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getCount() == 64) {
									if (sourceentity instanceof Player _player && !_player.level().isClientSide())
										_player.displayClientMessage(Component.literal((Component.translatable("mottie.sagi1").getString())), false);
									if (Math.random() < 0.1) {
										if (sourceentity instanceof Player _player && !_player.level().isClientSide())
											_player.displayClientMessage(Component.literal((Component.translatable("mottie.sagi2").getString())), false);
										if (sourceentity instanceof Player _player) {
											ItemStack _setstack = new ItemStack(RanahiromodModItems.INFINITY_EAT_POWER.get()).copy();
											_setstack.setCount(1);
											ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
										}
									}
									if (sourceentity instanceof LivingEntity _entity) {
										ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
										_setstack.setCount(1);
										_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
										if (_entity instanceof Player _player)
											_player.getInventory().setChanged();
									}
								}
							} else {
								if (sourceentity instanceof Player _player) {
									ItemStack _setstack = new ItemStack(RanahiromodModItems.MOTTIE_0717_POWER.get()).copy();
									_setstack.setCount(1);
									ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
								}
							}
						} else if (entity instanceof SpladotEntity) {
							if (sourceentity instanceof Player _player) {
								ItemStack _setstack = new ItemStack(RanahiromodModItems.SPLADOT_POWER.get()).copy();
								_setstack.setCount(1);
								ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
							}
						}
						if (sourceentity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal((Component.translatable("power.give").getString())), false);
					}
				} else {
					if (sourceentity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal((Component.translatable("power.give.condition").getString())), false);
				}
				if (entity instanceof TaichanEntity) {
					if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
						if ((sourceentity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Items.FEATHER)) : false)
								&& (sourceentity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(RanahiromodModItems.MECHANISM_ARMOR_CHESTPLATE.get())) : false)
								&& (sourceentity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Items.ENCHANTED_GOLDEN_APPLE)) : false)
								&& (sourceentity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Blocks.DIAMOND_BLOCK)) : false)) {
							{
								AtomicReference<IItemHandler> _iitemhandlerref = new AtomicReference<>();
								sourceentity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(_iitemhandlerref::set);
								if (_iitemhandlerref.get() != null) {
									for (int _idx = 0; _idx < _iitemhandlerref.get().getSlots(); _idx++) {
										ItemStack itemstackiterator = _iitemhandlerref.get().getStackInSlot(_idx).copy();
										if (itemstackiterator.getItem() == RanahiromodModItems.MECHANISM_ARMOR_CHESTPLATE.get()) {
											if (itemstackiterator.getCount() == 1) {
												if (sourceentity instanceof Player _player) {
													ItemStack _stktoremove = new ItemStack(RanahiromodModItems.MECHANISM_ARMOR_CHESTPLATE.get());
													_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
												}
												logic_a = true;
											}
										}
										if (itemstackiterator.getItem() == Items.FEATHER) {
											if (itemstackiterator.getCount() >= 32) {
												if (sourceentity instanceof Player _player) {
													ItemStack _stktoremove = new ItemStack(Items.FEATHER);
													_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 32, _player.inventoryMenu.getCraftSlots());
												}
												logic_b = true;
											}
										}
										if (itemstackiterator.getItem() == Items.ENCHANTED_GOLDEN_APPLE) {
											if (itemstackiterator.getCount() >= 32) {
												if (sourceentity instanceof Player _player) {
													ItemStack _stktoremove = new ItemStack(Items.ENCHANTED_GOLDEN_APPLE);
													_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 32, _player.inventoryMenu.getCraftSlots());
												}
												logic_c = true;
											}
										}
										if (itemstackiterator.getItem() == Blocks.DIAMOND_BLOCK.asItem()) {
											if (itemstackiterator.getCount() == 64) {
												if (sourceentity instanceof Player _player) {
													ItemStack _stktoremove = new ItemStack(Blocks.DIAMOND_BLOCK);
													_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 64, _player.inventoryMenu.getCraftSlots());
												}
												logic_d = true;
											}
										}
										if (logic_a && logic_b && logic_c && logic_d) {
											{
												Entity _ent = sourceentity;
												if (!_ent.level().isClientSide() && _ent.getServer() != null) {
													_ent.getServer().getCommands().performPrefixedCommand(
															new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
																	_ent.getDisplayName(), _ent.level().getServer(), _ent),
															("item replace entity @s weapon.offhand with elytra{display:{Name:'[{\"text\":\"|||\",\"color\":\"aqua\",\"bold\":true,\"obfuscated\":true},{\"text\":\"" + ""
																	+ Component.translatable("item.ranahiromod.mechanism_armor_chestplate.neo").getString()
																	+ "\",\"color\":\"light_purple\",\"underlined\":true,\"obfuscated\":false},{\"text\":\"|||\"}]'},Unbreakable:1b,AttributeModifiers:[{AttributeName:\"generic.max_health\",Name:\"generic.max_health\",Amount:0.25,Operation:2,UUID:[I;-154055776,-2098641956,-1749528000,-1547438319],Slot:\"chest\"},{AttributeName:\"generic.movement_speed\",Name:\"generic.movement_speed\",Amount:0.05,Operation:2,UUID:[I;129462088,870663820,-1230750568,1338335242],Slot:\"chest\"},{AttributeName:\"generic.attack_speed\",Name:\"generic.attack_speed\",Amount:0.4,Operation:2,UUID:[I;-1823038791,-22724419,-2076350846,-53019325],Slot:\"chest\"},{AttributeName:\"generic.attack_damage\",Name:\"generic.attack_damage\",Amount:0.35,Operation:2,UUID:[I;-1703726631,-258260071,-1559852195,-1779986387],Slot:\"chest\"},{AttributeName:\"generic.armor_toughness\",Name:\"generic.armor_toughness\",Amount:10,Operation:0,UUID:[I;-1716095721,-657898855,-1996312924,-348230239],Slot:\"chest\"},{AttributeName:\"generic.knockback_resistance\",Name:\"generic.knockback_resistance\",Amount:1,Operation:0,UUID:[I;-2119345161,-458537129,-1682516004,1307986891],Slot:\"chest\"},{AttributeName:\"generic.armor\",Name:\"generic.armor\",Amount:30,Operation:0,UUID:[I;-101456608,1179795844,-1859536734,1383873392],Slot:\"chest\"}]} 1"));
												}
											}
											if (!((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).isEnchanted())) {
												(sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).enchant(RanahiromodModEnchantments.RAINBOW_FORCE_POWER.get(), 15);
												(sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).enchant(RanahiromodModEnchantments.OP_RESPAWN.get(), 15);
												(sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).enchant(RanahiromodModEnchantments.SOUL_POWER.get(), 15);
												(sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).enchant(Enchantments.ALL_DAMAGE_PROTECTION, 15);
												(sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).enchant(Enchantments.FIRE_PROTECTION, 15);
												(sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).enchant(Enchantments.FALL_PROTECTION, 15);
												(sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).enchant(Enchantments.BLAST_PROTECTION, 15);
												(sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).enchant(Enchantments.PROJECTILE_PROTECTION, 15);
												(sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).enchant(Enchantments.RESPIRATION, 3);
												(sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).enchant(Enchantments.AQUA_AFFINITY, 1);
												(sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).enchant(Enchantments.THORNS, 15);
												(sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).enchant(Enchantments.DEPTH_STRIDER, 15);
												(sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).enchant(Enchantments.SOUL_SPEED, 15);
											}
										}
									}
								}
							}
						}
					}
				}
			} else {
				entity.getPersistentData().putDouble("count_target", (entity.getPersistentData().getDouble("count_target") + 1));
				if (entity.getPersistentData().getDouble("count_target") == 1) {
					if (sourceentity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal((Component.translatable("warning.target").getString())), false);
				} else if (entity.getPersistentData().getDouble("count_target") >= 2) {
					entity.getPersistentData().putBoolean("enemy", true);
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, (int) Double.POSITIVE_INFINITY, 0, false, false));
					if (entity instanceof Mob _entity && sourceentity instanceof LivingEntity _ent)
						_entity.setTarget(_ent);
				}
			}
		}
	}
}
