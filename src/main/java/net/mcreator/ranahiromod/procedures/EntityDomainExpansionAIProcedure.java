package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.ranahiromod.init.RanahiromodModMobEffects;

public class EntityDomainExpansionAIProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double range = 0;
		double loop_num = 0;
		double cnt1 = 0;
		double cnt2 = 0;
		double y_floor = 0;
		double x_pos = 0;
		double y_pos = 0;
		double z_pos = 0;
		double x_dis = 0;
		double y_dis = 0;
		double z_dis = 0;
		double x_dis_p = 0;
		double y_dis_p = 0;
		double z_dis_p = 0;
		double dis_p = 0;
		double dis = 0;
		BlockState blockstate1 = Blocks.AIR.defaultBlockState();
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 60, 0, false, false));
		entity.getPersistentData().putDouble("cnt_life", (entity.getPersistentData().getDouble("cnt_life") + 1));
		if (entity.getPersistentData().getDouble("cnt_life") > 55) {
			if (!(entity instanceof LivingEntity _livEnt4 && _livEnt4.hasEffect(RanahiromodModMobEffects.NEUTRALIZATION.get()))) {
				entity.getPersistentData().putDouble("cnt_life2", (entity.getPersistentData().getDouble("cnt_life2") + 1));
				if (entity.getPersistentData().getDouble("cnt_life2") > 55) {
					entity.getPersistentData().putBoolean("Break", true);
				}
			} else {
				entity.getPersistentData().putDouble("cnt_life2", 0);
			}
		}
		if (entity instanceof LivingEntity _livEnt10 && _livEnt10.hasEffect(RanahiromodModMobEffects.NEUTRALIZATION.get())) {
			entity.getPersistentData().putBoolean("Break", false);
		}
		if (entity.getPersistentData().getBoolean("Break")) {
			entity.getPersistentData().putDouble("cnt_break", (entity.getPersistentData().getDouble("cnt_break") + 1));
			range = Math.round(25);
			loop_num = Math.round(range * 2 + 1);
			cnt1 = 99;
			cnt2 = entity.getPersistentData().getDouble("cnt_break");
			y_floor = Math.round(y) - 1;
			x_pos = Math.round(x) - range;
			for (int index0 = 0; index0 < (int) loop_num; index0++) {
				x_dis = Math.pow(x_pos - Math.round(x), 2);
				x_dis_p = Math.pow(x_pos - Math.round(x), 2);
				if (Math.sqrt(x_dis_p) <= cnt2) {
					y_pos = Math.round(y) - range;
					for (int index1 = 0; index1 < (int) loop_num; index1++) {
						y_dis = Math.pow(y_pos - Math.round(y), 2);
						y_dis_p = Math.pow(y_pos - Math.round(y), 2);
						if (Math.sqrt(y_dis_p) <= cnt2 && y_pos >= -64 && y_pos <= 320) {
							z_pos = Math.round(z) - range;
							for (int index2 = 0; index2 < (int) loop_num; index2++) {
								z_dis = Math.pow(z_pos - Math.round(z), 2);
								z_dis_p = Math.pow(z_pos - Math.round(z), 2);
								if (Math.sqrt(z_dis_p) <= cnt2) {
									dis_p = Math.sqrt(x_dis_p + y_dis_p + z_dis_p);
									if (dis_p <= cnt2 + 0 && dis_p >= cnt2 - 1) {
										dis = Math.sqrt(x_dis + y_dis + z_dis);
										if (dis < range + 1) {
											blockstate1 = (world.getBlockState(BlockPos.containing(x_pos, y_pos, z_pos)));
											if (blockstate1.is(BlockTags.create(new ResourceLocation("ranahiromod:barrier")))) {
												DomainBarrierUpdateTickProcedure.execute(world, x_pos, y_pos, z_pos);
											}
										}
									}
								}
								z_pos = z_pos + 1;
							}
						}
						y_pos = y_pos + 1;
					}
				}
				x_pos = x_pos + 1;
			}
			if (entity.getPersistentData().getDouble("cnt_break") > 51) {
				if (!entity.level().isClientSide())
					entity.discard();
			}
		}
	}
}
