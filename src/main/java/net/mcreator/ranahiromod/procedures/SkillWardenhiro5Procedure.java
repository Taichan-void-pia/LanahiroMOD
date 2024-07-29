package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class SkillWardenhiro5Procedure {
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
		double cnt = 0;
		if (entity.getPersistentData().getDouble("cnt1") == 0) {
			entity.getPersistentData().putDouble("rad", (entity.getYRot() + 90));
			entity.getPersistentData().putDouble("pitch", (entity.getXRot()));
			entity.getPersistentData().putDouble("x_pos", (entity.getX()));
			entity.getPersistentData().putDouble("y_pos", (entity.getY() + entity.getBbHeight() / 2));
			entity.getPersistentData().putDouble("z_pos", (entity.getZ()));
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.cave")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.cave")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		}
		if (entity.getPersistentData().getDouble("cnt1") % 3 == 0) {
			x_pos = entity.getPersistentData().getDouble("x_pos");
			y_pos = entity.getPersistentData().getDouble("y_pos");
			z_pos = entity.getPersistentData().getDouble("z_pos");
			dis = entity.getBbHeight() / 2 + entity.getPersistentData().getDouble("cnt1");
			for (int index0 = 0; index0 < 3; index0++) {
				for (int index1 = 0; index1 < (int) Math.round((entity.getPersistentData().getDouble("cnt1") / 3) * 72); index1++) {
					if (cnt == 2) {
						rad_now = Math.toRadians(entity.getPersistentData().getDouble("rad"));
						rad = Math.toRadians(entity.getPersistentData().getDouble("cnt2"));
						xPos = x_pos + Math.cos(rad) * dis;
						yPos = y_pos;
						zPos = z_pos + Math.sin(rad) * dis;
					} else {
						if (cnt == 0) {
							rad_now = Math.toRadians(entity.getPersistentData().getDouble("rad") + 90);
						} else {
							rad_now = Math.toRadians(entity.getPersistentData().getDouble("rad"));
						}
						rad = Math.toRadians(entity.getPersistentData().getDouble("cnt2"));
						xPos = x_pos + Math.cos(rad) * Math.cos(rad_now) * dis;
						yPos = y_pos + Math.sin(rad) * dis;
						zPos = z_pos + Math.cos(rad) * Math.sin(rad_now) * dis;
					}
					if (Math.random() < 0.5) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"particle dust 0.000 0.337 0.722 1 ~ ~ ~ 0.1 0.1 0.1 1 2 force");
					} else {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"particle dust 0.000 0.125 0.271 1 ~ ~ ~ 0.1 0.1 0.1 1 2 force");
					}
					entity.getPersistentData().putDouble("damage", (14 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
					entity.getPersistentData().putDouble("knockback", 1);
					entity.getPersistentData().putDouble("range", 3);
					entity.getPersistentData().putDouble("projectile_type", 1);
					DodamageProcedure.execute(world, xPos, yPos, zPos, entity);
					entity.getPersistentData().putDouble("cnt2", (entity.getPersistentData().getDouble("cnt2") + 5));
				}
				cnt = cnt + 1;
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x_pos, y_pos, z_pos), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.warden.ambient")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x_pos, y_pos, z_pos, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.warden.ambient")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		}
		entity.getPersistentData().putDouble("cnt1", (entity.getPersistentData().getDouble("cnt1") + 1));
		if (entity.getPersistentData().getDouble("cnt1") > 24) {
			entity.getPersistentData().putDouble("skill2", 0);
		}
	}
}
