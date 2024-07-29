package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.ranahiromod.network.RanahiromodModVariables;
import net.mcreator.ranahiromod.entity.WindhiroEntity;
import net.mcreator.ranahiromod.entity.WaterhiroEntity;
import net.mcreator.ranahiromod.entity.WardenhiroEntity;
import net.mcreator.ranahiromod.entity.OnihiroEntity;
import net.mcreator.ranahiromod.entity.LavahiroEntity;
import net.mcreator.ranahiromod.entity.GroundhiroEntity;
import net.mcreator.ranahiromod.entity.GodTaichanEntity;
import net.mcreator.ranahiromod.entity.DragonhiroEntity;
import net.mcreator.ranahiromod.entity.Bosshiro3CodePhoenixEntity;
import net.mcreator.ranahiromod.entity.BolthiroEntity;

import java.util.List;
import java.util.Comparator;

public class RanahiroZokuDiedTriggerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		boolean advancement = false;
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(20 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (!(entityiterator == entity)) {
					if (entityiterator instanceof Player) {
						if (sourceentity instanceof Player || (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof Player) {
							if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("ranahiromod:ranahiro_tag")))) {
								RanahiromodModVariables.MapVariables.get(world).rnd_tick_speed = RanahiromodModVariables.MapVariables.get(world).rnd_tick_speed + 1;
								RanahiromodModVariables.MapVariables.get(world).syncData(world);
							}
							if (entity instanceof LavahiroEntity) {
								if (!(entityiterator instanceof ServerPlayer _plr7 && _plr7.level() instanceof ServerLevel
										&& _plr7.getAdvancements().getOrStartProgress(_plr7.server.getAdvancements().getAdvancement(new ResourceLocation("ranahiromod:kill_lavahiro"))).isDone())) {
									if (entityiterator instanceof ServerPlayer _player) {
										Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("ranahiromod:kill_lavahiro"));
										AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
										if (!_ap.isDone()) {
											for (String criteria : _ap.getRemainingCriteria())
												_player.getAdvancements().award(_adv, criteria);
										}
									}
								}
							}
							if (entity instanceof WaterhiroEntity) {
								if (!(entityiterator instanceof ServerPlayer _plr10 && _plr10.level() instanceof ServerLevel
										&& _plr10.getAdvancements().getOrStartProgress(_plr10.server.getAdvancements().getAdvancement(new ResourceLocation("ranahiromod:kill_waterhiro"))).isDone())) {
									if (entityiterator instanceof ServerPlayer _player) {
										Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("ranahiromod:kill_waterhiro"));
										AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
										if (!_ap.isDone()) {
											for (String criteria : _ap.getRemainingCriteria())
												_player.getAdvancements().award(_adv, criteria);
										}
									}
								}
							}
							if (entity instanceof WindhiroEntity) {
								if (!(entityiterator instanceof ServerPlayer _plr13 && _plr13.level() instanceof ServerLevel
										&& _plr13.getAdvancements().getOrStartProgress(_plr13.server.getAdvancements().getAdvancement(new ResourceLocation("ranahiromod:kill_windhiro"))).isDone())) {
									if (entityiterator instanceof ServerPlayer _player) {
										Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("ranahiromod:kill_windhiro"));
										AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
										if (!_ap.isDone()) {
											for (String criteria : _ap.getRemainingCriteria())
												_player.getAdvancements().award(_adv, criteria);
										}
									}
								}
							}
							if (entity instanceof DragonhiroEntity) {
								if (!(entityiterator instanceof ServerPlayer _plr16 && _plr16.level() instanceof ServerLevel
										&& _plr16.getAdvancements().getOrStartProgress(_plr16.server.getAdvancements().getAdvancement(new ResourceLocation("ranahiromod:kill_dragonhiro"))).isDone())) {
									if (entityiterator instanceof ServerPlayer _player) {
										Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("ranahiromod:kill_dragonhiro"));
										AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
										if (!_ap.isDone()) {
											for (String criteria : _ap.getRemainingCriteria())
												_player.getAdvancements().award(_adv, criteria);
										}
									}
								}
							}
							if (entity instanceof OnihiroEntity) {
								if (!(entityiterator instanceof ServerPlayer _plr19 && _plr19.level() instanceof ServerLevel
										&& _plr19.getAdvancements().getOrStartProgress(_plr19.server.getAdvancements().getAdvancement(new ResourceLocation("ranahiromod:kill_demonhiro"))).isDone())) {
									if (entityiterator instanceof ServerPlayer _player) {
										Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("ranahiromod:kill_demonhiro"));
										AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
										if (!_ap.isDone()) {
											for (String criteria : _ap.getRemainingCriteria())
												_player.getAdvancements().award(_adv, criteria);
										}
									}
								}
							}
							if (entity instanceof BolthiroEntity) {
								if (!(entityiterator instanceof ServerPlayer _plr22 && _plr22.level() instanceof ServerLevel
										&& _plr22.getAdvancements().getOrStartProgress(_plr22.server.getAdvancements().getAdvancement(new ResourceLocation("ranahiromod:kill_volthiro"))).isDone())) {
									if (entityiterator instanceof ServerPlayer _player) {
										Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("ranahiromod:kill_volthiro"));
										AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
										if (!_ap.isDone()) {
											for (String criteria : _ap.getRemainingCriteria())
												_player.getAdvancements().award(_adv, criteria);
										}
									}
								}
							}
							if (entity instanceof WardenhiroEntity) {
								if (!(entityiterator instanceof ServerPlayer _plr25 && _plr25.level() instanceof ServerLevel
										&& _plr25.getAdvancements().getOrStartProgress(_plr25.server.getAdvancements().getAdvancement(new ResourceLocation("ranahiromod:kill_wardenhiro"))).isDone())) {
									if (entityiterator instanceof ServerPlayer _player) {
										Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("ranahiromod:kill_wardenhiro"));
										AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
										if (!_ap.isDone()) {
											for (String criteria : _ap.getRemainingCriteria())
												_player.getAdvancements().award(_adv, criteria);
										}
									}
								}
							}
							if (entity instanceof GroundhiroEntity) {
								if (!(entityiterator instanceof ServerPlayer _plr28 && _plr28.level() instanceof ServerLevel
										&& _plr28.getAdvancements().getOrStartProgress(_plr28.server.getAdvancements().getAdvancement(new ResourceLocation("ranahiromod:kill_groundhiro"))).isDone())) {
									if (entityiterator instanceof ServerPlayer _player) {
										Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("ranahiromod:kill_groundhiro"));
										AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
										if (!_ap.isDone()) {
											for (String criteria : _ap.getRemainingCriteria())
												_player.getAdvancements().award(_adv, criteria);
										}
									}
								}
							}
							if (entity instanceof Bosshiro3CodePhoenixEntity) {
								if (!(entityiterator instanceof ServerPlayer _plr31 && _plr31.level() instanceof ServerLevel
										&& _plr31.getAdvancements().getOrStartProgress(_plr31.server.getAdvancements().getAdvancement(new ResourceLocation("ranahiromod:kill_bosshiro"))).isDone())) {
									if (entityiterator instanceof ServerPlayer _player) {
										Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("ranahiromod:kill_bosshiro"));
										AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
										if (!_ap.isDone()) {
											for (String criteria : _ap.getRemainingCriteria())
												_player.getAdvancements().award(_adv, criteria);
										}
									}
								}
							}
							if (entity instanceof GodTaichanEntity) {
								if (!(entityiterator instanceof ServerPlayer _plr34 && _plr34.level() instanceof ServerLevel
										&& _plr34.getAdvancements().getOrStartProgress(_plr34.server.getAdvancements().getAdvancement(new ResourceLocation("ranahiromod:kill_taichan"))).isDone())) {
									if (entityiterator instanceof ServerPlayer _player) {
										Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("ranahiromod:kill_taichan"));
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
		}
	}
}
