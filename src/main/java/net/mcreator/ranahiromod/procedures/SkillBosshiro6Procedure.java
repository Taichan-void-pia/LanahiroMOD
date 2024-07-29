package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.ranahiromod.init.RanahiromodModParticleTypes;

import java.util.List;
import java.util.Comparator;

public class SkillBosshiro6Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double rad = 0;
		double rad_now = 0;
		double yaw_now = 0;
		double x_pos = 0;
		double y_pos = 0;
		double z_pos = 0;
		double dis = 0;
		double zPos = 0;
		double yPos = 0;
		double xPos = 0;
		double count = 0;
		double cnt = 0;
		double speed = 0;
		Entity range_entity = null;
		boolean muki = false;
		boolean logic_a = false;
		entity.getPersistentData().putDouble("cnt1", (entity.getPersistentData().getDouble("cnt1") + 1));
		if (entity.getPersistentData().getDouble("cnt1") < 6) {
			entity.fallDistance = 0;
			if (entity.getPersistentData().getDouble("cnt1") == 1) {
				dis = 1;
				for (int index0 = 0; index0 < 20; index0++) {
					xPos = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(dis)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getX();
					yPos = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(dis)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getY();
					zPos = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(dis)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ();
					if (dis == 1) {
						if (world instanceof Level _level && !_level.isClientSide())
							_level.explode(null, x, y, z, 0, Level.ExplosionInteraction.NONE);
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.WITCH, xPos, yPos, zPos, 5, 0.25, 0.25, 0.25, 0.2);
					entity.getPersistentData().putDouble("damage", (22 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
					entity.getPersistentData().putDouble("range", 5);
					if (UsePlayerLogicRanahiroProcedure.execute(entity)) {
						if (Math.random() < 0.1) {
							if (world instanceof ServerLevel _level)
								_level.sendParticles((SimpleParticleType) (RanahiromodModParticleTypes.LIGHT_SCATTER.get()), xPos, yPos, zPos, 5, 0, 0, 0, 0.25);
						}
						entity.getPersistentData().putDouble("damage", (25 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
						entity.getPersistentData().putDouble("range", 6);
					}
					entity.getPersistentData().putDouble("knockback", 1.25);
					entity.getPersistentData().putDouble("projectile_type", 2);
					{
						final Vec3 _center = new Vec3(x, y, z);
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate((entity.getPersistentData().getDouble("range")) / 2d), e -> true).stream()
								.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
						for (Entity entityiterator : _entfound) {
							range_entity = entityiterator;
							if (!(range_entity == entity)) {
								if (entity.getPersistentData().getDouble("target_type") == 0) {
									logic_a = LogicAttackProcedure.execute(world, x, y, z, entity);
								} else if (entity.getPersistentData().getDouble("target_type") == 1) {
									logic_a = LogicAttack2Procedure.execute(world, x, y, z, entity);
								}
								if (logic_a) {
									if (range_entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
										_entity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 100, 0, false, false));
								}
							}
						}
					}
					DodamageProcedure.execute(world, xPos, yPos, zPos, entity);
					dis = dis + 0.5;
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie_villager.cure")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie_villager.cure")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				{
					Entity _ent = entity;
					_ent.teleportTo(xPos, yPos, zPos);
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport(xPos, yPos, zPos, _ent.getYRot(), _ent.getXRot());
				}
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"particle dust 0.6 0.05 0.1 1 ~ ~ ~ 0.5 0.5 0.5 1 100 force");
			}
		} else {
			entity.getPersistentData().putDouble("skill2", 0);
		}
	}
}
