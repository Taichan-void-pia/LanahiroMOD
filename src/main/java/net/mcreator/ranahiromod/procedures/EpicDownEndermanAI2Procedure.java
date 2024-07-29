package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.ranahiromod.entity.EpicDownEndermanEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class EpicDownEndermanAI2Procedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity(), event.getSource().getDirectEntity());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity immediatesourceentity) {
		execute(null, world, x, y, z, entity, immediatesourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, Entity immediatesourceentity) {
		if (entity == null || immediatesourceentity == null)
			return;
		double rnd = 0;
		double dis = 0;
		double xPos = 0;
		double yPos = 0;
		double zPos = 0;
		double xVector = 0;
		double yVector = 0;
		double zVector = 0;
		double old_x = 0;
		double old_y = 0;
		double old_z = 0;
		boolean logic_do = false;
		boolean logic_a = false;
		if (entity instanceof EpicDownEndermanEntity) {
			if ((immediatesourceentity instanceof Projectile _projEnt ? _projEnt.getDeltaMovement().length() : 0) != 0) {
				if (event != null && event.isCancelable()) {
					event.setCanceled(true);
				} else if (event != null && event.hasResult()) {
					event.setResult(Event.Result.DENY);
				}
				if (!immediatesourceentity.level().isClientSide())
					immediatesourceentity.discard();
				logic_a = true;
			}
			if (new Object() {
				public double getSubmergedHeight(Entity _entity) {
					for (FluidType fluidType : ForgeRegistries.FLUID_TYPES.get().getValues()) {
						if (_entity.level().getFluidState(_entity.blockPosition()).getFluidType() == fluidType)
							return _entity.getFluidTypeHeight(fluidType);
					}
					return 0;
				}
			}.getSubmergedHeight(entity) >= entity.getBbHeight() / 2) {
				if (event != null && event.isCancelable()) {
					event.setCanceled(true);
				} else if (event != null && event.hasResult()) {
					event.setResult(Event.Result.DENY);
				}
				logic_a = true;
			}
			if (logic_a) {
				if (entity.isAlive()) {
					xPos = x + (Math.random() - 0.5) * 12;
					zPos = z + (Math.random() - 0.5) * 12;
					yPos = y;
					for (int index0 = 0; index0 < 320; index0++) {
						if (world.getBlockState(BlockPos.containing(xPos, yPos, zPos)).canOcclude()) {
							yPos = yPos + 1;
							if (!world.getBlockState(BlockPos.containing(xPos, yPos, zPos)).canOcclude()) {
								logic_do = true;
								break;
							}
						} else if (!world.getBlockState(BlockPos.containing(xPos, yPos - 0.3, zPos)).canOcclude()) {
							yPos = yPos - 1;
							if (world.getBlockState(BlockPos.containing(xPos, yPos - 0.3, zPos)).canOcclude()) {
								logic_do = true;
								break;
							}
						}
					}
					if (logic_do) {
						old_x = x;
						old_y = y;
						old_z = z;
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.REVERSE_PORTAL, x, (y + entity.getBbHeight() / 2), z, 30, (entity.getBbWidth() / 2), (entity.getBbHeight() / 2), (entity.getBbWidth() / 2), 1);
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
						{
							Entity _ent = entity;
							_ent.teleportTo(xPos, yPos, zPos);
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport(xPos, yPos, zPos, _ent.getYRot(), _ent.getXRot());
						}
					}
				}
			}
		}
	}
}
