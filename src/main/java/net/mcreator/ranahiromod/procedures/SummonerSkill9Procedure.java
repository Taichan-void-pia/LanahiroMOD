package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.ranahiromod.init.RanahiromodModEntities;
import net.mcreator.ranahiromod.entity.EntitySummonerUpdateMarkerEntity;

import java.util.Comparator;

public class SummonerSkill9Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean found = false;
		double zPos = 0;
		double yPos = 0;
		double xPos = 0;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		entity.getPersistentData().putDouble("cnt1", (entity.getPersistentData().getDouble("cnt1") + 1));
		if (entity.getPersistentData().getDouble("cnt1") == 1) {
			if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.AIR) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, (y - 1), z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"setblock ~ ~ ~ minecraft:obsidian");
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = RanahiromodModEntities.ENTITY_SUMMONER_UPDATE_MARKER.get().spawn(_level, BlockPos.containing(x, y - 1, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
					}
				}
				found = true;
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.AIR) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"setblock ~ ~ ~ minecraft:obsidian");
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = RanahiromodModEntities.ENTITY_SUMMONER_UPDATE_MARKER.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
					}
				}
				found = true;
			} else {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("\u7A7A\u9593\u304C\u3042\u308A\u307E\u305B\u3093\uFF01"), false);
			}
			if (found) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.portal.travel")), SoundSource.NEUTRAL, (float) 0.1, (float) 1.6);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.portal.travel")), SoundSource.NEUTRAL, (float) 0.1, (float) 1.6, false);
					}
				}
				if ((entity.getPersistentData().getString("UUID")).equals("")) {
					entity.getPersistentData().putString("UUID", (entity.getStringUUID()));
				}
				if (!world.getEntitiesOfClass(EntitySummonerUpdateMarkerEntity.class, AABB.ofSize(new Vec3(x, (y - 1), z), 5, 5, 5), e -> true).isEmpty()) {
					((Entity) world.getEntitiesOfClass(EntitySummonerUpdateMarkerEntity.class, AABB.ofSize(new Vec3(x, (y - 1), z), 5, 5, 5), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, (y - 1), z)).findFirst().orElse(null)).getPersistentData().putString("OwnerUUID", (entity.getPersistentData().getString("UUID")));
					((Entity) world.getEntitiesOfClass(EntitySummonerUpdateMarkerEntity.class, AABB.ofSize(new Vec3(x, (y - 1), z), 5, 5, 5), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, (y - 1), z)).findFirst().orElse(null)).setNoGravity(true);
					if (((Entity) world.getEntitiesOfClass(EntitySummonerUpdateMarkerEntity.class, AABB.ofSize(new Vec3(x, (y - 1), z), 5, 5, 5), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, (y - 1), z)).findFirst().orElse(null)) instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, (int) Double.POSITIVE_INFINITY,
								entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0, false, false));
				}
			}
		}
		if (entity.getPersistentData().getDouble("cnt1") > 3) {
			entity.getPersistentData().putDouble("skill2", 0);
		}
	}
}
