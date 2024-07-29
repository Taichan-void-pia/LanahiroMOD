package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.monster.warden.Warden;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import javax.annotation.Nullable;

import java.util.List;
import java.util.Comparator;

@Mod.EventBusSubscriber
public class AIWardenProcedure {
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
		double rnd = 0;
		double dis = 0;
		if (entity instanceof Warden) {
			if (entity.isAlive()) {
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(6 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if (!(entityiterator == entity)) {
							if (entityiterator instanceof LivingEntity) {
								if (!(entityiterator instanceof LivingEntity _livEnt4 && _livEnt4.hasEffect(MobEffects.INVISIBILITY))) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
										_entity.addEffect(new MobEffectInstance(MobEffects.POISON, 100, 2, false, false));
									if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
										_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 100, 1, false, false));
									if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
										_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 100, 1, false, false));
								}
							}
						}
					}
				}
				if (entity.getPersistentData().getDouble("mode") == 1) {
					SkillWardenhiro1Procedure.execute(world, entity);
				} else if (entity.getPersistentData().getDouble("mode") == 2) {
					SkillWardenhiro2Procedure.execute(world, x, y, z, entity);
				} else if (entity.getPersistentData().getDouble("mode") == 3) {
					SkillWardenhiro4Procedure.execute(world, x, y, z, entity);
				} else if (!((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity)) {
					entity.getPersistentData().putDouble("cnt_target", 0);
					if (entity.getPersistentData().getDouble("cnt_x") > 50) {
						entity.getPersistentData().putDouble("cnt_x", 50);
					}
				} else {
					entity.getPersistentData().putDouble("cnt_target", (entity.getPersistentData().getDouble("cnt_target") + 1));
					entity.getPersistentData().putDouble("cnt_x", (entity.getPersistentData().getDouble("cnt_x") + 1));
					if (entity.getPersistentData().getDouble("cnt_x") > 90) {
						entity.getPersistentData().putDouble("cnt_x", 0);
						entity.getPersistentData().putDouble("cnt1", 0);
						entity.getPersistentData().putDouble("cnt2", 0);
						entity.getPersistentData().putDouble("cnt3", 0);
						entity.getPersistentData().putDouble("cnt4", 0);
						entity.getPersistentData().putDouble("cnt5", 0);
						entity.getPersistentData().putDouble("cnt6", 0);
						entity.getPersistentData().putDouble("dis", 0);
						entity.getPersistentData().putDouble("NameRanged", 0);
						entity.getPersistentData().putDouble("x_pos", 0);
						entity.getPersistentData().putDouble("y_pos", 0);
						entity.getPersistentData().putDouble("z_pos", 0);
						entity.getPersistentData().putDouble("x_pos2", 0);
						entity.getPersistentData().putDouble("y_pos2", 0);
						entity.getPersistentData().putDouble("z_pos2", 0);
						entity.getPersistentData().putDouble("x_pos3", 0);
						entity.getPersistentData().putDouble("y_pos3", 0);
						entity.getPersistentData().putDouble("z_pos3", 0);
						entity.getPersistentData().putBoolean("loop", false);
						entity.getPersistentData().putBoolean("flag_a", false);
						entity.getPersistentData().putBoolean("flag_b", false);
						entity.getPersistentData().putDouble("skill2", 1);
						for (int index0 = 0; index0 < 50; index0++) {
							rnd = Math.ceil(Math.random() * 3);
							break;
						}
						entity.getPersistentData().putDouble("mode", rnd);
						DirectionProcedure.execute(entity);
					}
				}
				if (entity.getPersistentData().getDouble("skill2") == 0) {
					entity.getPersistentData().putDouble("mode", 0);
				}
			}
		}
	}
}
