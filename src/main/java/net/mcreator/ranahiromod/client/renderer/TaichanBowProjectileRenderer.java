package net.mcreator.ranahiromod.client.renderer;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.ranahiromod.entity.TaichanBowProjectileEntity;
import net.mcreator.ranahiromod.client.model.Modelarrow_taichan;

import com.mojang.math.Axis;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class TaichanBowProjectileRenderer extends EntityRenderer<TaichanBowProjectileEntity> {
	private static final ResourceLocation texture = new ResourceLocation("ranahiromod:textures/entities/arrow_29_je2.png");
	private final Modelarrow_taichan model;

	public TaichanBowProjectileRenderer(EntityRendererProvider.Context context) {
		super(context);
		model = new Modelarrow_taichan(context.bakeLayer(Modelarrow_taichan.LAYER_LOCATION));
	}

	@Override
	public void render(TaichanBowProjectileEntity entityIn, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource bufferIn, int packedLightIn) {
		VertexConsumer vb = bufferIn.getBuffer(RenderType.entityCutout(this.getTextureLocation(entityIn)));
		poseStack.pushPose();
		poseStack.mulPose(Axis.YP.rotationDegrees(Mth.lerp(partialTicks, entityIn.yRotO, entityIn.getYRot()) - 90));
		poseStack.mulPose(Axis.ZP.rotationDegrees(90 + Mth.lerp(partialTicks, entityIn.xRotO, entityIn.getXRot())));
		model.renderToBuffer(poseStack, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
		poseStack.popPose();
		super.render(entityIn, entityYaw, partialTicks, poseStack, bufferIn, packedLightIn);
	}

	@Override
	public ResourceLocation getTextureLocation(TaichanBowProjectileEntity entity) {
		return texture;
	}
}
