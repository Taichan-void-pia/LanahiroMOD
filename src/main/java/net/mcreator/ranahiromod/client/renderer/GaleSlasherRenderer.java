
package net.mcreator.ranahiromod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.ranahiromod.entity.GaleSlasherEntity;
import net.mcreator.ranahiromod.client.model.Modelgaleslasher;

public class GaleSlasherRenderer extends MobRenderer<GaleSlasherEntity, Modelgaleslasher<GaleSlasherEntity>> {
	public GaleSlasherRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelgaleslasher(context.bakeLayer(Modelgaleslasher.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(GaleSlasherEntity entity) {
		return new ResourceLocation("ranahiromod:textures/entities/galeslasher.png");
	}
}
