package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.ranahiromod.init.RanahiromodModItems;
import net.mcreator.ranahiromod.init.RanahiromodModEnchantments;

public class AIWeaponhiroProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double rnd = 0;
		double dis = 0;
		if (entity.isAlive()) {
			if (itemstack.getOrCreateTag().getDouble("cnt_num") > 0) {
				itemstack.getOrCreateTag().putDouble("cnt_num", (itemstack.getOrCreateTag().getDouble("cnt_num") + 1));
				if (itemstack.getOrCreateTag().getDouble("cnt_num") == 2) {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal((Component.translatable("weaponhiro.hello").getString())), false);
				}
				if (itemstack.getOrCreateTag().getDouble("cnt_num") == 20) {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal((Component.translatable("weaponhiro.test").getString())), false);
				}
				if (itemstack.getOrCreateTag().getDouble("cnt_num") == 40) {
					entity.getPersistentData().putDouble("cnt1", 0);
				}
				if (itemstack.getOrCreateTag().getDouble("cnt_num") >= 80) {
					if (itemstack.getOrCreateTag().getDouble("cnt_num") == 80) {
						entity.getPersistentData().putDouble("skill2", 1001);
						entity.getPersistentData().putDouble("cnt1", 1);
						itemstack.getOrCreateTag().putDouble("skilluse_num", (itemstack.getOrCreateTag().getDouble("skilluse_num") + 1));
						if (itemstack.getOrCreateTag().getDouble("skilluse_num") >= 30) {
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal((Component.translatable("weaponhiro.lose").getString())), false);
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal((Component.translatable("weaponhiro.change").getString())), false);
							entity.getPersistentData().putDouble("skill2", 0);
							rnd = Math.ceil(Math.random() * 3);
							if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == itemstack.getItem()) {
								(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).enchant(RanahiromodModEnchantments.SOUL_POWER.get(), 10);
								if (rnd == 1) {
									{
										Entity _ent = entity;
										if (!_ent.level().isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands().performPrefixedCommand(
													new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
															_ent.getDisplayName(), _ent.level().getServer(), _ent),
													"item replace entity Dev weapon.mainhand with ranahiromod:holy_sword{HideFlags:2,AttributeModifiers:[{AttributeName:\"generic.max_health\",Name:\"generic.max_health\",Amount:-0.8,Operation:1,UUID:[I;1360991478,-1042986062,-1574268569,293813373],Slot:\"mainhand\"},{AttributeName:\"generic.max_health\",Name:\"generic.max_health\",Amount:-0.8,Operation:1,UUID:[I;1936375062,-1174584581,-1605815607,-1773857540],Slot:\"offhand\"}]} 1");
										}
									}
									(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).enchant(RanahiromodModEnchantments.HOLY_POWER.get(), 77);
									(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).enchant(Enchantments.SMITE, 77);
								} else if (rnd == 2) {
									{
										Entity _ent = entity;
										if (!_ent.level().isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands().performPrefixedCommand(
													new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
															_ent.getDisplayName(), _ent.level().getServer(), _ent),
													"item replace entity Dev weapon.mainhand with ranahiromod:devil_sword{HideFlags:2,AttributeModifiers:[{AttributeName:\"generic.max_health\",Name:\"generic.max_health\",Amount:1,Operation:1,UUID:[I;1360991478,-1042986062,-1574268569,293813373],Slot:\"mainhand\"},{AttributeName:\"generic.max_health\",Name:\"generic.max_health\",Amount:1,Operation:1,UUID:[I;1936375062,-1174584581,-1605815607,-1773857540],Slot:\"offhand\"}]} 1");
										}
									}
									(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).enchant(RanahiromodModEnchantments.DEATH_SONG.get(), 66);
									(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).enchant(Enchantments.SHARPNESS, 66);
								} else if (rnd == 3) {
									if (entity instanceof LivingEntity _entity) {
										ItemStack _setstack = new ItemStack(RanahiromodModItems.YOTO.get()).copy();
										_setstack.setCount(1);
										_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
										if (_entity instanceof Player _player)
											_player.getInventory().setChanged();
									}
									(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).enchant(RanahiromodModEnchantments.PERDITION_BLADE.get(), 99);
									(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).enchant(Enchantments.SHARPNESS, 99);
								}
							} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == itemstack.getItem()) {
								(entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).enchant(RanahiromodModEnchantments.SOUL_POWER.get(), 10);
								if (rnd == 1) {
									{
										Entity _ent = entity;
										if (!_ent.level().isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands().performPrefixedCommand(
													new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
															_ent.getDisplayName(), _ent.level().getServer(), _ent),
													"item replace entity Dev weapon.offhand with ranahiromod:holy_sword{HideFlags:2,AttributeModifiers:[{AttributeName:\"generic.max_health\",Name:\"generic.max_health\",Amount:-0.8,Operation:1,UUID:[I;1360991478,-1042986062,-1574268569,293813373],Slot:\"mainhand\"},{AttributeName:\"generic.max_health\",Name:\"generic.max_health\",Amount:-0.8,Operation:1,UUID:[I;1936375062,-1174584581,-1605815607,-1773857540],Slot:\"offhand\"}]} 1");
										}
									}
									(entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).enchant(RanahiromodModEnchantments.HOLY_POWER.get(), 77);
									(entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).enchant(Enchantments.SMITE, 77);
								} else if (rnd == 2) {
									{
										Entity _ent = entity;
										if (!_ent.level().isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands().performPrefixedCommand(
													new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
															_ent.getDisplayName(), _ent.level().getServer(), _ent),
													"item replace entity Dev weapon.offhand with ranahiromod:devil_sword{HideFlags:2,AttributeModifiers:[{AttributeName:\"generic.max_health\",Name:\"generic.max_health\",Amount:1,Operation:1,UUID:[I;1360991478,-1042986062,-1574268569,293813373],Slot:\"mainhand\"},{AttributeName:\"generic.max_health\",Name:\"generic.max_health\",Amount:1,Operation:1,UUID:[I;1936375062,-1174584581,-1605815607,-1773857540],Slot:\"offhand\"}]} 1");
										}
									}
									(entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).enchant(RanahiromodModEnchantments.DEATH_SONG.get(), 66);
									(entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).enchant(Enchantments.SHARPNESS, 66);
								} else if (rnd == 3) {
									if (entity instanceof LivingEntity _entity) {
										ItemStack _setstack = new ItemStack(RanahiromodModItems.YOTO.get()).copy();
										_setstack.setCount(1);
										_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
										if (_entity instanceof Player _player)
											_player.getInventory().setChanged();
									}
									(entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).enchant(RanahiromodModEnchantments.PERDITION_BLADE.get(), 99);
									(entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).enchant(Enchantments.SHARPNESS, 99);
								}
							}
						}
						rnd = Math.ceil(Math.random() * 6);
						itemstack.getOrCreateTag().putDouble("mode", rnd);
					}
					if (itemstack.getOrCreateTag().getDouble("mode") == 1) {
						SkillWeaponhiro1NeoProcedure.execute(world, x, y, z, entity);
					} else if (itemstack.getOrCreateTag().getDouble("mode") == 2) {
						SkillWeaponhiro2NeoProcedure.execute(world, x, y, z, entity);
					} else if (itemstack.getOrCreateTag().getDouble("mode") == 3) {
						SkillWeaponhiro3NeoProcedure.execute(world, x, y, z, entity);
					} else if (itemstack.getOrCreateTag().getDouble("mode") == 4) {
						SkillWeaponhiro1Procedure.execute(world, x, y, z, entity);
					} else if (itemstack.getOrCreateTag().getDouble("mode") == 5) {
						SkillWeaponhiro2Procedure.execute(world, x, y, z, entity);
					} else if (itemstack.getOrCreateTag().getDouble("mode") == 6) {
						SkillWeaponhiro6NeoProcedure.execute(world, y, entity);
					}
				}
			}
		}
	}
}
