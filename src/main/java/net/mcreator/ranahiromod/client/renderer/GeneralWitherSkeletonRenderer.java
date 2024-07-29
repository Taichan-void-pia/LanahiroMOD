
package net.mcreator.ranahiromod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.ranahiromod.entity.GeneralWitherSkeletonEntity;
import net.mcreator.ranahiromod.client.model.Modelgeneral_wither_skeleton;

public class GeneralWitherSkeletonRenderer extends MobRenderer<GeneralWitherSkeletonEntity, Modelgeneral_wither_skeleton<GeneralWitherSkeletonEntity>> {
	public GeneralWitherSkeletonRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelgeneral_wither_skeleton(context.bakeLayer(Modelgeneral_wither_skeleton.LAYER_LOCATION)), 1.25f);
	}

	@Override
	public ResourceLocation getTextureLocation(GeneralWitherSkeletonEntity entity) {
		return new ResourceLocation("ranahiromod:textures/entities/general_wither_skeleton.png");
	}
}
