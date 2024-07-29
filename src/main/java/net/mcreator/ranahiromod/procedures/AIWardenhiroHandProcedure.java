package net.mcreator.ranahiromod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.core.BlockPos;

public class AIWardenhiroHandProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean flag_a = false;
		double xPos = 0;
		double yPos = 0;
		double zPos = 0;
		entity.getPersistentData().putDouble("cnt1", (entity.getPersistentData().getDouble("cnt1") + 1));
		entity.setDeltaMovement(new Vec3(0, 0, 0));
		if (entity.getPersistentData().getDouble("cnt1") < 11) {
			flag_a = false;
			xPos = x;
			yPos = y;
			zPos = z;
			if (entity.getPersistentData().getDouble("cnt1") == 1) {
				for (int index0 = 0; index0 < 5; index0++) {
					if (world.getBlockState(BlockPos.containing(xPos, yPos + 1, zPos)).canOcclude()) {
						world.levelEvent(2001, BlockPos.containing(xPos, yPos, zPos), Block.getId((world.getBlockState(BlockPos.containing(xPos, yPos + 1, zPos)))));
					}
					yPos = yPos + 1;
				}
			}
		} else if (entity.getPersistentData().getDouble("cnt1") < 18) {
			flag_a = true;
			{
				Entity _ent = entity;
				_ent.teleportTo(x, (y + 1), z);
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport(x, (y + 1), z, _ent.getYRot(), _ent.getXRot());
			}
		} else if (entity.getPersistentData().getDouble("cnt1") < 33) {
			flag_a = false;
		} else if (entity.getPersistentData().getDouble("cnt1") < 40) {
			flag_a = false;
			{
				Entity _ent = entity;
				_ent.teleportTo(x, (y - 1), z);
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport(x, (y - 1), z, _ent.getYRot(), _ent.getXRot());
			}
		} else {
			flag_a = false;
			if (!entity.level().isClientSide())
				entity.discard();
		}
		if (flag_a) {
			entity.getPersistentData().putDouble("damage", (9 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) / 3)));
			entity.getPersistentData().putDouble("knockback", 1);
			entity.getPersistentData().putDouble("range", 5);
			DodamageProcedure.execute(world, x, y, z, entity);
		}
	}
}
