package net.mcreator.ranahiromod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.ranahiromod.init.RanahiromodModItems;

import javax.annotation.Nullable;

import java.util.List;
import java.util.Comparator;

@Mod.EventBusSubscriber
public class PortalChakkamanAttackProcedure {
	@SubscribeEvent
	public static void onRightClickEntity(PlayerInteractEvent.EntityInteract event) {
		if (event.getHand() != event.getEntity().getUsedItemHand())
			return;
		execute(event, event.getLevel(), event.getTarget(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		execute(null, world, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		double xPos = 0;
		double yPos = 0;
		double zPos = 0;
		double dis = 0;
		if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RanahiromodModItems.WAWAWAWAWAWAWAWAWAWAWAWAWAWAWAWAWAWAWAWAWAWAWAWAWAWAWAWAWAWA.get()) {
			if (entity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("ranahiromod:zombie_doctor"));
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					for (String criteria : _ap.getRemainingCriteria())
						_player.getAdvancements().award(_adv, criteria);
				}
			}
			dis = 0;
			for (int index0 = 0; index0 < 5; index0++) {
				xPos = sourceentity.level().clip(new ClipContext(sourceentity.getEyePosition(1f), sourceentity.getEyePosition(1f).add(sourceentity.getViewVector(1f).scale(dis)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, sourceentity))
						.getBlockPos().getX();
				yPos = sourceentity.level().clip(new ClipContext(sourceentity.getEyePosition(1f), sourceentity.getEyePosition(1f).add(sourceentity.getViewVector(1f).scale(dis)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, sourceentity))
						.getBlockPos().getY();
				zPos = sourceentity.level().clip(new ClipContext(sourceentity.getEyePosition(1f), sourceentity.getEyePosition(1f).add(sourceentity.getViewVector(1f).scale(dis)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, sourceentity))
						.getBlockPos().getZ();
				{
					final Vec3 _center = new Vec3(xPos, yPos, zPos);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if (!(entityiterator == sourceentity)) {
							if (entityiterator instanceof LivingEntity _entity)
								_entity.setHealth(0);
						}
					}
				}
				dis = dis + 1;
			}
		}
	}
}
