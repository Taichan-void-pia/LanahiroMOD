
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
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.gui.screens.inventory.InventoryScreen;
import net.minecraft.client.Minecraft;

import net.mcreator.ranahiromod.procedures.OverlayEntityProcedure;
import net.mcreator.ranahiromod.procedures.LookEntityAttributeViewDisplayOverlayIngameProcedure;
import net.mcreator.ranahiromod.procedures.EntityLookPositionNearEntityStrengthProcedure;
import net.mcreator.ranahiromod.procedures.EntityLookPositionNearEntityNameProcedure;
import net.mcreator.ranahiromod.procedures.EntityLookPositionNearEntityName2Procedure;
import net.mcreator.ranahiromod.procedures.EntityLookPositionNearEntityHealthProcedure;
import net.mcreator.ranahiromod.procedures.EntityLookPositionNearEntityArmorValueProcedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class LookEntityAttributeViewOverlay {
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
		RenderSystem.disableDepthTest();
		RenderSystem.depthMask(false);
		RenderSystem.enableBlend();
		RenderSystem.setShader(GameRenderer::getPositionTexShader);
		RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
		RenderSystem.setShaderColor(1, 1, 1, 1);
		if (LookEntityAttributeViewDisplayOverlayIngameProcedure.execute(world, entity)) {
			event.getGuiGraphics().blit(new ResourceLocation("ranahiromod:textures/screens/health_boost.png"), w / 2 + -212, h / 2 + -106, 0, 0, 9, 9, 9, 9);

			event.getGuiGraphics().blit(new ResourceLocation("ranahiromod:textures/screens/resistance.png"), w / 2 + -212, h / 2 + -95, 0, 0, 9, 9, 9, 9);

			event.getGuiGraphics().blit(new ResourceLocation("ranahiromod:textures/screens/strength.png"), w / 2 + -212, h / 2 + -84, 0, 0, 9, 9, 9, 9);

			if (OverlayEntityProcedure.execute(world, entity))
				event.getGuiGraphics().drawString(Minecraft.getInstance().font,

						EntityLookPositionNearEntityName2Procedure.execute(world, entity), w / 2 + -211, h / 2 + -118, -256, false);
			if (OverlayEntityProcedure.execute(world, entity))
				event.getGuiGraphics().drawString(Minecraft.getInstance().font,

						EntityLookPositionNearEntityHealthProcedure.execute(world, entity), w / 2 + -203, h / 2 + -107, -16711681, false);
			if (OverlayEntityProcedure.execute(world, entity))
				event.getGuiGraphics().drawString(Minecraft.getInstance().font,

						EntityLookPositionNearEntityArmorValueProcedure.execute(world, entity), w / 2 + -203, h / 2 + -96, -1, false);
			if (OverlayEntityProcedure.execute(world, entity))
				event.getGuiGraphics().drawString(Minecraft.getInstance().font,

						EntityLookPositionNearEntityStrengthProcedure.execute(world, entity), w / 2 + -203, h / 2 + -84, -65536, false);
			if (EntityLookPositionNearEntityNameProcedure.execute(world, entity) instanceof LivingEntity livingEntity) {
				if (OverlayEntityProcedure.execute(world, entity))
					InventoryScreen.renderEntityInInventoryFollowsAngle(event.getGuiGraphics(), w / 2 + -193, h / 2 + -50, 15, 9f, 0, livingEntity);
			}
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
