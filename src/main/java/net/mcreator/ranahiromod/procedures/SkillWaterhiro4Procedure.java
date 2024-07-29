package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.ranahiromod.init.RanahiromodModEntities;
import net.mcreator.ranahiromod.entity.WaterDragonEntity;

import java.util.Comparator;

public class SkillWaterhiro4Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean type = false;
		double zPos = 0;
		double yPos = 0;
		double xPos = 0;
		double dis2 = 0;
		double dis = 0;
		double y_power = 0;
		double z_power = 0;
		double rad = 0;
		double rad_now = 0;
		double x_power = 0;
		double num1 = 0;
		double pitch = 0;
		double num3 = 0;
		double num2 = 0;
		double dis_range = 0;
		double tsuki7_mode = 0;
		double HP = 0;
		entity.getPersistentData().putDouble("cnt1", (entity.getPersistentData().getDouble("cnt1") + 1));
		entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x() / 4), (entity.getDeltaMovement().y()), (entity.getDeltaMovement().z() / 4)));
		if (entity.getPersistentData().getDouble("cnt1") < 15) {
			entity.getPersistentData().putDouble("x_pos",
					(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((-4))), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()));
			entity.getPersistentData().putDouble("y_pos", (y - 1 + entity.getPersistentData().getDouble("cnt1") / 4));
			entity.getPersistentData().putDouble("z_pos",
					(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((-4))), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()));
			xPos = entity.getPersistentData().getDouble("x_pos");
			yPos = entity.getPersistentData().getDouble("y_pos");
			zPos = entity.getPersistentData().getDouble("z_pos");
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.END_ROD, xPos, yPos, zPos, 25, 1, 1, 1, 0.05);
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"particle dust 0.361 0.765 1.000 2 ~ ~ ~ 1 1 1 0.05 25 force");
			if (entity.getPersistentData().getDouble("cnt1") == 1) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.blaze.shoot")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.blaze.shoot")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
			}
		} else {
			if (entity.getPersistentData().getDouble("cnt1") == 15) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ender_dragon.growl")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ender_dragon.growl")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.blaze.shoot")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.blaze.shoot")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				xPos = entity.getPersistentData().getDouble("x_pos");
				yPos = entity.getPersistentData().getDouble("y_pos");
				zPos = entity.getPersistentData().getDouble("z_pos");
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = RanahiromodModEntities.WATER_DRAGON.get().spawn(_level, BlockPos.containing(xPos, yPos, zPos), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(entity.getYRot());
						entityToSpawn.setYBodyRot(entity.getYRot());
						entityToSpawn.setYHeadRot(entity.getYRot());
						entityToSpawn.setXRot(entity.getXRot());
					}
				}
				if (!world.getEntitiesOfClass(WaterDragonEntity.class, AABB.ofSize(new Vec3(xPos, yPos, zPos), 0.5, 0.5, 0.5), e -> true).isEmpty()) {
					entity.getPersistentData().putDouble("NameRanged", Math.random());
					((Entity) world.getEntitiesOfClass(WaterDragonEntity.class, AABB.ofSize(new Vec3(xPos, yPos, zPos), 0.5, 0.5, 0.5), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(xPos, yPos, zPos)).findFirst().orElse(null)).getPersistentData().putDouble("NameRanged_ranged", (entity.getPersistentData().getDouble("NameRanged")));
				}
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
			}
			dis = Math.min((entity.getPersistentData().getDouble("cnt1") - 14.5) * 0.6, 6);
			num1 = 0;
			for (int index0 = 0; index0 < 72; index0++) {
				rad = Math.toRadians(entity.getPersistentData().getDouble("start_r") + num1);
				xPos = x + Math.cos(rad) * dis;
				yPos = y + 0.1;
				zPos = z + Math.sin(rad) * dis;
				if (!world.getBlockState(BlockPos.containing(xPos, yPos, zPos)).canOcclude()) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"particle dust 0.361 0.765 1.000 2 ~ ~ ~ 0.1 0.1 0.1 0.05 1 force");
				}
				num1 = num1 + 5;
			}
			num1 = 0;
			entity.getPersistentData().putDouble("start_r", (entity.getYRot() + 90));
			rad_now = Math.toRadians(entity.getXRot());
			for (int index1 = 0; index1 < 72; index1++) {
				rad = Math.toRadians(entity.getPersistentData().getDouble("start_r") + num1);
				xPos = x + Math.cos(rad) * Math.cos(rad_now) * dis;
				yPos = y + Math.sin(rad) * dis;
				zPos = z + Math.cos(rad) * Math.sin(rad_now) * dis;
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.BUBBLE, xPos, yPos, zPos, 1, 0.1, 0.1, 0.1, 0.05);
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.SPLASH, xPos, yPos, zPos, 1, 0.1, 0.1, 0.1, 0.05);
				num1 = num1 + 5;
			}
			if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity) {
				GetPowerProcedure.execute(world, x, y, z, entity);
			} else {
				GetPowerFowardProcedure.execute(world, x, y, z, entity);
			}
			x_power = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(4)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()
					- entity.getPersistentData().getDouble("x_pos");
			y_power = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(4)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY()
					- entity.getPersistentData().getDouble("y_pos");
			z_power = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(4)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()
					- entity.getPersistentData().getDouble("z_pos");
			dis = Math.abs(x_power) + Math.abs(y_power) + Math.abs(z_power);
			if (dis != 0) {
				x_power = x_power / (dis * 1.2);
				y_power = y_power / (dis * 1.2);
				z_power = z_power / (dis * 1.2);
			} else {
				x_power = 0;
				y_power = 0;
				z_power = 0;
			}
			entity.getPersistentData().putDouble("x_pos", (entity.getPersistentData().getDouble("x_pos") + x_power));
			entity.getPersistentData().putDouble("y_pos", (entity.getPersistentData().getDouble("y_pos") + y_power));
			entity.getPersistentData().putDouble("z_pos", (entity.getPersistentData().getDouble("z_pos") + z_power));
			xPos = entity.getPersistentData().getDouble("x_pos");
			yPos = entity.getPersistentData().getDouble("y_pos");
			zPos = entity.getPersistentData().getDouble("z_pos");
			entity.getPersistentData().putDouble("damage", (22 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
			entity.getPersistentData().putDouble("knockback", 1.5);
			entity.getPersistentData().putDouble("range", 5);
			entity.getPersistentData().putDouble("projectile_type", 1);
			DodamageProcedure.execute(world, xPos, yPos, zPos, entity);
			if (world.getBlockState(BlockPos.containing(xPos, yPos, zPos)).canOcclude()) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"particle dust 0.361 0.765 1.000 2 ~ ~ ~ 0.3 0.3 0.3 0.5 50 force");
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.SPLASH, xPos, yPos, zPos, 5, 0.3, 0.3, 0.3, 0.5);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(xPos, yPos, zPos), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.end_gateway.spawn")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(xPos, yPos, zPos, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.end_gateway.spawn")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
		}
		if (entity.getPersistentData().getDouble("cnt1") > 35) {
			entity.getPersistentData().putDouble("skill2", 0);
		}
	}
}
