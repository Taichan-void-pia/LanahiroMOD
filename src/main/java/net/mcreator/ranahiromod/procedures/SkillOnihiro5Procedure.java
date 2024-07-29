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

public class SkillOnihiro5Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean logic_a = false;
		double zPos = 0;
		double yPos = 0;
		double rad = 0;
		double rad_now = 0;
		double yaw_now = 0;
		double xPos = 0;
		double dis = 0;
		double yaw = 0;
		double pitch = 0;
		double yaw2 = 0;
		double pitch2 = 0;
		double xPos2 = 0;
		double yPos2 = 0;
		double zPos2 = 0;
		entity.getPersistentData().putDouble("cnt1", (entity.getPersistentData().getDouble("cnt1") + 1));
		GetPowerFowardProcedure.execute(world, x, y, z, entity);
		if (entity instanceof LivingEntity _entity)
			_entity.swing(InteractionHand.MAIN_HAND, true);
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, 1, 1, false);
			}
		}
		entity.getPersistentData().putDouble("start_r", (Math.random() * 360));
		rad_now = Math.toRadians((Math.random() - 0.5) * 180);
		yaw_now = Math.toRadians(Math.random() * 360);
		xPos2 = x;
		yPos2 = y + entity.getBbHeight() / 2;
		zPos2 = z;
		for (int index0 = 0; index0 < 18; index0++) {
			rad = Math.toRadians(entity.getPersistentData().getDouble("start_r") + entity.getPersistentData().getDouble("cnt3"));
			dis = 2;
			for (int index1 = 0; index1 < 6; index1++) {
				xPos = xPos2 + Math.cos(rad) * (Math.cos(rad_now) + Math.abs(Math.sin(yaw_now) * Math.sin(rad_now))) * dis;
				yPos = yPos2 + Math.sin(Math.toRadians(entity.getPersistentData().getDouble("cnt3"))) * Math.sin(rad_now) * (-1) * dis;
				zPos = zPos2 + Math.sin(rad) * (Math.cos(rad_now) + Math.abs(Math.cos(yaw_now) * Math.sin(rad_now))) * dis;
				if (Math.random() < 0.5) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"particle dust 1 0.2 0.227 1 ~ ~ ~ 0.05 0.05 0.05 0 3 normal");
				} else {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"particle dust 0.5 0 0 1 ~ ~ ~ 0.05 0.05 0.05 0 3 normal");
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (RanahiromodModParticleTypes.BLACKFLAME.get()), xPos, yPos, zPos, 5, 0, 0, 0, 0.1);
				entity.getPersistentData().putDouble("damage", (13 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
				entity.getPersistentData().putDouble("knockback", 1);
				entity.getPersistentData().putDouble("range", 2);
				entity.getPersistentData().putDouble("projectile_type", 1);
				DodamageProcedure.execute(world, xPos, yPos, zPos, entity);
				dis = dis + 0.2;
			}
			entity.getPersistentData().putDouble("cnt3", (entity.getPersistentData().getDouble("cnt3") + 10));
		}
		entity.setDeltaMovement(new Vec3((entity.getPersistentData().getDouble("x_power") * 0.6), (entity.getDeltaMovement().y()), (entity.getPersistentData().getDouble("z_power") * 0.6)));
		if (entity.getPersistentData().getDouble("cnt1") > 18) {
			entity.getPersistentData().putDouble("skill2", 0);
		}
	}
}
