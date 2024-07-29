
package net.mcreator.ranahiromod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.ranahiromod.entity.NightmareMottieEntity;

public class NightmareMottieRenderer extends HumanoidMobRenderer<NightmareMottieEntity, HumanoidModel<NightmareMottieEntity>> {
	public NightmareMottieRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(NightmareMottieEntity entity) {
		return new ResourceLocation("ranahiromod:textures/entities/skin_nightmare_mottie23.png");
	}
}
