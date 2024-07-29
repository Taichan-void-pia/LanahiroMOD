package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.ranahiromod.init.RanahiromodModParticleTypes;

public class SkillWeaponhiro3NeoProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
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
		double tsuki7_mode = 0;
		double HP = 0;
		double yaw_now = 0;
		double cnt = 0;
		if (entity.getPersistentData().getDouble("cnt1") >= 0 && entity.getPersistentData().getDouble("skill2") != 1001 || entity.getPersistentData().getDouble("cnt1") > 0 && entity.getPersistentData().getDouble("skill2") == 1001) {
			entity.getPersistentData().putDouble("cnt1", (entity.getPersistentData().getDouble("cnt1") + 1));
			if (entity.getPersistentData().getDouble("cnt1") == 2) {
				entity.getPersistentData().putDouble("cnt3", 1);
				entity.getPersistentData().putDouble("x_pos",
						(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(3)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()));
				entity.getPersistentData().putDouble("y_pos",
						(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(3)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY()));
				entity.getPersistentData().putDouble("z_pos",
						(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(3)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()));
				if (entity.getPersistentData().getDouble("skill2") == 1001) {
					entity.getPersistentData().putDouble("x_pos",
							(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(0)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()));
					entity.getPersistentData().putDouble("y_pos",
							(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(0)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY()));
					entity.getPersistentData().putDouble("z_pos",
							(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(0)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()));
				}
			}
			if (entity.getPersistentData().getDouble("cnt3") > 0) {
				entity.getPersistentData().putDouble("cnt3", (entity.getPersistentData().getDouble("cnt3") + 1));
				if (entity.getPersistentData().getDouble("cnt1") % 3 == 2) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, 1, (float) 0.8);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, 1, (float) 0.8, false);
						}
					}
				}
				entity.setDeltaMovement(new Vec3(0, 0, 0));
				cnt = Math.round(Math.min(entity.getPersistentData().getDouble("cnt1") * 2, 24));
				if (entity.getPersistentData().getDouble("cnt1") > 10) {
					cnt = Math.round(cnt * 1.5);
				}
				rad_now = Math.toRadians(entity.getYRot());
				for (int index0 = 0; index0 < (int) cnt; index0++) {
					for (int index1 = 0; index1 < 4; index1++) {
						rad = Math.toRadians(num1 + entity.getPersistentData().getDouble("cnt2"));
						xPos = entity.getPersistentData().getDouble("x_pos") + Math.cos(rad) * Math.cos(rad_now) * dis;
						yPos = entity.getPersistentData().getDouble("y_pos") + Math.sin(rad) * dis;
						zPos = entity.getPersistentData().getDouble("z_pos") + Math.cos(rad) * Math.sin(rad_now) * dis;
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.SWEEP_ATTACK, xPos, yPos, zPos, 1, 0, 0, 0, 0.5);
						if (world instanceof ServerLevel _level)
							_level.sendParticles((SimpleParticleType) (RanahiromodModParticleTypes.BLACKFLAME.get()), xPos, yPos, zPos, 3, 0, 0, 0, 0.1);
						num1 = num1 + 90;
						if (Math.round(dis * 10) == Math.round(dis) * 10) {
							entity.getPersistentData().putDouble("damage", (6 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
							entity.getPersistentData().putDouble("knockback", 2);
							entity.getPersistentData().putDouble("range", 3);
							DodamageProcedure.execute(world, xPos, yPos, zPos, entity);
						}
					}
					dis = dis + 0.25;
					entity.getPersistentData().putDouble("cnt2", (entity.getPersistentData().getDouble("cnt2") + 3));
				}
				if (entity.getPersistentData().getDouble("cnt3") > 15) {
					if (entity.getPersistentData().getDouble("skill2") == 1001) {
						entity.getPersistentData().putDouble("cnt1", 0);
						entity.getPersistentData().putDouble("cnt2", 0);
						entity.getPersistentData().putDouble("cnt3", 0);
						WeaponhiroItemEntityUseEndProcedure.execute(entity);
					} else {
						entity.getPersistentData().putDouble("skill2", 0);
					}
				}
			}
		}
	}
}
