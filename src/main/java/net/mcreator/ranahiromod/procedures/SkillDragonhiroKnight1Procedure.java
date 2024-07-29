package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

public class SkillDragonhiroKnight1Procedure {
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
				{
					Entity _ent = entity;
					_ent.setYRot(entity.getYRot());
					_ent.setXRot(90);
					_ent.setYBodyRot(_ent.getYRot());
					_ent.setYHeadRot(_ent.getYRot());
					_ent.yRotO = _ent.getYRot();
					_ent.xRotO = _ent.getXRot();
					if (_ent instanceof LivingEntity _entity) {
						_entity.yBodyRotO = _entity.getYRot();
						_entity.yHeadRotO = _entity.getYRot();
					}
				}
				for (int index0 = 0; index0 < 5; index0++) {
					xPos2 = xPos + (Math.random() - 0.5) * 5;
					yPos2 = yPos;
					zPos2 = zPos + (Math.random() - 0.5) * 5;
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.EXPLOSION, xPos2, yPos2, zPos2, 1, 0, 0, 0, 0);
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.CLOUD, xPos2, yPos2, zPos2, 2, 0.25, 0.25, 0.25, 0.2);
					if (world instanceof Level _level && !_level.isClientSide())
						_level.explode(null, xPos2, yPos2, zPos2, 0, Level.ExplosionInteraction.NONE);
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
								if (world instanceof ServerLevel _level)
									_level.sendParticles(ParticleTypes.EXPLOSION, xPos2, yPos2, zPos2, 1, 0, 0, 0, 0);
								if (world instanceof ServerLevel _level)
									_level.sendParticles(ParticleTypes.CLOUD, xPos2, yPos2, zPos2, 2, 0.25, 0.25, 0.25, 0.2);
								if (world instanceof Level _level && !_level.isClientSide())
									_level.explode(null, xPos2, yPos2, zPos2, 0, Level.ExplosionInteraction.NONE);
							}
							entity.getPersistentData().putDouble("damage", (20 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
							entity.getPersistentData().putDouble("knockback", 1);
							entity.getPersistentData().putDouble("range", 2.5);
							DodamageProcedure.execute(world, xPos, yPos, zPos, entity);
							xPos = entity.getPersistentData().getDouble("x_pos") + Math.cos(rad) * dis;
							yPos = yPos2;
							zPos = entity.getPersistentData().getDouble("z_pos") + Math.sin(rad) * dis;
							world.levelEvent(2001, BlockPos.containing(xPos, yPos, zPos), Block.getId((world.getBlockState(BlockPos.containing(xPos, yPos - 0.8, zPos)))));
						}
						dis = dis + 0.8;
					}
					tsuki7_mode = tsuki7_mode + 18;
				}
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, xPos, yPos, zPos, 0, Level.ExplosionInteraction.NONE);
			} else if (entity.getPersistentData().getDouble("cnt2") % 5 == 4) {
				entity.getPersistentData().putDouble("cnt3", (entity.getPersistentData().getDouble("cnt3") + 1));
				dis = (entity.getPersistentData().getDouble("cnt3") - 0.9) * 5;
				tsuki7_mode = 0;
				for (int index6 = 0; index6 < 72; index6++) {
					logic_a = false;
					rad = Math.toRadians(entity.getPersistentData().getDouble("start_r") + tsuki7_mode);
					xPos = entity.getPersistentData().getDouble("x_pos") + Math.cos(rad) * dis;
					yPos = entity.getPersistentData().getDouble("y_pos");
					zPos = entity.getPersistentData().getDouble("z_pos") + Math.sin(rad) * dis;
					if (world.getBlockState(BlockPos.containing(xPos, yPos, zPos)).canOcclude()) {
						yPos = entity.getPersistentData().getDouble("y_pos");
						for (int index7 = 0; index7 < (int) Math.round(dis * 5); index7++) {
							yPos = yPos + 0.5;
							if (!world.getBlockState(BlockPos.containing(xPos, yPos, zPos)).canOcclude()) {
								logic_a = true;
								break;
							}
						}
					} else if (!world.getBlockState(BlockPos.containing(xPos, yPos - 0.6, zPos)).canOcclude()) {
						yPos = entity.getPersistentData().getDouble("y_pos");
						for (int index8 = 0; index8 < (int) Math.round(dis * 5); index8++) {
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
						for (int index9 = 0; index9 < 5; index9++) {
							xPos2 = xPos + (Math.random() - 0.5) * 5;
							yPos2 = yPos;
							zPos2 = zPos + (Math.random() - 0.5) * 5;
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.EXPLOSION, xPos2, yPos2, zPos2, 1, 0, 0, 0, 0);
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.CLOUD, xPos2, yPos2, zPos2, 2, 0.25, 0.25, 0.25, 0.2);
							if (world instanceof Level _level && !_level.isClientSide())
								_level.explode(null, xPos2, yPos2, zPos2, 0, Level.ExplosionInteraction.NONE);
						}
						entity.getPersistentData().putDouble("damage", (20 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
						entity.getPersistentData().putDouble("knockback", 1);
						entity.getPersistentData().putDouble("range", 2.5);
						DodamageProcedure.execute(world, xPos, yPos, zPos, entity);
					}
					tsuki7_mode = tsuki7_mode + 5;
				}
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, xPos, yPos, zPos, 0, Level.ExplosionInteraction.NONE);
			}
		}
		if (entity.getPersistentData().getDouble("cnt3") > 3) {
			entity.getPersistentData().putDouble("skill2", 0);
		}
	}
}
