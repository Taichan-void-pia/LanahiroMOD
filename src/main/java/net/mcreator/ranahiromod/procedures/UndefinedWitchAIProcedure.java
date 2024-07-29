package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.ranahiromod.init.RanahiromodModParticleTypes;

import java.util.List;
import java.util.Comparator;

public class UndefinedWitchAIProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double rnd = 0;
		double dis = 0;
		if (entity.isAlive()) {
			if (entity.getPersistentData().getDouble("cnt_y") == 0) {
				if (!((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) >= 0)
						|| (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) < 4) {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, (int) Double.POSITIVE_INFINITY, 6, false, false));
				}
				entity.getPersistentData().putDouble("cnt_y", 1);
			}
			entity.getPersistentData().putDouble("cnt_target", (entity.getPersistentData().getDouble("cnt_target") + 1));
			entity.getPersistentData().putDouble("cnt_x", (entity.getPersistentData().getDouble("cnt_x") + 1));
			if (entity.getPersistentData().getDouble("cnt_x") > 15) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, (y + 3), z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							("summon potion ~ ~ ~ {Motion:[" + (Math.random() - 0.5) * 2 + "," + Math.random() * 0.3 + "," + (Math.random() - 0.5) * 2
									+ "],Item:{id:\"minecraft:splash_potion\",Count:1b,tag:{Potion:\"minecraft:empty\",CustomPotionColor:15073535,CustomPotionEffects:[{Id:4,Amplifier:3b,Duration:160},{Id:9,Amplifier:0b,Duration:160},{Id:15,Amplifier:0b,Duration:160},{Id:19,Amplifier:5b,Duration:160},{Id:20,Amplifier:5b,Duration:160},{Id:33,Amplifier:0b,Duration:160}]}}}"));
				entity.getPersistentData().putDouble("cnt_x", 0);
			}
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (RanahiromodModParticleTypes.NULL_PARTICLE.get()), x, (y + entity.getBbHeight() / 2), z, 10, (entity.getBbWidth() / 2), (entity.getBbHeight() / 4), (entity.getBbWidth() / 2), 0.05);
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (!(entityiterator == entity)) {
						if (entityiterator instanceof LivingEntity) {
							if (!entityiterator.getPersistentData().getBoolean("teshita")) {
								entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)), 50);
							}
						}
					}
				}
			}
			if (!((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity)) {
				entity.getPersistentData().putDouble("cnt_target", 0);
				if (entity.getPersistentData().getDouble("cnt_x") > 50) {
					entity.getPersistentData().putDouble("cnt_x", 50);
				}
			} else if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity) {
				DirectionProcedure.execute(entity);
			}
		}
	}
}
