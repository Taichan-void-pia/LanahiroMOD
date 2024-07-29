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
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class WizardSkill8Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double zPos = 0;
		double yPos = 0;
		double xPos = 0;
		double distance = 0;
		double rad = 0;
		double rad_now = 0;
		entity.getPersistentData().putDouble("cnt1", (entity.getPersistentData().getDouble("cnt1") + 1));
		if (entity.getPersistentData().getDouble("cnt1") >= 1) {
			if (entity.getPersistentData().getDouble("cnt1") == 1) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wither.hurt")), SoundSource.NEUTRAL, 1, 0);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wither.hurt")), SoundSource.NEUTRAL, 1, 0, false);
					}
				}
			}
			if (entity.getPersistentData().getDouble("cnt1") == 1) {
				rad = Math.toRadians(entity.getYRot());
				for (int index0 = 0; index0 < 5; index0++) {
					for (int index1 = 0; index1 < 72; index1++) {
						xPos = x + Math.cos(rad) * distance;
						yPos = y + 0.05;
						zPos = z + Math.sin(rad) * distance;
						rad = rad + Math.toRadians(5);
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"particle block dirt ~ ~ ~ 0.1 0.1 0.1 1 2 normal");
					}
					distance = distance + 1;
				}
			} else {
				if (entity.getPersistentData().getDouble("cnt1") >= 1) {
					entity.getPersistentData().putDouble("damage", (18 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
					entity.getPersistentData().putDouble("knockback", 0);
					entity.getPersistentData().putDouble("range", 7);
					AllTargetDamage3Procedure.execute(world, x, y, z, entity);
					if (entity.getPersistentData().getDouble("cnt1") > 6) {
						entity.getPersistentData().putDouble("skill2", 0);
					}
				}
			}
		}
	}
}
