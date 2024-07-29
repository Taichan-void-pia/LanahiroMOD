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
public class Modelbrezoldier<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("ranahiromod", "modelbrezoldier"), "main");
	public final ModelPart head;
	public final ModelPart body;
	public final ModelPart rightarm;
	public final ModelPart leftarm;
	public final ModelPart rotation_parts;

	public Modelbrezoldier(ModelPart root) {
		this.head = root.getChild("head");
		this.body = root.getChild("body");
		this.rightarm = root.getChild("rightarm");
		this.leftarm = root.getChild("leftarm");
		this.rotation_parts = root.getChild("rotation_parts");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(32, 45).addBox(-4.0F, -10.9848F, -3.9514F, 8.0F, 11.0F, 8.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.0F, 4.0F, 0.0F, 0.0873F, 0.0F, 0.0F));
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(16, 16).addBox(-4.0F, 3.9052F, -2.8658F, 8.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2182F, 0.0F, 0.0F));
		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(16, 16).addBox(-1.0F, 1.8828F, -2.6006F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.45F)),
				PartPose.offsetAndRotation(0.0F, 14.4626F, 1.4961F, 0.8727F, 0.0F, 0.0F));
		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(19, 17).addBox(-1.0F, -0.7535F, -1.912F, 2.0F, 4.0F, 3.0F, new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(0.0F, 14.4626F, 1.4961F, 0.6109F, 0.0F, 0.0F));
		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(19, 17).addBox(-2.0F, -2.7573F, -2.0442F, 4.0F, 4.0F, 4.0F, new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(0.0F, 14.4626F, 1.4961F, 0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(19, 17).addBox(-3.0F, -5.6581F, -2.7895F, 6.0F, 4.0F, 4.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(0.0F, 14.4626F, 1.4961F, 0.2182F, 0.0F, 0.0F));
		PartDefinition rightarm = partdefinition.addOrReplaceChild("rightarm", CubeListBuilder.create().texOffs(40, 26).addBox(-3.7836F, 4.813F, -1.5238F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 4.0F, 0.0F, 0.4498F, -0.2368F, 0.2799F));
		PartDefinition cube_r5 = rightarm.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(40, 16).addBox(-0.4977F, 0.1804F, -3.9048F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.4835F, -1.2495F, 2.3809F, 0.0F, 0.0F, 0.1309F));
		PartDefinition windblade_right = rightarm.addOrReplaceChild("windblade_right", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.7741F, 10.6574F, 0.0594F, -0.2618F, 0.0F, 0.0F));
		PartDefinition cube_r6 = windblade_right.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(25, 30).addBox(-0.5095F, -16.9704F, 14.1668F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.4F)).texOffs(25, 30).addBox(-0.5095F, -16.7704F, 13.6668F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.4F))
						.texOffs(25, 30).addBox(-0.5095F, -16.5704F, 13.4668F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.4F)).texOffs(25, 30).addBox(-0.5095F, -16.3704F, 13.3668F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.4F)).texOffs(25, 30)
						.addBox(-0.5095F, -16.1704F, 13.1668F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.4F)).texOffs(25, 30).addBox(-0.5095F, -15.1704F, 12.9668F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.4F)).texOffs(25, 30)
						.addBox(-0.5095F, -14.1704F, 12.8668F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.4F)).texOffs(25, 30).addBox(-0.5095F, -12.1704F, 12.6668F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.425F)).texOffs(25, 30)
						.addBox(-0.5095F, -13.1704F, 12.7668F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.425F)).texOffs(25, 30).addBox(-0.5095F, -10.0704F, 12.5668F, 1.0F, 5.0F, 3.0F, new CubeDeformation(-0.425F)),
				PartPose.offsetAndRotation(0.0F, 14.5F, 1.0F, 1.5708F, 0.0F, 0.0F));
		PartDefinition cube_r7 = windblade_right.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(25, 30).addBox(-0.5095F, -6.0704F, 12.7668F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.425F)).texOffs(14, 30).addBox(-0.5095F, 0.9296F, 13.2668F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.18F))
						.texOffs(14, 30).addBox(-0.5095F, -4.0704F, 12.2668F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).texOffs(14, 30).addBox(-0.5095F, -7.5704F, 14.7668F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.3F)).texOffs(14, 39)
						.addBox(-0.5095F, -4.0704F, 13.2668F, 1.0F, 6.0F, 2.0F, new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(0.0F, 14.6F, 1.15F, 1.5708F, 0.0F, 0.0F));
		PartDefinition leftarm = partdefinition.addOrReplaceChild("leftarm", CubeListBuilder.create().texOffs(40, 26).mirror().addBox(-0.2164F, 4.813F, -1.5238F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(4.0F, 4.0F, 0.0F, 0.4498F, 0.2368F, -0.2799F));
		PartDefinition cube_r8 = leftarm.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(40, 16).mirror().addBox(-3.5023F, 0.1804F, -3.9048F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.4835F, -1.2495F, 2.3809F, 0.0F, 0.0F, -0.1309F));
		PartDefinition windblade_left = leftarm.addOrReplaceChild("windblade_left", CubeListBuilder.create(), PartPose.offsetAndRotation(1.7741F, 10.6574F, 0.0594F, -0.2618F, 0.0F, 0.0F));
		PartDefinition cube_r9 = windblade_left.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(25, 30).mirror().addBox(-0.4905F, -16.9704F, 14.1668F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.4F)).mirror(false).texOffs(25, 30).mirror()
						.addBox(-0.4905F, -16.7704F, 13.6668F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.4F)).mirror(false).texOffs(25, 30).mirror().addBox(-0.4905F, -16.5704F, 13.4668F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.4F)).mirror(false)
						.texOffs(25, 30).mirror().addBox(-0.4905F, -16.3704F, 13.3668F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.4F)).mirror(false).texOffs(25, 30).mirror()
						.addBox(-0.4905F, -16.1704F, 13.1668F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.4F)).mirror(false).texOffs(25, 30).mirror().addBox(-0.4905F, -15.1704F, 12.9668F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.4F)).mirror(false)
						.texOffs(25, 30).mirror().addBox(-0.4905F, -14.1704F, 12.8668F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.4F)).mirror(false).texOffs(25, 30).mirror()
						.addBox(-0.4905F, -12.1704F, 12.6668F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.425F)).mirror(false).texOffs(25, 30).mirror().addBox(-0.4905F, -13.1704F, 12.7668F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.425F)).mirror(false)
						.texOffs(25, 30).mirror().addBox(-0.4905F, -10.0704F, 12.5668F, 1.0F, 5.0F, 3.0F, new CubeDeformation(-0.425F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 14.5F, 1.0F, 1.5708F, 0.0F, 0.0F));
		PartDefinition cube_r10 = windblade_left.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(25, 30).mirror().addBox(-0.4905F, -6.0704F, 12.7668F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.425F)).mirror(false).texOffs(14, 30).mirror()
						.addBox(-0.4905F, 0.9296F, 13.2668F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.18F)).mirror(false).texOffs(14, 30).mirror().addBox(-0.4905F, -4.0704F, 12.2668F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false)
						.texOffs(14, 30).mirror().addBox(-0.4905F, -7.5704F, 14.7668F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false).texOffs(14, 39).mirror()
						.addBox(-0.4905F, -4.0704F, 13.2668F, 1.0F, 6.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 14.6F, 1.15F, 1.5708F, 0.0F, 0.0F));
		PartDefinition rotation_parts = partdefinition.addOrReplaceChild("rotation_parts", CubeListBuilder.create().texOffs(0, 30).addBox(-2.6F, 7.1285F, -1.6607F, 5.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.6781F, 5.3118F, 0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r11 = rotation_parts.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 30).mirror().addBox(-2.3709F, 7.0365F, 0.0F, 5.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.1041F, -2.3607F, 0.2849F, -0.274F, -0.8249F));
		PartDefinition cube_r12 = rotation_parts.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 30).mirror().addBox(-2.3842F, 7.0275F, 0.0F, 5.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.1041F, -1.8607F, 0.0846F, -0.2013F, -0.4013F));
		PartDefinition cube_r13 = rotation_parts.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 30).mirror().addBox(-2.3619F, 7.0498F, 0.0F, 5.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.1041F, -2.3607F, 0.3655F, -0.147F, -1.2053F));
		PartDefinition cube_r14 = rotation_parts.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 30).mirror().addBox(-2.3588F, 7.0656F, 0.0F, 5.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.1041F, -2.3607F, 0.3927F, 0.0F, -1.5708F));
		PartDefinition cube_r15 = rotation_parts.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 30).addBox(-2.3619F, 7.0814F, 0.0F, 5.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.1041F, -2.3607F, 0.3655F, 0.147F, -1.9363F));
		PartDefinition cube_r16 = rotation_parts.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 30).addBox(-2.3709F, 7.0948F, 0.0F, 5.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.1041F, -2.3607F, 0.2849F, 0.274F, -2.3166F));
		PartDefinition cube_r17 = rotation_parts.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 30).addBox(-2.3842F, 7.1037F, 0.0F, 5.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.1041F, -1.8607F, 0.0846F, 0.2013F, -2.7403F));
		PartDefinition cube_r18 = rotation_parts.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 30).addBox(-2.6412F, 7.0656F, 0.0F, 5.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.1041F, -2.3607F, 0.3927F, 0.0F, 1.5708F));
		PartDefinition cube_r19 = rotation_parts.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 30).mirror().addBox(-2.6291F, 7.0948F, 0.0F, 5.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.1041F, -2.3607F, 0.2849F, -0.274F, 2.3166F));
		PartDefinition cube_r20 = rotation_parts.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(0, 30).mirror().addBox(-2.6381F, 7.0814F, 0.0F, 5.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.1041F, -2.3607F, 0.3655F, -0.147F, 1.9363F));
		PartDefinition cube_r21 = rotation_parts.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(0, 30).mirror().addBox(-2.6158F, 7.1037F, 0.0F, 5.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.1041F, -1.8607F, 0.0846F, -0.2013F, 2.7403F));
		PartDefinition cube_r22 = rotation_parts.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(0, 30).addBox(-2.6F, 0.1068F, 0.0F, 5.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -6.8959F, -1.6607F, 0.0F, 0.0F, -3.1416F));
		PartDefinition cube_r23 = rotation_parts.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(0, 30).addBox(-2.6291F, 7.0365F, 0.0F, 5.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.1041F, -2.3607F, 0.2849F, 0.274F, 0.8249F));
		PartDefinition cube_r24 = rotation_parts.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(0, 30).addBox(-2.6381F, 7.0498F, 0.0F, 5.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.1041F, -2.3607F, 0.3655F, 0.147F, 1.2053F));
		PartDefinition cube_r25 = rotation_parts.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(0, 30).addBox(-2.6158F, 7.0275F, 0.0F, 5.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.1041F, -1.8607F, 0.0846F, 0.2013F, 0.4013F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rotation_parts.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.rightarm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.rotation_parts.zRot = ageInTicks;
		this.leftarm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}
