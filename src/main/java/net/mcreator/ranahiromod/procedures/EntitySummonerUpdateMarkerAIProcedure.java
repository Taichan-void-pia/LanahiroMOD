package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.ranahiromod.init.RanahiromodModMobEffects;
import net.mcreator.ranahiromod.init.RanahiromodModGameRules;
import net.mcreator.ranahiromod.entity.EntitySummonerUpdateMarkerEntity;

import java.util.List;
import java.util.Comparator;

public class EntitySummonerUpdateMarkerAIProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double particle_fixed = 0;
		double strength_user = 0;
		if (entity.isAlive()) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(RanahiromodModMobEffects.NO_DAMAGE.get(), (int) Double.POSITIVE_INFINITY, 0, false, false));
			if (entity.getPersistentData().getDouble("cnt_life") == 0) {
				entity.getPersistentData().putDouble("cnt_life2", (entity.getPersistentData().getDouble("cnt_life2") + 1));
			}
			if (entity.getPersistentData().getDouble("cnt_life2") > 60) {
				if (!entity.level().isClientSide())
					entity.discard();
			}
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(300 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (!(entityiterator == entity) && entityiterator instanceof LivingEntity) {
						if ((entity.getPersistentData().getString("OwnerUUID")).equals(entityiterator.getPersistentData().getString("UUID"))) {
							entity.getPersistentData().putDouble("cnt_life", (entity.getPersistentData().getDouble("cnt_life") + 1));
							if (!entity.getPersistentData().getBoolean("start_count")) {
								if (entityiterator.getPersistentData().getDouble("skill2") == 20505 || entityiterator.getPersistentData().getDouble("skill2") == 20507 || entityiterator.getPersistentData().getDouble("skill2") == 20509) {
									entity.getPersistentData().putDouble("particle_fixed", (entityiterator.getPersistentData().getDouble("skill2") - 20501));
									entity.getPersistentData().putBoolean("start_count", true);
								} else {
									if (!entity.level().isClientSide())
										entity.discard();
								}
							} else {
								particle_fixed = entity.getPersistentData().getDouble("particle_fixed");
								if (entity.getPersistentData().getDouble("particle_fixed") == 8) {
									if (world instanceof ServerLevel _level)
										_level.sendParticles(ParticleTypes.PORTAL, x, y, z, (int) (10 + particle_fixed), 0.5, 0.5, 0.5, 1);
									if (world instanceof ServerLevel _level)
										_level.sendParticles(ParticleTypes.REVERSE_PORTAL, x, y, z, (int) (10 + particle_fixed), 0.5, 0.5, 0.5, 1);
								} else {
									if (world instanceof ServerLevel _level)
										_level.sendParticles(ParticleTypes.PORTAL, x, y, z, (int) (10 + particle_fixed), 0.5, 0.5, 0.5, 0.3);
								}
							}
						}
					}
				}
			}
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(35 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (!(entityiterator == entity) && entityiterator instanceof LivingEntity) {
						if (entity.getPersistentData().getDouble("particle_fixed") == 8) {
							if (entity.getPersistentData().getDouble("cnt_life") >= 80) {
								if ((world.getLevelData().getGameRules().getBoolean(RanahiromodModGameRules.LANAHIROMODPVP) == true
										? !(entity.getPersistentData().getString("OwnerUUID")).equals(entityiterator.getPersistentData().getString("UUID"))
										: !(entityiterator instanceof Player)) && entityiterator instanceof LivingEntity && !(entityiterator instanceof Villager) && !(entityiterator instanceof EntitySummonerUpdateMarkerEntity)) {
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")), SoundSource.NEUTRAL, (float) 0.3, 1);
										} else {
											_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")), SoundSource.NEUTRAL, (float) 0.3, 1, false);
										}
									}
									{
										Entity _ent = entityiterator;
										_ent.teleportTo(x, (y + 1), z);
										if (_ent instanceof ServerPlayer _serverPlayer)
											_serverPlayer.connection.teleport(x, (y + 1), z, _ent.getYRot(), _ent.getXRot());
									}
									{
										Entity _ent = entityiterator;
										_ent.setYRot((float) (entityiterator.getYRot() + 3));
										_ent.setXRot(entityiterator.getXRot());
										_ent.setYBodyRot(_ent.getYRot());
										_ent.setYHeadRot(_ent.getYRot());
										_ent.yRotO = _ent.getYRot();
										_ent.xRotO = _ent.getXRot();
										if (_ent instanceof LivingEntity _entity) {
											_entity.yBodyRotO = _entity.getYRot();
											_entity.yHeadRotO = _entity.getYRot();
										}
									}
									entity.getPersistentData().putDouble("range", 3);
									entity.getPersistentData().putDouble("damage",
											Math.round((10 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)) / 3));
									AllTargetDamage3Procedure.execute(world, x, y + 1, z, entity);
								}
							}
						}
					}
				}
			}
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (!(entityiterator == entity) && entityiterator instanceof LivingEntity) {
						if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 60, 99, false, false));
					}
				}
			}
			if (entity.getPersistentData().getDouble("cnt_life") > (entity.getPersistentData().getDouble("particle_fixed") == 8 ? 300 : 200)) {
				if (entity.getPersistentData().getDouble("particle_fixed") == 4 || entity.getPersistentData().getDouble("particle_fixed") == 8) {
					if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.OBSIDIAN) {
						world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
					}
				} else if (entity.getPersistentData().getDouble("particle_fixed") == 6) {
					if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.ENDER_CHEST) {
						world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
					}
				}
				if (!entity.level().isClientSide())
					entity.discard();
			}
		}
	}
}
