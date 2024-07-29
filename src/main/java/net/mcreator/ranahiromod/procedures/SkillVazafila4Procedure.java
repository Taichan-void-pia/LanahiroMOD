package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import net.mcreator.ranahiromod.init.RanahiromodModParticleTypes;
import net.mcreator.ranahiromod.init.RanahiromodModEntities;
import net.mcreator.ranahiromod.entity.PhotonServantEntity;

import java.util.Comparator;

public class SkillVazafila4Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean UseSK = false;
		boolean logic_attack = false;
		boolean UseVazafila = false;
		boolean muki = false;
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
		double yaw = 0;
		double pitch = 0;
		Entity photon_servant_near_entity = null;
		entity.getPersistentData().putDouble("cnt1", (entity.getPersistentData().getDouble("cnt1") + 1));
		UseVazafila = UsePlayerLogicvazafilaProcedure.execute(entity);
		entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x() / 5), (entity.getDeltaMovement().y()), (entity.getDeltaMovement().z() / 5)));
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (RanahiromodModParticleTypes.LIGHT_SCATTER.get()), (x + (Math.random() - 0.5) * 8), y, (z + (Math.random() - 0.5) * 8), 10, 0.4, 0.4, 0.4, 0.2);
		if (entity.getPersistentData().getDouble("cnt1") > 20) {
			if (UseVazafila) {
				data = 4;
			} else {
				data = 2;
			}
			for (int index0 = 0; index0 < (int) data; index0++) {
				xPos = x + (Math.random() - 0.5) * 8;
				yPos = y;
				zPos = z + (Math.random() - 0.5) * 8;
				yaw = Math.random() * 360;
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = RanahiromodModEntities.PHOTON_SERVANT.get().spawn(_level, BlockPos.containing(xPos, yPos, zPos), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot((float) yaw);
						entityToSpawn.setYBodyRot((float) yaw);
						entityToSpawn.setYHeadRot((float) yaw);
					}
				}
				if (!world.getEntitiesOfClass(PhotonServantEntity.class, AABB.ofSize(new Vec3(xPos, yPos, zPos), 1, 1, 1), e -> true).isEmpty()) {
					photon_servant_near_entity = (Entity) world.getEntitiesOfClass(PhotonServantEntity.class, AABB.ofSize(new Vec3(xPos, yPos, zPos), 1, 1, 1), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(xPos, yPos, zPos)).findFirst().orElse(null);
					if (entity.getPersistentData().getDouble("friend_num") == 0) {
						entity.getPersistentData().putDouble("friend_num", Math.random());
					}
					photon_servant_near_entity.getPersistentData().putDouble("friend_num", (entity.getPersistentData().getDouble("friend_num")));
					if (photon_servant_near_entity instanceof TamableAnimal _toTame && entity instanceof Player _owner)
						_toTame.tame(_owner);
					if (entity.getPersistentData().getBoolean("oni")) {
						photon_servant_near_entity.getPersistentData().putBoolean("oni", true);
						photon_servant_near_entity.getPersistentData().putBoolean("kisatsutai", false);
						photon_servant_near_entity.getPersistentData().putBoolean("frinedly", false);
					} else {
						photon_servant_near_entity.getPersistentData().putBoolean("oni", false);
						photon_servant_near_entity.getPersistentData().putBoolean("kisatsutai", true);
						photon_servant_near_entity.getPersistentData().putBoolean("frinedly", true);
					}
					if (photon_servant_near_entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, (int) Double.POSITIVE_INFINITY,
								(int) Math.min(entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_RESISTANCE) ? _livEnt.getEffect(MobEffects.DAMAGE_RESISTANCE).getAmplifier() : 0, 3), false, false));
					if (photon_servant_near_entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, (int) Double.POSITIVE_INFINITY, 13, false, false));
				}
			}
			entity.getPersistentData().putDouble("skill2", 0);
		}
	}
}
