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

// Made with Blockbench 4.5.0
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelbosshiro_phase2<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("ranahiromod", "modelbosshiro_phase_2"), "main");
	public final ModelPart Head;
	public final ModelPart Body;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public Modelbosshiro_phase2(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(32, 6).addBox(-4.5F, -2.25F, -2.5F, 9.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(33, 5).addBox(-4.0F, 0.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(33, 5)
						.addBox(3.0F, 0.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(33, 5).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(54, 0)
						.addBox(-3.0F, 0.0F, -2.1F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.1F)).texOffs(54, 0).addBox(0.0F, 0.0F, -2.1F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.1F)).texOffs(54, 0)
						.addBox(-0.5F, 5.3F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.1F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Body_r1 = Body.addOrReplaceChild("Body_r1", CubeListBuilder.create().texOffs(33, 5).mirror().addBox(-2.0F, -1.5F, -2.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.2F)).mirror(false).texOffs(33, 5).mirror()
				.addBox(-2.5F, 2.0F, -1.9F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offsetAndRotation(2.5F, 3.75F, -0.1F, 0.0F, 0.0F, -0.3054F));
		PartDefinition Body_r2 = Body.addOrReplaceChild("Body_r2", CubeListBuilder.create().texOffs(33, 5).addBox(1.0F, 2.0F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-2.5F, 7.75F, 0.0F, 0.0F, 0.0F, 0.3054F));
		PartDefinition Body_r3 = Body.addOrReplaceChild("Body_r3", CubeListBuilder.create().texOffs(33, 5).mirror().addBox(-3.0F, 2.0F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.1F)).mirror(false),
				PartPose.offsetAndRotation(2.5F, 7.75F, 0.0F, 0.0F, 0.0F, -0.3054F));
		PartDefinition Body_r4 = Body.addOrReplaceChild("Body_r4", CubeListBuilder.create().texOffs(33, 5).addBox(1.0F, 2.0F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-2.5F, 6.45F, 0.0F, 0.0F, 0.0F, 0.3054F));
		PartDefinition Body_r5 = Body.addOrReplaceChild("Body_r5", CubeListBuilder.create().texOffs(33, 5).mirror().addBox(-3.0F, 2.0F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.1F)).mirror(false),
				PartPose.offsetAndRotation(2.5F, 6.45F, 0.0F, 0.0F, 0.0F, -0.3054F));
		PartDefinition Body_r6 = Body.addOrReplaceChild("Body_r6",
				CubeListBuilder.create().texOffs(54, 0).mirror().addBox(-0.5F, 2.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.1F)).mirror(false).texOffs(54, 0).mirror().addBox(-1.0F, 3.25F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.1F))
						.mirror(false).texOffs(54, 0).mirror().addBox(-1.45F, 4.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.1F)).mirror(false).texOffs(33, 5).mirror().addBox(-3.0F, 2.0F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.1F))
						.mirror(false),
				PartPose.offsetAndRotation(2.5F, 5.15F, 0.0F, 0.0F, 0.0F, -0.3054F));
		PartDefinition Body_r7 = Body.addOrReplaceChild("Body_r7",
				CubeListBuilder.create().texOffs(54, 0).addBox(0.45F, 4.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(54, 0).addBox(0.0F, 3.25F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(54, 0)
						.addBox(-0.5F, 2.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(33, 5).addBox(1.0F, 2.0F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(-2.5F, 5.15F, 0.0F, 0.0F, 0.0F, 0.3054F));
		PartDefinition Body_r8 = Body.addOrReplaceChild("Body_r8",
				CubeListBuilder.create().texOffs(33, 5).addBox(-0.5F, 2.0F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(33, 5).addBox(-1.0F, -1.5F, -2.1F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-2.5F, 3.75F, 0.0F, 0.0F, 0.0F, 0.3054F));
		PartDefinition wings = Body.addOrReplaceChild("wings", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.2377F, 6.2083F, -0.3054F, 0.0F, 0.0F));
		PartDefinition Body_r9 = wings.addOrReplaceChild("Body_r9", CubeListBuilder.create().texOffs(33, 8).addBox(-6.5F, -0.5F, -1.0F, 12.0F, 1.0F, 2.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(-21.3435F, -2.7914F, 2.9044F, -0.1526F, 0.3152F, -0.1552F));
		PartDefinition Body_r10 = wings.addOrReplaceChild("Body_r10", CubeListBuilder.create().texOffs(33, 8).addBox(-16.432F, -2.9247F, -0.5F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(-11.5935F, -0.8142F, -0.5549F, 0.0953F, 0.4285F, -0.1143F));
		PartDefinition Body_r11 = wings.addOrReplaceChild("Body_r11", CubeListBuilder.create().texOffs(33, 8).addBox(-13.432F, -2.9247F, -0.5F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(-11.5935F, 0.1858F, -0.5549F, 0.0953F, 0.4285F, -0.1143F));
		PartDefinition Body_r12 = wings.addOrReplaceChild("Body_r12", CubeListBuilder.create().texOffs(33, 8).addBox(-11.432F, -2.9247F, -0.5F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(-11.5935F, 1.1858F, -0.5549F, 0.0953F, 0.4285F, -0.1143F));
		PartDefinition Body_r13 = wings.addOrReplaceChild("Body_r13", CubeListBuilder.create().texOffs(33, 8).addBox(-9.432F, -2.9247F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(-11.5935F, 2.1858F, -0.5549F, 0.0953F, 0.4285F, -0.1143F));
		PartDefinition Body_r14 = wings.addOrReplaceChild("Body_r14", CubeListBuilder.create().texOffs(33, 8).addBox(-7.432F, -2.9247F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(-11.5935F, 3.1858F, -0.5549F, 0.0953F, 0.4285F, -0.1143F));
		PartDefinition Body_r15 = wings.addOrReplaceChild("Body_r15", CubeListBuilder.create().texOffs(33, 8).addBox(-5.0053F, -1.2607F, -0.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(-11.5935F, 2.1858F, -0.5549F, 0.2419F, 0.3691F, 0.2594F));
		PartDefinition Body_r16 = wings.addOrReplaceChild("Body_r16", CubeListBuilder.create().texOffs(33, 8).addBox(-5.0053F, -1.2607F, -0.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(-11.5935F, 1.1858F, -0.5549F, 0.2419F, 0.3691F, 0.2594F));
		PartDefinition Body_r17 = wings.addOrReplaceChild("Body_r17", CubeListBuilder.create().texOffs(33, 8).addBox(-5.0053F, -1.2607F, -0.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(-11.5935F, 0.1858F, -0.5549F, 0.2419F, 0.3691F, 0.2594F));
		PartDefinition Body_r18 = wings.addOrReplaceChild("Body_r18", CubeListBuilder.create().texOffs(33, 8).addBox(-5.0053F, -1.2607F, -0.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(-11.5935F, -0.8142F, -0.5549F, 0.2419F, 0.3691F, 0.2594F));
		PartDefinition Body_r19 = wings.addOrReplaceChild("Body_r19", CubeListBuilder.create().texOffs(33, 8).addBox(-2.5F, -0.5F, -1.0F, 8.0F, 1.0F, 2.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(-13.8905F, -3.1041F, 0.3515F, -0.0317F, 0.3477F, 0.2126F));
		PartDefinition Body_r20 = wings.addOrReplaceChild("Body_r20", CubeListBuilder.create().texOffs(33, 8).addBox(2.7371F, -2.0153F, -0.5F, 11.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(-11.5935F, 1.1858F, -0.5549F, 0.3291F, 0.2949F, 0.5251F));
		PartDefinition Body_r21 = wings.addOrReplaceChild("Body_r21", CubeListBuilder.create().texOffs(33, 8).addBox(2.7371F, -2.0153F, -0.5F, 11.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(-11.5935F, 0.1858F, -0.5549F, 0.3291F, 0.2949F, 0.5251F));
		PartDefinition Body_r22 = wings.addOrReplaceChild("Body_r22", CubeListBuilder.create().texOffs(33, 8).addBox(2.7371F, -2.0153F, -0.5F, 11.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(-11.5935F, -0.8142F, -0.5549F, 0.3291F, 0.2949F, 0.5251F));
		PartDefinition Body_r23 = wings.addOrReplaceChild("Body_r23", CubeListBuilder.create().texOffs(33, 8).addBox(-5.5F, -0.5F, -1.0F, 11.0F, 1.0F, 2.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(-4.2322F, 0.4419F, -3.3892F, 0.0631F, 0.3435F, 0.4909F));
		PartDefinition Body_r24 = wings.addOrReplaceChild("Body_r24", CubeListBuilder.create().texOffs(33, 8).mirror().addBox(-5.5F, -0.5F, -1.0F, 11.0F, 1.0F, 2.0F, new CubeDeformation(0.1F)).mirror(false),
				PartPose.offsetAndRotation(4.2322F, 0.4419F, -3.3892F, 0.0631F, -0.3435F, -0.4909F));
		PartDefinition Body_r25 = wings.addOrReplaceChild("Body_r25", CubeListBuilder.create().texOffs(33, 8).mirror().addBox(-13.7371F, -2.0153F, -0.5F, 11.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false),
				PartPose.offsetAndRotation(11.5935F, -0.8142F, -0.5549F, 0.3291F, -0.2949F, -0.5251F));
		PartDefinition Body_r26 = wings.addOrReplaceChild("Body_r26", CubeListBuilder.create().texOffs(33, 8).mirror().addBox(-13.7371F, -2.0153F, -0.5F, 11.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false),
				PartPose.offsetAndRotation(11.5935F, 0.1858F, -0.5549F, 0.3291F, -0.2949F, -0.5251F));
		PartDefinition Body_r27 = wings.addOrReplaceChild("Body_r27", CubeListBuilder.create().texOffs(33, 8).mirror().addBox(-13.7371F, -2.0153F, -0.5F, 11.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false),
				PartPose.offsetAndRotation(11.5935F, 1.1858F, -0.5549F, 0.3291F, -0.2949F, -0.5251F));
		PartDefinition Body_r28 = wings.addOrReplaceChild("Body_r28", CubeListBuilder.create().texOffs(33, 8).mirror().addBox(4.432F, -2.9247F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false),
				PartPose.offsetAndRotation(11.5935F, 3.1858F, -0.5549F, 0.0953F, -0.4285F, 0.1143F));
		PartDefinition Body_r29 = wings.addOrReplaceChild("Body_r29", CubeListBuilder.create().texOffs(33, 8).mirror().addBox(4.432F, -2.9247F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false),
				PartPose.offsetAndRotation(11.5935F, 2.1858F, -0.5549F, 0.0953F, -0.4285F, 0.1143F));
		PartDefinition Body_r30 = wings.addOrReplaceChild("Body_r30", CubeListBuilder.create().texOffs(33, 8).mirror().addBox(-2.9947F, -1.2607F, -0.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false),
				PartPose.offsetAndRotation(11.5935F, 2.1858F, -0.5549F, 0.2419F, -0.3691F, -0.2594F));
		PartDefinition Body_r31 = wings.addOrReplaceChild("Body_r31", CubeListBuilder.create().texOffs(33, 8).mirror().addBox(-2.9947F, -1.2607F, -0.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false),
				PartPose.offsetAndRotation(11.5935F, 1.1858F, -0.5549F, 0.2419F, -0.3691F, -0.2594F));
		PartDefinition Body_r32 = wings.addOrReplaceChild("Body_r32", CubeListBuilder.create().texOffs(33, 8).mirror().addBox(4.432F, -2.9247F, -0.5F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false),
				PartPose.offsetAndRotation(11.5935F, 1.1858F, -0.5549F, 0.0953F, -0.4285F, 0.1143F));
		PartDefinition Body_r33 = wings.addOrReplaceChild("Body_r33", CubeListBuilder.create().texOffs(33, 8).mirror().addBox(-2.9947F, -1.2607F, -0.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false),
				PartPose.offsetAndRotation(11.5935F, 0.1858F, -0.5549F, 0.2419F, -0.3691F, -0.2594F));
		PartDefinition Body_r34 = wings.addOrReplaceChild("Body_r34", CubeListBuilder.create().texOffs(33, 8).mirror().addBox(4.432F, -2.9247F, -0.5F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false),
				PartPose.offsetAndRotation(11.5935F, 0.1858F, -0.5549F, 0.0953F, -0.4285F, 0.1143F));
		PartDefinition Body_r35 = wings.addOrReplaceChild("Body_r35", CubeListBuilder.create().texOffs(33, 8).mirror().addBox(-2.9947F, -1.2607F, -0.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false),
				PartPose.offsetAndRotation(11.5935F, -0.8142F, -0.5549F, 0.2419F, -0.3691F, -0.2594F));
		PartDefinition Body_r36 = wings.addOrReplaceChild("Body_r36", CubeListBuilder.create().texOffs(33, 8).mirror().addBox(4.432F, -2.9247F, -0.5F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false),
				PartPose.offsetAndRotation(11.5935F, -0.8142F, -0.5549F, 0.0953F, -0.4285F, 0.1143F));
		PartDefinition Body_r37 = wings.addOrReplaceChild("Body_r37", CubeListBuilder.create().texOffs(33, 8).mirror().addBox(-5.5F, -0.5F, -1.0F, 12.0F, 1.0F, 2.0F, new CubeDeformation(0.1F)).mirror(false),
				PartPose.offsetAndRotation(21.3435F, -2.7914F, 2.9044F, -0.1526F, -0.3152F, 0.1552F));
		PartDefinition Body_r38 = wings.addOrReplaceChild("Body_r38", CubeListBuilder.create().texOffs(33, 8).mirror().addBox(-5.5F, -0.5F, -1.0F, 8.0F, 1.0F, 2.0F, new CubeDeformation(0.1F)).mirror(false),
				PartPose.offsetAndRotation(13.8905F, -3.1041F, 0.3515F, -0.0317F, -0.3477F, -0.2126F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(33, 5).addBox(-3.0F, 8.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(33, 5)
						.addBox(-3.0F, 0.7F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(33, 5).addBox(-2.0F, 1.85F, -2.0F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.1F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition RightArm_r1 = RightArm.addOrReplaceChild("RightArm_r1", CubeListBuilder.create().texOffs(54, 0).addBox(-2.0F, -1.25F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(-2.5F, 0.85F, 0.0F, 0.0F, 0.0F, -0.5236F));
		PartDefinition RightArm_r2 = RightArm.addOrReplaceChild("RightArm_r2", CubeListBuilder.create().texOffs(54, 0).addBox(-1.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(-3.424F, 2.2495F, 0.0F, 0.0F, 0.0F, -0.9599F));
		PartDefinition RightArm_r3 = RightArm.addOrReplaceChild("RightArm_r3", CubeListBuilder.create().texOffs(54, 0).addBox(-1.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(-3.424F, 6.2495F, 0.0F, 0.0F, 0.0F, -0.9599F));
		PartDefinition RightArm_r4 = RightArm.addOrReplaceChild("RightArm_r4", CubeListBuilder.create().texOffs(54, 0).addBox(-2.0F, -1.25F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(-2.5F, 4.85F, 0.0F, 0.0F, 0.0F, -0.5236F));
		PartDefinition RightArm_r5 = RightArm.addOrReplaceChild("RightArm_r5", CubeListBuilder.create().texOffs(33, 5).addBox(-2.0F, -2.0F, -2.0F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(-2.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.2182F));
		PartDefinition SwordRight = RightArm.addOrReplaceChild("SwordRight",
				CubeListBuilder.create().texOffs(54, 0).addBox(-6.25F, -15.0F, -2.65F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.35F)).texOffs(33, 3).addBox(-6.25F, -16.0F, -3.0F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.1F)).texOffs(33, 3)
						.addBox(-5.75F, -14.0F, -14.0F, 0.0F, 1.0F, 11.0F, new CubeDeformation(0.25F)).texOffs(33, 3).addBox(-5.75F, -14.0F, -15.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.15F)).texOffs(33, 3)
						.addBox(-5.75F, -14.0F, -16.35F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)).texOffs(33, 3).addBox(-5.75F, -14.55F, -11.0F, 0.0F, 0.0F, 8.0F, new CubeDeformation(0.15F)).texOffs(33, 3)
						.addBox(-5.75F, -14.95F, -10.0F, 0.0F, 0.0F, 7.0F, new CubeDeformation(0.1F)).texOffs(53, 0).addBox(-5.75F, -15.25F, -8.0F, 0.0F, 0.0F, 5.0F, new CubeDeformation(0.1F)).texOffs(33, 3)
						.addBox(-5.75F, -12.45F, -11.0F, 0.0F, 0.0F, 8.0F, new CubeDeformation(0.15F)).texOffs(33, 3).addBox(-5.75F, -12.05F, -10.0F, 0.0F, 0.0F, 7.0F, new CubeDeformation(0.1F)).texOffs(53, 0)
						.addBox(-5.75F, -11.75F, -8.0F, 0.0F, 0.0F, 5.0F, new CubeDeformation(0.1F)).texOffs(33, 3).addBox(-6.25F, -14.0F, -2.25F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.25F)).texOffs(54, 0)
						.addBox(-6.25F, -14.0F, 3.85F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.35F)).texOffs(54, 0).addBox(-5.75F, -13.5F, -8.55F, 0.0F, 0.0F, 5.0F, new CubeDeformation(0.35F)).texOffs(33, 3)
						.addBox(-6.25F, -15.0F, 3.85F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.1F)),
				PartPose.offset(5.0F, 22.0F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(40, 16).mirror().addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(33, 5).mirror().addBox(-1.0F, 0.7F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.1F))
						.mirror(false).texOffs(33, 5).mirror().addBox(1.0F, 1.85F, -2.0F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.1F)).mirror(false).texOffs(33, 5).mirror().addBox(-1.0F, 8.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.1F))
						.mirror(false),
				PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition LeftArm_r1 = LeftArm.addOrReplaceChild("LeftArm_r1", CubeListBuilder.create().texOffs(33, 5).mirror().addBox(-3.0F, -2.0F, -2.0F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.25F)).mirror(false),
				PartPose.offsetAndRotation(2.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.2182F));
		PartDefinition LeftArm_r2 = LeftArm.addOrReplaceChild("LeftArm_r2", CubeListBuilder.create().texOffs(54, 0).mirror().addBox(1.0F, -1.25F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false),
				PartPose.offsetAndRotation(2.5F, 4.85F, 0.0F, 0.0F, 0.0F, 0.5236F));
		PartDefinition LeftArm_r3 = LeftArm.addOrReplaceChild("LeftArm_r3", CubeListBuilder.create().texOffs(54, 0).mirror().addBox(0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false),
				PartPose.offsetAndRotation(3.424F, 6.2495F, 0.0F, 0.0F, 0.0F, 0.9599F));
		PartDefinition LeftArm_r4 = LeftArm.addOrReplaceChild("LeftArm_r4", CubeListBuilder.create().texOffs(54, 0).mirror().addBox(1.0F, -1.25F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false),
				PartPose.offsetAndRotation(2.5F, 0.85F, 0.0F, 0.0F, 0.0F, 0.5236F));
		PartDefinition LeftArm_r5 = LeftArm.addOrReplaceChild("LeftArm_r5", CubeListBuilder.create().texOffs(54, 0).mirror().addBox(0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false),
				PartPose.offsetAndRotation(3.424F, 2.2495F, 0.0F, 0.0F, 0.0F, 0.9599F));
		PartDefinition SwordLeft = LeftArm.addOrReplaceChild("SwordLeft", CubeListBuilder.create().texOffs(54, 0).mirror().addBox(5.25F, -15.0F, -2.65F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.35F)).mirror(false).texOffs(33, 3).mirror()
				.addBox(5.25F, -16.0F, -3.0F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.1F)).mirror(false).texOffs(33, 3).mirror().addBox(5.75F, -14.0F, -14.0F, 0.0F, 1.0F, 11.0F, new CubeDeformation(0.25F)).mirror(false).texOffs(33, 3).mirror()
				.addBox(5.75F, -14.0F, -15.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.15F)).mirror(false).texOffs(33, 3).mirror().addBox(5.75F, -14.0F, -16.35F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)).mirror(false).texOffs(33, 3).mirror()
				.addBox(5.75F, -14.55F, -11.0F, 0.0F, 0.0F, 8.0F, new CubeDeformation(0.15F)).mirror(false).texOffs(33, 3).mirror().addBox(5.75F, -14.95F, -10.0F, 0.0F, 0.0F, 7.0F, new CubeDeformation(0.1F)).mirror(false).texOffs(53, 0).mirror()
				.addBox(5.75F, -15.25F, -8.0F, 0.0F, 0.0F, 5.0F, new CubeDeformation(0.1F)).mirror(false).texOffs(33, 3).mirror().addBox(5.75F, -12.45F, -11.0F, 0.0F, 0.0F, 8.0F, new CubeDeformation(0.15F)).mirror(false).texOffs(33, 3).mirror()
				.addBox(5.75F, -12.05F, -10.0F, 0.0F, 0.0F, 7.0F, new CubeDeformation(0.1F)).mirror(false).texOffs(53, 0).mirror().addBox(5.75F, -11.75F, -8.0F, 0.0F, 0.0F, 5.0F, new CubeDeformation(0.1F)).mirror(false).texOffs(33, 3).mirror()
				.addBox(5.25F, -14.0F, -2.25F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.25F)).mirror(false).texOffs(54, 0).mirror().addBox(5.25F, -14.0F, 3.85F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.35F)).mirror(false).texOffs(54, 0).mirror()
				.addBox(5.75F, -13.5F, -8.55F, 0.0F, 0.0F, 5.0F, new CubeDeformation(0.35F)).mirror(false).texOffs(33, 3).mirror().addBox(5.25F, -15.0F, 3.85F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.1F)).mirror(false),
				PartPose.offset(-5.0F, 22.0F, 0.0F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(33, 5).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(33, 5)
						.addBox(-2.0F, 8.5F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(33, 5).addBox(-2.0F, 0.5F, -1.0F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.1F)).texOffs(33, 5)
						.addBox(-2.0F, 9.95F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.1F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));
		PartDefinition RightLeg_r1 = RightLeg.addOrReplaceChild("RightLeg_r1",
				CubeListBuilder.create().texOffs(33, 5).addBox(-1.5F, -0.5F, -1.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).texOffs(33, 5).addBox(-1.5F, -0.5F, -4.9F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)),
				PartPose.offsetAndRotation(-0.25F, 5.4F, 2.7F, 0.0F, 0.0F, 0.4363F));
		PartDefinition RightLeg_r2 = RightLeg.addOrReplaceChild("RightLeg_r2",
				CubeListBuilder.create().texOffs(33, 5).addBox(-1.5F, -0.5F, -1.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).texOffs(33, 5).addBox(-1.5F, -0.5F, -4.9F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)),
				PartPose.offsetAndRotation(-0.25F, 4.4F, 2.7F, 0.0F, 0.0F, 0.4363F));
		PartDefinition RightLeg_r3 = RightLeg.addOrReplaceChild("RightLeg_r3",
				CubeListBuilder.create().texOffs(33, 5).addBox(-1.75F, -0.5F, -1.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).texOffs(33, 5).addBox(-1.75F, -0.5F, -4.9F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)),
				PartPose.offsetAndRotation(-0.25F, 3.4F, 2.7F, 0.0F, 0.0F, 0.4363F));
		PartDefinition RightLeg_r4 = RightLeg.addOrReplaceChild("RightLeg_r4",
				CubeListBuilder.create().texOffs(33, 5).addBox(-1.75F, -0.5F, -1.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).texOffs(33, 5).addBox(-1.75F, -0.5F, -4.9F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)),
				PartPose.offsetAndRotation(-0.25F, 2.4F, 2.7F, 0.0F, 0.0F, 0.4363F));
		PartDefinition RightLeg_r5 = RightLeg.addOrReplaceChild("RightLeg_r5",
				CubeListBuilder.create().texOffs(33, 5).addBox(-1.25F, -0.5F, -1.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).texOffs(33, 5).addBox(-1.25F, -0.5F, -4.9F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)),
				PartPose.offsetAndRotation(-0.25F, 7.4F, 2.7F, 0.0F, 0.0F, 0.4363F));
		PartDefinition RightLeg_r6 = RightLeg.addOrReplaceChild("RightLeg_r6",
				CubeListBuilder.create().texOffs(33, 5).addBox(-1.25F, -0.5F, -1.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).texOffs(33, 5).addBox(-1.25F, -0.5F, -4.9F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)),
				PartPose.offsetAndRotation(-0.25F, 6.4F, 2.7F, 0.0F, 0.0F, 0.4363F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(0, 16).mirror().addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(33, 5).mirror().addBox(-2.0F, 9.95F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.1F))
						.mirror(false).texOffs(33, 5).mirror().addBox(-2.0F, 0.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.25F)).mirror(false).texOffs(33, 5).mirror().addBox(-2.0F, 8.5F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.1F))
						.mirror(false).texOffs(33, 5).mirror().addBox(1.0F, 0.5F, -1.0F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.1F)).mirror(false),
				PartPose.offset(1.9F, 12.0F, 0.0F));
		PartDefinition LeftLeg_r1 = LeftLeg.addOrReplaceChild("LeftLeg_r1", CubeListBuilder.create().texOffs(33, 5).mirror().addBox(-1.75F, -0.5F, -1.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false).texOffs(33, 5).mirror()
				.addBox(-1.75F, -0.5F, -4.9F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.25F, 7.4F, 2.7F, 0.0F, 0.0F, -0.4363F));
		PartDefinition LeftLeg_r2 = LeftLeg.addOrReplaceChild("LeftLeg_r2", CubeListBuilder.create().texOffs(33, 5).mirror().addBox(-1.75F, -0.5F, -1.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false).texOffs(33, 5).mirror()
				.addBox(-1.75F, -0.5F, -4.9F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.25F, 6.4F, 2.7F, 0.0F, 0.0F, -0.4363F));
		PartDefinition LeftLeg_r3 = LeftLeg.addOrReplaceChild("LeftLeg_r3", CubeListBuilder.create().texOffs(33, 5).mirror().addBox(-1.5F, -0.5F, -1.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false).texOffs(33, 5).mirror()
				.addBox(-1.5F, -0.5F, -4.9F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.25F, 5.4F, 2.7F, 0.0F, 0.0F, -0.4363F));
		PartDefinition LeftLeg_r4 = LeftLeg.addOrReplaceChild("LeftLeg_r4", CubeListBuilder.create().texOffs(33, 5).mirror().addBox(-1.5F, -0.5F, -1.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false).texOffs(33, 5).mirror()
				.addBox(-1.5F, -0.5F, -4.9F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.25F, 4.4F, 2.7F, 0.0F, 0.0F, -0.4363F));
		PartDefinition LeftLeg_r5 = LeftLeg.addOrReplaceChild("LeftLeg_r5", CubeListBuilder.create().texOffs(33, 5).mirror().addBox(-1.25F, -0.5F, -1.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false).texOffs(33, 5).mirror()
				.addBox(-1.25F, -0.5F, -4.9F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.25F, 3.4F, 2.7F, 0.0F, 0.0F, -0.4363F));
		PartDefinition LeftLeg_r6 = LeftLeg.addOrReplaceChild("LeftLeg_r6", CubeListBuilder.create().texOffs(33, 5).mirror().addBox(-1.25F, -0.5F, -1.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false).texOffs(33, 5).mirror()
				.addBox(-1.25F, -0.5F, -4.9F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.25F, 2.4F, 2.7F, 0.0F, 0.0F, -0.4363F));
		return LayerDefinition.create(meshdefinition, 64, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
