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
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.ranahiromod.init.RanahiromodModParticleTypes;

public class SkillBosshiro3Procedure {
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
		double zPos = 0;
		double yPos = 0;
		double xPos = 0;
		boolean muki = false;
		boolean UseBoss2 = false;
		entity.getPersistentData().putDouble("cnt1", (entity.getPersistentData().getDouble("cnt1") + 1));
		UseBoss2 = UsePlayerLogicRanahiroProcedure.execute(entity);
		if (entity.getPersistentData().getDouble("cnt1") == 1) {
			entity.getPersistentData().putDouble("start_r", (entity.getYRot() + 10));
			entity.getPersistentData().putDouble("pitch_now", (entity.getXRot()));
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ranahiromod:sword_sweep")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ranahiromod:sword_sweep")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
		}
		entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x() / 5), (entity.getDeltaMovement().y()), (entity.getDeltaMovement().z() / 5)));
		for (int index0 = 0; index0 < 3; index0++) {
			dis = 3;
			if (UseBoss2) {
				dis = dis * 2;
			}
			for (int index1 = 0; index1 < 8; index1++) {
				rad = Math.toRadians(entity.getPersistentData().getDouble("start_r") + entity.getPersistentData().getDouble("cnt2"));
				rad_now = Math.toRadians(entity.getPersistentData().getDouble("pitch_now"));
				yaw_now = Math.toRadians(entity.getYRot() + 90);
				xPos = x + Math.cos(rad) * (Math.cos(rad_now) + Math.abs(Math.sin(yaw_now) * Math.sin(rad_now))) * dis;
				yPos = y + 1 + Math.sin(Math.toRadians(entity.getPersistentData().getDouble("cnt2"))) * Math.sin(rad_now) * (-1) * dis;
				zPos = z + Math.sin(rad) * (Math.cos(rad_now) + Math.abs(Math.cos(yaw_now) * Math.sin(rad_now))) * dis;
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"particle dust 0.6 0.05 0.1 2 ~ ~ ~ 0.25 0.15 0.25 1 5 force");
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.SWEEP_ATTACK, xPos, yPos, zPos, 2, 0, 0, 0, 0.2);
				if (UseBoss2) {
					if (Math.random() < 0.1) {
						if (world instanceof ServerLevel _level)
							_level.sendParticles((SimpleParticleType) (RanahiromodModParticleTypes.LIGHT_SCATTER.get()), xPos, yPos, zPos, 5, 0, 0, 0, 0.25);
					}
					entity.getPersistentData().putDouble("damage", (20 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
					entity.getPersistentData().putDouble("range", 2.5);
				} else {
					entity.getPersistentData().putDouble("damage", (17 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
					entity.getPersistentData().putDouble("range", 1.5);
				}
				entity.getPersistentData().putDouble("knockback", 2.5);
				entity.getPersistentData().putDouble("projectile_type", 2);
				DodamageProcedure.execute(world, xPos, yPos, zPos, entity);
				dis = dis + 1;
			}
			entity.getPersistentData().putDouble("cnt2", (entity.getPersistentData().getDouble("cnt2") + 5.4));
		}
		if (entity.getPersistentData().getDouble("cnt1") > 10) {
			entity.getPersistentData().putDouble("skill2", 0);
		}
	}
}
