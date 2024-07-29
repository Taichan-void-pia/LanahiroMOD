package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.ranahiromod.init.RanahiromodModMobEffects;
import net.mcreator.ranahiromod.entity.SweepEntity;

import java.util.List;
import java.util.Comparator;

public class AIWaterDragonProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double speed = 0;
		double xPos = 0;
		double yPos = 0;
		double zPos = 0;
		boolean logic_a = false;
		boolean flag = false;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(RanahiromodModMobEffects.NO_DAMAGE.get(), (int) Double.POSITIVE_INFINITY, 0, false, false));
		if (entity instanceof SweepEntity) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.FIREWORK, x, (y + 1), z, 15, 0, 1.5, 0, 1);
		} else {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, (y + 1), z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"particle dust 0.361 0.765 1.000 1 ~ ~ ~ 2 2 2 0.1 25 force");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, (y + 1), z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"particle dust 0 0 0.5 1 ~ ~ ~ 2 2 2 0.1 25 force");
		}
		entity.setDeltaMovement(new Vec3(0, 0, 0));
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(18 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (!flag && entity.getPersistentData().getDouble("NameRanged_ranged") == entityiterator.getPersistentData().getDouble("NameRanged")) {
					flag = true;
					{
						Entity _ent = entity;
						_ent.teleportTo((entityiterator.getPersistentData().getDouble("x_pos")), (entityiterator.getPersistentData().getDouble("y_pos")), (entityiterator.getPersistentData().getDouble("z_pos")));
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport((entityiterator.getPersistentData().getDouble("x_pos")), (entityiterator.getPersistentData().getDouble("y_pos")), (entityiterator.getPersistentData().getDouble("z_pos")), _ent.getYRot(),
									_ent.getXRot());
					}
					{
						Entity _ent = entity;
						_ent.setYRot(entityiterator.getYRot());
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
					if (entityiterator.getPersistentData().getDouble("skill2") == 0) {
						entity.getPersistentData().putBoolean("flag", true);
					}
				}
			}
		}
		if (!flag) {
			entity.getPersistentData().putBoolean("flag", true);
		}
		if (entity.getPersistentData().getBoolean("flag")) {
			entity.getPersistentData().putDouble("cnt1", (entity.getPersistentData().getDouble("cnt1") + 1));
			if (entity.getPersistentData().getDouble("cnt1") > 8) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, (y + 1), z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"particle dust 0.361 0.765 1.000 1 ~ ~ ~ 2 2 2 0.1 25 force");
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, (y + 1), z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"particle dust 0 0 0.5 1 ~ ~ ~ 2 2 2 0.1 25 force");
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.SPLASH, x, (y + 1), z, 50, 2.5, 2.5, 2.5, 0.2);
				if (!entity.level().isClientSide())
					entity.discard();
			}
		}
		if (!entity.isAlive()) {
			if (!entity.level().isClientSide())
				entity.discard();
		}
	}
}
