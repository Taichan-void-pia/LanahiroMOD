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
public class Modelmechanism_leggings<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("ranahiromod", "modelmechanism_leggings"), "main");
	public final ModelPart leftleg;
	public final ModelPart rightleg;

	public Modelmechanism_leggings(ModelPart root) {
		this.leftleg = root.getChild("leftleg");
		this.rightleg = root.getChild("rightleg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition leftleg = partdefinition.addOrReplaceChild("leftleg", CubeListBuilder.create(), PartPose.offset(2.8F, 12.0F, 0.0F));
		PartDefinition bipedRightLeg_r1 = leftleg.addOrReplaceChild("bipedRightLeg_r1", CubeListBuilder.create().texOffs(25, 2).addBox(-1.1F, -5.0F, -1.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.3F, 5.0109F, 3.3758F, 0.2618F, -0.5672F, 0.0F));
		PartDefinition bipedRightLeg_r2 = leftleg.addOrReplaceChild("bipedRightLeg_r2", CubeListBuilder.create().texOffs(25, 2).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.8653F, 4.7521F, 2.5075F, -0.2618F, -0.5672F, 0.0F));
		PartDefinition bipedRightLeg_r3 = leftleg.addOrReplaceChild("bipedRightLeg_r3", CubeListBuilder.create().texOffs(25, 2).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.8653F, 4.7521F, -2.5075F, 0.2618F, 0.5672F, 0.0F));
		PartDefinition bipedRightLeg_r4 = leftleg.addOrReplaceChild("bipedRightLeg_r4", CubeListBuilder.create().texOffs(25, 2).addBox(-1.1F, -5.0F, 0.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.3F, 5.0109F, -3.3758F, -0.2618F, 0.5672F, 0.0F));
		PartDefinition bipedRightLeg_r5 = leftleg.addOrReplaceChild(
				"bipedRightLeg_r5", CubeListBuilder.create().texOffs(28, 4).mirror().addBox(-2.0F, -1.7F, 1.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(28, 4).mirror()
						.addBox(-2.0F, -1.7F, -2.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(28, 4).mirror().addBox(-2.0F, -1.7F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.2F, 1.6F, -0.0758F, 0.0F, 0.0F, 0.3491F));
		PartDefinition bipedRightLeg_r6 = leftleg.addOrReplaceChild(
				"bipedRightLeg_r6", CubeListBuilder.create().texOffs(28, 4).mirror().addBox(-1.0F, 0.3F, 1.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(28, 4).mirror()
						.addBox(-1.0F, 0.3F, -2.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(28, 4).mirror().addBox(-1.0F, 0.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.9948F, 0.916F, -0.0758F, 0.0F, 0.0F, -0.3491F));
		PartDefinition bipedRightLeg_r7 = leftleg.addOrReplaceChild("bipedRightLeg_r7", CubeListBuilder.create().texOffs(28, 4).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.1649F, 9.1296F, -0.0758F, 0.0F, 0.0F, 0.2182F));
		PartDefinition bipedRightLeg_r8 = leftleg.addOrReplaceChild("bipedRightLeg_r8", CubeListBuilder.create().texOffs(28, 4).mirror().addBox(-3.0F, 3.3F, 1.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.9948F, 2.916F, -2.0758F, 0.0F, 0.0F, -0.6981F));
		PartDefinition bipedRightLeg_r9 = leftleg.addOrReplaceChild(
				"bipedRightLeg_r9", CubeListBuilder.create().texOffs(28, 4).mirror().addBox(-3.0F, 3.3F, 1.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(28, 4).mirror()
						.addBox(-3.0F, 3.3F, 5.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(28, 4).mirror().addBox(-3.0F, 3.3F, 3.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.9948F, 0.916F, -4.0758F, 0.0F, 0.0F, -0.6981F));
		PartDefinition bipedRightLeg_r10 = leftleg.addOrReplaceChild(
				"bipedRightLeg_r10", CubeListBuilder.create().texOffs(28, 4).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(28, 4).mirror()
						.addBox(-0.5F, -1.0F, 3.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(28, 4).mirror().addBox(-0.5F, -1.0F, 1.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.1649F, 7.1296F, -2.0758F, 0.0F, 0.0F, 0.2182F));
		PartDefinition bipedRightLeg_r11 = leftleg.addOrReplaceChild("bipedRightLeg_r11", CubeListBuilder.create().texOffs(28, 4).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(28, 4).mirror()
				.addBox(-0.5F, -1.0F, -2.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.1649F, 8.1296F, 0.9242F, 0.0F, 0.0F, 0.2182F));
		PartDefinition bipedRightLeg_r12 = leftleg.addOrReplaceChild("bipedRightLeg_r12", CubeListBuilder.create().texOffs(28, 4).mirror().addBox(-3.0F, 3.3F, 1.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(28, 4).mirror()
				.addBox(-3.0F, 3.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.9948F, 1.916F, -1.0758F, 0.0F, 0.0F, -0.6981F));
		PartDefinition bipedRightLeg_r13 = leftleg.addOrReplaceChild("bipedRightLeg_r13", CubeListBuilder.create().texOffs(2, 4).mirror().addBox(-0.7F, 0.0F, -2.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(52, 4).mirror()
				.addBox(-0.7F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.7F, 5.0109F, 3.3758F, 0.1745F, 0.5672F, 0.0F));
		PartDefinition bipedRightLeg_r14 = leftleg.addOrReplaceChild("bipedRightLeg_r14", CubeListBuilder.create().texOffs(52, 4).mirror().addBox(-0.7F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(2, 4).mirror()
				.addBox(-0.7F, 0.0F, 0.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.7F, 5.0109F, -3.3758F, -0.1745F, -0.5672F, 0.0F));
		PartDefinition bipedRightLeg_r15 = leftleg.addOrReplaceChild("bipedRightLeg_r15", CubeListBuilder.create().texOffs(2, 4).mirror().addBox(-0.6F, -5.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.7F, 5.0109F, 3.3758F, 0.1745F, 0.6109F, 0.0F));
		PartDefinition bipedRightLeg_r16 = leftleg.addOrReplaceChild("bipedRightLeg_r16", CubeListBuilder.create().texOffs(2, 4).mirror().addBox(-0.6F, -5.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.7F, 5.0109F, -3.3758F, -0.1745F, -0.6109F, 0.0F));
		PartDefinition bipedRightLeg_r17 = leftleg.addOrReplaceChild("bipedRightLeg_r17", CubeListBuilder.create().texOffs(2, 4).mirror().addBox(-0.5F, 0.0F, -1.0F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(51, 6).mirror()
				.addBox(-0.5F, 4.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 0.0F, 3.0F, 0.1745F, 0.0F, 0.0F));
		PartDefinition bipedRightLeg_r18 = leftleg.addOrReplaceChild("bipedRightLeg_r18", CubeListBuilder.create().texOffs(2, 4).mirror().addBox(-0.5F, 5.0F, -1.0F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.3F, 0.0F, 4.7365F, -0.1745F, 0.0F, 0.0F));
		PartDefinition bipedRightLeg_r19 = leftleg.addOrReplaceChild("bipedRightLeg_r19", CubeListBuilder.create().texOffs(51, 6).mirror().addBox(-0.5F, 4.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(2, 4).mirror()
				.addBox(-1.1F, 0.0F, 0.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 0.0F, -3.0F, -0.1745F, 0.0F, 0.0F));
		PartDefinition bipedRightLeg_r20 = leftleg.addOrReplaceChild("bipedRightLeg_r20", CubeListBuilder.create().texOffs(27, 6).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(27, 6).mirror()
				.addBox(1.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 1.984F, 3.2061F, -0.0873F, 0.0F, 0.0F));
		PartDefinition bipedRightLeg_r21 = leftleg.addOrReplaceChild("bipedRightLeg_r21", CubeListBuilder.create().texOffs(27, 6).mirror().addBox(-0.7F, -0.7F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(27, 6).mirror()
				.addBox(1.3F, -0.7F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 0.0F, 3.0F, 0.6545F, 0.0F, 0.0F));
		PartDefinition bipedRightLeg_r22 = leftleg.addOrReplaceChild("bipedRightLeg_r22", CubeListBuilder.create().texOffs(27, 6).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(27, 6).mirror()
				.addBox(-2.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.984F, -3.2061F, 0.0873F, 0.0F, 0.0F));
		PartDefinition bipedRightLeg_r23 = leftleg.addOrReplaceChild("bipedRightLeg_r23", CubeListBuilder.create().texOffs(27, 6).mirror().addBox(-0.7F, -0.7F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(27, 6).mirror()
				.addBox(-2.7F, -0.7F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7F, 0.0F, -3.0F, -0.6545F, 0.0F, 0.0F));
		PartDefinition bipedRightLeg_r24 = leftleg.addOrReplaceChild("bipedRightLeg_r24", CubeListBuilder.create().texOffs(2, 4).mirror().addBox(-0.5F, 5.0F, 0.0F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.3F, 0.0F, -4.7365F, 0.1745F, 0.0F, 0.0F));
		PartDefinition bipedRightLeg_r25 = leftleg.addOrReplaceChild("bipedRightLeg_r25", CubeListBuilder.create().texOffs(2, 4).mirror().addBox(0.0F, 0.0F, -3.0F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(50, 5).mirror()
				.addBox(0.0F, 4.0F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition bipedRightLeg_r26 = leftleg.addOrReplaceChild("bipedRightLeg_r26", CubeListBuilder.create().texOffs(50, 5).mirror().addBox(-0.5F, -0.5F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.372F, 4.4848F, 3.133F, 0.0F, 1.3526F, 0.0F));
		PartDefinition bipedRightLeg_r27 = leftleg.addOrReplaceChild("bipedRightLeg_r27", CubeListBuilder.create().texOffs(50, 5).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.4442F, 4.4848F, 2.9384F, 0.0F, 0.8727F, 0.0F));
		PartDefinition bipedRightLeg_r28 = leftleg.addOrReplaceChild("bipedRightLeg_r28", CubeListBuilder.create().texOffs(50, 5).mirror().addBox(-0.5F, -0.5F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.372F, 4.4848F, -3.133F, 0.0F, -1.3526F, 0.0F));
		PartDefinition bipedRightLeg_r29 = leftleg.addOrReplaceChild("bipedRightLeg_r29", CubeListBuilder.create().texOffs(50, 5).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.4442F, 4.4848F, -2.9384F, 0.0F, -0.8727F, 0.0F));
		PartDefinition bipedRightLeg_r30 = leftleg.addOrReplaceChild("bipedRightLeg_r30", CubeListBuilder.create().texOffs(2, 4).mirror().addBox(0.0F, 5.0F, -3.0F, 2.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.6716F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0873F));
		PartDefinition bipedRightLeg_r31 = leftleg.addOrReplaceChild("bipedRightLeg_r31",
				CubeListBuilder.create().texOffs(47, 10).mirror().addBox(-0.9331F, -6.1954F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(2, 4).mirror()
						.addBox(-0.9331F, -10.1954F, -3.0F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(2, 4).mirror().addBox(-1.9331F, -5.1954F, -3.0F, 2.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.9F, 10.0F, 0.0F, 0.0F, 0.0F, -0.2182F));
		PartDefinition rightleg = partdefinition.addOrReplaceChild("rightleg", CubeListBuilder.create(), PartPose.offset(-2.8F, 12.0F, 0.0F));
		PartDefinition bipedRightLeg_r32 = rightleg.addOrReplaceChild("bipedRightLeg_r32", CubeListBuilder.create().texOffs(25, 2).mirror().addBox(-0.9F, -5.0F, -1.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.3F, 5.0109F, 3.3758F, 0.2618F, 0.5672F, 0.0F));
		PartDefinition bipedRightLeg_r33 = rightleg.addOrReplaceChild("bipedRightLeg_r33", CubeListBuilder.create().texOffs(25, 2).mirror().addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.8653F, 4.7521F, 2.5075F, -0.2618F, 0.5672F, 0.0F));
		PartDefinition bipedRightLeg_r34 = rightleg.addOrReplaceChild("bipedRightLeg_r34", CubeListBuilder.create().texOffs(25, 2).mirror().addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.8653F, 4.7521F, -2.5075F, 0.2618F, -0.5672F, 0.0F));
		PartDefinition bipedRightLeg_r35 = rightleg.addOrReplaceChild("bipedRightLeg_r35", CubeListBuilder.create().texOffs(25, 2).mirror().addBox(-0.9F, -5.0F, 0.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.3F, 5.0109F, -3.3758F, -0.2618F, -0.5672F, 0.0F));
		PartDefinition bipedRightLeg_r36 = rightleg.addOrReplaceChild("bipedRightLeg_r36", CubeListBuilder.create().texOffs(28, 4).addBox(0.0F, -1.7F, 1.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 4)
				.addBox(0.0F, -1.7F, -2.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 4).addBox(0.0F, -1.7F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.2F, 1.6F, -0.0758F, 0.0F, 0.0F, -0.3491F));
		PartDefinition bipedRightLeg_r37 = rightleg.addOrReplaceChild("bipedRightLeg_r37", CubeListBuilder.create().texOffs(28, 4).addBox(0.0F, 0.3F, 1.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 4)
				.addBox(0.0F, 0.3F, -2.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 4).addBox(0.0F, 0.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.9948F, 0.916F, -0.0758F, 0.0F, 0.0F, 0.3491F));
		PartDefinition bipedRightLeg_r38 = rightleg.addOrReplaceChild("bipedRightLeg_r38", CubeListBuilder.create().texOffs(28, 4).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.1649F, 9.1296F, -0.0758F, 0.0F, 0.0F, -0.2182F));
		PartDefinition bipedRightLeg_r39 = rightleg.addOrReplaceChild("bipedRightLeg_r39", CubeListBuilder.create().texOffs(28, 4).addBox(2.0F, 3.3F, 1.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.9948F, 2.916F, -2.0758F, 0.0F, 0.0F, 0.6981F));
		PartDefinition bipedRightLeg_r40 = rightleg.addOrReplaceChild("bipedRightLeg_r40", CubeListBuilder.create().texOffs(28, 4).addBox(2.0F, 3.3F, 1.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 4)
				.addBox(2.0F, 3.3F, 5.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 4).addBox(2.0F, 3.3F, 3.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9948F, 0.916F, -4.0758F, 0.0F, 0.0F, 0.6981F));
		PartDefinition bipedRightLeg_r41 = rightleg.addOrReplaceChild("bipedRightLeg_r41", CubeListBuilder.create().texOffs(28, 4).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 4)
				.addBox(-0.5F, -1.0F, 3.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 4).addBox(-0.5F, -1.0F, 1.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.1649F, 7.1296F, -2.0758F, 0.0F, 0.0F, -0.2182F));
		PartDefinition bipedRightLeg_r42 = rightleg.addOrReplaceChild("bipedRightLeg_r42",
				CubeListBuilder.create().texOffs(28, 4).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 4).addBox(-0.5F, -1.0F, -2.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.1649F, 8.1296F, 0.9242F, 0.0F, 0.0F, -0.2182F));
		PartDefinition bipedRightLeg_r43 = rightleg.addOrReplaceChild("bipedRightLeg_r43",
				CubeListBuilder.create().texOffs(28, 4).addBox(2.0F, 3.3F, 1.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 4).addBox(2.0F, 3.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.9948F, 1.916F, -1.0758F, 0.0F, 0.0F, 0.6981F));
		PartDefinition bipedRightLeg_r44 = rightleg.addOrReplaceChild("bipedRightLeg_r44",
				CubeListBuilder.create().texOffs(2, 4).addBox(-1.3F, 0.0F, -2.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(52, 4).addBox(-1.3F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7F, 5.0109F, 3.3758F, 0.1745F, -0.5672F, 0.0F));
		PartDefinition bipedRightLeg_r45 = rightleg.addOrReplaceChild("bipedRightLeg_r45",
				CubeListBuilder.create().texOffs(52, 4).addBox(-1.3F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(2, 4).addBox(-1.3F, 0.0F, 0.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7F, 5.0109F, -3.3758F, -0.1745F, 0.5672F, 0.0F));
		PartDefinition bipedRightLeg_r46 = rightleg.addOrReplaceChild("bipedRightLeg_r46", CubeListBuilder.create().texOffs(2, 4).addBox(-0.4F, -5.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7F, 5.0109F, 3.3758F, 0.1745F, -0.6109F, 0.0F));
		PartDefinition bipedRightLeg_r47 = rightleg.addOrReplaceChild("bipedRightLeg_r47", CubeListBuilder.create().texOffs(2, 4).addBox(-0.4F, -5.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7F, 5.0109F, -3.3758F, -0.1745F, 0.6109F, 0.0F));
		PartDefinition bipedRightLeg_r48 = rightleg.addOrReplaceChild("bipedRightLeg_r48",
				CubeListBuilder.create().texOffs(2, 4).addBox(-2.5F, 0.0F, -1.0F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(51, 6).addBox(-2.5F, 4.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.3F, 0.0F, 3.0F, 0.1745F, 0.0F, 0.0F));
		PartDefinition bipedRightLeg_r49 = rightleg.addOrReplaceChild("bipedRightLeg_r49", CubeListBuilder.create().texOffs(2, 4).addBox(-2.5F, 5.0F, -1.0F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.3F, 0.0F, 4.7365F, -0.1745F, 0.0F, 0.0F));
		PartDefinition bipedRightLeg_r50 = rightleg.addOrReplaceChild("bipedRightLeg_r50",
				CubeListBuilder.create().texOffs(51, 6).addBox(-2.5F, 4.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(2, 4).addBox(-2.9F, 0.0F, 0.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.3F, 0.0F, -3.0F, -0.1745F, 0.0F, 0.0F));
		PartDefinition bipedRightLeg_r51 = rightleg.addOrReplaceChild("bipedRightLeg_r51",
				CubeListBuilder.create().texOffs(27, 6).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(27, 6).addBox(-2.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5F, 1.984F, 3.2061F, -0.0873F, 0.0F, 0.0F));
		PartDefinition bipedRightLeg_r52 = rightleg.addOrReplaceChild("bipedRightLeg_r52",
				CubeListBuilder.create().texOffs(27, 6).addBox(-0.3F, -0.7F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(27, 6).addBox(-2.3F, -0.7F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.3F, 0.0F, 3.0F, 0.6545F, 0.0F, 0.0F));
		PartDefinition bipedRightLeg_r53 = rightleg.addOrReplaceChild("bipedRightLeg_r53",
				CubeListBuilder.create().texOffs(27, 6).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(27, 6).addBox(1.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 1.984F, -3.2061F, 0.0873F, 0.0F, 0.0F));
		PartDefinition bipedRightLeg_r54 = rightleg.addOrReplaceChild("bipedRightLeg_r54",
				CubeListBuilder.create().texOffs(27, 6).addBox(-0.3F, -0.7F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(27, 6).addBox(1.7F, -0.7F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.7F, 0.0F, -3.0F, -0.6545F, 0.0F, 0.0F));
		PartDefinition bipedRightLeg_r55 = rightleg.addOrReplaceChild("bipedRightLeg_r55", CubeListBuilder.create().texOffs(2, 4).addBox(-2.5F, 5.0F, 0.0F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.3F, 0.0F, -4.7365F, 0.1745F, 0.0F, 0.0F));
		PartDefinition bipedRightLeg_r56 = rightleg.addOrReplaceChild("bipedRightLeg_r56",
				CubeListBuilder.create().texOffs(2, 4).addBox(-1.0F, 0.0F, -3.0F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(50, 5).addBox(-1.0F, 4.0F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.8F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0873F));
		PartDefinition bipedRightLeg_r57 = rightleg.addOrReplaceChild("bipedRightLeg_r57", CubeListBuilder.create().texOffs(50, 5).addBox(-0.5F, -0.5F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.372F, 4.4848F, 3.133F, 0.0F, -1.3526F, 0.0F));
		PartDefinition bipedRightLeg_r58 = rightleg.addOrReplaceChild("bipedRightLeg_r58", CubeListBuilder.create().texOffs(50, 5).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.4442F, 4.4848F, 2.9384F, 0.0F, -0.8727F, 0.0F));
		PartDefinition bipedRightLeg_r59 = rightleg.addOrReplaceChild("bipedRightLeg_r59", CubeListBuilder.create().texOffs(50, 5).addBox(-0.5F, -0.5F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.372F, 4.4848F, -3.133F, 0.0F, 1.3526F, 0.0F));
		PartDefinition bipedRightLeg_r60 = rightleg.addOrReplaceChild("bipedRightLeg_r60", CubeListBuilder.create().texOffs(50, 5).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.4442F, 4.4848F, -2.9384F, 0.0F, 0.8727F, 0.0F));
		PartDefinition bipedRightLeg_r61 = rightleg.addOrReplaceChild("bipedRightLeg_r61", CubeListBuilder.create().texOffs(2, 4).addBox(-2.0F, 5.0F, -3.0F, 2.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.6716F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition bipedRightLeg_r62 = rightleg
				.addOrReplaceChild(
						"bipedRightLeg_r62", CubeListBuilder.create().texOffs(47, 10).addBox(-0.0669F, -6.1954F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(2, 4)
								.addBox(-0.0669F, -10.1954F, -3.0F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(2, 4).addBox(-0.0669F, -5.1954F, -3.0F, 2.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(-3.9F, 10.0F, 0.0F, 0.0F, 0.0F, 0.2182F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		leftleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
