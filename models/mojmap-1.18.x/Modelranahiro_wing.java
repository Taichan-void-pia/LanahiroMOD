// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelranahiro_wing<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "ranahiro_wing"), "main");
	private final ModelPart leftarm;
	private final ModelPart rightarm;
	private final ModelPart body;

	public Modelranahiro_wing(ModelPart root) {
		this.leftarm = root.getChild("leftarm");
		this.rightarm = root.getChild("rightarm");
		this.body = root.getChild("body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition leftarm = partdefinition.addOrReplaceChild("leftarm", CubeListBuilder.create().texOffs(0, 48)
				.addBox(0.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(4.0F, 2.0F, 0.0F));

		PartDefinition rightarm = partdefinition.addOrReplaceChild("rightarm", CubeListBuilder.create().texOffs(0, 48)
				.addBox(-4.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-4.0F, 2.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 48).addBox(
				-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition wing = body.addOrReplaceChild("wing", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, -1.0F));

		PartDefinition right = wing.addOrReplaceChild("right", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.4658F, -23.3772F, 5.2465F, 0.0F, -0.5236F, 1.5708F));

		PartDefinition cube_r1 = right.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(12, 10).mirror()
						.addBox(-0.5F, -0.5F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.3221F, 18.2449F, -2.2338F, -2.0071F, 0.3054F, -0.48F));

		PartDefinition cube_r2 = right.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(12, 10).mirror()
						.addBox(-0.5F, -0.5F, -4.5F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.2662F, 18.6991F, -2.4353F, -2.0071F, 0.3054F, -0.2618F));

		PartDefinition cube_r3 = right.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(12, 10).mirror()
				.addBox(-1.5F, -0.5F, -2.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(12, 10)
				.mirror().addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(12, 10).mirror().addBox(0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.mirror(false), PartPose.offsetAndRotation(0.3221F, 14.1781F, -1.0425F, -2.0508F, 0.2618F, -0.4363F));

		PartDefinition cube_r4 = right.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(12, 10).mirror()
						.addBox(-0.5F, 0.5F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.4612F, 13.0147F, -0.0035F, -2.3126F, 0.2182F, -0.6545F));

		PartDefinition cube_r5 = right.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(12, 10).mirror()
						.addBox(-0.5F, 0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.2358F, 12.4203F, -0.22F, -2.3126F, 0.2182F, -0.6545F));

		PartDefinition cube_r6 = right.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(12, 10).mirror()
						.addBox(0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.7224F, 11.6298F, 0.1139F, -1.9199F, 0.2182F, -0.6545F));

		PartDefinition cube_r7 = right.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(12, 10).mirror()
						.addBox(-0.5F, -1.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.1274F, 10.8879F, -1.0199F, -2.2689F, 0.2182F, -0.4363F));

		PartDefinition cube_r8 = right.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(12, 10).mirror()
				.addBox(13.1452F, 4.8225F, -35.4255F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.9427F, 45.0686F, -3.1524F, -1.9635F, 0.2618F, -0.4363F));

		PartDefinition cube_r9 = right.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(12, 10).mirror()
						.addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.1424F, 10.4764F, 0.5609F, -1.6144F, 0.3054F, -0.6545F));

		PartDefinition cube_r10 = right.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(12, 10).mirror()
						.addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.0731F, 9.1686F, 1.1903F, -1.3526F, 0.3054F, -0.7854F));

		PartDefinition cube_r11 = right.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(12, 10).mirror()
						.addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.0475F, 9.5003F, 0.2473F, -1.789F, 0.2618F, -0.6545F));

		PartDefinition cube_r12 = right.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(12, 10).mirror()
						.addBox(-0.5F, -1.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.6988F, 8.3951F, 0.6629F, -1.2654F, 0.2618F, -0.4363F));

		PartDefinition cube_r13 = right.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(12, 10).mirror()
						.addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.0228F, 7.5818F, 1.2876F, -1.6144F, 0.5672F, -0.5236F));

		PartDefinition cube_r14 = right.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(12, 10).mirror()
				.addBox(14.7112F, -21.3884F, -30.5687F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.9427F, 45.0686F, -3.1524F, -1.3526F, 0.5672F, -0.5236F));

		PartDefinition cube_r15 = right.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(12, 10).mirror()
				.addBox(13.7112F, -30.5595F, -23.1142F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.9427F, 45.0686F, -3.1524F, -1.0036F, 0.5672F, -0.5236F));

		PartDefinition cube_r16 = right.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(19, 2).mirror()
				.addBox(8.2833F, -34.9807F, -20.6605F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.9427F, 45.0686F, -3.1524F, -1.0036F, 1.0036F, -0.5236F));

		PartDefinition cube_r17 = right.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(2, 2).mirror()
						.addBox(-1.5F, -0.5F, -5.5F, 1.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-11.6211F, 21.0367F, -3.1928F, -1.8326F, 0.2182F, 0.9599F));

		PartDefinition cube_r18 = right.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(10, 0).mirror()
				.addBox(-1.5F, -0.5F, -4.5F, 1.0F, 1.0F, 23.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(12, 10)
				.mirror().addBox(-0.5F, -0.5F, -4.5F, 1.0F, 1.0F, 20.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(12, 10).mirror().addBox(0.5F, -0.5F, -4.5F, 1.0F, 1.0F, 19.0F, new CubeDeformation(0.0F))
				.mirror(false), PartPose.offsetAndRotation(-8.629F, 20.4237F, -2.3735F, -1.8326F, -0.0436F, 1.0472F));

		PartDefinition cube_r19 = right.addOrReplaceChild("cube_r19",
				CubeListBuilder.create().texOffs(12, 10).mirror()
						.addBox(-1.5F, -0.5F, -5.5F, 3.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.3341F, 14.4726F, -0.4046F, -1.7017F, -0.2618F, 0.5672F));

		PartDefinition cube_r20 = right.addOrReplaceChild("cube_r20",
				CubeListBuilder.create().texOffs(12, 10).mirror()
						.addBox(2.4534F, 1.2681F, -38.2032F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.3783F, 45.2717F, -1.4441F, -1.6581F, -0.6545F, -0.0436F));

		PartDefinition cube_r21 = right.addOrReplaceChild("cube_r21",
				CubeListBuilder.create().texOffs(5, 7).mirror()
						.addBox(0.0F, -0.5F, -2.5F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-12.9711F, 19.4315F, -2.9543F, -1.4835F, -0.6545F, 0.7854F));

		PartDefinition cube_r22 = right.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(5, 7).mirror()
				.addBox(-25.5667F, -13.1527F, -16.5595F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.3783F, 45.2717F, -1.4441F, -1.7453F, -0.5672F, 0.9163F));

		PartDefinition cube_r23 = right.addOrReplaceChild("cube_r23",
				CubeListBuilder.create().texOffs(5, 7).mirror()
						.addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-6.0455F, 10.6368F, -1.8727F, -1.7017F, -0.7854F, 0.829F));

		PartDefinition cube_r24 = right.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(5, 7).mirror()
				.addBox(-20.5667F, -13.1527F, -28.5595F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.3783F, 45.2717F, -1.4441F, -1.9199F, -0.7854F, 0.829F));

		PartDefinition cube_r25 = right.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(5, 7).mirror()
				.addBox(-24.5667F, -4.1527F, -31.5595F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.3783F, 45.2717F, -1.4441F, -2.138F, -0.6545F, 0.829F));

		PartDefinition cube_r26 = right.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(5, 19).mirror()
				.addBox(-22.5221F, -2.3201F, -22.3235F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.3783F, 45.2717F, -1.4441F, -1.789F, -0.3054F, 0.5672F));

		PartDefinition cube_r27 = right.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(5, 19).mirror()
				.addBox(-21.5221F, -4.3201F, -28.3235F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.3783F, 45.2717F, -1.4441F, -1.7017F, -0.3054F, 0.5672F));

		PartDefinition cube_r28 = right.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(5, 19).mirror()
				.addBox(-21.5221F, 0.6799F, -33.3235F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.3783F, 45.2717F, -1.4441F, -1.8762F, -0.3054F, 0.5672F));

		PartDefinition cube_r29 = right.addOrReplaceChild("cube_r29",
				CubeListBuilder.create().texOffs(5, 22).mirror()
						.addBox(-1.5F, -0.5F, -2.5F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.6596F, 4.6313F, -0.5724F, -0.7854F, -0.829F, 0.2182F));

		PartDefinition cube_r30 = right.addOrReplaceChild("cube_r30",
				CubeListBuilder.create().texOffs(5, 22).mirror()
						.addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.6596F, 4.6313F, -0.5724F, -0.6109F, -0.6109F, 0.0873F));

		PartDefinition cube_r31 = right.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(5, 22).mirror()
				.addBox(-1.5007F, -30.9132F, -29.4272F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.3783F, 45.2717F, -1.4441F, -0.7854F, -0.6109F, 0.0436F));

		PartDefinition cube_r32 = right.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(12, 10).mirror()
				.addBox(3.5358F, -29.4155F, -29.7554F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.3783F, 45.2717F, -1.4441F, -0.7854F, -0.2618F, -0.0873F));

		PartDefinition cube_r33 = right.addOrReplaceChild("cube_r33",
				CubeListBuilder.create().texOffs(15, 4).mirror()
						.addBox(-0.5F, -0.5F, -7.0F, 1.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-11.0349F, 26.3577F, -5.6282F, -2.0071F, -0.2618F, 0.2618F));

		PartDefinition cube_r34 = right.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(15, 4).mirror()
				.addBox(-2.5F, -0.5F, -4.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(15, 4)
				.mirror().addBox(-1.5F, -0.5F, -4.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(15, 4).mirror().addBox(-0.5F, -0.5F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
				.mirror(false), PartPose.offsetAndRotation(-24.1385F, 30.7726F, -7.415F, -1.8326F, -0.1745F, 1.3526F));

		PartDefinition cube_r35 = right.addOrReplaceChild("cube_r35",
				CubeListBuilder.create().texOffs(15, 4).mirror()
						.addBox(-0.5F, -0.5F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-23.2052F, 30.5197F, -7.1601F, -1.8326F, -0.1745F, 1.0908F));

		PartDefinition cube_r36 = right.addOrReplaceChild("cube_r36",
				CubeListBuilder.create().texOffs(15, 4).mirror()
						.addBox(-0.5F, -0.5F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-23.2052F, 30.5197F, -7.1601F, -1.8326F, -0.1745F, 0.829F));

		PartDefinition cube_r37 = right.addOrReplaceChild("cube_r37",
				CubeListBuilder.create().texOffs(15, 4).mirror()
						.addBox(-0.5F, -0.5F, -3.5F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-22.9646F, 30.1003F, -7.0327F, -1.8326F, -0.1745F, 0.5672F));

		PartDefinition cube_r38 = right.addOrReplaceChild("cube_r38",
				CubeListBuilder.create().texOffs(15, 4).mirror()
						.addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-21.8792F, 30.1693F, -6.7738F, -1.8326F, -0.1309F, 0.5236F));

		PartDefinition cube_r39 = right.addOrReplaceChild("cube_r39",
				CubeListBuilder.create().texOffs(15, 4).mirror()
						.addBox(-0.5F, -0.5F, -6.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-22.5706F, 33.6245F, -7.6868F, -1.8762F, -0.1309F, 0.5236F));

		PartDefinition cube_r40 = right.addOrReplaceChild("cube_r40",
				CubeListBuilder.create().texOffs(15, 4).mirror()
						.addBox(-0.5F, -0.5F, -5.5F, 1.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-18.6742F, 28.0781F, -6.0666F, -1.9199F, -0.2618F, 0.5236F));

		PartDefinition cube_r41 = right.addOrReplaceChild("cube_r41",
				CubeListBuilder.create().texOffs(15, 4).mirror()
						.addBox(-0.5F, -0.5F, -5.5F, 1.0F, 1.0F, 17.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-16.6581F, 25.9869F, -4.8167F, -1.9199F, -0.2618F, 0.5236F));

		PartDefinition cube_r42 = right.addOrReplaceChild("cube_r42",
				CubeListBuilder.create().texOffs(15, 4).mirror()
						.addBox(-0.5F, -0.5F, -3.5F, 1.0F, 1.0F, 17.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-15.0468F, 25.4372F, -5.1352F, -1.9199F, -0.2618F, 0.5236F));

		PartDefinition cube_r43 = right.addOrReplaceChild("cube_r43",
				CubeListBuilder.create().texOffs(4, 4).mirror()
						.addBox(-0.5F, -0.5F, -11.5F, 1.0F, 1.0F, 20.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-15.0439F, 28.3952F, -6.8005F, -1.9199F, -0.2618F, 0.5236F));

		PartDefinition cube_r44 = right.addOrReplaceChild("cube_r44",
				CubeListBuilder.create().texOffs(15, 4).mirror()
						.addBox(-1.5F, -0.6798F, -7.0F, 1.0F, 1.0F, 16.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(15, 4).mirror()
						.addBox(-0.5F, -0.0798F, -7.0F, 1.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-12.7587F, 28.057F, -5.828F, -2.0071F, -0.2618F, 0.5236F));

		PartDefinition cube_r45 = right.addOrReplaceChild("cube_r45",
				CubeListBuilder.create().texOffs(15, 4).mirror()
						.addBox(-0.5F, -0.5F, -9.5F, 1.0F, 1.0F, 16.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-12.5032F, 28.1959F, -6.9075F, -2.0071F, -0.2618F, 0.3927F));

		PartDefinition cube_r46 = right.addOrReplaceChild("cube_r46",
				CubeListBuilder.create().texOffs(15, 4).mirror()
						.addBox(-0.5F, -0.5F, -8.0F, 1.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-11.2421F, 27.2468F, -6.0364F, -2.0071F, -0.2618F, 0.3927F));

		PartDefinition cube_r47 = right.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(15, 4).mirror()
				.addBox(-1.5F, -0.5F, -5.0F, 1.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(15, 4)
				.mirror().addBox(-0.5F, -0.5F, -5.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-10.0827F, 24.6938F, -4.4773F, -2.0508F, -0.2618F, 0.1309F));

		PartDefinition cube_r48 = right.addOrReplaceChild("cube_r48",
				CubeListBuilder.create().texOffs(15, 4).mirror()
						.addBox(-0.5F, -0.5F, -7.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-8.8604F, 25.4006F, -5.4805F, -2.0508F, -0.2618F, 0.1309F));

		PartDefinition cube_r49 = right.addOrReplaceChild("cube_r49",
				CubeListBuilder.create().texOffs(15, 4).mirror()
						.addBox(-0.5F, -0.5F, -4.0F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-7.9108F, 22.8416F, -3.8837F, -2.0508F, -0.2618F, 0.1309F));

		PartDefinition cube_r50 = right.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(15, 4).mirror()
				.addBox(-1.0F, -0.5F, -3.5F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(15, 4)
				.mirror().addBox(0.0F, -0.5F, -3.5F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-6.438F, 22.5246F, -3.3833F, -2.0508F, -0.2618F, 0.1309F));

		PartDefinition cube_r51 = right.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(15, 4).mirror()
				.addBox(-1.5F, -0.5F, -2.5F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(15, 4)
				.mirror().addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-4.6159F, 21.3035F, -2.303F, -2.0071F, -0.2182F, 0.0873F));

		PartDefinition cube_r52 = right.addOrReplaceChild("cube_r52",
				CubeListBuilder.create().texOffs(15, 4).mirror()
						.addBox(-0.5F, -0.5F, -5.5F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.7012F, 19.7074F, -2.2831F, -1.8762F, 0.1745F, -0.0436F));

		PartDefinition cube_r53 = right.addOrReplaceChild("cube_r53",
				CubeListBuilder.create().texOffs(15, 4).mirror()
						.addBox(-0.5F, -0.5F, -5.5F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.7107F, 19.6642F, -2.4137F, -1.9635F, 0.1309F, -0.0436F));

		PartDefinition cube_r54 = right.addOrReplaceChild("cube_r54",
				CubeListBuilder.create().texOffs(15, 4).mirror()
						.addBox(-0.1585F, -0.5F, -5.5F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.1073F, 18.5596F, -2.3926F, -2.0508F, -0.0873F, 0.0436F));

		PartDefinition cube_r55 = right.addOrReplaceChild("cube_r55",
				CubeListBuilder.create().texOffs(15, 4).mirror()
						.addBox(-0.5F, -0.5F, -5.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.117F, 18.6285F, -2.2618F, -2.0071F, -0.0873F, -0.0436F));

		PartDefinition cube_r56 = right.addOrReplaceChild("cube_r56",
				CubeListBuilder.create().texOffs(12, 10).mirror()
						.addBox(1.5358F, 2.8324F, -38.869F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.3783F, 45.2717F, -1.4441F, -1.7453F, 0.2618F, -0.0873F));

		PartDefinition cube_r57 = right.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(12, 10).mirror()
				.addBox(2.5358F, -28.1201F, -29.9424F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.3783F, 45.2717F, -1.4441F, -0.8727F, 0.2618F, -0.0873F));

		PartDefinition cube_r58 = right.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(19, 2).mirror()
				.addBox(11.9917F, -36.6696F, -17.1623F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.3783F, 45.2717F, -1.4441F, -0.7854F, 0.829F, -0.4363F));

		PartDefinition cube_r59 = right.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(12, 10).mirror()
				.addBox(2.5358F, -30.7554F, -30.4155F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.3783F, 45.2717F, -1.4441F, -0.7854F, 0.2618F, -0.0873F));

		PartDefinition cube_r60 = right.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(12, 10).mirror()
				.addBox(1.0358F, -28.2554F, -34.9155F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.7327F, 44.3772F, 0.8998F, -0.7854F, 0.2618F, -0.0873F));

		PartDefinition left = wing.addOrReplaceChild("left", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.4658F, -23.3772F, 5.2465F, 0.0F, 0.5236F, -1.5708F));

		PartDefinition cube_r61 = left.addOrReplaceChild("cube_r61",
				CubeListBuilder.create().texOffs(12, 10).addBox(-0.5F, -0.5F, -4.0F, 1.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3221F, 18.2449F, -2.2338F, -2.0071F, -0.3054F, 0.48F));

		PartDefinition cube_r62 = left.addOrReplaceChild("cube_r62",
				CubeListBuilder.create().texOffs(12, 10).addBox(-0.5F, -0.5F, -4.5F, 1.0F, 1.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2662F, 18.6991F, -2.4353F, -2.0071F, -0.3054F, 0.2618F));

		PartDefinition cube_r63 = left.addOrReplaceChild("cube_r63",
				CubeListBuilder.create().texOffs(12, 10)
						.addBox(0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(12, 10)
						.addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(12, 10)
						.addBox(-1.5F, -0.5F, -2.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3221F, 14.1781F, -1.0425F, -2.0508F, -0.2618F, 0.4363F));

		PartDefinition cube_r64 = left.addOrReplaceChild("cube_r64",
				CubeListBuilder.create().texOffs(12, 10).addBox(-0.5F, 0.5F, -3.0F, 1.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.4612F, 13.0147F, -0.0035F, -2.3126F, -0.2182F, 0.6545F));

		PartDefinition cube_r65 = left.addOrReplaceChild("cube_r65",
				CubeListBuilder.create().texOffs(12, 10).addBox(-0.5F, 0.5F, -2.0F, 1.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.2358F, 12.4203F, -0.22F, -2.3126F, -0.2182F, 0.6545F));

		PartDefinition cube_r66 = left.addOrReplaceChild("cube_r66",
				CubeListBuilder.create().texOffs(12, 10).addBox(-1.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7224F, 11.6298F, 0.1139F, -1.9199F, -0.2182F, 0.6545F));

		PartDefinition cube_r67 = left.addOrReplaceChild("cube_r67",
				CubeListBuilder.create().texOffs(12, 10).addBox(-0.5F, -1.5F, -2.0F, 1.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.1274F, 10.8879F, -1.0199F, -2.2689F, -0.2182F, 0.4363F));

		PartDefinition cube_r68 = left.addOrReplaceChild("cube_r68",
				CubeListBuilder.create().texOffs(12, 10).addBox(-14.1452F, 4.8225F, -35.4255F, 1.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.9427F, 45.0686F, -3.1524F, -1.9635F, -0.2618F, 0.4363F));

		PartDefinition cube_r69 = left.addOrReplaceChild("cube_r69",
				CubeListBuilder.create().texOffs(12, 10).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.1424F, 10.4764F, 0.5609F, -1.6144F, -0.3054F, 0.6545F));

		PartDefinition cube_r70 = left.addOrReplaceChild("cube_r70",
				CubeListBuilder.create().texOffs(12, 10).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0731F, 9.1686F, 1.1903F, -1.3526F, -0.3054F, 0.7854F));

		PartDefinition cube_r71 = left.addOrReplaceChild("cube_r71",
				CubeListBuilder.create().texOffs(12, 10).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0475F, 9.5003F, 0.2473F, -1.789F, -0.2618F, 0.6545F));

		PartDefinition cube_r72 = left.addOrReplaceChild("cube_r72",
				CubeListBuilder.create().texOffs(12, 10).addBox(-0.5F, -1.5F, -2.0F, 1.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.6988F, 8.3951F, 0.6629F, -1.2654F, -0.2618F, 0.4363F));

		PartDefinition cube_r73 = left.addOrReplaceChild("cube_r73",
				CubeListBuilder.create().texOffs(12, 10).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0228F, 7.5818F, 1.2876F, -1.6144F, -0.5672F, 0.5236F));

		PartDefinition cube_r74 = left.addOrReplaceChild("cube_r74",
				CubeListBuilder.create().texOffs(12, 10).addBox(-15.7112F, -21.3884F, -30.5687F, 1.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.9427F, 45.0686F, -3.1524F, -1.3526F, -0.5672F, 0.5236F));

		PartDefinition cube_r75 = left.addOrReplaceChild("cube_r75",
				CubeListBuilder.create().texOffs(12, 10).addBox(-15.7112F, -30.5595F, -23.1142F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.9427F, 45.0686F, -3.1524F, -1.0036F, -0.5672F, 0.5236F));

		PartDefinition cube_r76 = left.addOrReplaceChild("cube_r76",
				CubeListBuilder.create().texOffs(19, 2).addBox(-9.2833F, -34.9807F, -20.6605F, 1.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.9427F, 45.0686F, -3.1524F, -1.0036F, -1.0036F, 0.5236F));

		PartDefinition cube_r77 = left.addOrReplaceChild("cube_r77",
				CubeListBuilder.create().texOffs(2, 2).addBox(0.5F, -0.5F, -5.5F, 1.0F, 1.0F, 13.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.6211F, 21.0367F, -3.1928F, -1.8326F, -0.2182F, -0.9599F));

		PartDefinition cube_r78 = left.addOrReplaceChild("cube_r78",
				CubeListBuilder.create().texOffs(10, 0)
						.addBox(0.5F, -0.5F, -4.5F, 1.0F, 1.0F, 23.0F, new CubeDeformation(0.0F)).texOffs(12, 10)
						.addBox(-0.5F, -0.5F, -4.5F, 1.0F, 1.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(12, 10)
						.addBox(-1.5F, -0.5F, -4.5F, 1.0F, 1.0F, 19.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.629F, 20.4237F, -2.3735F, -1.8326F, 0.0436F, -1.0472F));

		PartDefinition cube_r79 = left.addOrReplaceChild("cube_r79",
				CubeListBuilder.create().texOffs(12, 10).addBox(-1.5F, -0.5F, -5.5F, 3.0F, 1.0F, 11.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.3341F, 14.4726F, -0.4046F, -1.7017F, 0.2618F, -0.5672F));

		PartDefinition cube_r80 = left.addOrReplaceChild("cube_r80",
				CubeListBuilder.create().texOffs(12, 10).addBox(-3.4534F, 1.2681F, -38.2032F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3783F, 45.2717F, -1.4441F, -1.6581F, 0.6545F, 0.0436F));

		PartDefinition cube_r81 = left.addOrReplaceChild("cube_r81",
				CubeListBuilder.create().texOffs(5, 7).addBox(-1.0F, -0.5F, -2.5F, 1.0F, 1.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.9711F, 19.4315F, -2.9543F, -1.4835F, 0.6545F, -0.7854F));

		PartDefinition cube_r82 = left.addOrReplaceChild("cube_r82",
				CubeListBuilder.create().texOffs(5, 7).addBox(23.5667F, -13.1527F, -16.5595F, 2.0F, 1.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3783F, 45.2717F, -1.4441F, -1.7453F, 0.5672F, -0.9163F));

		PartDefinition cube_r83 = left.addOrReplaceChild("cube_r83",
				CubeListBuilder.create().texOffs(5, 7).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0455F, 10.6368F, -1.8727F, -1.7017F, 0.7854F, -0.829F));

		PartDefinition cube_r84 = left.addOrReplaceChild("cube_r84",
				CubeListBuilder.create().texOffs(5, 7).addBox(19.5667F, -13.1527F, -28.5595F, 1.0F, 1.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3783F, 45.2717F, -1.4441F, -1.9199F, 0.7854F, -0.829F));

		PartDefinition cube_r85 = left.addOrReplaceChild("cube_r85",
				CubeListBuilder.create().texOffs(5, 7).addBox(22.5667F, -4.1527F, -31.5595F, 2.0F, 1.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3783F, 45.2717F, -1.4441F, -2.138F, 0.6545F, -0.829F));

		PartDefinition cube_r86 = left.addOrReplaceChild("cube_r86",
				CubeListBuilder.create().texOffs(5, 19).addBox(19.5221F, -2.3201F, -22.3235F, 3.0F, 1.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3783F, 45.2717F, -1.4441F, -1.789F, 0.3054F, -0.5672F));

		PartDefinition cube_r87 = left.addOrReplaceChild("cube_r87",
				CubeListBuilder.create().texOffs(5, 19).addBox(18.5221F, -4.3201F, -28.3235F, 3.0F, 1.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3783F, 45.2717F, -1.4441F, -1.7017F, 0.3054F, -0.5672F));

		PartDefinition cube_r88 = left.addOrReplaceChild("cube_r88",
				CubeListBuilder.create().texOffs(5, 19).addBox(18.5221F, 0.6799F, -33.3235F, 3.0F, 1.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3783F, 45.2717F, -1.4441F, -1.8762F, 0.3054F, -0.5672F));

		PartDefinition cube_r89 = left.addOrReplaceChild("cube_r89",
				CubeListBuilder.create().texOffs(5, 22).addBox(-0.5F, -0.5F, -2.5F, 2.0F, 1.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.6596F, 4.6313F, -0.5724F, -0.7854F, 0.829F, -0.2182F));

		PartDefinition cube_r90 = left.addOrReplaceChild("cube_r90",
				CubeListBuilder.create().texOffs(5, 22).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.6596F, 4.6313F, -0.5724F, -0.6109F, 0.6109F, -0.0873F));

		PartDefinition cube_r91 = left.addOrReplaceChild("cube_r91",
				CubeListBuilder.create().texOffs(5, 22).addBox(0.5007F, -30.9132F, -29.4272F, 1.0F, 1.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3783F, 45.2717F, -1.4441F, -0.7854F, 0.6109F, -0.0436F));

		PartDefinition cube_r92 = left.addOrReplaceChild("cube_r92",
				CubeListBuilder.create().texOffs(12, 10).addBox(-4.5358F, -29.4155F, -29.7554F, 1.0F, 1.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3783F, 45.2717F, -1.4441F, -0.7854F, 0.2618F, 0.0873F));

		PartDefinition cube_r93 = left.addOrReplaceChild("cube_r93",
				CubeListBuilder.create().texOffs(15, 4).addBox(-0.5F, -0.5F, -7.0F, 1.0F, 1.0F, 14.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.0349F, 26.3577F, -5.6282F, -2.0071F, 0.2618F, -0.2618F));

		PartDefinition cube_r94 = left.addOrReplaceChild("cube_r94",
				CubeListBuilder.create().texOffs(15, 4)
						.addBox(1.5F, -0.5F, -4.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(15, 4)
						.addBox(0.5F, -0.5F, -4.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(15, 4)
						.addBox(-0.5F, -0.5F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(24.1385F, 30.7726F, -7.415F, -1.8326F, 0.1745F, -1.3526F));

		PartDefinition cube_r95 = left.addOrReplaceChild("cube_r95",
				CubeListBuilder.create().texOffs(15, 4).addBox(-0.5F, -0.5F, -4.0F, 1.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(23.2052F, 30.5197F, -7.1601F, -1.8326F, 0.1745F, -1.0908F));

		PartDefinition cube_r96 = left.addOrReplaceChild("cube_r96",
				CubeListBuilder.create().texOffs(15, 4).addBox(-0.5F, -0.5F, -4.0F, 1.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(23.2052F, 30.5197F, -7.1601F, -1.8326F, 0.1745F, -0.829F));

		PartDefinition cube_r97 = left.addOrReplaceChild("cube_r97",
				CubeListBuilder.create().texOffs(15, 4).addBox(-0.5F, -0.5F, -3.5F, 1.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(22.9646F, 30.1003F, -7.0327F, -1.8326F, 0.1745F, -0.5672F));

		PartDefinition cube_r98 = left.addOrReplaceChild("cube_r98",
				CubeListBuilder.create().texOffs(15, 4).addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(21.8792F, 30.1693F, -6.7738F, -1.8326F, 0.1309F, -0.5236F));

		PartDefinition cube_r99 = left.addOrReplaceChild("cube_r99",
				CubeListBuilder.create().texOffs(15, 4).addBox(-0.5F, -0.5F, -6.5F, 1.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(22.5706F, 33.6245F, -7.6868F, -1.8762F, 0.1309F, -0.5236F));

		PartDefinition cube_r100 = left.addOrReplaceChild("cube_r100",
				CubeListBuilder.create().texOffs(15, 4).addBox(-0.5F, -0.5F, -5.5F, 1.0F, 1.0F, 13.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(18.6742F, 28.0781F, -6.0666F, -1.9199F, 0.2618F, -0.5236F));

		PartDefinition cube_r101 = left.addOrReplaceChild("cube_r101",
				CubeListBuilder.create().texOffs(15, 4).addBox(-0.5F, -0.5F, -5.5F, 1.0F, 1.0F, 17.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(16.6581F, 25.9869F, -4.8167F, -1.9199F, 0.2618F, -0.5236F));

		PartDefinition cube_r102 = left.addOrReplaceChild("cube_r102",
				CubeListBuilder.create().texOffs(15, 4).addBox(-0.5F, -0.5F, -3.5F, 1.0F, 1.0F, 17.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(15.0468F, 25.4372F, -5.1352F, -1.9199F, 0.2618F, -0.5236F));

		PartDefinition cube_r103 = left.addOrReplaceChild("cube_r103",
				CubeListBuilder.create().texOffs(4, 4).addBox(-0.5F, -0.5F, -11.5F, 1.0F, 1.0F, 20.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(15.0439F, 28.3952F, -6.8005F, -1.9199F, 0.2618F, -0.5236F));

		PartDefinition cube_r104 = left.addOrReplaceChild("cube_r104",
				CubeListBuilder.create().texOffs(15, 4)
						.addBox(0.5F, -0.6798F, -7.0F, 1.0F, 1.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(15, 4)
						.addBox(-0.5F, -0.0798F, -7.0F, 1.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.7587F, 28.057F, -5.828F, -2.0071F, 0.2618F, -0.5236F));

		PartDefinition cube_r105 = left.addOrReplaceChild("cube_r105",
				CubeListBuilder.create().texOffs(15, 4).addBox(-0.5F, -0.5F, -9.5F, 1.0F, 1.0F, 16.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.5032F, 28.1959F, -6.9075F, -2.0071F, 0.2618F, -0.3927F));

		PartDefinition cube_r106 = left.addOrReplaceChild("cube_r106",
				CubeListBuilder.create().texOffs(15, 4).addBox(-0.5F, -0.5F, -8.0F, 1.0F, 1.0F, 15.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.2421F, 27.2468F, -6.0364F, -2.0071F, 0.2618F, -0.3927F));

		PartDefinition cube_r107 = left.addOrReplaceChild("cube_r107",
				CubeListBuilder.create().texOffs(15, 4)
						.addBox(0.5F, -0.5F, -5.0F, 1.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(15, 4)
						.addBox(-0.5F, -0.5F, -5.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.0827F, 24.6938F, -4.4773F, -2.0508F, 0.2618F, -0.1309F));

		PartDefinition cube_r108 = left.addOrReplaceChild("cube_r108",
				CubeListBuilder.create().texOffs(15, 4).addBox(-0.5F, -0.5F, -7.0F, 1.0F, 1.0F, 12.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.8604F, 25.4006F, -5.4805F, -2.0508F, 0.2618F, -0.1309F));

		PartDefinition cube_r109 = left.addOrReplaceChild("cube_r109",
				CubeListBuilder.create().texOffs(15, 4).addBox(-0.5F, -0.5F, -4.0F, 1.0F, 1.0F, 11.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.9108F, 22.8416F, -3.8837F, -2.0508F, 0.2618F, -0.1309F));

		PartDefinition cube_r110 = left.addOrReplaceChild("cube_r110",
				CubeListBuilder.create().texOffs(15, 4)
						.addBox(0.0F, -0.5F, -3.5F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(15, 4)
						.addBox(-1.0F, -0.5F, -3.5F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.438F, 22.5246F, -3.3833F, -2.0508F, 0.2618F, -0.1309F));

		PartDefinition cube_r111 = left.addOrReplaceChild("cube_r111",
				CubeListBuilder.create().texOffs(15, 4)
						.addBox(0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(15, 4)
						.addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.6159F, 21.3035F, -2.303F, -2.0071F, 0.2182F, -0.0873F));

		PartDefinition cube_r112 = left.addOrReplaceChild("cube_r112",
				CubeListBuilder.create().texOffs(15, 4).addBox(-0.5F, -0.5F, -5.5F, 1.0F, 1.0F, 12.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.7012F, 19.7074F, -2.2831F, -1.8762F, -0.1745F, 0.0436F));

		PartDefinition cube_r113 = left.addOrReplaceChild("cube_r113",
				CubeListBuilder.create().texOffs(15, 4).addBox(-0.5F, -0.5F, -5.5F, 1.0F, 1.0F, 11.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.7107F, 19.6642F, -2.4137F, -1.9635F, -0.1309F, 0.0436F));

		PartDefinition cube_r114 = left.addOrReplaceChild("cube_r114",
				CubeListBuilder.create().texOffs(15, 4).addBox(-0.8415F, -0.5F, -5.5F, 1.0F, 1.0F, 11.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.1073F, 18.5596F, -2.3926F, -2.0508F, 0.0873F, -0.0436F));

		PartDefinition cube_r115 = left.addOrReplaceChild("cube_r115",
				CubeListBuilder.create().texOffs(15, 4).addBox(-0.5F, -0.5F, -5.0F, 1.0F, 1.0F, 10.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.117F, 18.6285F, -2.2618F, -2.0071F, 0.0873F, 0.0436F));

		PartDefinition cube_r116 = left.addOrReplaceChild("cube_r116",
				CubeListBuilder.create().texOffs(12, 10).addBox(-4.5358F, 2.8324F, -38.869F, 3.0F, 1.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3783F, 45.2717F, -1.4441F, -1.7453F, -0.2618F, 0.0873F));

		PartDefinition cube_r117 = left.addOrReplaceChild("cube_r117",
				CubeListBuilder.create().texOffs(12, 10).addBox(-4.5358F, -28.1201F, -29.9424F, 2.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3783F, 45.2717F, -1.4441F, -0.8727F, -0.2618F, 0.0873F));

		PartDefinition cube_r118 = left.addOrReplaceChild("cube_r118",
				CubeListBuilder.create().texOffs(19, 2).addBox(-12.9917F, -36.6696F, -17.1623F, 1.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3783F, 45.2717F, -1.4441F, -0.7854F, -0.829F, 0.4363F));

		PartDefinition cube_r119 = left.addOrReplaceChild("cube_r119",
				CubeListBuilder.create().texOffs(12, 10).addBox(-4.5358F, -30.7554F, -30.4155F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3783F, 45.2717F, -1.4441F, -0.7854F, -0.2618F, 0.0873F));

		PartDefinition cube_r120 = left.addOrReplaceChild("cube_r120",
				CubeListBuilder.create().texOffs(12, 10).addBox(-3.0358F, -28.2554F, -34.9155F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7327F, 44.3772F, 0.8998F, -0.7854F, -0.2618F, 0.0873F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		leftarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}