package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

public class SkillWindhiro1Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double xPos = 0;
		double yPos = 0;
		double zPos = 0;
		double range = 0;
		double rad = 0;
		double rad_now = 0;
		double dis = 0;
		boolean type = false;
		entity.getPersistentData().putDouble("cnt1", (entity.getPersistentData().getDouble("cnt1") + 1));
		if (entity.getPersistentData().getDouble("cnt1") < 5) {
			if (entity.getPersistentData().getDouble("cnt1") == 1) {
				xPos = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX();
				yPos = y + 1;
				zPos = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ();
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.NEUTRAL, 1, (float) 0.5);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.NEUTRAL, 1, (float) 0.5, false);
					}
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.EXPLOSION, xPos, yPos, zPos, 15, 1, 1, 1, 0.2);
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
				entity.getPersistentData().putDouble("x_pos", xPos);
				entity.getPersistentData().putDouble("y_pos", yPos);
				entity.getPersistentData().putDouble("z_pos", zPos);
				entity.getPersistentData().putDouble("start_r", (entity.getYRot() + 90));
			} else {
				dis = (entity.getPersistentData().getDouble("cnt1") - 1) * 2;
				for (int index0 = 0; index0 < 2; index0++) {
					type = !type;
					if (type) {
						rad = Math.toRadians(entity.getPersistentData().getDouble("start_r")) + 20;
					} else {
						rad = Math.toRadians(entity.getPersistentData().getDouble("start_r")) - 20;
					}
					xPos = entity.getPersistentData().getDouble("x_pos") + Math.cos(rad) * dis;
					yPos = entity.getPersistentData().getDouble("y_pos");
					zPos = entity.getPersistentData().getDouble("z_pos") + Math.sin(rad) * dis;
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.EXPLOSION, xPos, yPos, zPos, 15, 1, 1, 1, 0.2);
					entity.getPersistentData().putDouble("damage", (8 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
					entity.getPersistentData().putDouble("knockback", 5);
					entity.getPersistentData().putDouble("range", 3);
					entity.getPersistentData().putDouble("projectile_type", 1);
					DodamageProcedure.execute(world, xPos, yPos, zPos, entity);
				}
			}
		}
		if (entity.getPersistentData().getDouble("cnt1") > 7) {
			entity.getPersistentData().putDouble("skill2", 0);
		}
	}
}
