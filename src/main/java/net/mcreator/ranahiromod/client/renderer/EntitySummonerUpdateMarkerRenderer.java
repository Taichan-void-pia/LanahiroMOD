
package net.mcreator.ranahiromod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.ranahiromod.entity.EntitySummonerUpdateMarkerEntity;

public class EntitySummonerUpdateMarkerRenderer extends HumanoidMobRenderer<EntitySummonerUpdateMarkerEntity, HumanoidModel<EntitySummonerUpdateMarkerEntity>> {
	public EntitySummonerUpdateMarkerRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(EntitySummonerUpdateMarkerEntity entity) {
		return new ResourceLocation("ranahiromod:textures/entities/clear.png");
	}
}
