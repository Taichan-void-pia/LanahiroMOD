// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelmechanism_helmet<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "mechanism_helmet"), "main");
	private final ModelPart mechanism_helmet;

	public Modelmechanism_helmet(ModelPart root) {
		this.mechanism_helmet = root.getChild("mechanism_helmet");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition mechanism_helmet = partdefinition.addOrReplaceChild("mechanism_helmet", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition g = mechanism_helmet.addOrReplaceChild("g", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bipedHead = g.addOrReplaceChild("bipedHead", CubeListBuilder.create().texOffs(32, 48).addBox(
				-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone = bipedHead.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(0, 0)
				.addBox(3.9366F, -3.2081F, -3.6036F, 1.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
				.addBox(2.2366F, -3.5081F, -2.3036F, 2.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
				.addBox(-4.7634F, -3.5081F, -2.3036F, 2.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(23, 3)
				.addBox(-2.7634F, -3.5081F, -2.3036F, 2.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(23, 3)
				.addBox(0.2366F, -3.5081F, -2.3036F, 2.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
				.addBox(-0.7634F, -3.5081F, -2.3036F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.mirror().addBox(-5.0634F, -3.2081F, -3.6036F, 1.0F, 4.0F, 10.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(46, 6)
				.addBox(0.9366F, -2.1081F, -3.2036F, 3.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(46, 6)
				.addBox(-4.0634F, -2.1081F, -3.2036F, 3.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(46, 6)
				.addBox(-1.4634F, -2.1081F, -3.2036F, 3.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 6)
				.addBox(-5.0634F, -3.2081F, 5.3964F, 10.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0634F, -4.7919F, -1.3964F));

		PartDefinition bipedHead_r1 = bone.addOrReplaceChild("bipedHead_r1",
				CubeListBuilder.create().texOffs(46, 6).addBox(0.5F, 0.8F, 0.0F, 2.0F, 1.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5521F, -0.112F, -3.2036F, 0.0F, 0.0F, 0.4363F));

		PartDefinition bipedHead_r2 = bone.addOrReplaceChild("bipedHead_r2",
				CubeListBuilder.create().texOffs(46, 6).mirror()
						.addBox(-2.5F, 0.8F, 0.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.679F, -0.112F, -3.2036F, 0.0F, 0.0F, -0.4363F));

		PartDefinition bipedHead_r3 = bone.addOrReplaceChild("bipedHead_r3",
				CubeListBuilder.create().texOffs(46, 6).mirror()
						.addBox(-2.5F, -1.2F, 0.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.0807F, -0.0469F, -3.2036F, 0.0F, 0.0F, -1.2217F));

		PartDefinition bipedHead_r4 = bone.addOrReplaceChild("bipedHead_r4",
				CubeListBuilder.create().texOffs(46, 6).addBox(0.5F, -1.2F, 0.0F, 2.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9539F, -0.0469F, -3.2036F, 0.0F, 0.0F, 1.2217F));

		PartDefinition bipedHead_r5 = bone.addOrReplaceChild("bipedHead_r5",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-0.5F, 0.5F, -3.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0).mirror()
						.addBox(-9.5F, 0.5F, -3.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(4.4366F, -2.3164F, -2.214F, 1.0908F, 0.0F, 0.0F));

		PartDefinition bipedHead_r6 = bone.addOrReplaceChild("bipedHead_r6", CubeListBuilder.create().texOffs(0, 0)
				.mirror().addBox(-0.5F, -3.5F, -1.5F, 1.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 0).addBox(8.5F, -3.5F, -1.5F, 1.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(8.6F, -4.5F, -2.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(8.6F, -5.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(32, 5)
				.addBox(8.6F, -4.5F, -1.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(54, 8)
				.addBox(8.6F, -3.5F, -1.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 5)
				.addBox(8.6F, -2.5F, -1.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(54, 8)
				.addBox(8.6F, -1.5F, -1.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(30, 8)
				.addBox(8.6F, -0.5F, -1.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(8.6F, 0.5F, -1.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(8.6F, -5.5F, 2.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0).mirror()
				.addBox(-0.6F, -5.5F, 2.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(32, 5)
				.mirror().addBox(-0.6F, -4.5F, -1.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(32, 5).mirror().addBox(-0.6F, -2.5F, -1.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(54, 8).mirror()
				.addBox(-0.6F, -3.5F, -1.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(54, 8)
				.mirror().addBox(-0.6F, -1.5F, -1.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(30, 8).mirror().addBox(-0.6F, -0.5F, -1.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(0, 0).mirror()
				.addBox(-0.6F, -5.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 0)
				.mirror().addBox(-0.6F, 0.5F, -1.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 0).mirror().addBox(-0.6F, -4.5F, -2.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.mirror(false), PartPose.offsetAndRotation(-4.5634F, 2.9132F, 2.1538F, 0.7854F, 0.0F, 0.0F));

		PartDefinition bipedHead_r7 = bone.addOrReplaceChild("bipedHead_r7",
				CubeListBuilder.create().texOffs(0, 1)
						.addBox(2.5F, -0.5F, -1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 9)
						.addBox(0.5F, -0.5F, -1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 9)
						.addBox(-2.5F, -0.5F, -1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(-4.5F, -0.5F, -1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2634F, -2.8037F, -2.3652F, 0.6981F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		mechanism_helmet.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}