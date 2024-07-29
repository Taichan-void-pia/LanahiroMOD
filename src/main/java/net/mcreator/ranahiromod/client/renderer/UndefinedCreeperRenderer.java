
package net.mcreator.ranahiromod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.CreeperModel;

import net.mcreator.ranahiromod.entity.UndefinedCreeperEntity;

public class UndefinedCreeperRenderer extends MobRenderer<UndefinedCreeperEntity, CreeperModel<UndefinedCreeperEntity>> {
	public UndefinedCreeperRenderer(EntityRendererProvider.Context context) {
		super(context, new CreeperModel(context.bakeLayer(ModelLayers.CREEPER)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(UndefinedCreeperEntity entity) {
		return new ResourceLocation("ranahiromod:textures/entities/null.png");
	}
}
