package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class NyaguuSkill3Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
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
		double tsuki7_mode = 0;
		double HP = 0;
		entity.getPersistentData().putDouble("cnt1", (entity.getPersistentData().getDouble("cnt1") + 1));
		if (entity.getPersistentData().getDouble("cnt2") == 0) {
			if (entity.getPersistentData().getDouble("cnt3") == 0) {
				entity.getPersistentData().putDouble("cnt3", 1);
			} else {
				entity.getPersistentData().putDouble("cnt3", (entity.getPersistentData().getDouble("cnt3") + 1));
				if (entity.getPersistentData().getDouble("cnt3") > 15) {
					entity.getPersistentData().putDouble("cnt2", 1);
					entity.getPersistentData().putDouble("x_pos", x);
					entity.getPersistentData().putDouble("y_pos", y);
					entity.getPersistentData().putDouble("z_pos", z);
					entity.getPersistentData().putDouble("old_x", (entity.getPersistentData().getDouble("x_pos")));
					entity.getPersistentData().putDouble("old_y", (entity.getPersistentData().getDouble("y_pos") + entity.getBbHeight() / 2));
					entity.getPersistentData().putDouble("old_z", (entity.getPersistentData().getDouble("z_pos")));
				}
			}
		} else {
			entity.getPersistentData().putDouble("cnt2", (entity.getPersistentData().getDouble("cnt2") + 1));
			entity.getPersistentData().putDouble("x_pos",
					(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(0)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()));
			entity.getPersistentData().putDouble("z_pos",
					(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(0)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()));
			{
				Entity _ent = entity;
				_ent.setYRot((float) (Math.random() * 360));
				_ent.setXRot((float) (-45 + Math.random() * 90));
				_ent.setYBodyRot(_ent.getYRot());
				_ent.setYHeadRot(_ent.getYRot());
				_ent.yRotO = _ent.getYRot();
				_ent.xRotO = _ent.getXRot();
				if (_ent instanceof LivingEntity _entity) {
					_entity.yBodyRotO = _entity.getYRot();
					_entity.yHeadRotO = _entity.getYRot();
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level().isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
							("spreadplayers " + entity.getPersistentData().getDouble("x_pos") + " " + entity.getPersistentData().getDouble("z_pos") + " 1 12 false @s"));
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			xPos = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(3)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX();
			yPos = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(3)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY();
			zPos = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(3)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ();
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
			entity.getPersistentData().putDouble("damage", (24 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
			entity.getPersistentData().putDouble("range", 5);
			entity.getPersistentData().putDouble("knockback", 1);
			DodamageProcedure.execute(world, xPos, yPos, zPos, entity);
			for (int index0 = 0; index0 < 4; index0++) {
				y_power = y_power - 0.3;
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.SWEEP_ATTACK, xPos, (yPos + y_power), zPos, 1, 0, 0, 0, 0);
			}
			xPos = entity.getPersistentData().getDouble("old_x") - x;
			yPos = entity.getPersistentData().getDouble("old_y") - (y + entity.getBbHeight() / 2);
			zPos = entity.getPersistentData().getDouble("old_z") - z;
			dis = Math.sqrt(Math.pow(xPos, 2) + Math.pow(yPos, 2) + Math.pow(zPos, 2));
			if (dis != 0) {
				entity.getPersistentData().putDouble("x_power", (xPos / (dis * 5)));
				entity.getPersistentData().putDouble("y_power", (yPos / (dis * 5)));
				entity.getPersistentData().putDouble("z_power", (zPos / (dis * 5)));
				xPos = x;
				yPos = y + entity.getBbHeight() / 2;
				zPos = z;
				for (int index1 = 0; index1 < (int) Math.max(Math.round(dis * 5), 1); index1++) {
					entity.getPersistentData().putDouble("damage", (24 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
					entity.getPersistentData().putDouble("range", 5);
					entity.getPersistentData().putDouble("knockback", 1);
					entity.getPersistentData().putBoolean("swing", true);
					DodamageProcedure.execute(world, xPos, yPos, zPos, entity);
					xPos = xPos + entity.getPersistentData().getDouble("x_power");
					yPos = yPos + entity.getPersistentData().getDouble("y_power");
					zPos = zPos + entity.getPersistentData().getDouble("z_power");
				}
			}
			entity.getPersistentData().putDouble("old_x", x);
			entity.getPersistentData().putDouble("old_y", (y + entity.getBbHeight() / 2));
			entity.getPersistentData().putDouble("old_z", z);
			if (entity.getPersistentData().getDouble("cnt2") > 120) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 80, 3, false, false));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 80, 10, false, false));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 80, 99, false, false));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 80, 0, false, false));
				entity.getPersistentData().putDouble("skill2", 0);
			}
		}
	}
}
