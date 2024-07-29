
package net.mcreator.ranahiromod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.ranahiromod.entity.MinerSkeletonEntity;
import net.mcreator.ranahiromod.client.model.Modelmainer_skeleton;

public class MinerSkeletonRenderer extends MobRenderer<MinerSkeletonEntity, Modelmainer_skeleton<MinerSkeletonEntity>> {
	public MinerSkeletonRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmainer_skeleton(context.bakeLayer(Modelmainer_skeleton.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MinerSkeletonEntity entity) {
		return new ResourceLocation("ranahiromod:textures/entities/skeleton.png");
	}
}
