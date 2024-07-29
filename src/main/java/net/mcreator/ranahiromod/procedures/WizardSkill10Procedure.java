package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
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
import net.mcreator.ranahiromod.init.RanahiromodModMobEffects;

import java.util.List;
import java.util.Comparator;

public class WizardSkill10Procedure {
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
			if (entity.getPersistentData().getDouble("cnt1") == 1) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.cave")), SoundSource.NEUTRAL, 1, 0);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.cave")), SoundSource.NEUTRAL, 1, 0, false);
					}
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (RanahiromodModParticleTypes.BLACKFLAME.get()), x, (y + entity.getBbHeight() / 2), z, 30, 1, 1, 1, 1);
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.FIREWORK, x, (y + entity.getBbHeight() / 2), z, 150, 3, 3, 3, 0.3);
			}
			rad = Math.ceil(Math.random() * 15);
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(45 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (rad == 1) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ())), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null)
											.withSuppressedOutput(),
									"summon falling_block ~ ~ ~ {BlockState:{Name:\"minecraft:piston_head\",Properties:{facing:\"up\",short:\"false\",type:\"normal\"}},Time:1,DropItem:0b,HurtEntities:1b,FallHurtMax:1000,FallDistance:5f,FallHurtAmount:20f}");
					} else if (rad == 2) {
						if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(RanahiromodModMobEffects.DROP_VECTOR.get(), 400, 1, false, true));
					} else if (rad == 3) {
						if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.HUNGER, 60, 100, true, true));
					} else if (rad == 4) {
						if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 600, 0, false, false));
					} else if (rad == 5) {
						if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 600, 1, false, false));
					}
					if (rad == 6) {
						if (entityiterator instanceof LivingEntity _entity)
							_entity.removeAllEffects();
					} else if (rad == 7) {
						if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.JUMP, 600, 14, true, true));
					} else if (rad == 8) {
						if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 600, 10, false, true));
					} else if (rad == 9) {
						if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 600, 4, true, true));
					} else if (rad == 10) {
						if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 4, false, false));
					}
					if (rad == 11) {
						if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.SATURATION, 200, 0, false, false));
					} else if (rad == 12) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"summon area_effect_cloud ~ ~ ~ {Particle:\"entity_effect\",Radius:2.5f,Duration:200,Color:9699179,Effects:[{Id:6,Amplifier:0b,Duration:120}]}");
					} else if (rad == 13) {
						if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 600, 4, false, false));
					} else if (rad == 14) {
						if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 600, 4, false, false));
					} else if (rad == 15) {
						if (entityiterator instanceof LivingEntity && !(entityiterator == entity)) {
							{
								Entity _ent = entityiterator;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "kill @s");
								}
							}
						}
					}
				}
			}
			if (rad == 1) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal(("\uFF0A" + entity.getDisplayName().getString() + "\u9054\u306B\u4F55\u304B\u304C\u3076\u3064\u304B\u3063\u3066\u304D\u305F\u3002")), false);
			} else if (rad == 2) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal(("\uFF0A" + entity.getDisplayName().getString() + "\u9054\u306F\u7FFC\u3092\u5931\u3063\u305F\u3002")), false);
			} else if (rad == 3) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal(("\uFF0A" + entity.getDisplayName().getString() + "\u9054\u306F\u304A\u306A\u304B\u304C\u7A7A\u3044\u3066\u304D\u305F\u3002")), false);
			} else if (rad == 4) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal(("\uFF0A" + entity.getDisplayName().getString() + "\u9054\u306F\u5149\u3092\u5931\u3063\u305F\u3002")), false);
			} else if (rad == 5) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal(("\uFF0A" + entity.getDisplayName().getString() + "\u9054\u306F\u4F53\u304C\u8EFD\u304F\u306A\u3063\u305F\u3002")), false);
			}
			if (rad == 6) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal(("\uFF0A" + entity.getDisplayName().getString() + "\u9054\u306F\u4F53\u304C\u8EFD\u304F\u306A\u3063\u305F\u3002")), false);
			} else if (rad == 7) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal(("\uFF0A" + entity.getDisplayName().getString() + "\u9054\u306F\u7FFC\u3092\u6388\u304B\u3063\u305F\u3002")), false);
			} else if (rad == 8) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal(("\uFF0A" + entity.getDisplayName().getString() + "\u9054\u306E\u5468\u308A\u306E\u30D6\u30ED\u30C3\u30AF\u304C\u8EDF\u3089\u304B\u304F\u306A\u3063\u305F\u3002")), false);
			} else if (rad == 9) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal(("\uFF0A" + entity.getDisplayName().getString() + "\u9054\u306E\u611F\u899A\u304C\u7814\u304E\u6F84\u307E\u3055\u308C\u305F\u3002")), false);
			} else if (rad == 10) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal(("\uFF0A" + entity.getDisplayName().getString() + "\u9054\u306F\u98A8\u3092\u7E8F\u3063\u305F\u3002")), false);
			}
			if (rad == 11) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal(("\uFF0A" + entity.getDisplayName().getString() + "\u9054\u306E\u304A\u306A\u304B\u304C\u9CF4\u308A\u6B62\u3093\u3060\u3002")), false);
			} else if (rad == 12) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal(("\uFF0A" + entity.getDisplayName().getString() + "\u9054\u3092\u7652\u3057\u306E\u98A8\u304C\u5305\u307F\u8FBC\u3080\u3002")), false);
			} else if (rad == 13) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal(("\uFF0A" + entity.getDisplayName().getString() + "\u9054\u306E\u529B\u304C\u6E80\u3061\u6EA2\u308C\u3066\u304D\u305F\u3002")), false);
			} else if (rad == 14) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal(("\uFF0A" + entity.getDisplayName().getString() + "\u9054\u306F\u898B\u6163\u308C\u306A\u3044\u30B9\u30BF\u30FC\u3092\u62FE\u3063\u305F\u3002")), false);
			} else if (rad == 15) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal(("\uFF0A" + entity.getDisplayName().getString() + "\u306E\u9B54\u6CD5\u306F\u30A4\u30AA\u30CA\u30BA\u30F3\u306B\u306A\u3063\u305F\uFF01")), false);
			}
			entity.getPersistentData().putDouble("skill2", 0);
		}
	}
}
