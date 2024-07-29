package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.tags.TagKey;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.ranahiromod.init.RanahiromodModGameRules;
import net.mcreator.ranahiromod.init.RanahiromodModEnchantments;
import net.mcreator.ranahiromod.entity.Bosshiro3CodePhoenixEntity;
import net.mcreator.ranahiromod.entity.Bosshiro2Entity;

public class ActiveHashiraProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double level = 0;
		double strength_mag = 0;
		double x_pos = 0;
		double y_pos = 0;
		double z_pos = 0;
		double dis = 0;
		double distance = 0;
		if (world.getLevelData().getGameRules().getBoolean(RanahiromodModGameRules.NIGHTMARE_MODE)) {
			strength_mag = 2;
		} else {
			strength_mag = 1;
		}
		if (!(entity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(MobEffects.MOVEMENT_SPEED))) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, (int) Double.POSITIVE_INFINITY, 1, false, false));
		}
		if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity && entity.getPersistentData().getDouble("mode") == 0 && GetDistanceProcedure.execute(entity) > 18) {
			level = (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3;
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 10, (int) level, false, false));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.JUMP, 20, (int) level, false, false));
		}
		if (!(entity instanceof LivingEntity _livEnt9 && _livEnt9.hasEffect(MobEffects.DAMAGE_BOOST))) {
			if (entity instanceof Bosshiro2Entity) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, (int) Double.POSITIVE_INFINITY, (int) (31 * strength_mag), false, false));
			} else if (entity instanceof Bosshiro3CodePhoenixEntity) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, (int) Double.POSITIVE_INFINITY, (int) (34 * strength_mag), false, false));
			} else {
				if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("ranahiromod:ranahiro_tag")))) {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, (int) Double.POSITIVE_INFINITY, (int) (19 * strength_mag), false, false));
				} else {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, (int) Double.POSITIVE_INFINITY, (int) (14 * strength_mag), false, false));
				}
			}
		}
		if (!(entity instanceof LivingEntity _livEnt17 && _livEnt17.hasEffect(MobEffects.DAMAGE_RESISTANCE))) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, (int) Double.POSITIVE_INFINITY, 3, false, false));
		}
		if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity) {
			entity.getPersistentData().putDouble("cnt_z", (entity.getPersistentData().getDouble("cnt_z") + 1));
		} else if (!((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity)) {
			entity.getPersistentData().putDouble("cnt_z", 0);
		}
		if (entity.getPersistentData().getDouble("cnt_z") > 80) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 30, 10));
			if (entity.getPersistentData().getDouble("skill2") != 0) {
				entity.getPersistentData().putDouble("cnt_z", 80);
			}
		}
		if (entity.getPersistentData().getDouble("cnt_z") > 100) {
			if (entity.getPersistentData().getDouble("skill2") != 0) {
				entity.getPersistentData().putDouble("cnt_z", 80);
			}
			if (entity.getPersistentData().getDouble("cnt_z") == 101) {
				entity.getPersistentData().putDouble("x_pos", (entity.getX()));
				entity.getPersistentData().putDouble("y_pos", (entity.getY()));
				entity.getPersistentData().putDouble("z_pos", (entity.getZ()));
				entity.setDeltaMovement(new Vec3(((Math.random() - 0.5) * 1), 0, ((Math.random() - 0.5) * 1)));
			}
			if (entity.getPersistentData().getDouble("cnt_z") > 105) {
				entity.getPersistentData().putDouble("cnt_z", 0);
				entity.setDeltaMovement(new Vec3(0, 0, 0));
			} else if (entity.getPersistentData().getDouble("cnt_z") > 100) {
				dis = 26;
				x_pos = entity.getPersistentData().getDouble("x_pos") - entity.getX();
				y_pos = entity.getPersistentData().getDouble("y_pos") - entity.getY();
				z_pos = entity.getPersistentData().getDouble("z_pos") - entity.getZ();
				distance = Math.sqrt(Math.pow(x_pos, 2) + Math.pow(y_pos, 2) + Math.pow(z_pos, 2));
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.CLOUD, x, y, z, 10, 0.1, 0.1, 0.1, 0.2);
				entity.setDeltaMovement(new Vec3(((entity.getPersistentData().getDouble("x_pos") + (Math.random() - 0.5) * dis) - entity.getX()), 0, ((entity.getPersistentData().getDouble("z_pos") + (Math.random() - 0.5) * dis) - entity.getZ())));
				entity.getPersistentData().putDouble("cnt_x", (entity.getPersistentData().getDouble("cnt_x") - 2));
			}
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) / 2 > (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1)) {
			if (!entity.getPersistentData().getBoolean("harf_health_trigger")) {
				if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("ranahiromod:ranahiro_tag")))) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie_villager.cure")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie_villager.cure")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, (int) Double.POSITIVE_INFINITY, (int) (24 * strength_mag), false, false));
					if (entity instanceof Bosshiro2Entity) {
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, (int) Double.POSITIVE_INFINITY, (int) (33 * strength_mag), false, false));
					} else if (entity instanceof Bosshiro3CodePhoenixEntity) {
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, (int) Double.POSITIVE_INFINITY, (int) (37 * strength_mag), false, false));
					}
				} else {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie_villager.cure")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie_villager.cure")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, (int) Double.POSITIVE_INFINITY, (int) (17 * strength_mag), false, false));
				}
				entity.getPersistentData().putBoolean("harf_health_trigger", true);
			}
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) / 4 > (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1)) {
			if (!entity.getPersistentData().getBoolean("harf_and_harf_health_trigger")) {
				if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("ranahiromod:friendly")))) {
					if (!(EnchantmentHelper.getItemEnchantmentLevel(RanahiromodModEnchantments.RANAHIRO_SLAYER.get(), (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0)) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.blaze.shoot")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.blaze.shoot")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
						(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).enchant(Enchantments.SHARPNESS, 10);
						(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).enchant(RanahiromodModEnchantments.RANAHIRO_SLAYER.get(), 3);
					}
				}
				entity.getPersistentData().putBoolean("harf_and_harf_health_trigger", true);
			}
		}
		ActiveHashira2Procedure.execute(world, x, y, z, entity);
	}
}
