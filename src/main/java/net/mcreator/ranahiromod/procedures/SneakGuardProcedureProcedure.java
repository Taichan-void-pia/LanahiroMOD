package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.ranahiromod.init.RanahiromodModMobEffects;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SneakGuardProcedureProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player.getX(), event.player.getY(), event.player.getZ(), event.player);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double rad = 0;
		double xPos = 0;
		double yPos = 0;
		double zPos = 0;
		double rotate = 0;
		double vectorX = 0;
		double vectorZ = 0;
		double magnification = 0;
		double dis = 0;
		double y_vector = 0;
		boolean type = false;
		if (entity.isShiftKeyDown()) {
			if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) > 0) {
				if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(RanahiromodModMobEffects.GUARD_PROTECTION.get()) ? _livEnt.getEffect(RanahiromodModMobEffects.GUARD_PROTECTION.get()).getDuration() : 0) <= 5) {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(RanahiromodModMobEffects.GUARD_PROTECTION.get(), 30,
								entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0, false, true));
					entity.getPersistentData().putDouble("sneakguard_level",
							(entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(RanahiromodModMobEffects.GUARD_PROTECTION.get()) ? _livEnt.getEffect(RanahiromodModMobEffects.GUARD_PROTECTION.get()).getAmplifier() : 0));
					entity.getPersistentData().putDouble("sneakguard_tick",
							(entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(RanahiromodModMobEffects.GUARD_PROTECTION.get()) ? _livEnt.getEffect(RanahiromodModMobEffects.GUARD_PROTECTION.get()).getDuration() : 0));
					for (int index0 = 0; index0 < 36; index0++) {
						rad = Math.toRadians(rotate);
						xPos = x + Math.cos(rad) * 2;
						yPos = y;
						zPos = z + Math.sin(rad) * 2;
						vectorX = Math.cos(rad + Math.toRadians(rotate)) * (-0.3);
						vectorZ = Math.sin(rad + Math.toRadians(rotate)) * (-0.3);
						dis = 2;
						magnification = 1.5 / dis;
						world.addParticle(ParticleTypes.END_ROD, (x + (-1) * (xPos - x) * magnification), yPos, (z + (-1) * (zPos - z) * magnification), ((-1) * vectorX), y_vector, ((-1) * vectorZ));
						magnification = 1 / dis;
						world.addParticle(ParticleTypes.END_ROD, (x + (xPos - x) * magnification), yPos, (z + (zPos - z) * magnification), vectorX, y_vector, vectorZ);
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.ENCHANTED_HIT, (entity.getX()), (entity.getY() + entity.getBbHeight() / 2), (entity.getZ()), 3, (entity.getBbWidth() / 2), (entity.getBbHeight() / 4), (entity.getBbWidth() / 2), 0.05);
						rotate = rotate + 10;
						if (type) {
							if (y_vector > 0.3) {
								type = false;
							}
							y_vector = y_vector + 0.05;
						} else if (!type) {
							y_vector = y_vector - 0.05;
							if (y_vector <= 0) {
								type = true;
							}
						}
					}
					if (!(entity instanceof ServerPlayer _plr19 && _plr19.level() instanceof ServerLevel
							&& _plr19.getAdvancements().getOrStartProgress(_plr19.server.getAdvancements().getAdvancement(new ResourceLocation("ranahiromod:protect_your_self"))).isDone())) {
						if (entity instanceof ServerPlayer _player) {
							Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("ranahiromod:protect_your_self"));
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
				}
			}
		}
	}
}
