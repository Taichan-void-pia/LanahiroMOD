package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;

public class AIFossilaoiProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double rnd = 0;
		ItemStack item_main = ItemStack.EMPTY;
		if (entity.isAlive()) {
			ActiveHashiraProcedure.execute(world, x, y, z, entity);
			SkillFossilaoi4Procedure.execute(entity);
			SkillFossilaoi3Procedure.execute(world, x, y, z, entity);
			SkillFossilaoi5Procedure.execute(entity);
			if (entity.getPersistentData().getDouble("mode") == 1) {
				SkillFossilaoi1Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("mode") == 2) {
				SkillFossilaoi2Procedure.execute(world, x, y, z, entity);
			} else if (!((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity)) {
				entity.getPersistentData().putDouble("cnt_target", 0);
				if (entity.getPersistentData().getDouble("cnt_x") > 30) {
					entity.getPersistentData().putDouble("cnt_x", 30);
				}
			} else {
				entity.getPersistentData().putDouble("cnt_target", (entity.getPersistentData().getDouble("cnt_target") + 1));
				entity.getPersistentData().putDouble("cnt_x", (entity.getPersistentData().getDouble("cnt_x") + 1));
				if (entity.getPersistentData().getDouble("cnt_x") > 40) {
					entity.getPersistentData().putDouble("cnt_x", 0);
					entity.getPersistentData().putDouble("cnt1", 0);
					entity.getPersistentData().putDouble("cnt2", 0);
					entity.getPersistentData().putDouble("cnt3", 0);
					entity.getPersistentData().putDouble("cnt4", 0);
					entity.getPersistentData().putDouble("cnt5", 0);
					entity.getPersistentData().putDouble("cnt6", 0);
					entity.getPersistentData().putDouble("dis", 0);
					entity.getPersistentData().putDouble("NameRanged", 0);
					entity.getPersistentData().putDouble("x_pos", 0);
					entity.getPersistentData().putDouble("y_pos", 0);
					entity.getPersistentData().putDouble("z_pos", 0);
					entity.getPersistentData().putDouble("x_pos2", 0);
					entity.getPersistentData().putDouble("y_pos2", 0);
					entity.getPersistentData().putDouble("z_pos2", 0);
					entity.getPersistentData().putDouble("x_pos3", 0);
					entity.getPersistentData().putDouble("y_pos3", 0);
					entity.getPersistentData().putDouble("z_pos3", 0);
					entity.getPersistentData().putBoolean("loop", false);
					entity.getPersistentData().putBoolean("flag_a", false);
					entity.getPersistentData().putBoolean("flag_b", false);
					entity.getPersistentData().putDouble("skill2", 1);
					for (int index0 = 0; index0 < 50; index0++) {
						item_main = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
						rnd = Math.ceil(Math.random() * 2);
						if (!(entity instanceof LivingEntity _livEnt36 && _livEnt36.hasEffect(MobEffects.ABSORPTION))) {
							if (rnd == 2) {
								break;
							}
						} else if (GetDistanceProcedure.execute(entity) < 6) {
							if (rnd == 1) {
								break;
							}
						} else {
							break;
						}
					}
					entity.getPersistentData().putDouble("mode", rnd);
					DirectionProcedure.execute(entity);
				}
			}
			if (entity.getPersistentData().getDouble("skill2") == 0) {
				entity.getPersistentData().putDouble("mode", 0);
			}
		}
	}
}
