package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ClipContext;
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

public class SkillWeaponhiro1NeoProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
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
		boolean muki = false;
		boolean UseBoss2 = false;
		if (entity.getPersistentData().getDouble("cnt1") >= 0 && entity.getPersistentData().getDouble("skill2") != 1001 || entity.getPersistentData().getDouble("cnt1") > 0 && entity.getPersistentData().getDouble("skill2") == 1001) {
			entity.getPersistentData().putDouble("cnt1", (entity.getPersistentData().getDouble("cnt1") + 1));
			if (entity.getPersistentData().getDouble("cnt1") == 2) {
				entity.getPersistentData().putDouble("start_r", (entity.getYRot() + 10));
				entity.getPersistentData().putDouble("pitch_now", (entity.getXRot()));
				entity.getPersistentData().putDouble("x_pos", x);
				entity.getPersistentData().putDouble("y_pos", y);
				entity.getPersistentData().putDouble("z_pos", z);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ranahiromod:sword_sweep")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ranahiromod:sword_sweep")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
				if (entity.getPersistentData().getDouble("skill2") == 1001) {
					entity.getPersistentData().putDouble("x_pos",
							(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((-3))), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()));
					entity.getPersistentData().putDouble("y_pos",
							(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((-3))), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY()));
					entity.getPersistentData().putDouble("z_pos",
							(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((-3))), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()));
				}
			}
			for (int index0 = 0; index0 < 3; index0++) {
				dis = 3;
				for (int index1 = 0; index1 < 8; index1++) {
					rad = Math.toRadians(entity.getPersistentData().getDouble("start_r") + entity.getPersistentData().getDouble("cnt2"));
					rad_now = Math.toRadians(entity.getPersistentData().getDouble("pitch_now"));
					yaw_now = Math.toRadians(entity.getYRot() + 90);
					xPos = entity.getPersistentData().getDouble("x_pos") + Math.cos(rad) * (Math.cos(rad_now) + Math.abs(Math.sin(yaw_now) * Math.sin(rad_now))) * dis;
					yPos = entity.getPersistentData().getDouble("y_pos") + 1 + Math.sin(Math.toRadians(entity.getPersistentData().getDouble("cnt2"))) * Math.sin(rad_now) * (-1) * dis;
					zPos = entity.getPersistentData().getDouble("z_pos") + Math.sin(rad) * (Math.cos(rad_now) + Math.abs(Math.cos(yaw_now) * Math.sin(rad_now))) * dis;
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"particle dust 0 0 0 1 ~ ~ ~ 0.25 0.15 0.25 1 5 force");
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.SWEEP_ATTACK, xPos, yPos, zPos, 2, 0, 0, 0, 0.2);
					entity.getPersistentData().putDouble("damage", (17 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
					entity.getPersistentData().putDouble("range", 1.5);
					entity.getPersistentData().putDouble("knockback", 2.5);
					entity.getPersistentData().putDouble("projectile_type", 2);
					DodamageProcedure.execute(world, xPos, yPos, zPos, entity);
					dis = dis + 1;
				}
				entity.getPersistentData().putDouble("cnt2", (entity.getPersistentData().getDouble("cnt2") + 5.4));
			}
			if (entity.getPersistentData().getDouble("cnt1") > 11) {
				if (entity.getPersistentData().getDouble("skill2") == 1001) {
					entity.getPersistentData().putDouble("cnt1", 0);
					entity.getPersistentData().putDouble("cnt2", 0);
					WeaponhiroItemEntityUseEndProcedure.execute(entity);
				} else {
					entity.getPersistentData().putDouble("skill2", 0);
				}
			}
		}
	}
}
