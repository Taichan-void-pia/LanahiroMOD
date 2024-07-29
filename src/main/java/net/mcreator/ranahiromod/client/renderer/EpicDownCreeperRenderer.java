
package net.mcreator.ranahiromod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.CreeperModel;

import net.mcreator.ranahiromod.entity.EpicDownCreeperEntity;

public class EpicDownCreeperRenderer extends MobRenderer<EpicDownCreeperEntity, CreeperModel<EpicDownCreeperEntity>> {
	public EpicDownCreeperRenderer(EntityRendererProvider.Context context) {
		super(context, new CreeperModel(context.bakeLayer(ModelLayers.CREEPER)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EpicDownCreeperEntity entity) {
		return new ResourceLocation("ranahiromod:textures/entities/epic_down_creeper2.png");
	}
}
