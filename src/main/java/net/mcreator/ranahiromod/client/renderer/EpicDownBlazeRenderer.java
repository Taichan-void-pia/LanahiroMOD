
package net.mcreator.ranahiromod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.ranahiromod.entity.EpicDownBlazeEntity;
import net.mcreator.ranahiromod.client.model.Modelepicdownblaze;

public class EpicDownBlazeRenderer extends MobRenderer<EpicDownBlazeEntity, Modelepicdownblaze<EpicDownBlazeEntity>> {
	public EpicDownBlazeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelepicdownblaze(context.bakeLayer(Modelepicdownblaze.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EpicDownBlazeEntity entity) {
		return new ResourceLocation("ranahiromod:textures/entities/epic_down_blaze.png");
	}
}
