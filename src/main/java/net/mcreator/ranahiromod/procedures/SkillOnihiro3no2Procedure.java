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

public class SkillOnihiro3no2Procedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		boolean fang_logic = false;
		double rad = 0;
		double rad_now = 0;
		double yaw_now = 0;
		double pitch = 0;
		double x_pos = 0;
		double y_pos = 0;
		double z_pos = 0;
		double dis = 0;
		double xPos = 0;
		double yPos = 0;
		double zPos = 0;
		double rad_now2 = 0;
		double cnt = 0;
		entity.getPersistentData().putDouble("cnt1", (entity.getPersistentData().getDouble("cnt1") + 1));
		if (entity.getPersistentData().getDouble("cnt1") == 1) {
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
			entity.getPersistentData().putDouble("rad", (entity.getYRot() + 90));
			entity.getPersistentData().putDouble("pitch", (entity.getXRot()));
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.evoker_fangs.attack")), SoundSource.NEUTRAL, 1, (float) 0.25);
				} else {
					_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.evoker_fangs.attack")), SoundSource.NEUTRAL, 1, (float) 0.25, false);
				}
			}
			entity.getPersistentData().putDouble("x_pos2", (entity.getX()));
			entity.getPersistentData().putDouble("y_pos2", (entity.getY()));
			entity.getPersistentData().putDouble("z_pos2", (entity.getZ()));
		}
		for (int index0 = 0; index0 < 3; index0++) {
			if (cnt == 0) {
				rad_now2 = Math.toRadians(entity.getPersistentData().getDouble("rad") - 90);
			} else if (cnt == 1) {
				rad_now2 = Math.toRadians(entity.getPersistentData().getDouble("rad") + 90);
			} else if (cnt == 2) {
				rad_now2 = Math.toRadians(entity.getPersistentData().getDouble("rad"));
			}
			pitch = Math.toRadians(entity.getPersistentData().getDouble("pitch"));
			rad_now = rad_now2;
			dis = 4;
			entity.getPersistentData().putDouble("x_pos", (entity.getPersistentData().getDouble("x_pos2") + Math.cos(rad_now) * (Math.cos(pitch) + Math.abs(Math.sin(rad_now) * Math.sin(pitch))) * dis));
			entity.getPersistentData().putDouble("y_pos", (entity.getPersistentData().getDouble("y_pos2") + Math.sin(pitch) * (-1) * dis));
			entity.getPersistentData().putDouble("z_pos", (entity.getPersistentData().getDouble("z_pos2") + Math.sin(rad_now) * (Math.cos(pitch) + Math.abs(Math.cos(rad_now) * Math.sin(pitch))) * dis));
			rad_now = Math.toRadians(entity.getPersistentData().getDouble("rad"));
			pitch = Math.toRadians(entity.getPersistentData().getDouble("pitch"));
			dis = (entity.getPersistentData().getDouble("cnt1") + 1) * 1.25;
			x_pos = entity.getPersistentData().getDouble("x_pos") + Math.cos(rad_now) * (Math.cos(pitch) + Math.abs(Math.sin(rad_now) * Math.sin(pitch))) * dis;
			y_pos = entity.getPersistentData().getDouble("y_pos") + Math.sin(pitch) * (-1) * dis;
			z_pos = entity.getPersistentData().getDouble("z_pos") + Math.sin(rad_now) * (Math.cos(pitch) + Math.abs(Math.cos(rad_now) * Math.sin(pitch))) * dis;
			dis = 3;
			for (int index1 = 0; index1 < 8; index1++) {
				rad_now = Math.toRadians(entity.getPersistentData().getDouble("rad") + 90);
				rad = Math.toRadians(entity.getPersistentData().getDouble("cnt2"));
				xPos = x_pos + Math.cos(rad) * Math.cos(rad_now) * dis;
				yPos = y_pos + Math.sin(rad) * dis;
				zPos = z_pos + Math.cos(rad) * Math.sin(rad_now) * dis;
				if (Math.random() < 0.5) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"particle dust 1 0.2 0.227 1 ~ ~ ~ 0.15 0.15 0.15 0 10 normal");
				} else {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"particle dust 0.5 0 0 1 ~ ~ ~ 0.15 0.15 0.15 0 10 normal");
				}
				if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (RanahiromodModParticleTypes.BLACKFLAME.get()), xPos, yPos, zPos, 3, 0, 0, 0, 0.2);
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.CLOUD, xPos, yPos, zPos, 1, 0, 0, 0, 0.2);
				entity.getPersistentData().putDouble("damage", (16 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
				entity.getPersistentData().putDouble("knockback", 1);
				entity.getPersistentData().putDouble("range", 4);
				entity.getPersistentData().putDouble("projectile_type", 2);
				DodamageProcedure.execute(world, xPos, yPos, zPos, entity);
				entity.getPersistentData().putDouble("cnt2", (entity.getPersistentData().getDouble("cnt2") + 5));
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x_pos, y_pos, z_pos), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, 1, (float) 1.5);
				} else {
					_level.playLocalSound(x_pos, y_pos, z_pos, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, 1, (float) 1.5, false);
				}
			}
			cnt = cnt + 1;
		}
		if (entity.getPersistentData().getDouble("cnt1") > 28) {
			entity.getPersistentData().putDouble("skill2", 0);
		}
	}
}
