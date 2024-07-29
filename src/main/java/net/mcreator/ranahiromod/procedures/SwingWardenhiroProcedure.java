package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SwingWardenhiroProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event, event.getEntity().level(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
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
		double dis_start = 0;
		double time = 0;
		double num = 0;
		if (entity.getPersistentData().getDouble("skill2") == 0) {
			if (entity.getPersistentData().getDouble("skill2_swing") != 0) {
				if (entity.getPersistentData().getDouble("skill2_swing") == 4) {
					entity.getPersistentData().putDouble("cnt1", (entity.getPersistentData().getDouble("cnt1") + 1));
					if (entity.getPersistentData().getDouble("cnt1") <= 5) {
						if (entity.getPersistentData().getDouble("cnt1") == 1) {
							entity.getPersistentData().putDouble("rad", (entity.getYRot() + 90));
							entity.getPersistentData().putDouble("pitch", (entity.getXRot()));
							entity.getPersistentData().putDouble("x_pos", (entity.getX()));
							entity.getPersistentData().putDouble("y_pos",
									(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(0)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY()));
							entity.getPersistentData().putDouble("z_pos", (entity.getZ()));
							entity.getPersistentData().putDouble("rnd", Math.random());
						}
						rad_now = Math.toRadians(entity.getPersistentData().getDouble("rad"));
						pitch = Math.toRadians(entity.getPersistentData().getDouble("pitch"));
						if (entity.getPersistentData().getDouble("rnd") < 0.05) {
							dis_start = 1;
						} else {
							dis_start = 0.75;
						}
						dis = entity.getPersistentData().getDouble("cnt1") * dis_start;
						x_pos = entity.getPersistentData().getDouble("x_pos") + Math.cos(rad_now) * (Math.cos(pitch) + Math.abs(Math.sin(rad_now) * Math.sin(pitch))) * dis;
						y_pos = entity.getPersistentData().getDouble("y_pos") + Math.sin(pitch) * (-1) * dis;
						z_pos = entity.getPersistentData().getDouble("z_pos") + Math.sin(rad_now) * (Math.cos(pitch) + Math.abs(Math.cos(rad_now) * Math.sin(pitch))) * dis;
						rad_now = Math.toRadians(entity.getPersistentData().getDouble("rad") + 90);
						if (entity.getPersistentData().getDouble("rnd") < 0.05) {
							dis_start = 1;
							num = 0.35;
						} else {
							dis_start = 0.5;
							num = 0.2;
						}
						dis = dis_start + entity.getPersistentData().getDouble("cnt1") * num;
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.CLOUD, x_pos, y_pos, z_pos, 1, 0, 0, 0, 0);
						for (int index0 = 0; index0 < 72; index0++) {
							rad = Math.toRadians(entity.getPersistentData().getDouble("cnt2"));
							xPos = x_pos + Math.cos(rad) * Math.cos(rad_now) * dis;
							yPos = y_pos + Math.sin(rad) * dis;
							zPos = z_pos + Math.cos(rad) * Math.sin(rad_now) * dis;
							if (entity.getPersistentData().getDouble("rnd") < 0.05) {
								if (Math.random() < 0.5) {
									if (world instanceof ServerLevel _level)
										_level.getServer().getCommands().performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
												"particle dust 0.500 1.000 1.000 1 ~ ~ ~ 0.01 0.01 0.01 1 3 force");
								} else {
									if (world instanceof ServerLevel _level)
										_level.getServer().getCommands().performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
												"particle dust 0.450 0.850 0.850 1 ~ ~ ~ 0.01 0.01 0.01 1 3 force");
								}
							} else {
								if (Math.random() < 0.5) {
									if (world instanceof ServerLevel _level)
										_level.getServer().getCommands().performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
												"particle dust 0.000 0.337 0.722 1 ~ ~ ~ 0.01 0.01 0.01 1 3 force");
								} else {
									if (world instanceof ServerLevel _level)
										_level.getServer().getCommands().performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
												"particle dust 0.000 0.125 0.271 1 ~ ~ ~ 0.01 0.01 0.01 1 3 force");
								}
							}
							entity.getPersistentData().putDouble("damage", (7 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
							entity.getPersistentData().putDouble("knockback", 1);
							entity.getPersistentData().putDouble("range", 2.5);
							entity.getPersistentData().putDouble("projectile_type", 1);
							DodamageProcedure.execute(world, xPos, yPos, zPos, entity);
							entity.getPersistentData().putDouble("cnt2", (entity.getPersistentData().getDouble("cnt2") + 5));
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x_pos, y_pos, z_pos), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.end_gateway.spawn")), SoundSource.NEUTRAL, 2, (float) 0.5);
							} else {
								_level.playLocalSound(x_pos, y_pos, z_pos, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.end_gateway.spawn")), SoundSource.NEUTRAL, 2, (float) 0.5, false);
							}
						}
					}
					time = Math.max(entity.getPersistentData().getDouble("swing_skillcnt"), 5);
					if (entity.getPersistentData().getDouble("cnt1") > time) {
						entity.getPersistentData().putDouble("skill2_swing", 0);
					}
				}
			}
		}
	}
}
