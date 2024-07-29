package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

import net.mcreator.ranahiromod.network.RanahiromodModVariables;
import net.mcreator.ranahiromod.init.RanahiromodModItems;

public class ChangeOtherSkillKeyProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double cooltime = 0;
		String name = "";
		String color = "";
		String base = "";
		if (!((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("ranahiromod:ranahiro_mod_art_tag"))))
				&& (entity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).Job != 0
				&& ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() instanceof SwordItem || (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.BOW
						|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RanahiromodModItems.SUN_ROD.get()
						|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RanahiromodModItems.ENERGY_RIFLE.get()
						|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RanahiromodModItems.WOODEN_SHORT_SWORD.get()
						|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RanahiromodModItems.STONE_SHORT_SWORD.get()
						|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RanahiromodModItems.IRON_SHORT_SWORD.get()
						|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RanahiromodModItems.GOLDEN_SHORT_SWORD.get()
						|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RanahiromodModItems.DIAMOND_SHORT_SWORD.get()
						|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RanahiromodModItems.NETHERRITE_SHORT_SWORD.get())) {
			if (entity.isShiftKeyDown()) {
				{
					double _setval = (entity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).ChangeOtherSkillKeyCounter - 1;
					entity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.ChangeOtherSkillKeyCounter = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else {
				{
					double _setval = (entity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).ChangeOtherSkillKeyCounter + 1;
					entity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.ChangeOtherSkillKeyCounter = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			color = "\u00A7l";
			if (!((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("ranahiromod:ranahiro_mod_art_tag"))))) {
				if ((entity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).Job == 1) {
					base = "knight";
					if ((entity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).ChangeOtherSkillKeyCounter < 0) {
						{
							double _setval = 4;
							entity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.ChangeOtherSkillKeyCounter = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if ((entity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).ChangeOtherSkillKeyCounter > 4) {
						{
							double _setval = 0;
							entity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.ChangeOtherSkillKeyCounter = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					}
					name = Component.translatable((base + ".skill." + Math.round((entity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).ChangeOtherSkillKeyCounter + 1)))
							.getString();
				}
				if ((entity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).Job == 2) {
					base = "archer";
					if ((entity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).ChangeOtherSkillKeyCounter < 0) {
						{
							double _setval = 4;
							entity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.ChangeOtherSkillKeyCounter = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if ((entity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).ChangeOtherSkillKeyCounter > 4) {
						{
							double _setval = 0;
							entity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.ChangeOtherSkillKeyCounter = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					}
					name = Component.translatable((base + ".skill." + Math.round((entity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).ChangeOtherSkillKeyCounter + 1)))
							.getString();
				}
				if ((entity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).Job == 3) {
					base = "wizard";
					if ((entity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).ChangeOtherSkillKeyCounter < 0) {
						{
							double _setval = 9;
							entity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.ChangeOtherSkillKeyCounter = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if ((entity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).ChangeOtherSkillKeyCounter > 9) {
						{
							double _setval = 0;
							entity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.ChangeOtherSkillKeyCounter = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					}
					name = Component.translatable((base + ".skill." + Math.round((entity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).ChangeOtherSkillKeyCounter + 1)))
							.getString();
				}
				if ((entity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).Job == 4) {
					base = "thief";
					if ((entity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).ChangeOtherSkillKeyCounter < 0) {
						{
							double _setval = 4;
							entity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.ChangeOtherSkillKeyCounter = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if ((entity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).ChangeOtherSkillKeyCounter > 4) {
						{
							double _setval = 0;
							entity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.ChangeOtherSkillKeyCounter = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					}
					name = Component.translatable((base + ".skill." + Math.round((entity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).ChangeOtherSkillKeyCounter + 1)))
							.getString();
				}
				if ((entity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).Job == 5) {
					base = "assassin";
					if ((entity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).ChangeOtherSkillKeyCounter < 0) {
						{
							double _setval = 3;
							entity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.ChangeOtherSkillKeyCounter = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if ((entity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).ChangeOtherSkillKeyCounter > 3) {
						{
							double _setval = 0;
							entity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.ChangeOtherSkillKeyCounter = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					}
					name = Component.translatable((base + ".skill." + Math.round((entity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).ChangeOtherSkillKeyCounter + 1)))
							.getString();
				}
				if ((entity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).Job == 6) {
					base = "summoner";
					if ((entity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).ChangeOtherSkillKeyCounter < 0) {
						{
							double _setval = 8;
							entity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.ChangeOtherSkillKeyCounter = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if ((entity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).ChangeOtherSkillKeyCounter > 8) {
						{
							double _setval = 0;
							entity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.ChangeOtherSkillKeyCounter = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					}
					name = Component.translatable((base + ".skill." + Math.round((entity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).ChangeOtherSkillKeyCounter + 1)))
							.getString();
				}
				name = color + "" + name;
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal(name), false);
				{
					String _setval = name;
					entity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.WazaString = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
