package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.ranahiromod.init.RanahiromodModEnchantments;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class RainbowProtectionEnchantProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double Level = 0;
		double level_math = 0;
		double MaxEnchantmentLevel = 0;
		double TickDuration = 0;
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == Items.ELYTRA) {
			if (EnchantmentHelper.getItemEnchantmentLevel(RanahiromodModEnchantments.RAINBOW_FORCE_POWER.get(), (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY)) != 0) {
				if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getEnchantmentLevel(RanahiromodModEnchantments.RAINBOW_FORCE_POWER.get()) != 0) {
					if (entity instanceof LivingEntity _livEnt6 && _livEnt6.isFallFlying()) {
						if (entity.isShiftKeyDown()) {
							entity.setDeltaMovement(new Vec3(Math.max(Math.min(entity.getDeltaMovement().x() * 2, 5), -5), Math.max(Math.min(entity.getDeltaMovement().y() * 2, 5), -5), Math.max(Math.min(entity.getDeltaMovement().z() * 2, 5), -5)));
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.bat.takeoff")), SoundSource.NEUTRAL, 1, (float) 0.6);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.bat.takeoff")), SoundSource.NEUTRAL, 1, (float) 0.6, false);
								}
							}
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.WITCH, x, y, z, 30, 0.3, 0.3, 0.3, 0.05);
						}
						Level = (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getEnchantmentLevel(RanahiromodModEnchantments.RAINBOW_FORCE_POWER.get());
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "particle dust_color_transition 1.000 0.000 0.000 1 1.000 1.000 1.000 ^0.8 ^ ^ 0 0 0 1 2 force");
							}
						}
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "particle dust_color_transition 1.000 0.435 0.000 1 1.000 1.000 1.000 ^0.55 ^ ^ 0 0 0 1 2 force");
							}
						}
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "particle dust_color_transition 0.933 1.000 0.000 1 1.000 1.000 1.000 ^0.3 ^ ^ 0 0 0 1 2 force");
							}
						}
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "particle dust_color_transition 0.067 1.000 0.000 1 1.000 1.000 1.000 ^0.05 ^ ^ 0 0 0 1 2 force");
							}
						}
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "particle dust_color_transition 0.000 0.933 1.000 1 1.000 1.000 1.000 ^-0.2 ^ ^ 0 0 0 1 2 force");
							}
						}
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "particle dust_color_transition 0.000 0.000 1.000 1 1.000 1.000 1.000 ^-0.45 ^ ^ 0 0 0 1 2 force");
							}
						}
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "particle dust_color_transition 1.000 0.000 1.000 1 1.000 1.000 1.000 ^-0.7 ^ ^ 0 0 0 1 2 force");
							}
						}
						level_math = Math.round(Math.max(Level - 1, 0));
						TickDuration = 1200;
						if (Level >= 6) {
							TickDuration = Math.round(1200 + (Level - 5) * 120);
						}
						if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.JUMP) ? _livEnt.getEffect(MobEffects.JUMP).getDuration() : 0) <= 600) {
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.JUMP, (int) TickDuration, (int) Math.min(level_math, 4), false, false));
						}
						if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DIG_SPEED) ? _livEnt.getEffect(MobEffects.DIG_SPEED).getDuration() : 0) <= 600) {
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, (int) TickDuration, (int) Math.min(level_math, 3), false, false));
						}
						if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.REGENERATION) ? _livEnt.getEffect(MobEffects.REGENERATION).getDuration() : 0) <= 600) {
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, (int) TickDuration, (int) Math.min(level_math, 2), false, false));
						}
						if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.FIRE_RESISTANCE) ? _livEnt.getEffect(MobEffects.FIRE_RESISTANCE).getDuration() : 0) <= 600) {
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, (int) TickDuration, 0, false, false));
						}
						if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.WATER_BREATHING) ? _livEnt.getEffect(MobEffects.WATER_BREATHING).getDuration() : 0) <= 600) {
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, (int) TickDuration, 0, false, false));
						}
						if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.NIGHT_VISION) ? _livEnt.getEffect(MobEffects.NIGHT_VISION).getDuration() : 0) <= 600) {
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, (int) TickDuration, 0, false, false));
						}
					}
				}
			}
		}
	}
}
