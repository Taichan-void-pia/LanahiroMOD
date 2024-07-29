
package net.mcreator.ranahiromod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.ranahiromod.entity.GeneralSkeletonEntity;
import net.mcreator.ranahiromod.client.model.Modelgeneral_skeleton;

public class GeneralSkeletonRenderer extends MobRenderer<GeneralSkeletonEntity, Modelgeneral_skeleton<GeneralSkeletonEntity>> {
	public GeneralSkeletonRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelgeneral_skeleton(context.bakeLayer(Modelgeneral_skeleton.LAYER_LOCATION)), 1.25f);
	}

	@Override
	public ResourceLocation getTextureLocation(GeneralSkeletonEntity entity) {
		return new ResourceLocation("ranahiromod:textures/entities/general_skeleton.png");
	}
}
