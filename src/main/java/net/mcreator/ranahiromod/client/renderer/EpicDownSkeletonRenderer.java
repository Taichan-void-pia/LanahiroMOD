
package net.mcreator.ranahiromod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.ranahiromod.entity.EpicDownSkeletonEntity;
import net.mcreator.ranahiromod.client.model.Modelepicdownskeleton;

public class EpicDownSkeletonRenderer extends MobRenderer<EpicDownSkeletonEntity, Modelepicdownskeleton<EpicDownSkeletonEntity>> {
	public EpicDownSkeletonRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelepicdownskeleton(context.bakeLayer(Modelepicdownskeleton.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EpicDownSkeletonEntity entity) {
		return new ResourceLocation("ranahiromod:textures/entities/epicdown_skeleton3.png");
	}
}
