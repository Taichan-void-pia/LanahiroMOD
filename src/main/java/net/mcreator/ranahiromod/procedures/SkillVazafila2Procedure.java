package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.ranahiromod.init.RanahiromodModMobEffects;
import net.mcreator.ranahiromod.init.RanahiromodModEntities;
import net.mcreator.ranahiromod.entity.PhotonSeekerProjectileEntity;

public class SkillVazafila2Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean UseSK = false;
		boolean logic_attack = false;
		boolean UseVazafila = false;
		boolean muki = false;
		boolean type = false;
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
		double dis_start = 0;
		double x_center = 0;
		double y_center = 0;
		double z_center = 0;
		entity.getPersistentData().putDouble("cnt1", (entity.getPersistentData().getDouble("cnt1") + 1));
		UseVazafila = UsePlayerLogicvazafilaProcedure.execute(entity);
		if (entity.getPersistentData().getDouble("cnt1") < 15) {
			if (entity.getPersistentData().getDouble("cnt2") == 0) {
				if (entity.getPersistentData().getDouble("cnt1") == 1) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wither.shoot")), SoundSource.NEUTRAL, (float) 0.1, (float) 0.5);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wither.shoot")), SoundSource.NEUTRAL, (float) 0.1, (float) 0.5, false);
						}
					}
				}
				entity.getPersistentData().putDouble("damage", (10 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 10, 10, false, false));
				xPos = x;
				yPos = y + entity.getBbHeight() / 2;
				zPos = z;
				if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(RanahiromodModMobEffects.LOW_ATTACK_REINFORCED.get()) ? _livEnt.getEffect(RanahiromodModMobEffects.LOW_ATTACK_REINFORCED.get()).getAmplifier() : 0) >= 0) {
					if (Math.random() < 0.5) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"particle dust 1.000 0.596 0.071 1 ~ ~ ~ 0.25 0.25 0.25 0 1 force");
					} else {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"particle dust 0.631 0.345 0.063 1 ~ ~ ~ 0.25 0.25 0.25 0 1 force");
					}
				} else {
					if (Math.random() < 0.5) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"particle dust 0.627 0.141 1.000 1 ~ ~ ~ 0.25 0.25 0.25 0 1 force");
					} else {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"particle dust 0.271 0.063 0.431 1 ~ ~ ~ 0.25 0.25 0.25 0 1 force");
					}
				}
			}
		} else {
			entity.getPersistentData().putDouble("cnt1", 12);
			entity.getPersistentData().putDouble("cnt2", (entity.getPersistentData().getDouble("cnt2") + 1));
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.shoot")), SoundSource.NEUTRAL, 1, (float) 0.8);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.shoot")), SoundSource.NEUTRAL, 1, (float) 0.8, false);
				}
			}
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
			dis = entity.getYRot();
			rotate = entity.getXRot();
			{
				Entity _ent = entity;
				_ent.setYRot((float) (dis + (Math.random() - 0.5) * 30));
				_ent.setXRot((float) (rotate + (Math.random() - 0.5) * 30));
				_ent.setYBodyRot(_ent.getYRot());
				_ent.setYHeadRot(_ent.getYRot());
				_ent.yRotO = _ent.getYRot();
				_ent.xRotO = _ent.getXRot();
				if (_ent instanceof LivingEntity _entity) {
					_entity.yBodyRotO = _entity.getYRot();
					_entity.yHeadRotO = _entity.getYRot();
				}
			}
			{
				Entity _shootFrom = entity;
				Level projectileLevel = _shootFrom.level();
				if (!projectileLevel.isClientSide()) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
							AbstractArrow entityToSpawn = new PhotonSeekerProjectileEntity(RanahiromodModEntities.PHOTON_SEEKER_PROJECTILE.get(), level);
							entityToSpawn.setOwner(shooter);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, entity, (float) (8 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)), (int) 1.25);
					_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
					_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 2, 0);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			}
			{
				Entity _ent = entity;
				_ent.setYRot((float) dis);
				_ent.setXRot((float) rotate);
				_ent.setYBodyRot(_ent.getYRot());
				_ent.setYHeadRot(_ent.getYRot());
				_ent.yRotO = _ent.getYRot();
				_ent.xRotO = _ent.getXRot();
				if (_ent instanceof LivingEntity _entity) {
					_entity.yBodyRotO = _entity.getYRot();
					_entity.yHeadRotO = _entity.getYRot();
				}
			}
			entity.getPersistentData().putDouble("start_r", (Math.random() * 360));
			rad_now = Math.toRadians((Math.random() - 0.5) * 180);
			yaw_now = Math.toRadians(Math.random() * 360);
			x_center = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(2)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()
					+ (Math.random() - 0.5) * 2;
			y_center = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(2)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY()
					+ (Math.random() - 0.5) * 2;
			z_center = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(2)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()
					+ (Math.random() - 0.5) * 2;
			dis_start = 1.5 + Math.random() * 1.5;
			if (UseVazafila) {
				dis_start = dis_start * 1.5;
			}
			for (int index0 = 0; index0 < 12; index0++) {
				rad = Math.toRadians(entity.getPersistentData().getDouble("start_r") + entity.getPersistentData().getDouble("cnt3"));
				dis = dis_start;
				for (int index1 = 0; index1 < 4; index1++) {
					xPos = x_center + Math.cos(rad) * (Math.cos(rad_now) + Math.abs(Math.sin(yaw_now) * Math.sin(rad_now))) * dis;
					yPos = y_center + Math.sin(Math.toRadians(entity.getPersistentData().getDouble("cnt3"))) * Math.sin(rad_now) * (-1) * dis;
					zPos = z_center + Math.sin(rad) * (Math.cos(rad_now) + Math.abs(Math.cos(yaw_now) * Math.sin(rad_now))) * dis;
					if (entity instanceof LivingEntity _livEnt34 && _livEnt34.hasEffect(RanahiromodModMobEffects.LOW_ATTACK_REINFORCED.get())) {
						if (Math.random() < 0.5) {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"particle dust 1.000 0.596 0.071 1 ~ ~ ~ 0.05 0.05 0.05 0 1 force");
						} else {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"particle dust 0.631 0.345 0.063 1 ~ ~ ~ 0.05 0.05 0.05 0 1 force");
						}
					} else {
						if (Math.random() < 0.5) {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"particle dust 0.627 0.141 1.000 1 ~ ~ ~ 0.05 0.05 0.05 0 1 force");
						} else {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"particle dust 0.271 0.063 0.431 1 ~ ~ ~ 0.05 0.05 0.05 0 1 force");
						}
					}
					if (UseVazafila) {
						if (Math.random() < 0.15) {
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.PORTAL, xPos, yPos, zPos, 10, 0, 0, 0, 1);
						}
						if (Math.random() < 0.075) {
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.REVERSE_PORTAL, xPos, yPos, zPos, 10, 0, 0, 0, 1);
						}
					}
					if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(RanahiromodModMobEffects.LOW_ATTACK_REINFORCED.get()) ? _livEnt.getEffect(RanahiromodModMobEffects.LOW_ATTACK_REINFORCED.get()).getAmplifier() : 0) >= 0) {
						entity.getPersistentData().putDouble("damage", (19 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
					} else {
						entity.getPersistentData().putDouble("damage", (15 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
					}
					if (UseVazafila) {
						entity.getPersistentData().putDouble("range", 3);
					} else {
						entity.getPersistentData().putDouble("range", 2);
					}
					entity.getPersistentData().putDouble("knockback", 1);
					DodamageProcedure.execute(world, xPos, yPos, zPos, entity);
					dis = dis + 0.1;
				}
				entity.getPersistentData().putDouble("cnt3", (entity.getPersistentData().getDouble("cnt3") + 10));
			}
		}
		if (entity.getPersistentData().getDouble("cnt2") > 3) {
			entity.getPersistentData().putDouble("skill2", 0);
		}
	}
}
