
package net.mcreator.ranahiromod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.ranahiromod.entity.BresoldierEntity;
import net.mcreator.ranahiromod.client.model.Modelbrezoldier;

public class BresoldierRenderer extends MobRenderer<BresoldierEntity, Modelbrezoldier<BresoldierEntity>> {
	public BresoldierRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbrezoldier(context.bakeLayer(Modelbrezoldier.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BresoldierEntity entity) {
		return new ResourceLocation("ranahiromod:textures/entities/brezoldier.png");
	}
}
