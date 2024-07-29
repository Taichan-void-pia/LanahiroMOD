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

// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelmainer_skeleton<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("ranahiromod", "modelmainer_skeleton"), "main");
	public final ModelPart head;
	public final ModelPart body;
	public final ModelPart rightArm;
	public final ModelPart leftArm;
	public final ModelPart rightLeg;
	public final ModelPart leftLeg;

	public Modelmainer_skeleton(ModelPart root) {
		this.head = root.getChild("head");
		this.body = root.getChild("body");
		this.rightArm = root.getChild("rightArm");
		this.leftArm = root.getChild("leftArm");
		this.rightLeg = root.getChild("rightLeg");
		this.leftLeg = root.getChild("leftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition hat = head.addOrReplaceChild("hat", CubeListBuilder.create().texOffs(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.5F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(40, 48).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.1F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition rightArm = partdefinition.addOrReplaceChild("rightArm",
				CubeListBuilder.create().texOffs(40, 16).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 32).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(0, 59)
						.addBox(0.0F, 9.0F, -4.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.05F)).texOffs(0, 59).addBox(0.0F, 9.0F, 2.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.05F)).texOffs(24, 58)
						.addBox(0.0F, 8.0F, -12.2F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F)).texOffs(0, 59).addBox(0.0F, 9.0F, -12.7F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.05F)).texOffs(0, 59)
						.addBox(0.0F, 9.0F, -8.8F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.05F)).texOffs(0, 59).addBox(0.0F, 9.0F, -1.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.05F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition cube_r1 = rightArm.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(24, 58).addBox(-0.5F, -1.5F, -1.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.15F)),
				PartPose.offsetAndRotation(0.5F, 5.5262F, -9.0573F, -0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r2 = rightArm.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(24, 58).addBox(-0.5F, -1.5F, -1.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.11F)),
				PartPose.offsetAndRotation(0.5F, 7.3423F, -10.2708F, -0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r3 = rightArm.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(24, 58).addBox(-0.5F, -1.5F, -1.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.15F)),
				PartPose.offsetAndRotation(0.5F, 13.4738F, -9.0573F, 0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r4 = rightArm.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(24, 58).addBox(-0.5F, -1.5F, -1.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.11F)),
				PartPose.offsetAndRotation(0.5F, 11.6577F, -10.2708F, 0.3927F, 0.0F, 0.0F));
		PartDefinition leftArm = partdefinition.addOrReplaceChild("leftArm", CubeListBuilder.create().texOffs(40, 16).mirror().addBox(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 32).mirror()
				.addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition leftItem = leftArm.addOrReplaceChild("leftItem", CubeListBuilder.create(), PartPose.offset(1.0F, 7.0F, 1.0F));
		PartDefinition rightLeg = partdefinition.addOrReplaceChild("rightLeg",
				CubeListBuilder.create().texOffs(0, 16).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 12.0F, 0.0F));
		PartDefinition leftLeg = partdefinition.addOrReplaceChild("leftLeg", CubeListBuilder.create().texOffs(0, 16).mirror().addBox(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(32, 32).mirror()
				.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, 12.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.rightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.rightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.leftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.leftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}
