package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.ranahiromod.init.RanahiromodModItems;
import net.mcreator.ranahiromod.entity.WindhiroEntity;
import net.mcreator.ranahiromod.entity.WaterhiroEntity;
import net.mcreator.ranahiromod.entity.WardenhiroEntity;
import net.mcreator.ranahiromod.entity.PirokichihawaiiEntity;
import net.mcreator.ranahiromod.entity.OnihiroEntity;
import net.mcreator.ranahiromod.entity.LavahiroEntity;
import net.mcreator.ranahiromod.entity.GroundhiroEntity;
import net.mcreator.ranahiromod.entity.DragonhiroEntity;
import net.mcreator.ranahiromod.entity.Bosshiro3CodePhoenixEntity;
import net.mcreator.ranahiromod.entity.BolthiroEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class RanahiroTrideDropProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double xPos = 0;
		double yPos = 0;
		double zPos = 0;
		if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("ranahiromod:ranahiro_tag")))) {
			xPos = x + 0.5;
			yPos = y + 0.5;
			zPos = z + 0.5;
			if (!(entity instanceof PirokichihawaiiEntity)) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, xPos, yPos, zPos, new ItemStack(RanahiromodModItems.BARRIER_BREAKER.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, xPos, yPos, zPos, new ItemStack(RanahiromodModItems.RANAHIRO_MEAT.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
				if (Math.random() < 0.1) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, xPos, yPos, zPos, new ItemStack(RanahiromodModItems.RANDOM_DYE_GENERATOR.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				}
				if (entity instanceof LavahiroEntity) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, xPos, yPos, zPos, new ItemStack(RanahiromodModItems.LAVAHIRO_ITEM.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				}
				if (entity instanceof WaterhiroEntity) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, xPos, yPos, zPos, new ItemStack(RanahiromodModItems.WATERHIRO_ITEM.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				}
				if (entity instanceof WindhiroEntity) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, xPos, yPos, zPos, new ItemStack(RanahiromodModItems.WINDHIRO_ITEM.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				}
				if (entity instanceof DragonhiroEntity) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, xPos, yPos, zPos, new ItemStack(RanahiromodModItems.DRAGONHIRO_ITEM.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				}
				if (entity instanceof OnihiroEntity) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, xPos, yPos, zPos, new ItemStack(RanahiromodModItems.ONIHIRO_ITEM.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				}
				if (entity instanceof BolthiroEntity) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, xPos, yPos, zPos, new ItemStack(RanahiromodModItems.BOLTHIRO_ITEM.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				}
				if (entity instanceof WardenhiroEntity) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, xPos, yPos, zPos, new ItemStack(RanahiromodModItems.WARDENHIRO_ITEM.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				}
				if (entity instanceof GroundhiroEntity) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, xPos, yPos, zPos, new ItemStack(RanahiromodModItems.GROUNDHIRO_ITEM.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				}
				if (entity instanceof Bosshiro3CodePhoenixEntity) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, xPos, yPos, zPos, new ItemStack(RanahiromodModItems.SWORD_OF_BOSSHIRO.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, xPos, yPos, zPos, new ItemStack(RanahiromodModItems.DIVINE_RANA_FORCE.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, xPos, yPos, zPos, new ItemStack(RanahiromodModItems.DIVINE_RANA_REINFORCED.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			}
		}
	}
}
