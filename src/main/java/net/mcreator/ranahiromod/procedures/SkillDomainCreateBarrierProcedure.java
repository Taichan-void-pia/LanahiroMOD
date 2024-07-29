package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.ranahiromod.init.RanahiromodModMobEffects;
import net.mcreator.ranahiromod.init.RanahiromodModEntities;
import net.mcreator.ranahiromod.entity.EntityDomainExpansionEntity;

import java.util.List;
import java.util.Comparator;

public class SkillDomainCreateBarrierProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double xPos = 0;
		double yPos = 0;
		double zPos = 0;
		double rad = 0;
		double rad_now = 0;
		double yaw_now = 0;
		double dis = 0;
		double dis_start = 0;
		boolean UseMottie = false;
		boolean update_pos = false;
		BlockState a = Blocks.AIR.defaultBlockState();
		String a_st = "";
		entity.getPersistentData().putDouble("cnt1", (entity.getPersistentData().getDouble("cnt1") + 1));
		if (entity.getPersistentData().getDouble("cnt1") == 1) {
			if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity) {
				RotateEntityProcedure.execute(
						(entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).level()
								.clip(new ClipContext((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getEyePosition(1f),
										(entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getEyePosition(1f).add((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getViewVector(1f).scale(0)),
										ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null)))
								.getBlockPos().getX(),
						(entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).level()
								.clip(new ClipContext((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getEyePosition(1f),
										(entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getEyePosition(1f).add((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getViewVector(1f).scale(0)),
										ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null)))
								.getBlockPos().getY(),
						(entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).level()
								.clip(new ClipContext((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getEyePosition(1f),
										(entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getEyePosition(1f).add((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getViewVector(1f).scale(0)),
										ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null)))
								.getBlockPos().getZ(),
						entity);
			}
			if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(RanahiromodModMobEffects.DOMAIN_EXPANSION.get()) ? _livEnt.getEffect(RanahiromodModMobEffects.DOMAIN_EXPANSION.get()).getDuration() : 0) == 0) {
				entity.getPersistentData().putDouble("x_pos_domain",
						Math.round(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(12)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()));
				entity.getPersistentData().putDouble("y_pos_domain", Math.round(entity.getY()));
				entity.getPersistentData().putDouble("z_pos_domain",
						Math.round(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(12)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()));
				if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity) {
					entity.getPersistentData().putDouble("y_pos_domain", Math.min(Math.round(entity.getY()), Math.round((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY())));
				}
			}
			entity.getPersistentData().putDouble("x_pos_domain2", Math.round(x));
			entity.getPersistentData().putDouble("y_pos_domain2", Math.round(y));
			entity.getPersistentData().putDouble("z_pos_domain2", Math.round(z));
			entity.getPersistentData().putBoolean("failed", false);
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(25 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if ((!(entity instanceof LivingEntity _livEnt28 && _livEnt28.hasEffect(RanahiromodModMobEffects.DOMAIN_EXPANSION.get())) || entityiterator.getPersistentData().getDouble("domain_select") == 0) && !(entityiterator == entity)) {
						if (!(entity instanceof LivingEntity _livEnt31 && _livEnt31.hasEffect(MobEffects.MOVEMENT_SLOWDOWN))) {
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 60, 9, false, false));
						}
						if (entity instanceof Player _player)
							_player.getCooldowns().addCooldown((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem(), 1000);
						dis = Math.sqrt(Math.pow(x - entityiterator.getPersistentData().getDouble("x_pos_domain"), 2) + Math.pow(y - entityiterator.getPersistentData().getDouble("y_pos_domain"), 2)
								+ Math.pow(z - entityiterator.getPersistentData().getDouble("z_pos_domain"), 2));
						if ((entityiterator.getPersistentData().getDouble("domain_select") != 1 || entityiterator.getPersistentData().getDouble("skill2_domain") != 1) && !entityiterator.getPersistentData().getBoolean("domain_off")) {
							if (dis <= 25) {
								entity.getPersistentData().putDouble("x_pos_domain", (entityiterator.getPersistentData().getDouble("x_pos_domain")));
								entity.getPersistentData().putDouble("y_pos_domain", (entityiterator.getPersistentData().getDouble("y_pos_domain")));
								entity.getPersistentData().putDouble("z_pos_domain", (entityiterator.getPersistentData().getDouble("z_pos_domain")));
								update_pos = true;
							}
						} else {
							entityiterator.getPersistentData().putDouble("x_pos_domain", (entity.getPersistentData().getDouble("x_pos_domain")));
							entityiterator.getPersistentData().putDouble("y_pos_domain", (entity.getPersistentData().getDouble("y_pos_domain")));
							entityiterator.getPersistentData().putDouble("z_pos_domain", (entity.getPersistentData().getDouble("z_pos_domain")));
							update_pos = true;
						}
						if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST)
								? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier()
								: 0) <= (entityiterator instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) && !(entityiterator == entity)) {
							if ((entityiterator instanceof LivingEntity _livEnt && _livEnt.hasEffect(RanahiromodModMobEffects.DOMAIN_EXPANSION.get()) ? _livEnt.getEffect(RanahiromodModMobEffects.DOMAIN_EXPANSION.get()).getDuration() : 0) == 0
									|| (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(RanahiromodModMobEffects.DOMAIN_EXPANSION.get()) ? _livEnt.getEffect(RanahiromodModMobEffects.DOMAIN_EXPANSION.get()).getDuration() : 0) == 0) {
								entity.getPersistentData().putBoolean("failed", true);
							}
							entityiterator.getPersistentData().putBoolean("DomainDefeated", true);
							if (entityiterator instanceof LivingEntity _entity)
								_entity.removeEffect(RanahiromodModMobEffects.DOMAIN_EXPANSION.get());
							if (entityiterator.getPersistentData().getDouble("domain_select") > 0) {
								entityiterator.getPersistentData().putDouble("domain_select", 0);
								entityiterator.getPersistentData().putDouble("skill2", 0);
							}
						}
					}
				}
			}
			if (entity.getPersistentData().getBoolean("failed")) {
				if (entity.getPersistentData().getDouble("cnt1") < 34) {
					entity.getPersistentData().putDouble("cnt1", 34);
				} else {
					entity.getPersistentData().putDouble("cnt1", 55);
				}
			} else {
				xPos = entity.getPersistentData().getDouble("x_pos_domain");
				yPos = entity.getPersistentData().getDouble("y_pos_domain");
				zPos = entity.getPersistentData().getDouble("z_pos_domain");
				if (entity.getPersistentData().getDouble("cnt1") == 1 && !world.getEntitiesOfClass(EntityDomainExpansionEntity.class, AABB.ofSize(new Vec3(x, y, z), 2, 2, 2), e -> true).isEmpty()) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = RanahiromodModEntities.ENTITY_DOMAIN_EXPANSION.get().spawn(_level, BlockPos.containing(xPos, yPos, zPos), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot((float) (Math.random() * 360));
							entityToSpawn.setYBodyRot((float) (Math.random() * 360));
							entityToSpawn.setYHeadRot((float) (Math.random() * 360));
						}
					}
				}
				SkillDomainExpansionBattleProcedure.execute(world, xPos, yPos, zPos, entity);
			}
			if (entity.getPersistentData().getDouble("cnt1") >= 50) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(RanahiromodModMobEffects.DOMAIN_EXPANSION.get(), 600, 0, false, false));
				entity.getPersistentData().putDouble("skill2", 0);
			}
		}
	}
}
