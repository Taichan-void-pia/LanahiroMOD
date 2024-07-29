package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.commands.CommandFunction;

import java.util.Optional;

public class SkillWeaponhiro3Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
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
		double y_power = 0;
		double z_power = 0;
		double x_power = 0;
		double dis2 = 0;
		boolean UseSK = false;
		boolean logic_attack = false;
		boolean UseVazafila = false;
		boolean muki = false;
		boolean type = false;
		entity.getPersistentData().putDouble("cnt1", (entity.getPersistentData().getDouble("cnt1") + 1));
		if (entity.getPersistentData().getDouble("cnt1") < 8) {
			if (entity.getPersistentData().getDouble("cnt1") == 1) {
				entity.getPersistentData().putDouble("x_pos",
						(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(2)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()));
				entity.getPersistentData().putDouble("y_pos", (y + 1.5));
				entity.getPersistentData().putDouble("z_pos",
						(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(2)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()));
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
			}
			xPos = entity.getPersistentData().getDouble("x_pos");
			yPos = entity.getPersistentData().getDouble("y_pos");
			zPos = entity.getPersistentData().getDouble("z_pos");
			if ((entity.getDirection()) == Direction.NORTH || (entity.getDirection()) == Direction.SOUTH) {
				if (world instanceof ServerLevel _level && _level.getServer() != null) {
					Optional<CommandFunction> _fopt = _level.getServer().getFunctions().get(new ResourceLocation("ranahiromod:windsword_1"));
					if (_fopt.isPresent())
						_level.getServer().getFunctions().execute(_fopt.get(), new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null));
				}
			}
			if ((entity.getDirection()) == Direction.EAST || (entity.getDirection()) == Direction.WEST) {
				if (world instanceof ServerLevel _level && _level.getServer() != null) {
					Optional<CommandFunction> _fopt = _level.getServer().getFunctions().get(new ResourceLocation("ranahiromod:windsword_2"));
					if (_fopt.isPresent())
						_level.getServer().getFunctions().execute(_fopt.get(), new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null));
				}
			}
		} else if (entity.getPersistentData().getDouble("cnt1") > 7) {
			for (int index0 = 0; index0 < 2; index0++) {
				entity.getPersistentData().putDouble("cnt2", (entity.getPersistentData().getDouble("cnt2") + 1));
				if (entity.getPersistentData().getDouble("cnt2") == 1) {
					entity.getPersistentData().putDouble("start_r", (entity.getYRot() + 90));
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, 1, (float) 0.8);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, 1, (float) 0.8, false);
						}
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.FLASH, x, y, z, 10, 1, 1, 1, 1);
				}
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
				dis = 2 + entity.getPersistentData().getDouble("cnt2") / 4;
				for (int index1 = 0; index1 < 8; index1++) {
					entity.getPersistentData().putDouble("start_r", (entity.getPersistentData().getDouble("start_r") + 15));
					rad = Math.toRadians(entity.getPersistentData().getDouble("start_r"));
					for (int index2 = 0; index2 < 2; index2++) {
						type = !type;
						for (int index3 = 0; index3 < 2; index3++) {
							if (type) {
								xPos = x + Math.cos(rad) * dis;
								yPos = y + entity.getPersistentData().getDouble("cnt2") / 2.5;
								zPos = z + Math.sin(rad) * dis;
							} else {
								xPos = x - Math.cos(rad) * dis;
								yPos = y - entity.getPersistentData().getDouble("cnt2") / 2.5;
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
								if (entity instanceof Player) {
									for (int index4 = 0; index4 < 8; index4++) {
										world.addParticle(ParticleTypes.CLOUD, (xPos + (Math.random() - 0.5) * 0.2), (yPos + (Math.random() - 0.5) * 0.2), (zPos + (Math.random() - 0.5) * 0.2), 0, 0.5, 0);
									}
								} else {
									if (world instanceof ServerLevel _level)
										_level.sendParticles(ParticleTypes.CLOUD, xPos, yPos, zPos, 8, 0.1, 0.1, 0.1, 0.2);
								}
								entity.getPersistentData().putDouble("damage", (15 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
								entity.getPersistentData().putDouble("knockback", 1);
								entity.getPersistentData().putDouble("range", 4);
								entity.getPersistentData().putDouble("projectile_type", 1);
								DodamageProcedure.execute(world, xPos, yPos, zPos, entity);
							}
							dis = dis + 0.05;
						}
					}
				}
			}
			entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x() / 5), (entity.getDeltaMovement().y()), (entity.getDeltaMovement().z() / 5)));
			if (entity.getPersistentData().getDouble("cnt2") > 6) {
				entity.getPersistentData().putDouble("skill2", 0);
			}
		}
	}
}
