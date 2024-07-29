package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.ranahiromod.RanahiromodMod;

import java.util.List;
import java.util.Comparator;

public class SummonerSkill8Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double zPos = 0;
		double yPos = 0;
		double xPos = 0;
		double distance = 0;
		double rad = 0;
		double rad_now = 0;
		entity.getPersistentData().putDouble("cnt1", (entity.getPersistentData().getDouble("cnt1") + 1));
		if (entity.getPersistentData().getDouble("cnt1") >= 1) {
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(35 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (!(entityiterator == entity) && entityiterator instanceof LivingEntity) {
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.CRIT, (entityiterator.getX()), (entityiterator.getY() + entityiterator.getBbHeight()), (entityiterator.getZ()), 14, 0.3, 0.3, 0.3, 0.3);
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3((entityiterator.getX()), (entityiterator.getY() + entityiterator.getBbHeight()), (entityiterator.getZ())), Vec2.ZERO, _level, 4, "", Component.literal(""),
											_level.getServer(), null).withSuppressedOutput(),
									("summon falling_block ~ ~ ~ {BlockState:{Name:\"minecraft:chorus_flower\"},Time:1,DropItem:0b,HurtEntities:1b,FallHurtMax:" + ""
											+ ((10 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3))
													+ ",FallDistance:10f,FallHurtAmount:"
													+ (10 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3))
													+ "f,Tags:[\"Kirakira\"]}")));
						distance = Math.round(entityiterator.getBbHeight() * 5);
						RanahiromodMod.queueServerWork((int) distance, () -> {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ())), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null)
												.withSuppressedOutput(),
										("execute as @e[type=falling_block,tag=Kirakira] at @e[type=falling_block,tag=Kirakira] run " + "data merge entity @s {BlockState:{Name:\"minecraft:piston_head\",Properties:{type:\"normal\"}},Time:1}"));
							RanahiromodMod.queueServerWork(2, () -> {
								if (world instanceof Level _level && !_level.isClientSide())
									_level.explode(null, (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 4, Level.ExplosionInteraction.NONE);
							});
						});
					}
				}
			}
			entity.getPersistentData().putDouble("skill2", 0);
		}
	}
}
