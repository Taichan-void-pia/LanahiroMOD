
package net.mcreator.ranahiromod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.ranahiromod.entity.EpicDownEndermanEntity;
import net.mcreator.ranahiromod.client.model.Modelenderman_neo;

public class EpicDownEndermanRenderer extends MobRenderer<EpicDownEndermanEntity, Modelenderman_neo<EpicDownEndermanEntity>> {
	public EpicDownEndermanRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelenderman_neo(context.bakeLayer(Modelenderman_neo.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EpicDownEndermanEntity entity) {
		return new ResourceLocation("ranahiromod:textures/entities/epicdown_enderman.png");
	}
}
