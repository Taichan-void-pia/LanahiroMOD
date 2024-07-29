
package net.mcreator.ranahiromod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.WitchModel;

import net.mcreator.ranahiromod.entity.UndefinedWitchEntity;

public class UndefinedWitchRenderer extends MobRenderer<UndefinedWitchEntity, WitchModel<UndefinedWitchEntity>> {
	public UndefinedWitchRenderer(EntityRendererProvider.Context context) {
		super(context, new WitchModel(context.bakeLayer(ModelLayers.WITCH)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(UndefinedWitchEntity entity) {
		return new ResourceLocation("ranahiromod:textures/entities/null.png");
	}
}
