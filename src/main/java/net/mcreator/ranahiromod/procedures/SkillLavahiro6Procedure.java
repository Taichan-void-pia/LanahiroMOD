package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

public class SkillLavahiro6Procedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		boolean type = false;
		double zPos = 0;
		double yPos = 0;
		double xPos = 0;
		double dis2 = 0;
		double dis = 0;
		double y_power = 0;
		double z_power = 0;
		double rad = 0;
		double rad_now = 0;
		double x_power = 0;
		double num1 = 0;
		double pitch = 0;
		double num3 = 0;
		double num2 = 0;
		double dis_range = 0;
		double rotate = 0;
		entity.getPersistentData().putDouble("cnt1", (entity.getPersistentData().getDouble("cnt1") + 1));
		if (entity.getPersistentData().getDouble("cnt1") == 1) {
			if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity) {
				entity.getPersistentData().putDouble("x_pos", ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX()));
				entity.getPersistentData().putDouble("y_pos", ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY()));
				entity.getPersistentData().putDouble("z_pos", ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ()));
			} else {
				entity.getPersistentData().putDouble("x_pos",
						(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()));
				entity.getPersistentData().putDouble("z_pos",
						(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()));
				entity.getPersistentData().putDouble("y_pos", (entity.getY()));
				for (int index0 = 0; index0 < 50; index0++) {
					entity.getPersistentData().putDouble("y_pos", (entity.getPersistentData().getDouble("y_pos") - 1));
					if (world.getBlockState(BlockPos.containing(entity.getPersistentData().getDouble("x_pos"), entity.getPersistentData().getDouble("y_pos"), entity.getPersistentData().getDouble("z_pos"))).canOcclude()) {
						break;
					}
				}
			}
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
		}
		x_power = entity.getPersistentData().getDouble("x_pos");
		y_power = entity.getPersistentData().getDouble("y_pos");
		z_power = entity.getPersistentData().getDouble("z_pos");
		for (int index1 = 0; index1 < 72; index1++) {
			rotate = rotate + 5;
			rad = Math.toRadians(rotate);
			dis = 6;
			xPos = x_power + Math.cos(rad) * dis;
			yPos = y_power + 0.1;
			zPos = z_power + Math.sin(rad) * dis;
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.CLOUD, xPos, yPos, zPos, 3, 0.1, 0.1, 0.1, 0.01);
		}
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.FLAME, x_power, y_power, z_power, 10, 3, 5, 3, 0.05);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.SOUL_FIRE_FLAME, x_power, y_power, z_power, 15, 3, 5, 3, 0.05);
		entity.getPersistentData().putDouble("damage", (14 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
		entity.getPersistentData().putDouble("knockback", 0.1);
		entity.getPersistentData().putDouble("range", 6);
		DodamageProcedure.execute(world, x_power, y_power, z_power, entity);
		if (entity.getPersistentData().getDouble("cnt1") > 30) {
			entity.getPersistentData().putDouble("skill2", 0);
		}
	}
}
