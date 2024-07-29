
package net.mcreator.ranahiromod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.ranahiromod.entity.Bosshiro2Entity;
import net.mcreator.ranahiromod.client.model.Modelbosshiro_phase2;

public class Bosshiro2Renderer extends MobRenderer<Bosshiro2Entity, Modelbosshiro_phase2<Bosshiro2Entity>> {
	public Bosshiro2Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelbosshiro_phase2(context.bakeLayer(Modelbosshiro_phase2.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(Bosshiro2Entity entity) {
		return new ResourceLocation("ranahiromod:textures/entities/skin_bosshiro_phase223.png");
	}
}
