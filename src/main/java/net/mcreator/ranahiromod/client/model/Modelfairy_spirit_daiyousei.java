package net.mcreator.ranahiromod.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelfairy_spirit_daiyousei<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("ranahiromod", "modelfairy_spirit_daiyousei"), "main");
	public final ModelPart LeftLeg;
	public final ModelPart RightLeg;
	public final ModelPart LeftArm;
	public final ModelPart wing;
	public final ModelPart wing2;
	public final ModelPart RightArm;
	public final ModelPart Body;
	public final ModelPart Head;

	public Modelfairy_spirit_daiyousei(ModelPart root) {
		this.LeftLeg = root.getChild("LeftLeg");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftArm = root.getChild("LeftArm");
		this.wing = root.getChild("wing");
		this.wing2 = root.getChild("wing2");
		this.RightArm = root.getChild("RightArm");
		this.Body = root.getChild("Body");
		this.Head = root.getChild("Head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(12, 8).addBox(-1.1375F, -0.675F, -0.75F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.6426F, 19.8F, -0.0144F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(0, 15).addBox(-0.8699F, -0.625F, -0.7644F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.65F, 19.75F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(16, 0).addBox(-0.5574F, -0.875F, -0.7644F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 15.0F, 0.0F));
		PartDefinition wing = partdefinition.addOrReplaceChild("wing", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.4574F, 16.625F, 1.0856F, 0.0F, -0.3927F, 0.0F));
		PartDefinition cube_r1 = wing.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(16, 15).addBox(-12.8F, 3.3716F, 0.9019F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1585F, -12.0F, -2.2304F, 0.0F, 0.0F, -1.5708F));
		PartDefinition cube_r2 = wing.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(20, 19).addBox(3.4567F, 0.6416F, 0.9019F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1585F, 1.0F, -2.2304F, 0.0F, 0.0F, -0.576F));
		PartDefinition wing2 = partdefinition.addOrReplaceChild("wing2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0574F, 17.625F, -0.8144F, 0.0F, 0.3927F, 0.0F));
		PartDefinition cube_r3 = wing2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(20, 7).addBox(10.8F, -2.1716F, 3.1981F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.4672F, -13.0F, -2.6788F, 0.0F, 0.0F, 1.5708F));
		PartDefinition cube_r4 = wing2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(20, 13).addBox(6.2726F, 8.5252F, 3.1981F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.4672F, -13.0F, -2.6788F, 0.0F, 0.0F, 0.576F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(8, 15).addBox(-1.4574F, -0.875F, -0.7644F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, 15.0F, 0.0F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 8).addBox(-2.4574F, -0.875F, -0.7644F, 4.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 15.0F, 0.0F));
		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(-1.9574F, -4.375F, -2.2144F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.5F, 14.5F, 0.5F));
		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		wing.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		wing2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}
