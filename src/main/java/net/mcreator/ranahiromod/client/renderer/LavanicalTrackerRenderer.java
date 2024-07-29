
package net.mcreator.ranahiromod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.ranahiromod.entity.LavanicalTrackerEntity;
import net.mcreator.ranahiromod.client.model.Modellavanical_tracker;

public class LavanicalTrackerRenderer extends MobRenderer<LavanicalTrackerEntity, Modellavanical_tracker<LavanicalTrackerEntity>> {
	public LavanicalTrackerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modellavanical_tracker(context.bakeLayer(Modellavanical_tracker.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(LavanicalTrackerEntity entity) {
		return new ResourceLocation("ranahiromod:textures/entities/lavanical_tracker.png");
	}
}
