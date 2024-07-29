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
public class Modelgaleslasher<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("ranahiromod", "modelgaleslasher"), "main");
	public final ModelPart head;
	public final ModelPart body;
	public final ModelPart rightarm;
	public final ModelPart leftarm;
	public final ModelPart parts_2;
	public final ModelPart parts_1;

	public Modelgaleslasher(ModelPart root) {
		this.head = root.getChild("head");
		this.body = root.getChild("body");
		this.rightarm = root.getChild("rightarm");
		this.leftarm = root.getChild("leftarm");
		this.parts_2 = root.getChild("parts_2");
		this.parts_1 = root.getChild("parts_1");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, -9.0F, -5.3F));
		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(39, 1).addBox(-3.0F, -2.0F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.0F, 0.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(1, 1).addBox(-4.0F, -11.3042F, -4.8954F, 8.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(1, 1)
				.addBox(-3.0F, -12.3042F, -3.5954F, 6.0F, 13.0F, 5.0F, new CubeDeformation(-0.1F)).texOffs(1, 1).addBox(-3.0F, -0.0542F, -3.3454F, 6.0F, 4.0F, 5.0F, new CubeDeformation(-0.25F)), PartPose.offset(0.0F, -0.6958F, 0.5954F));
		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(37, 18).mirror().addBox(-12.9338F, -0.4929F, -1.0144F, 7.0F, 1.0F, 4.0F, new CubeDeformation(-0.3F)).mirror(false).texOffs(37, 18).mirror()
				.addBox(-6.9338F, -0.4929F, -1.1144F, 9.0F, 1.0F, 4.0F, new CubeDeformation(-0.35F)).mirror(false).texOffs(37, 18).mirror().addBox(0.3662F, -0.4929F, -1.2144F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.357F)).mirror(false)
				.texOffs(37, 18).mirror().addBox(1.6662F, -0.4929F, -1.3144F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.357F)).mirror(false).texOffs(37, 18).mirror().addBox(3.2162F, -0.4929F, -1.4144F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.357F))
				.mirror(false).texOffs(37, 18).mirror().addBox(3.8162F, -0.4929F, -1.5144F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.357F)).mirror(false).texOffs(37, 18).mirror()
				.addBox(4.1162F, -0.4929F, -0.6144F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.357F)).mirror(false).texOffs(37, 18).mirror().addBox(2.9162F, -0.4929F, -1.4144F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.357F)).mirror(false)
				.texOffs(37, 18).mirror().addBox(3.5162F, -0.4929F, -1.5144F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.357F)).mirror(false).texOffs(37, 18).mirror().addBox(4.5411F, -0.4929F, -1.5946F, 4.0F, 1.0F, 3.0F, new CubeDeformation(-0.357F))
				.mirror(false).texOffs(37, 18).mirror().addBox(4.1162F, -0.4929F, -1.5144F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.357F)).mirror(false).texOffs(37, 18).mirror()
				.addBox(4.4162F, -0.4929F, -0.7144F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.357F)).mirror(false).texOffs(37, 18).mirror().addBox(5.8411F, -0.4929F, -1.6946F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.357F)).mirror(false)
				.texOffs(37, 18).mirror().addBox(6.3411F, -0.4929F, -1.1946F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.357F)).mirror(false).texOffs(37, 18).mirror().addBox(6.3411F, -0.4929F, -1.7946F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.357F))
				.mirror(false).texOffs(37, 18).mirror().addBox(6.1411F, -0.4929F, -0.8946F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.357F)).mirror(false).texOffs(37, 18).mirror()
				.addBox(7.5411F, -0.4929F, -1.5946F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.357F)).mirror(false).texOffs(37, 18).mirror().addBox(7.8271F, -0.4929F, -1.9806F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.357F)).mirror(false)
				.texOffs(37, 18).mirror().addBox(7.5411F, -0.4929F, -1.8806F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.357F)).mirror(false), PartPose.offsetAndRotation(3.9798F, -12.427F, 7.7995F, -0.4647F, -0.9038F, -1.2195F));
		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(37, 18).mirror().addBox(4.5137F, -0.4929F, 1.4597F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.357F)).mirror(false),
				PartPose.offsetAndRotation(3.9798F, -12.427F, 7.7995F, -0.3292F, -0.5401F, -1.4208F));
		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(37, 18).mirror().addBox(-6.9831F, -0.4229F, -1.2745F, 9.0F, 1.0F, 4.0F, new CubeDeformation(-0.35F)).mirror(false).texOffs(37, 18).mirror()
				.addBox(0.3169F, -0.4229F, -1.3745F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.357F)).mirror(false).texOffs(37, 18).mirror().addBox(1.6169F, -0.4229F, -1.4745F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.357F)).mirror(false)
				.texOffs(37, 18).mirror().addBox(3.1669F, -0.4229F, -1.5745F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.357F)).mirror(false).texOffs(37, 18).mirror().addBox(2.8669F, -0.4229F, -1.5745F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.357F))
				.mirror(false).texOffs(37, 18).mirror().addBox(3.7669F, -0.4229F, -1.6745F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.357F)).mirror(false).texOffs(37, 18).mirror()
				.addBox(3.4669F, -0.4229F, -1.6745F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.357F)).mirror(false).texOffs(37, 18).mirror().addBox(4.0669F, -0.4229F, -1.6745F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.357F)).mirror(false)
				.texOffs(37, 18).mirror().addBox(4.0669F, -0.4229F, -0.7745F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.357F)).mirror(false).texOffs(37, 18).mirror().addBox(6.2918F, -0.4229F, -1.9547F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.357F))
				.mirror(false).texOffs(37, 18).mirror().addBox(-12.9831F, -0.4229F, -1.1745F, 7.0F, 1.0F, 4.0F, new CubeDeformation(-0.3F)).mirror(false).texOffs(37, 18).mirror()
				.addBox(4.3669F, -0.4229F, -0.8745F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.357F)).mirror(false).texOffs(37, 18).mirror().addBox(6.0918F, -0.4229F, -1.0547F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.357F)).mirror(false)
				.texOffs(37, 18).mirror().addBox(5.7918F, -0.4229F, -1.8547F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.357F)).mirror(false).texOffs(37, 18).mirror().addBox(6.2918F, -0.4229F, -1.3547F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.357F))
				.mirror(false).texOffs(37, 18).mirror().addBox(7.7778F, -0.4229F, -2.1407F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.357F)).mirror(false).texOffs(37, 18).mirror()
				.addBox(7.4918F, -0.4229F, -1.7547F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.357F)).mirror(false).texOffs(37, 18).mirror().addBox(7.4918F, -0.4229F, -2.0407F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.357F)).mirror(false)
				.texOffs(37, 18).mirror().addBox(4.4918F, -0.4229F, -1.7547F, 4.0F, 1.0F, 3.0F, new CubeDeformation(-0.357F)).mirror(false), PartPose.offsetAndRotation(7.0017F, -17.3508F, 6.9628F, -0.7444F, -0.6159F, -1.0511F));
		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(37, 18).mirror().addBox(4.5295F, -0.4229F, 1.2929F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.357F)).mirror(false),
				PartPose.offsetAndRotation(7.0017F, -17.3508F, 6.9628F, -0.6194F, -0.3089F, -1.3267F));
		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(37, 18).addBox(5.9338F, -0.4929F, -1.0144F, 7.0F, 1.0F, 4.0F, new CubeDeformation(-0.3F)).texOffs(37, 18).addBox(-2.0662F, -0.4929F, -1.1144F, 9.0F, 1.0F, 4.0F, new CubeDeformation(-0.35F))
						.texOffs(37, 18).addBox(-3.3662F, -0.4929F, -1.2144F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.357F)).texOffs(37, 18).addBox(-4.6662F, -0.4929F, -1.3144F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.357F)).texOffs(37, 18)
						.addBox(-5.2162F, -0.4929F, -1.4144F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.357F)).texOffs(37, 18).addBox(-5.8162F, -0.4929F, -1.5144F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.357F)).texOffs(37, 18)
						.addBox(-6.1162F, -0.4929F, -0.6144F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.357F)).texOffs(37, 18).addBox(-4.9162F, -0.4929F, -1.4144F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.357F)).texOffs(37, 18)
						.addBox(-5.5162F, -0.4929F, -1.5144F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.357F)).texOffs(37, 18).addBox(-8.5411F, -0.4929F, -1.5946F, 4.0F, 1.0F, 3.0F, new CubeDeformation(-0.357F)).texOffs(37, 18)
						.addBox(-8.1162F, -0.4929F, -1.5144F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.357F)).texOffs(37, 18).addBox(-6.4162F, -0.4929F, -0.7144F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.357F)).texOffs(37, 18)
						.addBox(-8.8411F, -0.4929F, -1.6946F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.357F)).texOffs(37, 18).addBox(-9.3411F, -0.4929F, -1.1946F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.357F)).texOffs(37, 18)
						.addBox(-9.3411F, -0.4929F, -1.7946F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.357F)).texOffs(37, 18).addBox(-9.1411F, -0.4929F, -0.8946F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.357F)).texOffs(37, 18)
						.addBox(-9.5411F, -0.4929F, -1.5946F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.357F)).texOffs(37, 18).addBox(-9.8271F, -0.4929F, -1.9806F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.357F)).texOffs(37, 18)
						.addBox(-9.5411F, -0.4929F, -1.8806F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.357F)),
				PartPose.offsetAndRotation(-3.9798F, -12.427F, 7.7995F, -0.4647F, 0.9038F, 1.2195F));
		PartDefinition cube_r7 = body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(37, 18).addBox(-7.5137F, -0.4929F, 1.4597F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.357F)),
				PartPose.offsetAndRotation(-3.9798F, -12.427F, 7.7995F, -0.3292F, 0.5401F, 1.4208F));
		PartDefinition cube_r8 = body.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(37, 18).addBox(5.9831F, -0.4229F, -1.1745F, 7.0F, 1.0F, 4.0F, new CubeDeformation(-0.3F)).texOffs(37, 18).addBox(-2.0169F, -0.4229F, -1.2745F, 9.0F, 1.0F, 4.0F, new CubeDeformation(-0.35F))
						.texOffs(37, 18).addBox(-3.3169F, -0.4229F, -1.3745F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.357F)).texOffs(37, 18).addBox(-4.6169F, -0.4229F, -1.4745F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.357F)).texOffs(37, 18)
						.addBox(-5.1669F, -0.4229F, -1.5745F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.357F)).texOffs(37, 18).addBox(-5.7669F, -0.4229F, -1.6745F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.357F)).texOffs(37, 18)
						.addBox(-6.0669F, -0.4229F, -0.7745F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.357F)).texOffs(37, 18).addBox(-4.8669F, -0.4229F, -1.5745F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.357F)).texOffs(37, 18)
						.addBox(-5.4669F, -0.4229F, -1.6745F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.357F)).texOffs(37, 18).addBox(-8.4918F, -0.4229F, -1.7547F, 4.0F, 1.0F, 3.0F, new CubeDeformation(-0.357F)).texOffs(37, 18)
						.addBox(-8.0669F, -0.4229F, -1.6745F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.357F)).texOffs(37, 18).addBox(-6.3669F, -0.4229F, -0.8745F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.357F)).texOffs(37, 18)
						.addBox(-8.7918F, -0.4229F, -1.8547F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.357F)).texOffs(37, 18).addBox(-9.2918F, -0.4229F, -1.3547F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.357F)).texOffs(37, 18)
						.addBox(-9.2918F, -0.4229F, -1.9547F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.357F)).texOffs(37, 18).addBox(-9.0918F, -0.4229F, -1.0547F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.357F)).texOffs(37, 18)
						.addBox(-9.4918F, -0.4229F, -1.7547F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.357F)).texOffs(37, 18).addBox(-9.7778F, -0.4229F, -2.1407F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.357F)).texOffs(37, 18)
						.addBox(-9.4918F, -0.4229F, -2.0407F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.357F)),
				PartPose.offsetAndRotation(-7.0017F, -17.3508F, 6.9628F, -0.7444F, 0.6159F, 1.0511F));
		PartDefinition cube_r9 = body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(37, 18).addBox(-7.5295F, -0.4229F, 1.2929F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.357F)),
				PartPose.offsetAndRotation(-7.0017F, -17.3508F, 6.9628F, -0.6194F, 0.3089F, 1.3267F));
		PartDefinition cube_r10 = body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(1, 1).addBox(-5.9793F, -4.55F, -0.5954F, 4.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -6.0F, 0.0F, 0.1615F, 0.0665F, -0.3873F));
		PartDefinition cube_r11 = body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(1, 1).addBox(-8.6739F, -5.55F, -2.189F, 5.0F, 5.0F, 1.0F, new CubeDeformation(-0.75F)),
				PartPose.offsetAndRotation(0.0F, -6.0F, 0.0F, 0.1728F, 0.3677F, -0.3355F));
		PartDefinition cube_r12 = body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(1, 1).mirror().addBox(3.6739F, -5.55F, -2.189F, 5.0F, 5.0F, 1.0F, new CubeDeformation(-0.75F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -6.0F, 0.0F, 0.1728F, -0.3677F, 0.3355F));
		PartDefinition cube_r13 = body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(1, 1).mirror().addBox(1.9793F, -4.55F, -0.5954F, 4.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -6.0F, 0.0F, 0.1615F, -0.0665F, 0.3873F));
		PartDefinition cube_r14 = body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(1, 1).addBox(-6.0F, -4.5F, -0.5F, 4.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -6.8042F, -2.5954F, 0.0F, 0.0F, -0.3927F));
		PartDefinition cube_r15 = body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(18, 44).addBox(-7.6739F, -6.55F, -2.189F, 4.0F, 7.0F, 1.0F, new CubeDeformation(-0.75F)),
				PartPose.offsetAndRotation(0.0F, -6.75F, -2.5F, 0.0854F, 0.3378F, -0.3657F));
		PartDefinition cube_r16 = body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(18, 44).mirror().addBox(3.6739F, -6.55F, -2.189F, 4.0F, 7.0F, 1.0F, new CubeDeformation(-0.75F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -6.75F, -2.5F, 0.0854F, -0.3378F, 0.3657F));
		PartDefinition cube_r17 = body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(1, 1).mirror().addBox(1.9793F, -4.55F, -0.5954F, 4.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -6.75F, -2.5F, 0.0807F, -0.0334F, 0.3914F));
		PartDefinition cube_r18 = body.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(21, 44).mirror().addBox(0.0F, -4.5F, -0.25F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.6F)).mirror(false),
				PartPose.offsetAndRotation(6.6358F, -9.3027F, -3.9046F, 0.0F, -0.5236F, 0.3927F));
		PartDefinition cube_r19 = body.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(18, 44).mirror().addBox(2.0F, -4.5F, -0.5F, 4.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -8.8042F, -4.0954F, 0.0F, 0.0F, 0.3927F));
		PartDefinition cube_r20 = body.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(18, 44).mirror().addBox(-2.0F, -3.5F, -0.3F, 4.0F, 7.0F, 1.0F, new CubeDeformation(-0.75F)).mirror(false),
				PartPose.offsetAndRotation(6.6913F, -9.2797F, -4.0954F, 0.0F, -0.3054F, 0.3927F));
		PartDefinition cube_r21 = body.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(21, 44).addBox(-2.0F, -4.5F, -0.25F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.6F)),
				PartPose.offsetAndRotation(-6.6358F, -9.3027F, -3.9046F, 0.0F, 0.5236F, -0.3927F));
		PartDefinition cube_r22 = body.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(18, 44).addBox(-2.0F, -3.5F, -0.3F, 4.0F, 7.0F, 1.0F, new CubeDeformation(-0.75F)),
				PartPose.offsetAndRotation(-6.6913F, -9.2797F, -4.0954F, 0.0F, 0.3054F, -0.3927F));
		PartDefinition cube_r23 = body.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(18, 44).addBox(-6.0F, -4.5F, -0.5F, 4.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -8.8042F, -4.0954F, 0.0F, 0.0F, -0.3927F));
		PartDefinition cube_r24 = body.addOrReplaceChild("cube_r24",
				CubeListBuilder.create().texOffs(2, 33).addBox(-2.0F, 0.4507F, -3.059F, 4.0F, 7.0F, 3.0F, new CubeDeformation(-1.25F)).texOffs(2, 33).addBox(-2.0F, -2.5493F, -3.059F, 4.0F, 6.0F, 3.0F, new CubeDeformation(-0.8F)),
				PartPose.offsetAndRotation(0.0F, 9.9742F, 0.9172F, 1.0472F, 0.0F, 0.0F));
		PartDefinition cube_r25 = body.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(2, 33).addBox(-2.0F, -3.8513F, -3.2434F, 4.0F, 4.0F, 3.0F, new CubeDeformation(-0.5F)),
				PartPose.offsetAndRotation(0.0F, 9.9742F, 0.9172F, 0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r26 = body.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(2, 33).addBox(-2.0F, -3.0798F, -4.8717F, 4.0F, 3.0F, 4.0F, new CubeDeformation(-0.35F)),
				PartPose.offsetAndRotation(0.0F, 9.9742F, 0.9172F, 0.0F, 0.0F, 0.0F));
		PartDefinition cube_r27 = body.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(4, 40).addBox(-2.0F, -3.5597F, -1.5399F, 4.0F, 3.0F, 4.0F, new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(0.0F, -4.7936F, 0.5627F, 0.0F, 0.0F, 0.0F));
		PartDefinition cube_r28 = body.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(4, 40).addBox(-2.0F, -1.3413F, -0.6645F, 4.0F, 11.0F, 3.0F, new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(0.0F, -4.7936F, 0.5627F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r29 = body.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(4, 40).addBox(-2.0F, -4.1042F, -0.5412F, 4.0F, 2.0F, 4.0F, new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(0.0F, -4.7936F, 0.5627F, 0.3491F, 0.0F, 0.0F));
		PartDefinition cube_r30 = body.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(4, 40).addBox(-2.0F, -4.2766F, 1.0271F, 4.0F, 3.0F, 4.0F, new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(0.0F, -4.7936F, 0.5627F, 0.9163F, 0.0F, 0.0F));
		PartDefinition cube_r31 = body.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(1, 1).mirror().addBox(-2.0F, -2.4535F, -1.4532F, 4.0F, 3.0F, 4.0F, new CubeDeformation(-0.25F)).mirror(false),
				PartPose.offsetAndRotation(3.5F, -6.8366F, 0.4275F, 0.7854F, 0.0F, 0.7854F));
		PartDefinition cube_r32 = body.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(1, 1).mirror().addBox(-2.0F, -1.234F, -1.6536F, 4.0F, 2.0F, 4.0F, new CubeDeformation(-0.25F)).mirror(false),
				PartPose.offsetAndRotation(3.5F, -6.8366F, 0.4275F, 0.2182F, 0.0F, 0.7854F));
		PartDefinition cube_r33 = body.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(1, 1).mirror().addBox(-2.0F, -0.4822F, -1.6035F, 4.0F, 6.0F, 4.0F, new CubeDeformation(-0.25F)).mirror(false),
				PartPose.offsetAndRotation(3.5F, -6.8366F, 0.4275F, -0.1309F, 0.0F, 0.7854F));
		PartDefinition cube_r34 = body.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(1, 1).addBox(-2.0F, -2.4535F, -1.4532F, 4.0F, 3.0F, 4.0F, new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(-3.5F, -6.8366F, 0.4275F, 0.7854F, 0.0F, -0.7854F));
		PartDefinition cube_r35 = body.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(1, 1).addBox(-2.0F, -1.234F, -1.6536F, 4.0F, 2.0F, 4.0F, new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(-3.5F, -6.8366F, 0.4275F, 0.2182F, 0.0F, -0.7854F));
		PartDefinition cube_r36 = body.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(1, 1).addBox(-2.0F, -0.4822F, -1.6035F, 4.0F, 6.0F, 4.0F, new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(-3.5F, -6.8366F, 0.4275F, -0.1309F, 0.0F, -0.7854F));
		PartDefinition cube_r37 = body.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(1, 1).mirror().addBox(-2.0F, -2.4535F, -2.5468F, 4.0F, 3.0F, 4.0F, new CubeDeformation(-0.25F)).mirror(false),
				PartPose.offsetAndRotation(3.5F, -6.8366F, -3.2182F, -0.7854F, 0.0F, 0.7854F));
		PartDefinition cube_r38 = body.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(1, 1).mirror().addBox(-2.0F, -1.234F, -2.3464F, 4.0F, 2.0F, 4.0F, new CubeDeformation(-0.25F)).mirror(false),
				PartPose.offsetAndRotation(3.5F, -6.8366F, -3.2182F, -0.2182F, 0.0F, 0.7854F));
		PartDefinition cube_r39 = body.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(1, 1).mirror().addBox(-2.0F, -0.4822F, -2.3965F, 4.0F, 6.0F, 4.0F, new CubeDeformation(-0.25F)).mirror(false),
				PartPose.offsetAndRotation(3.5F, -6.8366F, -3.2182F, 0.1309F, 0.0F, 0.7854F));
		PartDefinition cube_r40 = body.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(1, 1).addBox(-2.0F, -0.4822F, -2.3965F, 4.0F, 6.0F, 4.0F, new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(-3.5F, -6.8366F, -3.2182F, 0.1309F, 0.0F, -0.7854F));
		PartDefinition cube_r41 = body.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(1, 1).addBox(-2.0F, -1.234F, -2.3464F, 4.0F, 2.0F, 4.0F, new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(-3.5F, -6.8366F, -3.2182F, -0.2182F, 0.0F, -0.7854F));
		PartDefinition cube_r42 = body.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(1, 1).addBox(-2.0F, -2.4535F, -2.5468F, 4.0F, 3.0F, 4.0F, new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(-3.5F, -6.8366F, -3.2182F, -0.7854F, 0.0F, -0.7854F));
		PartDefinition cube_r43 = body.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(4, 40).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(0.0F, -7.5439F, -3.7842F, -0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r44 = body.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(4, 40).addBox(-2.0F, -0.5F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(0.0F, -7.6282F, -3.8976F, -0.2182F, 0.0F, 0.0F));
		PartDefinition cube_r45 = body.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(4, 40).addBox(-2.0F, 2.5F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(0.0F, -9.7415F, -4.5006F, 0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r46 = body.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(4, 40).addBox(-2.0F, -5.9716F, -5.4126F, 4.0F, 11.0F, 4.0F, new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(0.0F, -0.1175F, 0.9172F, 0.2618F, 0.0F, 0.0F));
		PartDefinition cube_r47 = body.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(2, 33).addBox(-2.0F, -5.0284F, -5.4126F, 4.0F, 4.0F, 4.0F, new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(0.0F, 9.9742F, 0.9172F, -0.2618F, 0.0F, 0.0F));
		PartDefinition cube_r48 = body.addOrReplaceChild("cube_r48",
				CubeListBuilder.create().texOffs(6, 41).mirror().addBox(-1.25F, -1.5F, -0.5F, 3.0F, 3.0F, 5.0F, new CubeDeformation(-0.5F)).mirror(false).texOffs(6, 41).mirror()
						.addBox(0.25F, -2.5F, -0.5F, 2.0F, 3.0F, 5.0F, new CubeDeformation(-0.75F)).mirror(false).texOffs(6, 41).mirror().addBox(-3.25F, -0.5F, -0.5F, 4.0F, 3.0F, 5.0F, new CubeDeformation(-0.25F)).mirror(false),
				PartPose.offsetAndRotation(6.25F, -11.3042F, -1.0954F, 0.0F, -0.3927F, 0.0F));
		PartDefinition cube_r49 = body.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(6, 41).addBox(-0.75F, -0.5F, -0.5F, 4.0F, 3.0F, 5.0F, new CubeDeformation(-0.25F)).texOffs(6, 41)
				.addBox(-1.75F, -1.5F, -0.5F, 3.0F, 3.0F, 5.0F, new CubeDeformation(-0.5F)).texOffs(6, 41).addBox(-2.25F, -2.5F, -0.5F, 2.0F, 3.0F, 5.0F, new CubeDeformation(-0.75F)),
				PartPose.offsetAndRotation(-6.25F, -11.3042F, -1.0954F, 0.0F, 0.3927F, 0.0F));
		PartDefinition cube_r50 = body.addOrReplaceChild("cube_r50",
				CubeListBuilder.create().texOffs(6, 41).mirror().addBox(-1.25F, -1.5F, -4.5F, 3.0F, 3.0F, 5.0F, new CubeDeformation(-0.5F)).mirror(false).texOffs(6, 41).mirror()
						.addBox(0.25F, -2.5F, -4.5F, 2.0F, 3.0F, 5.0F, new CubeDeformation(-0.75F)).mirror(false).texOffs(6, 41).mirror().addBox(-3.25F, -0.5F, -4.5F, 4.0F, 3.0F, 5.0F, new CubeDeformation(-0.25F)).mirror(false),
				PartPose.offsetAndRotation(6.25F, -11.8042F, -2.0954F, 0.0F, 0.3927F, 0.0F));
		PartDefinition cube_r51 = body.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(6, 41).addBox(-2.25F, -2.5F, -4.5F, 2.0F, 3.0F, 5.0F, new CubeDeformation(-0.75F)).texOffs(6, 41)
				.addBox(-1.75F, -1.5F, -4.5F, 3.0F, 3.0F, 5.0F, new CubeDeformation(-0.5F)).texOffs(6, 41).addBox(-0.75F, -0.5F, -4.5F, 4.0F, 3.0F, 5.0F, new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(-6.25F, -11.8042F, -2.0954F, 0.0F, -0.3927F, 0.0F));
		PartDefinition rightarm = partdefinition.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.483F, -11.7521F, -1.014F, 0.0F, 0.4363F, 0.2618F));
		PartDefinition cube_r52 = rightarm.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(37, 25).addBox(0.6317F, -5.801F, -2.1563F, 6.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1674F, 7.4935F, 1.2797F, 0.0F, 0.0F, -1.0036F));
		PartDefinition cube_r53 = rightarm.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(37, 25).addBox(2.7338F, -4.3595F, -2.1563F, 5.0F, 3.0F, 3.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(-1.9176F, 11.4765F, 1.2797F, 0.0F, 0.0F, -1.309F));
		PartDefinition cube_r54 = rightarm.addOrReplaceChild("cube_r54",
				CubeListBuilder.create().texOffs(37, 18).addBox(-12.7044F, -3.1574F, -2.6563F, 9.0F, 1.0F, 4.0F, new CubeDeformation(-0.35F)).texOffs(37, 18).addBox(-18.7544F, -3.1574F, -3.0563F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.357F))
						.texOffs(37, 18).addBox(-17.0544F, -3.1574F, -2.2563F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.357F)).texOffs(37, 18).addBox(-16.7544F, -3.1574F, -2.1563F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.357F)).texOffs(37, 18)
						.addBox(-16.4544F, -3.1574F, -3.0563F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.357F)).texOffs(37, 18).addBox(-16.1544F, -3.1574F, -3.0563F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.357F)).texOffs(37, 18)
						.addBox(-15.8544F, -3.1574F, -2.9563F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.357F)).texOffs(37, 18).addBox(-15.5544F, -3.1574F, -2.9563F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.357F)).texOffs(37, 18)
						.addBox(-15.3044F, -3.1574F, -2.8563F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.357F)).texOffs(37, 18).addBox(-14.0044F, -3.1574F, -2.7563F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.357F)).texOffs(37, 18)
						.addBox(-4.7044F, -3.1574F, -2.5563F, 7.0F, 1.0F, 4.0F, new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(-2.2547F, 10.0372F, 1.4797F, 0.0F, 0.0F, -1.5708F));
		PartDefinition cube_r55 = rightarm.addOrReplaceChild("cube_r55",
				CubeListBuilder.create().texOffs(37, 18).addBox(-12.7044F, -3.1574F, -2.6563F, 9.0F, 1.0F, 4.0F, new CubeDeformation(-0.35F)).texOffs(37, 18).addBox(-4.7044F, -3.1574F, -2.5563F, 7.0F, 1.0F, 4.0F, new CubeDeformation(-0.3F))
						.texOffs(37, 18).addBox(-14.0044F, -3.1574F, -2.7563F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.357F)).texOffs(37, 18).addBox(-15.3044F, -3.1574F, -2.8563F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.357F)).texOffs(37, 18)
						.addBox(-15.5544F, -3.1574F, -2.9563F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.357F)).texOffs(37, 18).addBox(-15.8544F, -3.1574F, -2.9563F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.357F)).texOffs(37, 18)
						.addBox(-16.1544F, -3.1574F, -3.0563F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.357F)).texOffs(37, 18).addBox(-16.4544F, -3.1574F, -3.0563F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.357F)).texOffs(37, 18)
						.addBox(-16.7544F, -3.1574F, -2.1563F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.357F)).texOffs(37, 18).addBox(-17.0544F, -3.1574F, -2.2563F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.357F)).texOffs(37, 18)
						.addBox(-18.7544F, -3.1574F, -3.0563F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.357F)),
				PartPose.offsetAndRotation(-0.0547F, 10.0372F, 1.4797F, 0.0F, 0.0F, -1.5708F));
		PartDefinition cube_r56 = rightarm.addOrReplaceChild("cube_r56",
				CubeListBuilder.create().texOffs(37, 18).addBox(-12.7044F, -3.1574F, -2.6563F, 9.0F, 1.0F, 4.0F, new CubeDeformation(-0.35F)).texOffs(37, 18).addBox(-4.7044F, -3.1574F, -2.5563F, 7.0F, 1.0F, 4.0F, new CubeDeformation(-0.3F))
						.texOffs(37, 18).addBox(-14.0044F, -3.1574F, -2.7563F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.357F)).texOffs(37, 18).addBox(-15.3044F, -3.1574F, -2.8563F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.357F)).texOffs(37, 18)
						.addBox(-15.5544F, -3.1574F, -2.9563F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.357F)).texOffs(37, 18).addBox(-15.8544F, -3.1574F, -2.9563F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.357F)).texOffs(37, 18)
						.addBox(-16.1544F, -3.1574F, -3.0563F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.357F)).texOffs(37, 18).addBox(-16.4544F, -3.1574F, -3.0563F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.357F)).texOffs(37, 18)
						.addBox(-16.7544F, -3.1574F, -2.1563F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.357F)).texOffs(37, 18).addBox(-17.0544F, -3.1574F, -2.2563F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.357F)).texOffs(37, 18)
						.addBox(-18.7544F, -3.1574F, -3.0563F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.357F)),
				PartPose.offsetAndRotation(-1.1547F, 10.0372F, 1.4797F, 0.0F, 0.0F, -1.5708F));
		PartDefinition cube_r57 = rightarm.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(37, 18).addBox(2.6032F, -1.9074F, -4.3242F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.357F)),
				PartPose.offsetAndRotation(-1.3047F, 32.2356F, 1.4098F, 0.0F, -0.3927F, -1.5708F));
		PartDefinition cube_r58 = rightarm.addOrReplaceChild("cube_r58",
				CubeListBuilder.create().texOffs(37, 18).addBox(-17.5544F, -3.1574F, -2.2563F, 4.0F, 1.0F, 3.0F, new CubeDeformation(-0.357F)).texOffs(37, 18).addBox(-17.8544F, -3.1574F, -2.3563F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.357F))
						.texOffs(37, 18).addBox(-18.1544F, -3.1574F, -1.5563F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.357F)).texOffs(37, 18).addBox(-18.3544F, -3.1574F, -1.8563F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.357F)).texOffs(37, 18)
						.addBox(-18.5544F, -3.1574F, -2.2563F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.357F)).texOffs(37, 18).addBox(-18.3544F, -3.1574F, -2.4563F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.357F)),
				PartPose.offsetAndRotation(-0.0547F, 11.6621F, 0.5995F, 0.0F, 0.0F, -1.5708F));
		PartDefinition cube_r59 = rightarm.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(37, 18).addBox(-18.8544F, -3.1574F, -2.7563F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.357F)),
				PartPose.offsetAndRotation(-0.0547F, 11.6481F, 0.7135F, 0.0F, 0.0F, -1.5708F));
		PartDefinition cube_r60 = rightarm.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(37, 18).addBox(-18.5544F, -3.1574F, -2.5563F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.357F)),
				PartPose.offsetAndRotation(-0.0547F, 11.6621F, 0.6135F, 0.0F, 0.0F, -1.5708F));
		PartDefinition cube_r61 = rightarm.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(37, 18).addBox(2.6032F, -1.9074F, -4.3242F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.357F)),
				PartPose.offsetAndRotation(-2.4047F, 32.2356F, 1.4098F, 0.0F, -0.3927F, -1.5708F));
		PartDefinition cube_r62 = rightarm.addOrReplaceChild("cube_r62",
				CubeListBuilder.create().texOffs(37, 18).addBox(-17.5544F, -3.1574F, -2.2563F, 4.0F, 1.0F, 3.0F, new CubeDeformation(-0.357F)).texOffs(37, 18).addBox(-17.8544F, -3.1574F, -2.3563F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.357F))
						.texOffs(37, 18).addBox(-18.1544F, -3.1574F, -1.5563F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.357F)).texOffs(37, 18).addBox(-18.3544F, -3.1574F, -1.8563F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.357F)).texOffs(37, 18)
						.addBox(-18.5544F, -3.1574F, -2.2563F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.357F)).texOffs(37, 18).addBox(-18.3544F, -3.1574F, -2.4563F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.357F)),
				PartPose.offsetAndRotation(-1.1547F, 11.6621F, 0.5995F, 0.0F, 0.0F, -1.5708F));
		PartDefinition cube_r63 = rightarm.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(37, 18).addBox(-18.8544F, -3.1574F, -2.7563F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.357F)),
				PartPose.offsetAndRotation(-1.1547F, 11.6481F, 0.7135F, 0.0F, 0.0F, -1.5708F));
		PartDefinition cube_r64 = rightarm.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(37, 18).addBox(-18.5544F, -3.1574F, -2.5563F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.357F)),
				PartPose.offsetAndRotation(-1.1547F, 11.6621F, 0.6135F, 0.0F, 0.0F, -1.5708F));
		PartDefinition cube_r65 = rightarm.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(37, 18).addBox(-18.5544F, -3.1574F, -2.5563F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.357F)),
				PartPose.offsetAndRotation(-2.2547F, 11.6621F, 0.6135F, 0.0F, 0.0F, -1.5708F));
		PartDefinition cube_r66 = rightarm.addOrReplaceChild("cube_r66",
				CubeListBuilder.create().texOffs(37, 18).addBox(-18.3544F, -3.1574F, -2.4563F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.357F)).texOffs(37, 18).addBox(-18.5544F, -3.1574F, -2.2563F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.357F))
						.texOffs(37, 18).addBox(-18.3544F, -3.1574F, -1.8563F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.357F)).texOffs(37, 18).addBox(-18.1544F, -3.1574F, -1.5563F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.357F)).texOffs(37, 18)
						.addBox(-17.8544F, -3.1574F, -2.3563F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.357F)).texOffs(37, 18).addBox(-17.5544F, -3.1574F, -2.2563F, 4.0F, 1.0F, 3.0F, new CubeDeformation(-0.357F)),
				PartPose.offsetAndRotation(-2.2547F, 11.6621F, 0.5995F, 0.0F, 0.0F, -1.5708F));
		PartDefinition cube_r67 = rightarm.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(37, 18).addBox(-18.8544F, -3.1574F, -2.7563F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.357F)),
				PartPose.offsetAndRotation(-2.2547F, 11.6481F, 0.7135F, 0.0F, 0.0F, -1.5708F));
		PartDefinition cube_r68 = rightarm.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(37, 18).addBox(2.6032F, -1.9074F, -4.3242F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.357F)),
				PartPose.offsetAndRotation(-3.5047F, 32.2356F, 1.4098F, 0.0F, -0.3927F, -1.5708F));
		PartDefinition cube_r69 = rightarm.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(37, 25).addBox(5.2956F, -2.9074F, -2.1563F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.2547F, 14.0372F, 1.2797F, 0.0F, 0.0F, -1.5708F));
		PartDefinition leftarm = partdefinition.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(5.483F, -11.7521F, -1.014F, 0.0F, -0.4363F, -0.2618F));
		PartDefinition cube_r70 = leftarm.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(37, 25).mirror().addBox(-6.6317F, -5.801F, -2.1563F, 6.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1674F, 7.4935F, 1.2797F, 0.0F, 0.0F, 1.0036F));
		PartDefinition cube_r71 = leftarm.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(37, 25).mirror().addBox(-7.7338F, -4.3595F, -2.1563F, 5.0F, 3.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false),
				PartPose.offsetAndRotation(1.9176F, 11.4765F, 1.2797F, 0.0F, 0.0F, 1.309F));
		PartDefinition cube_r72 = leftarm.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(37, 18).mirror().addBox(3.7044F, -3.1574F, -2.6563F, 9.0F, 1.0F, 4.0F, new CubeDeformation(-0.35F)).mirror(false).texOffs(37, 18).mirror()
				.addBox(14.7544F, -3.1574F, -3.0563F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.357F)).mirror(false).texOffs(37, 18).mirror().addBox(15.0544F, -3.1574F, -2.2563F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.357F)).mirror(false)
				.texOffs(37, 18).mirror().addBox(14.7544F, -3.1574F, -2.1563F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.357F)).mirror(false).texOffs(37, 18).mirror().addBox(14.4544F, -3.1574F, -3.0563F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.357F))
				.mirror(false).texOffs(37, 18).mirror().addBox(14.1544F, -3.1574F, -3.0563F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.357F)).mirror(false).texOffs(37, 18).mirror()
				.addBox(13.8544F, -3.1574F, -2.9563F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.357F)).mirror(false).texOffs(37, 18).mirror().addBox(13.5544F, -3.1574F, -2.9563F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.357F)).mirror(false)
				.texOffs(37, 18).mirror().addBox(12.3044F, -3.1574F, -2.8563F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.357F)).mirror(false).texOffs(37, 18).mirror().addBox(11.0044F, -3.1574F, -2.7563F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.357F))
				.mirror(false).texOffs(37, 18).mirror().addBox(-2.2956F, -3.1574F, -2.5563F, 7.0F, 1.0F, 4.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(2.2547F, 10.0372F, 1.4797F, 0.0F, 0.0F, 1.5708F));
		PartDefinition cube_r73 = leftarm.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(37, 18).mirror().addBox(3.7044F, -3.1574F, -2.6563F, 9.0F, 1.0F, 4.0F, new CubeDeformation(-0.35F)).mirror(false).texOffs(37, 18).mirror()
				.addBox(-2.2956F, -3.1574F, -2.5563F, 7.0F, 1.0F, 4.0F, new CubeDeformation(-0.3F)).mirror(false).texOffs(37, 18).mirror().addBox(11.0044F, -3.1574F, -2.7563F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.357F)).mirror(false)
				.texOffs(37, 18).mirror().addBox(12.3044F, -3.1574F, -2.8563F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.357F)).mirror(false).texOffs(37, 18).mirror().addBox(13.5544F, -3.1574F, -2.9563F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.357F))
				.mirror(false).texOffs(37, 18).mirror().addBox(13.8544F, -3.1574F, -2.9563F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.357F)).mirror(false).texOffs(37, 18).mirror()
				.addBox(14.1544F, -3.1574F, -3.0563F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.357F)).mirror(false).texOffs(37, 18).mirror().addBox(14.4544F, -3.1574F, -3.0563F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.357F)).mirror(false)
				.texOffs(37, 18).mirror().addBox(14.7544F, -3.1574F, -2.1563F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.357F)).mirror(false).texOffs(37, 18).mirror().addBox(15.0544F, -3.1574F, -2.2563F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.357F))
				.mirror(false).texOffs(37, 18).mirror().addBox(14.7544F, -3.1574F, -3.0563F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.357F)).mirror(false), PartPose.offsetAndRotation(0.0547F, 10.0372F, 1.4797F, 0.0F, 0.0F, 1.5708F));
		PartDefinition cube_r74 = leftarm.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(37, 18).mirror().addBox(3.7044F, -3.1574F, -2.6563F, 9.0F, 1.0F, 4.0F, new CubeDeformation(-0.35F)).mirror(false).texOffs(37, 18).mirror()
				.addBox(-2.2956F, -3.1574F, -2.5563F, 7.0F, 1.0F, 4.0F, new CubeDeformation(-0.3F)).mirror(false).texOffs(37, 18).mirror().addBox(11.0044F, -3.1574F, -2.7563F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.357F)).mirror(false)
				.texOffs(37, 18).mirror().addBox(12.3044F, -3.1574F, -2.8563F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.357F)).mirror(false).texOffs(37, 18).mirror().addBox(13.5544F, -3.1574F, -2.9563F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.357F))
				.mirror(false).texOffs(37, 18).mirror().addBox(13.8544F, -3.1574F, -2.9563F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.357F)).mirror(false).texOffs(37, 18).mirror()
				.addBox(14.1544F, -3.1574F, -3.0563F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.357F)).mirror(false).texOffs(37, 18).mirror().addBox(14.4544F, -3.1574F, -3.0563F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.357F)).mirror(false)
				.texOffs(37, 18).mirror().addBox(14.7544F, -3.1574F, -2.1563F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.357F)).mirror(false).texOffs(37, 18).mirror().addBox(15.0544F, -3.1574F, -2.2563F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.357F))
				.mirror(false).texOffs(37, 18).mirror().addBox(14.7544F, -3.1574F, -3.0563F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.357F)).mirror(false), PartPose.offsetAndRotation(1.1547F, 10.0372F, 1.4797F, 0.0F, 0.0F, 1.5708F));
		PartDefinition cube_r75 = leftarm.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(37, 18).mirror().addBox(-5.6032F, -1.9074F, -4.3242F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.357F)).mirror(false),
				PartPose.offsetAndRotation(1.3047F, 32.2356F, 1.4098F, 0.0F, 0.3927F, 1.5708F));
		PartDefinition cube_r76 = leftarm.addOrReplaceChild("cube_r76",
				CubeListBuilder.create().texOffs(37, 18).mirror().addBox(13.5544F, -3.1574F, -2.2563F, 4.0F, 1.0F, 3.0F, new CubeDeformation(-0.357F)).mirror(false).texOffs(37, 18).mirror()
						.addBox(14.8544F, -3.1574F, -2.3563F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.357F)).mirror(false).texOffs(37, 18).mirror().addBox(15.1544F, -3.1574F, -1.5563F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.357F)).mirror(false)
						.texOffs(37, 18).mirror().addBox(15.3544F, -3.1574F, -1.8563F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.357F)).mirror(false).texOffs(37, 18).mirror()
						.addBox(16.5544F, -3.1574F, -2.2563F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.357F)).mirror(false).texOffs(37, 18).mirror().addBox(15.3544F, -3.1574F, -2.4563F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.357F)).mirror(false),
				PartPose.offsetAndRotation(0.0547F, 11.6621F, 0.5995F, 0.0F, 0.0F, 1.5708F));
		PartDefinition cube_r77 = leftarm.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(37, 18).mirror().addBox(16.8544F, -3.1574F, -2.7563F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.357F)).mirror(false),
				PartPose.offsetAndRotation(0.0547F, 11.6481F, 0.7135F, 0.0F, 0.0F, 1.5708F));
		PartDefinition cube_r78 = leftarm.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(37, 18).mirror().addBox(16.5544F, -3.1574F, -2.5563F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.357F)).mirror(false),
				PartPose.offsetAndRotation(0.0547F, 11.6621F, 0.6135F, 0.0F, 0.0F, 1.5708F));
		PartDefinition cube_r79 = leftarm.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(37, 18).mirror().addBox(-5.6032F, -1.9074F, -4.3242F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.357F)).mirror(false),
				PartPose.offsetAndRotation(2.4047F, 32.2356F, 1.4098F, 0.0F, 0.3927F, 1.5708F));
		PartDefinition cube_r80 = leftarm.addOrReplaceChild("cube_r80",
				CubeListBuilder.create().texOffs(37, 18).mirror().addBox(13.5544F, -3.1574F, -2.2563F, 4.0F, 1.0F, 3.0F, new CubeDeformation(-0.357F)).mirror(false).texOffs(37, 18).mirror()
						.addBox(14.8544F, -3.1574F, -2.3563F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.357F)).mirror(false).texOffs(37, 18).mirror().addBox(15.1544F, -3.1574F, -1.5563F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.357F)).mirror(false)
						.texOffs(37, 18).mirror().addBox(15.3544F, -3.1574F, -1.8563F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.357F)).mirror(false).texOffs(37, 18).mirror()
						.addBox(16.5544F, -3.1574F, -2.2563F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.357F)).mirror(false).texOffs(37, 18).mirror().addBox(15.3544F, -3.1574F, -2.4563F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.357F)).mirror(false),
				PartPose.offsetAndRotation(1.1547F, 11.6621F, 0.5995F, 0.0F, 0.0F, 1.5708F));
		PartDefinition cube_r81 = leftarm.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(37, 18).mirror().addBox(16.8544F, -3.1574F, -2.7563F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.357F)).mirror(false),
				PartPose.offsetAndRotation(1.1547F, 11.6481F, 0.7135F, 0.0F, 0.0F, 1.5708F));
		PartDefinition cube_r82 = leftarm.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(37, 18).mirror().addBox(16.5544F, -3.1574F, -2.5563F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.357F)).mirror(false),
				PartPose.offsetAndRotation(1.1547F, 11.6621F, 0.6135F, 0.0F, 0.0F, 1.5708F));
		PartDefinition cube_r83 = leftarm.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(37, 18).mirror().addBox(16.5544F, -3.1574F, -2.5563F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.357F)).mirror(false),
				PartPose.offsetAndRotation(2.2547F, 11.6621F, 0.6135F, 0.0F, 0.0F, 1.5708F));
		PartDefinition cube_r84 = leftarm.addOrReplaceChild("cube_r84",
				CubeListBuilder.create().texOffs(37, 18).mirror().addBox(15.3544F, -3.1574F, -2.4563F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.357F)).mirror(false).texOffs(37, 18).mirror()
						.addBox(16.5544F, -3.1574F, -2.2563F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.357F)).mirror(false).texOffs(37, 18).mirror().addBox(15.3544F, -3.1574F, -1.8563F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.357F)).mirror(false)
						.texOffs(37, 18).mirror().addBox(15.1544F, -3.1574F, -1.5563F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.357F)).mirror(false).texOffs(37, 18).mirror()
						.addBox(14.8544F, -3.1574F, -2.3563F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.357F)).mirror(false).texOffs(37, 18).mirror().addBox(13.5544F, -3.1574F, -2.2563F, 4.0F, 1.0F, 3.0F, new CubeDeformation(-0.357F)).mirror(false),
				PartPose.offsetAndRotation(2.2547F, 11.6621F, 0.5995F, 0.0F, 0.0F, 1.5708F));
		PartDefinition cube_r85 = leftarm.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(37, 18).mirror().addBox(16.8544F, -3.1574F, -2.7563F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.357F)).mirror(false),
				PartPose.offsetAndRotation(2.2547F, 11.6481F, 0.7135F, 0.0F, 0.0F, 1.5708F));
		PartDefinition cube_r86 = leftarm.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(37, 18).mirror().addBox(-5.6032F, -1.9074F, -4.3242F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.357F)).mirror(false),
				PartPose.offsetAndRotation(3.5047F, 32.2356F, 1.4098F, 0.0F, 0.3927F, 1.5708F));
		PartDefinition cube_r87 = leftarm.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(37, 25).mirror().addBox(-7.2956F, -2.9074F, -2.1563F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.2547F, 14.0372F, 1.2797F, 0.0F, 0.0F, 1.5708F));
		PartDefinition parts_2 = partdefinition.addOrReplaceChild("parts_2", CubeListBuilder.create().texOffs(35, 36).addBox(-2.44F, 0.0F, -12.87F, 5.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2118F, 2.8178F, 0.572F, 0.48F, 0.0F, 0.0F));
		PartDefinition cube_r88 = parts_2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(35, 36).mirror().addBox(1.3812F, -5.3221F, -11.2872F, 5.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.3221F, 4.136F, 3.1416F, 1.1781F, 3.1416F));
		PartDefinition cube_r89 = parts_2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(35, 36).mirror().addBox(0.4846F, -5.3221F, -9.9454F, 5.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.3221F, 4.136F, -3.1416F, 0.7854F, 3.1416F));
		PartDefinition cube_r90 = parts_2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(35, 36).mirror().addBox(-0.8572F, -5.3221F, -9.0488F, 5.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.3221F, 4.136F, -3.1416F, 0.3927F, 3.1416F));
		PartDefinition cube_r91 = parts_2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(35, 36).addBox(-6.2612F, -5.3221F, -11.2872F, 5.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.3221F, 4.136F, -3.1416F, -1.1781F, 3.1416F));
		PartDefinition cube_r92 = parts_2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(35, 36).addBox(-5.3646F, -5.3221F, -9.9454F, 5.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.3221F, 4.136F, -3.1416F, -0.7854F, 3.1416F));
		PartDefinition cube_r93 = parts_2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(35, 36).addBox(-4.0228F, -5.3221F, -9.0488F, 5.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.3221F, 4.136F, -3.1416F, -0.3927F, 3.1416F));
		PartDefinition cube_r94 = parts_2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(35, 36).addBox(-2.44F, -5.3221F, -8.734F, 5.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.3221F, 4.136F, -3.1416F, 0.0F, 3.1416F));
		PartDefinition cube_r95 = parts_2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(35, 36).mirror().addBox(-1.3798F, -6.6021F, 0.3196F, 5.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(4.0679F, 6.6021F, -12.5913F, 0.0F, -0.3927F, 0.0F));
		PartDefinition cube_r96 = parts_2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(35, 36).mirror().addBox(0.3305F, -6.6021F, -2.24F, 5.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(10.63F, 6.6021F, -2.7705F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r97 = parts_2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(35, 36).mirror().addBox(-0.481F, -6.6021F, -0.281F, 5.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(7.5165F, 6.6021F, -10.287F, 0.0F, -0.7854F, 0.0F));
		PartDefinition cube_r98 = parts_2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(35, 36).mirror().addBox(0.1196F, -6.6021F, -1.1798F, 5.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(9.8208F, 6.6021F, -6.8384F, 0.0F, -1.1781F, 0.0F));
		PartDefinition cube_r99 = parts_2.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(35, 36).addBox(-5.2105F, -6.6021F, -2.24F, 5.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.63F, 6.6021F, -2.7705F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r100 = parts_2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(35, 36).addBox(-4.9996F, -6.6021F, -1.1798F, 5.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.8208F, 6.6021F, -6.8384F, 0.0F, 1.1781F, 0.0F));
		PartDefinition cube_r101 = parts_2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(35, 36).addBox(-4.399F, -6.6021F, -0.281F, 5.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.5165F, 6.6021F, -10.287F, 0.0F, 0.7854F, 0.0F));
		PartDefinition cube_r102 = parts_2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(35, 36).addBox(-3.5002F, -6.6021F, 0.3196F, 5.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0679F, 6.6021F, -12.5913F, 0.0F, 0.3927F, 0.0F));
		PartDefinition parts_1 = partdefinition.addOrReplaceChild("parts_1", CubeListBuilder.create().texOffs(29, 33).addBox(-4.0F, 0.0F, -20.1094F, 8.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.8043F, 8.0887F, 1.0908F, 0.0F, 0.0F));
		PartDefinition cube_r103 = parts_1.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(29, 33).mirror().addBox(1.053F, -2.7705F, -18.0163F, 8.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 2.7705F, 5.4693F, 3.1416F, 1.1781F, 3.1416F));
		PartDefinition cube_r104 = parts_1.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(29, 33).mirror().addBox(-0.1326F, -2.7705F, -16.242F, 8.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 2.7705F, 5.4693F, -3.1416F, 0.7854F, 3.1416F));
		PartDefinition cube_r105 = parts_1.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(29, 33).mirror().addBox(-1.907F, -2.7705F, -15.0564F, 8.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 2.7705F, 5.4693F, -3.1416F, 0.3927F, 3.1416F));
		PartDefinition cube_r106 = parts_1.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(29, 33).addBox(-9.053F, -2.7705F, -18.0163F, 8.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.7705F, 5.4693F, -3.1416F, -1.1781F, 3.1416F));
		PartDefinition cube_r107 = parts_1.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(29, 33).addBox(-7.8674F, -2.7705F, -16.242F, 8.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.7705F, 5.4693F, -3.1416F, -0.7854F, 3.1416F));
		PartDefinition cube_r108 = parts_1.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(29, 33).addBox(-6.093F, -2.7705F, -15.0564F, 8.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.7705F, 5.4693F, -3.1416F, -0.3927F, 3.1416F));
		PartDefinition cube_r109 = parts_1.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(29, 33).addBox(-4.0F, -2.7705F, -14.64F, 8.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.7705F, 5.4693F, -3.1416F, 0.0F, 3.1416F));
		PartDefinition cube_r110 = parts_1.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(29, 33).mirror().addBox(-1.9633F, -4.7705F, 1.4169F, 8.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(6.3561F, 4.7705F, -20.6671F, 0.0F, -0.3927F, 0.0F));
		PartDefinition cube_r111 = parts_1.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(29, 33).mirror().addBox(1.3221F, -4.7705F, -3.5F, 8.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(16.6094F, 4.7705F, -5.3221F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r112 = parts_1.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(29, 33).mirror().addBox(-0.2367F, -4.7705F, 0.2633F, 8.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(11.7446F, 4.7705F, -17.0667F, 0.0F, -0.7854F, 0.0F));
		PartDefinition cube_r113 = parts_1.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(29, 33).mirror().addBox(0.9169F, -4.7705F, -1.4633F, 8.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(15.345F, 4.7705F, -11.6782F, 0.0F, -1.1781F, 0.0F));
		PartDefinition cube_r114 = parts_1.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(29, 33).addBox(-9.3221F, -4.7705F, -3.5F, 8.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-16.6094F, 4.7705F, -5.3221F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r115 = parts_1.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(29, 33).addBox(-8.9169F, -4.7705F, -1.4633F, 8.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-15.345F, 4.7705F, -11.6782F, 0.0F, 1.1781F, 0.0F));
		PartDefinition cube_r116 = parts_1.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(29, 33).addBox(-7.7633F, -4.7705F, 0.2633F, 8.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.7446F, 4.7705F, -17.0667F, 0.0F, 0.7854F, 0.0F));
		PartDefinition cube_r117 = parts_1.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(29, 33).addBox(-6.0367F, -4.7705F, 1.4169F, 8.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.3561F, 4.7705F, -20.6671F, 0.0F, 0.3927F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		parts_2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		parts_1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.parts_1.yRot = ageInTicks / 20.f;
		this.parts_2.yRot = ageInTicks;
	}
}
