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
public class Modelgeneral_wither_skeleton<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("ranahiromod", "modelgeneral_wither_skeleton"), "main");
	public final ModelPart head;
	public final ModelPart body;
	public final ModelPart right_arm;
	public final ModelPart left_arm;
	public final ModelPart right_leg;
	public final ModelPart left_leg;

	public Modelgeneral_wither_skeleton(ModelPart root) {
		this.head = root.getChild("head");
		this.body = root.getChild("body");
		this.right_arm = root.getChild("right_arm");
		this.left_arm = root.getChild("left_arm");
		this.right_leg = root.getChild("right_leg");
		this.left_leg = root.getChild("left_leg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(5, 2).addBox(-2.0F, -4.5803F, -0.89F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(47, 1).addBox(-4.0F, -5.5803F, -3.89F, 8.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(40, 65)
						.addBox(-5.0F, -9.5803F, -4.89F, 10.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(2, 35).addBox(-3.0F, -8.5803F, -5.89F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.1F)).texOffs(54, 69)
						.addBox(-10.0547F, -6.5939F, -2.3353F, 6.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(54, 69).mirror().addBox(4.0547F, -6.5939F, -2.3353F, 6.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(38, 1)
						.addBox(-4.0F, 0.4197F, -3.89F, 8.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -28.001F, 0.0052F));
		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(40, 62).mirror().addBox(1.4144F, -0.5F, -1.6883F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.05F)).mirror(false).texOffs(40, 62).mirror()
				.addBox(1.4144F, -2.5F, -1.6883F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.05F)).mirror(false), PartPose.offsetAndRotation(9.4845F, 1.9197F, -4.5785F, 0.0F, -0.3491F, 0.0F));
		PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(22, 36).mirror().addBox(-1.0472F, -0.5F, -1.0185F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.15F)).mirror(false).texOffs(22, 36).mirror()
				.addBox(-1.0472F, -2.5F, -1.0185F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.15F)).mirror(false), PartPose.offsetAndRotation(9.4845F, 1.9197F, -4.5785F, 0.0F, 0.0436F, 0.0F));
		PartDefinition cube_r3 = head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(40, 62).mirror().addBox(-5.5777F, -0.5F, -1.3417F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.25F)).mirror(false).texOffs(40, 62).mirror()
				.addBox(-5.5777F, -2.5F, -1.3417F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.25F)).mirror(false), PartPose.offsetAndRotation(9.4845F, 1.9197F, -4.5785F, 0.0F, 0.4363F, 0.0F));
		PartDefinition cube_r4 = head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(40, 62).mirror().addBox(-5.4894F, -3.5F, -1.5311F, 5.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(9.4845F, -1.0803F, -4.3695F, 0.0F, 0.4363F, 0.0F));
		PartDefinition cube_r5 = head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(40, 62).mirror().addBox(-1.0381F, -3.0F, -1.2273F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(9.4845F, -1.0803F, -4.3695F, 0.0F, 0.0436F, 0.0F));
		PartDefinition cube_r6 = head.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(40, 62).mirror().addBox(1.3429F, -2.5F, -1.8847F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(9.4845F, -1.0803F, -4.3695F, 0.0F, -0.3491F, 0.0F));
		PartDefinition cube_r7 = head.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(40, 62).addBox(-4.4144F, -0.5F, -1.6883F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.05F)).texOffs(40, 62).addBox(-4.4144F, 1.5F, -1.6883F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-9.4845F, -0.0803F, -4.5785F, 0.0F, 0.3491F, 0.0F));
		PartDefinition cube_r8 = head.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(22, 36).addBox(-1.9528F, -0.5F, -1.0185F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.15F)).texOffs(22, 36).addBox(-1.9528F, 1.5F, -1.0185F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.15F)),
				PartPose.offsetAndRotation(-9.4845F, -0.0803F, -4.5785F, 0.0F, -0.0436F, 0.0F));
		PartDefinition cube_r9 = head.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(40, 62).addBox(0.5777F, -0.5F, -1.3417F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.25F)).texOffs(40, 62).addBox(0.5777F, 1.5F, -1.3417F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(-9.4845F, -0.0803F, -4.5785F, 0.0F, -0.4363F, 0.0F));
		PartDefinition cube_r10 = head.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(40, 62).addBox(-4.3429F, -2.5F, -1.8847F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.4845F, -1.0803F, -4.3695F, 0.0F, 0.3491F, 0.0F));
		PartDefinition cube_r11 = head.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(40, 62).addBox(-1.9619F, -3.0F, -1.2273F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.4845F, -1.0803F, -4.3695F, 0.0F, -0.0436F, 0.0F));
		PartDefinition cube_r12 = head.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(49, 58).mirror().addBox(-0.75F, -3.5F, -5.5F, 1.0F, 7.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(7.1236F, -1.0803F, 0.0072F, 0.0076F, 0.043F, 0.1747F));
		PartDefinition cube_r13 = head.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(49, 58).addBox(-0.25F, -3.5F, -5.5F, 1.0F, 7.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.1236F, -1.0803F, 0.0072F, 0.0076F, -0.043F, -0.1747F));
		PartDefinition cube_r14 = head.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(40, 62).addBox(0.4894F, -3.5F, -1.5311F, 5.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.4845F, -1.0803F, -4.3695F, 0.0F, -0.4363F, 0.0F));
		PartDefinition cube_r15 = head.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(40, 62).mirror().addBox(-0.1336F, -0.5F, -2.4513F, 4.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -3.5597F, 6.4432F, -0.4674F, 0.3542F, -0.1733F));
		PartDefinition cube_r16 = head.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(40, 62).addBox(-2.0F, -0.5F, -2.8225F, 4.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.5597F, 6.4432F, -0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r17 = head.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(40, 62).mirror().addBox(2.5059F, -1.5F, 0.1883F, 4.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -3.5597F, 6.4432F, -0.8836F, 0.9924F, -0.7954F));
		PartDefinition cube_r18 = head.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(40, 62).mirror().addBox(1.4487F, -0.5F, 0.606F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -3.5597F, 6.4432F, -0.583F, 0.6956F, -0.3999F));
		PartDefinition cube_r19 = head.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(40, 62).addBox(-3.8664F, -0.5F, -2.4513F, 4.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.5597F, 6.4432F, -0.4674F, -0.3542F, 0.1733F));
		PartDefinition cube_r20 = head.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(40, 62).addBox(-5.4487F, -0.5F, 0.606F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.5597F, 6.4432F, -0.583F, -0.6956F, 0.3999F));
		PartDefinition cube_r21 = head.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(40, 62).addBox(-6.5059F, -1.5F, 0.1883F, 4.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.5597F, 6.4432F, -0.8836F, -0.9924F, 0.7954F));
		PartDefinition cube_r22 = head.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(41, 60).addBox(-0.2659F, -0.5F, -7.1319F, 4.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.2753F, 5.5473F, -1.1225F, 0.1776F, -0.3521F));
		PartDefinition cube_r23 = head.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(41, 60).addBox(2.1866F, -0.5F, -4.6795F, 4.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.2753F, 5.5473F, -1.3742F, 0.4407F, -1.1339F));
		PartDefinition cube_r24 = head.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(41, 60).addBox(1.2043F, -0.5F, -6.1496F, 4.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.2753F, 5.5473F, -1.2181F, 0.3326F, -0.7256F));
		PartDefinition cube_r25 = head.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(41, 60).addBox(-2.0F, -0.5F, -7.4768F, 4.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.2753F, 5.5473F, -1.0908F, 0.0F, 0.0F));
		PartDefinition cube_r26 = head.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(41, 60).addBox(-3.7341F, -0.5F, -7.1319F, 4.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.2753F, 5.5473F, -1.1225F, -0.1776F, 0.3521F));
		PartDefinition cube_r27 = head.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(41, 60).addBox(-5.2043F, -0.5F, -6.1496F, 4.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.2753F, 5.5473F, -1.2181F, -0.3326F, 0.7256F));
		PartDefinition cube_r28 = head.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(41, 60).addBox(-6.1866F, -0.5F, -4.6795F, 4.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.2753F, 5.5473F, -1.3742F, -0.4407F, 1.1339F));
		PartDefinition cube_r29 = head.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(40, 62).mirror().addBox(-2.0F, -2.0307F, -7.6955F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.9028F, -4.649F, -1.7241F, 0.4215F, -0.3614F, -0.1572F));
		PartDefinition cube_r30 = head.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(40, 62).mirror().addBox(-2.0F, -2.0307F, -7.6955F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.6682F, -4.8447F, -1.2516F, 0.5299F, -0.7119F, -0.3655F));
		PartDefinition cube_r31 = head.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(19, 61).mirror().addBox(-2.0F, -2.0307F, -7.6955F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.1796F, -5.1376F, -0.5445F, 0.8249F, -1.0228F, -0.7459F));
		PartDefinition cube_r32 = head.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(19, 61).addBox(-2.0F, -2.0307F, -7.6955F, 4.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.1796F, -5.1376F, -0.5445F, 0.8249F, 1.0228F, 0.7459F));
		PartDefinition cube_r33 = head.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(40, 62).addBox(-2.0F, -2.0307F, -7.6955F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.6682F, -4.8447F, -1.2516F, 0.5299F, 0.7119F, 0.3655F));
		PartDefinition cube_r34 = head.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(40, 62).addBox(-2.0F, -2.0307F, -7.6955F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.9028F, -4.649F, -1.7241F, 0.4215F, 0.3614F, 0.1572F));
		PartDefinition cube_r35 = head.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(40, 62).addBox(-2.0F, -0.5F, -4.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.5803F, -5.89F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r36 = head.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(2, 35).mirror().addBox(1.9998F, 0.0115F, -0.5F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -10.0972F, -1.89F, -0.7459F, -0.274F, -0.2849F));
		PartDefinition cube_r37 = head.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(2, 35).addBox(-7.9998F, 0.0115F, -0.5F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -10.0972F, -1.89F, -0.7459F, 0.274F, 0.2849F));
		PartDefinition cube_r38 = head.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(2, 35).addBox(-3.0F, -0.9831F, -0.5F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(0.0F, -10.0972F, -1.89F, -0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r39 = head.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(2, 35).mirror().addBox(-3.0F, -1.5F, -0.5F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(5.1976F, -8.1142F, -5.39F, 0.0F, 0.0F, -0.3927F));
		PartDefinition cube_r40 = head.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(2, 35).mirror().addBox(-3.0F, -1.5F, -0.5F, 6.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false),
				PartPose.offsetAndRotation(9.6039F, -11.0584F, -5.39F, 0.0F, 0.0F, -0.7854F));
		PartDefinition cube_r41 = head.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(2, 35).mirror().addBox(-13.0F, -2.5F, -0.5F, 16.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false),
				PartPose.offsetAndRotation(12.5481F, -15.4647F, -5.39F, 0.0F, 0.0F, -1.1781F));
		PartDefinition cube_r42 = head.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(2, 35).mirror().addBox(-8.0F, 3.0F, -0.5F, 9.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false),
				PartPose.offsetAndRotation(9.2489F, -11.4193F, -5.39F, 0.0F, 0.0F, -0.7854F));
		PartDefinition cube_r43 = head.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(2, 35).mirror().addBox(-4.5F, -1.0F, -0.5F, 9.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false),
				PartPose.offsetAndRotation(4.6527F, -11.0658F, -5.39F, 0.0F, 0.0F, -1.1781F));
		PartDefinition cube_r44 = head.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(2, 35).addBox(-4.5F, -1.0F, -0.5F, 9.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(-4.6527F, -11.0658F, -5.39F, 0.0F, 0.0F, 1.1781F));
		PartDefinition cube_r45 = head.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(2, 35).addBox(-1.0F, 3.0F, -0.5F, 9.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(-9.2489F, -11.4193F, -5.39F, 0.0F, 0.0F, 0.7854F));
		PartDefinition cube_r46 = head.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(2, 35).addBox(-3.0F, -2.5F, -0.5F, 16.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(-12.5481F, -15.4647F, -5.39F, 0.0F, 0.0F, 1.1781F));
		PartDefinition cube_r47 = head.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(2, 35).addBox(-3.0F, -1.5F, -0.5F, 6.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(-9.6039F, -11.0584F, -5.39F, 0.0F, 0.0F, 0.7854F));
		PartDefinition cube_r48 = head.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(2, 35).addBox(-3.0F, -1.5F, -0.5F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.1976F, -8.1142F, -5.39F, 0.0F, 0.0F, 0.3927F));
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(3, 2).addBox(-1.0F, -18.8426F, -4.1391F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(34, 42).addBox(-14.0F, -25.8426F, -7.1391F, 5.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 36)
						.addBox(-15.0F, -17.0926F, -7.1391F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).texOffs(3, 36).addBox(-15.0F, -25.0926F, -7.1391F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).texOffs(65, 42)
						.addBox(-10.0F, -25.0926F, -7.1391F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.25F)).texOffs(65, 42).addBox(9.0F, -25.0926F, -7.1391F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.25F)).texOffs(1, 36)
						.addBox(-15.0F, -21.0926F, -7.1391F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).texOffs(65, 42).addBox(-11.0F, -24.0926F, -0.4415F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).texOffs(65, 42)
						.addBox(-11.0F, -20.0926F, -0.4415F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).texOffs(17, 25).addBox(-6.0F, -24.0926F, -0.4415F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.25F)).texOffs(34, 42)
						.addBox(-10.0F, -24.8426F, -0.4415F, 5.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(65, 42).addBox(-11.0F, -16.0926F, -0.4415F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).texOffs(65, 42).mirror()
						.addBox(5.0F, -24.0926F, -0.4415F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false).texOffs(65, 42).mirror().addBox(5.0F, -20.0926F, -0.4415F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false)
						.texOffs(17, 25).mirror().addBox(5.0F, -24.0926F, -0.4415F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.25F)).mirror(false).texOffs(34, 42).mirror().addBox(5.0F, -24.8426F, -0.4415F, 5.0F, 9.0F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(65, 42).mirror().addBox(5.0F, -16.0926F, -0.4415F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false).texOffs(3, 36).mirror()
						.addBox(9.0F, -25.0926F, -7.1391F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false).texOffs(1, 36).mirror().addBox(9.0F, -21.0926F, -7.1391F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false).texOffs(34, 42)
						.mirror().addBox(9.0F, -25.8426F, -7.1391F, 5.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(3, 36).mirror().addBox(9.0F, -17.0926F, -7.1391F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false),
				PartPose.offset(0.0F, 1.2687F, 5.2903F));
		PartDefinition cube_r49 = body.addOrReplaceChild("cube_r49",
				CubeListBuilder.create().texOffs(3, 2).mirror().addBox(1.75F, -6.9825F, -0.4054F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false).texOffs(7, 30).mirror()
						.addBox(1.75F, -4.9825F, -0.4054F, 7.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(7, 30).mirror().addBox(-3.75F, -4.9825F, -0.4054F, 7.0F, 1.0F, 4.0F, new CubeDeformation(0.25F)).mirror(false)
						.texOffs(7, 30).mirror().addBox(-9.25F, -4.9825F, -0.4054F, 7.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(7, 30).mirror().addBox(-3.75F, -4.4825F, -4.1554F, 7.0F, 1.0F, 4.0F, new CubeDeformation(0.25F))
						.mirror(false).texOffs(7, 30).mirror().addBox(1.75F, -4.4825F, -4.1554F, 7.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(7, 30).mirror()
						.addBox(-9.25F, -4.4825F, -4.1554F, 7.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 55).mirror().addBox(-8.25F, -6.4825F, -3.1554F, 16.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(3, 2).mirror().addBox(0.75F, -5.9825F, -1.1554F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(3, 2).addBox(-4.75F, -6.9825F, -0.4054F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.1F)).texOffs(3, 2)
						.addBox(-2.75F, -5.9825F, -1.1554F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 2).addBox(-1.0F, -7.9825F, -0.6554F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -6.0F, -4.0F, -0.0873F, 0.0F, 0.0F));
		PartDefinition cube_r50 = body.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(3, 2).mirror().addBox(-4.4285F, -0.2177F, 3.6779F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.05F)).mirror(false),
				PartPose.offsetAndRotation(4.9285F, -16.0284F, -6.8488F, 0.6981F, 0.0F, 0.0F));
		PartDefinition cube_r51 = body.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(3, 2).mirror().addBox(-3.5697F, -0.2177F, 2.6837F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.05F)).mirror(false),
				PartPose.offsetAndRotation(4.9285F, -16.0284F, -6.8488F, 0.7373F, 0.2975F, 0.2602F));
		PartDefinition cube_r52 = body.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(3, 2).mirror().addBox(-2.3958F, -0.2177F, 2.0938F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.05F)).mirror(false),
				PartPose.offsetAndRotation(4.9285F, -16.0284F, -6.8488F, 0.8706F, 0.5724F, 0.5713F));
		PartDefinition cube_r53 = body.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(3, 2).mirror().addBox(-1.5179F, -0.1352F, -4.1772F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.05F)).mirror(false),
				PartPose.offsetAndRotation(3.9285F, -17.5284F, -4.3488F, 0.7603F, -1.0515F, -0.6902F));
		PartDefinition cube_r54 = body.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(3, 2).mirror().addBox(-4.4285F, -0.2177F, 3.6779F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.05F)).mirror(false).texOffs(3, 2).addBox(-8.4285F,
				-0.2177F, 3.6779F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(4.9285F, -18.0284F, -7.8488F, 0.3491F, 0.0F, 0.0F));
		PartDefinition cube_r55 = body.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(3, 2).mirror().addBox(-3.5697F, -0.2177F, 2.6837F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.05F)).mirror(false),
				PartPose.offsetAndRotation(4.9285F, -18.0284F, -7.8488F, 0.3753F, 0.3678F, 0.1407F));
		PartDefinition cube_r56 = body.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(3, 2).mirror().addBox(-2.3958F, -0.2177F, 2.0938F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.05F)).mirror(false),
				PartPose.offsetAndRotation(4.9285F, -18.0284F, -7.8488F, 0.4754F, 0.7268F, 0.3295F));
		PartDefinition cube_r57 = body.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(3, 2).mirror().addBox(-1.5179F, -0.1352F, -4.1772F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.05F)).mirror(false),
				PartPose.offsetAndRotation(3.6785F, -18.643F, -5.199F, 0.0F, -1.1781F, 0.0F));
		PartDefinition cube_r58 = body.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(3, 2).mirror().addBox(-2.7267F, -0.1352F, -4.4248F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.05F)).mirror(false),
				PartPose.offsetAndRotation(3.6785F, -18.643F, -5.199F, 0.0F, -0.7854F, 0.0F));
		PartDefinition cube_r59 = body.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(3, 2).mirror().addBox(-4.4285F, -0.2177F, 3.6779F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.05F)).mirror(false).texOffs(3, 2).addBox(-8.4285F,
				-0.2177F, 3.6779F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(4.9285F, -21.0284F, -7.8488F, 0.3491F, 0.0F, 0.0F));
		PartDefinition cube_r60 = body.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(3, 2).mirror().addBox(-3.5697F, -0.2177F, 2.6837F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.05F)).mirror(false),
				PartPose.offsetAndRotation(4.9285F, -21.0284F, -7.8488F, 0.3753F, 0.3678F, 0.1407F));
		PartDefinition cube_r61 = body.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(3, 2).mirror().addBox(-2.3958F, -0.2177F, 2.0938F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.05F)).mirror(false),
				PartPose.offsetAndRotation(4.9285F, -21.0284F, -7.8488F, 0.4754F, 0.7268F, 0.3295F));
		PartDefinition cube_r62 = body.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(3, 2).mirror().addBox(-1.5179F, -0.1352F, -4.1772F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.05F)).mirror(false),
				PartPose.offsetAndRotation(3.6785F, -21.643F, -5.199F, 0.0F, -1.1781F, 0.0F));
		PartDefinition cube_r63 = body.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(3, 2).mirror().addBox(-2.7267F, -0.1352F, -4.4248F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.05F)).mirror(false),
				PartPose.offsetAndRotation(3.6785F, -21.643F, -5.199F, 0.0F, -0.7854F, 0.0F));
		PartDefinition cube_r64 = body.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(3, 2).mirror().addBox(-3.7488F, -0.1352F, -5.1161F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.05F)).mirror(false),
				PartPose.offsetAndRotation(3.6785F, -21.643F, -5.199F, 0.0F, -0.3927F, 0.0F));
		PartDefinition cube_r65 = body.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(3, 2).mirror().addBox(-1.5F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.05F)).mirror(false),
				PartPose.offsetAndRotation(5.4828F, -23.2705F, -9.4643F, -0.2444F, -0.7703F, 0.1719F));
		PartDefinition cube_r66 = body.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(3, 2).mirror().addBox(-1.5F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.05F)).mirror(false),
				PartPose.offsetAndRotation(6.8571F, -22.9134F, -7.4388F, -0.4318F, -1.1429F, 0.397F));
		PartDefinition cube_r67 = body.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(3, 2).mirror().addBox(-1.5F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.05F)).mirror(false),
				PartPose.offsetAndRotation(6.4828F, -23.2705F, -5.8208F, 0.2444F, 0.7703F, 0.1719F));
		PartDefinition cube_r68 = body.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(3, 2).mirror().addBox(-1.5F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.05F)).mirror(false),
				PartPose.offsetAndRotation(4.4261F, -23.5092F, -4.4674F, 0.1886F, 0.3864F, 0.0718F));
		PartDefinition cube_r69 = body.addOrReplaceChild("cube_r69",
				CubeListBuilder.create().texOffs(3, 2).mirror().addBox(0.5F, -1.2675F, -0.6554F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.05F)).mirror(false).texOffs(3, 2)
						.addBox(-3.5F, -1.2675F, -0.6554F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.05F)).texOffs(19, 44).mirror().addBox(3.0F, -2.7675F, 0.0946F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)).mirror(false).texOffs(3, 2).mirror()
						.addBox(1.0F, -2.2675F, 0.0946F, 6.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(3, 2).addBox(-7.0F, -2.2675F, 0.0946F, 6.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(3, 2)
						.addBox(-1.0F, -2.2675F, -0.6554F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -23.2697F, -4.2851F, 0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r70 = body.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(3, 2).addBox(1.4285F, -0.2177F, 3.6779F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(-4.9285F, -15.0284F, -6.8488F, 0.6981F, 0.0F, 0.0F));
		PartDefinition cube_r71 = body.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(3, 2).addBox(0.5697F, -0.2177F, 2.6837F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(-4.9285F, -15.0284F, -6.8488F, 0.7373F, -0.2975F, -0.2602F));
		PartDefinition cube_r72 = body.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(3, 2).addBox(-0.6042F, -0.2177F, 2.0938F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(-4.9285F, -15.0284F, -6.8488F, 0.8706F, -0.5724F, -0.5713F));
		PartDefinition cube_r73 = body.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(3, 2).addBox(-1.4821F, -0.1352F, -4.1772F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(-3.9285F, -16.5284F, -4.3488F, 0.7603F, 1.0515F, 0.6902F));
		PartDefinition cube_r74 = body.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(3, 2).addBox(0.5697F, -0.2177F, 2.6837F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(-4.9285F, -18.0284F, -7.8488F, 0.3753F, -0.3678F, -0.1407F));
		PartDefinition cube_r75 = body.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(3, 2).addBox(-0.6042F, -0.2177F, 2.0938F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(-4.9285F, -18.0284F, -7.8488F, 0.4754F, -0.7268F, -0.3295F));
		PartDefinition cube_r76 = body.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(3, 2).addBox(-1.4821F, -0.1352F, -4.1772F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(-3.6785F, -18.643F, -5.199F, 0.0F, 1.1781F, 0.0F));
		PartDefinition cube_r77 = body.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(3, 2).addBox(-0.2733F, -0.1352F, -4.4248F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(-3.6785F, -18.643F, -5.199F, 0.0F, 0.7854F, 0.0F));
		PartDefinition cube_r78 = body.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(3, 2).addBox(0.5697F, -0.2177F, 2.6837F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(-4.9285F, -21.0284F, -7.8488F, 0.3753F, -0.3678F, -0.1407F));
		PartDefinition cube_r79 = body.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(3, 2).addBox(-0.6042F, -0.2177F, 2.0938F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(-4.9285F, -21.0284F, -7.8488F, 0.4754F, -0.7268F, -0.3295F));
		PartDefinition cube_r80 = body.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(3, 2).addBox(-1.4821F, -0.1352F, -4.1772F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(-3.6785F, -21.643F, -5.199F, 0.0F, 1.1781F, 0.0F));
		PartDefinition cube_r81 = body.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(3, 2).addBox(-0.2733F, -0.1352F, -4.4248F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(-3.6785F, -21.643F, -5.199F, 0.0F, 0.7854F, 0.0F));
		PartDefinition cube_r82 = body.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(3, 2).addBox(0.7488F, -0.1352F, -5.1161F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(-3.6785F, -21.643F, -5.199F, 0.0F, 0.3927F, 0.0F));
		PartDefinition cube_r83 = body.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(3, 2).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(-5.4828F, -23.2705F, -9.4643F, -0.2444F, 0.7703F, -0.1719F));
		PartDefinition cube_r84 = body.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(3, 2).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(-6.8571F, -22.9134F, -7.4388F, -0.4318F, 1.1429F, -0.397F));
		PartDefinition cube_r85 = body.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(3, 2).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(-6.4828F, -23.2705F, -5.8208F, 0.2444F, -0.7703F, -0.1719F));
		PartDefinition cube_r86 = body.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(3, 2).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(-4.4261F, -23.5092F, -4.4674F, 0.1886F, -0.3864F, -0.0718F));
		PartDefinition cube_r87 = body.addOrReplaceChild("cube_r87",
				CubeListBuilder.create().texOffs(11, 35).addBox(-1.25F, 3.5F, 0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).texOffs(34, 42).addBox(-2.25F, -5.25F, 0.5F, 5.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(65, 42)
						.addBox(1.75F, -4.5F, 0.5F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.25F)).texOffs(11, 35).addBox(-1.25F, -0.5F, 0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).texOffs(11, 35)
						.addBox(-1.25F, -4.5F, 0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(2.25F, -19.5926F, 0.0585F, 0.0F, 0.3927F, 0.0F));
		PartDefinition cube_r88 = body.addOrReplaceChild("cube_r88",
				CubeListBuilder.create().texOffs(11, 35).mirror().addBox(-2.75F, 3.5F, 0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false).texOffs(34, 42).mirror().addBox(-2.75F, -5.25F, 0.5F, 5.0F, 9.0F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(65, 42).mirror().addBox(-2.75F, -4.5F, 0.5F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.25F)).mirror(false).texOffs(11, 35).mirror().addBox(-2.75F, -0.5F, 0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.1F))
						.mirror(false).texOffs(11, 35).mirror().addBox(-2.75F, -4.5F, 0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false),
				PartPose.offsetAndRotation(-2.25F, -19.5926F, 0.0585F, 0.0F, -0.3927F, 0.0F));
		PartDefinition cube_r89 = body.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(19, 44).addBox(0.16F, -0.1818F, -1.3714F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-7.41F, -28.0707F, -3.2903F, 0.1745F, 0.0F, 0.5236F));
		PartDefinition cube_r90 = body.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(13, 74).addBox(0.1673F, -1.7354F, -1.3714F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-7.41F, -28.0707F, -3.2903F, 0.1719F, -0.0302F, 0.6955F));
		PartDefinition cube_r91 = body.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(19, 44).addBox(-2.2584F, -1.5546F, -1.3714F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-7.41F, -28.0707F, -3.2903F, 0.1705F, 0.0376F, 0.3086F));
		PartDefinition cube_r92 = body.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(19, 44).addBox(-2.5686F, -2.3158F, -1.3714F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-7.41F, -28.0707F, -3.2903F, 0.1434F, 0.0998F, -0.0801F));
		PartDefinition cube_r93 = body.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(11, 48).addBox(-2.5639F, -3.1379F, -1.3714F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(-7.41F, -28.0707F, -3.2903F, 0.0945F, 0.147F, -0.473F));
		PartDefinition cube_r94 = body.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(11, 48).addBox(-2.0758F, -3.4488F, 0.7365F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(-7.41F, -28.0707F, -3.2903F, -0.1678F, -0.2564F, -0.4583F));
		PartDefinition cube_r95 = body.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(19, 44).addBox(-2.2367F, -2.7899F, 0.7365F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-7.41F, -28.0707F, -3.2903F, -0.2528F, -0.1733F, -0.0652F));
		PartDefinition cube_r96 = body.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(19, 44).addBox(-2.1331F, -2.1196F, 0.7365F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-7.41F, -28.0707F, -3.2903F, -0.2986F, -0.0651F, 0.3152F));
		PartDefinition cube_r97 = body.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(13, 74).addBox(0.0668F, -2.3053F, 0.7365F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-7.41F, -28.0707F, -3.2903F, -0.3011F, 0.0522F, 0.6902F));
		PartDefinition cube_r98 = body.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(19, 44).addBox(-1.5062F, -3.8331F, 0.5001F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-7.41F, -28.0707F, -3.2903F, -1.0047F, -0.5338F, 0.2109F));
		PartDefinition cube_r99 = body.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(11, 48).addBox(-1.0017F, -4.1331F, 0.5001F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(-7.41F, -28.0707F, -3.2903F, -0.8012F, -0.8452F, -0.1036F));
		PartDefinition cube_r100 = body.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(19, 44).addBox(-1.8575F, -3.363F, 0.5001F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-7.41F, -28.0707F, -3.2903F, -1.0809F, -0.1932F, 0.4216F));
		PartDefinition cube_r101 = body.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(13, 74).addBox(-0.1544F, -3.5595F, 0.5001F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-7.41F, -28.0707F, -3.2903F, -1.0845F, 0.1546F, 0.6048F));
		PartDefinition cube_r102 = body.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(13, 74).addBox(0.1082F, -2.0705F, -2.8116F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-7.41F, -28.0707F, -3.2903F, 0.3011F, -0.0522F, 0.6902F));
		PartDefinition cube_r103 = body.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(19, 44).addBox(-2.1847F, -1.8868F, -2.8116F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-7.41F, -28.0707F, -3.2903F, 0.2986F, 0.0651F, 0.3152F));
		PartDefinition cube_r104 = body.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(19, 44).addBox(-2.3734F, -2.5946F, -2.8116F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-7.41F, -28.0707F, -3.2903F, 0.2528F, 0.1733F, -0.0652F));
		PartDefinition cube_r105 = body.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(11, 48).addBox(-2.2769F, -3.3207F, -2.8116F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(-7.41F, -28.0707F, -3.2903F, 0.1678F, 0.2564F, -0.4583F));
		PartDefinition cube_r106 = body.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(11, 48).addBox(-1.0991F, -4.0711F, -2.7219F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(-7.41F, -28.0707F, -3.2903F, 0.8012F, 0.8452F, -0.1036F));
		PartDefinition cube_r107 = body.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(19, 44).addBox(-1.5724F, -3.7386F, -2.7219F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-7.41F, -28.0707F, -3.2903F, 1.0047F, 0.5338F, 0.2109F));
		PartDefinition cube_r108 = body.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(13, 74).addBox(-0.1343F, -3.4458F, -2.7219F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-7.41F, -28.0707F, -3.2903F, 1.0845F, -0.1546F, 0.6048F));
		PartDefinition cube_r109 = body.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(19, 44).addBox(-1.8825F, -3.2503F, -2.7219F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-7.41F, -28.0707F, -3.2903F, 1.0809F, 0.1932F, 0.4216F));
		PartDefinition cube_r110 = body.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(19, 44).mirror().addBox(-6.16F, -0.1818F, -1.3714F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)).mirror(false),
				PartPose.offsetAndRotation(7.41F, -28.0707F, -3.2903F, 0.1745F, 0.0F, -0.5236F));
		PartDefinition cube_r111 = body.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(13, 74).mirror().addBox(-6.1673F, -1.7354F, -1.3714F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.05F)).mirror(false),
				PartPose.offsetAndRotation(7.41F, -28.0707F, -3.2903F, 0.1719F, 0.0302F, -0.6955F));
		PartDefinition cube_r112 = body.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(19, 44).mirror().addBox(-0.7416F, -1.5546F, -1.3714F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.05F)).mirror(false),
				PartPose.offsetAndRotation(7.41F, -28.0707F, -3.2903F, 0.1705F, -0.0376F, -0.3086F));
		PartDefinition cube_r113 = body.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(19, 44).mirror().addBox(1.5686F, -2.3158F, -1.3714F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.05F)).mirror(false),
				PartPose.offsetAndRotation(7.41F, -28.0707F, -3.2903F, 0.1434F, -0.0998F, 0.0801F));
		PartDefinition cube_r114 = body.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(11, 48).mirror().addBox(1.5639F, -3.1379F, -1.3714F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.1F)).mirror(false),
				PartPose.offsetAndRotation(7.41F, -28.0707F, -3.2903F, 0.0945F, -0.147F, 0.473F));
		PartDefinition cube_r115 = body.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(11, 48).mirror().addBox(1.0758F, -3.4488F, 0.7365F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.1F)).mirror(false),
				PartPose.offsetAndRotation(7.41F, -28.0707F, -3.2903F, -0.1678F, 0.2564F, 0.4583F));
		PartDefinition cube_r116 = body.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(19, 44).mirror().addBox(1.2367F, -2.7899F, 0.7365F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)).mirror(false),
				PartPose.offsetAndRotation(7.41F, -28.0707F, -3.2903F, -0.2528F, 0.1733F, 0.0652F));
		PartDefinition cube_r117 = body.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(19, 44).mirror().addBox(-0.8669F, -2.1196F, 0.7365F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)).mirror(false),
				PartPose.offsetAndRotation(7.41F, -28.0707F, -3.2903F, -0.2986F, 0.0651F, -0.3152F));
		PartDefinition cube_r118 = body.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(13, 74).mirror().addBox(-6.0668F, -2.3053F, 0.7365F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)).mirror(false),
				PartPose.offsetAndRotation(7.41F, -28.0707F, -3.2903F, -0.3011F, -0.0522F, -0.6902F));
		PartDefinition cube_r119 = body.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(19, 44).mirror().addBox(0.5062F, -3.8331F, 0.5001F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)).mirror(false),
				PartPose.offsetAndRotation(7.41F, -28.0707F, -3.2903F, -1.0047F, 0.5338F, -0.2109F));
		PartDefinition cube_r120 = body.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(11, 48).mirror().addBox(0.0017F, -4.1331F, 0.5001F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.1F)).mirror(false),
				PartPose.offsetAndRotation(7.41F, -28.0707F, -3.2903F, -0.8012F, 0.8452F, 0.1036F));
		PartDefinition cube_r121 = body.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(19, 44).mirror().addBox(-1.1425F, -3.363F, 0.5001F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)).mirror(false),
				PartPose.offsetAndRotation(7.41F, -28.0707F, -3.2903F, -1.0809F, 0.1932F, -0.4216F));
		PartDefinition cube_r122 = body.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(13, 74).mirror().addBox(-5.8456F, -3.5595F, 0.5001F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)).mirror(false),
				PartPose.offsetAndRotation(7.41F, -28.0707F, -3.2903F, -1.0845F, -0.1546F, -0.6048F));
		PartDefinition cube_r123 = body.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(13, 74).mirror().addBox(-6.1082F, -2.0705F, -2.8116F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)).mirror(false),
				PartPose.offsetAndRotation(7.41F, -28.0707F, -3.2903F, 0.3011F, 0.0522F, -0.6902F));
		PartDefinition cube_r124 = body.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(19, 44).mirror().addBox(-0.8153F, -1.8868F, -2.8116F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)).mirror(false),
				PartPose.offsetAndRotation(7.41F, -28.0707F, -3.2903F, 0.2986F, -0.0651F, -0.3152F));
		PartDefinition cube_r125 = body.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(19, 44).mirror().addBox(1.3734F, -2.5946F, -2.8116F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)).mirror(false),
				PartPose.offsetAndRotation(7.41F, -28.0707F, -3.2903F, 0.2528F, -0.1733F, 0.0652F));
		PartDefinition cube_r126 = body.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(11, 48).mirror().addBox(1.2769F, -3.3207F, -2.8116F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.1F)).mirror(false),
				PartPose.offsetAndRotation(7.41F, -28.0707F, -3.2903F, 0.1678F, -0.2564F, 0.4583F));
		PartDefinition cube_r127 = body.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(11, 48).mirror().addBox(0.0991F, -4.0711F, -2.7219F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.1F)).mirror(false),
				PartPose.offsetAndRotation(7.41F, -28.0707F, -3.2903F, 0.8012F, -0.8452F, 0.1036F));
		PartDefinition cube_r128 = body.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(19, 44).mirror().addBox(0.5724F, -3.7386F, -2.7219F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)).mirror(false),
				PartPose.offsetAndRotation(7.41F, -28.0707F, -3.2903F, 1.0047F, -0.5338F, -0.2109F));
		PartDefinition cube_r129 = body.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(13, 74).mirror().addBox(-5.8657F, -3.4458F, -2.7219F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)).mirror(false),
				PartPose.offsetAndRotation(7.41F, -28.0707F, -3.2903F, 1.0845F, 0.1546F, -0.6048F));
		PartDefinition cube_r130 = body.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(19, 44).mirror().addBox(-1.1175F, -3.2503F, -2.7219F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)).mirror(false),
				PartPose.offsetAndRotation(7.41F, -28.0707F, -3.2903F, 1.0809F, -0.1932F, -0.4216F));
		PartDefinition cube_r131 = body.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(19, 44).mirror().addBox(-1.1175F, -3.2503F, -2.7219F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)).mirror(false),
				PartPose.offsetAndRotation(11.16F, -26.0707F, -3.2903F, 1.0809F, -0.1932F, -0.0289F));
		PartDefinition cube_r132 = body.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(19, 44).mirror().addBox(-5.8657F, -3.4458F, -2.7219F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)).mirror(false),
				PartPose.offsetAndRotation(11.16F, -26.0707F, -3.2903F, 1.0845F, 0.1546F, -0.2121F));
		PartDefinition cube_r133 = body.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(19, 44).mirror().addBox(0.5724F, -3.7386F, -2.7219F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)).mirror(false),
				PartPose.offsetAndRotation(11.16F, -26.0707F, -3.2903F, 1.0047F, -0.5338F, 0.1818F));
		PartDefinition cube_r134 = body.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(11, 48).mirror().addBox(0.0991F, -4.0711F, -2.7219F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.1F)).mirror(false),
				PartPose.offsetAndRotation(11.16F, -26.0707F, -3.2903F, 0.8012F, -0.8452F, 0.4963F));
		PartDefinition cube_r135 = body.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(11, 48).mirror().addBox(1.2769F, -3.3207F, -2.8116F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.1F)).mirror(false),
				PartPose.offsetAndRotation(11.16F, -26.0707F, -3.2903F, 0.1678F, -0.2564F, 0.851F));
		PartDefinition cube_r136 = body.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(19, 44).mirror().addBox(1.3734F, -2.5946F, -2.8116F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)).mirror(false),
				PartPose.offsetAndRotation(11.16F, -26.0707F, -3.2903F, 0.2528F, -0.1733F, 0.4579F));
		PartDefinition cube_r137 = body.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(19, 44).mirror().addBox(-0.8153F, -1.8868F, -2.8116F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)).mirror(false),
				PartPose.offsetAndRotation(11.16F, -26.0707F, -3.2903F, 0.2986F, -0.0651F, 0.0775F));
		PartDefinition cube_r138 = body.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(19, 44).mirror().addBox(-6.1082F, -2.0705F, -2.8116F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)).mirror(false),
				PartPose.offsetAndRotation(11.16F, -26.0707F, -3.2903F, 0.3011F, 0.0522F, -0.2975F));
		PartDefinition cube_r139 = body.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(19, 44).mirror().addBox(-5.8456F, -3.5595F, 0.5001F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)).mirror(false),
				PartPose.offsetAndRotation(11.16F, -26.0707F, -3.2903F, -1.0845F, -0.1546F, -0.2121F));
		PartDefinition cube_r140 = body.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(19, 44).mirror().addBox(-1.1425F, -3.363F, 0.5001F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)).mirror(false),
				PartPose.offsetAndRotation(11.16F, -26.0707F, -3.2903F, -1.0809F, 0.1932F, -0.0289F));
		PartDefinition cube_r141 = body.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(11, 48).mirror().addBox(0.0017F, -4.1331F, 0.5001F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.1F)).mirror(false),
				PartPose.offsetAndRotation(11.16F, -26.0707F, -3.2903F, -0.8012F, 0.8452F, 0.4963F));
		PartDefinition cube_r142 = body.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(19, 44).mirror().addBox(0.5062F, -3.8331F, 0.5001F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)).mirror(false),
				PartPose.offsetAndRotation(11.16F, -26.0707F, -3.2903F, -1.0047F, 0.5338F, 0.1818F));
		PartDefinition cube_r143 = body.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(19, 44).mirror().addBox(-6.0668F, -2.3053F, 0.7365F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)).mirror(false),
				PartPose.offsetAndRotation(11.16F, -26.0707F, -3.2903F, -0.3011F, -0.0522F, -0.2975F));
		PartDefinition cube_r144 = body.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(19, 44).mirror().addBox(-0.8669F, -2.1196F, 0.7365F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)).mirror(false),
				PartPose.offsetAndRotation(11.16F, -26.0707F, -3.2903F, -0.2986F, 0.0651F, 0.0775F));
		PartDefinition cube_r145 = body.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(19, 44).mirror().addBox(1.2367F, -2.7899F, 0.7365F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)).mirror(false),
				PartPose.offsetAndRotation(11.16F, -26.0707F, -3.2903F, -0.2528F, 0.1733F, 0.4579F));
		PartDefinition cube_r146 = body.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(11, 48).mirror().addBox(1.0758F, -3.4488F, 0.7365F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.1F)).mirror(false),
				PartPose.offsetAndRotation(11.16F, -26.0707F, -3.2903F, -0.1678F, 0.2564F, 0.851F));
		PartDefinition cube_r147 = body.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(11, 48).mirror().addBox(1.5639F, -3.1379F, -1.3714F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.1F)).mirror(false),
				PartPose.offsetAndRotation(11.16F, -26.0707F, -3.2903F, 0.0945F, -0.147F, 0.8657F));
		PartDefinition cube_r148 = body.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(19, 44).mirror().addBox(1.5686F, -2.3158F, -1.3714F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.05F)).mirror(false),
				PartPose.offsetAndRotation(11.16F, -26.0707F, -3.2903F, 0.1434F, -0.0998F, 0.4728F));
		PartDefinition cube_r149 = body.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(19, 44).mirror().addBox(-0.7416F, -1.5546F, -1.3714F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.05F)).mirror(false),
				PartPose.offsetAndRotation(11.16F, -26.0707F, -3.2903F, 0.1705F, -0.0376F, 0.0841F));
		PartDefinition cube_r150 = body.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(19, 44).mirror().addBox(-6.1673F, -1.7354F, -1.3714F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.05F)).mirror(false),
				PartPose.offsetAndRotation(11.16F, -26.0707F, -3.2903F, 0.1719F, 0.0302F, -0.3028F));
		PartDefinition cube_r151 = body.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(19, 44).mirror().addBox(-6.16F, -0.1818F, -1.3714F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)).mirror(false),
				PartPose.offsetAndRotation(11.16F, -26.0707F, -3.2903F, 0.1745F, 0.0F, -0.1309F));
		PartDefinition cube_r152 = body.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(19, 44).addBox(0.1082F, -2.0705F, -2.8116F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-11.16F, -26.0707F, -3.2903F, 0.3011F, -0.0522F, 0.2975F));
		PartDefinition cube_r153 = body.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(19, 44).addBox(-2.1847F, -1.8868F, -2.8116F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-11.16F, -26.0707F, -3.2903F, 0.2986F, 0.0651F, -0.0775F));
		PartDefinition cube_r154 = body.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(19, 44).addBox(-2.3734F, -2.5946F, -2.8116F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-11.16F, -26.0707F, -3.2903F, 0.2528F, 0.1733F, -0.4579F));
		PartDefinition cube_r155 = body.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(11, 48).addBox(-2.2769F, -3.3207F, -2.8116F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(-11.16F, -26.0707F, -3.2903F, 0.1678F, 0.2564F, -0.851F));
		PartDefinition cube_r156 = body.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(11, 48).addBox(-1.0991F, -4.0711F, -2.7219F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(-11.16F, -26.0707F, -3.2903F, 0.8012F, 0.8452F, -0.4963F));
		PartDefinition cube_r157 = body.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(19, 44).addBox(-1.5724F, -3.7386F, -2.7219F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-11.16F, -26.0707F, -3.2903F, 1.0047F, 0.5338F, -0.1818F));
		PartDefinition cube_r158 = body.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(19, 44).addBox(-0.1343F, -3.4458F, -2.7219F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-11.16F, -26.0707F, -3.2903F, 1.0845F, -0.1546F, 0.2121F));
		PartDefinition cube_r159 = body.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(19, 44).addBox(-1.8825F, -3.2503F, -2.7219F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-11.16F, -26.0707F, -3.2903F, 1.0809F, 0.1932F, 0.0289F));
		PartDefinition cube_r160 = body.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(19, 44).addBox(-1.5062F, -3.8331F, 0.5001F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-11.16F, -26.0707F, -3.2903F, -1.0047F, -0.5338F, -0.1818F));
		PartDefinition cube_r161 = body.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(11, 48).addBox(-1.0017F, -4.1331F, 0.5001F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(-11.16F, -26.0707F, -3.2903F, -0.8012F, -0.8452F, -0.4963F));
		PartDefinition cube_r162 = body.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(19, 44).addBox(-1.8575F, -3.363F, 0.5001F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-11.16F, -26.0707F, -3.2903F, -1.0809F, -0.1932F, 0.0289F));
		PartDefinition cube_r163 = body.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(19, 44).addBox(-0.1544F, -3.5595F, 0.5001F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-11.16F, -26.0707F, -3.2903F, -1.0845F, 0.1546F, 0.2121F));
		PartDefinition cube_r164 = body.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(11, 48).addBox(-2.0758F, -3.4488F, 0.7365F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(-11.16F, -26.0707F, -3.2903F, -0.1678F, -0.2564F, -0.851F));
		PartDefinition cube_r165 = body.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(19, 44).addBox(-2.2367F, -2.7899F, 0.7365F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-11.16F, -26.0707F, -3.2903F, -0.2528F, -0.1733F, -0.4579F));
		PartDefinition cube_r166 = body.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(19, 44).addBox(-2.1331F, -2.1196F, 0.7365F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-11.16F, -26.0707F, -3.2903F, -0.2986F, -0.0651F, -0.0775F));
		PartDefinition cube_r167 = body.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(19, 44).addBox(0.0668F, -2.3053F, 0.7365F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-11.16F, -26.0707F, -3.2903F, -0.3011F, 0.0522F, 0.2975F));
		PartDefinition cube_r168 = body.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(11, 48).addBox(-2.5639F, -3.1379F, -1.3714F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(-11.16F, -26.0707F, -3.2903F, 0.0945F, 0.147F, -0.8657F));
		PartDefinition cube_r169 = body.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(19, 44).addBox(-2.5686F, -2.3158F, -1.3714F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-11.16F, -26.0707F, -3.2903F, 0.1434F, 0.0998F, -0.4728F));
		PartDefinition cube_r170 = body.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(19, 44).addBox(-2.2584F, -1.5546F, -1.3714F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-11.16F, -26.0707F, -3.2903F, 0.1705F, 0.0376F, -0.0841F));
		PartDefinition cube_r171 = body.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(19, 44).addBox(0.1673F, -1.7354F, -1.3714F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-11.16F, -26.0707F, -3.2903F, 0.1719F, -0.0302F, 0.3028F));
		PartDefinition cube_r172 = body.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(19, 44).addBox(0.16F, -0.1818F, -1.3714F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-11.16F, -26.0707F, -3.2903F, 0.1745F, 0.0F, 0.1309F));
		PartDefinition cube_r173 = body.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(3, 2).addBox(-1.0F, -2.75F, 0.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -27.7291F, -5.8099F, 0.3927F, 0.0F, 0.0F));
		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.offsetAndRotation(-9.9964F, -23.7669F, 1.5183F, 0.1492F, 0.0415F, 0.378F));
		PartDefinition cube_r174 = right_arm.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(3, 2).mirror().addBox(-3.3835F, -6.3844F, -6.082F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)).mirror(false),
				PartPose.offsetAndRotation(-3.9708F, 21.1141F, -14.9524F, -1.0137F, 0.9441F, -0.6874F));
		PartDefinition cube_r175 = right_arm.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(3, 2).mirror().addBox(-0.2076F, -6.147F, -6.5464F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)).mirror(false),
				PartPose.offsetAndRotation(-3.9708F, 21.1141F, -14.9524F, -2.7612F, 1.2184F, -2.5652F));
		PartDefinition cube_r176 = right_arm.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(3, 2).addBox(-10.4102F, -9.5193F, 3.2117F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(0.9965F, 22.1992F, -3.8286F, 0.3385F, -1.0137F, -0.7409F));
		PartDefinition cube_r177 = right_arm.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(3, 2).addBox(3.6217F, -7.7693F, 1.4762F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(-5.2692F, 25.7885F, -16.6162F, 0.9119F, -1.3468F, -1.3501F));
		PartDefinition cube_r178 = right_arm.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(3, 2).addBox(2.2156F, -7.9377F, -0.8321F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(-4.4056F, 25.4847F, -15.1405F, 3.0784F, -0.4058F, 2.8463F));
		PartDefinition cube_r179 = right_arm.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(3, 2).addBox(-1.9835F, -6.3729F, -4.347F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(-4.2365F, 23.8512F, -16.349F, 3.0425F, 0.9437F, 2.741F));
		PartDefinition cube_r180 = right_arm.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(3, 2).addBox(-10.4102F, -9.5193F, 3.2117F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(0.7465F, 21.0992F, -4.2286F, 0.3385F, -1.0137F, -0.7409F));
		PartDefinition cube_r181 = right_arm.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(3, 2).addBox(3.6217F, -7.7693F, 1.4762F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(-5.5192F, 24.6885F, -17.0162F, 0.9119F, -1.3468F, -1.3501F));
		PartDefinition cube_r182 = right_arm.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(3, 2).addBox(2.2156F, -7.9377F, -0.8321F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(-4.6556F, 24.3847F, -15.5405F, 3.0784F, -0.4058F, 2.8463F));
		PartDefinition cube_r183 = right_arm.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(3, 2).addBox(-1.8024F, -7.4135F, -4.2507F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(-4.2365F, 23.7512F, -16.499F, 3.0425F, 0.9437F, 2.741F));
		PartDefinition cube_r184 = right_arm.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(3, 2).addBox(-10.4102F, -9.5193F, 3.2117F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(0.2465F, 20.1992F, -4.5786F, 0.3385F, -1.0137F, -0.7409F));
		PartDefinition cube_r185 = right_arm.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(3, 2).addBox(3.6217F, -7.7693F, 1.4762F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(-6.0192F, 23.7885F, -17.3662F, 0.9119F, -1.3468F, -1.3501F));
		PartDefinition cube_r186 = right_arm.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(3, 2).addBox(2.2156F, -7.9377F, -0.8321F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(-5.1556F, 23.4847F, -15.8905F, 3.0784F, -0.4058F, 2.8463F));
		PartDefinition cube_r187 = right_arm.addOrReplaceChild("cube_r187",
				CubeListBuilder.create().texOffs(3, 2).addBox(-1.8501F, -8.5182F, -4.4162F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)).texOffs(3, 2).addBox(-1.9367F, -9.4658F, -4.1086F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(-4.2365F, 23.8512F, -16.849F, 3.0425F, 0.9437F, 2.741F));
		PartDefinition cube_r188 = right_arm.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(3, 2).addBox(2.2156F, -7.9377F, -0.8321F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(-5.1556F, 22.4847F, -15.8905F, 3.0784F, -0.4058F, 2.8463F));
		PartDefinition cube_r189 = right_arm.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(3, 2).addBox(3.6217F, -7.7693F, 1.4762F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(-6.0192F, 22.7885F, -17.3662F, 0.9119F, -1.3468F, -1.3501F));
		PartDefinition cube_r190 = right_arm.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(3, 2).addBox(-10.4102F, -9.5193F, 3.2117F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(0.2465F, 19.1992F, -4.5786F, 0.3385F, -1.0137F, -0.7409F));
		PartDefinition cube_r191 = right_arm.addOrReplaceChild("cube_r191",
				CubeListBuilder.create().texOffs(29, 45).addBox(-5.4102F, -10.2693F, -0.0383F, 9.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 50).addBox(-6.4102F, -8.2693F, -0.5383F, 11.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(29, 42).addBox(-5.4102F, -4.2693F, -0.2883F, 9.0F, 0.0F, 7.0F, new CubeDeformation(0.1F)).texOffs(29, 42).addBox(-5.4102F, -10.2693F, -0.2883F, 9.0F, 0.0F, 7.0F, new CubeDeformation(0.1F)).texOffs(29, 45)
						.addBox(-5.4102F, -10.2693F, 5.4617F, 9.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 50).addBox(-6.4102F, -8.2693F, 5.9617F, 11.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 29)
						.addBox(-4.4102F, -9.2693F, 0.7117F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(12, 29).addBox(1.5898F, -9.2693F, 0.7117F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(3, 2)
						.addBox(-5.4102F, -8.2693F, 2.2117F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(3, 2).addBox(-8.4102F, -8.7693F, 3.2117F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0035F, 19.1992F, -5.5786F, 0.3385F, -1.0137F, -0.7409F));
		PartDefinition cube_r192 = right_arm.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(3, 2).addBox(-0.1432F, -7.2707F, 2.9583F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.3889F, 16.6025F, -4.1554F, 0.4601F, -0.5017F, -1.0223F));
		PartDefinition cube_r193 = right_arm.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(3, 2).addBox(-1.7078F, -3.0095F, 3.1329F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9742F, 7.5219F, -2.8125F, 0.4276F, 0.0162F, -1.2094F));
		PartDefinition right_arm2 = right_arm.addOrReplaceChild("right_arm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.252F, 1.0996F, 1.0822F));
		PartDefinition cube_r194 = right_arm2.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(3, 2).mirror().addBox(-3.3835F, -6.3844F, -6.082F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)).mirror(false),
				PartPose.offsetAndRotation(-3.9708F, 21.1141F, -14.9524F, -1.0137F, 0.9441F, -0.6874F));
		PartDefinition cube_r195 = right_arm2.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(3, 2).mirror().addBox(-0.2076F, -6.147F, -6.5464F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)).mirror(false),
				PartPose.offsetAndRotation(-3.9708F, 21.1141F, -14.9524F, -2.7612F, 1.2184F, -2.5652F));
		PartDefinition cube_r196 = right_arm2.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(3, 2).addBox(-10.4102F, -9.5193F, 3.2117F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(0.9965F, 22.1992F, -3.8286F, 0.3385F, -1.0137F, -0.7409F));
		PartDefinition cube_r197 = right_arm2.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(3, 2).addBox(3.6217F, -7.7693F, 1.4762F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(-5.2692F, 25.7885F, -16.6162F, 0.9119F, -1.3468F, -1.3501F));
		PartDefinition cube_r198 = right_arm2.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(3, 2).addBox(2.2156F, -7.9377F, -0.8321F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(-4.4056F, 25.4847F, -15.1405F, 3.0784F, -0.4058F, 2.8463F));
		PartDefinition cube_r199 = right_arm2.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(3, 2).addBox(-1.9835F, -6.3729F, -4.347F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(-4.2365F, 23.8512F, -16.349F, 3.0425F, 0.9437F, 2.741F));
		PartDefinition cube_r200 = right_arm2.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(3, 2).addBox(-10.4102F, -9.5193F, 3.2117F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(0.7465F, 21.0992F, -4.2286F, 0.3385F, -1.0137F, -0.7409F));
		PartDefinition cube_r201 = right_arm2.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(3, 2).addBox(3.6217F, -7.7693F, 1.4762F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(-5.5192F, 24.6885F, -17.0162F, 0.9119F, -1.3468F, -1.3501F));
		PartDefinition cube_r202 = right_arm2.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(3, 2).addBox(2.2156F, -7.9377F, -0.8321F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(-4.6556F, 24.3847F, -15.5405F, 3.0784F, -0.4058F, 2.8463F));
		PartDefinition cube_r203 = right_arm2.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(3, 2).addBox(-1.8024F, -7.4135F, -4.2507F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(-4.2365F, 23.7512F, -16.499F, 3.0425F, 0.9437F, 2.741F));
		PartDefinition cube_r204 = right_arm2.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(3, 2).addBox(-10.4102F, -9.5193F, 3.2117F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(0.2465F, 20.1992F, -4.5786F, 0.3385F, -1.0137F, -0.7409F));
		PartDefinition cube_r205 = right_arm2.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(3, 2).addBox(3.6217F, -7.7693F, 1.4762F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(-6.0192F, 23.7885F, -17.3662F, 0.9119F, -1.3468F, -1.3501F));
		PartDefinition cube_r206 = right_arm2.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(3, 2).addBox(2.2156F, -7.9377F, -0.8321F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(-5.1556F, 23.4847F, -15.8905F, 3.0784F, -0.4058F, 2.8463F));
		PartDefinition cube_r207 = right_arm2.addOrReplaceChild("cube_r207",
				CubeListBuilder.create().texOffs(3, 2).addBox(-1.8501F, -8.5182F, -4.4162F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)).texOffs(3, 2).addBox(-1.9367F, -9.4658F, -4.1086F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(-4.2365F, 23.8512F, -16.849F, 3.0425F, 0.9437F, 2.741F));
		PartDefinition cube_r208 = right_arm2.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(3, 2).addBox(2.2156F, -7.9377F, -0.8321F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(-5.1556F, 22.4847F, -15.8905F, 3.0784F, -0.4058F, 2.8463F));
		PartDefinition cube_r209 = right_arm2.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(3, 2).addBox(3.6217F, -7.7693F, 1.4762F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(-6.0192F, 22.7885F, -17.3662F, 0.9119F, -1.3468F, -1.3501F));
		PartDefinition cube_r210 = right_arm2.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(3, 2).addBox(-10.4102F, -9.5193F, 3.2117F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(0.2465F, 19.1992F, -4.5786F, 0.3385F, -1.0137F, -0.7409F));
		PartDefinition cube_r211 = right_arm2.addOrReplaceChild("cube_r211",
				CubeListBuilder.create().texOffs(29, 45).addBox(-5.4102F, -10.2693F, -0.0383F, 9.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 50).addBox(-6.4102F, -8.2693F, -0.5383F, 11.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(29, 45).addBox(-5.4102F, -4.2693F, -0.2883F, 9.0F, 0.0F, 7.0F, new CubeDeformation(0.1F)).texOffs(29, 45).addBox(-5.4102F, -10.2693F, -0.2883F, 9.0F, 0.0F, 7.0F, new CubeDeformation(0.1F)).texOffs(29, 45)
						.addBox(-5.4102F, -10.2693F, 5.4617F, 9.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 50).addBox(-6.4102F, -8.2693F, 5.9617F, 11.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 29)
						.addBox(-4.4102F, -9.2693F, 0.7117F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(12, 29).addBox(1.5898F, -9.2693F, 0.7117F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(3, 2)
						.addBox(-5.4102F, -8.2693F, 2.2117F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(3, 2).addBox(-8.4102F, -8.7693F, 3.2117F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0035F, 19.1992F, -5.5786F, 0.3385F, -1.0137F, -0.7409F));
		PartDefinition cube_r212 = right_arm2.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(3, 2).addBox(-0.1432F, -7.2707F, 2.9583F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.3889F, 16.6025F, -4.1554F, 0.4601F, -0.5017F, -1.0223F));
		PartDefinition cube_r213 = right_arm2.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(3, 2).addBox(-1.7078F, -3.0095F, 3.1329F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9742F, 7.5219F, -2.8125F, 0.4276F, 0.0162F, -1.2094F));
		PartDefinition blade3 = right_arm2.addOrReplaceChild("blade3",
				CubeListBuilder.create().texOffs(61, 26).addBox(-2.5397F, -12.2167F, 2.8712F, 1.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(38, 26).addBox(-2.5397F, -1.4667F, 2.8712F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.1F))
						.texOffs(45, 35).addBox(-2.5397F, -6.8167F, 2.8712F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)).texOffs(45, 35).addBox(-2.5397F, -5.6167F, 2.8712F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)).texOffs(45, 35)
						.addBox(-2.5397F, -9.2167F, 2.8712F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)).texOffs(45, 35).addBox(-2.5397F, -8.0167F, 2.8712F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)).texOffs(45, 35)
						.addBox(-2.5397F, -11.6167F, 2.8712F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)).texOffs(38, 26).addBox(-2.5397F, -10.4167F, 2.8712F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)).texOffs(45, 35)
						.addBox(-2.5397F, -4.4167F, 2.8712F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)).texOffs(45, 35).addBox(-2.5397F, -3.2167F, 2.8712F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)).texOffs(38, 32)
						.addBox(-2.5397F, -13.2167F, 2.8712F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.2F)).texOffs(38, 26).addBox(-2.5397F, -11.7167F, 2.8712F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.1F)).texOffs(38, 26)
						.addBox(-2.5397F, -1.9167F, 2.8712F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.1F)).texOffs(38, 30).addBox(-3.0397F, -12.2167F, 2.3712F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.25F)).texOffs(39, 19)
						.addBox(-2.5397F, -12.3167F, 1.3712F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.2F)).texOffs(63, 26).addBox(-2.0397F, -22.3167F, 4.0712F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.075F)).texOffs(63, 26)
						.addBox(-2.0397F, -46.8667F, 4.3712F, 0.0F, 12.0F, 1.0F, new CubeDeformation(0.075F)).texOffs(63, 23).addBox(-2.0397F, -35.8667F, 4.2712F, 0.0F, 14.0F, 1.0F, new CubeDeformation(0.075F)).texOffs(70, 27)
						.addBox(-2.0397F, -22.3167F, 3.5712F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.065F)).texOffs(70, 21).addBox(-2.0397F, -35.8667F, 3.4212F, 0.0F, 14.0F, 1.0F, new CubeDeformation(0.065F)).texOffs(70, 29)
						.addBox(-2.0397F, -44.8667F, 3.8712F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.065F)).texOffs(70, 27).addBox(-2.0397F, -40.8667F, 3.6212F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.065F)).texOffs(52, 21)
						.addBox(-2.0397F, -35.3167F, 2.3712F, 0.0F, 16.0F, 2.0F, new CubeDeformation(0.05F)).texOffs(52, 27).addBox(-2.0397F, -44.3167F, 2.7212F, 0.0F, 10.0F, 2.0F, new CubeDeformation(0.05F)).texOffs(52, 27)
						.addBox(-2.0397F, -19.3167F, 2.7212F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-6.0326F, 26.2413F, -14.3389F, 0.2618F, 0.1745F, -0.1745F));
		PartDefinition cube_r214 = blade3.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(52, 27).addBox(-3.9208F, -6.8724F, -4.2263F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(1.8811F, -40.6357F, 1.0348F, -1.0472F, 0.0F, 0.0F));
		PartDefinition cube_r215 = blade3.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(52, 27).addBox(-3.9208F, -7.7133F, -1.504F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(1.8811F, -40.1452F, 0.4458F, -0.6545F, 0.0F, 0.0F));
		PartDefinition cube_r216 = blade3.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(52, 27).addBox(-3.9208F, -7.8239F, 0.423F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(1.8811F, -39.3251F, -0.0277F, -0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r217 = blade3.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(52, 27).addBox(-3.9208F, -6.5524F, 1.6808F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(1.8811F, -39.3477F, -0.1119F, -0.2182F, 0.0F, 0.0F));
		PartDefinition blade = right_arm.addOrReplaceChild("blade",
				CubeListBuilder.create().texOffs(61, 26).addBox(-2.5397F, -12.2167F, 2.8712F, 1.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(38, 26).addBox(-2.5397F, -1.4667F, 2.8712F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.1F))
						.texOffs(45, 35).addBox(-2.5397F, -6.8167F, 2.8712F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)).texOffs(45, 35).addBox(-2.5397F, -5.6167F, 2.8712F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)).texOffs(45, 35)
						.addBox(-2.5397F, -9.2167F, 2.8712F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)).texOffs(45, 35).addBox(-2.5397F, -8.0167F, 2.8712F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)).texOffs(45, 35)
						.addBox(-2.5397F, -11.6167F, 2.8712F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)).texOffs(38, 26).addBox(-2.5397F, -10.4167F, 2.8712F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)).texOffs(45, 35)
						.addBox(-2.5397F, -4.4167F, 2.8712F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)).texOffs(45, 35).addBox(-2.5397F, -3.2167F, 2.8712F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)).texOffs(38, 32)
						.addBox(-2.5397F, -13.2167F, 2.8712F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.2F)).texOffs(38, 26).addBox(-2.5397F, -11.7167F, 2.8712F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.1F)).texOffs(38, 26)
						.addBox(-2.5397F, -1.9167F, 2.8712F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.1F)).texOffs(38, 30).addBox(-3.0397F, -12.2167F, 2.3712F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.25F)).texOffs(39, 19)
						.addBox(-2.5397F, -12.3167F, 1.3712F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.2F)).texOffs(63, 26).addBox(-2.0397F, -22.3167F, 4.0712F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.075F)).texOffs(63, 26)
						.addBox(-2.0397F, -46.8667F, 4.3712F, 0.0F, 12.0F, 1.0F, new CubeDeformation(0.075F)).texOffs(63, 23).addBox(-2.0397F, -35.8667F, 4.2712F, 0.0F, 14.0F, 1.0F, new CubeDeformation(0.075F)).texOffs(70, 27)
						.addBox(-2.0397F, -22.3167F, 3.5712F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.065F)).texOffs(70, 21).addBox(-2.0397F, -35.8667F, 3.4212F, 0.0F, 14.0F, 1.0F, new CubeDeformation(0.065F)).texOffs(70, 29)
						.addBox(-2.0397F, -44.8667F, 3.8712F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.065F)).texOffs(70, 27).addBox(-2.0397F, -40.8667F, 3.6212F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.065F)).texOffs(52, 21)
						.addBox(-2.0397F, -35.3167F, 2.3712F, 0.0F, 16.0F, 2.0F, new CubeDeformation(0.05F)).texOffs(52, 27).addBox(-2.0397F, -44.3167F, 2.7212F, 0.0F, 10.0F, 2.0F, new CubeDeformation(0.05F)).texOffs(52, 27)
						.addBox(-2.0397F, -19.3167F, 2.7212F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-6.0326F, 26.2413F, -14.3389F, 0.2618F, 0.1745F, -0.1745F));
		PartDefinition cube_r218 = blade.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(52, 27).addBox(-3.9208F, -6.8724F, -4.2263F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(1.8811F, -40.6357F, 1.0348F, -1.0472F, 0.0F, 0.0F));
		PartDefinition cube_r219 = blade.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(52, 27).addBox(-3.9208F, -7.7133F, -1.504F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(1.8811F, -40.1452F, 0.4458F, -0.6545F, 0.0F, 0.0F));
		PartDefinition cube_r220 = blade.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(52, 27).addBox(-3.9208F, -7.8239F, 0.423F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(1.8811F, -39.3251F, -0.0277F, -0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r221 = blade.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(52, 27).addBox(-3.9208F, -6.5524F, 1.6808F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(1.8811F, -39.3477F, -0.1119F, -0.2182F, 0.0F, 0.0F));
		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.offsetAndRotation(9.9964F, -23.7669F, 1.5183F, 0.1056F, -0.0415F, -0.378F));
		PartDefinition cube_r222 = left_arm.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(3, 2).addBox(1.3835F, -6.3844F, -6.082F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(3.9708F, 21.1141F, -14.9524F, -1.0137F, -0.9441F, 0.6874F));
		PartDefinition cube_r223 = left_arm.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(3, 2).addBox(-1.7924F, -6.147F, -6.5464F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(3.9708F, 21.1141F, -14.9524F, -2.7612F, -1.2184F, 2.5652F));
		PartDefinition cube_r224 = left_arm.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(3, 2).mirror().addBox(8.4102F, -9.5193F, 3.2117F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)).mirror(false),
				PartPose.offsetAndRotation(-0.9965F, 22.1992F, -3.8286F, 0.3385F, 1.0137F, 0.7409F));
		PartDefinition cube_r225 = left_arm.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(3, 2).mirror().addBox(-5.6217F, -7.7693F, 1.4762F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)).mirror(false),
				PartPose.offsetAndRotation(5.2692F, 25.7885F, -16.6162F, 0.9119F, 1.3468F, 1.3501F));
		PartDefinition cube_r226 = left_arm.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(3, 2).mirror().addBox(-4.2156F, -7.9377F, -0.8321F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)).mirror(false),
				PartPose.offsetAndRotation(4.4056F, 25.4847F, -15.1405F, 3.0784F, 0.4058F, -2.8463F));
		PartDefinition cube_r227 = left_arm.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(3, 2).mirror().addBox(-0.0165F, -6.3729F, -4.347F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)).mirror(false),
				PartPose.offsetAndRotation(4.2365F, 23.8512F, -16.349F, 3.0425F, -0.9437F, -2.741F));
		PartDefinition cube_r228 = left_arm.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(3, 2).mirror().addBox(8.4102F, -9.5193F, 3.2117F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)).mirror(false),
				PartPose.offsetAndRotation(-0.7465F, 21.0992F, -4.2286F, 0.3385F, 1.0137F, 0.7409F));
		PartDefinition cube_r229 = left_arm.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(3, 2).mirror().addBox(-5.6217F, -7.7693F, 1.4762F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)).mirror(false),
				PartPose.offsetAndRotation(5.5192F, 24.6885F, -17.0162F, 0.9119F, 1.3468F, 1.3501F));
		PartDefinition cube_r230 = left_arm.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(3, 2).mirror().addBox(-4.2156F, -7.9377F, -0.8321F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)).mirror(false),
				PartPose.offsetAndRotation(4.6556F, 24.3847F, -15.5405F, 3.0784F, 0.4058F, -2.8463F));
		PartDefinition cube_r231 = left_arm.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(3, 2).mirror().addBox(-0.1976F, -7.4135F, -4.2507F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)).mirror(false),
				PartPose.offsetAndRotation(4.2365F, 23.7512F, -16.499F, 3.0425F, -0.9437F, -2.741F));
		PartDefinition cube_r232 = left_arm.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(3, 2).mirror().addBox(8.4102F, -9.5193F, 3.2117F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)).mirror(false),
				PartPose.offsetAndRotation(-0.2465F, 20.1992F, -4.5786F, 0.3385F, 1.0137F, 0.7409F));
		PartDefinition cube_r233 = left_arm.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(3, 2).mirror().addBox(-5.6217F, -7.7693F, 1.4762F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)).mirror(false),
				PartPose.offsetAndRotation(6.0192F, 23.7885F, -17.3662F, 0.9119F, 1.3468F, 1.3501F));
		PartDefinition cube_r234 = left_arm.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(3, 2).mirror().addBox(-4.2156F, -7.9377F, -0.8321F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)).mirror(false),
				PartPose.offsetAndRotation(5.1556F, 23.4847F, -15.8905F, 3.0784F, 0.4058F, -2.8463F));
		PartDefinition cube_r235 = left_arm.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(3, 2).mirror().addBox(-0.1499F, -8.5182F, -4.4162F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)).mirror(false).texOffs(3, 2).mirror()
				.addBox(-0.0633F, -9.4658F, -4.1086F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)).mirror(false), PartPose.offsetAndRotation(4.2365F, 23.8512F, -16.849F, 3.0425F, -0.9437F, -2.741F));
		PartDefinition cube_r236 = left_arm.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(3, 2).mirror().addBox(-4.2156F, -7.9377F, -0.8321F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)).mirror(false),
				PartPose.offsetAndRotation(5.1556F, 22.4847F, -15.8905F, 3.0784F, 0.4058F, -2.8463F));
		PartDefinition cube_r237 = left_arm.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(3, 2).mirror().addBox(-5.6217F, -7.7693F, 1.4762F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)).mirror(false),
				PartPose.offsetAndRotation(6.0192F, 22.7885F, -17.3662F, 0.9119F, 1.3468F, 1.3501F));
		PartDefinition cube_r238 = left_arm.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(3, 2).mirror().addBox(8.4102F, -9.5193F, 3.2117F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)).mirror(false),
				PartPose.offsetAndRotation(-0.2465F, 19.1992F, -4.5786F, 0.3385F, 1.0137F, 0.7409F));
		PartDefinition cube_r239 = left_arm.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(29, 45).mirror().addBox(-3.5898F, -10.2693F, -0.0383F, 9.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(1, 50).mirror()
				.addBox(-4.5898F, -8.2693F, -0.5383F, 11.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(29, 42).mirror().addBox(-3.5898F, -4.2693F, -0.2883F, 9.0F, 0.0F, 7.0F, new CubeDeformation(0.1F)).mirror(false).texOffs(29, 42)
				.mirror().addBox(-3.5898F, -10.2693F, -0.2883F, 9.0F, 0.0F, 7.0F, new CubeDeformation(0.1F)).mirror(false).texOffs(29, 45).mirror().addBox(-3.5898F, -10.2693F, 5.4617F, 9.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(1, 50).mirror().addBox(-4.5898F, -8.2693F, 5.9617F, 11.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(12, 29).mirror().addBox(3.4102F, -9.2693F, 0.7117F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(12, 29).mirror().addBox(-2.5898F, -9.2693F, 0.7117F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(3, 2).mirror()
				.addBox(-2.5898F, -8.2693F, 2.2117F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(3, 2).mirror().addBox(5.4102F, -8.7693F, 3.2117F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0035F, 19.1992F, -5.5786F, 0.3385F, 1.0137F, 0.7409F));
		PartDefinition cube_r240 = left_arm.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(3, 2).mirror().addBox(-7.8568F, -7.2707F, 2.9583F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.3889F, 16.6025F, -4.1554F, 0.4601F, 0.5017F, 1.0223F));
		PartDefinition cube_r241 = left_arm.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(3, 2).mirror().addBox(-6.2922F, -3.0095F, 3.1329F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.9742F, 7.5219F, -2.8125F, 0.4276F, -0.0162F, 1.2094F));
		PartDefinition left_arm2 = left_arm.addOrReplaceChild("left_arm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -2.7005F, 0.4278F, 1.9353F));
		PartDefinition cube_r242 = left_arm2.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(3, 2).addBox(1.3835F, -6.3844F, -6.082F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(3.9708F, 21.1141F, -14.9524F, -1.0137F, -0.9441F, 0.6874F));
		PartDefinition cube_r243 = left_arm2.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(3, 2).addBox(-1.7924F, -6.147F, -6.5464F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(3.9708F, 21.1141F, -14.9524F, -2.7612F, -1.2184F, 2.5652F));
		PartDefinition cube_r244 = left_arm2.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(3, 2).mirror().addBox(8.4102F, -9.5193F, 3.2117F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)).mirror(false),
				PartPose.offsetAndRotation(-0.9965F, 22.1992F, -3.8286F, 0.3385F, 1.0137F, 0.7409F));
		PartDefinition cube_r245 = left_arm2.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(3, 2).mirror().addBox(-5.6217F, -7.7693F, 1.4762F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)).mirror(false),
				PartPose.offsetAndRotation(5.2692F, 25.7885F, -16.6162F, 0.9119F, 1.3468F, 1.3501F));
		PartDefinition cube_r246 = left_arm2.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(3, 2).mirror().addBox(-4.2156F, -7.9377F, -0.8321F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)).mirror(false),
				PartPose.offsetAndRotation(4.4056F, 25.4847F, -15.1405F, 3.0784F, 0.4058F, -2.8463F));
		PartDefinition cube_r247 = left_arm2.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(3, 2).mirror().addBox(-0.0165F, -6.3729F, -4.347F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)).mirror(false),
				PartPose.offsetAndRotation(4.2365F, 23.8512F, -16.349F, 3.0425F, -0.9437F, -2.741F));
		PartDefinition cube_r248 = left_arm2.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(3, 2).mirror().addBox(8.4102F, -9.5193F, 3.2117F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)).mirror(false),
				PartPose.offsetAndRotation(-0.7465F, 21.0992F, -4.2286F, 0.3385F, 1.0137F, 0.7409F));
		PartDefinition cube_r249 = left_arm2.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(3, 2).mirror().addBox(-5.6217F, -7.7693F, 1.4762F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)).mirror(false),
				PartPose.offsetAndRotation(5.5192F, 24.6885F, -17.0162F, 0.9119F, 1.3468F, 1.3501F));
		PartDefinition cube_r250 = left_arm2.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(3, 2).mirror().addBox(-4.2156F, -7.9377F, -0.8321F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)).mirror(false),
				PartPose.offsetAndRotation(4.6556F, 24.3847F, -15.5405F, 3.0784F, 0.4058F, -2.8463F));
		PartDefinition cube_r251 = left_arm2.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(3, 2).mirror().addBox(-0.1976F, -7.4135F, -4.2507F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)).mirror(false),
				PartPose.offsetAndRotation(4.2365F, 23.7512F, -16.499F, 3.0425F, -0.9437F, -2.741F));
		PartDefinition cube_r252 = left_arm2.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(3, 2).mirror().addBox(8.4102F, -9.5193F, 3.2117F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)).mirror(false),
				PartPose.offsetAndRotation(-0.2465F, 20.1992F, -4.5786F, 0.3385F, 1.0137F, 0.7409F));
		PartDefinition cube_r253 = left_arm2.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(3, 2).mirror().addBox(-5.6217F, -7.7693F, 1.4762F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)).mirror(false),
				PartPose.offsetAndRotation(6.0192F, 23.7885F, -17.3662F, 0.9119F, 1.3468F, 1.3501F));
		PartDefinition cube_r254 = left_arm2.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(3, 2).mirror().addBox(-4.2156F, -7.9377F, -0.8321F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)).mirror(false),
				PartPose.offsetAndRotation(5.1556F, 23.4847F, -15.8905F, 3.0784F, 0.4058F, -2.8463F));
		PartDefinition cube_r255 = left_arm2.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(3, 2).mirror().addBox(-0.1499F, -8.5182F, -4.4162F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)).mirror(false).texOffs(3, 2).mirror()
				.addBox(-0.0633F, -9.4658F, -4.1086F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)).mirror(false), PartPose.offsetAndRotation(4.2365F, 23.8512F, -16.849F, 3.0425F, -0.9437F, -2.741F));
		PartDefinition cube_r256 = left_arm2.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(3, 2).mirror().addBox(-4.2156F, -7.9377F, -0.8321F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)).mirror(false),
				PartPose.offsetAndRotation(5.1556F, 22.4847F, -15.8905F, 3.0784F, 0.4058F, -2.8463F));
		PartDefinition cube_r257 = left_arm2.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(3, 2).mirror().addBox(-5.6217F, -7.7693F, 1.4762F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)).mirror(false),
				PartPose.offsetAndRotation(6.0192F, 22.7885F, -17.3662F, 0.9119F, 1.3468F, 1.3501F));
		PartDefinition cube_r258 = left_arm2.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(3, 2).mirror().addBox(8.4102F, -9.5193F, 3.2117F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)).mirror(false),
				PartPose.offsetAndRotation(-0.2465F, 19.1992F, -4.5786F, 0.3385F, 1.0137F, 0.7409F));
		PartDefinition cube_r259 = left_arm2.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(29, 45).mirror().addBox(-3.5898F, -10.2693F, -0.0383F, 9.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(1, 50).mirror()
				.addBox(-4.5898F, -8.2693F, -0.5383F, 11.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(29, 45).mirror().addBox(-3.5898F, -4.2693F, -0.2883F, 9.0F, 0.0F, 7.0F, new CubeDeformation(0.1F)).mirror(false).texOffs(29, 45)
				.mirror().addBox(-3.5898F, -10.2693F, -0.2883F, 9.0F, 0.0F, 7.0F, new CubeDeformation(0.1F)).mirror(false).texOffs(29, 45).mirror().addBox(-3.5898F, -10.2693F, 5.4617F, 9.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(1, 50).mirror().addBox(-4.5898F, -8.2693F, 5.9617F, 11.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(12, 29).mirror().addBox(3.4102F, -9.2693F, 0.7117F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(12, 29).mirror().addBox(-2.5898F, -9.2693F, 0.7117F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(3, 2).mirror()
				.addBox(-2.5898F, -8.2693F, 2.2117F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(3, 2).mirror().addBox(5.4102F, -8.7693F, 3.2117F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0035F, 19.1992F, -5.5786F, 0.3385F, 1.0137F, 0.7409F));
		PartDefinition cube_r260 = left_arm2.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(3, 2).mirror().addBox(-7.8568F, -7.2707F, 2.9583F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.3889F, 16.6025F, -4.1554F, 0.4601F, 0.5017F, 1.0223F));
		PartDefinition cube_r261 = left_arm2.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(3, 2).mirror().addBox(-6.2922F, -3.0095F, 3.1329F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.9742F, 7.5219F, -2.8125F, 0.4276F, -0.0162F, 1.2094F));
		PartDefinition blade4 = left_arm2.addOrReplaceChild("blade4", CubeListBuilder.create().texOffs(61, 26).mirror().addBox(1.5397F, -12.2167F, 2.8712F, 1.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(38, 26).mirror()
				.addBox(1.5397F, -1.4667F, 2.8712F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.1F)).mirror(false).texOffs(45, 35).mirror().addBox(1.5397F, -6.8167F, 2.8712F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)).mirror(false).texOffs(45, 35)
				.mirror().addBox(1.5397F, -5.6167F, 2.8712F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)).mirror(false).texOffs(45, 35).mirror().addBox(1.5397F, -9.2167F, 2.8712F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)).mirror(false)
				.texOffs(45, 35).mirror().addBox(1.5397F, -8.0167F, 2.8712F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)).mirror(false).texOffs(45, 35).mirror().addBox(1.5397F, -11.6167F, 2.8712F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.05F))
				.mirror(false).texOffs(38, 26).mirror().addBox(1.5397F, -10.4167F, 2.8712F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)).mirror(false).texOffs(45, 35).mirror()
				.addBox(1.5397F, -4.4167F, 2.8712F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)).mirror(false).texOffs(45, 35).mirror().addBox(1.5397F, -3.2167F, 2.8712F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)).mirror(false).texOffs(38, 32)
				.mirror().addBox(1.5397F, -13.2167F, 2.8712F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.2F)).mirror(false).texOffs(38, 26).mirror().addBox(1.5397F, -11.7167F, 2.8712F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.1F)).mirror(false)
				.texOffs(38, 26).mirror().addBox(1.5397F, -1.9167F, 2.8712F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.1F)).mirror(false).texOffs(38, 30).mirror().addBox(1.0397F, -12.2167F, 2.3712F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.25F))
				.mirror(false).texOffs(39, 19).mirror().addBox(1.5397F, -12.3167F, 1.3712F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.2F)).mirror(false).texOffs(63, 26).mirror()
				.addBox(2.0397F, -22.3167F, 4.0712F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.075F)).mirror(false).texOffs(63, 26).mirror().addBox(2.0397F, -46.8667F, 4.3712F, 0.0F, 12.0F, 1.0F, new CubeDeformation(0.075F)).mirror(false)
				.texOffs(63, 23).mirror().addBox(2.0397F, -35.8667F, 4.2712F, 0.0F, 14.0F, 1.0F, new CubeDeformation(0.075F)).mirror(false).texOffs(76, 27).mirror().addBox(2.0397F, -22.3167F, 3.5712F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.065F))
				.mirror(false).texOffs(76, 21).mirror().addBox(2.0397F, -35.8667F, 3.4212F, 0.0F, 14.0F, 1.0F, new CubeDeformation(0.065F)).mirror(false).texOffs(76, 29).mirror()
				.addBox(2.0397F, -44.8667F, 3.8712F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.065F)).mirror(false).texOffs(76, 27).mirror().addBox(2.0397F, -40.8667F, 3.6212F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.065F)).mirror(false)
				.texOffs(57, 21).mirror().addBox(2.0397F, -35.3167F, 2.3712F, 0.0F, 16.0F, 2.0F, new CubeDeformation(0.05F)).mirror(false).texOffs(57, 27).mirror().addBox(2.0397F, -44.3167F, 2.7212F, 0.0F, 10.0F, 2.0F, new CubeDeformation(0.05F))
				.mirror(false).texOffs(57, 27).mirror().addBox(2.0397F, -19.3167F, 2.7212F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.05F)).mirror(false), PartPose.offsetAndRotation(6.0326F, 26.2413F, -14.3389F, 0.2618F, -0.1745F, 0.1745F));
		PartDefinition cube_r262 = blade4.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(57, 27).mirror().addBox(3.9208F, -6.8724F, -4.2263F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.05F)).mirror(false),
				PartPose.offsetAndRotation(-1.8811F, -40.6357F, 1.0348F, -1.0472F, 0.0F, 0.0F));
		PartDefinition cube_r263 = blade4.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(57, 27).mirror().addBox(3.9208F, -7.7133F, -1.504F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.05F)).mirror(false),
				PartPose.offsetAndRotation(-1.8811F, -40.1452F, 0.4458F, -0.6545F, 0.0F, 0.0F));
		PartDefinition cube_r264 = blade4.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(57, 27).mirror().addBox(3.9208F, -7.8239F, 0.423F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)).mirror(false),
				PartPose.offsetAndRotation(-1.8811F, -39.3251F, -0.0277F, -0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r265 = blade4.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(57, 27).mirror().addBox(3.9208F, -6.5524F, 1.6808F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)).mirror(false),
				PartPose.offsetAndRotation(-1.8811F, -39.3477F, -0.1119F, -0.2182F, 0.0F, 0.0F));
		PartDefinition blade2 = left_arm.addOrReplaceChild("blade2", CubeListBuilder.create().texOffs(61, 26).mirror().addBox(1.5397F, -12.2167F, 2.8712F, 1.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(38, 26).mirror()
				.addBox(1.5397F, -1.4667F, 2.8712F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.1F)).mirror(false).texOffs(45, 35).mirror().addBox(1.5397F, -6.8167F, 2.8712F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)).mirror(false).texOffs(45, 35)
				.mirror().addBox(1.5397F, -5.6167F, 2.8712F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)).mirror(false).texOffs(45, 35).mirror().addBox(1.5397F, -9.2167F, 2.8712F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)).mirror(false)
				.texOffs(45, 35).mirror().addBox(1.5397F, -8.0167F, 2.8712F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)).mirror(false).texOffs(45, 35).mirror().addBox(1.5397F, -11.6167F, 2.8712F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.05F))
				.mirror(false).texOffs(38, 26).mirror().addBox(1.5397F, -10.4167F, 2.8712F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)).mirror(false).texOffs(45, 35).mirror()
				.addBox(1.5397F, -4.4167F, 2.8712F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)).mirror(false).texOffs(45, 35).mirror().addBox(1.5397F, -3.2167F, 2.8712F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)).mirror(false).texOffs(38, 32)
				.mirror().addBox(1.5397F, -13.2167F, 2.8712F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.2F)).mirror(false).texOffs(38, 26).mirror().addBox(1.5397F, -11.7167F, 2.8712F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.1F)).mirror(false)
				.texOffs(38, 26).mirror().addBox(1.5397F, -1.9167F, 2.8712F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.1F)).mirror(false).texOffs(38, 30).mirror().addBox(1.0397F, -12.2167F, 2.3712F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.25F))
				.mirror(false).texOffs(39, 19).mirror().addBox(1.5397F, -12.3167F, 1.3712F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.2F)).mirror(false).texOffs(63, 26).mirror()
				.addBox(2.0397F, -22.3167F, 4.0712F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.075F)).mirror(false).texOffs(63, 26).mirror().addBox(2.0397F, -46.8667F, 4.3712F, 0.0F, 12.0F, 1.0F, new CubeDeformation(0.075F)).mirror(false)
				.texOffs(63, 23).mirror().addBox(2.0397F, -35.8667F, 4.2712F, 0.0F, 14.0F, 1.0F, new CubeDeformation(0.075F)).mirror(false).texOffs(76, 27).mirror().addBox(2.0397F, -22.3167F, 3.5712F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.065F))
				.mirror(false).texOffs(76, 21).mirror().addBox(2.0397F, -35.8667F, 3.4212F, 0.0F, 14.0F, 1.0F, new CubeDeformation(0.065F)).mirror(false).texOffs(76, 29).mirror()
				.addBox(2.0397F, -44.8667F, 3.8712F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.065F)).mirror(false).texOffs(76, 27).mirror().addBox(2.0397F, -40.8667F, 3.6212F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.065F)).mirror(false)
				.texOffs(57, 21).mirror().addBox(2.0397F, -35.3167F, 2.3712F, 0.0F, 16.0F, 2.0F, new CubeDeformation(0.05F)).mirror(false).texOffs(57, 27).mirror().addBox(2.0397F, -44.3167F, 2.7212F, 0.0F, 10.0F, 2.0F, new CubeDeformation(0.05F))
				.mirror(false).texOffs(57, 27).mirror().addBox(2.0397F, -19.3167F, 2.7212F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.05F)).mirror(false), PartPose.offsetAndRotation(6.0326F, 26.2413F, -14.3389F, 0.2618F, -0.1745F, 0.1745F));
		PartDefinition cube_r266 = blade2.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(57, 27).mirror().addBox(3.9208F, -6.8724F, -4.2263F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.05F)).mirror(false),
				PartPose.offsetAndRotation(-1.8811F, -40.6357F, 1.0348F, -1.0472F, 0.0F, 0.0F));
		PartDefinition cube_r267 = blade2.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(57, 27).mirror().addBox(3.9208F, -7.7133F, -1.504F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.05F)).mirror(false),
				PartPose.offsetAndRotation(-1.8811F, -40.1452F, 0.4458F, -0.6545F, 0.0F, 0.0F));
		PartDefinition cube_r268 = blade2.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(57, 27).mirror().addBox(3.9208F, -7.8239F, 0.423F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)).mirror(false),
				PartPose.offsetAndRotation(-1.8811F, -39.3251F, -0.0277F, -0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r269 = blade2.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(57, 27).mirror().addBox(3.9208F, -6.5524F, 1.6808F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)).mirror(false),
				PartPose.offsetAndRotation(-1.8811F, -39.3477F, -0.1119F, -0.2182F, 0.0F, 0.0F));
		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(3, 2).addBox(-13.1F, 31.9F, -7.0F, 7.0F, 2.0F, 6.0F, new CubeDeformation(-0.5F)).texOffs(3, 2)
				.addBox(-13.1F, 30.4F, -5.0F, 7.0F, 3.0F, 9.0F, new CubeDeformation(-0.25F)).texOffs(3, 2).addBox(-13.1F, 30.4F, -1.5F, 7.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.9057F, -9.0539F, 0.3935F));
		PartDefinition cube_r270 = right_leg.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(3, 2).addBox(-1.7628F, 3.7938F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(-8.2372F, 17.7062F, 1.2131F, 0.0436F, -0.0019F, 0.0436F));
		PartDefinition cube_r271 = right_leg.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(3, 2).addBox(1.1362F, 0.9231F, -1.0668F, 2.0F, 13.0F, 2.0F, new CubeDeformation(-0.35F)),
				PartPose.offsetAndRotation(-6.8072F, 8.7818F, 1.1086F, 0.043F, -0.0076F, 0.3489F));
		PartDefinition cube_r272 = right_leg.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(8, 51).addBox(-5.6375F, 3.9076F, -4.6629F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-7.8037F, 20.7761F, 1.1065F, -0.8143F, -1.451F, 0.7204F));
		PartDefinition cube_r273 = right_leg.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(8, 51).addBox(-5.3594F, 4.1503F, -4.1724F, 3.0F, 2.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-7.8037F, 20.7761F, 1.1065F, 0.043F, -0.0076F, -0.0002F));
		PartDefinition cube_r274 = right_leg.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(8, 51).addBox(-5.6375F, 3.9076F, -4.3371F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-7.8037F, 20.7761F, 1.1065F, 0.8143F, 1.451F, 0.7204F));
		PartDefinition cube_r275 = right_leg.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(8, 51).mirror().addBox(1.3491F, 4.2187F, -5.0845F, 3.0F, 2.0F, 10.0F, new CubeDeformation(0.2F)).mirror(false),
				PartPose.offsetAndRotation(-7.8037F, 20.7761F, 1.1065F, 0.0378F, 0.0218F, -0.3487F));
		PartDefinition cube_r276 = right_leg.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(6, 27).mirror().addBox(1.3491F, 4.2187F, -5.0845F, 3.0F, 2.0F, 10.0F, new CubeDeformation(0.05F)).mirror(false).texOffs(52, 57).mirror()
				.addBox(1.3491F, -4.7813F, -5.0845F, 3.0F, 11.0F, 10.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-7.8037F, 21.7761F, 1.1065F, 0.0378F, 0.0218F, -0.3487F));
		PartDefinition cube_r277 = right_leg.addOrReplaceChild("cube_r277",
				CubeListBuilder.create().texOffs(6, 27).addBox(-5.6375F, 3.9076F, -4.3371F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.05F)).texOffs(52, 57).addBox(-5.6375F, -5.0924F, -3.3371F, 2.0F, 11.0F, 7.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(-7.8037F, 21.7761F, 1.1065F, 0.8143F, 1.451F, 0.7204F));
		PartDefinition cube_r278 = right_leg.addOrReplaceChild("cube_r278",
				CubeListBuilder.create().texOffs(6, 27).addBox(-5.3594F, 4.1503F, -4.1724F, 3.0F, 2.0F, 9.0F, new CubeDeformation(0.05F)).texOffs(52, 57).addBox(-5.3594F, -4.8497F, -4.1724F, 3.0F, 11.0F, 9.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(-7.8037F, 21.7761F, 1.1065F, 0.043F, -0.0076F, -0.0002F));
		PartDefinition cube_r279 = right_leg.addOrReplaceChild("cube_r279",
				CubeListBuilder.create().texOffs(6, 27).addBox(-5.6375F, 3.9076F, -4.6629F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.05F)).texOffs(53, 57).addBox(-5.6375F, -5.0924F, -3.6629F, 2.0F, 11.0F, 7.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(-7.8037F, 21.7761F, 1.1065F, -0.8143F, -1.451F, 0.7204F));
		PartDefinition cube_r280 = right_leg.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(9, 51).mirror().addBox(2.8652F, 0.9999F, -4.6533F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.5F)).mirror(false).texOffs(52, 57).mirror()
				.addBox(2.8652F, -9.0001F, -3.6533F, 3.0F, 10.0F, 8.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-4.8072F, 8.7818F, 1.1086F, 0.0426F, 0.0094F, 0.3056F));
		PartDefinition cube_r281 = right_leg.addOrReplaceChild("cube_r281",
				CubeListBuilder.create().texOffs(20, 52).addBox(-4.9575F, 3.5319F, -3.187F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.5F)).texOffs(52, 57).addBox(-5.9575F, -8.4681F, -2.187F, 3.0F, 12.0F, 8.0F, new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(-4.8072F, 8.7818F, 1.1086F, 1.2629F, 1.2966F, 1.5253F));
		PartDefinition cube_r282 = right_leg.addOrReplaceChild("cube_r282",
				CubeListBuilder.create().texOffs(20, 53).addBox(-4.6053F, 3.4307F, -4.7615F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.5F)).texOffs(52, 57).addBox(-4.6053F, -5.5693F, -3.7615F, 3.0F, 9.0F, 8.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(-4.8072F, 8.7818F, 1.1086F, 0.041F, -0.0149F, 0.5233F));
		PartDefinition cube_r283 = right_leg.addOrReplaceChild("cube_r283",
				CubeListBuilder.create().texOffs(20, 52).addBox(-3.9615F, 3.533F, -5.7633F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.5F)).texOffs(52, 57).addBox(-5.9615F, -8.467F, -5.7633F, 3.0F, 12.0F, 8.0F, new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(-4.8072F, 8.7818F, 1.1086F, -1.2629F, -1.2966F, 1.5253F));
		PartDefinition cube_r284 = right_leg.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(52, 57).addBox(-5.5489F, -4.6807F, -3.013F, 3.0F, 12.0F, 8.0F, new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(-6.7335F, 13.7599F, 1.1086F, 1.2629F, 1.2966F, 1.1763F));
		PartDefinition cube_r285 = right_leg.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(52, 57).addBox(-5.5528F, -4.6796F, -4.9373F, 3.0F, 12.0F, 8.0F, new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(-6.7335F, 13.7599F, 1.1086F, -1.2629F, -1.2966F, 1.1763F));
		PartDefinition cube_r286 = right_leg.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(52, 57).mirror().addBox(2.1365F, -6.1277F, -3.74F, 3.0F, 11.0F, 8.0F, new CubeDeformation(-0.1F)).mirror(false),
				PartPose.offsetAndRotation(-6.7335F, 13.7599F, 1.1086F, 0.0426F, 0.0094F, -0.0434F));
		PartDefinition cube_r287 = right_leg.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(52, 57).addBox(-4.912F, -4.5833F, -3.8384F, 3.0F, 12.0F, 8.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(-6.7335F, 13.7599F, 1.1086F, 0.041F, -0.0149F, 0.1742F));
		PartDefinition cube_r288 = right_leg.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(52, 57).addBox(-6.7008F, -6.9973F, -1.9359F, 6.0F, 2.0F, 4.0F, new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(-4.8072F, 8.7818F, 1.1086F, 0.041F, -0.0149F, 0.5233F));
		PartDefinition cube_r289 = right_leg.addOrReplaceChild("cube_r289",
				CubeListBuilder.create().texOffs(8, 56).addBox(-10.4024F, -7.5844F, -1.9359F, 8.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(52, 57).addBox(-5.4024F, -8.5844F, -1.9359F, 4.0F, 6.0F, 4.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(-4.8072F, 8.7818F, 1.1086F, 0.0322F, -0.0295F, 0.9158F));
		PartDefinition cube_r290 = right_leg.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(3, 2).addBox(-0.6054F, -10.9806F, -1.0668F, 2.0F, 13.0F, 2.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(-4.8072F, 8.7818F, 1.1086F, 0.0416F, -0.0131F, 0.4797F));
		PartDefinition left_leg = partdefinition.addOrReplaceChild(
				"left_leg", CubeListBuilder.create().texOffs(3, 2).mirror().addBox(6.1F, 31.9F, -7.0F, 7.0F, 2.0F, 6.0F, new CubeDeformation(-0.5F)).mirror(false).texOffs(3, 2).mirror()
						.addBox(6.1F, 30.4F, -5.0F, 7.0F, 3.0F, 9.0F, new CubeDeformation(-0.25F)).mirror(false).texOffs(3, 2).mirror().addBox(6.1F, 30.4F, -1.5F, 7.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(2.9057F, -9.0539F, 0.3935F));
		PartDefinition cube_r291 = left_leg.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(3, 2).mirror().addBox(-0.2372F, 3.7938F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false),
				PartPose.offsetAndRotation(8.2372F, 17.7062F, 1.2131F, 0.0436F, 0.0019F, -0.0436F));
		PartDefinition cube_r292 = left_leg.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(3, 2).mirror().addBox(-3.1362F, 0.9231F, -1.0668F, 2.0F, 13.0F, 2.0F, new CubeDeformation(-0.35F)).mirror(false),
				PartPose.offsetAndRotation(6.8072F, 8.7818F, 1.1086F, 0.043F, 0.0076F, -0.3489F));
		PartDefinition cube_r293 = left_leg.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(8, 51).mirror().addBox(2.3594F, 4.1503F, -4.1724F, 3.0F, 2.0F, 9.0F, new CubeDeformation(0.2F)).mirror(false),
				PartPose.offsetAndRotation(7.8037F, 20.7761F, 1.1065F, 0.043F, 0.0076F, 0.0002F));
		PartDefinition cube_r294 = left_leg.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(8, 51).mirror().addBox(3.6375F, 3.9076F, -4.6629F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.2F)).mirror(false),
				PartPose.offsetAndRotation(7.8037F, 20.7761F, 1.1065F, -0.8143F, 1.451F, -0.7204F));
		PartDefinition cube_r295 = left_leg.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(8, 51).mirror().addBox(3.6375F, 3.9076F, -4.3371F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.2F)).mirror(false),
				PartPose.offsetAndRotation(7.8037F, 20.7761F, 1.1065F, 0.8143F, -1.451F, -0.7204F));
		PartDefinition cube_r296 = left_leg.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(8, 51).addBox(-4.3491F, 4.2187F, -5.0845F, 3.0F, 2.0F, 10.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(7.8037F, 20.7761F, 1.1065F, 0.0378F, -0.0218F, 0.3487F));
		PartDefinition cube_r297 = left_leg.addOrReplaceChild("cube_r297",
				CubeListBuilder.create().texOffs(6, 27).addBox(-4.3491F, 4.2187F, -5.0845F, 3.0F, 2.0F, 10.0F, new CubeDeformation(0.05F)).texOffs(52, 57).addBox(-4.3491F, -4.7813F, -5.0845F, 3.0F, 11.0F, 10.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(7.8037F, 21.7761F, 1.1065F, 0.0378F, -0.0218F, 0.3487F));
		PartDefinition cube_r298 = left_leg.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(6, 27).mirror().addBox(3.6375F, 3.9076F, -4.3371F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.05F)).mirror(false).texOffs(52, 57).mirror()
				.addBox(3.6375F, -5.0924F, -3.3371F, 2.0F, 11.0F, 7.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(7.8037F, 21.7761F, 1.1065F, 0.8143F, -1.451F, -0.7204F));
		PartDefinition cube_r299 = left_leg.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(6, 27).mirror().addBox(2.3594F, 4.1503F, -4.1724F, 3.0F, 2.0F, 9.0F, new CubeDeformation(0.05F)).mirror(false).texOffs(52, 57).mirror()
				.addBox(2.3594F, -4.8497F, -4.1724F, 3.0F, 11.0F, 9.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(7.8037F, 21.7761F, 1.1065F, 0.043F, 0.0076F, 0.0002F));
		PartDefinition cube_r300 = left_leg.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(6, 27).mirror().addBox(3.6375F, 3.9076F, -4.6629F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.05F)).mirror(false).texOffs(53, 57).mirror()
				.addBox(3.6375F, -5.0924F, -3.6629F, 2.0F, 11.0F, 7.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(7.8037F, 21.7761F, 1.1065F, -0.8143F, 1.451F, -0.7204F));
		PartDefinition cube_r301 = left_leg.addOrReplaceChild("cube_r301",
				CubeListBuilder.create().texOffs(9, 51).addBox(-5.8652F, 0.9999F, -4.6533F, 3.0F, 1.0F, 10.0F, new CubeDeformation(0.5F)).texOffs(52, 57).addBox(-5.8652F, -9.0001F, -3.6533F, 3.0F, 10.0F, 8.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(4.8072F, 8.7818F, 1.1086F, 0.0426F, -0.0094F, -0.3056F));
		PartDefinition cube_r302 = left_leg.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(20, 52).mirror().addBox(2.9575F, 3.5319F, -3.187F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.5F)).mirror(false).texOffs(52, 57).mirror()
				.addBox(2.9575F, -8.4681F, -2.187F, 3.0F, 12.0F, 8.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(4.8072F, 8.7818F, 1.1086F, 1.2629F, -1.2966F, -1.5253F));
		PartDefinition cube_r303 = left_leg.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(20, 53).mirror().addBox(3.6053F, 3.4307F, -4.7615F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.5F)).mirror(false).texOffs(52, 57).mirror()
				.addBox(1.6053F, -5.5693F, -3.7615F, 3.0F, 9.0F, 8.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(4.8072F, 8.7818F, 1.1086F, 0.041F, 0.0149F, -0.5233F));
		PartDefinition cube_r304 = left_leg.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(20, 52).mirror().addBox(2.9615F, 3.533F, -5.7633F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.5F)).mirror(false).texOffs(52, 57).mirror()
				.addBox(2.9615F, -8.467F, -5.7633F, 3.0F, 12.0F, 8.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(4.8072F, 8.7818F, 1.1086F, -1.2629F, 1.2966F, -1.5253F));
		PartDefinition cube_r305 = left_leg.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(52, 57).mirror().addBox(2.5489F, -4.6807F, -3.013F, 3.0F, 12.0F, 8.0F, new CubeDeformation(-0.25F)).mirror(false),
				PartPose.offsetAndRotation(6.7335F, 13.7599F, 1.1086F, 1.2629F, -1.2966F, -1.1763F));
		PartDefinition cube_r306 = left_leg.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(52, 57).mirror().addBox(2.5528F, -4.6796F, -4.9373F, 3.0F, 12.0F, 8.0F, new CubeDeformation(-0.25F)).mirror(false),
				PartPose.offsetAndRotation(6.7335F, 13.7599F, 1.1086F, -1.2629F, 1.2966F, -1.1763F));
		PartDefinition cube_r307 = left_leg.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(52, 57).addBox(-5.1365F, -6.1277F, -3.74F, 3.0F, 11.0F, 8.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(6.7335F, 13.7599F, 1.1086F, 0.0426F, -0.0094F, 0.0434F));
		PartDefinition cube_r308 = left_leg.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(52, 57).mirror().addBox(1.912F, -4.5833F, -3.8384F, 3.0F, 12.0F, 8.0F, new CubeDeformation(-0.1F)).mirror(false),
				PartPose.offsetAndRotation(6.7335F, 13.7599F, 1.1086F, 0.041F, 0.0149F, -0.1742F));
		PartDefinition cube_r309 = left_leg.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(52, 57).mirror().addBox(0.7008F, -6.9973F, -1.9359F, 6.0F, 2.0F, 4.0F, new CubeDeformation(-0.25F)).mirror(false),
				PartPose.offsetAndRotation(4.8072F, 8.7818F, 1.1086F, 0.041F, 0.0149F, -0.5233F));
		PartDefinition cube_r310 = left_leg.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(8, 56).mirror().addBox(2.4024F, -7.5844F, -1.9359F, 8.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(52, 57).mirror()
				.addBox(1.4024F, -8.5844F, -1.9359F, 4.0F, 6.0F, 4.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(4.8072F, 8.7818F, 1.1086F, 0.0322F, 0.0295F, -0.9158F));
		PartDefinition cube_r311 = left_leg.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(3, 2).mirror().addBox(-1.3946F, -10.9806F, -1.0668F, 2.0F, 13.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false),
				PartPose.offsetAndRotation(4.8072F, 8.7818F, 1.1086F, 0.0416F, 0.0131F, -0.4797F));
		return LayerDefinition.create(meshdefinition, 80, 80);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.right_arm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.left_leg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.left_arm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.right_leg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
