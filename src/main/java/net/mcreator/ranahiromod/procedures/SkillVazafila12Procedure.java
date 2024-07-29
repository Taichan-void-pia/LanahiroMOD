package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
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

public class SkillVazafila12Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean UseSK = false;
		boolean logic_attack = false;
		boolean UseVazafila = false;
		boolean muki = false;
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
		double dis_start = 0;
		double xPos2 = 0;
		double yPos2 = 0;
		double zPos2 = 0;
		entity.getPersistentData().putDouble("cnt1", (entity.getPersistentData().getDouble("cnt1") + 1));
		entity.setDeltaMovement(new Vec3(0, (entity.getDeltaMovement().y()), 0));
		if (entity.getPersistentData().getDouble("cnt1") > 0) {
			entity.getPersistentData().putDouble("cnt1", (-3));
			entity.getPersistentData().putDouble("cnt2", 0);
			entity.getPersistentData().putDouble("cnt3", (entity.getPersistentData().getDouble("cnt3") + 1));
			if (entity.getPersistentData().getDouble("cnt3") % 2 == 1) {
				entity.getPersistentData().putDouble("start_r", (entity.getYRot() + 30));
			} else {
				entity.getPersistentData().putDouble("start_r", (entity.getYRot() + 150));
			}
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
		}
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, 1, 2);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, 1, 2, false);
			}
		}
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.NEUTRAL, 1, 2);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.NEUTRAL, 1, 2, false);
			}
		}
		for (int index0 = 0; index0 < 6; index0++) {
			dis = entity.getPersistentData().getDouble("cnt3") * 3;
			for (int index1 = 0; index1 < (int) (entity.getPersistentData().getDouble("cnt3") + 1); index1++) {
				if (entity.getPersistentData().getDouble("cnt3") % 2 == 1) {
					rad = Math.toRadians(entity.getPersistentData().getDouble("start_r") + entity.getPersistentData().getDouble("cnt2"));
				} else {
					rad = Math.toRadians(entity.getPersistentData().getDouble("start_r") - entity.getPersistentData().getDouble("cnt2"));
				}
				rad_now = Math.toRadians(entity.getXRot());
				yaw_now = Math.toRadians(entity.getYRot() + 90);
				xPos = x + Math.cos(rad) * (Math.cos(rad_now) + Math.abs(Math.sin(yaw_now) * Math.sin(rad_now))) * dis;
				yPos = y + entity.getBbHeight() / 2 + Math.sin(Math.toRadians(entity.getPersistentData().getDouble("cnt2") * 1.5)) * Math.sin(rad_now) * (-1) * dis;
				zPos = z + Math.sin(rad) * (Math.cos(rad_now) + Math.abs(Math.cos(yaw_now) * Math.sin(rad_now))) * dis;
				if (world.getBlockState(BlockPos.containing(xPos, yPos, zPos)).canOcclude()) {
					for (int index2 = 0; index2 < (int) Math.round(dis); index2++) {
						yPos = yPos + 1;
						if (!world.getBlockState(BlockPos.containing(xPos, yPos, zPos)).canOcclude()) {
							break;
						}
					}
				}
				if (!world.getBlockState(BlockPos.containing(xPos, yPos, zPos)).canOcclude()) {
					if (Math.random() < 0.5) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"particle dust 1.000 0.596 0.071 1 ~ ~ ~ 0.25 0.25 0.25 0.3 5 force");
					} else {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"particle dust 0.631 0.345 0.063 1 ~ ~ ~ 0.25 0.25 0.25 0.3 5 force");
					}
					if (Math.random() < 0.15 * (entity.getPersistentData().getDouble("cnt3") / 4)) {
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.PORTAL, xPos, yPos, zPos, 10, 0, 0, 0, 1);
					}
					if (Math.random() < 0.075 * (entity.getPersistentData().getDouble("cnt3") / 4)) {
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.REVERSE_PORTAL, xPos, yPos, zPos, 10, 0, 0, 0, 1);
					}
				}
				entity.getPersistentData().putDouble("damage", (26 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
				entity.getPersistentData().putDouble("range", 3);
				entity.getPersistentData().putDouble("knockback", 1.5);
				entity.getPersistentData().putDouble("projectile_type", 2);
				DodamageProcedure.execute(world, xPos, yPos, zPos, entity);
				dis = dis + 1;
			}
			entity.getPersistentData().putDouble("cnt2", (entity.getPersistentData().getDouble("cnt2") + 5));
		}
		if (entity.getPersistentData().getDouble("cnt3") > 7) {
			entity.getPersistentData().putDouble("skill2", 0);
		}
	}
}
