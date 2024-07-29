package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.ranahiromod.init.RanahiromodModMobEffects;
import net.mcreator.ranahiromod.entity.WardenHandEntity;

import java.util.Comparator;

public class SkillWardenhiro3Procedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double rad = 0;
		double rad_now = 0;
		double yaw_now = 0;
		double pitch = 0;
		double x_pos = 0;
		double y_pos = 0;
		double z_pos = 0;
		double dis = 0;
		double xPos = 0;
		double yPos = 0;
		double zPos = 0;
		double HP = 0;
		Entity targetentity = null;
		boolean fang_logic = false;
		boolean flag = false;
		entity.getPersistentData().putDouble("cnt1", (entity.getPersistentData().getDouble("cnt1") + 1));
		if (entity.getPersistentData().getDouble("cnt1") > 0) {
			entity.getPersistentData().putDouble("cnt1", (-2));
			entity.getPersistentData().putDouble("cnt2", (entity.getPersistentData().getDouble("cnt2") + 1));
			HP = 15 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) * 5;
			if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity) {
				xPos = (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX();
				yPos = (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY();
				zPos = (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ();
			} else {
				xPos = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(20)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX();
				yPos = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(20)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY();
				zPos = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(20)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ();
			}
			xPos = xPos + (Math.random() - 0.5) * 7;
			yPos = yPos + (Math.random() - 0.5) * 7;
			zPos = zPos + (Math.random() - 0.5) * 7;
			for (int index0 = 0; index0 < 320; index0++) {
				if (world.getBlockState(BlockPos.containing(xPos, yPos, zPos)).canOcclude()) {
					flag = true;
					yPos = yPos - 3;
					break;
				}
				yPos = yPos - 1;
			}
			if (flag) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							("summon ranahiromod:warden_hand ~ ~ ~ {Health:" + Math.round(HP) + "f,Attributes:[{Name:generic.max_health,Base:" + Math.round(HP) + "}],Rotation:[" + entity.getYRot() + "F,0F]}"));
				if (!world.getEntitiesOfClass(WardenHandEntity.class, AABB.ofSize(new Vec3(xPos, yPos, zPos), 0.5, 0.5, 0.5), e -> true).isEmpty()) {
					if (entity.getPersistentData().getDouble("friend_num") == 0) {
						entity.getPersistentData().putDouble("friend_num", Math.random());
					}
					((Entity) world.getEntitiesOfClass(WardenHandEntity.class, AABB.ofSize(new Vec3(xPos, yPos, zPos), 0.5, 0.5, 0.5), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(xPos, yPos, zPos)).findFirst().orElse(null)).getPersistentData().putDouble("friend_num", (entity.getPersistentData().getDouble("friend_num")));
					if (((Entity) world.getEntitiesOfClass(WardenHandEntity.class, AABB.ofSize(new Vec3(xPos, yPos, zPos), 0.5, 0.5, 0.5), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(xPos, yPos, zPos)).findFirst().orElse(null)) instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, (int) Double.POSITIVE_INFINITY,
								entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0, false, false));
					if (((Entity) world.getEntitiesOfClass(WardenHandEntity.class, AABB.ofSize(new Vec3(xPos, yPos, zPos), 0.5, 0.5, 0.5), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(xPos, yPos, zPos)).findFirst().orElse(null)) instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(RanahiromodModMobEffects.NO_DAMAGE.get(), (int) Double.POSITIVE_INFINITY, 0, false, false));
				}
			}
		}
		if (entity.getPersistentData().getDouble("cnt2") > 9) {
			entity.getPersistentData().putDouble("skill2", 0);
		}
	}
}
