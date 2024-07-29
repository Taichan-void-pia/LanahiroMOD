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

// Made with Blockbench 4.6.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelmechanism_wing<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("ranahiromod", "modelmechanism_wing"), "main");
	public final ModelPart body;
	public final ModelPart leftarm;
	public final ModelPart rightarm;

	public Modelmechanism_wing(ModelPart root) {
		this.body = root.getChild("body");
		this.leftarm = root.getChild("leftarm");
		this.rightarm = root.getChild("rightarm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 48).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 4).mirror().addBox(-0.5111F, 0.0F, -2.0202F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 4).mirror().addBox(-0.5111F, 0.0F, -3.0202F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 4).mirror().addBox(-1.0111F, 2.25F, -3.0202F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 4).addBox(0.0111F, 2.25F, -3.0202F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 4).addBox(0.0111F, 3.5F, -3.0202F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 4).mirror()
						.addBox(-1.0111F, 3.5F, -3.0202F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 4).mirror().addBox(-1.0111F, 11.0F, -3.0202F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 4)
						.mirror().addBox(-1.0111F, 5.0F, -3.0202F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 4).addBox(0.0111F, 11.0F, -3.0202F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 4)
						.addBox(0.0111F, 5.0F, -3.0202F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 4).mirror().addBox(-4.0F, 6.0F, -2.5F, 8.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 4).mirror()
						.addBox(3.75F, 0.0F, -2.15F, 1.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 4).mirror().addBox(1.75F, -0.5F, -2.25F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 4).mirror()
						.addBox(1.75F, -0.25F, -2.25F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 4).addBox(-5.75F, -0.25F, -2.25F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 4)
						.addBox(-2.75F, -0.5F, -2.25F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 4).addBox(-4.75F, 0.0F, -2.15F, 1.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 4)
						.addBox(-4.0F, 0.0F, 2.0F, 8.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(1.5F, 2.0F, 3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0).mirror()
						.addBox(-2.5F, 2.0F, 3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(1, 26).addBox(-2.0F, 8.0F, 2.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 26)
						.addBox(-2.0F, 2.0F, 2.5F, 4.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(1, 26).addBox(-2.5F, 1.0F, 1.9F, 5.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 26)
						.addBox(1.5F, 2.0F, 3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 26).addBox(1.7352F, 2.4814F, 2.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 26).mirror()
						.addBox(-3.7352F, 2.4814F, 2.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(1, 26).mirror().addBox(0.7352F, 0.7494F, 2.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(1, 26)
						.addBox(-2.7352F, 0.7494F, 2.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition wing_sentor_r1 = body.addOrReplaceChild("wing_sentor_r1", CubeListBuilder.create().texOffs(1, 26).mirror().addBox(-2.0F, -0.5F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.6739F, 6.4468F, 3.0F, 0.0F, 0.0F, -0.2618F));
		PartDefinition wing_sentor_r2 = body.addOrReplaceChild("wing_sentor_r2", CubeListBuilder.create().texOffs(1, 26).addBox(0.0F, -7.5F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.7531F, 8.2446F, 3.0F, 0.0F, 0.0F, -0.5236F));
		PartDefinition wing_sentor_r3 = body.addOrReplaceChild("wing_sentor_r3", CubeListBuilder.create().texOffs(1, 26).mirror().addBox(-2.0F, -7.5F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-4.7531F, 8.2446F, 3.0F, 0.0F, 0.0F, 0.5236F));
		PartDefinition wing_sentor_r4 = body.addOrReplaceChild("wing_sentor_r4", CubeListBuilder.create().texOffs(1, 26).addBox(0.0F, -0.5F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.6739F, 6.4468F, 3.0F, 0.0F, 0.0F, 0.2618F));
		PartDefinition wing_sentor_r5 = body.addOrReplaceChild("wing_sentor_r5", CubeListBuilder.create().texOffs(1, 26).mirror().addBox(-2.0F, -0.5F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.3264F, 7.5924F, 3.0F, 0.0F, 0.0F, -0.6545F));
		PartDefinition wing_sentor_r6 = body.addOrReplaceChild("wing_sentor_r6", CubeListBuilder.create().texOffs(1, 26).addBox(0.0F, -0.5F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.3264F, 7.5924F, 3.0F, 0.0F, 0.0F, 0.6545F));
		PartDefinition wing_sentor_r7 = body.addOrReplaceChild("wing_sentor_r7", CubeListBuilder.create().texOffs(1, 26).addBox(-2.0F, -2.0F, 0.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.5195F, 2.3251F, -0.8727F, 0.0F, 0.0F));
		PartDefinition wing_sentor_r8 = body.addOrReplaceChild("wing_sentor_r8", CubeListBuilder.create().texOffs(1, 26).addBox(-2.0F, 1.0F, -1.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.1737F, 2.1199F, 0.9163F, 0.0F, 0.0F));
		PartDefinition wing_sentor_r9 = body.addOrReplaceChild("wing_sentor_r9", CubeListBuilder.create().texOffs(1, 26).mirror().addBox(2.875F, -23.625F, 15.75F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(35, 23).mirror()
				.addBox(2.25F, -18.125F, 15.75F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9386F, 34.5F, -1.6449F, 0.48F, -0.3054F, 0.0F));
		PartDefinition wing_sentor_r10 = body.addOrReplaceChild("wing_sentor_r10",
				CubeListBuilder.create().texOffs(23, 23).mirror().addBox(2.25F, -13.125F, 18.75F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(25, 8).mirror()
						.addBox(1.5F, -7.875F, 18.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(25, 8).mirror().addBox(4.0F, -7.875F, 18.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(25, 8).mirror()
						.addBox(1.5F, -7.875F, 19.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(25, 8).mirror().addBox(4.0F, -7.875F, 19.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(25, 8).mirror()
						.addBox(2.25F, -7.875F, 20.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(25, 8).mirror().addBox(3.25F, -7.875F, 20.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.9742F, 37.9044F, 1.6398F, 0.7418F, -0.3054F, 0.0F));
		PartDefinition wing_sentor_r11 = body.addOrReplaceChild("wing_sentor_r11",
				CubeListBuilder.create().texOffs(25, 8).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(25, 8).mirror().addBox(2.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(25, 8).mirror().addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(25, 8).mirror().addBox(0.25F, -0.5F, -2.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(25, 8).mirror().addBox(1.25F, -0.5F, -2.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(25, 8).mirror().addBox(2.0F, -0.5F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(-4.6243F, 19.9557F, 10.3525F, 0.48F, -0.3054F, 0.0F));
		PartDefinition wing_sentor_r12 = body.addOrReplaceChild("wing_sentor_r12", CubeListBuilder.create().texOffs(25, 8).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-4.0018F, 20.719F, 9.0113F, 0.6735F, -0.7869F, -0.359F));
		PartDefinition wing_sentor_r13 = body.addOrReplaceChild("wing_sentor_r13", CubeListBuilder.create().texOffs(25, 8).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.9806F, 20.719F, 9.6486F, 0.4663F, 0.2023F, 0.2561F));
		PartDefinition wing_sentor_r14 = body.addOrReplaceChild("wing_sentor_r14", CubeListBuilder.create().texOffs(25, 8).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-5.0088F, 18.3656F, 12.2252F, 0.7108F, 0.1576F, 0.4032F));
		PartDefinition wing_sentor_r15 = body.addOrReplaceChild("wing_sentor_r15", CubeListBuilder.create().texOffs(25, 8).addBox(-2.25F, -0.5F, 1.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5793F, 18.6559F, 13.2896F, 1.0113F, -0.7071F, -0.5348F));
		PartDefinition wing_sentor_r16 = body.addOrReplaceChild("wing_sentor_r16",
				CubeListBuilder.create().texOffs(1, 26).mirror().addBox(1.75F, -2.375F, 22.25F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(1, 26).mirror()
						.addBox(1.5F, -4.125F, 23.25F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(1, 26).mirror().addBox(1.25F, -5.625F, 24.25F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(1, 26)
						.mirror().addBox(1.5F, -7.625F, 25.25F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(1, 26).mirror().addBox(1.5F, -0.375F, 21.25F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-4.3809F, 37.6992F, 2.9296F, 1.2654F, -0.3054F, 0.0F));
		PartDefinition wing_sentor_r17 = body.addOrReplaceChild("wing_sentor_r17",
				CubeListBuilder.create().texOffs(1, 26).addBox(-3.875F, -23.625F, 15.75F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(35, 23).addBox(-4.25F, -18.125F, 15.75F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.9386F, 34.5F, -1.6449F, 0.48F, 0.3054F, 0.0F));
		PartDefinition wing_sentor_r18 = body.addOrReplaceChild("wing_sentor_r18",
				CubeListBuilder.create().texOffs(23, 23).addBox(-4.25F, -13.125F, 18.75F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(25, 8).addBox(-2.5F, -7.875F, 18.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(25, 8)
						.addBox(-5.0F, -7.875F, 18.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(25, 8).addBox(-2.5F, -7.875F, 19.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(25, 8)
						.addBox(-5.0F, -7.875F, 19.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(25, 8).addBox(-3.25F, -7.875F, 20.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(25, 8)
						.addBox(-4.25F, -7.875F, 20.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.9742F, 37.9044F, 1.6398F, 0.7418F, 0.3054F, 0.0F));
		PartDefinition wing_sentor_r19 = body.addOrReplaceChild("wing_sentor_r19",
				CubeListBuilder.create().texOffs(25, 8).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(25, 8).addBox(-3.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(25, 8)
						.addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(25, 8).addBox(-1.25F, -0.5F, -2.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(25, 8)
						.addBox(-2.25F, -0.5F, -2.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(25, 8).addBox(-3.0F, -0.5F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.6243F, 19.9557F, 10.3525F, 0.48F, 0.3054F, 0.0F));
		PartDefinition wing_sentor_r20 = body.addOrReplaceChild("wing_sentor_r20", CubeListBuilder.create().texOffs(25, 8).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0018F, 20.719F, 9.0113F, 0.6735F, 0.7869F, 0.359F));
		PartDefinition wing_sentor_r21 = body.addOrReplaceChild("wing_sentor_r21", CubeListBuilder.create().texOffs(25, 8).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.9806F, 20.719F, 9.6486F, 0.4663F, -0.2023F, -0.2561F));
		PartDefinition wing_sentor_r22 = body.addOrReplaceChild("wing_sentor_r22", CubeListBuilder.create().texOffs(25, 8).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0088F, 18.3656F, 12.2252F, 0.7108F, -0.1576F, -0.4032F));
		PartDefinition wing_sentor_r23 = body.addOrReplaceChild("wing_sentor_r23", CubeListBuilder.create().texOffs(25, 8).mirror().addBox(1.25F, -0.5F, 1.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.5793F, 18.6559F, 13.2896F, 1.0113F, 0.7071F, 0.5348F));
		PartDefinition wing_sentor_r24 = body.addOrReplaceChild("wing_sentor_r24",
				CubeListBuilder.create().texOffs(1, 26).addBox(-4.75F, -2.375F, 22.25F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 26).addBox(-4.5F, -4.125F, 23.25F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 26)
						.addBox(-4.25F, -5.625F, 24.25F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 26).addBox(-4.5F, -7.625F, 25.25F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 26)
						.addBox(-4.5F, -0.375F, 21.25F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.3809F, 37.6992F, 2.9296F, 1.2654F, 0.3054F, 0.0F));
		PartDefinition wing_sentor_r25 = body.addOrReplaceChild("wing_sentor_r25",
				CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.5F, -0.9935F, -0.481F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 0).addBox(3.5F, -0.9935F, -0.481F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 2.981F, 3.9936F, -0.9163F, 0.0F, 0.0F));
		PartDefinition wing_sentor_r26 = body.addOrReplaceChild("wing_sentor_r26",
				CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.5F, -1.0111F, -0.4833F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 0).addBox(3.5F, -1.0111F, -0.4833F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 2.981F, 3.9936F, -1.8326F, 0.0F, 0.0F));
		PartDefinition wing_sentor_r27 = body.addOrReplaceChild("wing_sentor_r27",
				CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.5F, -1.02F, -0.4986F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 0).addBox(3.5F, -1.02F, -0.4986F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 2.981F, 3.9936F, -2.7489F, 0.0F, 0.0F));
		PartDefinition wing_sentor_r28 = body.addOrReplaceChild("wing_sentor_r28",
				CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.5F, -1.0133F, -0.515F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 0).addBox(3.5F, -1.0133F, -0.515F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 2.981F, 3.9936F, 2.618F, 0.0F, 0.0F));
		PartDefinition wing_sentor_r29 = body.addOrReplaceChild("wing_sentor_r29",
				CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.5F, -0.9962F, -0.5197F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 0).addBox(3.5F, -0.9962F, -0.5197F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 2.981F, 3.9936F, 1.7017F, 0.0F, 0.0F));
		PartDefinition wing_sentor_r30 = body.addOrReplaceChild("wing_sentor_r30",
				CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.5F, -0.9834F, -0.5112F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 0).addBox(3.5F, -0.9834F, -0.5112F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 2.981F, 3.9936F, 0.9163F, 0.0F, 0.0F));
		PartDefinition wing_right_r1 = body.addOrReplaceChild("wing_right_r1",
				CubeListBuilder.create().texOffs(51, 4).addBox(0.0F, 1.1F, -0.75F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(51, 2).addBox(0.0F, -14.1F, -1.0F, 0.0F, 16.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.7876F, 11.8811F, 14.6214F, -2.4146F, 0.3053F, -0.3609F));
		PartDefinition wing_right_r2 = body.addOrReplaceChild("wing_right_r2",
				CubeListBuilder.create().texOffs(48, 10).addBox(0.0F, -11.0935F, -1.981F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 10).addBox(0.0F, -11.0935F, -2.981F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.4839F, 2.9336F, 5.9344F, -2.72F, 0.3053F, -0.3609F));
		PartDefinition wing_right_r3 = body.addOrReplaceChild("wing_right_r3", CubeListBuilder.create().texOffs(54, 3).addBox(0.0F, -10.0935F, 0.019F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.4169F, 4.9917F, 0.4609F, -1.891F, 0.3053F, -0.3609F));
		PartDefinition wing_right_r4 = body.addOrReplaceChild("wing_right_r4", CubeListBuilder.create().texOffs(24, 0).addBox(-0.5F, -8.9935F, -0.481F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.1209F, 5.4724F, 2.0119F, -1.891F, 0.3053F, -0.3609F));
		PartDefinition wing_right_r5 = body.addOrReplaceChild("wing_right_r5",
				CubeListBuilder.create().texOffs(24, 0).addBox(-0.5F, -5.9935F, -0.481F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 3).addBox(0.0F, -6.0935F, 0.019F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.8004F, 2.981F, 3.8525F, -2.4146F, 0.3053F, -0.3609F));
		PartDefinition wing_right_r6 = body.addOrReplaceChild("wing_right_r6", CubeListBuilder.create().texOffs(51, 4).addBox(0.0F, -15.0935F, 1.019F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.016F, 6.8064F, 0.2057F, -1.891F, 0.3053F, -0.3609F));
		PartDefinition wing_right_r7 = body.addOrReplaceChild("wing_right_r7", CubeListBuilder.create().texOffs(24, 0).addBox(-0.5F, -15.9935F, -0.481F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4587F, 0.1994F, 2.9864F, -2.4146F, 0.3053F, -0.3609F));
		PartDefinition wing_right_r8 = body.addOrReplaceChild("wing_right_r8", CubeListBuilder.create().texOffs(24, 0).addBox(-0.5F, -22.9935F, -0.481F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.6403F, 7.6196F, 1.1479F, -1.891F, 0.3053F, -0.3609F));
		PartDefinition wing_right_r9 = body.addOrReplaceChild("wing_right_r9", CubeListBuilder.create().texOffs(51, 4).addBox(0.0F, -12.1F, -1.0F, 0.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(51, 4)
				.addBox(0.0F, -16.8F, 1.0F, 0.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(51, 4).addBox(0.0F, -21.1F, 3.0F, 0.0F, 15.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.7876F, 11.8811F, 14.6214F, -1.8474F, 0.3053F, -0.3609F));
		PartDefinition wing_right_r10 = body.addOrReplaceChild("wing_right_r10", CubeListBuilder.create().texOffs(24, 0).addBox(-0.5F, -29.9935F, -0.481F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0453F, 15.1289F, -0.1277F, -1.5419F, 0.3053F, -0.3609F));
		PartDefinition wing_right_r11 = body.addOrReplaceChild("wing_right_r11",
				CubeListBuilder.create().texOffs(47, 1).addBox(0.0F, -11.1F, -2.0F, 0.0F, 14.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(47, 1).addBox(0.0F, -18.1F, 1.0F, 0.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.0233F, 13.5574F, 25.3172F, -1.7601F, 0.3053F, -0.3609F));
		PartDefinition wing_right_r12 = body.addOrReplaceChild("wing_right_r12",
				CubeListBuilder.create().texOffs(52, 1).addBox(0.0F, -30.1F, -1.0F, 0.0F, 17.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(51, 4).addBox(0.0F, -26.1F, -2.0F, 0.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.8597F, 18.2781F, 10.6355F, -1.8474F, 0.3053F, -0.3609F));
		PartDefinition wing_right_r13 = body.addOrReplaceChild("wing_right_r13", CubeListBuilder.create().texOffs(51, 4).addBox(0.0F, -13.5F, 1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.7775F, 10.0616F, 28.5049F, -2.6328F, 0.3053F, -0.3609F));
		PartDefinition wing_right_r14 = body.addOrReplaceChild("wing_right_r14", CubeListBuilder.create().texOffs(47, 1).addBox(0.0F, -6.0F, -2.0F, 0.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(20.8913F, 22.2237F, 38.9627F, -2.2401F, 0.3053F, -0.3609F));
		PartDefinition wing_right_r15 = body.addOrReplaceChild("wing_right_r15", CubeListBuilder.create().texOffs(47, 1).addBox(0.0F, -7.0F, 2.0F, 0.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(19.5881F, 21.2291F, 36.2086F, -1.6728F, 0.3053F, -0.3609F));
		PartDefinition wing_right_r16 = body.addOrReplaceChild("wing_right_r16", CubeListBuilder.create().texOffs(47, 1).addBox(0.0F, -2.0F, 2.0F, 0.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(17.7151F, 21.1035F, 30.7891F, -2.1964F, 0.3053F, -0.3609F));
		PartDefinition wing_right_r17 = body.addOrReplaceChild("wing_right_r17", CubeListBuilder.create().texOffs(54, 3).addBox(0.0F, -5.0935F, 0.019F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0887F, 4.3976F, 3.1207F, -2.0655F, 0.3053F, -0.3609F));
		PartDefinition wing_right_r18 = body.addOrReplaceChild("wing_right_r18", CubeListBuilder.create().texOffs(24, 0).addBox(0.0F, -4.7144F, -0.6214F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7276F, 3.45F, 5.1331F, -1.6581F, 0.6545F, 0.0F));
		PartDefinition wing_right_r19 = body.addOrReplaceChild("wing_right_r19", CubeListBuilder.create().texOffs(24, 0).addBox(0.0F, -23.7144F, -0.6214F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.6993F, 17.8852F, 14.0035F, -0.2182F, 0.8727F, 0.0F));
		PartDefinition wing_right_r20 = body.addOrReplaceChild("wing_right_r20", CubeListBuilder.create().texOffs(24, 0).addBox(0.0F, -17.7144F, -0.6214F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.2715F, 7.1019F, 6.0926F, -1.1781F, 0.8727F, 0.0F));
		PartDefinition wing_right_r21 = body.addOrReplaceChild("wing_right_r21", CubeListBuilder.create().texOffs(52, 3).addBox(0.0F, -43.7F, -5.0F, 0.0F, 13.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.2588F, 18.2835F, 12.9812F, -0.7854F, 0.8727F, 0.0F));
		PartDefinition wing_right_r22 = body.addOrReplaceChild("wing_right_r22",
				CubeListBuilder.create().texOffs(52, 3).addBox(0.0F, -30.7F, -5.0F, 0.0F, 13.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(52, 3).addBox(0.0F, -29.7F, 0.0F, 0.0F, 13.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0537F, 13.0704F, 10.2918F, -1.0036F, 0.8727F, 0.0F));
		PartDefinition wing_right_r23 = body.addOrReplaceChild("wing_right_r23", CubeListBuilder.create().texOffs(52, 3).addBox(0.0F, -5.0F, -2.5F, 0.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(34.1927F, -13.687F, 33.0641F, -0.9163F, 0.8727F, 0.0F));
		PartDefinition wing_right_r24 = body.addOrReplaceChild("wing_right_r24", CubeListBuilder.create().texOffs(52, 3).addBox(0.0F, -47.7F, 0.0F, 0.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(19.3138F, 30.3705F, 20.5793F, -0.3491F, 0.8727F, 0.0F));
		PartDefinition wing_right_r25 = body.addOrReplaceChild("wing_right_r25",
				CubeListBuilder.create().texOffs(52, 3).addBox(0.0F, -50.7F, 1.0F, 0.0F, 13.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(52, 3).addBox(0.0F, -43.7F, 6.0F, 0.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.6412F, 3.8392F, 7.4284F, -1.1781F, 0.8727F, 0.0F));
		PartDefinition wing_right_r26 = body.addOrReplaceChild("wing_right_r26", CubeListBuilder.create().texOffs(52, 3).addBox(0.0F, -43.7F, 0.0F, 0.0F, 13.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.9449F, 22.6417F, 13.5569F, -0.6545F, 0.8727F, 0.0F));
		PartDefinition wing_right_r27 = body.addOrReplaceChild("wing_right_r27", CubeListBuilder.create().texOffs(46, 2).addBox(0.0F, -22.8F, 0.0F, 0.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.477F, -2.734F, 12.3252F, -1.789F, 0.8727F, 0.0F));
		PartDefinition wing_right_r28 = body.addOrReplaceChild("wing_right_r28", CubeListBuilder.create().texOffs(46, 2).addBox(0.0F, -16.8F, 0.0F, 0.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.477F, -2.734F, 12.3252F, -1.9635F, 0.8727F, 0.0F));
		PartDefinition wing_right_r29 = body.addOrReplaceChild("wing_right_r29", CubeListBuilder.create().texOffs(54, 3).addBox(0.0F, -9.8F, 3.0F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.4258F, 5.1493F, 11.4432F, -1.1781F, 0.8727F, 0.0F));
		PartDefinition wing_right_r30 = body.addOrReplaceChild("wing_right_r30", CubeListBuilder.create().texOffs(54, 3).addBox(0.0F, -11.8F, 2.0F, 0.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 3)
				.addBox(0.0F, -13.0F, 0.0F, 0.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 3).addBox(0.0F, -12.0F, -2.0F, 0.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0625F, 5.4062F, 11.1383F, -1.1781F, 0.8727F, 0.0F));
		PartDefinition wing_right_r31 = body.addOrReplaceChild("wing_right_r31", CubeListBuilder.create().texOffs(44, 3).addBox(0.0F, -2.0F, -3.0F, 0.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(37.8719F, -18.838F, 36.1513F, -1.7453F, 0.8727F, 0.0F));
		PartDefinition wing_right_r32 = body.addOrReplaceChild("wing_right_r32", CubeListBuilder.create().texOffs(49, 1).addBox(0.0F, -3.5F, -3.0F, 0.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(34.2915F, -18.8461F, 33.147F, -1.4835F, 0.8727F, 0.0F));
		PartDefinition wing_right_r33 = body.addOrReplaceChild("wing_right_r33",
				CubeListBuilder.create().texOffs(49, 1).addBox(0.0F, -46.5F, -2.0F, 0.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(49, 1).addBox(0.0F, -41.5F, -2.0F, 0.0F, 15.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.8831F, 6.6928F, 7.6313F, -0.9599F, 0.8727F, 0.0F));
		PartDefinition wing_right_r34 = body.addOrReplaceChild("wing_right_r34", CubeListBuilder.create().texOffs(49, 2).addBox(0.0F, -35.5F, -2.0F, 0.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(49, 2)
				.addBox(0.0F, -25.5F, -4.0F, 0.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(49, 2).addBox(0.0F, -25.5F, -2.0F, 0.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.193F, 12.9383F, 13.7651F, -0.5236F, 0.8727F, 0.0F));
		PartDefinition wing_right_r35 = body.addOrReplaceChild("wing_right_r35", CubeListBuilder.create().texOffs(51, 9).addBox(0.0F, -6.5F, -1.0F, 0.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0625F, 5.4062F, 11.1383F, -1.8762F, 0.8727F, 0.0F));
		PartDefinition wing_right_r36 = body.addOrReplaceChild("wing_right_r36",
				CubeListBuilder.create().texOffs(51, 9).addBox(0.5F, -7.7144F, -0.1214F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 0).addBox(0.0F, -7.7144F, -0.6214F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.9804F, 3.45F, 5.8484F, -1.6581F, 0.8727F, 0.0F));
		PartDefinition wing_right_r37 = body.addOrReplaceChild("wing_right_r37", CubeListBuilder.create().texOffs(51, 9).addBox(0.5F, -5.7144F, -0.1214F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0976F, 6.1964F, 6.7859F, -1.1345F, 0.8727F, 0.0F));
		PartDefinition wing_right_r38 = body.addOrReplaceChild("wing_right_r38",
				CubeListBuilder.create().texOffs(51, 4).addBox(0.0F, 1.1F, -0.75F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(51, 2).addBox(0.0F, -14.1F, -1.0F, 0.0F, 16.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.7623F, -7.4984F, 14.7377F, -0.9163F, 0.3491F, 0.0F));
		PartDefinition wing_right_r39 = body.addOrReplaceChild("wing_right_r39",
				CubeListBuilder.create().texOffs(48, 10).addBox(0.0F, -11.0935F, -1.981F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 10).addBox(0.0F, -11.0935F, -2.981F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9217F, 0.8181F, 4.1858F, -1.2217F, 0.3491F, 0.0F));
		PartDefinition wing_right_r40 = body.addOrReplaceChild("wing_right_r40", CubeListBuilder.create().texOffs(54, 3).addBox(0.0F, -10.0935F, 0.019F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.3078F, 6.6541F, 5.2465F, -0.3927F, 0.3491F, 0.0F));
		PartDefinition wing_right_r41 = body.addOrReplaceChild("wing_right_r41", CubeListBuilder.create().texOffs(24, 0).addBox(-0.5F, -8.9935F, -0.481F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5863F, 5.0828F, 6.0117F, -0.3927F, 0.3491F, 0.0F));
		PartDefinition wing_right_r42 = body.addOrReplaceChild("wing_right_r42",
				CubeListBuilder.create().texOffs(24, 0).addBox(-0.5F, -5.9935F, -0.481F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 3).addBox(0.0F, -6.0935F, 0.019F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.8004F, 2.981F, 3.8525F, -0.9163F, 0.3491F, 0.0F));
		PartDefinition wing_right_r43 = body.addOrReplaceChild("wing_right_r43", CubeListBuilder.create().texOffs(51, 4).addBox(0.0F, -15.0935F, 1.019F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.9525F, 7.0593F, 7.0178F, -0.3927F, 0.3491F, 0.0F));
		PartDefinition wing_right_r44 = body.addOrReplaceChild("wing_right_r44", CubeListBuilder.create().texOffs(24, 0).addBox(-0.5F, -15.9935F, -0.481F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.7286F, 3.6638F, 0.9076F, -0.9163F, 0.3491F, 0.0F));
		PartDefinition wing_right_r45 = body.addOrReplaceChild("wing_right_r45", CubeListBuilder.create().texOffs(24, 0).addBox(-0.5F, -22.9935F, -0.481F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.3117F, 6.1451F, 8.0047F, -0.3927F, 0.3491F, 0.0F));
		PartDefinition wing_right_r46 = body.addOrReplaceChild("wing_right_r46", CubeListBuilder.create().texOffs(51, 4).addBox(0.0F, -12.1F, -1.0F, 0.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(51, 4)
				.addBox(0.0F, -16.8F, 1.0F, 0.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(51, 4).addBox(0.0F, -21.1F, 3.0F, 0.0F, 15.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.7623F, -7.4984F, 14.7377F, -0.3491F, 0.3491F, 0.0F));
		PartDefinition wing_right_r47 = body.addOrReplaceChild("wing_right_r47", CubeListBuilder.create().texOffs(24, 0).addBox(-0.5F, -29.9935F, -0.481F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.9649F, 8.0495F, 15.2941F, -0.0436F, 0.3491F, 0.0F));
		PartDefinition wing_right_r48 = body.addOrReplaceChild("wing_right_r48",
				CubeListBuilder.create().texOffs(47, 1).addBox(0.0F, -11.1F, -2.0F, 0.0F, 14.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(47, 1).addBox(0.0F, -18.1F, 1.0F, 0.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0854F, -18.4614F, 18.3729F, -0.2618F, 0.3491F, 0.0F));
		PartDefinition wing_right_r49 = body.addOrReplaceChild("wing_right_r49",
				CubeListBuilder.create().texOffs(52, 1).addBox(0.0F, -30.1F, -1.0F, 0.0F, 17.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(51, 4).addBox(0.0F, -26.1F, -2.0F, 0.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.8295F, -2.8693F, 20.4172F, -0.3491F, 0.3491F, 0.0F));
		PartDefinition wing_right_r50 = body.addOrReplaceChild("wing_right_r50", CubeListBuilder.create().texOffs(51, 4).addBox(0.0F, -13.5F, 1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.023F, -22.038F, 15.4539F, -1.1345F, 0.3491F, 0.0F));
		PartDefinition wing_right_r51 = body.addOrReplaceChild("wing_right_r51", CubeListBuilder.create().texOffs(47, 1).addBox(0.0F, -6.0F, -2.0F, 0.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.1535F, -31.9422F, 29.55F, -0.7418F, 0.3491F, 0.0F));
		PartDefinition wing_right_r52 = body.addOrReplaceChild("wing_right_r52", CubeListBuilder.create().texOffs(47, 1).addBox(0.0F, -7.0F, 2.0F, 0.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.6076F, -29.163F, 28.05F, -0.1745F, 0.3491F, 0.0F));
		PartDefinition wing_right_r53 = body.addOrReplaceChild("wing_right_r53", CubeListBuilder.create().texOffs(47, 1).addBox(0.0F, -2.0F, 2.0F, 0.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.2011F, -23.5521F, 26.9331F, -0.6981F, 0.3491F, 0.0F));
		PartDefinition wing_right_r54 = body.addOrReplaceChild("wing_right_r54", CubeListBuilder.create().texOffs(54, 3).addBox(0.0F, -5.0935F, 0.019F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.3854F, 4.3387F, 5.4596F, -0.4363F, 0.3491F, 0.0F));
		PartDefinition wing_left_r1 = body.addOrReplaceChild("wing_left_r1", CubeListBuilder.create().texOffs(51, 4).mirror().addBox(0.0F, 1.1F, -0.75F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(51, 2).mirror()
				.addBox(0.0F, -14.1F, -1.0F, 0.0F, 16.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-8.7876F, 11.8811F, 14.6214F, -2.4146F, -0.3053F, 0.3609F));
		PartDefinition wing_left_r2 = body.addOrReplaceChild("wing_left_r2", CubeListBuilder.create().texOffs(48, 10).mirror().addBox(0.0F, -11.0935F, -1.981F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(48, 10).mirror()
				.addBox(0.0F, -11.0935F, -2.981F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4839F, 2.9336F, 5.9344F, -2.72F, -0.3053F, 0.3609F));
		PartDefinition wing_left_r3 = body.addOrReplaceChild("wing_left_r3", CubeListBuilder.create().texOffs(53, 2).mirror().addBox(0.0F, -10.0935F, 0.019F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.4169F, 4.9917F, 0.4609F, -1.891F, -0.3053F, 0.3609F));
		PartDefinition wing_left_r4 = body.addOrReplaceChild("wing_left_r4", CubeListBuilder.create().texOffs(24, 0).mirror().addBox(-0.5F, -8.9935F, -0.481F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.1209F, 5.4724F, 2.0119F, -1.891F, -0.3053F, 0.3609F));
		PartDefinition wing_left_r5 = body.addOrReplaceChild("wing_left_r5", CubeListBuilder.create().texOffs(24, 0).mirror().addBox(-0.5F, -5.9935F, -0.481F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(52, 2).mirror()
				.addBox(0.0F, -6.0935F, 0.019F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8004F, 2.981F, 3.8525F, -2.4146F, -0.3053F, 0.3609F));
		PartDefinition wing_left_r6 = body.addOrReplaceChild("wing_left_r6", CubeListBuilder.create().texOffs(51, 4).mirror().addBox(0.0F, -15.0935F, 1.019F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.016F, 6.8064F, 0.2057F, -1.891F, -0.3053F, 0.3609F));
		PartDefinition wing_left_r7 = body.addOrReplaceChild("wing_left_r7", CubeListBuilder.create().texOffs(24, 0).mirror().addBox(-0.5F, -15.9935F, -0.481F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.4587F, 0.1994F, 2.9864F, -2.4146F, -0.3053F, 0.3609F));
		PartDefinition wing_left_r8 = body.addOrReplaceChild("wing_left_r8", CubeListBuilder.create().texOffs(24, 0).mirror().addBox(-0.5F, -22.9935F, -0.481F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.6403F, 7.6196F, 1.1479F, -1.891F, -0.3053F, 0.3609F));
		PartDefinition wing_left_r9 = body.addOrReplaceChild(
				"wing_left_r9", CubeListBuilder.create().texOffs(51, 4).mirror().addBox(0.0F, -12.1F, -1.0F, 0.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(51, 4).mirror()
						.addBox(0.0F, -16.8F, 1.0F, 0.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(51, 4).mirror().addBox(0.0F, -21.1F, 3.0F, 0.0F, 15.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-8.7876F, 11.8811F, 14.6214F, -1.8474F, -0.3053F, 0.3609F));
		PartDefinition wing_left_r10 = body.addOrReplaceChild("wing_left_r10", CubeListBuilder.create().texOffs(24, 0).mirror().addBox(-0.5F, -29.9935F, -0.481F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-5.0453F, 15.1289F, -0.1277F, -1.5419F, -0.3053F, 0.3609F));
		PartDefinition wing_left_r11 = body.addOrReplaceChild("wing_left_r11", CubeListBuilder.create().texOffs(47, 1).mirror().addBox(0.0F, -11.1F, -2.0F, 0.0F, 14.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(47, 1).mirror()
				.addBox(0.0F, -18.1F, 1.0F, 0.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-13.0233F, 13.5574F, 25.3172F, -1.7601F, -0.3053F, 0.3609F));
		PartDefinition wing_left_r12 = body.addOrReplaceChild("wing_left_r12", CubeListBuilder.create().texOffs(52, 1).mirror().addBox(0.0F, -30.1F, -1.0F, 0.0F, 17.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(51, 4).mirror()
				.addBox(0.0F, -26.1F, -2.0F, 0.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-9.8597F, 18.2781F, 10.6355F, -1.8474F, -0.3053F, 0.3609F));
		PartDefinition wing_left_r13 = body.addOrReplaceChild("wing_left_r13", CubeListBuilder.create().texOffs(51, 4).mirror().addBox(0.0F, -13.5F, 1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-12.7775F, 10.0616F, 28.5049F, -2.6328F, -0.3053F, 0.3609F));
		PartDefinition wing_left_r14 = body.addOrReplaceChild("wing_left_r14", CubeListBuilder.create().texOffs(47, 1).mirror().addBox(0.0F, -6.0F, -2.0F, 0.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-20.8913F, 22.2237F, 38.9627F, -2.2401F, -0.3053F, 0.3609F));
		PartDefinition wing_left_r15 = body.addOrReplaceChild("wing_left_r15", CubeListBuilder.create().texOffs(47, 1).mirror().addBox(0.0F, -7.0F, 2.0F, 0.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-19.5881F, 21.2291F, 36.2086F, -1.6728F, -0.3053F, 0.3609F));
		PartDefinition wing_left_r16 = body.addOrReplaceChild("wing_left_r16", CubeListBuilder.create().texOffs(47, 1).mirror().addBox(0.0F, -2.0F, 2.0F, 0.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-17.7151F, 21.1035F, 30.7891F, -2.1964F, -0.3053F, 0.3609F));
		PartDefinition wing_left_r17 = body.addOrReplaceChild("wing_left_r17", CubeListBuilder.create().texOffs(54, 2).mirror().addBox(0.0F, -5.0935F, 0.019F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.0887F, 4.3976F, 3.1207F, -2.0655F, -0.3053F, 0.3609F));
		PartDefinition wing_left_r18 = body.addOrReplaceChild("wing_left_r18", CubeListBuilder.create().texOffs(24, 0).mirror().addBox(-1.0F, -4.7144F, -0.6214F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.7276F, 3.45F, 5.1331F, -1.6581F, -0.6545F, 0.0F));
		PartDefinition wing_left_r19 = body.addOrReplaceChild("wing_left_r19", CubeListBuilder.create().texOffs(24, 0).mirror().addBox(-1.0F, -23.7144F, -0.6214F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-10.6993F, 17.8852F, 14.0035F, -0.2182F, -0.8727F, 0.0F));
		PartDefinition wing_left_r20 = body.addOrReplaceChild("wing_left_r20", CubeListBuilder.create().texOffs(24, 0).mirror().addBox(-1.0F, -17.7144F, -0.6214F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.2715F, 7.1019F, 6.0926F, -1.1781F, -0.8727F, 0.0F));
		PartDefinition wing_left_r21 = body.addOrReplaceChild("wing_left_r21", CubeListBuilder.create().texOffs(52, 3).mirror().addBox(0.0F, -43.7F, -5.0F, 0.0F, 13.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-10.2588F, 18.2835F, 12.9812F, -0.7854F, -0.8727F, 0.0F));
		PartDefinition wing_left_r22 = body.addOrReplaceChild("wing_left_r22", CubeListBuilder.create().texOffs(52, 3).mirror().addBox(0.0F, -30.7F, -5.0F, 0.0F, 13.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(52, 3).mirror()
				.addBox(0.0F, -29.7F, 0.0F, 0.0F, 13.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.0537F, 13.0704F, 10.2918F, -1.0036F, -0.8727F, 0.0F));
		PartDefinition wing_left_r23 = body.addOrReplaceChild("wing_left_r23", CubeListBuilder.create().texOffs(52, 3).mirror().addBox(0.0F, -5.0F, -2.5F, 0.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-34.1927F, -13.687F, 33.0641F, -0.9163F, -0.8727F, 0.0F));
		PartDefinition wing_left_r24 = body.addOrReplaceChild("wing_left_r24", CubeListBuilder.create().texOffs(52, 3).mirror().addBox(0.0F, -47.7F, 0.0F, 0.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-19.3138F, 30.3705F, 20.5793F, -0.3491F, -0.8727F, 0.0F));
		PartDefinition wing_left_r25 = body.addOrReplaceChild("wing_left_r25", CubeListBuilder.create().texOffs(52, 3).mirror().addBox(0.0F, -50.7F, 1.0F, 0.0F, 13.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(52, 3).mirror()
				.addBox(0.0F, -43.7F, 6.0F, 0.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.6412F, 3.8392F, 7.4284F, -1.1781F, -0.8727F, 0.0F));
		PartDefinition wing_left_r26 = body.addOrReplaceChild("wing_left_r26", CubeListBuilder.create().texOffs(52, 3).mirror().addBox(0.0F, -43.7F, 0.0F, 0.0F, 13.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-10.9449F, 22.6417F, 13.5569F, -0.6545F, -0.8727F, 0.0F));
		PartDefinition wing_left_r27 = body.addOrReplaceChild("wing_left_r27", CubeListBuilder.create().texOffs(46, 2).mirror().addBox(0.0F, -22.8F, 0.0F, 0.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-9.477F, -2.734F, 12.3252F, -1.789F, -0.8727F, 0.0F));
		PartDefinition wing_left_r28 = body.addOrReplaceChild("wing_left_r28", CubeListBuilder.create().texOffs(46, 2).mirror().addBox(0.0F, -16.8F, 0.0F, 0.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-9.477F, -2.734F, 12.3252F, -1.9635F, -0.8727F, 0.0F));
		PartDefinition wing_left_r29 = body.addOrReplaceChild("wing_left_r29", CubeListBuilder.create().texOffs(54, 3).mirror().addBox(0.0F, -9.8F, 3.0F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-8.4258F, 5.1493F, 11.4432F, -1.1781F, -0.8727F, 0.0F));
		PartDefinition wing_left_r30 = body.addOrReplaceChild(
				"wing_left_r30", CubeListBuilder.create().texOffs(54, 3).mirror().addBox(0.0F, -11.8F, 2.0F, 0.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(54, 3).mirror()
						.addBox(0.0F, -13.0F, 0.0F, 0.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(54, 3).mirror().addBox(0.0F, -12.0F, -2.0F, 0.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-8.0625F, 5.4062F, 11.1383F, -1.1781F, -0.8727F, 0.0F));
		PartDefinition wing_left_r31 = body.addOrReplaceChild("wing_left_r31", CubeListBuilder.create().texOffs(44, 3).mirror().addBox(0.0F, -2.0F, -3.0F, 0.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-37.8719F, -18.838F, 36.1513F, -1.7453F, -0.8727F, 0.0F));
		PartDefinition wing_left_r32 = body.addOrReplaceChild("wing_left_r32", CubeListBuilder.create().texOffs(49, 1).mirror().addBox(0.0F, -3.5F, -3.0F, 0.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-34.2915F, -18.8461F, 33.147F, -1.4835F, -0.8727F, 0.0F));
		PartDefinition wing_left_r33 = body.addOrReplaceChild("wing_left_r33", CubeListBuilder.create().texOffs(49, 1).mirror().addBox(0.0F, -46.5F, -2.0F, 0.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(49, 1).mirror()
				.addBox(0.0F, -41.5F, -2.0F, 0.0F, 15.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.8831F, 6.6928F, 7.6313F, -0.9599F, -0.8727F, 0.0F));
		PartDefinition wing_left_r34 = body.addOrReplaceChild(
				"wing_left_r34", CubeListBuilder.create().texOffs(49, 2).mirror().addBox(0.0F, -35.5F, -2.0F, 0.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(49, 2).mirror()
						.addBox(0.0F, -25.5F, -4.0F, 0.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(49, 2).mirror().addBox(0.0F, -25.5F, -2.0F, 0.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-11.193F, 12.9383F, 13.7651F, -0.5236F, -0.8727F, 0.0F));
		PartDefinition wing_left_r35 = body.addOrReplaceChild("wing_left_r35", CubeListBuilder.create().texOffs(51, 9).mirror().addBox(0.0F, -6.5F, -1.0F, 0.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-8.0625F, 5.4062F, 11.1383F, -1.8762F, -0.8727F, 0.0F));
		PartDefinition wing_left_r36 = body.addOrReplaceChild("wing_left_r36", CubeListBuilder.create().texOffs(51, 9).mirror().addBox(-0.5F, -7.7144F, -0.1214F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(24, 0).mirror()
				.addBox(-1.0F, -7.7144F, -0.6214F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9804F, 3.45F, 5.8484F, -1.6581F, -0.8727F, 0.0F));
		PartDefinition wing_left_r37 = body.addOrReplaceChild("wing_left_r37", CubeListBuilder.create().texOffs(51, 9).mirror().addBox(-0.5F, -5.7144F, -0.1214F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.0976F, 6.1964F, 6.7859F, -1.1345F, -0.8727F, 0.0F));
		PartDefinition wing_left_r38 = body.addOrReplaceChild("wing_left_r38", CubeListBuilder.create().texOffs(51, 4).mirror().addBox(0.0F, 1.1F, -0.75F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(51, 2).mirror()
				.addBox(0.0F, -14.1F, -1.0F, 0.0F, 16.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.7623F, -7.4984F, 14.7377F, -0.9163F, -0.3491F, 0.0F));
		PartDefinition wing_left_r39 = body.addOrReplaceChild("wing_left_r39", CubeListBuilder.create().texOffs(48, 10).mirror().addBox(0.0F, -11.0935F, -1.981F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(48, 10).mirror()
				.addBox(0.0F, -11.0935F, -2.981F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9217F, 0.8181F, 4.1858F, -1.2217F, -0.3491F, 0.0F));
		PartDefinition wing_left_r40 = body.addOrReplaceChild("wing_left_r40", CubeListBuilder.create().texOffs(54, 3).mirror().addBox(0.0F, -10.0935F, 0.019F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.3078F, 6.6541F, 5.2465F, -0.3927F, -0.3491F, 0.0F));
		PartDefinition wing_left_r41 = body.addOrReplaceChild("wing_left_r41", CubeListBuilder.create().texOffs(24, 0).mirror().addBox(-0.5F, -8.9935F, -0.481F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.5863F, 5.0828F, 6.0117F, -0.3927F, -0.3491F, 0.0F));
		PartDefinition wing_left_r42 = body.addOrReplaceChild("wing_left_r42", CubeListBuilder.create().texOffs(24, 0).mirror().addBox(-0.5F, -5.9935F, -0.481F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(54, 3).mirror()
				.addBox(0.0F, -6.0935F, 0.019F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8004F, 2.981F, 3.8525F, -0.9163F, -0.3491F, 0.0F));
		PartDefinition wing_left_r43 = body.addOrReplaceChild("wing_left_r43", CubeListBuilder.create().texOffs(51, 4).mirror().addBox(0.0F, -15.0935F, 1.019F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.9525F, 7.0593F, 7.0178F, -0.3927F, -0.3491F, 0.0F));
		PartDefinition wing_left_r44 = body.addOrReplaceChild("wing_left_r44", CubeListBuilder.create().texOffs(24, 0).mirror().addBox(-0.5F, -15.9935F, -0.481F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.7286F, 3.6638F, 0.9076F, -0.9163F, -0.3491F, 0.0F));
		PartDefinition wing_left_r45 = body.addOrReplaceChild("wing_left_r45", CubeListBuilder.create().texOffs(24, 0).mirror().addBox(-0.5F, -22.9935F, -0.481F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.3117F, 6.1451F, 8.0047F, -0.3927F, -0.3491F, 0.0F));
		PartDefinition wing_left_r46 = body.addOrReplaceChild(
				"wing_left_r46", CubeListBuilder.create().texOffs(51, 4).mirror().addBox(0.0F, -12.1F, -1.0F, 0.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(51, 4).mirror()
						.addBox(0.0F, -16.8F, 1.0F, 0.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(51, 4).mirror().addBox(0.0F, -21.1F, 3.0F, 0.0F, 15.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-5.7623F, -7.4984F, 14.7377F, -0.3491F, -0.3491F, 0.0F));
		PartDefinition wing_left_r47 = body.addOrReplaceChild("wing_left_r47", CubeListBuilder.create().texOffs(24, 0).mirror().addBox(-0.5F, -29.9935F, -0.481F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-5.9649F, 8.0495F, 15.2941F, -0.0436F, -0.3491F, 0.0F));
		PartDefinition wing_left_r48 = body.addOrReplaceChild("wing_left_r48", CubeListBuilder.create().texOffs(47, 1).mirror().addBox(0.0F, -11.1F, -2.0F, 0.0F, 14.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(47, 1).mirror()
				.addBox(0.0F, -18.1F, 1.0F, 0.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.0854F, -18.4614F, 18.3729F, -0.2618F, -0.3491F, 0.0F));
		PartDefinition wing_left_r49 = body.addOrReplaceChild("wing_left_r49", CubeListBuilder.create().texOffs(52, 1).mirror().addBox(0.0F, -30.1F, -1.0F, 0.0F, 17.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(51, 4).mirror()
				.addBox(0.0F, -26.1F, -2.0F, 0.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.8295F, -2.8693F, 20.4172F, -0.3491F, -0.3491F, 0.0F));
		PartDefinition wing_left_r50 = body.addOrReplaceChild("wing_left_r50", CubeListBuilder.create().texOffs(51, 4).mirror().addBox(0.0F, -13.5F, 1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-6.023F, -22.038F, 15.4539F, -1.1345F, -0.3491F, 0.0F));
		PartDefinition wing_left_r51 = body.addOrReplaceChild("wing_left_r51", CubeListBuilder.create().texOffs(47, 1).mirror().addBox(0.0F, -6.0F, -2.0F, 0.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-11.1535F, -31.9422F, 29.55F, -0.7418F, -0.3491F, 0.0F));
		PartDefinition wing_left_r52 = body.addOrReplaceChild("wing_left_r52", CubeListBuilder.create().texOffs(47, 1).mirror().addBox(0.0F, -7.0F, 2.0F, 0.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-10.6076F, -29.163F, 28.05F, -0.1745F, -0.3491F, 0.0F));
		PartDefinition wing_left_r53 = body.addOrReplaceChild("wing_left_r53", CubeListBuilder.create().texOffs(47, 1).mirror().addBox(0.0F, -2.0F, 2.0F, 0.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-10.2011F, -23.5521F, 26.9331F, -0.6981F, -0.3491F, 0.0F));
		PartDefinition wing_left_r54 = body.addOrReplaceChild("wing_left_r54", CubeListBuilder.create().texOffs(53, 3).mirror().addBox(0.0F, -5.0935F, 0.019F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.3854F, 4.3387F, 5.4596F, -0.4363F, -0.3491F, 0.0F));
		PartDefinition armor_r1 = body.addOrReplaceChild("armor_r1",
				CubeListBuilder.create().texOffs(48, 7).addBox(-1.5F, -2.5F, -0.25F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 4).addBox(-2.4F, 2.0F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 4)
						.addBox(-2.4F, 8.0F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 4).addBox(-2.4F, 0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 4)
						.addBox(-2.4F, -0.75F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 4).addBox(-1.8F, -3.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5F, 3.0F, -2.25F, 0.0F, 0.1745F, 0.0F));
		PartDefinition armor_r2 = body.addOrReplaceChild("armor_r2",
				CubeListBuilder.create().texOffs(48, 7).mirror().addBox(-2.5F, -2.5F, -0.25F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 4).mirror().addBox(-1.6F, 0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 4).mirror().addBox(-1.6F, -0.75F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 4).mirror().addBox(-2.2F, -3.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 4).mirror().addBox(-1.6F, 2.0F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 4).mirror().addBox(-1.6F, 8.0F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(2.5F, 3.0F, -2.25F, 0.0F, -0.1745F, 0.0F));
		PartDefinition armor_r3 = body.addOrReplaceChild("armor_r3", CubeListBuilder.create().texOffs(0, 4).mirror().addBox(-2.2F, -3.0F, -0.5F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.5F, 3.0F, -1.25F, 0.0F, -0.1745F, 0.0F));
		PartDefinition armor_r4 = body.addOrReplaceChild("armor_r4", CubeListBuilder.create().texOffs(0, 4).addBox(-1.8F, -3.0F, -0.5F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5F, 3.0F, -1.25F, 0.0F, 0.1745F, 0.0F));
		PartDefinition armor_r5 = body.addOrReplaceChild("armor_r5", CubeListBuilder.create().texOffs(0, 4).mirror().addBox(-2.0F, -5.5F, -0.5F, 5.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(4.7157F, 5.5F, -0.2775F, 0.0F, -1.4399F, 0.0F));
		PartDefinition leftarm = partdefinition.addOrReplaceChild("leftarm",
				CubeListBuilder.create().texOffs(0, 48).addBox(0.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(9, 32).mirror().addBox(3.6F, 8.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(54, 7).mirror().addBox(3.6F, 7.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(54, 7).mirror().addBox(3.6F, 8.8F, 0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(9, 32).mirror().addBox(3.6F, 7.3F, 0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(9, 32).mirror().addBox(3.6F, 7.3F, -1.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(54, 7).mirror().addBox(3.6F, 8.8F, -1.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(48, 5).mirror().addBox(0.0F, 2.0F, -2.2F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 0).mirror().addBox(0.0F, 4.0F, -2.2F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(48, 5).mirror().addBox(0.0F, 6.0F, -2.2F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(48, 0).mirror().addBox(-0.3F, 2.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(48, 0).mirror().addBox(-0.3F, 6.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 0).mirror().addBox(-0.3F, 4.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(48, 0).mirror().addBox(3.3F, 6.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(48, 0).mirror().addBox(3.3F, 2.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 0).mirror().addBox(3.3F, 4.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 0).mirror().addBox(0.0F, 4.0F, 1.3F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 0).mirror().addBox(-0.3F, 7.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 0).mirror().addBox(0.0F, 7.0F, 1.3F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 0).mirror().addBox(0.0F, 7.0F, -2.2F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 0).mirror().addBox(3.3F, 7.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(48, 5).mirror().addBox(0.0F, 6.0F, 1.3F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(48, 5).mirror().addBox(0.0F, 2.0F, 1.3F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 0).mirror().addBox(-0.4F, -2.5F, -2.5F, 2.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(4.0F, 2.0F, 0.0F));
		PartDefinition l_arm_r1 = leftarm.addOrReplaceChild("l_arm_r1", CubeListBuilder.create().texOffs(0, 4).mirror().addBox(-2.0F, -6.0F, -4.5F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(26, 3).mirror()
				.addBox(-1.7F, -3.5F, -3.9F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7157F, 3.5F, -0.2775F, 0.0F, -1.4399F, 0.0F));
		PartDefinition l_arm_r2 = leftarm.addOrReplaceChild("l_arm_r2", CubeListBuilder.create().texOffs(0, 4).mirror().addBox(-2.0F, -6.0F, -4.5F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.5232F, 3.5F, 0.8142F, -3.1416F, -1.0908F, 3.1416F));
		PartDefinition l_arm_r3 = leftarm.addOrReplaceChild("l_arm_r3", CubeListBuilder.create().texOffs(26, 3).mirror().addBox(0.3F, -3.5F, -3.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.1379F, 3.5F, -0.9415F, -3.1416F, -1.5272F, 3.1416F));
		PartDefinition rightarm = partdefinition.addOrReplaceChild("rightarm",
				CubeListBuilder.create().texOffs(0, 48).addBox(-4.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(9, 32).addBox(-4.6F, 8.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 7)
						.addBox(-4.6F, 7.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 7).addBox(-4.6F, 8.8F, 0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(9, 32)
						.addBox(-4.6F, 7.3F, 0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(9, 32).addBox(-4.6F, 7.3F, -1.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 7)
						.addBox(-4.6F, 8.8F, -1.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 5).addBox(-4.0F, 2.0F, -2.2F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.0F, 4.0F, -2.2F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 5).addBox(-4.0F, 6.0F, -2.2F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(-0.7F, 2.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 0).addBox(-0.7F, 6.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.7F, 4.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 0).addBox(-4.3F, 6.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(-4.3F, 2.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-4.3F, 4.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.0F, 4.0F, 1.3F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.7F, 7.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.0F, 7.0F, 1.3F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-4.0F, 7.0F, -2.2F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.3F, 7.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 5).addBox(-4.0F, 6.0F, 1.3F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 5)
						.addBox(-4.0F, 2.0F, 1.3F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.6F, -2.5F, -2.5F, 2.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-4.0F, 2.0F, 0.0F));
		PartDefinition r_arm_r1 = rightarm.addOrReplaceChild("r_arm_r1",
				CubeListBuilder.create().texOffs(0, 4).addBox(-2.0F, -6.0F, -4.5F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(26, 3).addBox(-0.3F, -3.5F, -3.9F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.7157F, 3.5F, -0.2775F, 0.0F, 1.4399F, 0.0F));
		PartDefinition r_arm_r2 = rightarm.addOrReplaceChild("r_arm_r2", CubeListBuilder.create().texOffs(0, 4).addBox(-1.0F, -6.0F, -4.5F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5232F, 3.5F, 0.8142F, -3.1416F, 1.0908F, 3.1416F));
		PartDefinition r_arm_r3 = rightarm.addOrReplaceChild("r_arm_r3", CubeListBuilder.create().texOffs(26, 3).addBox(-3.3F, -3.5F, -3.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.1379F, 3.5F, -0.9415F, -3.1416F, 1.5272F, 3.1416F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
