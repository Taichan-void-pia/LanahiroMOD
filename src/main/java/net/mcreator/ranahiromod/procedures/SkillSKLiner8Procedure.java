package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
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

public class SkillSKLiner8Procedure {
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
		double pitch = 0;
		double num1 = 0;
		double num2 = 0;
		double num3 = 0;
		double tick = 0;
		double x_pos = 0;
		double y_pos = 0;
		double z_pos = 0;
		double DealDamage = 0;
		double dis_count = 0;
		double yaw = 0;
		entity.getPersistentData().putDouble("cnt1", (entity.getPersistentData().getDouble("cnt1") + 1));
		UseSK = UsePlayerLogicProcedure.execute(entity);
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 10, 99, false, false));
		if (entity.getPersistentData().getDouble("cnt1") < 35) {
			if (entity.getPersistentData().getDouble("cnt1") < 8) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.breath")), SoundSource.NEUTRAL, 1, (float) 0.5);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.breath")), SoundSource.NEUTRAL, 1, (float) 0.5, false);
					}
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (RanahiromodModParticleTypes.BLACKFLAME.get()), x, (y + 1), z, 7, (entity.getBbWidth()), (entity.getBbHeight() / 2), (entity.getBbWidth()), 0.5);
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (RanahiromodModParticleTypes.SK_LINER_BLADE_PARTICLE.get()), x, (y + 1), z, 13, (entity.getBbWidth()), (entity.getBbHeight() / 2), (entity.getBbWidth()), 0.25);
			}
			if (entity.getPersistentData().getDouble("cnt1") >= 8) {
				entity.getPersistentData().putDouble("cnt2", (entity.getPersistentData().getDouble("cnt2") + 1));
				if (entity.getPersistentData().getDouble("cnt1") <= 30) {
					yaw = entity.getYRot();
					pitch = entity.getXRot();
					if (entity.getPersistentData().getDouble("cnt2") % 2 == 0) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.enchantment_table.use")), SoundSource.NEUTRAL, 1, (float) 0.75);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.enchantment_table.use")), SoundSource.NEUTRAL, 1, (float) 0.75, false);
							}
						}
						{
							Entity _ent = entity;
							_ent.setYRot((float) (yaw + (Math.random() - 0.5) * 60));
							_ent.setXRot((float) (pitch + (Math.random() - 0.5) * 30));
							_ent.setYBodyRot(_ent.getYRot());
							_ent.setYHeadRot(_ent.getYRot());
							_ent.yRotO = _ent.getYRot();
							_ent.xRotO = _ent.getXRot();
							if (_ent instanceof LivingEntity _entity) {
								_entity.yBodyRotO = _entity.getYRot();
								_entity.yHeadRotO = _entity.getYRot();
							}
						}
						for (int index0 = 0; index0 < 20; index0++) {
							dis = dis_count + Math.max(entity.getPersistentData().getDouble("cnt2") / 2, 1) * 1.65;
							xPos = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(dis)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX();
							yPos = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(dis)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY();
							zPos = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(dis)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ();
							entity.getPersistentData().putDouble("damage", (25 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
							entity.getPersistentData().putDouble("range", 3);
							entity.getPersistentData().putDouble("knockback", 1);
							entity.getPersistentData().putDouble("projectile_type", 2);
							DodamageProcedure.execute(world, xPos, yPos, zPos, entity);
							if (Math.random() < 0.1) {
								if (world instanceof ServerLevel _level)
									_level.sendParticles(ParticleTypes.ENCHANT, xPos, yPos, zPos, 15, 0.2, 0.2, 0.2, 0.05);
								if (world instanceof ServerLevel _level)
									_level.sendParticles(ParticleTypes.FIREWORK, xPos, yPos, zPos, 5, 0.2, 0.2, 0.2, 0.05);
							}
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"particle dust_color_transition 0.500 1.000 1.000 1 0.350 0.250 1.000 ~ ~ ~ 0.2 0.2 0.2 0.25 5 force");
							if (UseSK) {
								if (Math.random() < 0.15) {
									if (world instanceof ServerLevel _level)
										_level.sendParticles((SimpleParticleType) (RanahiromodModParticleTypes.SK_LINER_BLADE_PARTICLE.get()), xPos, yPos, zPos, 1, 0.3, 0.3, 0.3, 0.01);
								}
								if (Math.random() < 0.075) {
									if (world instanceof ServerLevel _level)
										_level.sendParticles((SimpleParticleType) (RanahiromodModParticleTypes.SK_LINER_BLADE_PARTICLE_2.get()), xPos, yPos, zPos, 1, 0.1, 0.1, 0.1, 0.01);
								}
							}
							dis_count = dis_count + 1;
						}
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
					}
				}
			}
		} else {
			entity.getPersistentData().putDouble("skill2", 0);
		}
	}
}
