package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class SkillGroundhiro4Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean muki = false;
		double rad = 0;
		double rad_now = 0;
		double yaw_now = 0;
		double x_pos = 0;
		double y_pos = 0;
		double z_pos = 0;
		double dis = 0;
		double zPos = 0;
		double yPos = 0;
		double xPos = 0;
		double count = 0;
		double cnt = 0;
		double speed = 0;
		BlockState rnd_block = Blocks.AIR.defaultBlockState();
		entity.getPersistentData().putDouble("cnt1", (entity.getPersistentData().getDouble("cnt1") + 1));
		if (entity.getPersistentData().getDouble("cnt2") < 12 && entity.getPersistentData().getDouble("cnt1") > 0) {
			entity.getPersistentData().putDouble("cnt2", (entity.getPersistentData().getDouble("cnt2") + 1));
			dis = entity.getPersistentData().getDouble("cnt2") * 1.5;
			entity.getPersistentData().putDouble("cnt1", (-1));
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.end_gateway.spawn")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.end_gateway.spawn")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			for (int index0 = 0; index0 < 2; index0++) {
				entity.getPersistentData().putDouble("start_r", (Math.random() * 360));
				rad_now = Math.toRadians((Math.random() - 0.5) * 180);
				yaw_now = Math.toRadians(Math.random() * 360);
				x_pos = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(dis)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX();
				y_pos = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(dis)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY();
				z_pos = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(dis)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ();
				for (int index1 = 0; index1 < 18; index1++) {
					rad = Math.toRadians(entity.getPersistentData().getDouble("start_r") + entity.getPersistentData().getDouble("cnt3"));
					xPos = x_pos + Math.sin(rad) * (Math.cos(rad_now) + Math.abs(Math.cos(yaw_now) * Math.sin(rad_now))) * 2;
					yPos = y_pos + Math.sin(Math.toRadians(entity.getPersistentData().getDouble("cnt3"))) * Math.sin(rad_now) * (-1) * 2;
					zPos = z_pos + Math.cos(rad) * (Math.cos(rad_now) + Math.abs(Math.sin(yaw_now) * Math.sin(rad_now))) * 2;
					if (Math.random() < 0.5) {
						rnd_block = Blocks.DIRT.defaultBlockState();
					} else {
						rnd_block = Blocks.STONE.defaultBlockState();
					}
					world.levelEvent(2001, BlockPos.containing(xPos, yPos, zPos), Block.getId(rnd_block));
					entity.getPersistentData().putDouble("damage", (23 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
					entity.getPersistentData().putDouble("knockback", 1);
					entity.getPersistentData().putDouble("range", 4);
					DodamageProcedure.execute(world, xPos, yPos, zPos, entity);
					entity.getPersistentData().putDouble("cnt3", (entity.getPersistentData().getDouble("cnt3") + 10));
				}
			}
		} else {
			entity.getPersistentData().putDouble("skill2", 0);
		}
	}
}
