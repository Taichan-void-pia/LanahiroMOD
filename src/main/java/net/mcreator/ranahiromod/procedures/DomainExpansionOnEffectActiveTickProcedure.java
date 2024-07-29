package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.ranahiromod.init.RanahiromodModMobEffects;

import java.util.List;
import java.util.Comparator;

public class DomainExpansionOnEffectActiveTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		boolean failed = false;
		double range = 0;
		double x_pos = 0;
		double y_pos = 0;
		double z_pos = 0;
		if (entity.getPersistentData().getDouble("skill2_domain") == 0) {
			if (entity.getPersistentData().getDouble("skill2") == 0) {
				entity.getPersistentData().putDouble("skill2_domain", (entity.getPersistentData().getDouble("domain_select")));
				entity.getPersistentData().putDouble("domain_select", 0);
			}
		} else if (entity.getPersistentData().getDouble("skill2_domain") > 0) {
			range = 50;
			if (entity.getPersistentData().getDouble("skill2_domain") == 1) {
				range = 100;
				if (entity.getPersistentData().getBoolean("domain_off")) {
					range = range - 50;
					DomainExpansionMochiActiveProcedure.execute(world, entity);
				}
			}
		}
		{
			final Vec3 _center = new Vec3((entity.getPersistentData().getDouble("x_pos_domain")), (entity.getPersistentData().getDouble("y_pos_domain")), (entity.getPersistentData().getDouble("z_pos_domain")));
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(25 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (!failed && !entity.getPersistentData().getBoolean("Cover")) {
					entity.getPersistentData().putBoolean("failed", false);
					entity.getPersistentData().putBoolean("Cover", true);
					entity.getPersistentData().putDouble("cnt_cover", 1);
					entity.getPersistentData().putBoolean("flag_domain", false);
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(RanahiromodModMobEffects.DOMAIN_EXPANSION.get(),
								(int) ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(RanahiromodModMobEffects.DOMAIN_EXPANSION.get()) ? _livEnt.getEffect(RanahiromodModMobEffects.DOMAIN_EXPANSION.get()).getDuration() : 0) + 100), 0,
								true, false));
					entity.getPersistentData().putDouble("x_pos_domain2", Math.round(entity.getX()));
					entity.getPersistentData().putDouble("y_pos_domain2", Math.round(entity.getY()));
					entity.getPersistentData().putDouble("z_pos_domain2", Math.round(entity.getZ()));
					if (entity.getPersistentData().getBoolean("failed")) {
						x_pos = entity.getX();
						y_pos = entity.getY();
						z_pos = entity.getZ();
					} else {
						x_pos = entity.getPersistentData().getDouble("x_pos_domain");
						y_pos = entity.getPersistentData().getDouble("y_pos_domain");
						z_pos = entity.getPersistentData().getDouble("z_pos_domain");
					}
					SkillDomainExpansionBattleProcedure.execute(world, x_pos, y_pos, z_pos, entity);
					if (entity.getPersistentData().getBoolean("Cover")) {
						entity.getPersistentData().putDouble("cnt_cover", (entity.getPersistentData().getDouble("cnt_cover") + 1));
						if (entity.getPersistentData().getDouble("cnt_cover") > 50) {
							entity.getPersistentData().putBoolean("Cover", false);
						}
					}
				}
			}
		}
	}
}
