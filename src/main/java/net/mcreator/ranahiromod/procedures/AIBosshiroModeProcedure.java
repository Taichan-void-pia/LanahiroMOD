package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class AIBosshiroModeProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double rnd = 0;
		double dis = 0;
		if (entity.getPersistentData().getDouble("mode") >= 1) {
			if (entity.getPersistentData().getDouble("mode") == 1) {
				SkillBosshiro1Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("mode") == 2) {
				SkillBosshiro2Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("mode") == 3) {
				SkillBosshiro3Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("mode") == 4) {
				SkillBosshiro4Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("mode") == 5) {
				SkillBosshiro5Procedure.execute(world, x, y, z, entity);
			}
		} else if (entity.getPersistentData().getDouble("mode") >= 6) {
			if (entity.getPersistentData().getDouble("mode") == 6) {
				SkillLavahiro2Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("mode") == 7) {
				SkillLavahiro3Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("mode") == 8) {
				SkillLavahiro4Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("mode") == 9) {
				SkillLavahiro5Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("mode") == 10) {
				SkillLavahiro6Procedure.execute(world, entity);
			}
		} else if (entity.getPersistentData().getDouble("mode") >= 11) {
			if (entity.getPersistentData().getDouble("mode") == 11) {
				SkillLavahiro7Procedure.execute(entity);
			} else if (entity.getPersistentData().getDouble("mode") == 12) {
				SkillWaterhiro1Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("mode") == 13) {
				SkillWaterhiro2Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("mode") == 14) {
				SkillWaterhiro3Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("mode") == 15) {
				SkillWaterhiro4Procedure.execute(world, x, y, z, entity);
			}
		} else if (entity.getPersistentData().getDouble("mode") >= 16) {
			if (entity.getPersistentData().getDouble("mode") == 16) {
				SkillWaterhiro5Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("mode") == 17) {
				SkillWaterhiro6Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("mode") == 18) {
				SkillWaterhiro7Procedure.execute(world, entity);
			} else if (entity.getPersistentData().getDouble("mode") == 19) {
				SkillWindhiro1Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("mode") == 20) {
				SkillWindhiro2Procedure.execute(world, x, y, z, entity);
			}
		} else if (entity.getPersistentData().getDouble("mode") >= 21) {
			if (entity.getPersistentData().getDouble("mode") == 21) {
				SkillWindhiro3Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("mode") == 22) {
				SkillWindhiro4Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("mode") == 23) {
				SkillWindhiro5Procedure.execute(world, entity);
			} else if (entity.getPersistentData().getDouble("mode") == 24) {
				SkillDragonhiro1Procedure.execute(world, entity);
			} else if (entity.getPersistentData().getDouble("mode") == 25) {
				SkillDragonhiro2Procedure.execute(world, x, y, z, entity);
			}
		} else if (entity.getPersistentData().getDouble("mode") >= 26) {
			if (entity.getPersistentData().getDouble("mode") == 26) {
				SkillDragonhiro3Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("mode") == 27) {
				SkillDragonhiro4Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("mode") == 28) {
				SkillOnihiro0Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("mode") == 29) {
				SkillOnihiro1Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("mode") == 30) {
				SkillOnihiro2Procedure.execute(world, x, y, z, entity);
			}
		} else if (entity.getPersistentData().getDouble("mode") >= 31) {
			if (entity.getPersistentData().getDouble("mode") == 31) {
				SkillOnihiro3no2Procedure.execute(world, entity);
			} else if (entity.getPersistentData().getDouble("mode") == 32) {
				SkillOnihiro5Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("mode") == 33) {
				SkillVolthiro1Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("mode") == 34) {
				SkillVolthiro2Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("mode") == 35) {
				SkillVolthiro3Procedure.execute(world, x, y, z, entity);
			}
		} else if (entity.getPersistentData().getDouble("mode") >= 36) {
			if (entity.getPersistentData().getDouble("mode") == 36) {
				SkillVolthiro4Procedure.execute(world, entity);
			} else if (entity.getPersistentData().getDouble("mode") == 37) {
				SkillVolthiro5Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("mode") == 38) {
				SkillVolthiro6Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("mode") == 39) {
				SkillWardenhiro1Procedure.execute(world, entity);
			} else if (entity.getPersistentData().getDouble("mode") == 40) {
				SkillWardenhiro2Procedure.execute(world, x, y, z, entity);
			}
		} else if (entity.getPersistentData().getDouble("mode") >= 41) {
			if (entity.getPersistentData().getDouble("mode") == 41) {
				SkillWardenhiro3Procedure.execute(world, entity);
			} else if (entity.getPersistentData().getDouble("mode") == 42) {
				SkillWardenhiro4Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("mode") == 43) {
				SkillWardenhiro5Procedure.execute(world, entity);
			} else if (entity.getPersistentData().getDouble("mode") == 44) {
				SkillBosshiro6Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("mode") == 45) {
				SkillBosshiro7Procedure.execute(world, x, y, z, entity);
			}
		} else if (entity.getPersistentData().getDouble("mode") >= 46) {
			if (entity.getPersistentData().getDouble("mode") == 46) {
				SkillBosshiro72Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("mode") == 47) {
				SkillBosshiro8Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("mode") == 48) {
				SkillGroundhiro1Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("mode") == 49) {
				SkillGroundhiro2Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("mode") == 50) {
				SkillGroundhiro3Procedure.execute(world, x, y, z, entity);
			}
		} else if (entity.getPersistentData().getDouble("mode") >= 51) {
			if (entity.getPersistentData().getDouble("mode") == 51) {
				SkillGroundhiro4Procedure.execute(world, x, y, z, entity);
			} else if (entity.getPersistentData().getDouble("mode") == 52) {
				SkillGroundhiro5Procedure.execute(world, entity);
			}
		}
		if (!((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity)) {
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
					rnd = Math.ceil(Math.random() * 52);
					dis = GetDistanceProcedure.execute(entity);
					break;
				}
				entity.getPersistentData().putDouble("mode", rnd);
				DirectionProcedure.execute(entity);
			}
		}
	}
}
