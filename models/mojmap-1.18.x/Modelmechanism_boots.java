// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelmechanism_boots<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "mechanism_boots"), "main");
	private final ModelPart leftleg;
	private final ModelPart rightleg;

	public Modelmechanism_boots(ModelPart root) {
		this.leftleg = root.getChild("leftleg");
		this.rightleg = root.getChild("rightleg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition leftleg = partdefinition.addOrReplaceChild("leftleg", CubeListBuilder.create().texOffs(48, 48)
				.mirror().addBox(-2.1F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(5, 6).addBox(-1.5F, 11.5F, -2.6F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 10)
				.addBox(-2.0F, 7.4F, -2.6F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 10)
				.addBox(-2.2F, 7.4F, -2.6F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 10)
				.addBox(1.0F, 7.4F, -2.6F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(45, 1).mirror()
				.addBox(-2.1F, 11.6F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(45, 1)
				.mirror().addBox(0.9F, 11.6F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(45, 1).mirror().addBox(-1.1F, 11.6F, -2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(45, 1).mirror()
				.addBox(-1.1F, 11.6F, 1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(45, 1)
				.mirror().addBox(-0.5F, 11.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(2.0F, 12.0F, 0.0F));

		PartDefinition cube_r1 = leftleg.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(28, 5)
						.addBox(-1.0F, -1.5F, 0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 5)
						.addBox(-1.0F, -0.8F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 9.2821F, -2.4182F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r2 = leftleg.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(28, 5).addBox(-1.0F, -2.5F, -0.5F, 2.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 11.1594F, -2.2494F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r3 = leftleg.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(28, 5).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 11.2821F, -2.4182F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r4 = leftleg.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(28, 5)
						.addBox(-1.0F, -1.5F, -1.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 5)
						.addBox(-1.0F, -0.8F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 9.2821F, 2.4182F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r5 = leftleg.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(28, 5).addBox(-1.0F, -2.5F, -0.5F, 2.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 11.1594F, 2.2494F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r6 = leftleg.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(28, 5).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 11.2821F, 2.4182F, -0.48F, 0.0F, 0.0F));

		PartDefinition rightleg = partdefinition.addOrReplaceChild("rightleg", CubeListBuilder.create().texOffs(48, 48)
				.addBox(-1.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(5, 6).mirror()
				.addBox(-1.5F, 11.5F, -2.6F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 10)
				.mirror().addBox(1.0F, 7.4F, -2.6F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 10).mirror().addBox(1.2F, 7.4F, -2.6F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(0, 10).mirror()
				.addBox(-2.0F, 7.4F, -2.6F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(45, 1)
				.addBox(1.1F, 11.6F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(45, 1)
				.addBox(-1.9F, 11.6F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(45, 1)
				.addBox(-0.9F, 11.6F, -2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(45, 1)
				.addBox(-0.9F, 11.6F, 1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(45, 1)
				.addBox(-0.5F, 11.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 12.0F, 0.0F));

		PartDefinition cube_r7 = rightleg.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(28, 5).mirror()
				.addBox(-1.0F, -1.5F, 0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(28, 5)
				.mirror().addBox(-1.0F, -0.8F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 9.2821F, -2.4182F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r8 = rightleg.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(28, 5).mirror()
						.addBox(-1.0F, -2.5F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 11.1594F, -2.2494F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r9 = rightleg.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(28, 5).mirror()
						.addBox(-1.0F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 11.2821F, -2.4182F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r10 = rightleg.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(28, 5).mirror()
						.addBox(-1.0F, -1.5F, -1.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(28, 5).mirror()
						.addBox(-1.0F, -0.8F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 9.2821F, 2.4182F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r11 = rightleg.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(28, 5).mirror()
						.addBox(-1.0F, -2.5F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 11.1594F, 2.2494F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r12 = rightleg.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(28, 5).mirror()
						.addBox(-1.0F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 11.2821F, 2.4182F, -0.48F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		leftleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}