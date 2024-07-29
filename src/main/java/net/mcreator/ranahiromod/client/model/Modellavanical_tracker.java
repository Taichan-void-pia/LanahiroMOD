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

// Made with Blockbench 4.7.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modellavanical_tracker<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("ranahiromod", "modellavanical_tracker"), "main");
	public final ModelPart body;
	public final ModelPart rotation_parts_1;
	public final ModelPart rotation_parts_2;

	public Modellavanical_tracker(ModelPart root) {
		this.body = root.getChild("body");
		this.rotation_parts_1 = root.getChild("rotation_parts_1");
		this.rotation_parts_2 = root.getChild("rotation_parts_2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(5, 25).addBox(-7.5F, -10.5632F, -4.8572F, 15.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(5, 42).addBox(-7.5F, -10.5632F, 0.1428F, 15.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(5, 8)
						.addBox(-6.0F, -0.5632F, -4.3572F, 12.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(65, 18).addBox(-3.0F, -11.0632F, -4.8572F, 6.0F, 15.0F, 10.0F, new CubeDeformation(0.1F)).texOffs(3, 67)
						.addBox(-4.0F, 5.4368F, -4.3572F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(3, 67).addBox(-4.0F, 7.4368F, -4.3572F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(3, 67)
						.addBox(-4.0F, 9.4368F, -4.3572F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(101, 103).addBox(-1.5F, 3.9368F, -1.8572F, 3.0F, 12.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(101, 103)
						.addBox(-1.5F, 17.9368F, -0.8572F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(5, 8).addBox(-2.5F, 11.9368F, -4.8572F, 5.0F, 5.0F, 8.0F, new CubeDeformation(0.1F)).texOffs(5, 8)
						.addBox(-5.0F, 12.4368F, -4.8572F, 10.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -1.4368F, 0.8572F));
		PartDefinition body_r1 = body.addOrReplaceChild("body_r1", CubeListBuilder.create().texOffs(85, 67).mirror().addBox(-5.5F, 2.75F, -3.0F, 10.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.0F, -14.4168F, 0.6679F, -0.0894F, -0.3829F, -1.3353F));
		PartDefinition body_r2 = body.addOrReplaceChild("body_r2", CubeListBuilder.create().texOffs(85, 67).mirror().addBox(-6.5F, -1.0F, -3.0F, 13.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.0F, -14.4168F, 0.6679F, 0.0F, -0.3927F, -1.5708F));
		PartDefinition body_r3 = body.addOrReplaceChild("body_r3", CubeListBuilder.create().texOffs(85, 67).addBox(-4.5F, 2.75F, -3.0F, 10.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -14.4168F, 0.6679F, -0.0894F, 0.3829F, 1.3353F));
		PartDefinition body_r4 = body.addOrReplaceChild("body_r4", CubeListBuilder.create().texOffs(85, 67).addBox(-6.5F, -1.0F, -3.0F, 13.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -14.4168F, 0.6679F, 0.0F, 0.3927F, 1.5708F));
		PartDefinition body_r5 = body.addOrReplaceChild("body_r5",
				CubeListBuilder.create().texOffs(104, 84).mirror().addBox(-3.25F, -4.25F, -2.0F, 2.0F, 13.0F, 8.0F, new CubeDeformation(0.1F)).mirror(false).texOffs(105, 39).mirror()
						.addBox(-1.75F, -5.25F, -2.0F, 1.0F, 13.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(105, 39).mirror().addBox(-1.25F, -7.25F, -1.0F, 1.0F, 13.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(105, 39)
						.mirror().addBox(1.75F, -9.25F, 0.0F, 1.0F, 17.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(104, 84).mirror().addBox(1.25F, -6.25F, -1.0F, 1.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(105, 39).mirror().addBox(-0.25F, -1.25F, -1.0F, 2.0F, 8.0F, 6.0F, new CubeDeformation(0.1F)).mirror(false).texOffs(105, 39).addBox(-21.75F, -1.25F, -1.0F, 2.0F, 8.0F, 6.0F, new CubeDeformation(0.1F)).texOffs(104, 84)
						.addBox(-22.25F, -6.25F, -1.0F, 1.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(105, 39).addBox(-22.75F, -9.25F, 0.0F, 1.0F, 17.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(105, 39)
						.addBox(-19.75F, -7.25F, -1.0F, 1.0F, 13.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(105, 39).addBox(-19.25F, -5.25F, -2.0F, 1.0F, 13.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(104, 84)
						.addBox(-18.75F, -4.25F, -2.0F, 2.0F, 13.0F, 8.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(10.0F, -8.0632F, -0.8572F, -0.1745F, 0.0F, 0.0F));
		PartDefinition body_r6 = body.addOrReplaceChild("body_r6", CubeListBuilder.create().texOffs(105, 102).addBox(-1.5F, 4.5F, 0.0F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 15.4368F, -0.8572F, 0.0F, 0.0F, -0.7854F));
		PartDefinition body_r7 = body.addOrReplaceChild("body_r7", CubeListBuilder.create().texOffs(105, 102).mirror().addBox(-0.5F, -1.5F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(105, 102).mirror()
				.addBox(2.5F, -0.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(6.7175F, 17.2045F, -0.3572F, 0.0F, 0.0F, -1.5708F));
		PartDefinition body_r8 = body.addOrReplaceChild("body_r8",
				CubeListBuilder.create().texOffs(105, 102).addBox(-3.5F, -0.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(105, 102).addBox(-1.5F, -1.5F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.7175F, 17.2045F, -0.3572F, 0.0F, 0.0F, 1.5708F));
		PartDefinition body_r9 = body.addOrReplaceChild("body_r9", CubeListBuilder.create().texOffs(105, 102).addBox(-1.5F, 4.5F, 0.0F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 15.4368F, -0.8572F, 0.0F, 0.0F, 0.7854F));
		PartDefinition body_r10 = body.addOrReplaceChild("body_r10", CubeListBuilder.create().texOffs(101, 103).mirror().addBox(2.5F, 5.0F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 9.9368F, -0.3572F, 0.0F, 0.0F, -1.1781F));
		PartDefinition body_r11 = body.addOrReplaceChild("body_r11", CubeListBuilder.create().texOffs(3, 67).mirror().addBox(-4.0F, -9.0F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.9368F, -0.3572F, 0.0F, 0.0F, 1.9635F));
		PartDefinition body_r12 = body.addOrReplaceChild("body_r12", CubeListBuilder.create().texOffs(101, 103).mirror().addBox(5.5F, 3.0F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.75F, 9.9368F, -0.3572F, 0.0F, 0.0F, -1.1781F));
		PartDefinition body_r13 = body.addOrReplaceChild("body_r13", CubeListBuilder.create().texOffs(3, 67).mirror().addBox(-7.0F, -7.0F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.75F, 5.9368F, -0.3572F, 0.0F, 0.0F, 1.9635F));
		PartDefinition body_r14 = body.addOrReplaceChild("body_r14", CubeListBuilder.create().texOffs(101, 103).addBox(-5.5F, 5.0F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 9.9368F, -0.3572F, 0.0F, 0.0F, 1.1781F));
		PartDefinition body_r15 = body.addOrReplaceChild("body_r15", CubeListBuilder.create().texOffs(101, 103).addBox(-8.5F, 3.0F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.75F, 9.9368F, -0.3572F, 0.0F, 0.0F, 1.1781F));
		PartDefinition body_r16 = body.addOrReplaceChild("body_r16", CubeListBuilder.create().texOffs(3, 67).addBox(-4.0F, -9.0F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.9368F, -0.3572F, 0.0F, 0.0F, -1.9635F));
		PartDefinition body_r17 = body.addOrReplaceChild("body_r17", CubeListBuilder.create().texOffs(3, 67).addBox(-1.0F, -7.0F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.75F, 5.9368F, -0.3572F, 0.0F, 0.0F, -1.9635F));
		PartDefinition rotation_parts_1 = partdefinition
				.addOrReplaceChild(
						"rotation_parts_1", CubeListBuilder.create().texOffs(90, 123).addBox(-2.5F, -0.5F, -17.9984F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).texOffs(90, 123)
								.addBox(-1.5F, -0.5F, -14.9984F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.1F)).texOffs(112, 108).addBox(-0.5F, -0.5F, -19.9984F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)),
						PartPose.offsetAndRotation(0.0F, 6.0F, 0.9984F, 0.3927F, 0.0F, 0.0F));
		PartDefinition rotation_1_r1 = rotation_parts_1
				.addOrReplaceChild(
						"rotation_1_r1", CubeListBuilder.create().texOffs(112, 108).addBox(-3.2573F, -0.5F, -6.1363F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).texOffs(90, 123)
								.addBox(-4.2573F, -0.5F, -1.1363F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.1F)).texOffs(90, 123).addBox(-5.2573F, -0.5F, -4.1363F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)),
						PartPose.offsetAndRotation(-11.7517F, 0.0F, 7.8522F, -3.1416F, 0.7854F, 3.1416F));
		PartDefinition rotation_1_r2 = rotation_parts_1
				.addOrReplaceChild(
						"rotation_1_r2", CubeListBuilder.create().texOffs(112, 108).addBox(-3.2573F, -0.5F, -6.1363F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).texOffs(90, 123)
								.addBox(-4.2573F, -0.5F, -1.1363F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.1F)).texOffs(90, 123).addBox(-5.2573F, -0.5F, -4.1363F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)),
						PartPose.offsetAndRotation(7.8522F, 0.0F, 11.7517F, -3.1416F, -0.7854F, 3.1416F));
		PartDefinition rotation_1_r3 = rotation_parts_1
				.addOrReplaceChild(
						"rotation_1_r3", CubeListBuilder.create().texOffs(112, 108).addBox(7.3522F, -0.5F, -8.2467F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).texOffs(90, 123)
								.addBox(6.3522F, -0.5F, -3.2467F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.1F)).texOffs(90, 123).addBox(5.3522F, -0.5F, -6.2467F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)),
						PartPose.offsetAndRotation(7.8522F, 0.0F, 11.7517F, -3.1416F, 0.0F, -3.1416F));
		PartDefinition rotation_1_r4 = rotation_parts_1
				.addOrReplaceChild(
						"rotation_1_r4", CubeListBuilder.create().texOffs(112, 108).addBox(7.3522F, -0.5F, -8.2467F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).texOffs(90, 123)
								.addBox(6.3522F, -0.5F, -3.2467F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.1F)).texOffs(90, 123).addBox(5.3522F, -0.5F, -6.2467F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)),
						PartPose.offsetAndRotation(11.7517F, 0.0F, -7.8522F, 0.0F, -1.5708F, 0.0F));
		PartDefinition rotation_1_r5 = rotation_parts_1
				.addOrReplaceChild(
						"rotation_1_r5", CubeListBuilder.create().texOffs(112, 108).addBox(-3.2573F, -0.5F, -6.1363F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).texOffs(90, 123)
								.addBox(-4.2573F, -0.5F, -1.1363F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.1F)).texOffs(90, 123).addBox(-5.2573F, -0.5F, -4.1363F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)),
						PartPose.offsetAndRotation(11.7517F, 0.0F, -7.8522F, 0.0F, -0.7854F, 0.0F));
		PartDefinition rotation_1_r6 = rotation_parts_1
				.addOrReplaceChild(
						"rotation_1_r6", CubeListBuilder.create().texOffs(112, 108).addBox(2.7525F, -0.5F, -3.647F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).texOffs(90, 123)
								.addBox(1.7525F, -0.5F, 1.353F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.1F)).texOffs(90, 123).addBox(0.7525F, -0.5F, -1.647F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)),
						PartPose.offsetAndRotation(-13.8621F, 0.0F, -9.2624F, 0.0F, 0.7854F, 0.0F));
		PartDefinition rotation_1_r7 = rotation_parts_1
				.addOrReplaceChild(
						"rotation_1_r7", CubeListBuilder.create().texOffs(112, 108).addBox(7.3522F, -0.5F, -8.2467F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).texOffs(90, 123)
								.addBox(6.3522F, -0.5F, -3.2467F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.1F)).texOffs(90, 123).addBox(5.3522F, -0.5F, -6.2467F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)),
						PartPose.offsetAndRotation(-11.7517F, 0.0F, 7.8522F, 0.0F, 1.5708F, 0.0F));
		PartDefinition rotation_parts_2 = partdefinition.addOrReplaceChild("rotation_parts_2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.0F, 7.7484F, -1.6581F, 0.0F, 0.0F));
		PartDefinition rotation_2_r1 = rotation_parts_2
				.addOrReplaceChild(
						"rotation_2_r1", CubeListBuilder.create().texOffs(89, 123).addBox(-8.3522F, -0.5F, -8.2467F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).texOffs(89, 123)
								.addBox(-10.3522F, -0.5F, -6.2467F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).texOffs(89, 123).addBox(-9.3522F, -0.5F, -3.2467F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.1F)),
						PartPose.offsetAndRotation(-11.7517F, 0.0F, 7.8522F, -3.1416F, 0.3927F, 3.1416F));
		PartDefinition rotation_2_r2 = rotation_parts_2
				.addOrReplaceChild(
						"rotation_2_r2", CubeListBuilder.create().texOffs(89, 123).addBox(2.2573F, -0.5F, -6.1363F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).texOffs(89, 123)
								.addBox(0.2573F, -0.5F, -4.1363F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).texOffs(89, 123).addBox(1.2573F, -0.5F, -1.1363F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.1F)),
						PartPose.offsetAndRotation(7.8522F, 0.0F, 11.7517F, 3.1416F, -0.3927F, 3.1416F));
		PartDefinition rotation_2_r3 = rotation_parts_2
				.addOrReplaceChild(
						"rotation_2_r3", CubeListBuilder.create().texOffs(89, 123).addBox(-8.3522F, -0.5F, -8.2467F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).texOffs(89, 123)
								.addBox(-10.3522F, -0.5F, -6.2467F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).texOffs(89, 123).addBox(-9.3522F, -0.5F, -3.2467F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.1F)),
						PartPose.offsetAndRotation(7.8522F, 0.0F, 11.7517F, -3.1416F, -1.1781F, 3.1416F));
		PartDefinition rotation_2_r4 = rotation_parts_2
				.addOrReplaceChild(
						"rotation_2_r4", CubeListBuilder.create().texOffs(89, 123).addBox(2.2573F, -0.5F, -6.1363F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).texOffs(89, 123)
								.addBox(0.2573F, -0.5F, -4.1363F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).texOffs(89, 123).addBox(1.2573F, -0.5F, -1.1363F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.1F)),
						PartPose.offsetAndRotation(-11.7517F, 0.0F, 7.8522F, 3.1416F, 1.1781F, 3.1416F));
		PartDefinition rotation_2_r5 = rotation_parts_2
				.addOrReplaceChild(
						"rotation_2_r5", CubeListBuilder.create().texOffs(89, 123).addBox(-3.7525F, -0.5F, -3.647F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).texOffs(89, 123)
								.addBox(-5.7525F, -0.5F, -1.647F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).texOffs(89, 123).addBox(-4.7525F, -0.5F, 1.353F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.1F)),
						PartPose.offsetAndRotation(-13.8621F, 0.0F, -9.2624F, 0.0F, 1.1781F, 0.0F));
		PartDefinition rotation_2_r6 = rotation_parts_2
				.addOrReplaceChild(
						"rotation_2_r6", CubeListBuilder.create().texOffs(89, 123).addBox(2.2573F, -0.5F, -6.1363F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).texOffs(89, 123)
								.addBox(0.2573F, -0.5F, -4.1363F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).texOffs(89, 123).addBox(1.2573F, -0.5F, -1.1363F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.1F)),
						PartPose.offsetAndRotation(11.7517F, 0.0F, -7.8522F, 0.0F, -1.1781F, 0.0F));
		PartDefinition rotation_2_r7 = rotation_parts_2
				.addOrReplaceChild(
						"rotation_2_r7", CubeListBuilder.create().texOffs(89, 123).addBox(-8.3522F, -0.5F, -8.2467F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).texOffs(89, 123)
								.addBox(-10.3522F, -0.5F, -6.2467F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).texOffs(89, 123).addBox(-9.3522F, -0.5F, -3.2467F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.1F)),
						PartPose.offsetAndRotation(11.7517F, 0.0F, -7.8522F, 0.0F, -0.3927F, 0.0F));
		PartDefinition rotation_2_r8 = rotation_parts_2.addOrReplaceChild("rotation_2_r8", CubeListBuilder.create().texOffs(89, 123).addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).texOffs(89, 123)
				.addBox(-2.5F, -0.5F, -1.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).texOffs(89, 123).addBox(-1.5F, -0.5F, 2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(-6.505F, 0.0F, -15.7045F, 0.0F, 0.3927F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rotation_parts_1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rotation_parts_2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.rotation_parts_1.yRot = ageInTicks / 20.f;
		this.rotation_parts_2.yRot = ageInTicks / 20.f;
	}
}
