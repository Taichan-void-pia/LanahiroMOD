package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.ranahiromod.init.RanahiromodModParticleTypes;

public class SkillSKLiner5Procedure {
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
		double dis_range = 0;
		entity.getPersistentData().putDouble("cnt1", (entity.getPersistentData().getDouble("cnt1") + 1));
		UseSK = UsePlayerLogicProcedure.execute(entity);
		entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x() / 10), (entity.getDeltaMovement().y()), (entity.getDeltaMovement().z() / 10)));
		if (entity.getPersistentData().getDouble("cnt1") == 1) {
			{
				Entity _ent = entity;
				if (!_ent.level().isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "stopsound @s");
				}
			}
			entity.setDeltaMovement(new Vec3(0, (entity.getDeltaMovement().y()), 0));
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.splash")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.splash")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			entity.getPersistentData().putDouble("x_pos", x);
			entity.getPersistentData().putDouble("y_pos", (y + 0.1));
			entity.getPersistentData().putDouble("z_pos", z);
		}
		if (entity.getPersistentData().getDouble("cnt1") < 9) {
			dis = (entity.getPersistentData().getDouble("cnt1") - 0.5) * 2;
			if (UseSK) {
				dis = dis * 1.5;
			}
			rotate = 0;
			for (int index0 = 0; index0 < 2; index0++) {
				for (int index1 = 0; index1 < 72; index1++) {
					rad = Math.toRadians(entity.getPersistentData().getDouble("start_r") + rotate);
					xPos = entity.getPersistentData().getDouble("x_pos") + Math.cos(rad) * dis;
					yPos = entity.getPersistentData().getDouble("y_pos");
					zPos = entity.getPersistentData().getDouble("z_pos") + Math.sin(rad) * dis;
					if (!world.getBlockState(BlockPos.containing(xPos, yPos, zPos)).canOcclude()) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"particle dust_color_transition 0.500 1.000 1.000 1 0.350 0.250 1.000 ~ ~ ~ 0.5 0 0.5 0 12 force");
						if (UseSK) {
							if (Math.random() < 0.15) {
								if (world instanceof ServerLevel _level)
									_level.sendParticles((SimpleParticleType) (RanahiromodModParticleTypes.SK_LINER_BLADE_PARTICLE.get()), xPos, yPos, zPos, 1, 0.3, 0.3, 0.3, 0.01);
							}
							if (Math.random() < 0.075) {
								if (world instanceof ServerLevel _level)
									_level.sendParticles((SimpleParticleType) (RanahiromodModParticleTypes.SK_LINER_BLADE_PARTICLE_2.get()), xPos, yPos, zPos, 1, 0.1, 0.1, 0.1, 0.01);
							}
						}
					}
					entity.getPersistentData().putDouble("damage", (6 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
					entity.getPersistentData().putDouble("range", 7);
					entity.getPersistentData().putDouble("knockback", 0.7);
					entity.getPersistentData().putDouble("effect", 2);
					entity.getPersistentData().putDouble("projectile_type", 2);
					DodamageProcedure.execute(world, xPos, yPos, zPos, entity);
					entity.getPersistentData().putDouble("damage", (24 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
					rotate = rotate + 5;
				}
				dis = dis + 1;
			}
		}
		if (entity.getPersistentData().getDouble("cnt1") > 45) {
			entity.getPersistentData().putDouble("skill2", 0);
		}
	}
}
