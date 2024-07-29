
package net.mcreator.ranahiromod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.ranahiromod.entity.HypocriteEntity;
import net.mcreator.ranahiromod.client.model.Modelgizennsha;

public class HypocriteRenderer extends MobRenderer<HypocriteEntity, Modelgizennsha<HypocriteEntity>> {
	public HypocriteRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelgizennsha(context.bakeLayer(Modelgizennsha.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(HypocriteEntity entity) {
		return new ResourceLocation("ranahiromod:textures/entities/gizennsha.png");
	}
}
