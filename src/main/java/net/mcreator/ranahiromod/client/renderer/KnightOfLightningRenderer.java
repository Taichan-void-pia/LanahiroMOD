
package net.mcreator.ranahiromod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.ranahiromod.entity.KnightOfLightningEntity;
import net.mcreator.ranahiromod.client.model.Modelknight_of_lightning;

public class KnightOfLightningRenderer extends MobRenderer<KnightOfLightningEntity, Modelknight_of_lightning<KnightOfLightningEntity>> {
	public KnightOfLightningRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelknight_of_lightning(context.bakeLayer(Modelknight_of_lightning.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(KnightOfLightningEntity entity) {
		return new ResourceLocation("ranahiromod:textures/entities/knight_of_lightning.png");
	}
}
