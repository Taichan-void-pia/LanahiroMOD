package net.mcreator.ranahiromod.client.renderer;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.ranahiromod.entity.PhotonShotProjectileEntity;
import net.mcreator.ranahiromod.client.model.Modelphotpn_shot;

import com.mojang.math.Axis;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class PhotonShotProjectileRenderer extends EntityRenderer<PhotonShotProjectileEntity> {
	private static final ResourceLocation texture = new ResourceLocation("ranahiromod:textures/entities/photon2.png");
	private final Modelphotpn_shot model;

	public PhotonShotProjectileRenderer(EntityRendererProvider.Context context) {
		super(context);
		model = new Modelphotpn_shot(context.bakeLayer(Modelphotpn_shot.LAYER_LOCATION));
	}

	@Override
	public void render(PhotonShotProjectileEntity entityIn, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource bufferIn, int packedLightIn) {
		VertexConsumer vb = bufferIn.getBuffer(RenderType.entityCutout(this.getTextureLocation(entityIn)));
		poseStack.pushPose();
		poseStack.mulPose(Axis.YP.rotationDegrees(Mth.lerp(partialTicks, entityIn.yRotO, entityIn.getYRot()) - 90));
		poseStack.mulPose(Axis.ZP.rotationDegrees(90 + Mth.lerp(partialTicks, entityIn.xRotO, entityIn.getXRot())));
		model.renderToBuffer(poseStack, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
		poseStack.popPose();
		super.render(entityIn, entityYaw, partialTicks, poseStack, bufferIn, packedLightIn);
	}

	@Override
	public ResourceLocation getTextureLocation(PhotonShotProjectileEntity entity) {
		return texture;
	}
}
