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

public class SkillBosshiro7Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean UseSK = false;
		boolean logic_attack = false;
		double range = 0;
		double data = 0;
		double rad = 0;
		double rad_now = 0;
		double xPos = 0;
		double yPos = 0;
		double zPos = 0;
		double yaw_now = 0;
		double dis = 0;
		double rotate = 0;
		double loop_num = 0;
		entity.getPersistentData().putDouble("cnt1", (entity.getPersistentData().getDouble("cnt1") + 1));
		UseSK = UsePlayerLogicRanahiroProcedure.execute(entity);
		if (entity.getPersistentData().getDouble("cnt1") == 1) {
			if (UseSK) {
				entity.getPersistentData().putDouble("start_r", ((entity.getYRot() + 90) - 36));
			} else {
				entity.getPersistentData().putDouble("start_r", ((entity.getYRot() + 90) - 30));
			}
			entity.getPersistentData().putDouble("x_pos", x);
			entity.getPersistentData().putDouble("y_pos", y);
			entity.getPersistentData().putDouble("z_pos", z);
		}
		if (entity.getPersistentData().getDouble("cnt1") < 8) {
			if (entity.getPersistentData().getDouble("cnt1") % 3 == 1) {
				entity.getPersistentData().putDouble("cnt2", (entity.getXRot() - 160));
				entity.getPersistentData().putDouble("cnt3", (entity.getPersistentData().getDouble("cnt3") + 2.5));
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
			}
			for (int index0 = 0; index0 < 20; index0++) {
				data = -80;
				for (int index1 = 0; index1 < 3; index1++) {
					rad = Math.toRadians(entity.getPersistentData().getDouble("cnt2"));
					rad_now = Math.toRadians(entity.getYRot() + 90 + data);
					if (UseSK) {
						dis = (1 + entity.getPersistentData().getDouble("cnt3")) * 2;
					} else {
						dis = 1 + entity.getPersistentData().getDouble("cnt3");
					}
					for (int index2 = 0; index2 < 6; index2++) {
						xPos = entity.getX() + Math.cos(rad) * Math.cos(rad_now) * dis;
						yPos = entity.getY() + Math.sin(rad) * dis;
						zPos = entity.getZ() + Math.cos(rad) * Math.sin(rad_now) * dis;
						if (Math.random() < 0.5) {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"particle dust 0.6 0.05 0.1 1 ~ ~ ~ 0 0 0 1 0 force");
						} else {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"particle dust 0.75 0 0 1 ~ ~ ~ 0 0 0 1 0 force");
						}
						entity.getPersistentData().putDouble("damage", (19 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
						if (UseSK) {
							entity.getPersistentData().putDouble("range", 4);
						} else {
							entity.getPersistentData().putDouble("range", 3);
						}
						entity.getPersistentData().putDouble("knockback", 0.75);
						entity.getPersistentData().putDouble("projectile_type", 1);
						DodamageProcedure.execute(world, xPos, yPos, zPos, entity);
						dis = dis + 0.2;
					}
					if (UseSK) {
						if (Math.random() < 0.15) {
							if (world instanceof ServerLevel _level)
								_level.sendParticles((SimpleParticleType) (RanahiromodModParticleTypes.LIGHT_SCATTER.get()), xPos, yPos, zPos, 1, 0.3, 0.3, 0.3, 0.01);
						}
					}
					data = data + 80 + (Math.random() - 0.5) * 20;
				}
				entity.getPersistentData().putDouble("cnt2", (entity.getPersistentData().getDouble("cnt2") + 4));
			}
		}
		if (entity.getPersistentData().getDouble("cnt1") < 12) {
			rotate = 0;
			if (UseSK) {
				loop_num = 5;
			} else {
				loop_num = 3;
			}
			for (int index3 = 0; index3 < (int) loop_num; index3++) {
				rad = Math.toRadians(entity.getPersistentData().getDouble("start_r") + rotate);
				dis = (entity.getPersistentData().getDouble("cnt1") + 1) * 2;
				if (UseSK) {
					dis = dis * 2;
				}
				for (int index4 = 0; index4 < 9; index4++) {
					xPos = entity.getPersistentData().getDouble("x_pos") + Math.cos(rad) * dis;
					yPos = entity.getPersistentData().getDouble("y_pos");
					zPos = entity.getPersistentData().getDouble("z_pos") + Math.sin(rad) * dis;
					logic_attack = true;
					if (world.getBlockState(BlockPos.containing(xPos, yPos, zPos)).canOcclude()) {
						yPos = entity.getPersistentData().getDouble("y_pos");
						for (int index5 = 0; index5 < (int) Math.round(dis * 5); index5++) {
							logic_attack = true;
							yPos = yPos + 0.5;
							if (!world.getBlockState(BlockPos.containing(xPos, yPos, zPos)).canOcclude()) {
								break;
							}
							logic_attack = false;
						}
					} else if (!world.getBlockState(BlockPos.containing(xPos, yPos - 0.3, zPos)).canOcclude()) {
						yPos = entity.getPersistentData().getDouble("y_pos");
						for (int index6 = 0; index6 < (int) Math.round(dis); index6++) {
							yPos = yPos - 1;
							if (world.getBlockState(BlockPos.containing(xPos, yPos - 0.3, zPos)).canOcclude()) {
								break;
							}
						}
					}
					if (logic_attack) {
						for (int index7 = 0; index7 < 5; index7++) {
							if (Math.random() < 0.5) {
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
											"particle dust 0.6 0.05 0.1 1 ~ ~ ~ 0.3 0.3 0.3 1 2 force");
							} else {
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
											"particle dust 0.75 0 0 1 ~ ~ ~ 0.3 0.3 0.3 1 2 force");
							}
						}
						if (UseSK) {
							entity.getPersistentData().putDouble("damage", (17 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
						} else {
							entity.getPersistentData().putDouble("damage", (15 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
						}
						if (UseSK) {
							if (Math.random() < 0.1) {
								if (world instanceof ServerLevel _level)
									_level.sendParticles((SimpleParticleType) (RanahiromodModParticleTypes.LIGHT_SCATTER.get()), xPos, yPos, zPos, 5, 0.3, 0.3, 0.3, 0.01);
							}
							entity.getPersistentData().putDouble("range", 2.5);
						} else {
							entity.getPersistentData().putDouble("range", 2);
						}
						entity.getPersistentData().putDouble("knockback", 0.5);
						entity.getPersistentData().putDouble("projectile_type", 2);
						DodamageProcedure.execute(world, xPos, yPos, zPos, entity);
					}
					dis = dis + 0.2;
				}
				if (UseSK) {
					rotate = rotate + 18;
				} else {
					rotate = rotate + 30;
				}
			}
		}
		if (entity.getPersistentData().getDouble("cnt1") > 15) {
			entity.getPersistentData().putDouble("skill2", 0);
		}
	}
}
