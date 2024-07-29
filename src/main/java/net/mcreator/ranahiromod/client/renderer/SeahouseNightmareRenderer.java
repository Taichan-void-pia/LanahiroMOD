
package net.mcreator.ranahiromod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.ranahiromod.entity.SeahouseNightmareEntity;
import net.mcreator.ranahiromod.client.model.Modelseahorsenightmare;

public class SeahouseNightmareRenderer extends MobRenderer<SeahouseNightmareEntity, Modelseahorsenightmare<SeahouseNightmareEntity>> {
	public SeahouseNightmareRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelseahorsenightmare(context.bakeLayer(Modelseahorsenightmare.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SeahouseNightmareEntity entity) {
		return new ResourceLocation("ranahiromod:textures/entities/seahorse_nightmare.png");
	}
}
