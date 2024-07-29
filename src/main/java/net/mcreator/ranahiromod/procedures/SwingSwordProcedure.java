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

import net.mcreator.ranahiromod.init.RanahiromodModMobEffects;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SwingSwordProcedure {
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
		String particle_cmd_text = "";
		String particle_cmd_parameter1 = "";
		String particle_cmd_parameter2 = "";
		double zPos = 0;
		double yPos = 0;
		double rad = 0;
		double rad_now = 0;
		double yaw_now = 0;
		double xPos = 0;
		double dis = 0;
		double rnd = 0;
		double rnd2 = 0;
		double rnd3 = 0;
		double rnd4 = 0;
		double dis_start = 0;
		double cnt = 0;
		double times = 0;
		double x_num = 0;
		double y_num = 0;
		double z_num = 0;
		double time = 0;
		if (entity.getPersistentData().getDouble("skill2") == 0) {
			if (entity.getPersistentData().getDouble("skill2_swing") != 0) {
				if (entity.getPersistentData().getDouble("skill2_swing") == 1) {
					entity.getPersistentData().putDouble("cnt1", (entity.getPersistentData().getDouble("cnt1") + 1));
					if (entity.getPersistentData().getDouble("cnt3") == 0) {
						entity.getPersistentData().putDouble("rnd", Math.random());
						entity.getPersistentData().putDouble("cnt3", 1);
					}
					if (entity.getPersistentData().getDouble("cnt1") == 1) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
						rnd = Math.random();
						rnd2 = Math.ceil(Math.random() * 2);
						rnd3 = Math.random() * 45;
						dis_start = 1.7 * (1 + Math.round(Math.random() * 100) / 100);
						if (rnd < 0.75) {
							entity.getPersistentData().putDouble("cnt2", 0);
							entity.getPersistentData().putDouble("start_r", (entity.getYRot() + 180));
							if (rnd2 == 1) {
								entity.getPersistentData().putDouble("x_pos", (rnd3 * 1));
							} else {
								entity.getPersistentData().putDouble("x_pos", (rnd3 * (-1)));
							}
							entity.getPersistentData().putDouble("y_pos", (entity.getPersistentData().getDouble("x_pos") / (-18)));
							rad_now = Math.toRadians(entity.getXRot());
							yaw_now = Math.toRadians(entity.getYRot() + 90);
						} else {
							entity.getPersistentData().putDouble("cnt2", (entity.getXRot() + 90));
							if (rnd2 == 1) {
								entity.getPersistentData().putDouble("x_pos", (entity.getYRot() + 90 + rnd3 * 1));
							} else {
								entity.getPersistentData().putDouble("x_pos", (entity.getYRot() + 90 + rnd3 * (-1)));
							}
						}
						cnt = 0;
						for (int index0 = 0; index0 < 36; index0++) {
							dis = dis_start;
							for (int index1 = 0; index1 < 4; index1++) {
								xPos = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(0)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX();
								yPos = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(0)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY();
								zPos = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(0)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ();
								if (rnd < 0.75) {
									rad_now = Math.toRadians(entity.getXRot() + entity.getPersistentData().getDouble("x_pos"));
									rad = Math.toRadians(entity.getPersistentData().getDouble("start_r") + entity.getPersistentData().getDouble("cnt2"));
									x_num = xPos + Math.cos(rad) * (Math.cos(rad_now) + Math.abs(Math.sin(yaw_now) * Math.sin(rad_now))) * dis;
									y_num = yPos + Math.sin(rad_now) * Math.sin(rad) * dis;
									z_num = zPos + Math.sin(rad) * (Math.cos(rad_now) + Math.abs(Math.cos(yaw_now) * Math.sin(rad_now))) * dis;
									entity.getPersistentData().putDouble("x_pos", (entity.getPersistentData().getDouble("x_pos") + entity.getPersistentData().getDouble("y_pos")));
								} else {
									rad = Math.toRadians(entity.getPersistentData().getDouble("cnt2"));
									rad_now = Math.toRadians(entity.getPersistentData().getDouble("start_r"));
									x_num = xPos + Math.cos(rad) * Math.cos(rad_now) * dis;
									y_num = yPos + Math.sin(rad) * (-1) * dis;
									z_num = zPos + Math.cos(rad) * Math.sin(rad_now) * dis;
									if (rnd2 == 1) {
										entity.getPersistentData().putDouble("start_r", (entity.getPersistentData().getDouble("start_r") - entity.getPersistentData().getDouble("cnt3") / 1.8));
									} else {
										entity.getPersistentData().putDouble("start_r", (entity.getPersistentData().getDouble("start_r") - entity.getPersistentData().getDouble("cnt3") / (-1.8)));
									}
								}
								xPos = x_num;
								yPos = y_num;
								zPos = z_num;
								particle_cmd_parameter1 = "particle dust ";
								particle_cmd_parameter2 = " ~ ~ ~ 0 0 0 0 1 force";
								particle_cmd_text = particle_cmd_parameter1 + "" + entity.getPersistentData().getString("color1") + particle_cmd_parameter2;
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), particle_cmd_text);
								particle_cmd_text = particle_cmd_parameter1 + "" + entity.getPersistentData().getString("color2") + particle_cmd_parameter2;
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), particle_cmd_text);
								entity.getPersistentData().putDouble("damage", (7 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3
										+ (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(RanahiromodModMobEffects.LOW_ATTACK_REINFORCED.get()) ? _livEnt.getEffect(RanahiromodModMobEffects.LOW_ATTACK_REINFORCED.get()).getAmplifier() : 0)
												/ 5)));
								entity.getPersistentData().putDouble("knockback", (0.25 + Math.random()));
								entity.getPersistentData().putDouble("range", (3 * (1 + Math.random() * 2)));
								entity.getPersistentData().putDouble("projectile_type", Math.ceil(Math.random() * 2));
								DodamageProcedure.execute(world, xPos, yPos, zPos, entity);
								dis = dis + 0.2;
							}
							if (Math.random() < 0.01) {
								if (world instanceof ServerLevel _level)
									_level.sendParticles(ParticleTypes.SWEEP_ATTACK, xPos, yPos, zPos, 1, 0, 0, 0, 0);
							} else if (!(entity.getPersistentData().getString("color3")).equals("") && Math.random() < 0.3) {
								particle_cmd_parameter1 = "particle ";
								particle_cmd_parameter2 = " ~ ~ ~ 0.1 0.1 0.1 0 1 force";
								particle_cmd_text = particle_cmd_parameter1 + "" + entity.getPersistentData().getString("color3") + particle_cmd_parameter2;
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), particle_cmd_text);
							}
							entity.getPersistentData().putDouble("cnt2", (entity.getPersistentData().getDouble("cnt2") - 5));
							cnt = cnt + 5;
						}
					}
					time = entity.getPersistentData().getDouble("swing_skillcnt");
					if (entity.getPersistentData().getDouble("rnd") < 0.05) {
						time = time * 2;
						if (entity.getPersistentData().getDouble("cnt1") > 1) {
							entity.getPersistentData().putDouble("cnt4", (entity.getPersistentData().getDouble("cnt4") + 1));
							entity.getPersistentData().putDouble("cnt1", 0);
						}
						if (entity.getPersistentData().getDouble("cnt4") > time) {
							entity.getPersistentData().putDouble("skill2_swing", 0);
							entity.getPersistentData().putDouble("cnt1", 0);
							entity.getPersistentData().putString("color1", "");
							entity.getPersistentData().putString("color2", "");
							entity.getPersistentData().putString("color3", "");
						}
					} else {
						if (entity.getPersistentData().getDouble("cnt1") > time) {
							entity.getPersistentData().putDouble("skill2_swing", 0);
							entity.getPersistentData().putString("color1", "");
							entity.getPersistentData().putString("color2", "");
							entity.getPersistentData().putString("color3", "");
						}
					}
				}
			}
		}
	}
}
