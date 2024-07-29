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
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class SkillVolthiro6Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
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
		double tsuki7_mode = 0;
		double HP = 0;
		double xPos2 = 0;
		double yPos2 = 0;
		double zPos2 = 0;
		boolean type = false;
		boolean logic_a = false;
		entity.getPersistentData().putDouble("cnt1", (entity.getPersistentData().getDouble("cnt1") + 1));
		if (entity.getPersistentData().getDouble("cnt1") == 1) {
			entity.getPersistentData().putDouble("start_r", (entity.getYRot() - 30));
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
			for (int index0 = 0; index0 < 48; index0++) {
				rad = Math.toRadians(entity.getPersistentData().getDouble("start_r") + entity.getPersistentData().getDouble("cnt2"));
				dis = 2.5;
				for (int index1 = 0; index1 < 5; index1++) {
					xPos = x + Math.cos(rad) * dis;
					yPos = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((Math.cos(rad - Math.toRadians(entity.getYRot() + 90)) * dis))), ClipContext.Block.OUTLINE,
							ClipContext.Fluid.NONE, entity)).getBlockPos().getY();
					zPos = z + Math.sin(rad) * dis;
					if (Math.random() < 0.5) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"particle dust 0.96 0.94 0.2 1 ~ ~ ~ 0.1 0.1 0.1 0.5 1 force");
					} else {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"particle dust 0.78 0.76 0.22 1 ~ ~ ~ 0.1 0.1 0.1 0.5 1 force");
					}
					dis = dis + 0.2;
				}
				entity.getPersistentData().putDouble("damage", (20 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
				entity.getPersistentData().putDouble("knockback", 1);
				entity.getPersistentData().putDouble("range", 3);
				entity.getPersistentData().putDouble("projectile_type", 2);
				DodamageProcedure.execute(world, xPos, yPos, zPos, entity);
				entity.getPersistentData().putDouble("cnt2", (entity.getPersistentData().getDouble("cnt2") + 5));
			}
			entity.getPersistentData().putDouble("start_r", ((entity.getYRot() + 90) - 45));
			entity.getPersistentData().putDouble("x_pos", x);
			entity.getPersistentData().putDouble("y_pos", y);
			entity.getPersistentData().putDouble("z_pos", z);
		}
		tsuki7_mode = 0;
		for (int index2 = 0; index2 < 5; index2++) {
			dis = (entity.getPersistentData().getDouble("cnt1") + 1) * 2;
			for (int index3 = 0; index3 < 7; index3++) {
				rad = Math.toRadians(entity.getPersistentData().getDouble("start_r") + tsuki7_mode);
				xPos = entity.getPersistentData().getDouble("x_pos") + Math.cos(rad) * dis;
				yPos = entity.getPersistentData().getDouble("y_pos");
				zPos = entity.getPersistentData().getDouble("z_pos") + Math.sin(rad) * dis;
				logic_a = true;
				if (world.getBlockState(BlockPos.containing(xPos, yPos, zPos)).canOcclude()) {
					yPos = entity.getPersistentData().getDouble("y_pos");
					for (int index4 = 0; index4 < (int) Math.round(dis * 5); index4++) {
						logic_a = true;
						yPos = yPos + 0.5;
						if (!world.getBlockState(BlockPos.containing(xPos, yPos, zPos)).canOcclude()) {
							break;
						}
						logic_a = false;
					}
				} else if (!world.getBlockState(BlockPos.containing(xPos, yPos - 0.3, zPos)).canOcclude()) {
					yPos = entity.getPersistentData().getDouble("y_pos");
					for (int index5 = 0; index5 < (int) Math.round(dis); index5++) {
						yPos = yPos - 1;
						if (world.getBlockState(BlockPos.containing(xPos, yPos - 0.3, zPos)).canOcclude()) {
							break;
						}
					}
				}
				if (logic_a) {
					if (Math.random() < 0.5) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"particle dust 0.96 0.94 0.2 2 ~ ~ ~ 0 2 0 0.75 2 force");
					} else {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"particle dust 0.78 0.76 0.22 2 ~ ~ ~ 0 2 0 0.75 2 force");
					}
					entity.getPersistentData().putDouble("damage", (20 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
					entity.getPersistentData().putDouble("knockback", 0.5);
					entity.getPersistentData().putDouble("range", 2);
					entity.getPersistentData().putDouble("projectile_type", 2);
					DodamageProcedure.execute(world, xPos, yPos, zPos, entity);
					if (Math.random() < 0.0075) {
						if (world instanceof ServerLevel _level) {
							LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
							entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(xPos, yPos, zPos)));
							entityToSpawn.setVisualOnly(true);
							_level.addFreshEntity(entityToSpawn);
						}
						if (Math.random() < 0.5) {
							rad = rad + Math.toRadians(180);
						}
						dis = Math.random() * 4 + 4;
						for (int index6 = 0; index6 < 36; index6++) {
							xPos2 = xPos + Math.cos(rad) * dis;
							zPos2 = zPos + Math.sin(rad) * dis;
							if (Math.random() < 0.5) {
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3(xPos2, yPos, zPos2), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
											"particle dust 0.96 0.94 0.2 2 ~ ~ ~ 0 2 0 0.75 2 force");
							} else {
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3(xPos2, yPos, zPos2), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
											"particle dust 0.78 0.76 0.22 2 ~ ~ ~ 0 2 0 0.75 2 force");
							}
							entity.getPersistentData().putDouble("damage", (20 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
							entity.getPersistentData().putDouble("knockback", 0.5);
							entity.getPersistentData().putDouble("range", 2);
							entity.getPersistentData().putDouble("projectile_type", 2);
							DodamageProcedure.execute(world, xPos2, yPos, zPos2, entity);
							rad = rad + Math.toRadians(5);
						}
					}
				}
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, xPos, (yPos - 1), zPos, 0, Level.ExplosionInteraction.NONE);
				dis = dis + 0.25;
			}
			tsuki7_mode = tsuki7_mode + 22.5;
		}
		if (entity.getPersistentData().getDouble("cnt1") > 20) {
			entity.getPersistentData().putDouble("skill2", 0);
		}
	}
}
