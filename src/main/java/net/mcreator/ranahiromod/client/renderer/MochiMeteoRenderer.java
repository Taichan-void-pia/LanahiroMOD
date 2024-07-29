
package net.mcreator.ranahiromod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.ranahiromod.entity.MochiMeteoEntity;
import net.mcreator.ranahiromod.client.model.Modelmoti;

public class MochiMeteoRenderer extends MobRenderer<MochiMeteoEntity, Modelmoti<MochiMeteoEntity>> {
	public MochiMeteoRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmoti(context.bakeLayer(Modelmoti.LAYER_LOCATION)), 10f);
	}

	@Override
	public ResourceLocation getTextureLocation(MochiMeteoEntity entity) {
		return new ResourceLocation("ranahiromod:textures/entities/moti.png");
	}
}
