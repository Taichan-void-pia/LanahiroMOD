package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.Snowball;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.tags.ItemTags;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.ranahiromod.network.RanahiromodModVariables;
import net.mcreator.ranahiromod.init.RanahiromodModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class OtherStartSkillProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getSource(), event.getEntity(), event.getSource().getDirectEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, DamageSource damagesource, Entity entity, Entity immediatesourceentity, Entity sourceentity) {
		execute(null, world, x, y, z, damagesource, entity, immediatesourceentity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, DamageSource damagesource, Entity entity, Entity immediatesourceentity, Entity sourceentity) {
		if (damagesource == null || entity == null || immediatesourceentity == null || sourceentity == null)
			return;
		double num1 = 0;
		double waza_add_counter = 0;
		if (sourceentity.getPersistentData().getDouble("skill2_swing") == 0) {
			if (sourceentity.getPersistentData().getDouble("skill2") == 0) {
				sourceentity.getPersistentData().putDouble("cnt1", 0);
				sourceentity.getPersistentData().putDouble("cnt2", 0);
				sourceentity.getPersistentData().putDouble("cnt3", 0);
				sourceentity.getPersistentData().putDouble("cnt4", 0);
				sourceentity.getPersistentData().putDouble("cnt5", 0);
				sourceentity.getPersistentData().putDouble("cnt6", 0);
				sourceentity.getPersistentData().putDouble("dis", 0);
				sourceentity.getPersistentData().putDouble("hit_count", 0);
				sourceentity.getPersistentData().putDouble("NameRanged", 0);
				sourceentity.getPersistentData().putDouble("x_pos", 0);
				sourceentity.getPersistentData().putDouble("y_pos", 0);
				sourceentity.getPersistentData().putDouble("z_pos", 0);
				sourceentity.getPersistentData().putDouble("x_pos2", 0);
				sourceentity.getPersistentData().putDouble("y_pos2", 0);
				sourceentity.getPersistentData().putDouble("z_pos2", 0);
				sourceentity.getPersistentData().putDouble("x_pos3", 0);
				sourceentity.getPersistentData().putDouble("y_pos3", 0);
				sourceentity.getPersistentData().putDouble("z_pos3", 0);
				sourceentity.getPersistentData().putBoolean("loop", false);
				sourceentity.getPersistentData().putBoolean("flag_a", false);
				sourceentity.getPersistentData().putBoolean("flag_b", false);
				sourceentity.getPersistentData().putDouble("skill2", 0);
				if (!((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("ranahiromod:ranahiro_mod_art_tag"))))) {
					if ((sourceentity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).Job != 0) {
						if (damagesource.is(DamageTypes.ARROW)) {
							if ((sourceentity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).Job == 2) {
								if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.BOW
										|| (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.CROSSBOW) {
									sourceentity.getPersistentData().putDouble("skill2",
											(20101 + (sourceentity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).ChangeOtherSkillKeyCounter));
									if (sourceentity instanceof Player _player && !_player.level().isClientSide())
										_player.displayClientMessage(Component.literal(((sourceentity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).WazaString)), true);
									sourceentity.getPersistentData().putString("Archer_hit_UUID", (entity.getStringUUID()));
								}
							}
						} else if (immediatesourceentity instanceof Snowball) {
							if ((sourceentity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).Job == 3
									&& ((sourceentity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).ChangeOtherSkillKeyCounter >= 1
											|| (sourceentity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).ChangeOtherSkillKeyCounter <= 5)) {
								sourceentity.getPersistentData().putDouble("skill2",
										(20201 + (sourceentity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).ChangeOtherSkillKeyCounter));
								if (sourceentity instanceof Player _player && !_player.level().isClientSide())
									_player.displayClientMessage(Component.literal(((sourceentity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).WazaString)), true);
								sourceentity.getPersistentData().putString("Archer_hit_UUID", (entity.getStringUUID()));
							}
							if ((sourceentity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).Job == 4) {
								if ((sourceentity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).ChangeOtherSkillKeyCounter == 2) {
									sourceentity.getPersistentData().putDouble("skill2", 20303);
								}
								if ((sourceentity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).ChangeOtherSkillKeyCounter == 4) {
									sourceentity.getPersistentData().putDouble("skill2", 20305);
								}
								if (sourceentity instanceof Player _player && !_player.level().isClientSide())
									_player.displayClientMessage(Component.literal(((sourceentity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).WazaString)), true);
								sourceentity.getPersistentData().putString("Archer_hit_UUID", (entity.getStringUUID()));
							}
						} else {
							if ((sourceentity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).Job == 1) {
								if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() instanceof SwordItem) {
									sourceentity.getPersistentData().putDouble("skill2",
											(20001 + (sourceentity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).ChangeOtherSkillKeyCounter));
									if (sourceentity instanceof Player _player && !_player.level().isClientSide())
										_player.displayClientMessage(Component.literal(((sourceentity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).WazaString)), true);
								}
							}
							if ((sourceentity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).Job == 4) {
								if ((sourceentity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).ChangeOtherSkillKeyCounter == 1
										|| (sourceentity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).ChangeOtherSkillKeyCounter == 3) {
									sourceentity.getPersistentData().putDouble("skill2",
											(20001 + (sourceentity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).ChangeOtherSkillKeyCounter));
									if (sourceentity instanceof Player _player && !_player.level().isClientSide())
										_player.displayClientMessage(Component.literal(((sourceentity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).WazaString)), true);
								}
								if ((sourceentity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).ChangeOtherSkillKeyCounter == 2
										|| (sourceentity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).ChangeOtherSkillKeyCounter >= 4) {
									if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RanahiromodModItems.WOODEN_SHORT_SWORD.get()
											|| (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RanahiromodModItems.STONE_SHORT_SWORD.get()
											|| (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RanahiromodModItems.IRON_SHORT_SWORD.get()
											|| (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RanahiromodModItems.GOLDEN_SHORT_SWORD.get()
											|| (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RanahiromodModItems.DIAMOND_SHORT_SWORD.get()
											|| (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RanahiromodModItems.NETHERRITE_SHORT_SWORD.get()) {
										sourceentity.getPersistentData().putDouble("skill2",
												(20301 + (sourceentity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).ChangeOtherSkillKeyCounter));
										if (sourceentity instanceof Player _player && !_player.level().isClientSide())
											_player.displayClientMessage(Component.literal(((sourceentity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).WazaString)),
													true);
									}
								}
							}
							if ((sourceentity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).Job == 5) {
								if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RanahiromodModItems.WOODEN_SHORT_SWORD.get()
										|| (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RanahiromodModItems.STONE_SHORT_SWORD.get()
										|| (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RanahiromodModItems.IRON_SHORT_SWORD.get()
										|| (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RanahiromodModItems.GOLDEN_SHORT_SWORD.get()
										|| (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RanahiromodModItems.DIAMOND_SHORT_SWORD.get()
										|| (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RanahiromodModItems.NETHERRITE_SHORT_SWORD.get()) {
									if ((sourceentity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).ChangeOtherSkillKeyCounter >= 0
											&& (sourceentity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).ChangeOtherSkillKeyCounter <= 1) {
										sourceentity.getPersistentData().putDouble("skill2",
												(20401 + (sourceentity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).ChangeOtherSkillKeyCounter));
										if (sourceentity instanceof Player _player && !_player.level().isClientSide())
											_player.displayClientMessage(Component.literal(((sourceentity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).WazaString)),
													true);
									}
								}
							}
						}
					}
				}
			} else if (sourceentity.getPersistentData().getDouble("skill2") == 20304 || sourceentity.getPersistentData().getDouble("skill2") == 20402) {
				sourceentity.getPersistentData().putDouble("hit_count", Math.min(sourceentity.getPersistentData().getDouble("hit_count") + 1, 20));
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.CRIT, x, y, z, 5, 0.5, 0.5, 0.5, 0.2);
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.ENCHANTED_HIT, x, y, z, 5, 0.5, 0.5, 0.5, 0.2);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.shield.break")), SoundSource.NEUTRAL, 1, 2);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.shield.break")), SoundSource.NEUTRAL, 1, 2, false);
					}
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie.attack_iron_door")), SoundSource.NEUTRAL, 1, 2);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie.attack_iron_door")), SoundSource.NEUTRAL, 1, 2, false);
					}
				}
				if (sourceentity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal((sourceentity.getPersistentData().getDouble("hit_count") + "hit!")), true);
			} else {
				if (sourceentity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("\u4ED6\u306E\u6280\u3092\u4F7F\u7528\u4E2D\u3067\u3059\u3002"), true);
			}
		}
	}
}
