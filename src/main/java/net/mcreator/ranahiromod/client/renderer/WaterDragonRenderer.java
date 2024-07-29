
package net.mcreator.ranahiromod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.ranahiromod.entity.WaterDragonEntity;
import net.mcreator.ranahiromod.client.model.Modelwater_dragon;

public class WaterDragonRenderer extends MobRenderer<WaterDragonEntity, Modelwater_dragon<WaterDragonEntity>> {
	public WaterDragonRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelwater_dragon(context.bakeLayer(Modelwater_dragon.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(WaterDragonEntity entity) {
		return new ResourceLocation("ranahiromod:textures/entities/olddragon2.png");
	}
}
