package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.ranahiromod.init.RanahiromodModMobEffects;

public class SkillMottieDomainProcedure {
	public static void execute(Entity entity) {
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
		UseMottie = UsePlayerLogicMochiProcedure.execute(entity);
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
			if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(RanahiromodModMobEffects.DOMAIN_EXPANSION.get()) ? _livEnt.getEffect(RanahiromodModMobEffects.DOMAIN_EXPANSION.get()).getDuration() : 0) != 0) {
				entity.getPersistentData().putDouble("x_pos_domain",
						Math.round(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(12)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()));
				entity.getPersistentData().putDouble("y_pos_domain", Math.round(entity.getY()));
				entity.getPersistentData().putDouble("z_pos_domain",
						Math.round(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(12)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()));
			}
		}
	}
}
