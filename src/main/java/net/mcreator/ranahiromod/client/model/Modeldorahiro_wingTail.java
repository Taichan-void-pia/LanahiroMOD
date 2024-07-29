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

// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modeldorahiro_wingTail<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("ranahiromod", "modeldorahiro_wing_tail"), "main");
	public final ModelPart leftarm;
	public final ModelPart rightarm;
	public final ModelPart body;

	public Modeldorahiro_wingTail(ModelPart root) {
		this.leftarm = root.getChild("leftarm");
		this.rightarm = root.getChild("rightarm");
		this.body = root.getChild("body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition leftarm = partdefinition.addOrReplaceChild("leftarm", CubeListBuilder.create().texOffs(0, 48).addBox(0.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, 2.0F, 0.0F));
		PartDefinition rightarm = partdefinition.addOrReplaceChild("rightarm", CubeListBuilder.create().texOffs(0, 48).addBox(-4.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, 2.0F, 0.0F));
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 48).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition wing = body.addOrReplaceChild("wing", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition left = wing.addOrReplaceChild("left", CubeListBuilder.create().texOffs(19, 2).addBox(-0.5F, 0.0F, 0.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -22.0F, 4.5F, 0.0F, 0.7418F, 0.0F));
		PartDefinition cube_r1 = left.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(19, 2).addBox(-0.5F, -5.0F, -3.1F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, 3.5F, 0.1309F, -0.0436F, 0.0F));
		PartDefinition cube_r2 = left.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(19, 2).addBox(-0.5F, -5.0F, -0.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, 3.5F, -0.1309F, -0.0436F, 0.0F));
		PartDefinition cube_r3 = left.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(19, 2).addBox(-0.5F, 0.6472F, 3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(19, 2).addBox(-0.5F, 0.6472F, -3.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.4352F, -33.3472F, 34.4118F, 2.8362F, -0.1745F, 0.0F));
		PartDefinition cube_r4 = left.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(19, 2).addBox(0.5F, 33.0F, -33.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 3.5F, -3.0543F, -0.1745F, 0.0F));
		PartDefinition cube_r5 = left.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(19, 2).addBox(0.5F, 38.0F, -33.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 3.5F, 3.0543F, -0.1745F, 0.0F));
		PartDefinition cube_r6 = left.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(19, 2).addBox(0.5F, 14.0F, -1.3278F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.5942F, -25.6182F, 52.3278F, 0.48F, -0.1745F, -0.1309F));
		PartDefinition cube_r7 = left.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(19, 2).addBox(0.5F, 5.0F, -1.8278F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.5942F, -25.6182F, 52.3278F, 0.5236F, -0.1745F, -0.1309F));
		PartDefinition cube_r8 = left.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(19, 2).addBox(0.5F, -5.0F, -2.0278F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.5942F, -25.6182F, 52.3278F, 0.6109F, -0.1745F, -0.1745F));
		PartDefinition cube_r9 = left.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(19, 2).addBox(-1.0F, 8.6F, 47.9F, 1.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 3.5F, 0.9163F, -0.1309F, 0.0F));
		PartDefinition cube_r10 = left.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(19, 2).addBox(1.5F, 21.6F, 47.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 3.5F, 0.9163F, -0.1745F, 0.0F));
		PartDefinition cube_r11 = left.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(19, 2).addBox(9.5F, 16.6F, 47.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 3.5F, 0.9163F, -0.1745F, -0.3054F));
		PartDefinition cube_r12 = left.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(19, 2).addBox(0.5F, 17.6F, 44.9F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(19, 2).addBox(0.5F, 16.0F, 38.0F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 3.5F, 1.1345F, -0.1745F, 0.0F));
		PartDefinition cube_r13 = left.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(19, 2).addBox(0.5F, -1.0F, 33.0F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 3.5F, 0.6981F, -0.1745F, 0.0F));
		PartDefinition cube_r14 = left.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(19, 2).addBox(-0.5F, 0.2668F, -4.3967F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0756F, -18.0668F, 23.0967F, -0.2182F, -0.1309F, 0.0F));
		PartDefinition cube_r15 = left.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(19, 2).addBox(-0.5F, -0.5F, -8.5F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0756F, -18.0668F, 23.0967F, -0.0436F, -0.1309F, 0.0F));
		PartDefinition cube_r16 = left.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(19, 2).addBox(-0.7F, -3.0F, 26.0F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 3.5F, 0.6109F, -0.0873F, 0.0F));
		PartDefinition cube_r17 = left.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(19, 2).addBox(-0.5F, 15.0F, 25.0F, 1.0F, 15.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, 3.5F, 0.9163F, -0.0873F, 0.0F));
		PartDefinition cube_r18 = left.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(19, 2).addBox(-0.5F, 2.0F, 27.0F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, 3.5F, 0.7418F, -0.0873F, 0.0F));
		PartDefinition cube_r19 = left.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(19, 2).addBox(-0.5F, -9.8F, 5.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, 3.5F, 0.2182F, -0.0873F, 0.0F));
		PartDefinition cube_r20 = left.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(19, 2).addBox(-0.5F, -10.75F, 11.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, 3.5F, 0.1309F, -0.0873F, 0.0F));
		PartDefinition cube_r21 = left.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(19, 2).addBox(-0.5F, -11.0F, 6.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, 3.5F, 0.0436F, -0.0873F, 0.0F));
		PartDefinition cube_r22 = left.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(19, 2).addBox(-0.5F, -3.0F, 19.0F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, 3.5F, 0.6109F, -0.0873F, 0.0F));
		PartDefinition cube_r23 = left.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(19, 2).addBox(-0.5F, 8.4F, 14.6F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, 3.5F, 0.7418F, -0.0436F, 0.0F));
		PartDefinition cube_r24 = left.addOrReplaceChild("cube_r24",
				CubeListBuilder.create().texOffs(19, 2).addBox(-0.5F, -1.0F, 16.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 2).addBox(-0.5F, -3.0F, 12.0F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, 3.5F, 0.5672F, -0.0436F, 0.0F));
		PartDefinition cube_r25 = left.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(19, 2).addBox(-0.5F, -1.0F, 5.0F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, 3.5F, 0.6981F, -0.0436F, 0.0F));
		PartDefinition cube_r26 = left.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(19, 2).addBox(-0.5F, 4.0F, 5.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 3.5F, 0.6981F, 0.0F, 0.0F));
		PartDefinition cube_r27 = left.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(19, 2).addBox(-0.5F, -2.0F, 6.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 2)
				.addBox(-0.5F, -2.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(19, 2).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 3.5F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r28 = left.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(19, 2).addBox(-2.5F, -2.0F, -6.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, 3.5F, 0.48F, -0.7854F, 0.0F));
		PartDefinition hane = left.addOrReplaceChild("hane", CubeListBuilder.create(), PartPose.offset(1.0F, 3.0F, 3.5F));
		PartDefinition cube_r29 = hane.addOrReplaceChild("cube_r29",
				CubeListBuilder.create().texOffs(38, 43).addBox(-1.0F, 3.0F, -1.5F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 43).addBox(-1.0F, 2.8F, -2.5F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 43)
						.addBox(-1.0F, 4.4F, -0.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 43).addBox(-1.0F, 5.5F, 0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5272F, 0.0F, 0.0F));
		PartDefinition cube_r30 = hane.addOrReplaceChild("cube_r30",
				CubeListBuilder.create().texOffs(38, 43).addBox(-1.0F, -2.0F, 17.3F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(38, 43).addBox(-1.0F, -1.0F, 16.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(38, 43)
						.addBox(-1.0F, 0.0F, 14.5F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(38, 43).addBox(-1.0F, 1.0F, 13.5F, 0.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(38, 43)
						.addBox(-1.0F, 2.0F, 11.5F, 0.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(34, 42).addBox(-1.0F, 3.0F, 10.5F, 0.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1309F, -0.0436F, 0.0F));
		PartDefinition cube_r31 = hane.addOrReplaceChild("cube_r31",
				CubeListBuilder.create().texOffs(38, 43).addBox(-1.0F, 4.0F, 6.3F, 0.0F, 5.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(38, 43).addBox(-1.0F, -1.0F, 6.5F, 0.0F, 5.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6981F, -0.0436F, 0.0F));
		PartDefinition cube_r32 = hane.addOrReplaceChild("cube_r32",
				CubeListBuilder.create().texOffs(32, 38).addBox(-0.4238F, 13.5F, 0.6434F, 0.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(43, 39).addBox(-0.4238F, 7.5F, 10.7434F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(35, 38)
						.addBox(-0.4238F, 8.5F, 8.7434F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(36, 37).addBox(-0.4238F, 9.5F, 6.2434F, 0.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(35, 38)
						.addBox(-0.4238F, 10.5F, 3.2434F, 0.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(35, 38).addBox(-0.4238F, 11.5F, 2.6434F, 0.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(35, 38)
						.addBox(-0.4238F, 12.5F, 0.6434F, 0.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(35, 38).addBox(-0.4238F, 13.5F, 0.6434F, 0.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7762F, -12.9923F, 18.7566F, 0.2618F, -0.0873F, 0.0F));
		PartDefinition cube_r33 = hane
				.addOrReplaceChild(
						"cube_r33", CubeListBuilder.create().texOffs(43, 39).addBox(-0.4238F, 15.4623F, 13.2434F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 38)
								.addBox(-0.4238F, 14.4623F, 9.9434F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(35, 38).addBox(-0.4238F, 15.4623F, 9.9434F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(-1.7762F, -12.9923F, 18.7566F, 0.4363F, -0.0873F, 0.0F));
		PartDefinition cube_r34 = hane.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(34, 42).addBox(-0.4238F, 7.5F, -5.3566F, 0.0F, 5.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(39, 42)
				.addBox(-0.4238F, 2.5F, -5.3566F, 0.0F, 5.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(39, 42).addBox(-0.4238F, -2.5F, -5.3566F, 0.0F, 5.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7762F, -12.9923F, 18.7566F, 0.6981F, -0.0873F, 0.0F));
		PartDefinition cube_r35 = hane.addOrReplaceChild("cube_r35",
				CubeListBuilder.create().texOffs(38, 43).addBox(-0.3238F, 6.3923F, 36.6434F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 43).addBox(-0.3238F, 9.3923F, 36.6434F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(39, 42)
						.addBox(-0.3238F, -0.6077F, 15.7434F, 0.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(35, 39).addBox(-0.3238F, 3.3923F, 27.7434F, 0.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(35, 39)
						.addBox(-0.3238F, 3.3923F, 18.7434F, 0.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(36, 34).addBox(-0.3238F, 6.3923F, 27.6434F, 0.0F, 6.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(36, 34)
						.addBox(-0.3238F, 6.3923F, 18.6434F, 0.0F, 6.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7762F, -12.9923F, 18.7566F, 0.1745F, -0.1309F, -0.0873F));
		PartDefinition cube_r36 = hane.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(38, 43).addBox(-0.3238F, 6.3923F, 25.7434F, 0.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7762F, -12.9923F, 18.7566F, 0.4363F, -0.1309F, -0.0873F));
		PartDefinition cube_r37 = hane.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(38, 43).addBox(-0.3238F, 9.5F, 5.6434F, 0.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7762F, -12.9923F, 18.7566F, 0.9163F, -0.1309F, -0.0873F));
		PartDefinition cube_r38 = hane.addOrReplaceChild("cube_r38",
				CubeListBuilder.create().texOffs(38, 43).addBox(-0.3238F, 11.5F, 30.0434F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(39, 42).addBox(-0.3238F, 11.5F, 18.6434F, 0.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(38, 43)
						.addBox(-0.3238F, 13.5F, 22.6434F, 0.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(38, 43).addBox(-0.3238F, 8.5F, 25.6434F, 0.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(39, 42)
						.addBox(-0.3238F, 8.5F, 13.6434F, 0.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(35, 43).addBox(-0.3238F, 5.5F, 18.6434F, 0.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(39, 42)
						.addBox(-0.3238F, 5.5F, 6.6434F, 0.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(38, 43).addBox(-0.3238F, -6.5F, 25.6434F, 0.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(38, 43)
						.addBox(-0.3238F, -5.5F, 22.6434F, 0.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(38, 43).addBox(-0.3238F, -3.5F, 18.6434F, 0.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(38, 43)
						.addBox(-0.3238F, -3.5F, 12.6434F, 0.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(38, 43).addBox(-0.3238F, -3.5F, 6.6434F, 0.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7762F, -12.9923F, 18.7566F, 0.7418F, -0.1309F, -0.0873F));
		PartDefinition cube_r39 = hane.addOrReplaceChild("cube_r39",
				CubeListBuilder.create().texOffs(38, 43).addBox(-1.0F, -2.3F, 0.4F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(38, 43).addBox(-1.0F, -1.3F, 0.4F, 0.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6981F, 0.0F, 0.0F));
		PartDefinition right = wing.addOrReplaceChild("right", CubeListBuilder.create().texOffs(19, 2).mirror().addBox(-0.5F, 0.0F, 0.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.5F, -22.0F, 4.5F, 0.0F, -0.7418F, 0.0F));
		PartDefinition cube_r40 = right.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(19, 2).mirror().addBox(-0.5F, -5.0F, -3.1F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 1.0F, 3.5F, 0.1309F, 0.0436F, 0.0F));
		PartDefinition cube_r41 = right.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(19, 2).mirror().addBox(-0.5F, -5.0F, -0.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 1.0F, 3.5F, -0.1309F, 0.0436F, 0.0F));
		PartDefinition cube_r42 = right.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(19, 2).mirror().addBox(-0.5F, 0.6472F, 3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(19, 2).mirror()
				.addBox(-0.5F, 0.6472F, -3.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.4352F, -33.3472F, 34.4118F, 2.8362F, 0.1745F, 0.0F));
		PartDefinition cube_r43 = right.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(19, 2).mirror().addBox(-1.5F, 33.0F, -33.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 3.5F, -3.0543F, 0.1745F, 0.0F));
		PartDefinition cube_r44 = right.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(19, 2).mirror().addBox(-1.5F, 38.0F, -33.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 3.5F, 3.0543F, 0.1745F, 0.0F));
		PartDefinition cube_r45 = right.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(19, 2).mirror().addBox(-1.5F, 14.0F, -1.3278F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(7.5942F, -25.6182F, 52.3278F, 0.48F, 0.1745F, 0.1309F));
		PartDefinition cube_r46 = right.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(19, 2).mirror().addBox(-1.5F, 5.0F, -1.8278F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(7.5942F, -25.6182F, 52.3278F, 0.5236F, 0.1745F, 0.1309F));
		PartDefinition cube_r47 = right.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(19, 2).mirror().addBox(-1.5F, -5.0F, -2.0278F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(7.5942F, -25.6182F, 52.3278F, 0.6109F, 0.1745F, 0.1745F));
		PartDefinition cube_r48 = right.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(19, 2).mirror().addBox(0.0F, 8.6F, 47.9F, 1.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 3.5F, 0.9163F, 0.1309F, 0.0F));
		PartDefinition cube_r49 = right.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(19, 2).mirror().addBox(-2.5F, 21.6F, 47.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 3.5F, 0.9163F, 0.1745F, 0.0F));
		PartDefinition cube_r50 = right.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(19, 2).mirror().addBox(-10.5F, 16.6F, 47.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 3.5F, 0.9163F, 0.1745F, 0.3054F));
		PartDefinition cube_r51 = right.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(19, 2).mirror().addBox(-1.5F, 17.6F, 44.9F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(19, 2).mirror()
				.addBox(-1.5F, 16.0F, 38.0F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 3.5F, 1.1345F, 0.1745F, 0.0F));
		PartDefinition cube_r52 = right.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(19, 2).mirror().addBox(-1.5F, -1.0F, 33.0F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 3.5F, 0.6981F, 0.1745F, 0.0F));
		PartDefinition cube_r53 = right.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(19, 2).mirror().addBox(-0.5F, 0.2668F, -4.3967F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.0756F, -18.0668F, 23.0967F, -0.2182F, 0.1309F, 0.0F));
		PartDefinition cube_r54 = right.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(19, 2).mirror().addBox(-0.5F, -0.5F, -8.5F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.0756F, -18.0668F, 23.0967F, -0.0436F, 0.1309F, 0.0F));
		PartDefinition cube_r55 = right.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(19, 2).mirror().addBox(-0.3F, -3.0F, 26.0F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 3.5F, 0.6109F, 0.0873F, 0.0F));
		PartDefinition cube_r56 = right.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(19, 2).mirror().addBox(-0.5F, 15.0F, 25.0F, 1.0F, 15.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 1.0F, 3.5F, 0.9163F, 0.0873F, 0.0F));
		PartDefinition cube_r57 = right.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(19, 2).mirror().addBox(-0.5F, 2.0F, 27.0F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 1.0F, 3.5F, 0.7418F, 0.0873F, 0.0F));
		PartDefinition cube_r58 = right.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(19, 2).mirror().addBox(-0.5F, -9.8F, 5.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 1.0F, 3.5F, 0.2182F, 0.0873F, 0.0F));
		PartDefinition cube_r59 = right.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(19, 2).mirror().addBox(-0.5F, -10.75F, 11.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 1.0F, 3.5F, 0.1309F, 0.0873F, 0.0F));
		PartDefinition cube_r60 = right.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(19, 2).mirror().addBox(-0.5F, -11.0F, 6.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 1.0F, 3.5F, 0.0436F, 0.0873F, 0.0F));
		PartDefinition cube_r61 = right.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(19, 2).mirror().addBox(-0.5F, -3.0F, 19.0F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 1.0F, 3.5F, 0.6109F, 0.0873F, 0.0F));
		PartDefinition cube_r62 = right.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(19, 2).mirror().addBox(-0.5F, 8.4F, 14.6F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 1.0F, 3.5F, 0.7418F, 0.0436F, 0.0F));
		PartDefinition cube_r63 = right.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(19, 2).mirror().addBox(-0.5F, -1.0F, 16.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(19, 2).mirror()
				.addBox(-0.5F, -3.0F, 12.0F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.0F, 3.5F, 0.5672F, 0.0436F, 0.0F));
		PartDefinition cube_r64 = right.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(19, 2).mirror().addBox(-0.5F, -1.0F, 5.0F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 1.0F, 3.5F, 0.6981F, 0.0436F, 0.0F));
		PartDefinition cube_r65 = right.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(19, 2).mirror().addBox(-0.5F, 4.0F, 5.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 1.0F, 3.5F, 0.6981F, 0.0F, 0.0F));
		PartDefinition cube_r66 = right.addOrReplaceChild(
				"cube_r66", CubeListBuilder.create().texOffs(19, 2).mirror().addBox(-0.5F, -2.0F, 6.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(19, 2).mirror()
						.addBox(-0.5F, -2.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(19, 2).mirror().addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 1.0F, 3.5F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r67 = right.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(19, 2).mirror().addBox(1.5F, -2.0F, -6.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 1.0F, 3.5F, 0.48F, 0.7854F, 0.0F));
		PartDefinition hane2 = right.addOrReplaceChild("hane2", CubeListBuilder.create(), PartPose.offset(-1.0F, 3.0F, 3.5F));
		PartDefinition cube_r68 = hane2.addOrReplaceChild("cube_r68",
				CubeListBuilder.create().texOffs(38, 43).mirror().addBox(1.0F, 3.0F, -1.5F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(38, 43).mirror().addBox(1.0F, 2.8F, -2.5F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(38, 43).mirror().addBox(1.0F, 4.4F, -0.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(38, 43).mirror().addBox(1.0F, 5.5F, 0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5272F, 0.0F, 0.0F));
		PartDefinition cube_r69 = hane2.addOrReplaceChild("cube_r69",
				CubeListBuilder.create().texOffs(38, 43).mirror().addBox(1.0F, -2.0F, 17.3F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(38, 43).mirror().addBox(1.0F, -1.0F, 16.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(38, 43).mirror().addBox(1.0F, 0.0F, 14.5F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(38, 43).mirror().addBox(1.0F, 1.0F, 13.5F, 0.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(38, 43).mirror().addBox(1.0F, 2.0F, 11.5F, 0.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(34, 42).mirror().addBox(1.0F, 3.0F, 10.5F, 0.0F, 1.0F, 12.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1309F, 0.0436F, 0.0F));
		PartDefinition cube_r70 = hane2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(38, 43).mirror().addBox(1.0F, 4.0F, 6.3F, 0.0F, 5.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(38, 43).mirror()
				.addBox(1.0F, -1.0F, 6.5F, 0.0F, 5.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6981F, 0.0436F, 0.0F));
		PartDefinition cube_r71 = hane2.addOrReplaceChild("cube_r71",
				CubeListBuilder.create().texOffs(32, 38).mirror().addBox(0.4238F, 13.5F, 0.6434F, 0.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(43, 39).mirror()
						.addBox(0.4238F, 7.5F, 10.7434F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(35, 38).mirror().addBox(0.4238F, 8.5F, 8.7434F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(36, 37)
						.mirror().addBox(0.4238F, 9.5F, 6.2434F, 0.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(35, 38).mirror().addBox(0.4238F, 10.5F, 3.2434F, 0.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(35, 38).mirror().addBox(0.4238F, 11.5F, 2.6434F, 0.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(35, 38).mirror().addBox(0.4238F, 12.5F, 0.6434F, 0.0F, 1.0F, 12.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(35, 38).mirror().addBox(0.4238F, 13.5F, 0.6434F, 0.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.7762F, -12.9923F, 18.7566F, 0.2618F, 0.0873F, 0.0F));
		PartDefinition cube_r72 = hane2.addOrReplaceChild("cube_r72",
				CubeListBuilder.create().texOffs(43, 39).mirror().addBox(0.4238F, 15.4623F, 13.2434F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(35, 38).mirror()
						.addBox(0.4238F, 14.4623F, 9.9434F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(35, 38).mirror().addBox(0.4238F, 15.4623F, 9.9434F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.7762F, -12.9923F, 18.7566F, 0.4363F, 0.0873F, 0.0F));
		PartDefinition cube_r73 = hane2.addOrReplaceChild("cube_r73",
				CubeListBuilder.create().texOffs(34, 42).mirror().addBox(0.4238F, 7.5F, -5.3566F, 0.0F, 5.0F, 13.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(39, 42).mirror()
						.addBox(0.4238F, 2.5F, -5.3566F, 0.0F, 5.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(39, 42).mirror().addBox(0.4238F, -2.5F, -5.3566F, 0.0F, 5.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.7762F, -12.9923F, 18.7566F, 0.6981F, 0.0873F, 0.0F));
		PartDefinition cube_r74 = hane2.addOrReplaceChild("cube_r74",
				CubeListBuilder.create().texOffs(38, 43).mirror().addBox(0.3238F, 6.3923F, 36.6434F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(38, 43).mirror()
						.addBox(0.3238F, 9.3923F, 36.6434F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(39, 42).mirror().addBox(0.3238F, -0.6077F, 15.7434F, 0.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(35, 39).mirror().addBox(0.3238F, 3.3923F, 27.7434F, 0.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(35, 39).mirror().addBox(0.3238F, 3.3923F, 18.7434F, 0.0F, 3.0F, 9.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(36, 34).mirror().addBox(0.3238F, 6.3923F, 27.6434F, 0.0F, 6.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(36, 34).mirror()
						.addBox(0.3238F, 6.3923F, 18.6434F, 0.0F, 6.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.7762F, -12.9923F, 18.7566F, 0.1745F, 0.1309F, 0.0873F));
		PartDefinition cube_r75 = hane2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(38, 43).mirror().addBox(0.3238F, 6.3923F, 25.7434F, 0.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.7762F, -12.9923F, 18.7566F, 0.4363F, 0.1309F, 0.0873F));
		PartDefinition cube_r76 = hane2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(38, 43).mirror().addBox(0.3238F, 9.5F, 5.6434F, 0.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.7762F, -12.9923F, 18.7566F, 0.9163F, 0.1309F, 0.0873F));
		PartDefinition cube_r77 = hane2.addOrReplaceChild("cube_r77",
				CubeListBuilder.create().texOffs(38, 43).mirror().addBox(0.3238F, 11.5F, 30.0434F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(39, 42).mirror()
						.addBox(0.3238F, 11.5F, 18.6434F, 0.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(38, 43).mirror().addBox(0.3238F, 13.5F, 22.6434F, 0.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(38, 43)
						.mirror().addBox(0.3238F, 8.5F, 25.6434F, 0.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(39, 42).mirror().addBox(0.3238F, 8.5F, 13.6434F, 0.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(35, 43).mirror().addBox(0.3238F, 5.5F, 18.6434F, 0.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(39, 42).mirror().addBox(0.3238F, 5.5F, 6.6434F, 0.0F, 3.0F, 12.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(38, 43).mirror().addBox(0.3238F, -6.5F, 25.6434F, 0.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(38, 43).mirror()
						.addBox(0.3238F, -5.5F, 22.6434F, 0.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(38, 43).mirror().addBox(0.3238F, -3.5F, 18.6434F, 0.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(38, 43)
						.mirror().addBox(0.3238F, -3.5F, 12.6434F, 0.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(38, 43).mirror().addBox(0.3238F, -3.5F, 6.6434F, 0.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.7762F, -12.9923F, 18.7566F, 0.7418F, 0.1309F, 0.0873F));
		PartDefinition cube_r78 = hane2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(38, 43).mirror().addBox(1.0F, -2.3F, 0.4F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(38, 43).mirror()
				.addBox(1.0F, -1.3F, 0.4F, 0.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6981F, 0.0F, 0.0F));
		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r79 = tail.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(1.0F, 10.0F, 10.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5236F, -0.5236F, 0.0F));
		PartDefinition cube_r80 = tail.addOrReplaceChild("cube_r80",
				CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-2.0F, 13.0F, 5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 0).mirror().addBox(2.0F, 18.0F, 14.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 0).mirror().addBox(6.0F, 20.0F, 22.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 0).mirror().addBox(10.0F, 18.0F, 28.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0436F, -0.5236F, -0.1745F));
		PartDefinition cube_r81 = tail.addOrReplaceChild("cube_r81",
				CubeListBuilder.create().texOffs(0, 0).mirror().addBox(2.0F, 20.0F, 4.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 0).mirror().addBox(-1.0F, 14.0F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 0).mirror().addBox(5.0F, 26.0F, 10.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 0).mirror().addBox(11.0F, 27.0F, 20.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3491F, -0.5236F, -0.1745F));
		PartDefinition cube_r82 = tail.addOrReplaceChild("cube_r82",
				CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, 27.0F, 20.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-6.0F, 26.0F, 10.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.0F, 20.0F, 4.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(0.0F, 14.0F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3491F, 0.5236F, 0.1745F));
		PartDefinition cube_r83 = tail.addOrReplaceChild("cube_r83",
				CubeListBuilder.create().texOffs(0, 0).addBox(-11.0F, 18.0F, 28.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-7.0F, 20.0F, 22.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.0F, 18.0F, 14.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(1.0F, 13.0F, 5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0436F, 0.5236F, 0.1745F));
		PartDefinition cube_r84 = tail.addOrReplaceChild("cube_r84",
				CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-2.0F, 6.0F, 13.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 0).mirror().addBox(1.0F, 4.0F, 21.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 0).mirror().addBox(5.0F, 0.0F, 28.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 0).mirror().addBox(11.0F, -8.0F, 34.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.829F, -0.5236F, -0.1745F));
		PartDefinition cube_r85 = tail.addOrReplaceChild("cube_r85",
				CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -8.0F, 34.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-6.0F, 0.0F, 28.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.0F, 4.0F, 21.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(1.0F, 6.0F, 13.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.829F, 0.5236F, 0.1745F));
		PartDefinition cube_r86 = tail.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, 10.0F, 10.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5236F, 0.5236F, 0.0F));
		PartDefinition cube_r87 = tail.addOrReplaceChild("cube_r87",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 32.0F, 15.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.5F, 28.0F, 5.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5672F, 0.0F, 0.0F));
		PartDefinition cube_r88 = tail.addOrReplaceChild("cube_r88",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 20.0F, 6.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.5F, 13.0F, -1.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2618F, 0.0F, 0.0F));
		PartDefinition cube_r89 = tail.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, 12.0F, 32.0F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2182F, 0.0F, 0.0F));
		PartDefinition cube_r90 = tail.addOrReplaceChild("cube_r90",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 34.0F, 28.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.5F, 34.0F, 24.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.48F, 0.0F, 0.0F));
		PartDefinition cube_r91 = tail.addOrReplaceChild("cube_r91",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 29.0F, 25.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.0F, 27.0F, 15.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3054F, 0.0F, 0.0F));
		PartDefinition cube_r92 = tail.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, 24.0F, 14.0F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r93 = tail.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 16.0F, 19.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, 0.0F, 0.0F));
		PartDefinition cube_r94 = tail.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, 10.0F, 18.0F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5236F, 0.0F, 0.0F));
		PartDefinition cube_r95 = tail.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 10.0F, 13.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.48F, 0.0F, 0.0F));
		PartDefinition cube_r96 = tail.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, 11.0F, 6.0F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3491F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		leftarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
