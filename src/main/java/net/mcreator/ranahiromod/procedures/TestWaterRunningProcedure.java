package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.ranahiromod.network.RanahiromodModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class TestWaterRunningProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double x_pos = 0;
		double y_pos = 0;
		double z_pos = 0;
		double dis = 0;
		if ((entity.getCapability(RanahiromodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RanahiromodModVariables.PlayerVariables())).Job == 4) {
			if ((world.getBlockState(BlockPos.containing(x, y - 0.2, z))).getBlock() == Blocks.WATER || (world.getBlockState(BlockPos.containing(x, y - 0.2, z))).getBlock() == Blocks.WATER) {
				if (!entity.isUnderWater()) {
					if (entity instanceof Player && entity.isSprinting()) {
						GetPowerFowardProcedure.execute(world, x, y, z, entity);
						entity.setDeltaMovement(new Vec3((entity.getPersistentData().getDouble("x_power") * 0.3), 0.001, (entity.getPersistentData().getDouble("z_power") * 0.3)));
					} else if (entity instanceof Monster) {
						if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity) {
							GetPowerProcedure.execute(world, x, y, z, entity);
							entity.setDeltaMovement(new Vec3((entity.getPersistentData().getDouble("x_power") * 0.1), 0.001, (entity.getPersistentData().getDouble("z_power") * 0.1)));
						} else {
							entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), 0.001, (entity.getDeltaMovement().z())));
						}
					}
				}
			}
		}
	}
}
