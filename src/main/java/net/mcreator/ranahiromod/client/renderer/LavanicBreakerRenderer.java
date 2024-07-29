
package net.mcreator.ranahiromod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.ranahiromod.entity.LavanicBreakerEntity;
import net.mcreator.ranahiromod.client.model.Modellavanical_golem;

public class LavanicBreakerRenderer extends MobRenderer<LavanicBreakerEntity, Modellavanical_golem<LavanicBreakerEntity>> {
	public LavanicBreakerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modellavanical_golem(context.bakeLayer(Modellavanical_golem.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(LavanicBreakerEntity entity) {
		return new ResourceLocation("ranahiromod:textures/entities/lavanical_golem.png");
	}
}
