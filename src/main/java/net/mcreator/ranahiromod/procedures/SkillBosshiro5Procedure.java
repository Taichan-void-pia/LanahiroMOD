package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class SkillBosshiro5Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean muki = false;
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
		double count = 0;
		double cnt = 0;
		double speed = 0;
		entity.getPersistentData().putDouble("cnt1", (entity.getPersistentData().getDouble("cnt1") + 1));
		if (entity.getPersistentData().getDouble("cnt1") < 10) {
			if (entity.getPersistentData().getDouble("cnt1") == 1) {
				entity.getPersistentData().putDouble("start_r", (entity.getYRot()));
			}
			entity.setDeltaMovement(new Vec3(0, Math.min(entity.getDeltaMovement().y(), 0), 0));
		} else {
			if (entity.getPersistentData().getDouble("cnt3") == 0) {
				entity.getPersistentData().putDouble("cnt3", 1);
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, x, y, z, 0, Level.ExplosionInteraction.NONE);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.end_gateway.spawn")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.end_gateway.spawn")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.fire.ambient")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.fire.ambient")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
				if (entity instanceof Player) {
					GetPowerFowardProcedure.execute(world, x, y, z, entity);
				} else {
					GetPowerProcedure.execute(world, x, y, z, entity);
				}
			}
			entity.setDeltaMovement(new Vec3((entity.getPersistentData().getDouble("x_power") * 1.2), (entity.getPersistentData().getDouble("y_power") * 1.2), (entity.getPersistentData().getDouble("z_power") * 1.2)));
			for (int index0 = 0; index0 < 10; index0++) {
				rad_now = Math.toRadians(entity.getYRot() + 90);
				cnt = 0;
				for (int index1 = 0; index1 < 2; index1++) {
					cnt = cnt + 1;
					if (cnt == 1) {
						rad = Math.toRadians(entity.getPersistentData().getDouble("start_r") + entity.getPersistentData().getDouble("cnt2"));
					} else {
						rad = Math.toRadians(entity.getPersistentData().getDouble("start_r") + entity.getPersistentData().getDouble("cnt2") + 180);
					}
					xPos = x + (Math.cos(rad_now) - Math.sin(rad) * Math.sin(rad_now)) * 1.5;
					yPos = y + 1;
					zPos = z + (Math.sin(rad_now) + Math.sin(rad) * Math.cos(rad_now)) * 1.5;
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.FLAME, xPos, yPos, zPos, 1, 0, 0, 0, 0);
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.LAVA, xPos, yPos, zPos, 2, 0, 0, 0, 1);
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"particle dust 1.000 0.200 0.227 1 ~ ~ ~ 0.2 0.1 0.2 0 3 force");
					entity.getPersistentData().putDouble("damage", (17 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
					entity.getPersistentData().putDouble("knockback", 0.75);
					entity.getPersistentData().putDouble("range", 2.5);
					entity.getPersistentData().putDouble("projectile_type", 1);
					DodamageProcedure.execute(world, xPos, yPos, zPos, entity);
				}
				entity.getPersistentData().putDouble("cnt2", (entity.getPersistentData().getDouble("cnt2") + 3));
			}
			if (entity.getPersistentData().getDouble("cnt1") > 21) {
				entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x() / 3), (entity.getDeltaMovement().y()), (entity.getDeltaMovement().z() / 3)));
				entity.getPersistentData().putDouble("skill2", 0);
			}
		}
	}
}
