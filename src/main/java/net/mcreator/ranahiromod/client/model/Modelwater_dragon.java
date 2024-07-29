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
public class Modelwater_dragon<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("ranahiromod", "modelwater_dragon"), "main");
	public final ModelPart left_leg;
	public final ModelPart right_leg;
	public final ModelPart left_arm;
	public final ModelPart right_arm;
	public final ModelPart left_wing;
	public final ModelPart right_wing;
	public final ModelPart body;
	public final ModelPart head;

	public Modelwater_dragon(ModelPart root) {
		this.left_leg = root.getChild("left_leg");
		this.right_leg = root.getChild("right_leg");
		this.left_arm = root.getChild("left_arm");
		this.right_arm = root.getChild("right_arm");
		this.left_wing = root.getChild("left_wing");
		this.right_wing = root.getChild("right_wing");
		this.body = root.getChild("body");
		this.head = root.getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.offset(8.6F, 23.6159F, 26.072F));
		PartDefinition cube_r70 = left_leg.addOrReplaceChild("cube_r70",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.425F, 6.975F, -25.6F, 1.0F, 4.0F, 12.0F, new CubeDeformation(-0.25F)).texOffs(0, 0).addBox(-1.7F, 8.05F, -21.775F, 3.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.975F, 7.625F, -25.6F, 1.0F, 4.0F, 12.0F, new CubeDeformation(-0.25F)).texOffs(0, 0).addBox(-6.25F, 8.7F, -21.775F, 3.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(4.125F, 7.625F, -25.6F, 1.0F, 4.0F, 12.0F, new CubeDeformation(-0.25F)).texOffs(0, 0).addBox(2.85F, 8.7F, -21.775F, 3.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.45F, 9.35F, -11.05F, 9.0F, 3.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-2.75F, -10.25F, -5.85F, 6.0F, 20.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.2654F, 0.0F, 0.0F));
		PartDefinition cube_r71 = left_leg.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(0, 0).addBox(-3.15F, 24.55F, 37.7F, 9.0F, 19.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.3F, -5.2409F, -68.3221F, 0.6981F, 0.0F, 0.0F));
		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.offset(-7.0F, 18.375F, -42.25F));
		PartDefinition cube_r68 = right_leg.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-5.75F, 24.55F, 37.7F, 9.0F, 19.0F, 14.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6981F, 0.0F, 0.0F));
		PartDefinition cube_r69 = right_leg.addOrReplaceChild("cube_r69",
				CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-6.25F, 8.7F, -21.775F, 3.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 0).mirror()
						.addBox(-4.975F, 7.625F, -25.6F, 1.0F, 4.0F, 12.0F, new CubeDeformation(-0.25F)).mirror(false).texOffs(0, 0).mirror().addBox(2.85F, 8.7F, -21.775F, 3.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 0)
						.mirror().addBox(4.125F, 7.625F, -25.6F, 1.0F, 4.0F, 12.0F, new CubeDeformation(-0.25F)).mirror(false).texOffs(0, 0).mirror().addBox(-1.7F, 8.05F, -21.775F, 3.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 0).mirror().addBox(-0.425F, 6.975F, -25.6F, 1.0F, 4.0F, 12.0F, new CubeDeformation(-0.25F)).mirror(false).texOffs(0, 0).mirror().addBox(-4.45F, 9.35F, -11.05F, 9.0F, 3.0F, 16.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 0).mirror().addBox(-3.75F, -10.25F, -5.85F, 7.0F, 20.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.3F, 5.2409F, 68.3221F, 1.2654F, 0.0F, 0.0F));
		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.offset(7.3F, 18.375F, -13.65F));
		PartDefinition cube_r64 = left_arm.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(0, 0).addBox(-3.75F, -9.75F, -3.9F, 7.0F, 13.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6981F, 0.0F, 0.0F));
		PartDefinition cube_r65 = left_arm.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(0, 0).addBox(-2.05F, -6.4F, -3.9F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.0092F, 0.5975F, 0.3054F, 0.0F, 0.0F));
		PartDefinition cube_r66 = left_arm.addOrReplaceChild("cube_r66",
				CubeListBuilder.create().texOffs(0, 0).addBox(6.375F, 5.4333F, 0.6167F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.25F)).texOffs(0, 0).addBox(5.45F, 2.2583F, 1.1917F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(9.625F, 5.7583F, 1.2667F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.25F)).texOffs(0, 0).addBox(8.7F, 2.5833F, 1.8417F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(3.125F, 5.7583F, 1.2667F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.25F)).texOffs(0, 0).addBox(2.2F, 2.5833F, 1.8417F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.15F, 12.7348F, -6.6779F, 1.0908F, 0.0F, 0.0F));
		PartDefinition cube_r67 = left_arm.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(0, 0).addBox(-3.75F, -3.7F, -2.6F, 7.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 10.8985F, -1.2594F, -0.9163F, 0.0F, 0.0F));
		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.offset(-7.0F, 18.375F, -13.65F));
		PartDefinition cube_r60 = right_arm.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(0, 0).addBox(-3.75F, -9.75F, -3.9F, 7.0F, 13.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6981F, 0.0F, 0.0F));
		PartDefinition cube_r61 = right_arm.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(0, 0).addBox(-2.05F, -6.4F, -3.9F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.0092F, 0.5975F, 0.3054F, 0.0F, 0.0F));
		PartDefinition cube_r62 = right_arm.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(0, 0).addBox(-3.75F, -3.7F, -2.6F, 7.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 10.8985F, -1.2594F, -0.9163F, 0.0F, 0.0F));
		PartDefinition cube_r63 = right_arm.addOrReplaceChild("cube_r63",
				CubeListBuilder.create().texOffs(0, 0).addBox(-12.1F, 2.5833F, 1.8417F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-11.175F, 5.7583F, 1.2667F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.25F)).texOffs(0, 0)
						.addBox(-5.6F, 2.5833F, 1.8417F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-4.675F, 5.7583F, 1.2667F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.25F)).texOffs(0, 0)
						.addBox(-8.85F, 2.2583F, 1.1917F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-7.925F, 5.4333F, 0.6167F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(7.15F, 12.7348F, -6.6779F, 1.0908F, 0.0F, 0.0F));
		PartDefinition left_wing = partdefinition.addOrReplaceChild("left_wing", CubeListBuilder.create(), PartPose.offset(9.8639F, 2.7076F, -4.6994F));
		PartDefinition cube_r51 = left_wing.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(0, 0).addBox(-11.0F, -7.5F, -2.5F, 22.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0786F, 0.3405F, -0.5371F));
		PartDefinition cube_r52 = left_wing.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(0, 0).addBox(-22.0F, -8.5F, -2.5F, 13.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(17.7629F, -22.679F, -8.6481F, -0.2519F, 0.2443F, -1.1219F));
		PartDefinition cube_r53 = left_wing.addOrReplaceChild("cube_r53",
				CubeListBuilder.create().texOffs(2, 67).addBox(-28.2826F, 1.4286F, 0.081F, 4.0F, 2.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(2, 67).addBox(-24.2826F, 1.4286F, 0.081F, 4.0F, 2.0F, 24.0F, new CubeDeformation(0.0F)).texOffs(2, 67)
						.addBox(-37.2826F, 0.4286F, -11.919F, 34.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-37.2826F, -2.5714F, -16.919F, 34.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(61.2364F, -35.3112F, -8.4599F, 0.0F, 0.2618F, -0.3054F));
		PartDefinition cube_r54 = left_wing.addOrReplaceChild("cube_r54",
				CubeListBuilder.create().texOffs(2, 67).addBox(-11.6749F, 1.4286F, 4.3541F, 6.0F, 1.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(2, 67).addBox(-5.6749F, 1.4286F, 4.3541F, 2.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(2, 67)
						.addBox(-18.6749F, 0.4286F, -7.6459F, 32.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-18.6749F, -2.5714F, -12.6459F, 32.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(61.2364F, -35.3112F, -8.4599F, 0.0F, 0.0F, -0.3054F));
		PartDefinition cube_r55 = left_wing.addOrReplaceChild("cube_r55",
				CubeListBuilder.create().texOffs(0, 0).mirror().addBox(28.3954F, 0.4286F, -1.2902F, 3.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(2, 67).mirror()
						.addBox(37.3954F, 0.4286F, -1.2902F, 3.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(2, 67).mirror().addBox(40.3954F, 0.4286F, -1.2902F, 4.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(2, 67).mirror().addBox(44.3954F, 0.4286F, -1.2902F, 6.0F, 1.0F, 16.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(2, 67).mirror()
						.addBox(20.3954F, -0.5714F, -9.2902F, 32.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 0).mirror().addBox(20.3954F, -2.5714F, -14.2902F, 32.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(61.2364F, -35.3112F, -8.4599F, 0.0F, -0.3491F, -0.3054F));
		PartDefinition cube_r56 = left_wing.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(2, 67).mirror().addBox(39.6738F, -0.5714F, -18.3439F, 20.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 0).mirror()
				.addBox(39.6738F, -2.5714F, -23.3439F, 23.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(61.2364F, -35.3112F, -8.4599F, 0.0F, -0.5672F, -0.3054F));
		PartDefinition cube_r57 = left_wing.addOrReplaceChild("cube_r57",
				CubeListBuilder.create().texOffs(2, 67).addBox(-9.0F, -1.0F, 5.2F, 5.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(2, 67).addBox(4.0F, -1.0F, 10.2F, 5.0F, 2.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(2, 67)
						.addBox(2.0F, -1.0F, -14.8F, 9.0F, 2.0F, 25.0F, new CubeDeformation(0.0F)).texOffs(2, 67).addBox(-11.0F, -1.0F, -14.8F, 9.0F, 2.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(2, 67)
						.addBox(-13.0F, -1.0F, -32.8F, 26.0F, 2.0F, 18.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(68.6317F, -37.1936F, 14.9029F, 0.0F, -0.3491F, -0.3054F));
		PartDefinition cube_r58 = left_wing.addOrReplaceChild("cube_r58",
				CubeListBuilder.create().texOffs(2, 67).addBox(-53.0646F, -0.5714F, 36.8611F, 5.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(2, 67).addBox(-55.0646F, -0.5714F, 16.8611F, 9.0F, 2.0F, 20.0F, new CubeDeformation(0.0F))
						.texOffs(2, 67).addBox(-40.0646F, -0.5714F, 41.8611F, 5.0F, 2.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(2, 67).addBox(-42.0646F, -0.5714F, 16.8611F, 9.0F, 2.0F, 25.0F, new CubeDeformation(0.0F)).texOffs(2, 67)
						.addBox(-57.0646F, -0.5714F, -15.1389F, 26.0F, 2.0F, 32.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-59.0646F, -2.5714F, -20.1389F, 34.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(61.2364F, -35.3112F, -8.4599F, 0.0F, 0.3491F, -0.3054F));
		PartDefinition cube_r59 = left_wing.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-1.8352F, -2.5714F, -12.4931F, 36.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(61.2364F, -35.3112F, -8.4599F, 0.0F, -0.2618F, -0.3054F));
		PartDefinition right_wing = partdefinition.addOrReplaceChild("right_wing", CubeListBuilder.create(), PartPose.offset(-71.1003F, -32.6036F, -13.1593F));
		PartDefinition cube_r42 = right_wing.addOrReplaceChild("cube_r42",
				CubeListBuilder.create().texOffs(0, 0).addBox(-62.6738F, -2.5714F, -23.3439F, 23.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(2, 67).addBox(-59.6738F, -0.5714F, -18.3439F, 20.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.5672F, 0.3054F));
		PartDefinition cube_r43 = right_wing.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(0, 0).addBox(-34.1648F, -2.5714F, -12.4931F, 36.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2618F, 0.3054F));
		PartDefinition cube_r44 = right_wing.addOrReplaceChild("cube_r44",
				CubeListBuilder.create().texOffs(0, 0).addBox(-52.3954F, -2.5714F, -14.2902F, 32.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(2, 67).addBox(-52.3954F, -0.5714F, -9.2902F, 32.0F, 2.0F, 8.0F, new CubeDeformation(0.0F))
						.texOffs(2, 67).addBox(-50.3954F, 0.4286F, -1.2902F, 6.0F, 1.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(2, 67).addBox(-44.3954F, 0.4286F, -1.2902F, 4.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(2, 67)
						.addBox(-40.3954F, 0.4286F, -1.2902F, 3.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(2, 67).addBox(-31.3954F, 0.4286F, -1.2902F, 3.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3491F, 0.3054F));
		PartDefinition cube_r45 = right_wing.addOrReplaceChild("cube_r45",
				CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-13.3251F, -2.5714F, -12.6459F, 32.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(2, 67).mirror()
						.addBox(-13.3251F, 0.4286F, -7.6459F, 32.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(2, 67).mirror().addBox(3.6749F, 1.4286F, 4.3541F, 2.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(2, 67).mirror().addBox(5.6749F, 1.4286F, 4.3541F, 6.0F, 1.0F, 16.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3054F));
		PartDefinition cube_r46 = right_wing.addOrReplaceChild("cube_r46",
				CubeListBuilder.create().texOffs(0, 0).mirror().addBox(25.0646F, -2.5714F, -20.1389F, 34.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(2, 67).mirror()
						.addBox(31.0646F, -0.5714F, -15.1389F, 26.0F, 2.0F, 32.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(2, 67).mirror().addBox(33.0646F, -0.5714F, 16.8611F, 9.0F, 2.0F, 25.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(2, 67).mirror().addBox(35.0646F, -0.5714F, 41.8611F, 5.0F, 2.0F, 17.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(2, 67).mirror()
						.addBox(46.0646F, -0.5714F, 16.8611F, 9.0F, 2.0F, 20.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(2, 67).mirror().addBox(48.0646F, -0.5714F, 36.8611F, 5.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3491F, 0.3054F));
		PartDefinition cube_r47 = right_wing.addOrReplaceChild("cube_r47",
				CubeListBuilder.create().texOffs(0, 0).mirror().addBox(3.2826F, -2.5714F, -16.919F, 34.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(2, 67).mirror()
						.addBox(3.2826F, 0.4286F, -11.919F, 34.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(2, 67).mirror().addBox(20.2826F, 1.4286F, 0.081F, 4.0F, 2.0F, 24.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(2, 67).mirror().addBox(24.2826F, 1.4286F, 0.081F, 4.0F, 2.0F, 20.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, 0.3054F));
		PartDefinition cube_r48 = right_wing.addOrReplaceChild("cube_r48",
				CubeListBuilder.create().texOffs(2, 67).mirror().addBox(-13.0F, -1.0F, -32.8F, 26.0F, 2.0F, 18.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(2, 67).mirror()
						.addBox(2.0F, -1.0F, -14.8F, 9.0F, 2.0F, 20.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(2, 67).mirror().addBox(-11.0F, -1.0F, -14.8F, 9.0F, 2.0F, 25.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(2, 67).mirror()
						.addBox(-9.0F, -1.0F, 10.2F, 5.0F, 2.0F, 17.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(2, 67).mirror().addBox(4.0F, -1.0F, 5.2F, 5.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-7.3953F, -1.8824F, 23.3628F, 0.0F, 0.3491F, 0.3054F));
		PartDefinition cube_r49 = right_wing.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(9.0F, -8.5F, -2.5F, 13.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(43.4735F, 12.6322F, -0.1882F, -0.2519F, -0.2443F, 1.1219F));
		PartDefinition cube_r50 = right_wing.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-11.0F, -7.5F, -2.5F, 22.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(61.2364F, 35.3112F, 8.4599F, -0.0786F, -0.3405F, 0.5371F));
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(2, 0).addBox(-6.85F, 0.6682F, -124.7624F, 14.0F, 14.0F, 48.0F, new CubeDeformation(0.0F)).texOffs(2, 0).addBox(-11.95F, -4.0318F, -116.9624F, 23.0F, 20.0F, 38.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.8F, -2.1432F, 99.4123F));
		PartDefinition cube_r13 = body.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(3, 98).addBox(-2.05F, 3.3991F, 11.6836F, 4.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-2.05F, 0.6991F, -1.3164F, 4.0F, 8.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.7F, -2.1009F, -1.3164F, 3.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(3, 98).addBox(-0.35F, -4.7009F, -1.3164F, 1.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5236F, 0.0F, 0.0F));
		PartDefinition cube_r14 = body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 0).addBox(-3.75F, -4.45F, -6.5F, 7.0F, 9.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-1.7F, -7.55F, -6.5F, 3.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(3, 98).addBox(-0.35F, -10.15F, -6.5F, 1.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.5595F, -25.7696F, 0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r15 = body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 0).addBox(-3.75F, 0.3167F, -6.5F, 7.0F, 9.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-1.7F, -2.7833F, -6.5F, 3.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(3, 98).addBox(-0.35F, -5.3833F, -6.5F, 1.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.091F, -14.785F, -0.0436F, 0.0F, 0.0F));
		PartDefinition cube_r16 = body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 0).addBox(-3.75F, 0.9991F, -11.6836F, 7.0F, 9.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-1.7F, -2.1009F, -11.6836F, 3.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(3, 98).addBox(-0.35F, -4.7009F, -11.6836F, 1.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2618F, 0.0F, 0.0F));
		PartDefinition cube_r17 = body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(3, 98).addBox(-0.35F, -5.3833F, -6.5F, 1.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-1.7F, -2.7833F, -6.5F, 3.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-3.75F, 0.3167F, -6.5F, 7.0F, 9.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 4.5777F, -37.4682F, -0.0436F, 0.0F, 0.0F));
		PartDefinition cube_r18 = body.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(3, 98).addBox(-0.35F, -5.3833F, -6.5F, 1.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-1.7F, -2.7833F, -6.5F, 3.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-3.75F, 0.3167F, -6.5F, 7.0F, 9.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.762F, -47.7659F, -0.3054F, 0.0F, 0.0F));
		PartDefinition cube_r19 = body.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(3, 98).addBox(-0.35F, -5.3833F, -6.5F, 1.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-1.7F, -2.7833F, -6.5F, 3.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-3.75F, 0.3167F, -6.5F, 7.0F, 9.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.7497F, -59.1778F, -0.0436F, 0.0F, 0.0F));
		PartDefinition cube_r20 = body.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(3, 98).addBox(-0.35F, -10.15F, -6.5F, 1.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-1.7F, -7.55F, -6.5F, 3.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-3.75F, -4.45F, -6.5F, 7.0F, 9.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.2182F, -70.1624F, 0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r21 = body.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(0, 0).addBox(-1.7F, -0.9131F, -4.4274F, 3.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-0.35F, -1.8131F, -4.4274F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.425F, -2.8881F, -2.4024F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(0.0F, -3.4003F, -84.4765F, -0.0436F, 0.0F, 0.0F));
		PartDefinition cube_r22 = body.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(0, 0).addBox(-2.05F, 0.2938F, -5.3525F, 4.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.4003F, -84.4765F, 0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r23 = body.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(0, 0).addBox(-1.7F, -0.9131F, -4.4274F, 3.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-0.35F, -1.8131F, -4.4274F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.425F, -2.8881F, -2.4024F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(0.0F, -3.4003F, -93.5765F, -0.0436F, 0.0F, 0.0F));
		PartDefinition cube_r24 = body.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(0, 0).addBox(-2.05F, 0.2938F, -5.3525F, 4.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.4003F, -93.5765F, 0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r25 = body.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(0, 0).addBox(-1.7F, -0.9131F, -4.4274F, 3.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-0.35F, -1.8131F, -4.4274F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.425F, -2.8881F, -2.4024F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(0.0F, -3.4003F, -102.6765F, -0.0436F, 0.0F, 0.0F));
		PartDefinition cube_r26 = body.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(0, 0).addBox(-2.05F, 0.2938F, -5.3525F, 4.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.4003F, -102.6765F, 0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r27 = body.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(0, 0).addBox(-1.7F, -0.9131F, -4.4274F, 3.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-0.35F, -1.8131F, -4.4274F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.425F, -2.8881F, -2.4024F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(0.0F, -3.4003F, -111.7765F, -0.0436F, 0.0F, 0.0F));
		PartDefinition cube_r28 = body.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(0, 0).addBox(-2.05F, 0.2938F, -5.3525F, 4.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.4003F, -111.7765F, 0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r29 = body.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(0, 0).addBox(-1.7F, -0.9131F, -4.4274F, 3.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-0.35F, -1.8131F, -4.4274F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.425F, -2.8881F, -2.4024F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(0.0F, 0.4997F, -119.5765F, -0.0436F, 0.0F, 0.0F));
		PartDefinition cube_r30 = body.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(0, 0).addBox(-2.05F, 0.2938F, -5.3525F, 4.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.4997F, -119.5765F, 0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r31 = body.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(0, 0).addBox(-4.05F, 0.2938F, -5.3525F, 9.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.6997F, -128.6765F, 0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r32 = body.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(0, 0).addBox(-3.7F, -0.9131F, -5.4274F, 8.0F, 7.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-0.35F, -1.8131F, -4.4274F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.425F, -2.8881F, -2.4024F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(0.0F, 5.6997F, -128.6765F, -0.0436F, 0.0F, 0.0F));
		PartDefinition cube_r33 = body.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(0, 0).addBox(-4.05F, 0.2938F, -5.3525F, 9.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 4.3997F, -137.7765F, 0.0873F, 0.0F, 0.0F));
		PartDefinition cube_r34 = body.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(0, 0).addBox(-3.7F, -0.9131F, -5.4274F, 8.0F, 7.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-0.35F, -1.8131F, -4.4274F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.425F, -2.8881F, -2.4024F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(0.0F, 4.3997F, -137.7765F, -0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r35 = body.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(0, 0).addBox(-4.05F, 0.2938F, -5.3525F, 9.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.7997F, -146.8765F, 0.2618F, 0.0F, 0.0F));
		PartDefinition cube_r36 = body.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(0, 0).addBox(-3.7F, -0.9131F, -5.4274F, 8.0F, 7.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-0.35F, -1.8131F, -4.4274F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.425F, -2.8881F, -2.4024F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(0.0F, 1.7997F, -146.8765F, -0.2182F, 0.0F, 0.0F));
		PartDefinition cube_r37 = body.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(0, 0).addBox(-4.05F, 0.2938F, -5.3525F, 9.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.1497F, -155.9765F, 0.5236F, 0.0F, 0.0F));
		PartDefinition cube_r38 = body.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(0, 0).addBox(-3.7F, -0.9131F, -5.4274F, 8.0F, 7.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-0.35F, -1.8131F, -4.4274F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.425F, -2.8881F, -2.4024F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(0.0F, 1.1497F, -155.9765F, 0.0436F, 0.0F, 0.0F));
		PartDefinition cube_r39 = body.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(0, 0).addBox(0.87F, 3.696F, 0.196F, 1.0F, 4.0F, 8.0F, new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(-1.3F, -2.0888F, -170.9124F, 0.3491F, 0.0F, 0.0F));
		PartDefinition cube_r40 = body.addOrReplaceChild("cube_r40",
				CubeListBuilder.create().texOffs(0, 0).addBox(0.95F, 2.25F, 0.65F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-2.4F, 3.15F, 0.65F, 8.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.3F, 1.0182F, -170.9124F, 0.3491F, 0.0F, 0.0F));
		PartDefinition cube_r41 = body.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(0, 0).addBox(-4.7F, 5.45F, -1.95F, 9.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.65F, 2.1248F, -170.8518F, 0.829F, 0.0F, 0.0F));
		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(-0.5F, -4.232F, -71.5F));
		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.012F, 10.832F, -22.724F, 4.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 0).mirror().addBox(0.94F, 10.832F, -22.724F, 4.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 0).mirror().addBox(-0.084F, 10.832F, -14.82F, 7.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 0).addBox(-6.012F, 10.832F, -14.82F, 7.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.mirror().addBox(-0.084F, 11.82F, -6.916F, 7.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 0).addBox(-6.012F, 11.82F, -6.916F, 7.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-7.012F, 0.844F, -6.916F, 8.0F, 12.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 0).mirror().addBox(0.892F, 0.844F, -6.916F, 8.0F, 12.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3491F, 0.0F, 0.0F));
		PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, 2.928F, -4.94F, 4.0F, 3.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 0).mirror().addBox(-0.048F, 2.928F, -4.94F, 4.0F, 3.0F, 16.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.988F, 10.8302F, -18.5879F, 0.5236F, 0.0F, 0.0F));
		PartDefinition cube_r3 = head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-1.036F, -2.012F, -14.82F, 4.0F, 3.0F, 16.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 0).addBox(-4.988F, -2.012F,
				-14.82F, 4.0F, 3.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.976F, 1.482F, 0.0F, 0.3491F, 0.0F, 0.0F));
		PartDefinition cube_r4 = head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-1.036F, -0.036F, -7.904F, 4.0F, 3.0F, 16.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 0).addBox(-4.988F, -0.036F,
				-7.904F, 4.0F, 3.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.976F, 12.3122F, -18.5879F, 0.8727F, 0.0F, 0.0F));
		PartDefinition cube_r5 = head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(96, 0).mirror().addBox(-3.3505F, -3.0009F, -3.952F, 8.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.5295F, 10.8121F, -12.5643F, 0.883F, 0.0013F, 1.1111F));
		PartDefinition cube_r6 = head.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(84, 97).mirror().addBox(-2.2562F, -2.3329F, 4.3472F, 4.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 0).mirror()
				.addBox(-3.2802F, -2.3329F, -15.4128F, 7.0F, 3.0F, 20.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(9.1428F, 3.9294F, 2.061F, 0.2808F, -0.2724F, 1.1958F));
		PartDefinition cube_r7 = head.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(84, 97).mirror().addBox(-4.2866F, -3.8602F, 2.3712F, 4.0F, 3.0F, 18.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(46, 22).mirror()
				.addBox(-7.2866F, -3.8602F, -15.4128F, 7.0F, 3.0F, 18.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(9.1428F, 3.9294F, 2.061F, 0.3887F, -0.0015F, 0.4488F));
		PartDefinition cube_r8 = head.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(1.5374F, -3.254F, -15.4128F, 7.0F, 4.0F, 16.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(9.1428F, 3.9294F, 2.061F, 0.1377F, -0.3646F, 1.6454F));
		PartDefinition cube_r9 = head.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 0).addBox(-9.6094F, -3.254F, -15.4128F, 7.0F, 4.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.1668F, 3.9294F, 2.061F, 0.1377F, 0.3646F, -1.6454F));
		PartDefinition cube_r10 = head.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.7918F, -2.3329F, -15.4128F, 7.0F, 3.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(84, 97).addBox(-1.7918F, -2.3329F, 4.3472F, 4.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.1668F, 3.9294F, 2.061F, 0.2808F, 0.2724F, -1.1958F));
		PartDefinition cube_r11 = head.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(46, 22).addBox(-0.7854F, -3.8602F, -15.4128F, 7.0F, 3.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(84, 97).addBox(0.2386F, -3.8602F, 2.3712F, 4.0F, 3.0F, 18.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.1668F, 3.9294F, 2.061F, 0.3887F, 0.0015F, -0.4488F));
		PartDefinition cube_r12 = head.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(96, 0).addBox(-4.7455F, -3.0009F, -3.952F, 8.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5535F, 10.8121F, -12.5643F, 0.883F, -0.0013F, -1.1111F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_wing.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_wing.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
