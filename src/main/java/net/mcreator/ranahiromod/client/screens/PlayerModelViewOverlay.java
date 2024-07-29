
package net.mcreator.ranahiromod.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.client.gui.screens.inventory.InventoryScreen;
import net.minecraft.client.Minecraft;

import net.mcreator.ranahiromod.procedures.OverlayPlayerModelDashProcedure;
import net.mcreator.ranahiromod.procedures.GUIPlayerModelProcedure;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class PlayerModelViewOverlay {
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getWindow().getGuiScaledWidth();
		int h = event.getWindow().getGuiScaledHeight();
		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level();
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}
		if (true) {
			if (GUIPlayerModelProcedure.execute(entity) instanceof LivingEntity livingEntity) {
				if (OverlayPlayerModelDashProcedure.execute(entity))
					InventoryScreen.renderEntityInInventoryFollowsAngle(event.getGuiGraphics(), w / 2 + -177, h / 2 + -50, 20, -0.5f, 0, livingEntity);
			}
		}
	}
}
