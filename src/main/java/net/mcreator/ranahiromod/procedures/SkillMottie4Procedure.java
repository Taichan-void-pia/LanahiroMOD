package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
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
import net.mcreator.ranahiromod.entity.MochiMeteoEntity;

import java.util.List;
import java.util.Comparator;

public class SkillMottie4Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean flag_a = false;
		boolean flag = false;
		double xPos = 0;
		double yPos = 0;
		double zPos = 0;
		double rad = 0;
		double rad_now = 0;
		double yaw_now = 0;
		double dis = 0;
		double dis_start = 0;
		double HP = 0;
		double x_pos = 0;
		double y_pos = 0;
		double z_pos = 0;
		double yaw_fix = 0;
		entity.getPersistentData().putDouble("cnt1", (entity.getPersistentData().getDouble("cnt1") + 1));
		entity.fallDistance = 0;
		if (entity.getPersistentData().getDouble("cnt2") == 0) {
			if (entity.getPersistentData().getDouble("cnt1") == 1) {
				entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), 2, (entity.getDeltaMovement().z())));
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.CLOUD, x, y, z, 20, 0, 0, 0, 1);
			} else if (entity.getDeltaMovement().y() < 0.1 || entity.getPersistentData().getDouble("cnt1") > 30) {
				entity.getPersistentData().putDouble("cnt2", 1);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.slime_block.place")), SoundSource.NEUTRAL, 99, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.slime_block.place")), SoundSource.NEUTRAL, 99, 1, false);
					}
				}
			}
		} else {
			entity.getPersistentData().putDouble("cnt2", (entity.getPersistentData().getDouble("cnt2") + 1));
			yPos = y - 5;
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.FLAME, x, yPos, z, 150, 3, 3, 3, 0.5);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.CAMPFIRE_SIGNAL_SMOKE, x, yPos, z, 100, 3, 3, 3, 0.5);
			if (entity.getPersistentData().getDouble("cnt2") > 10) {
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
				xPos = x;
				yPos = y;
				zPos = z;
				HP = 400 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) * 40;
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							("summon ranahiromod:mochi_meteor ~ ~ ~ {Health:" + Math.round(HP) + "f,Attributes:[{Name:generic.max_health,Base:" + Math.round(HP) + "}],Rotation:[" + entity.getYRot() + "F," + entity.getXRot() + "F]}"));
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if (!world.getEntitiesOfClass(MochiMeteoEntity.class, AABB.ofSize(new Vec3(xPos, yPos, zPos), 5, 5, 5), e -> true).isEmpty()) {
							if (entityiterator == ((Entity) world.getEntitiesOfClass(MochiMeteoEntity.class, AABB.ofSize(new Vec3(xPos, yPos, zPos), 5, 5, 5), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(xPos, yPos, zPos)).findFirst().orElse(null))) {
								SetRangedAmmoProcedure.execute(world, x, y, z, entity);
								entity.startRiding(entityiterator);
							}
						}
					}
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(xPos, yPos, zPos), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.slime_block.place")), SoundSource.NEUTRAL, 99, (float) 0.5);
					} else {
						_level.playLocalSound(xPos, yPos, zPos, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.slime_block.place")), SoundSource.NEUTRAL, 99, (float) 0.5, false);
					}
				}
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(RanahiromodModMobEffects.NO_DAMAGE.get(), 240, 0, false, false));
				entity.getPersistentData().putDouble("skill2", 0);
			}
		}
	}
}
