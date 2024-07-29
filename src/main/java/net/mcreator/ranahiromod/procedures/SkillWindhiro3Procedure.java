package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Mob;
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

public class SkillWindhiro3Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean type = false;
		double xPos = 0;
		double yPos = 0;
		double zPos = 0;
		double range = 0;
		double rad = 0;
		double rad_now = 0;
		double dis = 0;
		double x_power = 0;
		double y_power = 0;
		double z_power = 0;
		double dis2 = 0;
		double yaw_now = 0;
		entity.getPersistentData().putDouble("cnt1", (entity.getPersistentData().getDouble("cnt1") + 1));
		entity.getPersistentData().putDouble("damage", (18 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
		if (entity.getPersistentData().getDouble("cnt1") < 10) {
			if (entity.getPersistentData().getDouble("cnt1") == 1) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.CLOUD, x, y, z, 50, 0.5, 0, 0.5, 1);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
				if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity) {
					GetPowerProcedure.execute(world, x, y, z, entity);
				} else {
					GetPowerFowardProcedure.execute(world, x, y, z, entity);
				}
				entity.getPersistentData().putDouble("x_pos", x);
				entity.getPersistentData().putDouble("y_pos", (y + 1));
				entity.getPersistentData().putDouble("z_pos", z);
				entity.getPersistentData().putDouble("start_r", (entity.getYRot() + 90));
				entity.getPersistentData().putDouble("start_pitch", (entity.getXRot() * (-1)));
			}
			entity.setDeltaMovement(new Vec3((entity.getPersistentData().getDouble("x_power") * 1), (entity.getPersistentData().getDouble("y_power") * 1), (entity.getPersistentData().getDouble("z_power") * 1)));
		}
		if (entity.getPersistentData().getDouble("cnt1") > 3 && entity.getPersistentData().getDouble("cnt1") < 9) {
			if (entity.getPersistentData().getDouble("cnt1") == 4) {
				entity.getPersistentData().putDouble("x_pos", x);
				entity.getPersistentData().putDouble("y_pos", (y + 1));
				entity.getPersistentData().putDouble("z_pos", z);
			}
			rad_now = Math.toRadians(entity.getPersistentData().getDouble("start_pitch"));
			yaw_now = Math.toRadians(entity.getPersistentData().getDouble("start_r"));
			dis = entity.getPersistentData().getDouble("cnt1") * 0.7 - 2;
			for (int index0 = 0; index0 < 3; index0++) {
				for (int index1 = 0; index1 < 8; index1++) {
					range = 0.5 * ((180 - Math.abs(entity.getPersistentData().getDouble("cnt2") - 180)) / 180);
					rad = Math.toRadians(entity.getPersistentData().getDouble("start_r") + entity.getPersistentData().getDouble("cnt2"));
					xPos = entity.getPersistentData().getDouble("x_pos") + Math.sin(rad) * dis;
					yPos = entity.getPersistentData().getDouble("y_pos") + Math.cos(Math.toRadians(entity.getPersistentData().getDouble("cnt2"))) * Math.sin(rad_now) * dis;
					zPos = entity.getPersistentData().getDouble("z_pos") + Math.cos(rad) * dis;
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								("particle dust 0.000 1.000 0.533 2 ~ ~ ~ " + range + " " + range + " " + range + " " + "1 8 force"));
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								("particle dust 0.722 1.000 0.831 2 ~ ~ ~ " + range + " " + range + " " + range + " " + "1 8 force"));
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(xPos, yPos, zPos), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(xPos, yPos, zPos, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					entity.getPersistentData().putDouble("damage", (18 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
					entity.getPersistentData().putDouble("knockback", 1);
					entity.getPersistentData().putDouble("range", 3.5);
					entity.getPersistentData().putDouble("projectile_type", 2);
					DodamageProcedure.execute(world, xPos, yPos, zPos, entity);
					entity.getPersistentData().putDouble("cnt2", (entity.getPersistentData().getDouble("cnt2") + 3));
				}
				dis = dis + 1;
			}
		}
		if (entity.getPersistentData().getDouble("cnt1") > 9) {
			entity.setDeltaMovement(new Vec3(0, 0, 0));
		}
		if (entity.getPersistentData().getDouble("cnt1") > 13) {
			entity.getPersistentData().putDouble("skill2", 0);
		}
	}
}
