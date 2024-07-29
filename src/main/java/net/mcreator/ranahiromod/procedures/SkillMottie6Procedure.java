package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
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
import net.mcreator.ranahiromod.init.RanahiromodModItems;

public class SkillMottie6Procedure {
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
		boolean UseSK = false;
		boolean logic_attack = false;
		if (entity.getPersistentData().getDouble("cnt1") > 0) {
			entity.getPersistentData().putDouble("cnt1", (entity.getPersistentData().getDouble("cnt1") + 1));
			UseSK = UsePlayerLogicMochiProcedure.execute(entity);
			if (entity.getPersistentData().getDouble("cnt1") == 2) {
				if (!(entity instanceof Player)) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(Items.WOODEN_SWORD).copy();
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				}
				entity.getPersistentData().putDouble("start_r", (entity.getYRot()));
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.extinguish_fire")), SoundSource.NEUTRAL, 2, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.extinguish_fire")), SoundSource.NEUTRAL, 2, 1, false);
					}
				}
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
			}
			if (entity.getPersistentData().getDouble("cnt1") % 7 == 2) {
				if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity) {
					GetPowerProcedure.execute(world, x, y, z, entity);
				} else {
					GetPowerFowardProcedure.execute(world, x, y, z, entity);
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.blaze.shoot")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.blaze.shoot")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.jump")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.jump")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.fire.ambient")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.fire.ambient")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
			entity.setDeltaMovement(new Vec3((entity.getPersistentData().getDouble("x_power") * 0.8), (entity.getDeltaMovement().y()), (entity.getPersistentData().getDouble("z_power") * 0.8)));
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
			for (int index0 = 0; index0 < 10; index0++) {
				rad = Math.toRadians(entity.getPersistentData().getDouble("start_r") + entity.getPersistentData().getDouble("cnt2"));
				rad_now = Math.toRadians(entity.getYRot() + 90);
				xPos = x + (Math.cos(rad_now) - Math.sin(rad)) * Math.sin(rad_now) * 3.5;
				yPos = y + 1;
				zPos = z + (Math.sin(rad_now) + Math.sin(rad)) * Math.cos(rad_now) * 3.5;
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(xPos, yPos, zPos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"particle dust 1.0 0.5 0 1 ~ ~ ~ 0.25 0.25 0.25 0 15 force");
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.LAVA, xPos, yPos, zPos, 3, 0.5, 0.5, 0.5, 1);
				if (UseSK) {
					if (Math.random() < 0.15) {
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.SMALL_FLAME, xPos, yPos, zPos, 25, 0.5, 0.5, 0.5, 1);
					}
				}
				entity.getPersistentData().putDouble("damage", (20 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
				entity.getPersistentData().putDouble("range", 4);
				entity.getPersistentData().putDouble("knockback", 1);
				entity.getPersistentData().putDouble("projectile_type", 2);
				DodamageProcedure.execute(world, xPos, yPos, zPos, entity);
				entity.getPersistentData().putDouble("cnt2", (entity.getPersistentData().getDouble("cnt2") + 3));
				data = data + 1;
			}
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (RanahiromodModParticleTypes.MOCHI_PARTICLE.get()), xPos, yPos, zPos, 5, 0, 0, 0, 0);
			if (entity.getPersistentData().getDouble("cnt1") > 20) {
				if (!(entity instanceof Player)) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(RanahiromodModItems.MOTTIE_HAMMER.get()).copy();
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				}
				entity.getPersistentData().putDouble("skill2", 0);
			}
		} else {
			entity.getPersistentData().putDouble("cnt3", (entity.getPersistentData().getDouble("cnt3") + 1));
			if (entity.onGround()) {
				entity.getPersistentData().putDouble("cnt1", 1);
				entity.getPersistentData().putDouble("cnt3", 0);
			} else if (entity.getPersistentData().getDouble("cnt3") > 100) {
				entity.getPersistentData().putDouble("skill2", 0);
			}
		}
	}
}
