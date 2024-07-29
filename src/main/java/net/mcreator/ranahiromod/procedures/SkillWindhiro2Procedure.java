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
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class SkillWindhiro2Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean type = false;
		double xPos = 0;
		double yPos = 0;
		double zPos = 0;
		double range = 0;
		double rad = 0;
		double rad_now = 0;
		double dis = 0;
		double x_power = 0;
		double y_power = 0;
		double z_power = 0;
		double dis2 = 0;
		entity.getPersistentData().putDouble("cnt1", (entity.getPersistentData().getDouble("cnt1") + 1));
		if (entity.getPersistentData().getDouble("cnt1") == 1) {
			entity.getPersistentData().putDouble("start_r", (entity.getYRot() + 90));
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.cave")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.cave")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		}
		if (entity instanceof LivingEntity _entity)
			_entity.swing(InteractionHand.MAIN_HAND, true);
		dis = 2 + entity.getPersistentData().getDouble("cnt1") / 4;
		for (int index0 = 0; index0 < 8; index0++) {
			entity.getPersistentData().putDouble("start_r", (entity.getPersistentData().getDouble("start_r") + 15));
			rad = Math.toRadians(entity.getPersistentData().getDouble("start_r"));
			for (int index1 = 0; index1 < 2; index1++) {
				type = !type;
				for (int index2 = 0; index2 < 2; index2++) {
					if (type) {
						xPos = x + Math.cos(rad) * dis;
						yPos = y + entity.getPersistentData().getDouble("cnt1") / 2.5;
						zPos = z + Math.sin(rad) * dis;
					} else {
						xPos = x - Math.cos(rad) * dis;
						yPos = y - entity.getPersistentData().getDouble("cnt1") / 2.5;
						zPos = z - Math.sin(rad) * dis;
					}
					if (!world.getBlockState(BlockPos.containing(xPos, yPos, zPos)).canOcclude()) {
						x_power = xPos - entity.getX();
						y_power = yPos - entity.getY();
						z_power = zPos - entity.getZ();
						dis2 = Math.abs(x_power) + Math.abs(y_power) + Math.abs(z_power);
						x_power = (x_power / dis) * 1.5;
						y_power = (y_power / dis) * 1.5;
						z_power = (z_power / dis) * 1.5;
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"particle dust 0.000 1.000 0.533 2 ~ ~ ~ 0.1 0.1 0.1 0.2 8 force");
						if (entity.getPersistentData().getDouble("start_r") % 80 < 20) {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"particle dust 0.722 1.000 0.831 2 ~ ~ ~ 0.1 0.1 0.1 0.2 8 force");
						}
						entity.getPersistentData().putDouble("damage", (14 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
						entity.getPersistentData().putDouble("knockback", 1);
						entity.getPersistentData().putDouble("range", 4);
						entity.getPersistentData().putDouble("projectile_type", 1);
						DodamageProcedure.execute(world, xPos, yPos, zPos, entity);
					}
					dis = dis + 0.05;
				}
			}
		}
		entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x() / 5), (entity.getDeltaMovement().y()), (entity.getDeltaMovement().z() / 5)));
		if (entity.getPersistentData().getDouble("cnt1") > 12) {
			entity.getPersistentData().putDouble("skill2", 0);
		}
	}
}
