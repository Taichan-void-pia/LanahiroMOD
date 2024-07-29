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
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SwingWindMagicProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
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
		double old_cnt2 = 0;
		double old_cnt3 = 0;
		double rad_now2 = 0;
		double dis2 = 0;
		double loop_num = 0;
		double cnt = 0;
		if (entity.getPersistentData().getDouble("skill2") == 0) {
			if (entity.getPersistentData().getDouble("skill2_swing") != 0) {
				if (entity.getPersistentData().getDouble("skill2_swing") == 5) {
					entity.getPersistentData().putDouble("cnt1", (entity.getPersistentData().getDouble("cnt1") + 1));
					if (entity.getPersistentData().getDouble("cnt1") < 10) {
						if (entity.getPersistentData().getDouble("cnt1") == 1) {
							entity.getPersistentData().putDouble("rad", (entity.getYRot() + 90));
							entity.getPersistentData().putDouble("pitch", (entity.getXRot()));
							entity.getPersistentData().putDouble("x_pos", (entity.getX()));
							entity.getPersistentData().putDouble("y_pos",
									(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(0)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY()));
							entity.getPersistentData().putDouble("z_pos", (entity.getZ()));
							entity.getPersistentData().putDouble("rnd", Math.random());
							entity.getPersistentData().putDouble("rnd2", Math.random());
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, 1, 2);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, 1, 2, false);
								}
							}
						}
						rad_now2 = Math.toRadians(entity.getPersistentData().getDouble("rad"));
						pitch = Math.toRadians(entity.getPersistentData().getDouble("pitch"));
						dis2 = entity.getPersistentData().getDouble("cnt1") * 0.75;
						x_pos = entity.getPersistentData().getDouble("x_pos") + Math.cos(rad_now2) * (Math.cos(pitch) + Math.abs(Math.sin(rad_now2) * Math.sin(pitch))) * dis2;
						y_pos = entity.getPersistentData().getDouble("y_pos") + Math.sin(pitch) * (-1) * dis;
						z_pos = entity.getPersistentData().getDouble("z_pos") + Math.sin(rad_now2) * (Math.cos(pitch) + Math.abs(Math.cos(rad_now2) * Math.sin(pitch))) * dis2;
						if (entity.getPersistentData().getDouble("wind_swing") == 2) {
							entity.getPersistentData().putDouble("flag_skill_num", 0);
							loop_num = 2;
						} else {
							if (entity.getPersistentData().getDouble("rnd") < 0.5) {
								entity.getPersistentData().putDouble("flag_skill_num", 0);
							} else {
								entity.getPersistentData().putDouble("flag_skill_num", 1);
							}
							loop_num = 1;
						}
						for (int index0 = 0; index0 < (int) loop_num; index0++) {
							old_cnt2 = entity.getPersistentData().getDouble("cnt2");
							old_cnt3 = entity.getPersistentData().getDouble("cnt3");
							dis = 1.5;
							for (int index1 = 0; index1 < 4; index1++) {
								if (entity.getPersistentData().getDouble("flag_skill_num") == 0) {
									entity.getPersistentData().putDouble("start_r", (entity.getYRot() + 30));
								} else {
									entity.getPersistentData().putDouble("start_r", (entity.getYRot() + 150));
								}
								for (int index2 = 0; index2 < 5; index2++) {
									if (entity.getPersistentData().getDouble("flag_skill_num") == 0) {
										rad = Math.toRadians(entity.getPersistentData().getDouble("start_r") + entity.getPersistentData().getDouble("cnt2"));
									} else {
										rad = Math.toRadians(entity.getPersistentData().getDouble("start_r") - entity.getPersistentData().getDouble("cnt2"));
									}
									rad_now = Math.toRadians(entity.getXRot() - 45 + entity.getPersistentData().getDouble("cnt3"));
									yaw_now = Math.toRadians(entity.getYRot() + 90);
									xPos = x_pos + Math.cos(rad) * (Math.cos(rad_now) + Math.abs(Math.sin(yaw_now) * Math.sin(rad_now))) * dis;
									yPos = y_pos + 1 + Math.sin(rad_now) * entity.getPersistentData().getDouble("rnd2") * (-5);
									zPos = z_pos + Math.sin(rad) * (Math.cos(rad_now) + Math.abs(Math.cos(yaw_now) * Math.sin(rad_now))) * dis;
									if (Math.random() < 0.5) {
										if (world instanceof ServerLevel _level)
											_level.getServer().getCommands().performPrefixedCommand(
													new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
													"particle dust 0.169 0.945 1.000 1 ~ ~ ~ 0.1 0.1 0.1 1 5 force");
									} else {
										if (world instanceof ServerLevel _level)
											_level.getServer().getCommands().performPrefixedCommand(
													new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
													"particle dust 0.310 0.584 1.000 1 ~ ~ ~ 0.1 0.1 0.1 1 5 force");
									}
									entity.getPersistentData().putDouble("damage",
											(7 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
									entity.getPersistentData().putDouble("knockback", 1);
									entity.getPersistentData().putDouble("range", 3);
									entity.getPersistentData().putDouble("projectile_type", 2);
									DodamageProcedure.execute(world, xPos, yPos, zPos, entity);
									entity.getPersistentData().putDouble("cnt2", (entity.getPersistentData().getDouble("cnt2") + 6));
									entity.getPersistentData().putDouble("cnt3", (entity.getPersistentData().getDouble("cnt3") + 4.5));
								}
							}
							entity.getPersistentData().putDouble("cnt2", old_cnt2);
							entity.getPersistentData().putDouble("cnt3", old_cnt3);
							entity.getPersistentData().putDouble("flag_skill_num", (entity.getPersistentData().getDouble("flag_skill_num") + 1));
						}
					}
					time = Math.max(entity.getPersistentData().getDouble("swing_skillcnt"), 12);
					if (entity.getPersistentData().getDouble("cnt1") > time) {
						entity.getPersistentData().putDouble("wind_swing", (entity.getPersistentData().getDouble("wind_swing") + 1));
						if (entity.getPersistentData().getDouble("wind_swing") > 2) {
							entity.getPersistentData().putDouble("wind_swing", 0);
						}
						entity.getPersistentData().putDouble("flag_skill_num", 0);
						entity.getPersistentData().putDouble("skill2_swing", 0);
					}
				}
			}
		}
	}
}
