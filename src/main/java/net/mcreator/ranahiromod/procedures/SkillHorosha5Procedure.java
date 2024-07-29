package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.ranahiromod.entity.EntityRedEntity;

import java.util.Comparator;

public class SkillHorosha5Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double x_pos = 0;
		double y_pos = 0;
		double z_pos = 0;
		double hp = 0;
		entity.getPersistentData().putDouble("cnt1", (entity.getPersistentData().getDouble("cnt1") + 1));
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 20, 10, false, false));
		entity.setDeltaMovement(new Vec3(0, (entity.getDeltaMovement().y()), 0));
		entity.getPersistentData().putDouble("x_pos",
				(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(2)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()));
		entity.getPersistentData().putDouble("y_pos",
				(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(2)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY()));
		entity.getPersistentData().putDouble("z_pos",
				(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(2)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()));
		if (entity.getPersistentData().getDouble("cnt1") == 1) {
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
			x_pos = entity.getPersistentData().getDouble("x_pos");
			y_pos = entity.getPersistentData().getDouble("y_pos");
			z_pos = entity.getPersistentData().getDouble("z_pos");
			hp = 40 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) * 20;
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x_pos, y_pos, z_pos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						("summon ranahiromod:entity_red ~ ~ ~ {Health:" + Math.round(hp) + "f,Attributes:[{Name:generic.max_health,Base:" + Math.round(hp) + "}],Rotation:[" + entity.getYRot() + "F," + entity.getXRot() + "F]}"));
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ranahiromod:wind_magic_jugeki2")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ranahiromod:wind_magic_jugeki2")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			if (!world.getEntitiesOfClass(EntityRedEntity.class, AABB.ofSize(new Vec3(x_pos, y_pos, z_pos), 5, 5, 5), e -> true).isEmpty()) {
				if (entity.getPersistentData().getDouble("NameRanged") == 0) {
					entity.getPersistentData().putDouble("NameRanged", Math.random());
				}
				((Entity) world.getEntitiesOfClass(EntityRedEntity.class, AABB.ofSize(new Vec3(x_pos, y_pos, z_pos), 5, 5, 5), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x_pos, y_pos, z_pos)).findFirst().orElse(null)).getPersistentData().putDouble("NameRanged_ranged", (entity.getPersistentData().getDouble("NameRanged")));
				if (((Entity) world.getEntitiesOfClass(EntityRedEntity.class, AABB.ofSize(new Vec3(x_pos, y_pos, z_pos), 5, 5, 5), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x_pos, y_pos, z_pos)).findFirst().orElse(null)) instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, (int) Double.POSITIVE_INFINITY,
							entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0, false, false));
			}
		} else if (entity.getPersistentData().getDouble("cnt1") > 20) {
			entity.getPersistentData().putDouble("skill2", 0);
		}
		entity.getPersistentData().putBoolean("canFly", true);
		entity.getPersistentData().putDouble("power_mag", 10);
		GetPowerFowardProcedure.execute(world, x, y, z, entity);
	}
}
