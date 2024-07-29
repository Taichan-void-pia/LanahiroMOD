package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.ranahiromod.init.RanahiromodModParticleTypes;

public class SkillBosshiro1Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double rad = 0;
		double rad_now = 0;
		double yaw_now = 0;
		double x_pos = 0;
		double y_pos = 0;
		double z_pos = 0;
		double dis = 0;
		boolean muki = false;
		boolean UseBoss2 = false;
		entity.getPersistentData().putDouble("cnt1", (entity.getPersistentData().getDouble("cnt1") + 1));
		entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x() / 5), (entity.getDeltaMovement().y()), (entity.getDeltaMovement().z() / 5)));
		UseBoss2 = UsePlayerLogicRanahiroProcedure.execute(entity);
		if (entity.getPersistentData().getDouble("cnt1") < 15) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			dis = 2.25;
			if (UseBoss2) {
				dis = dis * 2;
			}
			for (int index0 = 0; index0 < 2; index0++) {
				if (Math.random() < 0.5) {
					muki = true;
				} else {
					muki = false;
				}
				if (muki) {
					entity.getPersistentData().putDouble("cnt2", 0);
					entity.getPersistentData().putDouble("start_r", (entity.getYRot() + 180));
					rad_now = Math.toRadians(entity.getXRot() + Math.random() * 80);
					yaw_now = Math.toRadians(entity.getYRot() + 90);
				} else {
					entity.getPersistentData().putDouble("cnt2", (entity.getXRot() + 66.5));
					rad_now = Math.toRadians(entity.getYRot() + 90 + (Math.random() - 0.5) * 160);
				}
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
				for (int index1 = 0; index1 < 36; index1++) {
					if (muki) {
						rad = Math.toRadians(entity.getPersistentData().getDouble("start_r") + entity.getPersistentData().getDouble("cnt2"));
						x_pos = x + Math.cos(rad) * (Math.cos(rad_now) + Math.abs(Math.sin(yaw_now) * Math.sin(rad_now))) * dis;
						y_pos = y + 1 + Math.sin(rad_now) * Math.sin(rad) * (-1) * dis;
						z_pos = z + Math.sin(rad) * (Math.cos(rad_now) + Math.abs(Math.cos(yaw_now) * Math.sin(rad_now))) * dis;
					} else {
						rad = Math.toRadians(entity.getPersistentData().getDouble("cnt2"));
						x_pos = x + Math.cos(rad) * Math.cos(rad_now) * dis;
						y_pos = y + 1 + Math.sin(rad) * (-1) * dis;
						z_pos = z + Math.cos(rad) * Math.sin(rad_now) * dis;
					}
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, new Vec3(x_pos, y_pos, z_pos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"particle dust 0.6 0.05 0.1 2 ~ ~ ~ 0.05 0.05 0.05 1 1 force");
					if (UseBoss2) {
						if (Math.random() < 0.1) {
							if (world instanceof ServerLevel _level)
								_level.sendParticles((SimpleParticleType) (RanahiromodModParticleTypes.LIGHT_SCATTER.get()), x_pos, y_pos, z_pos, 5, 0, 0, 0, 0.25);
						}
						entity.getPersistentData().putDouble("damage", (17 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
						entity.getPersistentData().putDouble("range", 3.5);
					} else {
						entity.getPersistentData().putDouble("damage", (15 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
						entity.getPersistentData().putDouble("range", 2.5);
					}
					entity.getPersistentData().putDouble("knockback", 1.5);
					entity.getPersistentData().putDouble("projectile_type", 1);
					DodamageProcedure.execute(world, x_pos, y_pos, z_pos, entity);
					entity.getPersistentData().putDouble("cnt2", (entity.getPersistentData().getDouble("cnt2") - 10));
					dis = dis + 0.05;
				}
			}
		}
		if (entity.getPersistentData().getDouble("cnt1") > 18) {
			entity.getPersistentData().putDouble("skill2", 0);
		}
	}
}
