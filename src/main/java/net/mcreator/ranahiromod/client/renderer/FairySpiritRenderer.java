
package net.mcreator.ranahiromod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.ranahiromod.entity.FairySpiritEntity;
import net.mcreator.ranahiromod.client.model.Modelfairy_spirit_daiyousei;

public class FairySpiritRenderer extends MobRenderer<FairySpiritEntity, Modelfairy_spirit_daiyousei<FairySpiritEntity>> {
	public FairySpiritRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelfairy_spirit_daiyousei(context.bakeLayer(Modelfairy_spirit_daiyousei.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(FairySpiritEntity entity) {
		return new ResourceLocation("ranahiromod:textures/entities/dot_spirit_texture.png");
	}
}
