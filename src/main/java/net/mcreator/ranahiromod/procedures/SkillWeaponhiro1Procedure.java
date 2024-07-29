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
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.commands.CommandFunction;

import java.util.Optional;

public class SkillWeaponhiro1Procedure {
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
		boolean UseSK = false;
		boolean logic_attack = false;
		boolean UseVazafila = false;
		boolean muki = false;
		if (entity.getPersistentData().getDouble("cnt1") > 0 && entity.getPersistentData().getDouble("skill2") == 1001 || entity.getPersistentData().getDouble("cnt1") >= 0 && entity.getPersistentData().getDouble("skill2") != 1001) {
			entity.getPersistentData().putDouble("cnt1", (entity.getPersistentData().getDouble("cnt1") + 1));
			if (entity.getPersistentData().getDouble("cnt1") < 9) {
				if (entity.getPersistentData().getDouble("cnt1") == 2) {
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
						Optional<CommandFunction> _fopt = _level.getServer().getFunctions().get(new ResourceLocation("ranahiromod:fireswordparticle"));
						if (_fopt.isPresent())
							_level.getServer().getFunctions().execute(_fopt.get(), new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null));
					}
				}
				if ((entity.getDirection()) == Direction.EAST || (entity.getDirection()) == Direction.WEST) {
					if (world instanceof ServerLevel _level && _level.getServer() != null) {
						Optional<CommandFunction> _fopt = _level.getServer().getFunctions().get(new ResourceLocation("ranahiromod:fireswordparticle_2"));
						if (_fopt.isPresent())
							_level.getServer().getFunctions().execute(_fopt.get(), new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null));
					}
				}
				if ((entity.getDirection()) == Direction.UP || (entity.getDirection()) == Direction.DOWN) {
					if (world instanceof ServerLevel _level && _level.getServer() != null) {
						Optional<CommandFunction> _fopt = _level.getServer().getFunctions().get(new ResourceLocation("ranahiromod:fireswordparticle_3"));
						if (_fopt.isPresent())
							_level.getServer().getFunctions().execute(_fopt.get(), new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null));
					}
				}
			} else if (entity.getPersistentData().getDouble("cnt1") > 8) {
				for (int index0 = 0; index0 < 25; index0++) {
					xPos = x + (Math.random() - 0.5) * 8;
					yPos = y + (Math.random() - 0.5) * 8;
					zPos = z + (Math.random() - 0.5) * 8;
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.SWEEP_ATTACK, xPos, yPos, zPos, 1, 0, 0, 0, 0);
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.FLAME, xPos, yPos, zPos, 3, 0, 0, 0, 0.2);
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ranahiromod:sword_sweep")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ranahiromod:sword_sweep")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				entity.getPersistentData().putDouble("damage", (10 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
				entity.getPersistentData().putDouble("range", 8);
				entity.getPersistentData().putDouble("effect", 4);
				DodamageProcedure.execute(world, x, y + 1, z, entity);
				if (entity.getPersistentData().getDouble("skill2") == 1001) {
					entity.getPersistentData().putDouble("cnt1", 0);
					WeaponhiroItemEntityUseEndProcedure.execute(entity);
				} else {
					entity.getPersistentData().putDouble("skill2", 0);
				}
			}
		}
	}
}
