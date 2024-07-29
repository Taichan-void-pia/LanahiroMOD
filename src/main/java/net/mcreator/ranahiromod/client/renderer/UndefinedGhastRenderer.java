
package net.mcreator.ranahiromod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.GhastModel;

import net.mcreator.ranahiromod.entity.UndefinedGhastEntity;

import com.mojang.blaze3d.vertex.PoseStack;

public class UndefinedGhastRenderer extends MobRenderer<UndefinedGhastEntity, GhastModel<UndefinedGhastEntity>> {
	public UndefinedGhastRenderer(EntityRendererProvider.Context context) {
		super(context, new GhastModel(context.bakeLayer(ModelLayers.GHAST)), 0.5f);
	}

	@Override
	protected void scale(UndefinedGhastEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(2f, 2f, 2f);
	}

	@Override
	public ResourceLocation getTextureLocation(UndefinedGhastEntity entity) {
		return new ResourceLocation("ranahiromod:textures/entities/null.png");
	}
}
