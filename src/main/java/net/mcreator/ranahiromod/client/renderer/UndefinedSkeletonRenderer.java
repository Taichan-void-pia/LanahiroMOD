
package net.mcreator.ranahiromod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.ranahiromod.entity.UndefinedSkeletonEntity;
import net.mcreator.ranahiromod.client.model.Modelepicdownskeleton;

public class UndefinedSkeletonRenderer extends MobRenderer<UndefinedSkeletonEntity, Modelepicdownskeleton<UndefinedSkeletonEntity>> {
	public UndefinedSkeletonRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelepicdownskeleton(context.bakeLayer(Modelepicdownskeleton.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(UndefinedSkeletonEntity entity) {
		return new ResourceLocation("ranahiromod:textures/entities/null.png");
	}
}
