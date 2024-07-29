package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import java.util.List;
import java.util.Comparator;

public class SkillGroundhiro3Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean muki = false;
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
		entity.getPersistentData().putDouble("cnt1", (entity.getPersistentData().getDouble("cnt1") + 1));
		if (entity.getPersistentData().getDouble("cnt1") < 15) {
			if (entity.getPersistentData().getDouble("cnt1") == 1) {
				if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity) {
					{
						final Vec3 _center = new Vec3(x, y, z);
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
						for (Entity entityiterator : _entfound) {
							if (entityiterator == (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null)) {
								entity.getPersistentData().putDouble("x_pos", (entityiterator.getX()));
								entity.getPersistentData().putDouble("y_pos", (entityiterator.getY() + 1));
								entity.getPersistentData().putDouble("z_pos", (entityiterator.getZ()));
							}
						}
					}
				} else {
					entity.getPersistentData().putDouble("x_pos",
							(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(10)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()));
					entity.getPersistentData().putDouble("y_pos",
							(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(10)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY()));
					entity.getPersistentData().putDouble("z_pos",
							(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(10)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()));
				}
				xPos = entity.getPersistentData().getDouble("x_pos");
				yPos = entity.getPersistentData().getDouble("y_pos");
				zPos = entity.getPersistentData().getDouble("z_pos");
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(xPos, yPos, zPos), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ranahiromod:wind_magic_jugeki1")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(xPos, yPos, zPos, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ranahiromod:wind_magic_jugeki1")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
		} else {
			xPos = entity.getPersistentData().getDouble("x_pos");
			yPos = entity.getPersistentData().getDouble("y_pos");
			zPos = entity.getPersistentData().getDouble("z_pos");
			dis = entity.getPersistentData().getDouble("cnt1") - 14;
			for (int index0 = 0; index0 < 10; index0++) {
				rad = Math.toRadians(cnt);
				xPos = xPos + Math.cos(rad) * dis;
				yPos = yPos;
				zPos = zPos + Math.sin(rad) * dis;
				world.levelEvent(2001, BlockPos.containing(xPos, yPos, zPos), Block.getId(Blocks.DIRT.defaultBlockState()));
				entity.getPersistentData().putDouble("damage", (16 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
				entity.getPersistentData().putDouble("knockback", 1);
				entity.getPersistentData().putDouble("range", 3);
				DodamageProcedure.execute(world, xPos, yPos, zPos, entity);
				cnt = cnt + 36;
			}
			if (entity.getPersistentData().getDouble("cnt1") > 21) {
				entity.getPersistentData().putDouble("skill2", 0);
			}
		}
	}
}
