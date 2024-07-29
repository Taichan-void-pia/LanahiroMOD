package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.Guardian;
import net.minecraft.world.entity.monster.ElderGuardian;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.tags.TagKey;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.ranahiromod.network.RanahiromodModVariables;
import net.mcreator.ranahiromod.init.RanahiromodModParticleTypes;
import net.mcreator.ranahiromod.init.RanahiromodModMobEffects;
import net.mcreator.ranahiromod.init.RanahiromodModEnchantments;
import net.mcreator.ranahiromod.RanahiromodMod;

import java.util.List;
import java.util.Comparator;

public class DodamageProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double old_health = 0;
		double range = 0;
		double x_knockback = 0;
		double z_knockback = 0;
		double damage_sorce = 0;
		double y_knockback = 0;
		double knockback_power = 0;
		double knockback_sorce = 0;
		double num1 = 0;
		double change_projectile = 0;
		double num2 = 0;
		double num3 = 0;
		double num4 = 0;
		double defense_power = 0;
		double Damage_amount = 0;
		double knockback_amount = 0;
		double resistance = 0;
		double dis = 0;
		double x_pos = 0;
		double y_pos = 0;
		double z_pos = 0;
		double x_center = 0;
		double y_center = 0;
		double z_center = 0;
		double kb_resistance = 0;
		double thorns_damage_value = 0;
		double bane_of_arthropods_slowness_tick = 0;
		double set_fire_tick = 0;
		double potion_guard_level = 0;
		double potion_guard_time = 0;
		double x_pos_ratios = 0;
		double strength_level_iterator = 0;
		double y_pos_ratios = 0;
		double z_pos_ratios = 0;
		double strength_level = 0;
		ItemStack mainhandweapon = ItemStack.EMPTY;
		boolean guard = false;
		boolean swing_off = false;
		boolean sword = false;
		boolean swing = false;
		boolean logic_attack = false;
		boolean swing_main = false;
		boolean calc_armor = false;
		boolean noDamaged = false;
		boolean thorns_damage_logic = false;
		boolean HitPlayer_to_ItemEntity = false;
		boolean just_guard = false;
		boolean guard2 = false;
		boolean logic_a = false;
		mainhandweapon = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
		if (entity.getPersistentData().getDouble("range") > 0) {
			entity.getPersistentData().putDouble("Range", (entity.getPersistentData().getDouble("range")));
			range = entity.getPersistentData().getDouble("Range");
			if (mainhandweapon.getItem() == Items.CROSSBOW) {
				if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.PIERCING, mainhandweapon) != 0) {
					range = range + mainhandweapon.getEnchantmentLevel(Enchantments.PIERCING);
				}
			} else if (mainhandweapon.getItem() instanceof SwordItem) {
				if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.SWEEPING_EDGE, mainhandweapon) != 0) {
					range = range + mainhandweapon.getEnchantmentLevel(Enchantments.SWEEPING_EDGE);
				}
			}
		}
		if (entity.getPersistentData().getDouble("damage") > 0) {
			entity.getPersistentData().putDouble("Damage", (entity.getPersistentData().getDouble("damage")));
			damage_sorce = entity.getPersistentData().getDouble("Damage");
		}
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(range / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				guard = false;
				just_guard = false;
				logic_a = entity.getPersistentData().getDouble("target_type") == 0 ? LogicAttackProcedure.execute(world, x, y, z, entity) : true;
				logic_attack = logic_a && !(entityiterator == entity) && entityiterator instanceof LivingEntity;
				if (logic_attack) {
					if (mainhandweapon.getItem() == Items.BOW || mainhandweapon.getItem() == Items.CROSSBOW) {
						if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.FLAMING_ARROWS, mainhandweapon) != 0) {
							set_fire_tick = entityiterator.getRemainingFireTicks() + 4 * mainhandweapon.getEnchantmentLevel(Enchantments.FLAMING_ARROWS);
							entityiterator.setSecondsOnFire((int) set_fire_tick);
						}
					} else {
						if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.FIRE_ASPECT, mainhandweapon) != 0) {
							set_fire_tick = entityiterator.getRemainingFireTicks() + 4 * mainhandweapon.getEnchantmentLevel(Enchantments.FIRE_ASPECT);
							entityiterator.setSecondsOnFire((int) set_fire_tick);
						}
						if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BANE_OF_ARTHROPODS, mainhandweapon) != 0 && entityiterator instanceof LivingEntity _livEnt29 && _livEnt29.getMobType() == MobType.ARTHROPOD) {
							bane_of_arthropods_slowness_tick = Math.random() * 1.5 + mainhandweapon.getEnchantmentLevel(Enchantments.BANE_OF_ARTHROPODS);
							if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, (int) bane_of_arthropods_slowness_tick, 3, false, false));
						}
					}
					if (entity instanceof LivingEntity _livEnt32 && _livEnt32.hasEffect(MobEffects.DAMAGE_BOOST)) {
						strength_level = (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) + 1;
					}
					if (mainhandweapon.getItem() == Items.BOW || mainhandweapon.getItem() == Items.CROSSBOW) {
						if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.POWER_ARROWS, mainhandweapon) != 0) {
							damage_sorce = damage_sorce + 3 * (1 + strength_level / 20) * mainhandweapon.getEnchantmentLevel(Enchantments.POWER_ARROWS);
						}
					} else {
						if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.SHARPNESS, mainhandweapon) != 0) {
							if (!(entity instanceof LivingEntity _livEnt39 && _livEnt39.hasEffect(MobEffects.DIG_SLOWDOWN))) {
								damage_sorce = damage_sorce + 3 * (1 + strength_level / 20) * mainhandweapon.getEnchantmentLevel(Enchantments.SHARPNESS);
							}
						}
						if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.SMITE, mainhandweapon) != 0 && entityiterator instanceof LivingEntity _livEnt42 && _livEnt42.getMobType() == MobType.UNDEAD) {
							damage_sorce = damage_sorce + (3 + mainhandweapon.getEnchantmentLevel(Enchantments.SMITE)) * (1 + strength_level / 20) * mainhandweapon.getEnchantmentLevel(Enchantments.SMITE);
						}
						if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BANE_OF_ARTHROPODS, mainhandweapon) != 0 && entityiterator instanceof LivingEntity _livEnt46 && _livEnt46.getMobType() == MobType.ARTHROPOD) {
							damage_sorce = damage_sorce + (3 + mainhandweapon.getEnchantmentLevel(Enchantments.BANE_OF_ARTHROPODS)) * (1 + strength_level / 20) * mainhandweapon.getEnchantmentLevel(Enchantments.BANE_OF_ARTHROPODS);
						}
						if (mainhandweapon.getItem() instanceof SwordItem) {
							if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.SWEEPING_EDGE, mainhandweapon) != 0) {
								damage_sorce = damage_sorce * (1 + (mainhandweapon.getEnchantmentLevel(Enchantments.SWEEPING_EDGE) / (mainhandweapon.getEnchantmentLevel(Enchantments.SWEEPING_EDGE) + 1)) * (0.1 + strength_level / 100));
							}
						}
						if (EnchantmentHelper.getItemEnchantmentLevel(RanahiromodModEnchantments.RANAHIRO_SLAYER.get(), mainhandweapon) != 0
								&& entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("ranahiromod:ranahiro_tag")))) {
							damage_sorce = damage_sorce
									+ 3 * mainhandweapon.getEnchantmentLevel(RanahiromodModEnchantments.RANAHIRO_SLAYER.get()) * (1 + strength_level / 20) * mainhandweapon.getEnchantmentLevel(RanahiromodModEnchantments.RANAHIRO_SLAYER.get());
						}
					}
					if (mainhandweapon.getItem() == Items.BOW || mainhandweapon.getItem() == Items.CROSSBOW) {
						if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.PUNCH_ARROWS, mainhandweapon) != 0) {
							knockback_sorce = knockback_sorce + 3 * mainhandweapon.getEnchantmentLevel(Enchantments.PUNCH_ARROWS);
						}
					} else {
						if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.KNOCKBACK, mainhandweapon) != 0) {
							knockback_sorce = knockback_sorce + 3 * mainhandweapon.getEnchantmentLevel(Enchantments.KNOCKBACK);
						}
					}
					if (entity.getPersistentData().getDouble("skill2") == 20104) {
						if (Math.random() < 0.5) {
							damage_sorce = damage_sorce * 10;
						} else {
							damage_sorce = damage_sorce * 0;
						}
					}
					damage_sorce = damage_sorce * (1 - Math.min(20, Math.max((entity instanceof LivingEntity _livEnt ? _livEnt.getArmorValue() : 0) / 5,
							(entity instanceof LivingEntity _livEnt ? _livEnt.getArmorValue() : 0) - (4 * damage_sorce) / ((entity instanceof LivingEntity _livEnt ? _livEnt.getArmorValue() : 0) / 5 + 8))) / 25);
					if (entity instanceof LivingEntity _livEnt67 && _livEnt67.hasEffect(MobEffects.WEAKNESS)) {
						damage_sorce = damage_sorce * (1 - 0.05 * (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.WEAKNESS) ? _livEnt.getEffect(MobEffects.WEAKNESS).getAmplifier() : 0));
					}
					if (entity instanceof LivingEntity _livEnt69 && _livEnt69.hasEffect(MobEffects.DIG_SLOWDOWN)) {
						damage_sorce = damage_sorce * 0.2;
					}
					if (entityiterator instanceof Player) {
						damage_sorce = damage_sorce * 2;
						damage_sorce = damage_sorce * DifficultyLevelProcedure.execute(world);
					}
					if ((entityiterator.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).ShieldUse) {
						entity.getPersistentData().putBoolean("Damaged", true);
						noDamaged = true;
					}
					if (damage_sorce <= 0) {
						noDamaged = true;
					}
					old_health = entityiterator instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1;
					if (!noDamaged) {
						guard = false;
						just_guard = false;
						if (entityiterator instanceof LivingEntity _livEnt73 && _livEnt73.hasEffect(RanahiromodModMobEffects.GUARD_PROTECTION.get())) {
							potion_guard_level = (entityiterator instanceof LivingEntity _livEnt && _livEnt.hasEffect(RanahiromodModMobEffects.GUARD_PROTECTION.get())
									? _livEnt.getEffect(RanahiromodModMobEffects.GUARD_PROTECTION.get()).getAmplifier()
									: 0) + 1;
							potion_guard_time = entityiterator instanceof LivingEntity _livEnt && _livEnt.hasEffect(RanahiromodModMobEffects.GUARD_PROTECTION.get())
									? _livEnt.getEffect(RanahiromodModMobEffects.GUARD_PROTECTION.get()).getDuration()
									: 0;
							if (potion_guard_time >= 20 && potion_guard_time <= 30) {
								just_guard = true;
							} else if (potion_guard_time > 1) {
								guard2 = true;
							} else {
								guard2 = false;
							}
							if (guard2) {
								damage_sorce = damage_sorce * (1 - potion_guard_level / (potion_guard_level + 10));
							} else if (just_guard) {
								damage_sorce = damage_sorce * (1 - potion_guard_level / (potion_guard_level + 5));
							}
						}
						entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK), entity), (float) damage_sorce);
						num3 = 3;
						for (int index0 = 0; index0 < 4; index0++) {
							(entityiterator instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.byTypeAndIndex(EquipmentSlot.Type.ARMOR, (int) num3)) : ItemStack.EMPTY).setDamageValue(0);
							if (num3 > 0) {
								num3 = num3 - 1;
							}
						}
						if (entityiterator instanceof Guardian || entityiterator instanceof ElderGuardian) {
							if (Math.random() < 0.75) {
								thorns_damage_value = Math.round(damage_sorce * Math.min(
										0.2 + Math.min(Math.random(), 0.3) + (entityiterator instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 10, 1));
								thorns_damage_logic = true;
							}
						} else if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.THORNS, (entityiterator instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY)) != 0) {
							if ((entityiterator instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getEnchantmentLevel(Enchantments.THORNS) != 0) {
								if (Math.random() < (entityiterator instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getEnchantmentLevel(Enchantments.THORNS) * 0.15) {
									if ((entityiterator instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getEnchantmentLevel(Enchantments.THORNS) >= 10) {
										thorns_damage_value = Math.round((entityiterator instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getEnchantmentLevel(Enchantments.THORNS) - 10);
									} else {
										thorns_damage_value = Math.round(
												Math.ceil(Math.random() * 4) * (1 + (entityiterator instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3));
									}
									thorns_damage_logic = true;
								}
							}
						}
						if (thorns_damage_logic) {
							entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.THORNS), entityiterator), (float) thorns_damage_value);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("enchant.thorns.hit")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("enchant.thorns.hit")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
						}
						if (old_health > (entityiterator instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1)) {
							strength_level_iterator = (entityiterator instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) + 1;
							strength_level = (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) + 1;
							x_pos_ratios = (entity.getX() * strength_level_iterator + entityiterator.getX() * strength_level) / (strength_level_iterator + strength_level);
							y_pos_ratios = (entity.getY() * strength_level_iterator + entityiterator.getY() * strength_level) / (strength_level_iterator + strength_level);
							z_pos_ratios = (entity.getZ() * strength_level_iterator + entityiterator.getZ() * strength_level) / (strength_level_iterator + strength_level);
							if (guard2) {
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.land")), SoundSource.NEUTRAL, 1, (float) 1.5);
									} else {
										_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.land")), SoundSource.NEUTRAL, 1, (float) 1.5, false);
									}
								}
								if (world instanceof ServerLevel _level)
									_level.sendParticles(ParticleTypes.CRIT, (entityiterator.getX()), (entityiterator.getY() + entityiterator.getBbHeight() / 2), (entityiterator.getZ()), 10, (entityiterator.getBbWidth() / 2),
											(entityiterator.getBbHeight() / 4), (entityiterator.getBbWidth() / 2), 0.05);
								if (world instanceof ServerLevel _level)
									_level.sendParticles((SimpleParticleType) (RanahiromodModParticleTypes.LIGHT_SCATTER.get()), x_pos_ratios, y_pos_ratios, z_pos_ratios, 5, 0.2, 0.2, 0.2, 0.1);
							} else if (just_guard) {
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.land")), SoundSource.NEUTRAL, 1, 2);
									} else {
										_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.land")), SoundSource.NEUTRAL, 1, 2, false);
									}
								}
								if (world instanceof ServerLevel _level)
									_level.sendParticles(ParticleTypes.CRIT, (entityiterator.getX()), (entityiterator.getY() + entityiterator.getBbHeight() / 2), (entityiterator.getZ()), 20, (entityiterator.getBbWidth() / 2),
											(entityiterator.getBbHeight() / 4), (entityiterator.getBbWidth() / 2), 0.05);
								if (world instanceof ServerLevel _level)
									_level.sendParticles((SimpleParticleType) (RanahiromodModParticleTypes.LIGHT_SCATTER.get()), x_pos_ratios, y_pos_ratios, z_pos_ratios, 10, 0.2, 0.2, 0.2, 0.1);
								if (just_guard) {
									if (entityiterator instanceof Player _player && !_player.level().isClientSide())
										_player.displayClientMessage(Component.literal("\u00A76\u00A7lJUST GUARD"), true);
								}
							} else {
								if (!(entityiterator instanceof Player) && entityiterator instanceof Mob) {
									if (world instanceof ServerLevel _level)
										_level.sendParticles(ParticleTypes.DAMAGE_INDICATOR, (entityiterator.getX()), (entityiterator.getY() + entityiterator.getBbHeight() / 2), (entityiterator.getZ()),
												(int) Math.round(old_health - (entityiterator instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1)), (entityiterator.getBbWidth() / 2), (entityiterator.getBbHeight() / 4),
												(entityiterator.getBbWidth() / 2), 0.05);
									if (world instanceof ServerLevel _level)
										_level.getServer().getCommands().performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL,
														new Vec3((entityiterator.getX() + (Math.random() - 0.5) * 2), (entityiterator.getY() + entityiterator.getBbHeight() / 2), (entityiterator.getZ() + (Math.random() - 0.5) * 2)), Vec2.ZERO, _level,
														4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
												("summon text_display ~ ~ ~ {glow_color_override:1b,billboard:\"center\",text:'{\"text\":\"" + "" + Math.round(old_health - (entityiterator instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1))
														+ "\",\"color\":\"white\",\"bold\":true}'}"));
									RanahiromodMod.queueServerWork(20, () -> {
										if (world instanceof ServerLevel _level)
											_level.getServer().getCommands()
													.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((entityiterator.getX()), (entityiterator.getY() + entityiterator.getBbHeight() / 2), (entityiterator.getZ())), Vec2.ZERO,
															_level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "kill @e[type=minecraft:text_display,sort=nearest,distance=..10]");
									});
								}
							}
						}
						EffectProcedure.execute(world, x, y, z, entity);
						if (entity.getPersistentData().getDouble("knockback") > 0) {
							knockback_sorce = entity.getPersistentData().getDouble("knockback");
						}
						if (knockback_sorce > 0) {
							knockback_sorce = knockback_sorce;
						}
						x_pos = entityiterator.getX() - entity.getX();
						y_pos = entityiterator.getY() - entity.getY();
						z_pos = entityiterator.getZ() - entity.getZ();
						dis = Math.sqrt(Math.pow(x_pos, 2) + Math.pow(y_pos, 2) + Math.pow(z_pos, 2));
						if (knockback_sorce > 0) {
							if (x_pos < 0) {
								x_pos = x_pos - knockback_sorce;
							} else if (x_pos > 0) {
								x_pos = x_pos + knockback_sorce;
							} else {
								x_pos = 0;
							}
							if (z_pos < 0) {
								x_pos = z_pos - knockback_sorce;
							} else if (z_pos > 0) {
								x_pos = z_pos + knockback_sorce;
							} else {
								z_pos = 0;
							}
							if (y_pos != 0) {
								y_pos = y_pos + knockback_sorce;
							} else {
								y_pos = 0;
							}
							x_knockback = 0.1 * x_pos;
							y_knockback = Math.min(0.1 * y_pos, 2);
							z_knockback = 0.1 * z_pos;
							if ((world.getBlockState(BlockPos.containing(x, y - 0.5, z))).getBlock() == Blocks.AIR) {
								x_knockback = x_knockback * 0.5;
								y_knockback = y_knockback * 0.5;
								z_knockback = z_knockback * 0.5;
							}
							if (entityiterator.isSprinting()) {
								x_knockback = x_knockback * 0.6;
								y_knockback = y_knockback * 0.6;
								z_knockback = z_knockback * 0.6;
							}
							knockback_power = (10 - (entity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).knockback_resistance) / 10;
							entityiterator.setDeltaMovement(new Vec3((x_knockback / knockback_power), (y_knockback / knockback_power), (z_knockback / knockback_power)));
						}
						if (entity.getPersistentData().getDouble("projectile_type") != 0) {
							change_projectile = entity.getPersistentData().getDouble("projectile_type");
							if (entity.getPersistentData().getDouble("projectile_type") == 1) {
								change_projectile = 2;
							} else if (entity.getPersistentData().getDouble("projectile_type") == 2) {
								change_projectile = 1;
							} else {
								change_projectile = 0;
							}
							entity.getPersistentData().putDouble("projectile_type2", change_projectile);
						}
						if (entity.getPersistentData().getDouble("projectile_type2") != 0 && (entityiterator instanceof Projectile _projEnt ? _projEnt.getDeltaMovement().length() : 0) > 0) {
							entityiterator.getPersistentData().putBoolean("flag_projectile", true);
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.SWEEP_ATTACK, x, y, z, 1, 0, 0, 0, 0);
							if (!entityiterator.level().isClientSide())
								entityiterator.discard();
						}
					}
				}
			}
		}
		entity.getPersistentData().putDouble("Damage", 0);
		entity.getPersistentData().putDouble("damage", 0);
		entity.getPersistentData().putDouble("knockback", 0);
		entity.getPersistentData().putDouble("Range", 0);
		entity.getPersistentData().putDouble("range", 0);
		entity.getPersistentData().putDouble("effect", 0);
		entity.getPersistentData().putDouble("projectile_type", 0);
		entity.getPersistentData().putDouble("projectile_type2", 0);
		entity.getPersistentData().putDouble("target_type", 0);
	}
}
