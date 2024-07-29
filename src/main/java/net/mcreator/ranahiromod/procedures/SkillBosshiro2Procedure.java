package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.ranahiromod.init.RanahiromodModParticleTypes;

public class SkillBosshiro2Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean muki = false;
		boolean UseBoss2 = false;
		double rad = 0;
		double rad_now = 0;
		double yaw_now = 0;
		double x_pos = 0;
		double y_pos = 0;
		double z_pos = 0;
		double dis = 0;
		double zPos = 0;
		double yPos = 0;
		double xRadius = 0;
		double zRadius = 0;
		double pitch = 0;
		double xPos = 0;
		double yaw = 0;
		double rotate = 0;
		entity.setDeltaMovement(new Vec3(0, (entity.getDeltaMovement().y()), 0));
		UseBoss2 = UsePlayerLogicRanahiroProcedure.execute(entity);
		if (entity.getPersistentData().getDouble("cnt2") == 0) {
			entity.getPersistentData().putDouble("cnt1_2", (entity.getPersistentData().getDouble("cnt1_2") + 1));
			if (entity.getPersistentData().getDouble("cnt1_2") > 0) {
				entity.getPersistentData().putDouble("cnt1_2", (-2));
				entity.getPersistentData().putDouble("cnt2_2", (entity.getPersistentData().getDouble("cnt2_2") + 1));
				if (entity.getPersistentData().getDouble("cnt2_2") < 4) {
					yaw = entity.getYRot();
					pitch = entity.getXRot();
					if (entity.getPersistentData().getDouble("cnt2_2") == 1) {
						entity.getPersistentData().putDouble("yaw", (entity.getYRot()));
						entity.getPersistentData().putDouble("pitch", (entity.getXRot()));
						entity.getPersistentData().putDouble("x_pos",
								(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(6)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()));
						entity.getPersistentData().putDouble("y_pos",
								(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(6)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY() + 3));
						entity.getPersistentData().putDouble("z_pos",
								(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(6)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()));
						{
							Entity _ent = entity;
							_ent.setYRot((float) (entity.getPersistentData().getDouble("yaw") - 90));
							_ent.setXRot(60);
							_ent.setYBodyRot(_ent.getYRot());
							_ent.setYHeadRot(_ent.getYRot());
							_ent.yRotO = _ent.getYRot();
							_ent.xRotO = _ent.getXRot();
							if (_ent instanceof LivingEntity _entity) {
								_entity.yBodyRotO = _entity.getYRot();
								_entity.yHeadRotO = _entity.getYRot();
							}
						}
					} else if (entity.getPersistentData().getDouble("cnt2_2") == 2) {
						{
							Entity _ent = entity;
							_ent.setYRot((float) (entity.getPersistentData().getDouble("yaw") + 90));
							_ent.setXRot(0);
							_ent.setYBodyRot(_ent.getYRot());
							_ent.setYHeadRot(_ent.getYRot());
							_ent.yRotO = _ent.getYRot();
							_ent.xRotO = _ent.getXRot();
							if (_ent instanceof LivingEntity _entity) {
								_entity.yBodyRotO = _entity.getYRot();
								_entity.yHeadRotO = _entity.getYRot();
							}
						}
					} else if (entity.getPersistentData().getDouble("cnt2_2") == 3) {
						{
							Entity _ent = entity;
							_ent.setYRot((float) (entity.getPersistentData().getDouble("yaw") - 90));
							_ent.setXRot(-60);
							_ent.setYBodyRot(_ent.getYRot());
							_ent.setYHeadRot(_ent.getYRot());
							_ent.yRotO = _ent.getYRot();
							_ent.xRotO = _ent.getXRot();
							if (_ent instanceof LivingEntity _entity) {
								_entity.yBodyRotO = _entity.getYRot();
								_entity.yHeadRotO = _entity.getYRot();
							}
						}
					}
					entity.getPersistentData().putBoolean("canFly", true);
					GetPowerFowardProcedure.execute(world, x, y, z, entity);
					entity.getPersistentData().putDouble("x_power", (entity.getPersistentData().getDouble("x_power") * 0.05));
					entity.getPersistentData().putDouble("y_power", (entity.getPersistentData().getDouble("y_power") * 0.05));
					entity.getPersistentData().putDouble("z_power", (entity.getPersistentData().getDouble("z_power") * 0.05));
					{
						Entity _ent = entity;
						_ent.setYRot((float) yaw);
						_ent.setXRot((float) pitch);
						_ent.setYBodyRot(_ent.getYRot());
						_ent.setYHeadRot(_ent.getYRot());
						_ent.yRotO = _ent.getYRot();
						_ent.xRotO = _ent.getXRot();
						if (_ent instanceof LivingEntity _entity) {
							_entity.yBodyRotO = _entity.getYRot();
							_entity.yHeadRotO = _entity.getYRot();
						}
					}
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
				} else {
					entity.getPersistentData().putDouble("cnt1_2", 0);
					entity.getPersistentData().putDouble("cnt2_2", 0);
					entity.getPersistentData().putDouble("cnt2", 1);
					entity.getPersistentData().putBoolean("canFly", false);
				}
			}
			if (entity.getPersistentData().getDouble("cnt2_2") < 4) {
				for (int index0 = 0; index0 < 22; index0++) {
					xPos = entity.getPersistentData().getDouble("x_pos");
					yPos = entity.getPersistentData().getDouble("y_pos");
					zPos = entity.getPersistentData().getDouble("z_pos");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"particle dust 0.6 0.05 0.1 2 ~ ~ ~ 0.05 0.05 0.05 1 10 force");
					if (UseBoss2) {
						if (Math.random() < 0.1) {
							if (world instanceof ServerLevel _level)
								_level.sendParticles((SimpleParticleType) (RanahiromodModParticleTypes.LIGHT_SCATTER.get()), xPos, yPos, zPos, 5, 0, 0, 0, 0.25);
						}
						entity.getPersistentData().putDouble("damage", (15 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
						entity.getPersistentData().putDouble("range", 3.5);
					} else {
						entity.getPersistentData().putDouble("damage", (13 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
						entity.getPersistentData().putDouble("range", 2.5);
					}
					entity.getPersistentData().putDouble("knockback", 1.5);
					entity.getPersistentData().putDouble("projectile_type", 1);
					DodamageProcedure.execute(world, xPos, yPos, zPos, entity);
					entity.getPersistentData().putDouble("x_pos", (entity.getPersistentData().getDouble("x_pos") + entity.getPersistentData().getDouble("x_power")));
					entity.getPersistentData().putDouble("y_pos", (entity.getPersistentData().getDouble("y_pos") + entity.getPersistentData().getDouble("y_power")));
					entity.getPersistentData().putDouble("z_pos", (entity.getPersistentData().getDouble("z_pos") + entity.getPersistentData().getDouble("z_power")));
				}
			}
		} else if (entity.getPersistentData().getDouble("cnt2") == 1) {
			entity.getPersistentData().putDouble("cnt1_1", (entity.getPersistentData().getDouble("cnt1_1") + 1));
			if (entity.getPersistentData().getDouble("cnt1_1") > 0) {
				entity.getPersistentData().putDouble("cnt1_1", (-2));
				entity.getPersistentData().putDouble("cnt2_1", (entity.getPersistentData().getDouble("cnt2_1") + 1));
				if (entity.getPersistentData().getDouble("cnt2_1") < 4) {
					yaw = entity.getYRot();
					pitch = entity.getXRot();
					if (entity.getPersistentData().getDouble("cnt2_1") == 1) {
						entity.getPersistentData().putDouble("yaw", (entity.getYRot()));
						entity.getPersistentData().putDouble("pitch", (entity.getXRot()));
						entity.getPersistentData().putDouble("x_pos",
								(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(6)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()));
						entity.getPersistentData().putDouble("y_pos",
								(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(6)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY() - 3));
						entity.getPersistentData().putDouble("z_pos",
								(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(6)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()));
						{
							Entity _ent = entity;
							_ent.setYRot((float) (entity.getPersistentData().getDouble("yaw") - 90));
							_ent.setXRot(-60);
							_ent.setYBodyRot(_ent.getYRot());
							_ent.setYHeadRot(_ent.getYRot());
							_ent.yRotO = _ent.getYRot();
							_ent.xRotO = _ent.getXRot();
							if (_ent instanceof LivingEntity _entity) {
								_entity.yBodyRotO = _entity.getYRot();
								_entity.yHeadRotO = _entity.getYRot();
							}
						}
					} else if (entity.getPersistentData().getDouble("cnt2_1") == 2) {
						{
							Entity _ent = entity;
							_ent.setYRot((float) (entity.getPersistentData().getDouble("yaw") + 90));
							_ent.setXRot(0);
							_ent.setYBodyRot(_ent.getYRot());
							_ent.setYHeadRot(_ent.getYRot());
							_ent.yRotO = _ent.getYRot();
							_ent.xRotO = _ent.getXRot();
							if (_ent instanceof LivingEntity _entity) {
								_entity.yBodyRotO = _entity.getYRot();
								_entity.yHeadRotO = _entity.getYRot();
							}
						}
					} else if (entity.getPersistentData().getDouble("cnt2_1") == 3) {
						{
							Entity _ent = entity;
							_ent.setYRot((float) (entity.getPersistentData().getDouble("yaw") - 90));
							_ent.setXRot(60);
							_ent.setYBodyRot(_ent.getYRot());
							_ent.setYHeadRot(_ent.getYRot());
							_ent.yRotO = _ent.getYRot();
							_ent.xRotO = _ent.getXRot();
							if (_ent instanceof LivingEntity _entity) {
								_entity.yBodyRotO = _entity.getYRot();
								_entity.yHeadRotO = _entity.getYRot();
							}
						}
					}
					entity.getPersistentData().putBoolean("canFly", true);
					GetPowerFowardProcedure.execute(world, x, y, z, entity);
					entity.getPersistentData().putDouble("x_power", (entity.getPersistentData().getDouble("x_power") * 0.05));
					entity.getPersistentData().putDouble("y_power", (entity.getPersistentData().getDouble("y_power") * 0.05));
					entity.getPersistentData().putDouble("z_power", (entity.getPersistentData().getDouble("z_power") * 0.05));
					{
						Entity _ent = entity;
						_ent.setYRot((float) yaw);
						_ent.setXRot((float) pitch);
						_ent.setYBodyRot(_ent.getYRot());
						_ent.setYHeadRot(_ent.getYRot());
						_ent.yRotO = _ent.getYRot();
						_ent.xRotO = _ent.getXRot();
						if (_ent instanceof LivingEntity _entity) {
							_entity.yBodyRotO = _entity.getYRot();
							_entity.yHeadRotO = _entity.getYRot();
						}
					}
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
				} else {
					entity.getPersistentData().putDouble("cnt1_1", 0);
					entity.getPersistentData().putDouble("cnt2_1", 0);
					entity.getPersistentData().putDouble("cnt2", 2);
					entity.getPersistentData().putBoolean("canFly", false);
				}
			}
			if (entity.getPersistentData().getDouble("cnt2_1") < 4) {
				for (int index1 = 0; index1 < 22; index1++) {
					xPos = entity.getPersistentData().getDouble("x_pos");
					yPos = entity.getPersistentData().getDouble("y_pos");
					zPos = entity.getPersistentData().getDouble("z_pos");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"particle dust 0.6 0.05 0.1 2 ~ ~ ~ 0.05 0.05 0.05 1 10 force");
					if (UseBoss2) {
						if (Math.random() < 0.1) {
							if (world instanceof ServerLevel _level)
								_level.sendParticles((SimpleParticleType) (RanahiromodModParticleTypes.LIGHT_SCATTER.get()), xPos, yPos, zPos, 5, 0, 0, 0, 0.25);
						}
						entity.getPersistentData().putDouble("damage", (15 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
						entity.getPersistentData().putDouble("range", 3.5);
					} else {
						entity.getPersistentData().putDouble("damage", (13 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
						entity.getPersistentData().putDouble("range", 2.5);
					}
					entity.getPersistentData().putDouble("knockback", 1.5);
					entity.getPersistentData().putDouble("projectile_type", 1);
					DodamageProcedure.execute(world, xPos, yPos, zPos, entity);
					entity.getPersistentData().putDouble("x_pos", (entity.getPersistentData().getDouble("x_pos") + entity.getPersistentData().getDouble("x_power")));
					entity.getPersistentData().putDouble("y_pos", (entity.getPersistentData().getDouble("y_pos") + entity.getPersistentData().getDouble("y_power")));
					entity.getPersistentData().putDouble("z_pos", (entity.getPersistentData().getDouble("z_pos") + entity.getPersistentData().getDouble("z_power")));
				}
			}
		} else {
			entity.getPersistentData().putDouble("start_r", (entity.getYRot()));
			dis = 5;
			rad_now = Math.toRadians(entity.getYRot());
			for (int index2 = 0; index2 < 72; index2++) {
				rad = Math.toRadians(entity.getPersistentData().getDouble("start_r") + rotate);
				xPos = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(6)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()
						+ Math.cos(rad) * Math.cos(rad_now) * dis;
				yPos = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(6)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY()
						+ Math.sin(rad) * dis;
				zPos = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(6)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()
						+ Math.cos(rad) * Math.sin(rad_now) * dis;
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"particle dust 0.6 0.05 0.1 2 ~ ~ ~ 0.05 0.05 0.05 1 10 force");
				if (UseBoss2) {
					if (Math.random() < 0.1) {
						if (world instanceof ServerLevel _level)
							_level.sendParticles((SimpleParticleType) (RanahiromodModParticleTypes.LIGHT_SCATTER.get()), xPos, yPos, zPos, 5, 0, 0, 0, 0.25);
					}
					entity.getPersistentData().putDouble("damage", (15 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
					entity.getPersistentData().putDouble("range", 3.5);
				} else {
					entity.getPersistentData().putDouble("damage", (13 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
					entity.getPersistentData().putDouble("range", 2.5);
				}
				entity.getPersistentData().putDouble("knockback", 1.5);
				entity.getPersistentData().putDouble("projectile_type", 1);
				DodamageProcedure.execute(world, xPos, yPos, zPos, entity);
				rotate = rotate + 5;
			}
			entity.getPersistentData().putDouble("skill2", 0);
		}
	}
}
