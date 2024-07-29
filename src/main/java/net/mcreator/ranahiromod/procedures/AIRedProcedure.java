package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import java.util.List;
import java.util.Comparator;

public class AIRedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean logic_a = false;
		double x_pos = 0;
		double y_pos = 0;
		double z_pos = 0;
		double cnt = 0;
		double x_power = 0;
		double y_power = 0;
		double z_power = 0;
		double dis = 0;
		double yaw = 0;
		double rad_now = 0;
		double rad = 0;
		if (entity.getPersistentData().getDouble("NameRanged_ranged") != 0) {
			entity.getPersistentData().putDouble("cnt2", (entity.getPersistentData().getDouble("cnt2") + 1));
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(128 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (!(entityiterator == entity) && entity.getPersistentData().getDouble("NameRanged_ranged") == entityiterator.getPersistentData().getDouble("NameRanged")) {
						if (entityiterator.getPersistentData().getDouble("cnt1") > 10) {
							entity.getPersistentData().putBoolean("flag_start", true);
							entity.getPersistentData().putDouble("x_power", (entityiterator.getPersistentData().getDouble("x_power")));
							entity.getPersistentData().putDouble("y_power", (entityiterator.getPersistentData().getDouble("y_power")));
							entity.getPersistentData().putDouble("z_power", (entityiterator.getPersistentData().getDouble("z_power")));
						}
					}
				}
			}
			if (entity.getPersistentData().getDouble("cnt2") < 8) {
				for (int index0 = 0; index0 < 5; index0++) {
					if (Math.random() < 0.5) {
						logic_a = true;
					}
					if (cnt < 5) {
						dis = 0.1;
					} else {
						dis = 0.2 + (Math.random() - 0.5) * Math.min(0.2, cnt / 2);
					}
					yaw = Math.toRadians(Math.random() * 360);
					rad_now = Math.toRadians((Math.random() - 0.5) * 180);
					for (int index1 = 0; index1 < 72; index1++) {
						if (logic_a) {
							x_pos = x + Math.cos(rad) * (Math.cos(rad_now) + Math.abs(Math.sin(yaw)) * Math.sin(rad_now));
							y_pos = y + Math.sin(Math.toRadians(z_pos)) * Math.sin(rad_now) * (-1);
							z_pos = z + Math.sin(rad) * (Math.cos(rad_now) + Math.abs(Math.cos(yaw)) * Math.sin(rad_now));
						} else {
							x_pos = x + Math.cos(rad) * Math.cos(rad_now);
							y_pos = y + Math.sin(rad);
							z_pos = z + Math.cos(rad) * Math.sin(rad_now);
						}
						x_pos = x + (x_pos - x) * dis;
						y_pos = y + (y_pos - y) * dis;
						z_pos = z + (z_pos - z) * dis;
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3(x_pos, y_pos, z_pos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"particle dust_color_transition 1.0 0.5 0.5 1 1 0 0 ~ ~ ~ 0 0 0 0.1 1 force");
						rad = rad + Math.toRadians(5);
					}
					cnt = cnt + 1;
				}
			}
			if (entity.getPersistentData().getBoolean("flag_start")) {
				entity.getPersistentData().putDouble("cnt1", (entity.getPersistentData().getDouble("cnt1") + 1));
				if (entity.getPersistentData().getDouble("cnt1") == 1) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.end_gateway.spawn")), SoundSource.NEUTRAL, 5, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.end_gateway.spawn")), SoundSource.NEUTRAL, 5, 1, false);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.end_gateway.spawn")), SoundSource.NEUTRAL, 5, (float) 0.75);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.end_gateway.spawn")), SoundSource.NEUTRAL, 5, (float) 0.75, false);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.end_gateway.spawn")), SoundSource.NEUTRAL, 5, (float) 0.5);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.end_gateway.spawn")), SoundSource.NEUTRAL, 5, (float) 0.5, false);
						}
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.FLASH, x, y, z, 20, 5, 5, 5, 1);
					entity.getPersistentData().putDouble("x_pos", x);
					entity.getPersistentData().putDouble("y_pos", y);
					entity.getPersistentData().putDouble("z_pos", z);
				}
				for (int index2 = 0; index2 < 2; index2++) {
					entity.getPersistentData().putDouble("x_pos", (entity.getPersistentData().getDouble("x_pos") + entity.getPersistentData().getDouble("x_power")));
					entity.getPersistentData().putDouble("y_pos", (entity.getPersistentData().getDouble("y_pos") + entity.getPersistentData().getDouble("y_power")));
					entity.getPersistentData().putDouble("z_pos", (entity.getPersistentData().getDouble("z_pos") + entity.getPersistentData().getDouble("z_power")));
					x_pos = entity.getPersistentData().getDouble("x_pos");
					y_pos = entity.getPersistentData().getDouble("y_pos");
					z_pos = entity.getPersistentData().getDouble("z_pos");
					entity.getPersistentData().putDouble("damage", 30);
					entity.getPersistentData().putDouble("range", 30);
					entity.getPersistentData().putDouble("knockback", 4);
					DodamageProcedure.execute(world, x_pos, y_pos, z_pos, entity);
					entity.getPersistentData().putDouble("range", 12);
					entity.getPersistentData().putDouble("knockback", 4);
					KnockbackProcedure.execute(world, x_pos, y_pos, z_pos, entity);
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.EXPLOSION, x_pos, y_pos, z_pos, 12, 4, 4, 4, 1);
				}
				if (entity.getPersistentData().getDouble("cnt1") > 20) {
					if (!entity.level().isClientSide())
						entity.discard();
				}
			}
		}
	}
}
