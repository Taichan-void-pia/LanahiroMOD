// Made with Blockbench 4.6.0
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelmoti<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "moti"), "main");
	private final ModelPart moti;

	public Modelmoti(ModelPart root) {
		this.moti = root.getChild("moti");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition moti = partdefinition.addOrReplaceChild("moti",
				CubeListBuilder.create().texOffs(0, 129)
						.addBox(-56.0F, -48.0F, -40.0F, 112.0F, 48.0F, 80.0F, new CubeDeformation(0.0F)).texOffs(0, 256)
						.addBox(-60.0F, -44.0F, -36.0F, 120.0F, 40.0F, 72.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-52.0F, -44.0F, -44.0F, 104.0F, 40.0F, 88.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 512, 512);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		moti.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}