// Made with Blockbench 4.6.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelepicdownblaze<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "epicdownblaze"), "main");
	private final ModelPart head;
	private final ModelPart cricle1;
	private final ModelPart cricle2;
	private final ModelPart cricle3;

	public Modelepicdownblaze(ModelPart root) {
		this.head = root.getChild("head");
		this.cricle1 = root.getChild("cricle1");
		this.cricle2 = root.getChild("cricle2");
		this.cricle3 = root.getChild("cricle3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(
				-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cricle1 = partdefinition.addOrReplaceChild("cricle1", CubeListBuilder.create(),
				PartPose.offset(0.0F, 2.0F, 0.0F));

		PartDefinition stick1 = cricle1.addOrReplaceChild("stick1", CubeListBuilder.create().texOffs(0, 16).addBox(
				-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-7.0F, -4.0F, -7.0F));

		PartDefinition stick2 = cricle1.addOrReplaceChild("stick2", CubeListBuilder.create().texOffs(0, 16).addBox(
				-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(7.0F, -4.0F, -7.0F));

		PartDefinition stick3 = cricle1.addOrReplaceChild("stick3", CubeListBuilder.create().texOffs(0, 16).addBox(
				-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(7.0F, -4.0F, 7.0F));

		PartDefinition stick4 = cricle1.addOrReplaceChild("stick4", CubeListBuilder.create().texOffs(0, 16).addBox(
				-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-7.0F, -4.0F, 7.0F));

		PartDefinition cricle2 = partdefinition.addOrReplaceChild("cricle2", CubeListBuilder.create(),
				PartPose.offset(0.0F, 7.0F, 0.0F));

		PartDefinition stick5 = cricle2.addOrReplaceChild("stick5", CubeListBuilder.create().texOffs(0, 16).addBox(
				-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, -5.0F, -5.0F));

		PartDefinition stick6 = cricle2.addOrReplaceChild("stick6", CubeListBuilder.create().texOffs(0, 16).addBox(
				-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -5.0F, -5.0F));

		PartDefinition stick7 = cricle2.addOrReplaceChild("stick7", CubeListBuilder.create().texOffs(0, 16).addBox(
				-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -5.0F, 5.0F));

		PartDefinition stick8 = cricle2.addOrReplaceChild("stick8", CubeListBuilder.create().texOffs(0, 16).addBox(
				-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, -5.0F, 5.0F));

		PartDefinition cricle3 = partdefinition.addOrReplaceChild("cricle3", CubeListBuilder.create(),
				PartPose.offset(0.0F, 15.0F, 0.0F));

		PartDefinition stick9 = cricle3.addOrReplaceChild("stick9", CubeListBuilder.create().texOffs(0, 16).addBox(
				-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, -5.0F, -3.0F));

		PartDefinition stick10 = cricle3.addOrReplaceChild("stick10", CubeListBuilder.create().texOffs(0, 16).addBox(
				-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, -5.0F, -3.0F));

		PartDefinition stick11 = cricle3.addOrReplaceChild("stick11", CubeListBuilder.create().texOffs(0, 16).addBox(
				-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, -5.0F, 3.0F));

		PartDefinition stick12 = cricle3.addOrReplaceChild("stick12", CubeListBuilder.create().texOffs(0, 16).addBox(
				-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, -5.0F, 3.0F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		cricle1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		cricle2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		cricle3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.cricle3.yRot = ageInTicks / 20.f;
		this.cricle2.yRot = ageInTicks / 20.f;
		this.cricle1.yRot = ageInTicks;
	}
}