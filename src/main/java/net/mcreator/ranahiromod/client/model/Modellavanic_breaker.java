package net.mcreator.ranahiromod.client.model;

import net.minecraft.world.entity.Entity;
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

// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modellavanic_breaker<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("ranahiromod", "modellavanic_breaker"), "main");
	public final ModelPart body;
	public final ModelPart body_rotate;
	public final ModelPart body_rotate2;
	public final ModelPart body_rotate3;
	public final ModelPart right_arm;
	public final ModelPart left_arm;

	public Modellavanic_breaker(ModelPart root) {
		this.body = root.getChild("body");
		this.body_rotate = root.getChild("body_rotate");
		this.body_rotate2 = root.getChild("body_rotate2");
		this.body_rotate3 = root.getChild("body_rotate3");
		this.right_arm = root.getChild("right_arm");
		this.left_arm = root.getChild("left_arm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 28).addBox(-4.0F, -60.0F, -3.0F, 8.0F, 17.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(37, 76).addBox(-2.0F, -44.0F, -2.0F, 4.0F, 14.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(64, 95)
						.addBox(-1.0F, -32.0F, -1.0F, 2.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 28).addBox(-6.0F, -58.0F, -1.0F, 12.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 89)
						.addBox(0.5F, -59.0F, 5.75F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(83, 76).addBox(-3.5F, -59.0F, 5.75F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 43.0F, 0.0F));
		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-6.5F, -7.5F, -5.25F, 13.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -50.999F, 1.6917F, -0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 14).addBox(-7.0F, -7.5F, -0.75F, 14.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -50.999F, -2.2688F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(40, 0).addBox(-4.0F, -8.5F, -3.0F, 8.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -50.999F, 2.5188F, -0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(40, 14).addBox(-4.0F, -8.5F, -3.0F, 8.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -50.999F, -2.5188F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(0, 51).addBox(-4.0F, 1.5F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(52, 34).addBox(-4.0F, -2.5F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -37.5F, -0.1464F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(28, 42).addBox(-4.0F, 3.5F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(32, 51)
				.addBox(-4.0F, -0.5F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(56, 43).addBox(-4.0F, -4.5F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -37.5F, -0.1464F, 0.0F, 0.7854F, 0.0F));
		PartDefinition body_rotate = partdefinition.addOrReplaceChild("body_rotate",
				CubeListBuilder.create().texOffs(44, 95).addBox(-2.9716F, -0.5F, -17.5315F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(67, 90).addBox(-2.9716F, -0.5F, 13.6085F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0716F, -1.1F, 0.8515F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r7 = body_rotate.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(94, 38).addBox(-2.9F, -0.38F, -0.93F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.6797F, -0.12F, 13.423F, 0.0F, -0.3927F, 0.0F));
		PartDefinition cube_r8 = body_rotate.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(90, 69).addBox(-2.9F, -0.38F, -0.93F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.4341F, -0.12F, 10.2462F, 0.0F, -0.7854F, 0.0F));
		PartDefinition cube_r9 = body_rotate.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(70, 95).addBox(-2.9F, -0.38F, -0.93F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.6108F, -0.12F, 5.4919F, 0.0F, -1.1781F, 0.0F));
		PartDefinition cube_r10 = body_rotate.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(95, 79).addBox(-2.9F, -0.38F, -0.93F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.4676F, -0.12F, 5.4919F, 0.0F, 1.1781F, 0.0F));
		PartDefinition cube_r11 = body_rotate.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(87, 90).addBox(-2.9F, -0.38F, -0.93F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.2909F, -0.12F, 10.2462F, 0.0F, 0.7854F, 0.0F));
		PartDefinition cube_r12 = body_rotate.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(95, 82).addBox(-2.9F, -0.38F, -0.93F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5365F, -0.12F, 13.423F, 0.0F, 0.3927F, 0.0F));
		PartDefinition cube_r13 = body_rotate.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(95, 85).addBox(-2.9F, -0.38F, -0.93F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5365F, -0.12F, -13.486F, 0.0F, -0.3927F, 0.0F));
		PartDefinition cube_r14 = body_rotate.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(92, 33).addBox(-2.9F, -0.38F, -2.93F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.2909F, -0.12F, -10.3092F, 0.0F, -0.7854F, 0.0F));
		PartDefinition cube_r15 = body_rotate.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(86, 95).addBox(-2.9F, -0.38F, -0.93F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.4676F, -0.12F, -5.5549F, 0.0F, -1.1781F, 0.0F));
		PartDefinition cube_r16 = body_rotate.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(92, 74).addBox(-2.9F, -0.38F, -0.93F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.5832F, -0.12F, -0.1162F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r17 = body_rotate.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(28, 93).addBox(-2.9F, -0.38F, -2.93F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.7263F, -0.12F, 0.0533F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r18 = body_rotate.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(96, 15).addBox(-2.9F, -0.38F, -0.93F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.6108F, -0.12F, -5.5549F, 0.0F, 1.1781F, 0.0F));
		PartDefinition cube_r19 = body_rotate.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(12, 94).addBox(-2.9F, -0.38F, -2.93F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.4341F, -0.12F, -10.3092F, 0.0F, 0.7854F, 0.0F));
		PartDefinition cube_r20 = body_rotate.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(98, 0).addBox(-2.9F, -0.38F, -0.93F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.6797F, -0.12F, -13.486F, 0.0F, 0.3927F, 0.0F));
		PartDefinition body_rotate2 = partdefinition.addOrReplaceChild("body_rotate2",
				CubeListBuilder.create().texOffs(47, 90).addBox(-2.9716F, -0.5F, -17.5315F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(76, 34).addBox(-2.9716F, -0.5F, 13.6085F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0716F, 3.9F, 0.8515F, 0.4215F, 0.3614F, 0.1572F));
		PartDefinition cube_r21 = body_rotate2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(89, 61).addBox(-2.9F, -0.38F, -0.93F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.6797F, -0.12F, -13.486F, 0.0F, 0.3927F, 0.0F));
		PartDefinition cube_r22 = body_rotate2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(89, 56).addBox(-2.9F, -0.38F, -2.93F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.4341F, -0.12F, -10.3092F, 0.0F, 0.7854F, 0.0F));
		PartDefinition cube_r23 = body_rotate2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(72, 52).addBox(-2.9F, -0.38F, -0.93F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.6108F, -0.12F, -5.5549F, 0.0F, 1.1781F, 0.0F));
		PartDefinition cube_r24 = body_rotate2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(86, 28).addBox(-2.9F, -0.38F, -0.93F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.5832F, -0.12F, -0.1162F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r25 = body_rotate2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(12, 89).addBox(-2.9F, -0.38F, -2.93F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.7263F, -0.12F, 0.0533F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r26 = body_rotate2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(62, 3).addBox(-2.9F, -0.38F, -0.93F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.4676F, -0.12F, -5.5549F, 0.0F, -1.1781F, 0.0F));
		PartDefinition cube_r27 = body_rotate2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(86, 10).addBox(-2.9F, -0.38F, -2.93F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.2909F, -0.12F, -10.3092F, 0.0F, -0.7854F, 0.0F));
		PartDefinition cube_r28 = body_rotate2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(62, 0).addBox(-2.9F, -0.38F, -0.93F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5365F, -0.12F, -13.486F, 0.0F, -0.3927F, 0.0F));
		PartDefinition cube_r29 = body_rotate2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(37, 60).addBox(-2.9F, -0.38F, -0.93F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5365F, -0.12F, 13.423F, 0.0F, 0.3927F, 0.0F));
		PartDefinition cube_r30 = body_rotate2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(84, 64).addBox(-2.9F, -0.38F, -0.93F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.2909F, -0.12F, 10.2462F, 0.0F, 0.7854F, 0.0F));
		PartDefinition cube_r31 = body_rotate2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(56, 52).addBox(-2.9F, -0.38F, -0.93F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.4676F, -0.12F, 5.4919F, 0.0F, 1.1781F, 0.0F));
		PartDefinition cube_r32 = body_rotate2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(24, 54).addBox(-2.9F, -0.38F, -0.93F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.6108F, -0.12F, 5.4919F, 0.0F, -1.1781F, 0.0F));
		PartDefinition cube_r33 = body_rotate2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(84, 51).addBox(-2.9F, -0.38F, -0.93F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.4341F, -0.12F, 10.2462F, 0.0F, -0.7854F, 0.0F));
		PartDefinition cube_r34 = body_rotate2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(24, 51).addBox(-2.9F, -0.38F, -0.93F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.6797F, -0.12F, 13.423F, 0.0F, -0.3927F, 0.0F));
		PartDefinition body_rotate3 = partdefinition
				.addOrReplaceChild(
						"body_rotate3", CubeListBuilder.create().texOffs(100, 48).addBox(7.0F, -4.5F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 100).addBox(7.0F, -0.5F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.5F))
								.texOffs(102, 95).addBox(-9.0F, -4.5F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(102, 25).addBox(-9.0F, -0.5F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.5F)),
						PartPose.offset(0.0F, 15.5F, -0.5F));
		PartDefinition cube_r35 = body_rotate3.addOrReplaceChild("cube_r35",
				CubeListBuilder.create().texOffs(0, 51).addBox(7.0F, -0.5F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.5F)).texOffs(28, 42).addBox(7.0F, -4.5F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(70, 98)
						.addBox(-9.0F, -0.5F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.5F)).texOffs(38, 98).addBox(-9.0F, -4.5F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));
		PartDefinition cube_r36 = body_rotate3.addOrReplaceChild("cube_r36",
				CubeListBuilder.create().texOffs(86, 98).addBox(7.0F, -0.5F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.5F)).texOffs(78, 98).addBox(7.0F, -4.5F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 99)
						.addBox(-9.0F, -0.5F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.5F)).texOffs(94, 98).addBox(-9.0F, -4.5F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r37 = body_rotate3.addOrReplaceChild("cube_r37",
				CubeListBuilder.create().texOffs(20, 99).addBox(7.0F, -0.5F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.5F)).texOffs(99, 18).addBox(7.0F, -4.5F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(46, 100)
						.addBox(-9.0F, -0.5F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.5F)).texOffs(100, 41).addBox(-9.0F, -4.5F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));
		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.offset(-11.963F, -11.1997F, -0.5F));
		PartDefinition cube_r38 = right_arm.addOrReplaceChild("cube_r38",
				CubeListBuilder.create().texOffs(42, 63).addBox(-1.0014F, -10.0F, -0.25F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.25F)).texOffs(0, 60).addBox(-6.0014F, 1.5F, 0.0F, 11.0F, 18.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(17, 76)
						.addBox(-2.5014F, -5.5F, -2.25F, 5.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(98, 3).addBox(-1.5014F, -8.5F, -0.75F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5356F, 6.5358F, -9.2453F, -1.2412F, 0.4423F, -1.2358F));
		PartDefinition cube_r39 = right_arm.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(0, 78).addBox(-0.0799F, -5.6591F, -1.4429F, 5.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5356F, 6.5358F, -9.2453F, -1.2681F, 0.1933F, -1.3213F));
		PartDefinition cube_r40 = right_arm.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(83, 17).addBox(-4.912F, -5.6291F, -1.4429F, 5.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5356F, 6.5358F, -9.2453F, -1.1826F, 0.6877F, -1.1272F));
		PartDefinition cube_r41 = right_arm.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(60, 64).addBox(0.0F, 2.5F, -1.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(66, 64)
				.addBox(-2.5F, -2.5F, -2.5F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(42, 64).addBox(-3.5F, -3.5F, -3.5F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.0F, 0.0F, 0.0F, 0.3927F, 0.3927F));
		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.offset(11.963F, -11.1997F, -0.5F));
		PartDefinition cube_r42 = left_arm.addOrReplaceChild("cube_r42",
				CubeListBuilder.create().texOffs(56, 28).addBox(-1.0205F, -5.1225F, -0.5831F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.25F)).texOffs(80, 0).addBox(-3.7705F, 1.6275F, 1.1669F, 7.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
						.texOffs(59, 55).addBox(-5.2705F, 4.1275F, -2.8331F, 10.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(82, 41).addBox(-3.7705F, 1.6275F, -3.5831F, 7.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(30, 98)
						.addBox(3.2295F, 2.1275F, -4.5831F, 2.0F, 7.0F, 2.0F, new CubeDeformation(-0.25F)).texOffs(56, 55).addBox(2.4795F, 3.1275F, -4.5831F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(51, 61)
						.addBox(2.4795F, 5.6275F, -4.5831F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(34, 0).addBox(3.2295F, 7.3775F, -4.5831F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 14)
						.addBox(1.2295F, 8.3775F, -1.5831F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(1.2295F, 8.3775F, 0.4169F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 28)
						.addBox(-3.7705F, 8.3775F, 0.4169F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 28).addBox(-3.7705F, 8.3775F, -1.5831F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 60)
						.addBox(-2.7705F, -1.6225F, -2.5831F, 5.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(52, 43).addBox(-1.7705F, -3.6225F, -1.0831F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.1453F, 4.4435F, -4.8606F, -1.1979F, 0.342F, 0.0554F));
		PartDefinition cube_r43 = left_arm.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(51, 76).addBox(-3.9203F, -0.8774F, -1.776F, 5.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.1453F, 4.4435F, -4.8606F, -1.1469F, 0.5836F, 0.1686F));
		PartDefinition cube_r44 = left_arm.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(67, 76).addBox(-1.613F, -0.9882F, -1.776F, 5.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.1453F, 4.4435F, -4.8606F, -1.2187F, 0.097F, -0.0395F));
		PartDefinition cube_r45 = left_arm.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(34, 14).addBox(-1.0F, 2.5F, -1.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(62, 8)
				.addBox(-3.5F, -2.5F, -2.5F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(62, 22).addBox(-2.5F, -3.5F, -3.5F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.0F, 0.0F, 0.0F, -0.3927F, -0.3927F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body_rotate.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body_rotate2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body_rotate3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.body_rotate.yRot = ageInTicks / 20.f;
		this.body_rotate3.yRot = ageInTicks / 20.f;
		this.body_rotate2.yRot = ageInTicks;
		this.body.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.body.xRot = headPitch / (180F / (float) Math.PI);
	}
}
