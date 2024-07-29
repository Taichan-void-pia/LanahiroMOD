// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelepicdownskeleton<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "epicdownskeleton"), "main");
	private final ModelPart head;
	private final ModelPart headwear;
	private final ModelPart body;
	private final ModelPart left_arm;
	private final ModelPart right_arm;
	private final ModelPart left_leg;
	private final ModelPart right_leg;

	public Modelepicdownskeleton(ModelPart root) {
		this.head = root.getChild("head");
		this.headwear = root.getChild("headwear");
		this.body = root.getChild("body");
		this.left_arm = root.getChild("left_arm");
		this.right_arm = root.getChild("right_arm");
		this.left_leg = root.getChild("left_leg");
		this.right_leg = root.getChild("right_leg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(
				-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition headwear = partdefinition.addOrReplaceChild("headwear", CubeListBuilder.create().texOffs(32, 0)
				.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.5F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(16, 16).addBox(
				-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm",
				CubeListBuilder.create().texOffs(40, 16).mirror()
						.addBox(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition cube_r1 = left_arm.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0)
				.addBox(22.4649F, -25.1119F, -14.0044F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(20.7649F, -25.1119F, -14.0044F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(21.0149F, -25.1119F, -14.2544F, 1.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(21.5149F, -25.2119F, -14.3544F, 0.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.0565F, 30.0238F, 9.2577F, 1.5703F, 0.0114F, -1.5701F));

		PartDefinition cube_r2 = left_arm.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 0)
				.addBox(21.0149F, -25.1119F, -12.4444F, 1.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(21.5149F, -25.2119F, -12.5444F, 0.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.9465F, 30.0239F, 9.2577F, 1.5703F, 0.0114F, -1.5701F));

		PartDefinition cube_r3 = left_arm.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 0).addBox(6.7091F, -15.9501F, -25.1319F, 0.0F, 10.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.3708F, 31.6674F, 0.1142F, 1.5624F, 0.0077F, -2.3555F));

		PartDefinition cube_r4 = left_arm.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(0, 0).addBox(24.2319F, -15.9501F, 6.1651F, 0.0F, 10.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.369F, 29.319F, 0.0875F, 1.5785F, 0.0084F, -0.7846F));

		PartDefinition cube_r5 = left_arm.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(0, 0).addBox(25.3759F, -15.9501F, 6.1651F, 0.0F, 10.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.6419F, 31.6662F, 0.1138F, 1.5785F, 0.0084F, -0.7846F));

		PartDefinition cube_r6 = left_arm.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(0, 0).addBox(5.5651F, -15.9501F, -25.1319F, 0.0F, 10.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.6401F, 29.3178F, 0.0871F, 1.5624F, 0.0077F, -2.3555F));

		PartDefinition cube_r7 = left_arm.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 0)
				.addBox(22.5652F, -18.7104F, -14.2459F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(20.3552F, -18.7104F, -14.2459F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(20.6802F, -18.7104F, -14.5709F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(21.3302F, -18.9004F, -14.7009F, 0.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.059F, 29.9829F, 4.0569F, 1.5703F, 0.0114F, -1.5701F));

		PartDefinition cube_r8 = left_arm.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 0)
				.addBox(20.6802F, -18.7104F, -12.2179F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(21.3302F, -18.9004F, -12.3479F, 0.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.916F, 29.983F, 4.0568F, 1.5703F, 0.0114F, -1.5701F));

		PartDefinition cube_r9 = left_arm.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(0, 0).addBox(6.8273F, -6.8001F, -25.1769F, 0.0F, 1.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.4676F, 32.1196F, -7.8297F, 1.5624F, 0.0077F, -2.3555F));

		PartDefinition cube_r10 = left_arm.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(0, 0).addBox(24.0069F, -6.8001F, 6.1201F, 0.0F, 1.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.4653F, 29.0667F, -7.8644F, 1.5785F, 0.0084F, -0.7846F));

		PartDefinition cube_r11 = left_arm.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(0, 0).addBox(25.4941F, -6.8001F, 6.1201F, 0.0F, 1.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.52F, 32.1181F, -7.8302F, 1.5785F, 0.0084F, -0.7846F));

		PartDefinition cube_r12 = left_arm.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(0, 0).addBox(5.3401F, -6.8001F, -25.1769F, 0.0F, 1.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.5177F, 29.0652F, -7.8649F, 1.5624F, 0.0077F, -2.3555F));

		PartDefinition cube_r13 = left_arm.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(0, 0).addBox(21.8803F, -14.4342F, -9.5936F, 0.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.7099F, 30.4619F, 2.8905F, 1.963F, 0.0114F, -1.5701F));

		PartDefinition cube_r14 = left_arm.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(0, 0).addBox(21.8803F, -4.3318F, -15.2957F, 0.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.2999F, 30.4615F, 2.8908F, 1.1776F, 0.0114F, -1.5701F));

		PartDefinition cube_r15 = left_arm.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(0, 0).addBox(21.8803F, -14.4342F, -9.5936F, 0.0F, 1.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.7109F, 30.4847F, 0.8906F, 1.963F, 0.0114F, -1.5701F));

		PartDefinition cube_r16 = left_arm.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(0, 0).addBox(21.8803F, -4.3318F, -15.2957F, 0.0F, 1.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.3009F, 30.4843F, 0.8909F, 1.1776F, 0.0114F, -1.5701F));

		PartDefinition cube_r17 = left_arm.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(0, 0).addBox(21.8803F, -14.4342F, -9.5936F, 0.0F, 1.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.7119F, 30.5074F, -1.1093F, 1.963F, 0.0114F, -1.5701F));

		PartDefinition cube_r18 = left_arm.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(0, 0).addBox(21.8803F, -4.3318F, -15.2957F, 0.0F, 1.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.3019F, 30.507F, -1.109F, 1.1776F, 0.0114F, -1.5701F));

		PartDefinition cube_r19 = left_arm.addOrReplaceChild("cube_r19",
				CubeListBuilder.create().texOffs(0, 0).addBox(21.8803F, -14.4342F, -9.5936F, 0.0F, 1.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.7129F, 30.5302F, -3.1092F, 1.963F, 0.0114F, -1.5701F));

		PartDefinition cube_r20 = left_arm.addOrReplaceChild("cube_r20",
				CubeListBuilder.create().texOffs(0, 0).addBox(21.8803F, -4.3318F, -15.2957F, 0.0F, 1.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.3029F, 30.5298F, -3.1089F, 1.1776F, 0.0114F, -1.5701F));

		PartDefinition cube_r21 = left_arm.addOrReplaceChild("cube_r21",
				CubeListBuilder.create().texOffs(0, 0).addBox(21.8803F, -14.4342F, -9.5936F, 0.0F, 1.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.6352F, 30.5642F, -6.0938F, 1.963F, 0.0114F, -1.5701F));

		PartDefinition cube_r22 = left_arm.addOrReplaceChild("cube_r22",
				CubeListBuilder.create().texOffs(0, 0).addBox(21.8803F, -4.3318F, -15.2957F, 0.0F, 1.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.3837F, 30.5636F, -6.0934F, 1.1776F, 0.0114F, -1.5701F));

		PartDefinition cube_r23 = left_arm.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(0, 0)
				.addBox(20.7649F, -9.1119F, -14.0044F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(24.7649F, -12.8619F, -14.0044F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(23.7649F, -8.8619F, -13.7544F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.0595F, 30.092F, 3.2581F, 1.5703F, 0.0114F, -1.5701F));

		PartDefinition cube_r24 = left_arm.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(0, 0)
				.addBox(20.4F, 10.7521F, -14.0669F, 0.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(18.4953F, 10.7566F, -14.0669F, 0.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(25.1429F, 9.123F, -13.9619F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(19.3597F, 11.7548F, -13.9619F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(17.6778F, 16.8155F, -13.9619F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(19.8197F, 11.6356F, -14.0619F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(20.8197F, 13.1356F, -14.0619F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(21.8197F, 12.1356F, -14.0619F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(22.8197F, 11.1356F, -14.0619F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(23.8197F, 10.1356F, -14.0619F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(24.8197F, 9.1356F, -14.0619F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.0245F, 35.25F, -4.3076F, 1.5701F, 0.7968F, -1.5706F));

		PartDefinition cube_r25 = left_arm.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(0, 0)
				.addBox(21.671F, -7.1403F, -14.0669F, 0.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(21.0024F, -7.1403F, -14.0669F, 0.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(21.671F, -5.6039F, -14.0669F, 0.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(21.0024F, -5.6039F, -14.0669F, 0.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(20.6842F, -6.8221F, -14.0669F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(19.3132F, -3.4909F, -13.8119F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(19.0822F, -3.3952F, -13.7119F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(18.8513F, -3.2995F, -13.6119F, 0.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(18.6203F, -3.2038F, -13.5119F, 0.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(19.3132F, -5.4909F, -13.8119F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(19.0822F, -5.3952F, -13.7119F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(18.8513F, -5.2995F, -13.6119F, 0.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(18.6203F, -5.2038F, -13.5119F, 0.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(19.6404F, -3.6097F, -14.0619F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(20.9242F, -3.0597F, -13.5869F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(19.6404F, -5.6097F, -13.9619F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(24.3904F, -11.3597F, -13.9619F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(25.1404F, -11.6097F, -13.9619F, 0.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(24.5452F, -13.6405F, -13.9619F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(24.7952F, -14.9405F, -13.9619F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(24.9242F, -3.3121F, -14.0619F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.0245F, 35.25F, -4.3076F, 1.5703F, 0.0114F, -1.5701F));

		PartDefinition cube_r26 = left_arm.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(0, 0)
				.addBox(9.802F, -19.8999F, -14.0669F, 0.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(11.7067F, -19.8954F, -14.0669F, 0.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(7.2864F, -27.7943F, -13.8119F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(7.1908F, -27.9134F, -13.7119F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(7.0951F, -28.0324F, -13.6119F, 0.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(6.9994F, -28.1014F, -13.5119F, 0.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(7.6251F, -26.6478F, -13.9619F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(7.6251F, -27.1478F, -13.9619F, 0.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.0245F, 35.25F, -4.3076F, 1.5701F, -0.774F, -1.5696F));

		PartDefinition cube_r27 = left_arm.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(0, 0)
				.addBox(15.7418F, -18.9637F, -13.8119F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(15.565F, -18.787F, -13.7119F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(15.3883F, -18.6102F, -13.6119F, 0.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(15.2115F, -18.4334F, -13.5119F, 0.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(17.7427F, -14.7735F, -13.9619F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(15.9986F, -18.6988F, -13.9619F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(17.3998F, -22.2822F, -13.9619F, 0.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(17.3998F, -22.7822F, -13.9619F, 0.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.0245F, 35.25F, -4.3076F, 1.5703F, -0.3813F, -1.5699F));

		PartDefinition cube_r28 = left_arm.addOrReplaceChild("cube_r28",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(12.2968F, 1.5859F, -13.6744F, 0.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(13.0468F, 1.8359F, -13.6744F, 0.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(13.7968F, 2.0859F, -13.6744F, 0.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(14.5468F, 2.3359F, -13.6744F, 0.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(15.2968F, 2.5859F, -13.6744F, 0.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.0055F, 26.5432F, -4.297F, 1.5703F, 0.4041F, -1.5703F));

		PartDefinition cube_r29 = left_arm.addOrReplaceChild("cube_r29",
				CubeListBuilder.create().texOffs(0, 0).addBox(27.6124F, -1.1482F, -13.9619F, 0.0F, 0.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.0245F, 35.25F, -4.3076F, 1.5703F, 0.4041F, -1.5703F));

		PartDefinition cube_r30 = left_arm.addOrReplaceChild("cube_r30",
				CubeListBuilder.create().texOffs(0, 0).addBox(23.5511F, 12.9687F, -14.0044F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.0594F, 31.132F, 4.891F, 1.5701F, 0.7968F, -1.5706F));

		PartDefinition cube_r31 = left_arm.addOrReplaceChild("cube_r31",
				CubeListBuilder.create().texOffs(0, 0).addBox(20.2293F, -25.7637F, -14.0044F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.0612F, 32.7228F, 3.7157F, 1.5703F, -0.3813F, -1.5699F));

		PartDefinition cube_r32 = left_arm.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(0, 0)
				.addBox(24.7649F, -28.8619F, -14.0044F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(24.5149F, -28.9619F, -14.2044F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(24.5149F, -27.9619F, -14.2044F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(24.5149F, -26.9619F, -14.2044F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(24.5149F, -25.9619F, -14.2044F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(24.5149F, -24.9619F, -14.2044F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(24.5149F, -23.9619F, -14.2044F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(23.5149F, -19.8619F, -14.2044F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(23.5149F, -18.8619F, -14.2044F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(23.5149F, -17.8619F, -14.2044F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(23.5149F, -16.8619F, -14.2044F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(23.5149F, -15.8619F, -14.2044F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(23.5149F, -14.8619F, -14.2044F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(23.5149F, -13.8619F, -14.2044F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.0548F, 28.9695F, 11.0482F, 1.5703F, 0.0114F, -1.5701F));

		PartDefinition cube_r33 = left_arm.addOrReplaceChild("cube_r33",
				CubeListBuilder.create().texOffs(0, 0).addBox(8.0805F, -21.2915F, -13.6994F, 4.0F, 0.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.0071F, 28.0548F, -5.3025F, 1.5701F, -0.774F, -1.5696F));

		PartDefinition cube_r34 = left_arm.addOrReplaceChild("cube_r34",
				CubeListBuilder.create().texOffs(0, 0).addBox(25.4428F, -12.7001F, -13.4994F, 0.0F, 6.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.0065F, 27.5567F, -4.7248F, 1.5703F, 0.0114F, -1.5701F));

		PartDefinition cube_r35 = left_arm.addOrReplaceChild("cube_r35",
				CubeListBuilder.create().texOffs(0, 0).addBox(25.1928F, -12.7001F, -13.5994F, 0.0F, 6.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.0065F, 27.5388F, -4.8207F, 1.5703F, 0.0114F, -1.5701F));

		PartDefinition cube_r36 = left_arm.addOrReplaceChild("cube_r36",
				CubeListBuilder.create().texOffs(0, 0).addBox(24.9428F, -12.7001F, -13.6994F, 0.0F, 6.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.0066F, 27.5208F, -4.9166F, 1.5703F, 0.0114F, -1.5701F));

		PartDefinition cube_r37 = left_arm.addOrReplaceChild("cube_r37",
				CubeListBuilder.create().texOffs(0, 0).addBox(24.4428F, -12.7001F, -13.7994F, 0.0F, 6.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.0066F, 27.5029F, -5.0124F, 1.5703F, 0.0114F, -1.5701F));

		PartDefinition cube_r38 = left_arm.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(0, 0)
				.addBox(17.9072F, -17.1019F, -13.4994F, 0.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(17.6572F, -17.1019F, -13.5994F, 0.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(17.4072F, -17.1019F, -13.6994F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(16.9072F, -17.1019F, -13.7994F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.0036F, 25.1593F, -2.6004F, 1.5703F, -0.3813F, -1.5699F));

		PartDefinition cube_r39 = left_arm.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(0, 0)
				.addBox(22.4428F, -13.7001F, -13.4994F, 0.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(22.1928F, -13.7001F, -13.5994F, 0.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(21.9428F, -13.7001F, -13.6994F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(21.4428F, -13.7001F, -13.7994F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.0005F, 25.2608F, 4.0414F, 1.5703F, 0.0114F, -1.5701F));

		PartDefinition cube_r40 = left_arm.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(0, 0)
				.addBox(13.7293F, -30.7637F, -14.2044F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(13.7293F, -29.7637F, -14.2044F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(13.7293F, -28.7637F, -14.2044F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.0548F, 28.9695F, 11.0482F, 1.5703F, -0.3813F, -1.5699F));

		PartDefinition cube_r41 = left_arm.addOrReplaceChild("cube_r41",
				CubeListBuilder.create().texOffs(0, 0).addBox(20.4165F, 10.6305F, -14.1494F, 1.0F, 0.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.0008F, 26.8938F, 5.8624F, 1.5701F, 0.7968F, -1.5706F));

		PartDefinition cube_r42 = left_arm.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(0, 0)
				.addBox(9.3905F, -23.6582F, -14.0544F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(10.3773F, -22.44F, -14.0544F, 0.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(9.7087F, -22.44F, -14.0544F, 0.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(10.3773F, -23.9764F, -14.0544F, 0.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(9.7087F, -23.9764F, -14.0544F, 0.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.004F, 31.4242F, 6.1933F, 1.5701F, -0.774F, -1.5696F));

		PartDefinition cube_r43 = left_arm.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(0, 0)
				.addBox(23.3644F, -8.1841F, -14.0544F, 0.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(22.4144F, -9.1342F, -14.0544F, 0.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(24.319F, -9.1387F, -14.0544F, 0.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(23.3689F, -10.0888F, -14.0544F, 0.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.004F, 31.4242F, 6.1933F, 1.5703F, 0.0114F, -1.5701F));

		PartDefinition cube_r44 = left_arm.addOrReplaceChild("cube_r44",
				CubeListBuilder.create().texOffs(0, 0).addBox(10.0085F, -22.0982F, -13.5744F, 1.0F, 4.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.004F, 31.4242F, 6.1933F, 1.5701F, -0.774F, -1.5696F));

		PartDefinition cube_r45 = left_arm.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(0, 0)
				.addBox(16.0323F, -12.901F, -13.6244F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(16.2823F, -13.651F, -13.6244F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(17.4073F, -16.651F, -13.6244F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(17.1573F, -15.901F, -13.6244F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(16.9073F, -15.151F, -13.6244F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(16.5323F, -14.401F, -13.6244F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.004F, 31.4242F, 6.1933F, 1.5703F, -0.3813F, -1.5699F));

		PartDefinition cube_r46 = left_arm.addOrReplaceChild("cube_r46",
				CubeListBuilder.create().texOffs(0, 0).addBox(23.2962F, 0.9947F, -13.3244F, 1.0F, 0.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.004F, 31.4242F, 6.1933F, 1.5703F, 0.4041F, -1.5703F));

		PartDefinition cube_r47 = left_arm.addOrReplaceChild("cube_r47",
				CubeListBuilder.create().texOffs(0, 0).addBox(21.9036F, -8.4961F, -13.3244F, 1.0F, 0.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.004F, 31.4242F, 6.1933F, 1.5703F, 0.0114F, -1.5701F));

		PartDefinition cube_r48 = left_arm.addOrReplaceChild("cube_r48",
				CubeListBuilder.create().texOffs(0, 0).addBox(9.4805F, -22.2958F, -13.3244F, 0.0F, 0.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.004F, 31.4242F, 6.1933F, 1.5701F, -0.774F, -1.5696F));

		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create()
				.texOffs(40, 16).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition cube_r49 = right_arm.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-3.6654F, -24.6618F, -13.805F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-5.3654F, -24.6618F, -13.805F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-5.1154F, -24.6618F, -14.055F, 1.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-4.6154F, -24.7618F, -14.155F, 0.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-4.6154F, -28.3118F, -13.905F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.055F, 13.8655F, 9.1618F, 1.5708F, 0.0F, 1.5708F));

		PartDefinition cube_r50 = right_arm.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-5.1154F, -24.6618F, -12.245F, 1.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-4.6154F, -24.7618F, -12.345F, 0.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.945F, 13.8655F, 9.1618F, 1.5708F, 0.0F, 1.5708F));

		PartDefinition cube_r51 = right_arm.addOrReplaceChild("cube_r51",
				CubeListBuilder.create().texOffs(0, 0).addBox(-11.6268F, -15.5F, -6.514F, 0.0F, 10.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.3636F, 12.3257F, 0.0F, 1.5708F, 0.0F, 0.7854F));

		PartDefinition cube_r52 = right_arm.addOrReplaceChild("cube_r52",
				CubeListBuilder.create().texOffs(0, 0).addBox(5.614F, -15.5F, -12.1708F, 0.0F, 10.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.3636F, 14.6743F, 0.0F, 1.5708F, 0.0F, 2.3562F));

		PartDefinition cube_r53 = right_arm.addOrReplaceChild("cube_r53",
				CubeListBuilder.create().texOffs(0, 0).addBox(6.758F, -15.5F, -12.1708F, 0.0F, 10.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.6347F, 12.3275F, 0.0F, 1.5708F, 0.0F, 2.3562F));

		PartDefinition cube_r54 = right_arm.addOrReplaceChild("cube_r54",
				CubeListBuilder.create().texOffs(0, 0).addBox(-12.7708F, -15.5F, -6.514F, 0.0F, 10.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.6347F, 14.676F, 0.0F, 1.5708F, 0.0F, 0.7854F));

		PartDefinition cube_r55 = right_arm.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-3.5651F, -18.2603F, -14.0465F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-5.7751F, -18.2603F, -14.0465F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-5.4501F, -18.2603F, -14.3715F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-4.8001F, -18.4503F, -14.5015F, 0.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.055F, 13.9655F, 3.9618F, 1.5708F, 0.0F, 1.5708F));

		PartDefinition cube_r56 = right_arm.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-5.4501F, -18.2603F, -12.0185F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-4.8001F, -18.4503F, -12.1485F, 0.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.912F, 13.9655F, 3.9618F, 1.5708F, 0.0F, 1.5708F));

		PartDefinition cube_r57 = right_arm.addOrReplaceChild("cube_r57",
				CubeListBuilder.create().texOffs(0, 0).addBox(-11.5086F, -6.35F, -6.559F, 0.0F, 1.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.4562F, 11.9638F, -7.9485F, 1.5708F, 0.0F, 0.7854F));

		PartDefinition cube_r58 = right_arm.addOrReplaceChild("cube_r58",
				CubeListBuilder.create().texOffs(0, 0).addBox(5.389F, -6.35F, -12.2158F, 0.0F, 1.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.4562F, 15.0169F, -7.9485F, 1.5708F, 0.0F, 2.3562F));

		PartDefinition cube_r59 = right_arm.addOrReplaceChild("cube_r59",
				CubeListBuilder.create().texOffs(0, 0).addBox(6.8762F, -6.35F, -12.2158F, 0.0F, 1.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.5086F, 11.9661F, -7.9485F, 1.5708F, 0.0F, 2.3562F));

		PartDefinition cube_r60 = right_arm.addOrReplaceChild("cube_r60",
				CubeListBuilder.create().texOffs(0, 0).addBox(-12.9958F, -6.35F, -6.559F, 0.0F, 1.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.5086F, 15.0192F, -7.9485F, 1.5708F, 0.0F, 0.7854F));

		PartDefinition cube_r61 = right_arm.addOrReplaceChild("cube_r61",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.25F, -13.942F, -9.5816F, 0.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.705F, 13.5F, 2.7902F, 1.9635F, 0.0F, 1.5708F));

		PartDefinition cube_r62 = right_arm.addOrReplaceChild("cube_r62",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.25F, -3.9923F, -14.9392F, 0.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.295F, 13.5F, 2.7902F, 1.1781F, 0.0F, 1.5708F));

		PartDefinition cube_r63 = right_arm.addOrReplaceChild("cube_r63",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.25F, -13.942F, -9.5816F, 0.0F, 1.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.705F, 13.5F, 0.7902F, 1.9635F, 0.0F, 1.5708F));

		PartDefinition cube_r64 = right_arm.addOrReplaceChild("cube_r64",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.25F, -3.9923F, -14.9392F, 0.0F, 1.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.295F, 13.5F, 0.7902F, 1.1781F, 0.0F, 1.5708F));

		PartDefinition cube_r65 = right_arm.addOrReplaceChild("cube_r65",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.25F, -13.942F, -9.5816F, 0.0F, 1.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.705F, 13.5F, -1.2098F, 1.9635F, 0.0F, 1.5708F));

		PartDefinition cube_r66 = right_arm.addOrReplaceChild("cube_r66",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.25F, -3.9923F, -14.9392F, 0.0F, 1.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.295F, 13.5F, -1.2098F, 1.1781F, 0.0F, 1.5708F));

		PartDefinition cube_r67 = right_arm.addOrReplaceChild("cube_r67",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.25F, -13.942F, -9.5816F, 0.0F, 1.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.705F, 13.5F, -3.2098F, 1.9635F, 0.0F, 1.5708F));

		PartDefinition cube_r68 = right_arm.addOrReplaceChild("cube_r68",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.25F, -3.9923F, -14.9392F, 0.0F, 1.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.295F, 13.5F, -3.2098F, 1.1781F, 0.0F, 1.5708F));

		PartDefinition cube_r69 = right_arm.addOrReplaceChild("cube_r69",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.25F, -13.942F, -9.5816F, 0.0F, 1.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.6257F, 13.5F, -6.1946F, 1.9635F, 0.0F, 1.5708F));

		PartDefinition cube_r70 = right_arm.addOrReplaceChild("cube_r70",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.25F, -3.9923F, -14.9392F, 0.0F, 1.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.3743F, 13.5F, -6.1946F, 1.1781F, 0.0F, 1.5708F));

		PartDefinition cube_r71 = right_arm.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-5.3654F, -8.6618F, -13.805F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-1.3654F, -12.4118F, -13.805F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-2.3654F, -8.4118F, -13.555F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.055F, 13.8655F, 3.1618F, 1.5708F, 0.0F, 1.5708F));

		PartDefinition cube_r72 = right_arm.addOrReplaceChild("cube_r72",
				CubeListBuilder.create().texOffs(0, 0).addBox(-7.8682F, -2.7963F, -13.855F, 0.0F, 0.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.0F, 15.9145F, -15.4373F, 1.5708F, -0.7854F, 1.5708F));

		PartDefinition cube_r73 = right_arm.addOrReplaceChild("cube_r73",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.675F, -6.64F, -13.855F, 0.0F, 0.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.0F, 17.0032F, -16.3382F, 1.5708F, 0.0F, 1.5708F));

		PartDefinition cube_r74 = right_arm.addOrReplaceChild("cube_r74",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -6.64F, -13.855F, 0.0F, 0.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.0F, 16.9968F, -16.3382F, 1.5708F, 0.0F, 1.5708F));

		PartDefinition cube_r75 = right_arm.addOrReplaceChild("cube_r75",
				CubeListBuilder.create().texOffs(0, 0).addBox(1.3113F, -8.4532F, -13.855F, 0.0F, 0.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.0F, 18.4037F, -15.7555F, 1.5708F, 0.7854F, 1.5708F));

		PartDefinition cube_r76 = right_arm.addOrReplaceChild("cube_r76",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.675F, -7.81F, -13.855F, 0.0F, 0.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.0F, 17.0032F, -13.6318F, 1.5708F, 0.0F, 1.5708F));

		PartDefinition cube_r77 = right_arm.addOrReplaceChild("cube_r77",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -7.81F, -13.855F, 0.0F, 0.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.0F, 16.9968F, -13.6318F, 1.5708F, 0.0F, 1.5708F));

		PartDefinition cube_r78 = right_arm.addOrReplaceChild("cube_r78",
				CubeListBuilder.create().texOffs(0, 0).addBox(2.4813F, -7.5532F, -13.855F, 0.0F, 0.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.0F, 15.5963F, -14.2145F, 1.5708F, 0.7854F, 1.5708F));

		PartDefinition cube_r79 = right_arm.addOrReplaceChild("cube_r79",
				CubeListBuilder.create().texOffs(0, 0).addBox(-8.1382F, -1.8963F, -13.855F, 0.0F, 0.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.0F, 18.0855F, -14.5327F, 1.5708F, -0.7854F, 1.5708F));

		PartDefinition cube_r80 = right_arm.addOrReplaceChild("cube_r80",
				CubeListBuilder.create().texOffs(0, 0).addBox(-5.08F, -10.8475F, -13.855F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.0F, 17.09F, -11.8125F, 1.5708F, 0.0F, 1.5708F));

		PartDefinition cube_r81 = right_arm.addOrReplaceChild("cube_r81",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-1.6875F, -14.25F, -13.6F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.6875F, -16.25F, -13.6F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.6875F, -12.25F, -13.6F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.0F, 16.5485F, -5.0787F, 1.5708F, 0.0F, 1.5708F));

		PartDefinition cube_r82 = right_arm.addOrReplaceChild("cube_r82",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-1.1875F, -14.25F, -13.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.1875F, -16.25F, -13.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.1875F, -12.25F, -13.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.0F, 16.5295F, -4.9831F, 1.5708F, 0.0F, 1.5708F));

		PartDefinition cube_r83 = right_arm.addOrReplaceChild("cube_r83",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-0.9375F, -14.25F, -13.4F, 0.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.9375F, -16.25F, -13.4F, 0.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.9375F, -12.25F, -13.4F, 0.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.0F, 16.5105F, -4.8874F, 1.5708F, 0.0F, 1.5708F));

		PartDefinition cube_r84 = right_arm.addOrReplaceChild("cube_r84",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-0.6875F, -14.25F, -13.3F, 0.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.6875F, -16.25F, -13.3F, 0.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.6875F, -12.25F, -13.3F, 0.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.0F, 16.4915F, -4.7917F, 1.5708F, 0.0F, 1.5708F));

		PartDefinition cube_r85 = right_arm.addOrReplaceChild("cube_r85",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.7042F, -15.7479F, -13.6F, 0.0F, 6.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.0F, 20.0126F, -13.2456F, 1.5708F, 0.3927F, 1.5708F));

		PartDefinition cube_r86 = right_arm.addOrReplaceChild("cube_r86",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.2042F, -15.7479F, -13.5F, 0.0F, 6.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.0F, 20.0126F, -13.0543F, 1.5708F, 0.3927F, 1.5708F));

		PartDefinition cube_r87 = right_arm.addOrReplaceChild("cube_r87",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.9542F, -15.7479F, -13.4F, 0.0F, 6.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.0F, 20.0126F, -12.8629F, 1.5708F, 0.3927F, 1.5708F));

		PartDefinition cube_r88 = right_arm.addOrReplaceChild("cube_r88",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.7042F, -15.7479F, -13.3F, 0.0F, 6.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.0F, 20.0126F, -12.6716F, 1.5708F, 0.3927F, 1.5708F));

		PartDefinition cube_r89 = right_arm.addOrReplaceChild("cube_r89",
				CubeListBuilder.create().texOffs(0, 0).addBox(1.9082F, -9.2049F, -13.6F, 0.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.0F, 14.6744F, -22.1275F, 1.5708F, 0.7854F, 1.5708F));

		PartDefinition cube_r90 = right_arm.addOrReplaceChild("cube_r90",
				CubeListBuilder.create().texOffs(0, 0).addBox(2.335F, -9.3781F, -13.5F, 0.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.0F, 14.6553F, -22.0318F, 1.5708F, 0.7854F, 1.5708F));

		PartDefinition cube_r91 = right_arm.addOrReplaceChild("cube_r91",
				CubeListBuilder.create().texOffs(0, 0).addBox(2.5117F, -9.5513F, -13.4F, 0.0F, 4.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.0F, 14.6363F, -21.9362F, 1.5708F, 0.7854F, 1.5708F));

		PartDefinition cube_r92 = right_arm.addOrReplaceChild("cube_r92",
				CubeListBuilder.create().texOffs(0, 0).addBox(2.6885F, -9.6745F, -13.3F, 0.0F, 5.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.0F, 14.6173F, -21.8405F, 1.5708F, 0.7854F, 1.5708F));

		PartDefinition cube_r93 = right_arm.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-1.3654F, -30.4118F, -13.905F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-1.3654F, -32.4118F, -13.805F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-6.1154F, -38.1618F, -13.805F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-6.1154F, -38.4118F, -13.805F, 0.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-1.3654F, -28.4118F, -13.805F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-1.6154F, -28.4118F, -14.005F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-1.6154F, -27.4118F, -14.005F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-1.6154F, -26.4118F, -14.005F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-1.6154F, -25.4118F, -14.005F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-1.6154F, -24.4118F, -14.005F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-1.6154F, -23.4118F, -14.005F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-2.6154F, -19.4118F, -14.005F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-2.6154F, -18.4118F, -14.005F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-2.6154F, -17.4118F, -14.005F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-2.6154F, -16.4118F, -14.005F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-2.6154F, -15.4118F, -14.005F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-2.6154F, -14.4118F, -14.005F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-2.6154F, -13.4118F, -14.005F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.055F, 14.8993F, 10.9642F, 1.5708F, 0.0F, 1.5708F));

		PartDefinition cube_r94 = right_arm.addOrReplaceChild("cube_r94",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.8654F, -29.8618F, -13.905F, 3.0F, 1.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.53F, 11.1155F, 10.9642F, 1.5708F, 0.0F, 1.5708F));

		PartDefinition cube_r95 = right_arm.addOrReplaceChild("cube_r95",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-6.3743F, -5.4364F, -13.475F, 0.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-7.1243F, -5.1864F, -13.475F, 0.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-7.8743F, -4.9364F, -13.475F, 0.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-8.6243F, -4.6864F, -13.475F, 0.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-9.3743F, -4.4364F, -13.475F, 0.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.0F, 17.5F, -11.6476F, 1.5708F, -0.3927F, 1.5708F));

		PartDefinition cube_r96 = right_arm.addOrReplaceChild("cube_r96",
				CubeListBuilder.create().texOffs(0, 0).addBox(-7.1243F, -4.7664F, -13.75F, 0.0F, 0.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.0F, 13.6681F, -20.6225F, 1.5708F, -0.3927F, 1.5708F));

		PartDefinition cube_r97 = right_arm.addOrReplaceChild("cube_r97",
				CubeListBuilder.create().texOffs(0, 0).addBox(-8.5282F, -1.5413F, -13.75F, 1.0F, 0.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.0F, 14.3244F, -21.106F, 1.5708F, -0.7854F, 1.5708F));

		PartDefinition cube_r98 = right_arm.addOrReplaceChild("cube_r98",
				CubeListBuilder.create().texOffs(0, 0).addBox(-8.5282F, -6.6213F, -13.75F, 1.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.0F, 12.9607F, -11.5637F, 1.5708F, -0.7854F, 1.5708F));

		PartDefinition cube_r99 = right_arm.addOrReplaceChild("cube_r99",
				CubeListBuilder.create().texOffs(0, 0).addBox(3.7333F, -8.7479F, -13.75F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.0F, 11.5109F, -12.7654F, 1.5708F, 0.3927F, 1.5708F));

		PartDefinition cube_r100 = right_arm.addOrReplaceChild("cube_r100",
				CubeListBuilder.create().texOffs(0, 0).addBox(-8.3382F, -2.4313F, -13.75F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.0F, 13.7111F, -9.582F, 1.5708F, -0.7854F, 1.5708F));

		PartDefinition cube_r101 = right_arm.addOrReplaceChild("cube_r101",
				CubeListBuilder.create().texOffs(0, 0).addBox(1.6178F, -32.4097F, -13.805F, 1.0F, 6.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.055F, 22.2599F, 4.1449F, 1.5708F, 0.3927F, 1.5708F));

		PartDefinition cube_r102 = right_arm.addOrReplaceChild("cube_r102",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(0.6514F, -7.4399F, -13.75F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(1.9014F, -7.9399F, -13.75F, 0.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.0F, 14.1792F, -22.5069F, 1.5708F, 0.7854F, 1.5708F));

		PartDefinition cube_r103 = right_arm.addOrReplaceChild("cube_r103",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-1.3917F, -6.3729F, -13.75F, 0.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.8917F, -6.8729F, -13.75F, 0.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.0F, 13.1036F, -24.1231F, 1.5708F, 0.3927F, 1.5708F));

		PartDefinition cube_r104 = right_arm.addOrReplaceChild("cube_r104",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-4.375F, -7.25F, -13.75F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.375F, -8.55F, -13.75F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.0F, 13.754F, -22.2283F, 1.5708F, 0.0F, 1.5708F));

		PartDefinition cube_r105 = right_arm.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-8.0282F, -4.4713F, -13.875F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-9.0282F, -2.9713F, -13.875F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-10.0282F, -3.9713F, -13.875F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-11.0282F, -4.9713F, -13.875F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-12.0282F, -5.9713F, -13.875F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-13.0282F, -6.9713F, -13.875F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.025F, 14.5935F, -13.1399F, 1.5708F, -0.7854F, 1.5708F));

		PartDefinition cube_r106 = right_arm.addOrReplaceChild("cube_r106",
				CubeListBuilder.create().texOffs(0, 0).addBox(4.7559F, -5.19F, -13.805F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.055F, 12.807F, 4.7828F, 1.5708F, 0.7854F, 1.5708F));

		PartDefinition cube_r107 = right_arm.addOrReplaceChild("cube_r107",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.7398F, -15.3482F, -13.805F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.055F, 11.2296F, 3.5894F, 1.5708F, -0.3927F, 1.5708F));

		PartDefinition cube_r108 = right_arm.addOrReplaceChild("cube_r108",
				CubeListBuilder.create().texOffs(0, 0).addBox(-10.0782F, -2.4963F, -13.5F, 4.0F, 0.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.0F, 16.0F, -5.375F, 1.5708F, -0.7854F, 1.5708F));

		PartDefinition cube_r109 = right_arm.addOrReplaceChild("cube_r109",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-6.0618F, -6.6864F, -13.3F, 0.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-6.3118F, -6.6864F, -13.4F, 0.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-6.5618F, -6.6864F, -13.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-7.0618F, -6.6864F, -13.6F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.0F, 18.8646F, -2.6402F, 1.5708F, -0.3927F, 1.5708F));

		PartDefinition cube_r110 = right_arm.addOrReplaceChild("cube_r110",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-3.6875F, -13.25F, -13.3F, 0.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.9375F, -13.25F, -13.4F, 0.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.1875F, -13.25F, -13.5F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.6875F, -13.25F, -13.6F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.0F, 18.6875F, 4.0F, 1.5708F, 0.0F, 1.5708F));

		PartDefinition cube_r111 = right_arm.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-10.2398F, -20.3482F, -14.005F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-10.2398F, -19.3482F, -14.005F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-10.2398F, -18.3482F, -14.005F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.055F, 14.8993F, 10.9642F, 1.5708F, -0.3927F, 1.5708F));

		PartDefinition cube_r112 = right_arm.addOrReplaceChild("cube_r112",
				CubeListBuilder.create().texOffs(0, 0).addBox(1.6213F, -7.5282F, -13.95F, 1.0F, 0.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.0F, 17.0339F, 5.8024F, 1.5708F, 0.7854F, 1.5708F));

		PartDefinition cube_r113 = right_arm.addOrReplaceChild("cube_r113",
				CubeListBuilder.create().texOffs(0, 0).addBox(-5.08F, -10.8475F, -13.855F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.0F, 14.09F, 7.6875F, 1.5708F, 0.0F, 1.5708F));

		PartDefinition cube_r114 = right_arm.addOrReplaceChild("cube_r114",
				CubeListBuilder.create().texOffs(0, 0).addBox(-8.1382F, -1.8963F, -13.855F, 0.0F, 0.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.0F, 15.0855F, 4.9673F, 1.5708F, -0.7854F, 1.5708F));

		PartDefinition cube_r115 = right_arm.addOrReplaceChild("cube_r115",
				CubeListBuilder.create().texOffs(0, 0).addBox(2.4813F, -7.5532F, -13.855F, 0.0F, 0.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.0F, 12.5963F, 5.2855F, 1.5708F, 0.7854F, 1.5708F));

		PartDefinition cube_r116 = right_arm.addOrReplaceChild("cube_r116",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -7.81F, -13.855F, 0.0F, 0.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.0F, 13.9968F, 5.8682F, 1.5708F, 0.0F, 1.5708F));

		PartDefinition cube_r117 = right_arm.addOrReplaceChild("cube_r117",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.675F, -7.81F, -13.855F, 0.0F, 0.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.0F, 14.0032F, 5.8682F, 1.5708F, 0.0F, 1.5708F));

		PartDefinition cube_r118 = right_arm.addOrReplaceChild("cube_r118",
				CubeListBuilder.create().texOffs(0, 0).addBox(1.3113F, -8.4532F, -13.855F, 0.0F, 0.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.0F, 15.4037F, 3.7445F, 1.5708F, 0.7854F, 1.5708F));

		PartDefinition cube_r119 = right_arm.addOrReplaceChild("cube_r119",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -6.64F, -13.855F, 0.0F, 0.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.0F, 13.9968F, 3.1618F, 1.5708F, 0.0F, 1.5708F));

		PartDefinition cube_r120 = right_arm.addOrReplaceChild("cube_r120",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.675F, -6.64F, -13.855F, 0.0F, 0.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.0F, 14.0032F, 3.1618F, 1.5708F, 0.0F, 1.5708F));

		PartDefinition cube_r121 = right_arm.addOrReplaceChild("cube_r121",
				CubeListBuilder.create().texOffs(0, 0).addBox(-7.8682F, -2.7963F, -13.855F, 0.0F, 0.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.0F, 12.9145F, 4.0627F, 1.5708F, -0.7854F, 1.5708F));

		PartDefinition cube_r122 = right_arm.addOrReplaceChild("cube_r122",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.5F, -5.1F, -13.375F, 1.0F, 4.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.0F, 14.128F, 3.5F, 1.5708F, 0.0F, 1.5708F));

		PartDefinition cube_r123 = right_arm.addOrReplaceChild("cube_r123",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-2.9917F, -4.8854F, -13.425F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.7417F, -5.6354F, -13.425F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.6167F, -8.6354F, -13.425F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.8667F, -7.8854F, -13.425F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.1167F, -7.1354F, -13.425F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.4917F, -6.3854F, -13.425F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.0F, 14.128F, 5.8125F, 1.5708F, 0.3927F, 1.5708F));

		PartDefinition cube_r124 = right_arm.addOrReplaceChild("cube_r124",
				CubeListBuilder.create().texOffs(0, 0).addBox(-5.8743F, -6.9364F, -13.125F, 0.0F, 1.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.0F, 12.6089F, 7.0885F, 1.5708F, -0.3927F, 1.5708F));

		PartDefinition cube_r125 = right_arm.addOrReplaceChild("cube_r125",
				CubeListBuilder.create().texOffs(0, 0).addBox(-7.2782F, -4.1213F, -13.125F, 0.0F, 1.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.0F, 12.0393F, 6.3559F, 1.5708F, -0.7854F, 1.5708F));

		PartDefinition cube_r126 = right_arm.addOrReplaceChild("cube_r126",
				CubeListBuilder.create().texOffs(0, 0).addBox(-7.8845F, -27.1618F, -13.655F, 0.0F, 0.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.53F, 16.9846F, 25.3642F, 1.5708F, 0.0F, 1.5708F));

		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg",
				CubeListBuilder.create().texOffs(0, 16).mirror()
						.addBox(-1.0F, 0.0F, -1.1F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(2.0F, 12.0F, 0.1F));

		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(0, 16)
				.addBox(-1.0F, 0.0F, -1.1F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 12.0F, 0.1F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		headwear.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.right_arm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.left_leg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.left_arm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.right_leg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}