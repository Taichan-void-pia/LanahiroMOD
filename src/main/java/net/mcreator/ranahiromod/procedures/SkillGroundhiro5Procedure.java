package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import net.mcreator.ranahiromod.init.RanahiromodModParticleTypes;

public class SkillGroundhiro5Procedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		boolean logic_a = false;
		double zPos = 0;
		double yPos = 0;
		double xPos = 0;
		double dmg = 0;
		double dis = 0;
		double rad = 0;
		entity.getPersistentData().putDouble("cnt1", (entity.getPersistentData().getDouble("cnt1") + 1));
		if (entity.getPersistentData().getDouble("cnt1") == 1) {
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
			if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity) {
				xPos = (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX();
				yPos = (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY();
				zPos = (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ();
			} else {
				xPos = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(30)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX();
				yPos = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(30)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY();
				zPos = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(30)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ();
			}
			for (int index0 = 0; index0 < 384; index0++) {
				if (!world.getBlockState(BlockPos.containing(xPos, yPos, zPos)).canOcclude()) {
					yPos = yPos - 1;
					if (yPos < -64) {
						xPos = entity.getX();
						yPos = entity.getY();
						zPos = entity.getZ();
					}
				}
			}
			entity.getPersistentData().putDouble("x_pos", xPos);
			entity.getPersistentData().putDouble("y_pos", yPos);
			entity.getPersistentData().putDouble("z_pos", zPos);
		}
		if (entity.getPersistentData().getDouble("cnt1") < 10) {
			dis = 7;
			for (int index1 = 0; index1 < 2; index1++) {
				for (int index2 = 0; index2 < (int) (entity.getPersistentData().getDouble("cnt1") * 8); index2++) {
					rad = Math.toRadians(entity.getPersistentData().getDouble("cnt2"));
					xPos = entity.getPersistentData().getDouble("x_pos") + Math.cos(rad) * dis;
					yPos = entity.getPersistentData().getDouble("y_pos");
					zPos = entity.getPersistentData().getDouble("z_pos") + Math.sin(rad) * dis;
					if (world.getBlockState(BlockPos.containing(xPos, yPos, zPos)).canOcclude()) {
						yPos = yPos + 1;
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (RanahiromodModParticleTypes.SMOKE_WIND.get()), xPos, yPos, zPos, 2, 0, 0, 0, 0);
					entity.getPersistentData().putDouble("cnt2", (entity.getPersistentData().getDouble("cnt2") + 2.5));
				}
				entity.getPersistentData().putDouble("cnt2", (entity.getPersistentData().getDouble("cnt2") + 180));
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(entity.getPersistentData().getDouble("x_pos"), entity.getPersistentData().getDouble("y_pos"), entity.getPersistentData().getDouble("z_pos")),
							ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ranahiromod:axe_hit")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound((entity.getPersistentData().getDouble("x_pos")), (entity.getPersistentData().getDouble("y_pos")), (entity.getPersistentData().getDouble("z_pos")),
							ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ranahiromod:axe_hit")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		} else {
			xPos = entity.getPersistentData().getDouble("x_pos");
			yPos = entity.getPersistentData().getDouble("y_pos");
			zPos = entity.getPersistentData().getDouble("z_pos");
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, xPos, (yPos - 1), zPos, 0, Level.ExplosionInteraction.NONE);
			for (int index3 = 0; index3 < 10; index3++) {
				xPos = xPos + (Math.random() - 0.5) * 10;
				yPos = yPos + Math.random() * 4;
				zPos = zPos + (Math.random() - 0.5) * 10;
				world.levelEvent(2001, BlockPos.containing(xPos, yPos, zPos), Block.getId((world.getBlockState(BlockPos.containing(xPos, yPos - 2, zPos)))));
			}
			for (int index4 = 0; index4 < 5; index4++) {
				yPos = yPos + 2;
				entity.getPersistentData().putDouble("damage", (14 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
				entity.getPersistentData().putDouble("range", 3);
				entity.getPersistentData().putDouble("projectile_type", 1);
				DodamageProcedure.execute(world, xPos, yPos, zPos, entity);
			}
			if (entity.getPersistentData().getDouble("cnt1") > 30) {
				entity.getPersistentData().putDouble("skill2", 0);
			}
		}
	}
}
