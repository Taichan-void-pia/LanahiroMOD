// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelgizennsha<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "gizennsha"), "main");
	private final ModelPart head;
	private final ModelPart body;
	private final ModelPart rightArm;
	private final ModelPart leftArm;
	private final ModelPart rightLeg;
	private final ModelPart leftLeg;

	public Modelgizennsha(ModelPart root) {
		this.head = root.getChild("head");
		this.body = root.getChild("body");
		this.rightArm = root.getChild("rightArm");
		this.leftArm = root.getChild("leftArm");
		this.rightLeg = root.getChild("rightLeg");
		this.leftLeg = root.getChild("leftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -15.0F, -2.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition hat = head.addOrReplaceChild("hat", CubeListBuilder.create().texOffs(0, 32)
				.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 3.0F, 8.0F, new CubeDeformation(0.5F)).texOffs(34, 34)
				.addBox(-6.0F, -5.25F, -6.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(34, 34)
				.addBox(-6.0F, -5.25F, 0.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(34, 34).mirror()
				.addBox(0.0F, -5.25F, 0.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(34, 34)
				.mirror().addBox(0.0F, -5.25F, -6.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(16, 16)
						.addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 48)
						.addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.02F)),
				PartPose.offsetAndRotation(0.0F, -15.0F, -2.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition rightArm = partdefinition.addOrReplaceChild("rightArm",
				CubeListBuilder.create().texOffs(40, 16)
						.addBox(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 32)
						.addBox(-1.0F, -1.55F, -1.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.5F)),
				PartPose.offsetAndRotation(-5.0F, -13.0F, -2.0F, -1.4399F, -0.5672F, 1.5708F));

		PartDefinition rightItem = rightArm.addOrReplaceChild("rightItem", CubeListBuilder.create(),
				PartPose.offset(-1.0F, 7.0F, 1.0F));

		PartDefinition cube_r1 = rightItem.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(36, 36)
						.addBox(0.0F, -3.25F, -4.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.3F)).texOffs(9, 8)
						.addBox(0.5F, -4.5F, -3.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.25F)).texOffs(40, 16)
						.addBox(0.5F, -9.0F, -3.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(-0.3F)).texOffs(22, 40)
						.addBox(0.0F, 4.0F, -3.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.275F)).texOffs(8, 0)
						.addBox(0.0F, -3.0F, -3.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(-0.31F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r2 = rightItem.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(41, 18).addBox(0.5F, -10.0F, -3.0F, 1.0F, 6.0F, 2.0F,
						new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -4.4F, 1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r3 = rightItem.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(41, 18).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 5.0F, 2.0F,
						new CubeDeformation(-0.32F)),
				PartPose.offsetAndRotation(1.0F, 1.3472F, -15.3853F, 1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r4 = rightItem.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(41, 18).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 7.0F, 2.0F,
						new CubeDeformation(-0.32F)),
				PartPose.offsetAndRotation(1.0F, 0.517F, -21.6909F, 1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r5 = rightItem.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(41, 18).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 2.0F, 2.0F,
						new CubeDeformation(-0.33F)),
				PartPose.offsetAndRotation(1.0F, 0.4018F, -21.7617F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r6 = rightItem.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(41, 18).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 2.0F,
						new CubeDeformation(-0.31F)),
				PartPose.offsetAndRotation(1.0F, 1.02F, -21.7266F, 1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r7 = rightItem.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(41, 18).addBox(0.5F, -10.0F, -3.0F, 1.0F, 6.0F, 2.0F,
						new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -9.8F, 1.5708F, 0.0F, 0.0F));

		PartDefinition leftArm = partdefinition.addOrReplaceChild("leftArm",
				CubeListBuilder.create().texOffs(40, 16).mirror()
						.addBox(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(48, 32).mirror()
						.addBox(-1.0F, -1.55F, -1.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.5F)).mirror(false),
				PartPose.offsetAndRotation(5.0F, -13.0F, -2.0F, -1.4399F, -1.4835F, -0.7854F));

		PartDefinition leftItem = leftArm.addOrReplaceChild("leftItem", CubeListBuilder.create(),
				PartPose.offset(1.0F, 7.0F, 1.0F));

		PartDefinition rightLeg = partdefinition.addOrReplaceChild("rightLeg",
				CubeListBuilder.create().texOffs(0, 16)
						.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 48)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(-2.0F, -3.0F, -2.0F, -0.0436F, 0.0F, 0.1309F));

		PartDefinition leftLeg = partdefinition.addOrReplaceChild("leftLeg",
				CubeListBuilder.create().texOffs(0, 48).mirror()
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.01F)).mirror(false)
						.texOffs(0, 16).mirror()
						.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.0F, -3.0F, -2.0F, -0.0436F, 0.0F, -0.1309F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.rightArm.zRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.leftArm.zRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}