package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ClipContext;
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

public class SkillDragonhiro4Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean UseSK = false;
		boolean logic_attack = false;
		double range = 0;
		double data = 0;
		double rad = 0;
		double rad_now = 0;
		double xPos = 0;
		double yPos = 0;
		double zPos = 0;
		double yaw_now = 0;
		double dis = 0;
		double rotate = 0;
		double pitch = 0;
		double num1 = 0;
		double num2 = 0;
		double num3 = 0;
		double tick = 0;
		double x_pos = 0;
		double y_pos = 0;
		double z_pos = 0;
		double DealDamage = 0;
		double tsuki_mode9 = 0;
		entity.getPersistentData().putDouble("cnt1", (entity.getPersistentData().getDouble("cnt1") + 1));
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
			for (int index0 = 0; index0 < 3; index0++) {
				tsuki_mode9 = tsuki_mode9 + 1;
				entity.getPersistentData().putDouble(("x_pos" + Math.round(tsuki_mode9)), (x + Math.random() * 10 - 5));
				entity.getPersistentData().putDouble(("y_pos" + Math.round(tsuki_mode9)), (y + 5));
				entity.getPersistentData().putDouble(("z_pos" + Math.round(tsuki_mode9)), (z + Math.random() * 10 - 5));
				if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity) {
					entity.getPersistentData().putDouble(("x_power" + Math.round(tsuki_mode9)),
							(((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX() + Math.random() * 4 - 2) - entity.getPersistentData().getDouble(("x_pos" + Math.round(tsuki_mode9)))));
					entity.getPersistentData().putDouble(("y_power" + Math.round(tsuki_mode9)),
							(((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY() + Math.random() * 2 - 1.6) - entity.getPersistentData().getDouble(("y_pos" + Math.round(tsuki_mode9)))));
					entity.getPersistentData().putDouble(("z_power" + Math.round(tsuki_mode9)),
							(((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ() + Math.random() * 4 - 2) - entity.getPersistentData().getDouble(("z_pos" + Math.round(tsuki_mode9)))));
				} else {
					for (int index1 = 0; index1 < 10; index1++) {
						xPos = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(dis)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX();
						yPos = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(dis)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY();
						zPos = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(dis)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ();
						if (world.getBlockState(BlockPos.containing(xPos, yPos, zPos)).canOcclude()) {
							break;
						}
						dis = dis + 1;
					}
					entity.getPersistentData().putDouble(("x_power" + Math.round(tsuki_mode9)), ((xPos + Math.random() * 4 - 2) - entity.getPersistentData().getDouble(("x_pos" + Math.round(tsuki_mode9)))));
					entity.getPersistentData().putDouble(("y_power" + Math.round(tsuki_mode9)), ((yPos + Math.random() * 2 - 1.6) - entity.getPersistentData().getDouble(("y_pos" + Math.round(tsuki_mode9)))));
					entity.getPersistentData().putDouble(("z_power" + Math.round(tsuki_mode9)), ((zPos + Math.random() * 4 - 2) - entity.getPersistentData().getDouble(("z_pos" + Math.round(tsuki_mode9)))));
				}
				dis = Math.sqrt(Math.pow(entity.getPersistentData().getDouble(("x_power" + Math.round(tsuki_mode9))), 2) + Math.pow(entity.getPersistentData().getDouble(("y_power" + Math.round(tsuki_mode9))), 2)
						+ Math.pow(entity.getPersistentData().getDouble(("z_power" + Math.round(tsuki_mode9))), 2));
				entity.getPersistentData().putDouble(("x_power" + Math.round(tsuki_mode9)), ((entity.getPersistentData().getDouble(("x_power" + Math.round(tsuki_mode9))) / dis) * 1.8));
				entity.getPersistentData().putDouble(("y_power" + Math.round(tsuki_mode9)), ((entity.getPersistentData().getDouble(("y_power" + Math.round(tsuki_mode9))) / dis) * 1.8));
				entity.getPersistentData().putDouble(("z_power" + Math.round(tsuki_mode9)), ((entity.getPersistentData().getDouble(("z_power" + Math.round(tsuki_mode9))) / dis) * 1.8));
			}
		}
		for (int index2 = 0; index2 < 3; index2++) {
			tsuki_mode9 = tsuki_mode9 + 1;
			entity.getPersistentData().putDouble(("x_pos" + Math.round(tsuki_mode9)), (entity.getPersistentData().getDouble(("x_pos" + Math.round(tsuki_mode9))) + entity.getPersistentData().getDouble(("x_power" + Math.round(tsuki_mode9)))));
			entity.getPersistentData().putDouble(("y_pos" + Math.round(tsuki_mode9)), (entity.getPersistentData().getDouble(("y_pos" + Math.round(tsuki_mode9))) + entity.getPersistentData().getDouble(("y_power" + Math.round(tsuki_mode9)))));
			entity.getPersistentData().putDouble(("z_pos" + Math.round(tsuki_mode9)), (entity.getPersistentData().getDouble(("z_pos" + Math.round(tsuki_mode9))) + entity.getPersistentData().getDouble(("z_power" + Math.round(tsuki_mode9)))));
			xPos = entity.getPersistentData().getDouble(("x_pos" + Math.round(tsuki_mode9)));
			yPos = entity.getPersistentData().getDouble(("y_pos" + Math.round(tsuki_mode9)));
			zPos = entity.getPersistentData().getDouble(("z_pos" + Math.round(tsuki_mode9)));
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"particle dust 0.490 0.490 0.490 1 ~ ~ ~ 0.5 0.5 0.5 20 20 force");
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.FLAME, xPos, yPos, zPos, 20, 0.5, 0.5, 0.5, 0);
			entity.getPersistentData().putDouble("damage", (20 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
			entity.getPersistentData().putDouble("range", 3);
			entity.getPersistentData().putDouble("knockback", 0.5);
			entity.getPersistentData().putDouble("projectile_type", 1);
			DodamageProcedure.execute(world, xPos, yPos, zPos, entity);
		}
		if (entity.getPersistentData().getDouble("cnt1") > 28) {
			entity.getPersistentData().putDouble("skill2", 0);
		}
	}
}
