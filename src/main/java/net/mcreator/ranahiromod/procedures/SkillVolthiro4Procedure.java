package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.InteractionHand;
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

public class SkillVolthiro4Procedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		boolean type = false;
		double zPos = 0;
		double yPos = 0;
		double xPos = 0;
		double dis2 = 0;
		double dis = 0;
		double y_power = 0;
		double z_power = 0;
		double rad = 0;
		double rad_now = 0;
		double x_power = 0;
		double num1 = 0;
		double pitch = 0;
		double num3 = 0;
		double num2 = 0;
		double dis_range = 0;
		if (!entity.getPersistentData().getBoolean("flag_skill")) {
			entity.getPersistentData().putDouble("cnt1", (entity.getPersistentData().getDouble("cnt1") + 1));
		}
		if (entity.getPersistentData().getDouble("cnt1") == 1) {
			entity.getPersistentData().putDouble("start_r", (entity.getYRot() + 90));
			entity.getPersistentData().putDouble("x_pos",
					(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(15)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()));
			entity.getPersistentData().putDouble("y_pos",
					(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(15)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY()));
			entity.getPersistentData().putDouble("z_pos",
					(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(15)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()));
			for (int index0 = 0; index0 < 12; index0++) {
				if (world instanceof ServerLevel _level) {
					LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
					entityToSpawn.moveTo(Vec3.atBottomCenterOf(
							BlockPos.containing(entity.getPersistentData().getDouble("x_pos") + (Math.random() - 0.5) * 6, entity.getPersistentData().getDouble("y_pos"), entity.getPersistentData().getDouble("z_pos") + (Math.random() - 0.5) * 6)));
					entityToSpawn.setVisualOnly(true);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(entity.getPersistentData().getDouble("x_pos"), entity.getPersistentData().getDouble("y_pos"), entity.getPersistentData().getDouble("z_pos")),
							ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound((entity.getPersistentData().getDouble("x_pos")), (entity.getPersistentData().getDouble("y_pos")), (entity.getPersistentData().getDouble("z_pos")),
							ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			entity.getPersistentData().putDouble("cnt3", 1);
		}
		for (int index1 = 0; index1 < 8; index1++) {
			entity.getPersistentData().putDouble("start_r", (entity.getPersistentData().getDouble("start_r") + 3));
			rad = Math.toRadians(entity.getPersistentData().getDouble("start_r"));
			for (int index2 = 0; index2 < 2; index2++) {
				type = !type;
				dis = 2.2;
				for (int index3 = 0; index3 < 2; index3++) {
					if (type) {
						xPos = entity.getPersistentData().getDouble("x_pos") + Math.cos(rad) * dis;
						yPos = entity.getPersistentData().getDouble("y_pos") + entity.getPersistentData().getDouble("cnt1") / 2.5;
						zPos = entity.getPersistentData().getDouble("z_pos") + Math.sin(rad) * dis;
					} else {
						xPos = entity.getPersistentData().getDouble("x_pos") - Math.sin(rad) * dis;
						yPos = entity.getPersistentData().getDouble("y_pos") - entity.getPersistentData().getDouble("cnt1") / 2.5;
						zPos = entity.getPersistentData().getDouble("z_pos") - Math.cos(rad) * dis;
					}
					if (!world.getBlockState(BlockPos.containing(xPos, yPos, zPos)).canOcclude()) {
						x_power = xPos - entity.getX();
						y_power = yPos - entity.getY();
						z_power = zPos - entity.getZ();
						dis2 = Math.abs(x_power) + Math.abs(y_power) + Math.abs(z_power);
						x_power = x_power / (dis2 * 1.5);
						y_power = y_power / (dis2 * 1.5);
						z_power = z_power / (dis2 * 1.5);
					}
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"particle dust 0.96 0.94 0.2 1 ~ ~ ~ 0.2 0.2 0.2 0.1 15 force");
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (RanahiromodModParticleTypes.LIGHT_SCATTER.get()), xPos, yPos, zPos, 1, 0.2, 0.2, 0.2, 0.1);
					if (entity.getPersistentData().getDouble("start_r") % 80 < 20) {
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.FIREWORK, xPos, yPos, zPos, 1, 0.2, 0.2, 0.2, 0.1);
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.SWEEP_ATTACK, xPos, yPos, zPos, 1, 0.2, 0.2, 0.2, 0.1);
					}
					entity.getPersistentData().putDouble("damage", (17 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
					entity.getPersistentData().putDouble("knockback", 1);
					entity.getPersistentData().putDouble("range", 4);
					entity.getPersistentData().putDouble("projectile_type", 1);
					DodamageProcedure.execute(world, xPos, yPos, zPos, entity);
					dis = dis + 0.3;
				}
			}
		}
		if (entity.getPersistentData().getDouble("cnt1") > 12) {
			entity.getPersistentData().putDouble("cnt1", 0);
			entity.getPersistentData().putDouble("cnt2", 0);
			entity.getPersistentData().putBoolean("flag_skill", true);
		}
		if (entity.getPersistentData().getDouble("cnt3") > 0) {
			entity.getPersistentData().putDouble("cnt3", (entity.getPersistentData().getDouble("cnt3") + 1));
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(entity.getPersistentData().getDouble("x_pos"), entity.getPersistentData().getDouble("y_pos"), entity.getPersistentData().getDouble("z_pos")),
							ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound((entity.getPersistentData().getDouble("x_pos")), (entity.getPersistentData().getDouble("y_pos")), (entity.getPersistentData().getDouble("z_pos")),
							ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			rad_now = Math.toRadians((entity.getXRot() + 90 + Math.random() - 0.5) * entity.getPersistentData().getDouble("cnt3") * 120);
			pitch = Math.toRadians(0);
			num1 = (Math.random() - 0.5) * 1.6;
			num2 = (Math.random() - 0.5) * 1.6;
			num3 = (Math.random() - 0.5) * 1.6;
			entity.getPersistentData().putDouble("cnt4", 0);
			entity.getPersistentData().putDouble("xPosition", (entity.getPersistentData().getDouble("x_pos")));
			entity.getPersistentData().putDouble("yPosition", (entity.getPersistentData().getDouble("y_pos") + 1));
			entity.getPersistentData().putDouble("zPosition", (entity.getPersistentData().getDouble("z_pos")));
			dis_range = entity.getPersistentData().getDouble("cnt3") * 2;
			for (int index4 = 0; index4 < (int) dis_range; index4++) {
				xPos = entity.getPersistentData().getDouble("xPosition") + (Math.cos(rad_now) * Math.cos(pitch) + Math.abs(Math.sin(rad_now) * Math.sin(pitch))) * (entity.getPersistentData().getDouble("cnt4") + 1);
				yPos = entity.getPersistentData().getDouble("yPosition") + Math.sin(pitch) * (entity.getPersistentData().getDouble("cnt4") + 1) * (-1);
				zPos = entity.getPersistentData().getDouble("zPosition") + (Math.sin(rad_now) * Math.cos(pitch) + Math.abs(Math.cos(rad_now) * Math.sin(pitch))) * (entity.getPersistentData().getDouble("cnt4") + 1);
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"particle dust 0.96 0.94 0.2 1 ~ ~ ~ 0.2 0.2 0.2 0.1 15 force");
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (RanahiromodModParticleTypes.LIGHT_SCATTER.get()), xPos, yPos, zPos, 4, 0.1, 0.1, 0.1, 0.4);
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.FIREWORK, xPos, yPos, zPos, 1, 0.1, 0.1, 0.1, 0.2);
				if (Math.random() < 0.1) {
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.SWEEP_ATTACK, xPos, yPos, zPos, 1, 0.1, 0.1, 0.1, 0.2);
				}
				entity.getPersistentData().putDouble("damage", (18 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
				entity.getPersistentData().putDouble("knockback", 1);
				entity.getPersistentData().putDouble("range", 4);
				entity.getPersistentData().putDouble("projectile_type", 1);
				DodamageProcedure.execute(world, xPos, yPos, zPos, entity);
				entity.getPersistentData().putDouble("cnt4", (entity.getPersistentData().getDouble("cnt4") + 0.25));
				if (entity.getPersistentData().getDouble("cnt4") % 4 < 2) {
					entity.getPersistentData().putDouble("xPosition", (entity.getPersistentData().getDouble("xPosition") + num1));
					entity.getPersistentData().putDouble("yPosition", (entity.getPersistentData().getDouble("yPosition") + num2));
					entity.getPersistentData().putDouble("zPosition", (entity.getPersistentData().getDouble("zPosition") + num3));
				} else {
					entity.getPersistentData().putDouble("xPosition", (entity.getPersistentData().getDouble("xPosition") - num1));
					entity.getPersistentData().putDouble("yPosition", (entity.getPersistentData().getDouble("yPosition") - num2));
					entity.getPersistentData().putDouble("zPosition", (entity.getPersistentData().getDouble("zPosition") - num3));
				}
			}
			if (entity.getPersistentData().getDouble("cnt3") > 25) {
				entity.getPersistentData().putDouble("skill2", 0);
				entity.getPersistentData().putBoolean("flag_skill", false);
			}
		}
	}
}
