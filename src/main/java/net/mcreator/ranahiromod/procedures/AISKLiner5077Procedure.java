package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class AISKLiner5077Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double rnd = 0;
		double dis = 0;
		if (entity.isAlive()) {
			ActiveHashiraProcedure.execute(world, x, y, z, entity);
			if (entity.getPersistentData().getDouble("mode") == 1) {
				SkillSKLiner1Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("mode") == 2) {
				SkillSKLiner2Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("mode") == 3) {
				SkillSKLiner3Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("mode") == 4) {
				SkillSKLiner4Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("mode") == 5) {
				SkillSKLiner5Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("mode") == 6) {
				SkillSKLiner6Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("mode") == 7) {
				SkillSKLiner7Procedure.execute(world, x, y, z, entity);
			} else if (!((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity)) {
				entity.getPersistentData().putDouble("cnt_target", 0);
				if (entity.getPersistentData().getDouble("cnt_x") > 50) {
					entity.getPersistentData().putDouble("cnt_x", 50);
				}
			} else {
				entity.getPersistentData().putDouble("cnt_target", (entity.getPersistentData().getDouble("cnt_target") + 1));
				entity.getPersistentData().putDouble("cnt_x", (entity.getPersistentData().getDouble("cnt_x") + 1));
				if (entity.getPersistentData().getDouble("cnt_x") > 60) {
					entity.getPersistentData().putDouble("cnt_x", 0);
					entity.getPersistentData().putDouble("cnt1", 0);
					entity.getPersistentData().putDouble("cnt2", 0);
					entity.getPersistentData().putDouble("cnt3", 0);
					entity.getPersistentData().putDouble("cnt4", 0);
					entity.getPersistentData().putDouble("cnt5", 0);
					entity.getPersistentData().putDouble("skill2", 1);
					for (int index0 = 0; index0 < 50; index0++) {
						rnd = Math.ceil(Math.random() * 7);
						dis = GetDistanceProcedure.execute(entity);
						if (dis > 2) {
							if (dis > 4) {
								if (dis > 7) {
									if (rnd == 2) {
										break;
									}
								} else {
									if (rnd == 3) {
										break;
									}
								}
							} else {
								if (rnd == 6) {
									break;
								}
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
