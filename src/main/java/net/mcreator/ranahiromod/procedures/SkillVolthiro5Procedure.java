package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class SkillVolthiro5Procedure {
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
		if (entity.getPersistentData().getDouble("cnt2") == 0) {
			if (entity.getPersistentData().getDouble("cnt1") == 1) {
				if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity) {
					GetPowerProcedure.execute(world, x, y, z, entity);
				} else {
					GetPowerFowardProcedure.execute(world, x, y, z, entity);
				}
				entity.setDeltaMovement(new Vec3((entity.getPersistentData().getDouble("x_power") / 2), (entity.getPersistentData().getDouble("y_power") / 2 + 0.5), (entity.getPersistentData().getDouble("z_power") / 2)));
			} else {
				if (entity.onGround()) {
					entity.getPersistentData().putDouble("cnt2", 1);
					entity.getPersistentData().putDouble("x_pos", x);
					entity.getPersistentData().putDouble("y_pos", (y - 0.2));
					entity.getPersistentData().putDouble("z_pos", z);
				}
			}
		}
		if (entity.getPersistentData().getDouble("cnt2") >= 1) {
			entity.getPersistentData().putDouble("cnt2", (entity.getPersistentData().getDouble("cnt2") + 1));
			entity.setDeltaMovement(new Vec3(0, Math.min(entity.getDeltaMovement().y(), 0), 0));
			xPos = entity.getPersistentData().getDouble("x_pos");
			yPos = entity.getPersistentData().getDouble("y_pos");
			zPos = entity.getPersistentData().getDouble("z_pos");
			if (entity.getPersistentData().getDouble("cnt2") < 6) {
				for (int index0 = 0; index0 < 5; index0++) {
					xPos2 = xPos + (Math.random() - 0.5) * 5;
					yPos2 = yPos;
					zPos2 = zPos + (Math.random() - 0.5) * 5;
					if (Math.random() < 0.5) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3(xPos2, yPos2, zPos2), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"particle dust 0.96 0.94 0.2 1 ~ ~ ~ 0.25 0.25 0.25 0.5 3 force");
					} else {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3(xPos2, yPos2, zPos2), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"particle dust 0.78 0.76 0.22 1 ~ ~ ~ 0.25 0.25 0.25 0.5 3 force");
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(xPos2, yPos2, zPos2), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.lightning_bolt.thunder")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(xPos2, yPos2, zPos2, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.lightning_bolt.thunder")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
				for (int index1 = 0; index1 < 20; index1++) {
					rad = Math.toRadians(tsuki7_mode);
					dis = (entity.getPersistentData().getDouble("cnt2") - 0.5) * 2;
					for (int index2 = 0; index2 < 2; index2++) {
						logic_a = false;
						xPos = entity.getPersistentData().getDouble("x_pos") + Math.cos(rad) * dis;
						yPos = entity.getPersistentData().getDouble("y_pos");
						zPos = entity.getPersistentData().getDouble("z_pos") + Math.sin(rad) * dis;
						if (world.getBlockState(BlockPos.containing(xPos, yPos, zPos)).canOcclude()) {
							yPos = entity.getPersistentData().getDouble("y_pos");
							for (int index3 = 0; index3 < (int) Math.round(dis * 5); index3++) {
								yPos = yPos + 0.5;
								if (!world.getBlockState(BlockPos.containing(xPos, yPos, zPos)).canOcclude()) {
									logic_a = true;
									break;
								}
							}
						} else if (!world.getBlockState(BlockPos.containing(xPos, yPos - 0.6, zPos)).canOcclude()) {
							yPos = entity.getPersistentData().getDouble("y_pos");
							for (int index4 = 0; index4 < (int) Math.round(dis * 5); index4++) {
								yPos = yPos - 0.5;
								if (world.getBlockState(BlockPos.containing(xPos, yPos - 0.6, zPos)).canOcclude()) {
									logic_a = true;
									break;
								}
							}
						} else {
							logic_a = true;
						}
						if (logic_a) {
							for (int index5 = 0; index5 < 5; index5++) {
								xPos2 = xPos + (Math.random() - 0.5) * 5;
								yPos2 = yPos;
								zPos2 = zPos + (Math.random() - 0.5) * 5;
								if (Math.random() < 0.5) {
									if (world instanceof ServerLevel _level)
										_level.getServer().getCommands().performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, new Vec3(xPos2, yPos2, zPos2), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
												"particle dust 0.96 0.94 0.2 1 ~ ~ ~ 0.25 0.25 0.25 0.5 3 force");
								} else {
									if (world instanceof ServerLevel _level)
										_level.getServer().getCommands().performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, new Vec3(xPos2, yPos2, zPos2), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
												"particle dust 0.78 0.76 0.22 1 ~ ~ ~ 0.25 0.25 0.25 0.5 3 force");
								}
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(xPos2, yPos2, zPos2), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.lightning_bolt.thunder")), SoundSource.NEUTRAL, 1, 1);
									} else {
										_level.playLocalSound(xPos2, yPos2, zPos2, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.lightning_bolt.thunder")), SoundSource.NEUTRAL, 1, 1, false);
									}
								}
							}
							entity.getPersistentData().putDouble("damage", (20 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
							entity.getPersistentData().putDouble("knockback", 1);
							entity.getPersistentData().putDouble("range", 2.5);
							DodamageProcedure.execute(world, xPos, yPos, zPos, entity);
							xPos = entity.getPersistentData().getDouble("x_pos") + Math.cos(rad) * dis;
							yPos = yPos2;
							zPos = entity.getPersistentData().getDouble("z_pos") + Math.sin(rad) * dis;
							world.levelEvent(2001, BlockPos.containing(xPos, yPos, zPos), Block.getId(Blocks.GOLD_BLOCK.defaultBlockState()));
						}
						dis = dis + 0.8;
					}
					tsuki7_mode = tsuki7_mode + 18;
				}
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, xPos, yPos, zPos, 0, Level.ExplosionInteraction.NONE);
			}
		}
		if (entity.getPersistentData().getDouble("cnt2") > 10) {
			for (int index6 = 0; index6 < 12; index6++) {
				if (world instanceof ServerLevel _level) {
					LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
					entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(x + (Math.random() - 0.5) * 14, y, z + (Math.random() - 0.5) * 14)));
					entityToSpawn.setVisualOnly(true);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			entity.getPersistentData().putDouble("skill2", 0);
		}
	}
}
