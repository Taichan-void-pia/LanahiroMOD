// Made with Blockbench 4.6.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelknight_of_lightning<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "knight_of_lightning"), "main");
	private final ModelPart head;
	private final ModelPart body;
	private final ModelPart right_arm;
	private final ModelPart left_arm;
	private final ModelPart right_leg;
	private final ModelPart left_leg;

	public Modelknight_of_lightning(ModelPart root) {
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

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(23, 45)
				.addBox(-3.4275F, -6.7954F, -3.8419F, 7.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(1, 2)
				.addBox(-4.2275F, -2.6954F, -4.3419F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 2)
				.addBox(-2.7275F, -2.5454F, -4.8419F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 2)
				.addBox(0.2725F, -2.3954F, -5.0919F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 2)
				.addBox(-1.2275F, -2.3954F, -5.0919F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 2)
				.addBox(3.2725F, -2.6954F, -4.3419F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 2)
				.addBox(1.7725F, -2.5454F, -4.8419F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 2)
				.addBox(-0.4843F, 1.7046F, -5.5238F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(2, 29)
				.addBox(-4.4843F, -7.2954F, -1.5238F, 9.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(2, 25)
				.addBox(-3.4843F, -8.2954F, -3.0238F, 7.0F, 8.0F, 7.0F, new CubeDeformation(0.1F)).texOffs(47, 53)
				.addBox(-0.4843F, -9.2954F, -2.0238F, 1.0F, 6.0F, 7.0F, new CubeDeformation(0.1F)).texOffs(1, 2)
				.addBox(-0.4843F, -9.2954F, 4.2262F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(1, 2)
				.addBox(-0.4843F, -7.7954F, 3.2262F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(1, 2)
				.addBox(-0.4843F, -5.5454F, 5.7262F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.1F)).texOffs(1, 2)
				.addBox(-0.4843F, -4.7954F, 4.2262F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(1, 2)
				.addBox(-0.4843F, -2.2954F, 2.7262F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(2, 29)
				.addBox(-4.4843F, -7.7954F, -3.5238F, 9.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(2, 29)
				.addBox(-3.9843F, -7.7954F, -4.0238F, 8.0F, 3.0F, 7.0F, new CubeDeformation(-0.1F)).texOffs(13, 21)
				.addBox(-2.9843F, -7.5454F, -5.0238F, 6.0F, 3.0F, 7.0F, new CubeDeformation(-0.1F)).texOffs(1, 2)
				.addBox(-0.5843F, -2.6454F, -5.4238F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 2)
				.addBox(-0.5843F, -3.1454F, -5.1738F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0725F, -41.2046F, 1.3419F, 0.0873F, 0.0F, 0.0F));

		PartDefinition head_r1 = head.addOrReplaceChild("head_r1",
				CubeListBuilder.create().texOffs(1, 2).addBox(-0.9217F, -0.75F, -1.2686F, 2.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.4033F, -2.3954F, -2.8559F, 0.0F, 0.5672F, 0.0F));

		PartDefinition head_r2 = head.addOrReplaceChild("head_r2",
				CubeListBuilder.create().texOffs(1, 2).mirror()
						.addBox(-1.9217F, -0.75F, -0.7314F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(4.3484F, -2.3954F, -2.8559F, 0.0F, -0.5672F, 0.0F));

		PartDefinition head_r3 = head.addOrReplaceChild("head_r3",
				CubeListBuilder.create().texOffs(1, 2).mirror()
						.addBox(-2.9881F, -0.5F, -0.8918F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.916F, -2.6454F, -3.6371F, 0.0F, -0.2182F, 0.0F));

		PartDefinition head_r4 = head.addOrReplaceChild("head_r4",
				CubeListBuilder.create().texOffs(1, 2).addBox(-0.9881F, -0.5F, -1.1082F, 3.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.971F, -2.6454F, -3.6371F, 0.0F, 0.2182F, 0.0F));

		PartDefinition head_r5 = head.addOrReplaceChild("head_r5",
				CubeListBuilder.create().texOffs(1, 2).mirror()
						.addBox(1.9077F, -0.5F, -1.9339F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.4725F, -4.6454F, -4.1492F, 0.3076F, -0.5457F, -0.1634F));

		PartDefinition head_r6 = head.addOrReplaceChild("head_r6",
				CubeListBuilder.create().texOffs(1, 2).mirror()
						.addBox(-0.5459F, -0.5F, -1.1648F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.4725F, -4.6454F, -4.1492F, 0.2679F, -0.2106F, -0.0573F));

		PartDefinition head_r7 = head.addOrReplaceChild("head_r7",
				CubeListBuilder.create().texOffs(1, 2).addBox(-1.0568F, -0.5F, -1.2746F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4725F, -4.6454F, -4.1492F, 0.2618F, 0.0F, 0.0F));

		PartDefinition head_r8 = head.addOrReplaceChild("head_r8",
				CubeListBuilder.create().texOffs(1, 2).addBox(-4.7511F, -0.5F, -2.4712F, 2.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4725F, -4.6454F, -4.1492F, 0.3076F, 0.5457F, 0.1634F));

		PartDefinition head_r9 = head.addOrReplaceChild("head_r9",
				CubeListBuilder.create().texOffs(1, 2).addBox(-3.4304F, -0.5F, -1.3813F, 3.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4725F, -4.6454F, -4.1492F, 0.2679F, 0.2106F, 0.0573F));

		PartDefinition head_r10 = head.addOrReplaceChild("head_r10",
				CubeListBuilder.create().texOffs(1, 2)
						.addBox(-0.9217F, -0.75F, -1.2686F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(1, 2)
						.addBox(-0.9217F, 3.25F, -1.2686F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(-3.4033F, -1.8954F, -3.1059F, 0.0F, 0.5672F, 0.0F));

		PartDefinition head_r11 = head.addOrReplaceChild("head_r11",
				CubeListBuilder.create().texOffs(1, 2)
						.addBox(-0.9881F, -0.5F, -1.1082F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(1, 2)
						.addBox(-0.9881F, 3.75F, -1.1082F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(-1.971F, -2.1454F, -3.8871F, 0.0F, 0.2182F, 0.0F));

		PartDefinition head_r12 = head.addOrReplaceChild("head_r12",
				CubeListBuilder.create().texOffs(1, 2).mirror()
						.addBox(-2.9881F, -0.5F, -0.8918F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(1, 2).mirror()
						.addBox(-2.9881F, 3.75F, -0.8918F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.1F)).mirror(false),
				PartPose.offsetAndRotation(2.916F, -2.1454F, -3.8871F, 0.0F, -0.2182F, 0.0F));

		PartDefinition head_r13 = head.addOrReplaceChild("head_r13",
				CubeListBuilder.create().texOffs(1, 2).mirror()
						.addBox(-1.9217F, -0.75F, -0.7314F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(1, 2).mirror()
						.addBox(-1.9217F, 3.25F, -0.7314F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.1F)).mirror(false),
				PartPose.offsetAndRotation(4.3484F, -1.8954F, -3.1059F, 0.0F, -0.5672F, 0.0F));

		PartDefinition head_r14 = head.addOrReplaceChild("head_r14", CubeListBuilder.create().texOffs(47, 53).mirror()
				.addBox(-0.8536F, -1.9154F, -6.1733F, 1.0F, 6.0F, 7.0F, new CubeDeformation(0.1F)).mirror(false)
				.texOffs(1, 2).mirror().addBox(-0.8536F, 1.8346F, 1.5767F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.1F))
				.mirror(false).texOffs(1, 2).mirror()
				.addBox(-0.8536F, 2.5846F, 0.0767F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(1, 2).mirror()
				.addBox(-0.8536F, -0.4154F, -0.9233F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(1, 2).mirror().addBox(-0.8536F, -1.9154F, 0.0767F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.mirror(false), PartPose.offsetAndRotation(4.6293F, -4.0264F, 4.1495F, 0.0F, 0.0F, 0.7854F));

		PartDefinition head_r15 = head.addOrReplaceChild("head_r15", CubeListBuilder.create().texOffs(1, 2).mirror()
				.addBox(-0.8536F, -5.7066F, -3.0587F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(1, 2).mirror()
				.addBox(-0.8536F, -6.4566F, -1.5587F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.1F)).mirror(false),
				PartPose.offsetAndRotation(4.6293F, -4.0264F, 4.1495F, 0.7854F, 0.0F, 0.7854F));

		PartDefinition head_r16 = head.addOrReplaceChild("head_r16", CubeListBuilder.create().texOffs(1, 2).mirror()
				.addBox(-0.8536F, -3.3486F, -2.2135F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(1, 2).mirror()
				.addBox(-0.8536F, -4.0986F, -0.7135F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.1F)).mirror(false),
				PartPose.offsetAndRotation(4.6293F, -4.0264F, 4.1495F, 0.3927F, 0.0F, 0.7854F));

		PartDefinition head_r17 = head.addOrReplaceChild("head_r17",
				CubeListBuilder.create().texOffs(47, 53)
						.addBox(-0.8536F, -2.6225F, -6.1733F, 1.0F, 6.0F, 7.0F, new CubeDeformation(0.1F)).texOffs(1, 2)
						.addBox(-0.8536F, 1.1275F, 1.5767F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.1F)).texOffs(1, 2)
						.addBox(-0.8536F, 1.8775F, 0.0767F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(1, 2)
						.addBox(-0.8536F, -1.1225F, -0.9233F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(1, 2)
						.addBox(-0.8536F, -2.6225F, 0.0767F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.4843F, -4.0264F, 4.1495F, 0.0F, 0.0F, -0.7854F));

		PartDefinition head_r18 = head.addOrReplaceChild("head_r18",
				CubeListBuilder.create().texOffs(1, 2)
						.addBox(-0.8536F, -6.2066F, -2.5587F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(1, 2)
						.addBox(-0.8536F, -6.9566F, -1.0587F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(-3.4843F, -4.0264F, 4.1495F, 0.7854F, 0.0F, -0.7854F));

		PartDefinition head_r19 = head.addOrReplaceChild("head_r19",
				CubeListBuilder.create().texOffs(1, 2)
						.addBox(-0.8536F, -4.0019F, -1.9429F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(1, 2)
						.addBox(-0.8536F, -4.7519F, -0.4429F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(-3.4843F, -4.0264F, 4.1495F, 0.3927F, 0.0F, -0.7854F));

		PartDefinition head_r20 = head.addOrReplaceChild("head_r20",
				CubeListBuilder.create().texOffs(1, 2)
						.addBox(-1.0F, -3.125F, -5.25F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(1, 2)
						.addBox(-1.0F, -4.325F, -1.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.25F)).texOffs(1, 2)
						.addBox(-1.0F, -3.875F, -3.75F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(0.5157F, -10.7549F, 3.8735F, 0.7854F, 0.0F, 0.0F));

		PartDefinition head_r21 = head.addOrReplaceChild("head_r21",
				CubeListBuilder.create().texOffs(1, 2)
						.addBox(-1.0F, -7.875F, -2.75F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.1F)).texOffs(1, 2)
						.addBox(-1.0F, -7.125F, -4.25F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5157F, -4.6704F, 7.4762F, 0.3927F, 0.0F, 0.0F));

		PartDefinition head_r22 = head.addOrReplaceChild("head_r22",
				CubeListBuilder.create().texOffs(1, 2).mirror()
						.addBox(-1.243F, -0.4235F, -1.9663F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.1F)).mirror(false),
				PartPose.offsetAndRotation(4.9409F, 0.1919F, -2.4879F, 0.7738F, -0.1561F, 0.0624F));

		PartDefinition head_r23 = head.addOrReplaceChild("head_r23",
				CubeListBuilder.create().texOffs(1, 2).addBox(-0.743F, -0.5765F, -2.0337F, 1.0F, 1.0F, 5.0F,
						new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(-3.9958F, 0.1919F, -2.4879F, 0.7738F, 0.1561F, -0.0624F));

		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(47, 53)
						.addBox(-2.5F, -9.268F, -1.549F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(47, 53)
						.addBox(-5.5F, 8.6805F, -2.8681F, 11.0F, 6.0F, 6.0F, new CubeDeformation(-0.25F))
						.texOffs(13, 32).addBox(-3.5F, 8.3598F, -3.162F, 7.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -31.732F, 1.049F, 0.1309F, 0.0F, 0.0F));

		PartDefinition body_r1 = body.addOrReplaceChild("body_r1",
				CubeListBuilder.create().texOffs(5, 32).mirror()
						.addBox(-1.9619F, -1.8087F, -0.5F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.9489F, 7.804F, -2.5373F, -0.0403F, 0.0167F, 0.3924F));

		PartDefinition body_r2 = body.addOrReplaceChild("body_r2",
				CubeListBuilder.create().texOffs(4, 32).mirror()
						.addBox(1.6464F, -5.6464F, -0.5F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.5F, 5.3845F, -2.4316F, -0.0309F, 0.0308F, 0.7849F));

		PartDefinition body_r3 = body.addOrReplaceChild("body_r3",
				CubeListBuilder.create().texOffs(5, 32).addBox(-1.9619F, -2.1913F, -0.5F, 3.0F, 5.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.9489F, 7.804F, -2.5373F, -0.0403F, -0.0167F, -0.3924F));

		PartDefinition body_r4 = body.addOrReplaceChild("body_r4",
				CubeListBuilder.create().texOffs(4, 32).addBox(-5.3536F, -6.3536F, -0.5F, 3.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 5.3845F, -2.4316F, -0.0309F, -0.0308F, -0.7849F));

		PartDefinition body_r5 = body.addOrReplaceChild("body_r5",
				CubeListBuilder.create().texOffs(13, 27).addBox(-4.0F, -5.9877F, -0.5652F, 7.0F, 6.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 8.3721F, -2.5968F, -0.0436F, 0.0F, 0.0F));

		PartDefinition body_r6 = body.addOrReplaceChild("body_r6",
				CubeListBuilder.create().texOffs(8, 29).mirror()
						.addBox(-6.426F, -4.9971F, -3.0F, 8.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(6.8928F, -0.4623F, -0.449F, -0.0852F, 0.0189F, 0.2174F));

		PartDefinition body_r7 = body.addOrReplaceChild("body_r7",
				CubeListBuilder.create().texOffs(8, 29).mirror()
						.addBox(-6.9389F, -0.0751F, -3.0F, 11.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(6.8928F, -0.4623F, -0.349F, -0.0859F, -0.0151F, -0.1739F));

		PartDefinition body_r8 = body.addOrReplaceChild("body_r8",
				CubeListBuilder.create().texOffs(8, 29).mirror()
						.addBox(1.0125F, -3.3688F, -3.0F, 3.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(6.8928F, -0.4623F, -0.349F, -0.082F, -0.0298F, -0.3478F));

		PartDefinition body_r9 = body.addOrReplaceChild("body_r9", CubeListBuilder.create().texOffs(12, 27).mirror()
				.addBox(-5.3928F, -5.8058F, 3.0F, 9.0F, 11.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(12, 27).addBox(-17.3928F, -5.8058F, 3.0F, 9.0F, 11.0F, 2.0F, new CubeDeformation(-0.1F))
				.texOffs(16, 1).addBox(-14.3928F, -5.8058F, 3.0F, 15.0F, 12.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(47, 53).mirror()
				.addBox(-5.3928F, -5.8058F, -2.0F, 9.0F, 11.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(47, 53).mirror()
				.addBox(-2.3928F, -6.8058F, -1.0F, 10.0F, 8.0F, 5.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(47, 53).addBox(-21.3928F, -6.8058F, -1.0F, 10.0F, 8.0F, 5.0F, new CubeDeformation(-0.1F))
				.texOffs(47, 53).addBox(-17.3928F, -5.8058F, -2.0F, 9.0F, 11.0F, 2.0F, new CubeDeformation(-0.1F))
				.texOffs(47, 53).addBox(-14.3928F, -5.8058F, -2.0F, 15.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.8928F, -1.4623F, -1.049F, -0.0873F, 0.0F, 0.0F));

		PartDefinition body_r10 = body.addOrReplaceChild("body_r10",
				CubeListBuilder.create().texOffs(8, 30).mirror()
						.addBox(-2.0F, -8.5F, -3.5F, 7.0F, 3.0F, 7.0F, new CubeDeformation(-0.25F)).mirror(false)
						.texOffs(8, 30).addBox(-14.0F, -8.5F, -3.5F, 7.0F, 3.0F, 7.0F, new CubeDeformation(-0.25F))
						.texOffs(4, 27).addBox(-11.0F, -7.5F, -2.5F, 13.0F, 7.0F, 6.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(4.5F, 11.1805F, -0.3681F, -0.0436F, 0.0F, 0.0F));

		PartDefinition body_r11 = body.addOrReplaceChild("body_r11",
				CubeListBuilder.create().texOffs(23, 30).mirror()
						.addBox(1.0381F, -0.6913F, -3.5F, 2.0F, 2.0F, 7.0F, new CubeDeformation(-0.25F)).mirror(false),
				PartPose.offsetAndRotation(6.269F, 5.5248F, -0.1212F, -0.0403F, -0.0167F, -0.3924F));

		PartDefinition body_r12 = body.addOrReplaceChild("body_r12",
				CubeListBuilder.create().texOffs(9, 31).mirror()
						.addBox(-2.1913F, -2.4619F, -2.5F, 3.0F, 3.0F, 6.0F, new CubeDeformation(-0.25F)).mirror(false),
				PartPose.offsetAndRotation(8.1961F, 5.604F, -0.1246F, -0.0167F, -0.0403F, -1.1778F));

		PartDefinition body_r13 = body.addOrReplaceChild("body_r13",
				CubeListBuilder.create().texOffs(47, 53).mirror()
						.addBox(-6.5436F, -2.4981F, -2.5F, 6.0F, 3.0F, 6.0F, new CubeDeformation(-0.3F)).mirror(false),
				PartPose.offsetAndRotation(7.5428F, 5.8743F, -0.1364F, -0.0038F, -0.0435F, -1.4834F));

		PartDefinition body_r14 = body.addOrReplaceChild("body_r14",
				CubeListBuilder.create().texOffs(47, 53).addBox(0.4564F, -1.5019F, -2.5F, 6.0F, 3.0F, 6.0F,
						new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(-6.5428F, 5.8743F, -0.1364F, -0.0038F, 0.0435F, 1.4834F));

		PartDefinition body_r15 = body.addOrReplaceChild("body_r15",
				CubeListBuilder.create().texOffs(9, 31).addBox(-1.1913F, -1.5381F, -2.5F, 3.0F, 3.0F, 6.0F,
						new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(-7.1961F, 5.604F, -0.1246F, -0.0167F, 0.0403F, 1.1778F));

		PartDefinition body_r16 = body.addOrReplaceChild("body_r16",
				CubeListBuilder.create().texOffs(23, 30).addBox(-3.9619F, -0.3087F, -3.5F, 2.0F, 2.0F, 7.0F,
						new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(-5.269F, 5.5248F, -0.1212F, -0.0403F, 0.0167F, 0.3924F));

		PartDefinition body_r17 = body.addOrReplaceChild("body_r17",
				CubeListBuilder.create().texOffs(23, 26).mirror()
						.addBox(-2.6913F, -3.2119F, -2.5F, 6.0F, 2.0F, 3.0F, new CubeDeformation(-0.5F)).mirror(false),
				PartPose.offsetAndRotation(11.7678F, -10.1996F, 0.7211F, -0.0335F, -0.0806F, -1.1767F));

		PartDefinition body_r18 = body.addOrReplaceChild("body_r18", CubeListBuilder.create().texOffs(23, 26).mirror()
				.addBox(-6.6913F, -1.2119F, -1.5F, 11.0F, 2.0F, 4.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(23, 26).mirror()
				.addBox(-10.6913F, -4.2119F, -2.5F, 11.0F, 2.0F, 3.0F, new CubeDeformation(-0.25F)).mirror(false),
				PartPose.offsetAndRotation(11.7678F, -10.1996F, 1.2211F, -0.0335F, -0.0806F, -1.1767F));

		PartDefinition body_r19 = body.addOrReplaceChild("body_r19",
				CubeListBuilder.create().texOffs(23, 26).mirror()
						.addBox(1.3087F, -0.2119F, -0.5F, 6.0F, 2.0F, 3.0F, new CubeDeformation(-0.5F)).mirror(false),
				PartPose.offsetAndRotation(11.7678F, -10.1996F, 1.9711F, -0.0335F, -0.0806F, -1.1767F));

		PartDefinition body_r20 = body.addOrReplaceChild("body_r20",
				CubeListBuilder.create().texOffs(23, 26).addBox(-3.6913F, -2.2881F, -2.5F, 6.0F, 2.0F, 3.0F,
						new CubeDeformation(-0.5F)),
				PartPose.offsetAndRotation(-10.7678F, -10.1996F, 0.7211F, -0.0335F, 0.0806F, 1.1767F));

		PartDefinition body_r21 = body.addOrReplaceChild("body_r21", CubeListBuilder.create().texOffs(23, 26)
				.addBox(-0.6913F, -3.2881F, -2.5F, 11.0F, 2.0F, 3.0F, new CubeDeformation(-0.25F)).texOffs(23, 26)
				.addBox(-4.6913F, -0.2881F, -1.5F, 11.0F, 2.0F, 4.0F, new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(-10.7678F, -10.1996F, 1.2211F, -0.0335F, 0.0806F, 1.1767F));

		PartDefinition body_r22 = body.addOrReplaceChild("body_r22",
				CubeListBuilder.create().texOffs(23, 26).addBox(-7.6913F, 0.7119F, -0.5F, 6.0F, 2.0F, 3.0F,
						new CubeDeformation(-0.5F)),
				PartPose.offsetAndRotation(-10.7678F, -10.1996F, 1.9711F, -0.0335F, 0.0806F, 1.1767F));

		PartDefinition body_r23 = body.addOrReplaceChild("body_r23",
				CubeListBuilder.create().texOffs(8, 29).addBox(-4.9521F, -3.0267F, -3.0F, 3.0F, 4.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.8928F, -0.4623F, -0.349F, -0.082F, 0.0298F, 0.3478F));

		PartDefinition body_r24 = body.addOrReplaceChild("body_r24",
				CubeListBuilder.create().texOffs(8, 29).addBox(-5.0459F, 0.0985F, -3.0F, 11.0F, 4.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.8928F, -0.4623F, -0.349F, -0.0859F, 0.0151F, 0.1739F));

		PartDefinition body_r25 = body.addOrReplaceChild("body_r25",
				CubeListBuilder.create().texOffs(8, 29).addBox(-2.5503F, -5.2135F, -3.0F, 8.0F, 8.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.8928F, -0.4623F, -0.449F, -0.0852F, -0.0189F, -0.2174F));

		PartDefinition body_r26 = body.addOrReplaceChild("body_r26",
				CubeListBuilder.create().texOffs(11, 5).addBox(0.3928F, -15.4558F, 0.5F, 11.0F, 2.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.8928F, 6.5377F, -1.049F, -0.0873F, 0.0F, 0.0F));

		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm",
				CubeListBuilder.create().texOffs(1, 2)
						.addBox(-6.0F, -1.0847F, -2.2853F, 7.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(47, 53)
						.addBox(-6.9F, 2.9153F, -2.7853F, 8.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(47, 53)
						.addBox(-5.0F, 4.9153F, -1.2853F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(7, 30)
						.addBox(-7.4631F, 10.7439F, -0.7853F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.5F, -38.9153F, 0.2853F, 0.0F, 0.0F, 0.2618F));

		PartDefinition right_arm_r1 = right_arm.addOrReplaceChild("right_arm_r1",
				CubeListBuilder.create().texOffs(1, 2)
						.addBox(4.0452F, -6.5696F, 22.4744F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(2, 24)
						.addBox(4.0452F, -6.5696F, 14.2244F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9727F, 26.4604F, -19.2244F, 0.0F, 0.0F, -0.5672F));

		PartDefinition right_arm_r2 = right_arm.addOrReplaceChild("right_arm_r2", CubeListBuilder.create()
				.texOffs(40, 2).addBox(0.2F, -9.4705F, 21.7244F, 3.0F, 10.0F, 1.0F, new CubeDeformation(0.25F))
				.texOffs(40, 20).addBox(0.2F, -9.4705F, 14.9744F, 3.0F, 10.0F, 1.0F, new CubeDeformation(0.25F))
				.texOffs(3, 16).addBox(-0.8F, -9.2205F, 15.7244F, 1.0F, 10.0F, 6.0F, new CubeDeformation(0.25F))
				.texOffs(29, 31).addBox(-1.55F, -1.0567F, 18.4046F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(3, 22).addBox(-1.55F, -10.2205F, 15.7244F, 1.0F, 10.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(27, 20).addBox(-0.55F, -2.2205F, 15.7244F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(27, 20).addBox(-0.55F, -8.2205F, 15.7244F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(47, 53).addBox(0.95F, -10.2205F, 16.7244F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9727F, 26.4604F, -19.2244F, 0.0F, 0.0F, -0.1745F));

		PartDefinition right_arm_r3 = right_arm.addOrReplaceChild("right_arm_r3",
				CubeListBuilder.create().texOffs(13, 20).addBox(-1.4957F, -5.9353F, -0.525F, 1.0F, 11.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7604F, -1.2852F, 1.2147F, -0.3927F, 0.0F, -0.3927F));

		PartDefinition right_arm_r4 = right_arm.addOrReplaceChild("right_arm_r4",
				CubeListBuilder.create().texOffs(13, 20).addBox(-0.9957F, -3.1902F, -0.5028F, 2.0F, 7.0F, 1.0F,
						new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(-1.7604F, -1.2852F, 1.2147F, -0.0436F, 0.0F, -0.3927F));

		PartDefinition right_arm_r5 = right_arm.addOrReplaceChild("right_arm_r5",
				CubeListBuilder.create().texOffs(1, 2).addBox(-2.2457F, -0.8091F, 0.4724F, 2.0F, 8.0F, 1.0F,
						new CubeDeformation(-0.15F)),
				PartPose.offsetAndRotation(-4.517F, -2.7141F, 1.2147F, -0.4363F, 0.0F, -0.3927F));

		PartDefinition right_arm_r6 = right_arm.addOrReplaceChild("right_arm_r6",
				CubeListBuilder.create().texOffs(1, 2).addBox(-3.2457F, -1.5603F, -0.475F, 2.0F, 7.0F, 1.0F,
						new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(-4.517F, -2.7141F, 1.2147F, 0.3927F, 0.0F, -0.3927F));

		PartDefinition right_arm_r7 = right_arm.addOrReplaceChild("right_arm_r7",
				CubeListBuilder.create().texOffs(1, 2).addBox(-4.9957F, -3.8035F, -0.4626F, 2.0F, 7.0F, 1.0F,
						new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(-4.517F, -2.7141F, 1.2147F, 0.6109F, 0.0F, -0.3927F));

		PartDefinition right_arm_r8 = right_arm.addOrReplaceChild("right_arm_r8",
				CubeListBuilder.create().texOffs(1, 2).addBox(-5.4957F, -6.5653F, -0.5F, 1.0F, 11.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.517F, -2.7141F, 1.2147F, 0.0F, 0.0F, -0.3927F));

		PartDefinition right_arm_r9 = right_arm.addOrReplaceChild("right_arm_r9",
				CubeListBuilder.create().texOffs(47, 53).addBox(-3.3099F, 15.9102F, -5.239F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0373F, 30.4449F, -19.2244F, 1.7762F, 0.0741F, -2.5231F));

		PartDefinition right_arm_r10 = right_arm.addOrReplaceChild("right_arm_r10",
				CubeListBuilder.create().texOffs(47, 53).addBox(-4.3729F, 2.2363F, 15.4102F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-0.0373F, 30.4449F, -19.2244F, 0.1848F, 0.1166F, -2.7381F));

		PartDefinition right_arm_r11 = right_arm.addOrReplaceChild("right_arm_r11", CubeListBuilder.create()
				.texOffs(47, 53).addBox(-0.4876F, -1.5779F, 16.2244F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.1F))
				.texOffs(47, 53).addBox(-1.2376F, -1.3279F, 16.7244F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(47, 53).addBox(-1.2376F, -3.8279F, 16.7244F, 4.0F, 3.0F, 4.0F, new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(-0.0373F, 30.4449F, -19.2244F, 0.0F, 0.0F, -0.3491F));

		PartDefinition right_arm_r12 = right_arm.addOrReplaceChild("right_arm_r12", CubeListBuilder.create()
				.texOffs(47, 53).addBox(0.547F, -1.4826F, 16.7244F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.05F))
				.texOffs(47, 53).addBox(0.547F, -1.4826F, 17.7244F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.05F))
				.texOffs(47, 53).addBox(0.547F, -1.4826F, 18.7244F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.05F))
				.texOffs(47, 53).addBox(0.547F, -1.4826F, 19.7244F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(-0.0373F, 30.4449F, -19.2244F, 0.0F, 0.0F, 1.0908F));

		PartDefinition right_arm_r13 = right_arm.addOrReplaceChild("right_arm_r13", CubeListBuilder.create()
				.texOffs(47, 53).addBox(-2.9014F, -0.5038F, 16.7244F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(47, 53).addBox(-2.9014F, -0.5038F, 17.7244F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.05F))
				.texOffs(47, 53).addBox(-2.9014F, -0.5038F, 18.7244F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(47, 53).addBox(-2.9014F, -0.5038F, 19.7244F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-0.0373F, 30.4449F, -19.2244F, 0.0F, 0.0F, -1.6581F));

		PartDefinition right_arm_r14 = right_arm.addOrReplaceChild("right_arm_r14", CubeListBuilder.create()
				.texOffs(47, 53).addBox(-1.9485F, -2.7893F, 16.7244F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.05F))
				.texOffs(47, 53).addBox(-1.9485F, -2.7893F, 17.7244F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.05F))
				.texOffs(47, 53).addBox(-1.9485F, -2.7893F, 18.7244F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.05F))
				.texOffs(47, 53).addBox(-1.9485F, -2.7893F, 19.7244F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(-0.0373F, 30.4449F, -19.2244F, 0.0F, 0.0F, 3.0543F));

		PartDefinition right_arm_r15 = right_arm.addOrReplaceChild("right_arm_r15",
				CubeListBuilder.create().texOffs(29, 31).addBox(-1.55F, -17.3443F, 6.4456F, 1.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9727F, 26.4604F, -19.2244F, -1.1345F, 0.0F, -0.1745F));

		PartDefinition right_arm_r16 = right_arm.addOrReplaceChild("right_arm_r16",
				CubeListBuilder.create().texOffs(29, 31).addBox(-1.55F, -12.0205F, 13.292F, 1.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9727F, 26.4604F, -19.2244F, -0.7418F, 0.0F, -0.1745F));

		PartDefinition right_arm_r17 = right_arm.addOrReplaceChild("right_arm_r17",
				CubeListBuilder.create().texOffs(29, 31).addBox(-1.55F, -1.0567F, 18.0442F, 1.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9727F, 26.4604F, -19.2244F, 0.0F, 0.0F, -0.1745F));

		PartDefinition right_arm_r18 = right_arm.addOrReplaceChild("right_arm_r18",
				CubeListBuilder.create().texOffs(29, 31).addBox(-1.55F, 13.2796F, 12.3181F, 1.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9727F, 26.4604F, -19.2244F, 0.7418F, 0.0F, -0.1745F));

		PartDefinition right_arm_r19 = right_arm.addOrReplaceChild("right_arm_r19",
				CubeListBuilder.create().texOffs(29, 31).addBox(-1.55F, 16.5958F, 7.381F, 1.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9727F, 26.4604F, -19.2244F, 1.1345F, 0.0F, -0.1745F));

		PartDefinition right_arm_r20 = right_arm.addOrReplaceChild("right_arm_r20",
				CubeListBuilder.create().texOffs(1, 2)
						.addBox(0.8028F, 0.2371F, -2.017F, 7.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(7, 30)
						.addBox(-0.1972F, 0.2371F, -1.017F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.4031F, 10.5068F, -3.6652F, 0.0F, -1.5708F, 0.0F));

		PartDefinition right_arm_r21 = right_arm.addOrReplaceChild("right_arm_r21",
				CubeListBuilder.create().texOffs(4, 19).addBox(-0.6774F, -1.7184F, -1.6848F, 1.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.2963F, 10.5068F, 3.1614F, -0.054F, 0.3892F, -0.1415F));

		PartDefinition right_arm_r22 = right_arm.addOrReplaceChild("right_arm_r22",
				CubeListBuilder.create().texOffs(1, 2).addBox(-0.2436F, -11.5763F, -1.6848F, 1.0F, 10.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.2963F, 10.5068F, 3.1614F, -0.1572F, 0.3614F, -0.4215F));

		PartDefinition right_arm_r23 = right_arm.addOrReplaceChild("right_arm_r23",
				CubeListBuilder.create().texOffs(7, 30).addBox(-0.6434F, 0.2371F, -1.6848F, 1.0F, 5.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.2963F, 10.5068F, 3.1614F, 0.0F, 0.3927F, 0.0F));

		PartDefinition right_arm_r24 = right_arm.addOrReplaceChild("right_arm_r24",
				CubeListBuilder.create().texOffs(7, 30).addBox(-0.5387F, 0.2371F, -1.3415F, 1.0F, 5.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.6466F, 10.5068F, 3.9582F, 0.0F, 0.7854F, 0.0F));

		PartDefinition right_arm_r25 = right_arm.addOrReplaceChild("right_arm_r25",
				CubeListBuilder.create().texOffs(4, 19).addBox(-0.5736F, -1.7047F, -1.3415F, 1.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.6466F, 10.5068F, 3.9582F, -0.1298F, 0.7769F, -0.1841F));

		PartDefinition right_arm_r26 = right_arm.addOrReplaceChild("right_arm_r26",
				CubeListBuilder.create().texOffs(1, 2).addBox(-0.1469F, -5.5362F, -1.3415F, 1.0F, 4.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.6466F, 10.5068F, 3.9582F, -0.3655F, 0.7119F, -0.5299F));

		PartDefinition right_arm_r27 = right_arm.addOrReplaceChild("right_arm_r27",
				CubeListBuilder.create().texOffs(7, 30).addBox(-0.382F, 0.2371F, -1.4462F, 1.0F, 5.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.3879F, 10.5068F, 4.7992F, 0.0F, 1.1781F, 0.0F));

		PartDefinition right_arm_r28 = right_arm.addOrReplaceChild("right_arm_r28",
				CubeListBuilder.create().texOffs(4, 19).addBox(-0.4182F, -1.6842F, -1.4462F, 1.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.3879F, 10.5068F, 4.7992F, -0.3053F, 1.1579F, -0.3313F));

		PartDefinition right_arm_r29 = right_arm.addOrReplaceChild("right_arm_r29",
				CubeListBuilder.create().texOffs(1, 2).addBox(-0.0021F, -9.4763F, -1.4462F, 1.0F, 8.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.3879F, 10.5068F, 4.7992F, -0.7459F, 1.0228F, -0.8249F));

		PartDefinition right_arm_r30 = right_arm.addOrReplaceChild("right_arm_r30",
				CubeListBuilder.create().texOffs(7, 30).addBox(-0.1972F, 0.2371F, -1.983F, 1.0F, 5.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.4031F, 10.5068F, 5.0946F, 0.0F, 1.5708F, 0.0F));

		PartDefinition right_arm_r31 = right_arm.addOrReplaceChild("right_arm_r31",
				CubeListBuilder.create().texOffs(4, 19).addBox(-0.235F, -1.6601F, -1.983F, 1.0F, 2.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.4031F, 10.5068F, 5.0946F, -1.5708F, 1.4399F, -1.5708F));

		PartDefinition right_arm_r32 = right_arm.addOrReplaceChild("right_arm_r32",
				CubeListBuilder.create().texOffs(1, 2).addBox(0.1686F, -6.4055F, -1.983F, 1.0F, 5.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.4031F, 10.5068F, 5.0946F, -1.5708F, 1.1781F, -1.5708F));

		PartDefinition right_arm_r33 = right_arm.addOrReplaceChild("right_arm_r33",
				CubeListBuilder.create().texOffs(7, 30).mirror()
						.addBox(-0.9877F, 0.2371F, -0.5538F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.4183F, 10.5068F, 4.7992F, 0.0F, -1.1781F, 0.0F));

		PartDefinition right_arm_r34 = right_arm.addOrReplaceChild("right_arm_r34",
				CubeListBuilder.create().texOffs(4, 19).mirror()
						.addBox(-0.9483F, -1.636F, -0.5538F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.4183F, 10.5068F, 4.7992F, -0.3053F, -1.1579F, 0.3313F));

		PartDefinition right_arm_r35 = right_arm.addOrReplaceChild("right_arm_r35",
				CubeListBuilder.create().texOffs(1, 2).mirror()
						.addBox(-1.3394F, -4.3348F, -0.5538F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(-0.4183F, 10.5068F, 4.7992F, -0.7459F, -1.0228F, 0.8249F));

		PartDefinition right_arm_r36 = right_arm.addOrReplaceChild("right_arm_r36",
				CubeListBuilder.create().texOffs(1, 2).mirror()
						.addBox(-1.3394F, -4.3348F, -1.4462F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(-0.4183F, 10.5068F, -3.3698F, 0.7459F, 1.0228F, 0.8249F));

		PartDefinition right_arm_r37 = right_arm.addOrReplaceChild("right_arm_r37",
				CubeListBuilder.create().texOffs(4, 19).mirror()
						.addBox(-0.9483F, -1.636F, -1.4462F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.4183F, 10.5068F, -3.3698F, 0.3053F, 1.1579F, 0.3313F));

		PartDefinition right_arm_r38 = right_arm.addOrReplaceChild("right_arm_r38",
				CubeListBuilder.create().texOffs(7, 30).mirror()
						.addBox(-0.9877F, 0.2371F, -1.4462F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.4183F, 10.5068F, -3.3698F, 0.0F, 1.1781F, 0.0F));

		PartDefinition right_arm_r39 = right_arm.addOrReplaceChild("right_arm_r39",
				CubeListBuilder.create().texOffs(1, 2).addBox(0.1686F, -6.4055F, -1.017F, 1.0F, 5.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.4031F, 10.5068F, -3.6652F, 1.5708F, -1.1781F, -1.5708F));

		PartDefinition right_arm_r40 = right_arm.addOrReplaceChild("right_arm_r40",
				CubeListBuilder.create().texOffs(4, 19).addBox(-0.235F, -1.6601F, -1.017F, 1.0F, 2.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.4031F, 10.5068F, -3.6652F, 1.5708F, -1.4399F, -1.5708F));

		PartDefinition right_arm_r41 = right_arm.addOrReplaceChild("right_arm_r41",
				CubeListBuilder.create().texOffs(1, 2).addBox(-0.0021F, -9.4763F, -0.5538F, 1.0F, 8.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.3879F, 10.5068F, -3.3698F, 0.7459F, -1.0228F, -0.8249F));

		PartDefinition right_arm_r42 = right_arm.addOrReplaceChild("right_arm_r42",
				CubeListBuilder.create().texOffs(4, 19).addBox(-0.4182F, -1.6842F, -0.5538F, 1.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.3879F, 10.5068F, -3.3698F, 0.3053F, -1.1579F, -0.3313F));

		PartDefinition right_arm_r43 = right_arm.addOrReplaceChild("right_arm_r43",
				CubeListBuilder.create().texOffs(7, 30).addBox(-0.382F, 0.2371F, -0.5538F, 1.0F, 5.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.3879F, 10.5068F, -3.3698F, 0.0F, -1.1781F, 0.0F));

		PartDefinition right_arm_r44 = right_arm.addOrReplaceChild("right_arm_r44",
				CubeListBuilder.create().texOffs(1, 2).addBox(-0.1469F, -5.5362F, -0.6585F, 1.0F, 4.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.6466F, 10.5068F, -2.5288F, 0.3655F, -0.7119F, -0.5299F));

		PartDefinition right_arm_r45 = right_arm.addOrReplaceChild("right_arm_r45",
				CubeListBuilder.create().texOffs(4, 19).addBox(-0.5736F, -1.7047F, -0.6585F, 1.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.6466F, 10.5068F, -2.5288F, 0.1298F, -0.7769F, -0.1841F));

		PartDefinition right_arm_r46 = right_arm.addOrReplaceChild("right_arm_r46",
				CubeListBuilder.create().texOffs(7, 30).addBox(-0.5387F, 0.2371F, -0.6585F, 1.0F, 5.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.6466F, 10.5068F, -2.5288F, 0.0F, -0.7854F, 0.0F));

		PartDefinition right_arm_r47 = right_arm.addOrReplaceChild("right_arm_r47",
				CubeListBuilder.create().texOffs(7, 30).addBox(-0.6434F, 0.2371F, -0.3152F, 1.0F, 5.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.2963F, 10.5068F, -1.732F, 0.0F, -0.3927F, 0.0F));

		PartDefinition right_arm_r48 = right_arm.addOrReplaceChild("right_arm_r48",
				CubeListBuilder.create().texOffs(1, 2).addBox(-0.2436F, -11.5763F, -0.3152F, 1.0F, 10.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.2963F, 10.5068F, -1.732F, 0.1572F, -0.3614F, -0.4215F));

		PartDefinition right_arm_r49 = right_arm.addOrReplaceChild("right_arm_r49",
				CubeListBuilder.create().texOffs(4, 19).addBox(-0.6774F, -1.7184F, -0.3152F, 1.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.2963F, 10.5068F, -1.732F, 0.054F, -0.3892F, -0.1415F));

		PartDefinition right_arm_r50 = right_arm.addOrReplaceChild("right_arm_r50",
				CubeListBuilder.create().texOffs(4, 19).addBox(-0.9957F, -0.9347F, -1.0F, 1.0F, 2.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.6064F, 9.6883F, 0.2147F, 0.0F, 0.0F, -0.1309F));

		PartDefinition right_arm_r51 = right_arm.addOrReplaceChild("right_arm_r51",
				CubeListBuilder.create().texOffs(1, 2).addBox(-0.4957F, -10.0653F, -1.0F, 1.0F, 7.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.017F, 11.7859F, 0.2147F, 0.0F, 0.0F, -0.3927F));

		PartDefinition sword = right_arm.addOrReplaceChild("sword", CubeListBuilder.create(),
				PartPose.offsetAndRotation(1.0885F, 31.3142F, -0.6127F, 0.0F, 0.0F, 0.0436F));

		PartDefinition right_arm_sword_r1 = sword.addOrReplaceChild("right_arm_sword_r1", CubeListBuilder.create()
				.texOffs(47, 53).addBox(-1.239F, -5.0561F, 10.9744F, 3.0F, 13.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(54, 13).addBox(-1.239F, -3.0561F, 10.2244F, 3.0F, 9.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(47, 53).addBox(-1.239F, -2.3061F, 11.2244F, 3.0F, 7.0F, 1.0F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(-1.1257F, -0.8693F, -18.6117F, 0.0F, 0.0F, -0.3491F));

		PartDefinition right_arm_sword_r2 = sword.addOrReplaceChild("right_arm_sword_r2", CubeListBuilder.create()
				.texOffs(4, 2).addBox(-0.9995F, -19.5028F, 1.7284F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.35F))
				.texOffs(4, 2).addBox(-0.9995F, -20.7528F, 1.9284F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.35F))
				.texOffs(4, 2).addBox(-0.9995F, -22.0028F, 2.5284F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.35F))
				.texOffs(4, 2).addBox(-0.9995F, -23.2528F, 2.7784F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.35F))
				.texOffs(4, 2).addBox(-0.9995F, -40.7528F, 6.6784F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.35F))
				.texOffs(4, 2).addBox(-0.9995F, -38.2528F, 6.1784F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.35F))
				.texOffs(4, 2).addBox(-0.9995F, -37.0028F, 5.9284F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.35F))
				.texOffs(4, 2).addBox(-0.9995F, -39.5028F, 6.4284F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.35F))
				.texOffs(4, 2).addBox(-0.9995F, -35.7528F, 6.1784F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.35F))
				.texOffs(4, 2).addBox(-0.9995F, -34.5028F, 6.4284F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.35F))
				.texOffs(4, 2).addBox(-0.9995F, -33.2528F, 5.6784F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.35F))
				.texOffs(4, 2).addBox(-0.9995F, -32.0028F, 5.9284F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.35F))
				.texOffs(4, 2).addBox(-0.9995F, -30.7528F, 6.1784F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.35F))
				.texOffs(4, 2).addBox(-0.9995F, -29.5028F, 5.4284F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.35F))
				.texOffs(4, 2).addBox(-0.9995F, -28.2528F, 5.1784F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.35F))
				.texOffs(4, 2).addBox(-0.9995F, -27.0028F, 4.1784F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.35F))
				.texOffs(4, 2).addBox(-0.9995F, -25.7528F, 3.4284F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.35F))
				.texOffs(4, 2).addBox(-0.9995F, -24.5028F, 3.1784F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.35F))
				.texOffs(4, 2).addBox(-0.9995F, -18.2528F, 1.4284F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.35F))
				.texOffs(4, 2).addBox(-0.9995F, -17.2528F, 1.6784F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.35F))
				.texOffs(4, 2).addBox(-0.9995F, -16.0028F, 1.9284F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.35F))
				.texOffs(4, 2).addBox(-0.9995F, -14.7528F, 2.1784F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.35F))
				.texOffs(4, 2).addBox(-0.9995F, -13.5028F, 2.1784F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.35F))
				.texOffs(4, 2).addBox(-0.9995F, -12.2528F, 1.9284F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.35F))
				.texOffs(4, 2).addBox(-0.9995F, -11.0028F, 1.9284F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.35F))
				.texOffs(4, 2).addBox(-0.9995F, -9.7528F, 1.6784F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.35F))
				.texOffs(4, 2).addBox(-0.9995F, -8.5028F, 1.6784F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.35F)),
				PartPose.offsetAndRotation(-0.1931F, -1.7805F, -53.229F, -1.4399F, 0.0F, -0.3491F));

		PartDefinition right_arm_sword_r3 = sword.addOrReplaceChild("right_arm_sword_r3", CubeListBuilder.create()
				.texOffs(4, 2).addBox(-0.9995F, -6.0028F, 0.7784F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.35F))
				.texOffs(4, 2).addBox(-0.9995F, -7.2528F, 1.5284F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.35F))
				.texOffs(4, 2).addBox(-0.9995F, -4.7528F, 0.4284F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.35F))
				.texOffs(4, 2).addBox(-0.9995F, -3.5028F, -1.0216F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.35F)),
				PartPose.offsetAndRotation(-0.1931F, -1.9805F, -60.429F, -1.4399F, 0.0F, -0.3491F));

		PartDefinition right_arm_sword_r4 = sword.addOrReplaceChild("right_arm_sword_r4", CubeListBuilder.create()
				.texOffs(4, 2).addBox(-0.9995F, -8.1028F, 2.1784F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.35F))
				.texOffs(4, 2).addBox(-0.9995F, -9.3528F, 2.1784F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.35F))
				.texOffs(4, 2).addBox(-0.9995F, -10.6028F, 2.4284F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.35F))
				.texOffs(4, 2).addBox(-0.9995F, -7.0028F, 1.9284F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.35F))
				.texOffs(4, 2).addBox(-0.9995F, -5.7528F, 1.6784F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.35F))
				.texOffs(4, 2).addBox(-0.9995F, -4.5028F, 1.6784F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.35F)),
				PartPose.offsetAndRotation(-0.1931F, -1.9805F, -56.429F, -1.4399F, 0.0F, -0.3491F));

		PartDefinition right_arm_sword_r5 = sword.addOrReplaceChild("right_arm_sword_r5",
				CubeListBuilder.create().texOffs(4, 2).addBox(-0.9995F, -1.0109F, -3.5189F, 1.0F, 2.0F, 7.0F,
						new CubeDeformation(-0.35F)),
				PartPose.offsetAndRotation(-0.1568F, -1.5885F, -59.3554F, -1.0472F, 0.0F, -0.3491F));

		PartDefinition right_arm_sword_r6 = sword.addOrReplaceChild("right_arm_sword_r6",
				CubeListBuilder.create().texOffs(16, 24).addBox(-0.9995F, -2.0179F, -7.5125F, 1.0F, 2.0F, 5.0F,
						new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(0.6076F, 0.2193F, -55.6979F, -0.6109F, 0.0F, -0.3491F));

		PartDefinition right_arm_sword_r7 = sword.addOrReplaceChild("right_arm_sword_r7",
				CubeListBuilder.create().texOffs(16, 24).addBox(-0.9995F, -2.0211F, -4.5056F, 1.0F, 2.0F, 8.0F,
						new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(0.2445F, -0.7783F, -55.7091F, -0.2618F, 0.0F, -0.3491F));

		PartDefinition right_arm_sword_r8 = sword.addOrReplaceChild("right_arm_sword_r8",
				CubeListBuilder.create().texOffs(16, 24).addBox(-0.9995F, -2.0218F, -10.5F, 1.0F, 2.0F, 14.0F,
						new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(0.5041F, 0.135F, -42.7435F, 0.0F, 0.0F, -0.3491F));

		PartDefinition right_arm_sword_r9 = sword.addOrReplaceChild("right_arm_sword_r9",
				CubeListBuilder.create().texOffs(16, 24).addBox(-0.9995F, -2.0211F, -3.4944F, 1.0F, 2.0F, 7.0F,
						new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(0.2445F, -0.5783F, -36.9779F, 0.2618F, 0.0F, -0.3491F));

		PartDefinition right_arm_sword_r10 = sword.addOrReplaceChild("right_arm_sword_r10",
				CubeListBuilder.create().texOffs(16, 24).addBox(-0.9995F, -2.0216F, -3.5028F, 1.0F, 3.0F, 7.0F,
						new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(0.1207F, -0.9185F, -31.4546F, -0.1309F, 0.0F, -0.3491F));

		PartDefinition right_arm_sword_r11 = sword.addOrReplaceChild("right_arm_sword_r11",
				CubeListBuilder.create().texOffs(16, 24).addBox(-0.9995F, -2.0201F, -3.5083F, 1.0F, 4.0F, 7.0F,
						new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(0.6355F, 0.4959F, -25.8374F, -0.3927F, 0.0F, -0.3491F));

		PartDefinition right_arm_sword_r12 = sword.addOrReplaceChild("right_arm_sword_r12",
				CubeListBuilder.create().texOffs(16, 24).addBox(-0.9995F, -2.0218F, -2.5F, 1.0F, 4.0F, 5.0F,
						new CubeDeformation(-0.225F)),
				PartPose.offsetAndRotation(0.4592F, -0.0614F, -9.5968F, 0.0F, 0.0F, -0.3491F));

		PartDefinition right_arm_sword_r13 = sword.addOrReplaceChild("right_arm_sword_r13",
				CubeListBuilder.create().texOffs(16, 24).addBox(-0.9995F, -2.0189F, -3.5109F, 1.0F, 4.0F, 5.0F,
						new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(0.3225F, -0.437F, -12.0885F, -0.5236F, 0.0F, -0.3491F));

		PartDefinition right_arm_sword_r14 = sword.addOrReplaceChild("right_arm_sword_r14",
				CubeListBuilder.create().texOffs(16, 24).addBox(-0.9995F, -1.5154F, -3.4846F, 1.0F, 4.0F, 7.0F,
						new CubeDeformation(-0.225F)),
				PartPose.offsetAndRotation(0.2873F, -0.4605F, -22.8515F, 0.7854F, 0.0F, -0.3491F));

		PartDefinition right_arm_sword_r15 = sword.addOrReplaceChild("right_arm_sword_r15",
				CubeListBuilder.create().texOffs(16, 24).addBox(-0.239F, -1.3703F, 6.0744F, 1.0F, 5.0F, 8.0F,
						new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(-1.1257F, -2.1193F, -27.8617F, 0.0F, 0.0F, -0.3491F));

		PartDefinition right_arm_sword_r16 = sword.addOrReplaceChild("right_arm_sword_r16",
				CubeListBuilder.create().texOffs(54, 13).addBox(-0.9995F, -0.0215F, -0.5038F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0265F, -2.948F, 10.0802F, -0.1745F, 0.0F, -0.3491F));

		PartDefinition right_arm_sword_r17 = sword.addOrReplaceChild("right_arm_sword_r17",
				CubeListBuilder.create().texOffs(54, 13).addBox(-0.9995F, 6.9785F, 0.7538F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.4477F, -4.1053F, 7.46F, 0.1745F, 0.0F, -0.3491F));

		PartDefinition right_arm_sword_r18 = sword.addOrReplaceChild("right_arm_sword_r18",
				CubeListBuilder.create().texOffs(54, 13).addBox(-0.9995F, -1.5215F, 1.9962F, 1.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3329F, -1.0424F, 7.1841F, -0.1745F, 0.0F, -0.3491F));

		PartDefinition right_arm_sword_r19 = sword.addOrReplaceChild("right_arm_sword_r19",
				CubeListBuilder.create().texOffs(54, 13).addBox(-0.9995F, 5.9785F, 0.7538F, 1.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.1214F, -5.9562F, 7.1127F, 0.1745F, 0.0F, -0.3491F));

		PartDefinition right_arm_sword_r20 = sword.addOrReplaceChild("right_arm_sword_r20",
				CubeListBuilder.create().texOffs(54, 13).addBox(-0.9995F, 6.9785F, 0.7538F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.4477F, -4.1053F, 5.96F, 0.1745F, 0.0F, -0.3491F));

		PartDefinition right_arm_sword_r21 = sword.addOrReplaceChild("right_arm_sword_r21",
				CubeListBuilder.create().texOffs(54, 13).addBox(-0.9995F, -1.0215F, -0.5038F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0265F, -2.948F, 8.5802F, -0.1745F, 0.0F, -0.3491F));

		PartDefinition right_arm_sword_r22 = sword.addOrReplaceChild("right_arm_sword_r22",
				CubeListBuilder.create().texOffs(54, 13).addBox(-0.9995F, 5.9785F, 0.7538F, 1.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.1214F, -5.9562F, 5.6127F, 0.1745F, 0.0F, -0.3491F));

		PartDefinition right_arm_sword_r23 = sword.addOrReplaceChild("right_arm_sword_r23",
				CubeListBuilder.create().texOffs(54, 13).addBox(-0.9995F, -1.5215F, 1.9962F, 1.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3329F, -1.0424F, 5.6841F, -0.1745F, 0.0F, -0.3491F));

		PartDefinition right_arm_sword_r24 = sword.addOrReplaceChild("right_arm_sword_r24",
				CubeListBuilder.create().texOffs(54, 13).addBox(-0.9995F, 6.9785F, -5.2462F, 1.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.1214F, -6.0562F, -6.3873F, 0.1745F, 0.0F, -0.3491F));

		PartDefinition right_arm_sword_r25 = sword.addOrReplaceChild("right_arm_sword_r25",
				CubeListBuilder.create().texOffs(54, 13).addBox(-0.9995F, -0.5215F, -4.0038F, 1.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2714F, -1.0562F, -6.3873F, -0.1745F, 0.0F, -0.3491F));

		PartDefinition right_arm_sword_r26 = sword.addOrReplaceChild("right_arm_sword_r26",
				CubeListBuilder.create().texOffs(54, 13).addBox(-0.9995F, -2.5184F, -1.0117F, 1.0F, 1.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.1678F, -3.7715F, -9.7144F, -0.5672F, 0.0F, -0.3491F));

		PartDefinition right_arm_sword_r27 = sword.addOrReplaceChild("right_arm_sword_r27",
				CubeListBuilder.create().texOffs(54, 13).addBox(-0.9995F, 1.2316F, -1.9883F, 1.0F, 1.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.2674F, 3.669F, -8.3323F, 0.5672F, 0.0F, -0.3491F));

		PartDefinition right_arm_sword_r28 = sword.addOrReplaceChild("right_arm_sword_r28",
				CubeListBuilder.create().texOffs(54, 13).addBox(-0.9995F, 7.4785F, -4.9962F, 1.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2714F, -3.3062F, -9.3873F, 0.1745F, 0.0F, -0.3491F));

		PartDefinition right_arm_sword_r29 = sword.addOrReplaceChild("right_arm_sword_r29",
				CubeListBuilder.create().texOffs(54, 13).addBox(-0.9995F, -0.5215F, -4.0038F, 1.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2714F, -4.0562F, -9.3873F, -0.1745F, 0.0F, -0.3491F));

		PartDefinition right_arm_sword_r30 = sword.addOrReplaceChild("right_arm_sword_r30", CubeListBuilder.create()
				.texOffs(41, 26).addBox(-0.239F, 0.2439F, 12.2244F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.18F))
				.texOffs(41, 26).addBox(-0.239F, 0.2439F, 26.2244F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.18F))
				.texOffs(47, 53).addBox(-0.239F, 0.6939F, 11.2244F, 1.0F, 1.0F, 16.0F, new CubeDeformation(0.15F)),
				PartPose.offsetAndRotation(-1.1257F, -0.7693F, -18.6117F, 0.0F, 0.0F, -0.3491F));

		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(1, 2)
				.mirror().addBox(-1.0F, -1.0847F, -2.2853F, 7.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(47, 53).mirror().addBox(-1.1F, 2.9153F, -2.7853F, 8.0F, 2.0F, 7.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(47, 53).mirror()
				.addBox(1.0F, 4.9153F, -1.2853F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(7, 30).mirror()
				.addBox(6.4631F, 10.7439F, -0.7853F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(12.5F, -38.9153F, 0.2853F, 0.0F, 0.0F, -0.1745F));

		PartDefinition left_arm_r1 = left_arm.addOrReplaceChild("left_arm_r1",
				CubeListBuilder.create().texOffs(1, 2).mirror()
						.addBox(1.2127F, 2.1641F, 3.5163F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(2, 24).mirror()
						.addBox(1.2127F, 2.1641F, -4.7337F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.5035F, 16.3219F, -0.2663F, 0.0F, 0.0F, 0.5236F));

		PartDefinition left_arm_r2 = left_arm.addOrReplaceChild("left_arm_r2", CubeListBuilder.create().texOffs(40, 2)
				.mirror().addBox(-0.7606F, 0.9931F, 2.7663F, 3.0F, 10.0F, 1.0F, new CubeDeformation(0.25F))
				.mirror(false).texOffs(40, 20).mirror()
				.addBox(-0.7606F, 0.9931F, -3.9837F, 3.0F, 10.0F, 1.0F, new CubeDeformation(0.25F)).mirror(false)
				.texOffs(47, 53).mirror()
				.addBox(-1.2606F, 13.4931F, -2.7337F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false)
				.texOffs(47, 53).mirror()
				.addBox(0.4894F, 13.7431F, -2.2337F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(47, 53).mirror()
				.addBox(-2.5106F, 11.2431F, -2.2337F, 4.0F, 3.0F, 4.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(3, 16).mirror()
				.addBox(2.2394F, 1.2431F, -3.2337F, 1.0F, 10.0F, 6.0F, new CubeDeformation(0.25F)).mirror(false)
				.texOffs(29, 31).mirror()
				.addBox(2.9894F, 9.4069F, -0.5535F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(3, 22).mirror()
				.addBox(2.9894F, 0.2431F, -3.2337F, 1.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(27, 20).mirror()
				.addBox(-3.0106F, 8.2431F, -3.2337F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(27, 20).mirror()
				.addBox(-3.0106F, 2.2431F, -3.2337F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(47, 53).mirror()
				.addBox(-2.5106F, 0.2431F, -2.2337F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.5035F, 16.3219F, -0.2663F, 0.0F, 0.0F, 0.1309F));

		PartDefinition left_arm_r3 = left_arm.addOrReplaceChild("left_arm_r3",
				CubeListBuilder.create().texOffs(13, 20).mirror()
						.addBox(-0.4881F, -5.775F, -0.4586F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(2.7358F, -1.069F, 1.2147F, -0.3927F, 0.0F, 0.3927F));

		PartDefinition left_arm_r4 = left_arm.addOrReplaceChild("left_arm_r4",
				CubeListBuilder.create().texOffs(13, 20).mirror()
						.addBox(-1.9881F, -3.0169F, -0.4953F, 2.0F, 7.0F, 1.0F, new CubeDeformation(-0.05F))
						.mirror(false),
				PartPose.offsetAndRotation(2.7358F, -1.069F, 1.2147F, -0.0436F, 0.0F, 0.3927F));

		PartDefinition left_arm_r5 = left_arm.addOrReplaceChild("left_arm_r5",
				CubeListBuilder.create().texOffs(1, 2).mirror()
						.addBox(-0.7381F, -0.6519F, 0.5457F, 2.0F, 8.0F, 1.0F, new CubeDeformation(-0.15F))
						.mirror(false),
				PartPose.offsetAndRotation(5.4924F, -2.4978F, 1.2147F, -0.4363F, 0.0F, 0.3927F));

		PartDefinition left_arm_r6 = left_arm.addOrReplaceChild("left_arm_r6",
				CubeListBuilder.create().texOffs(1, 2).mirror()
						.addBox(0.2619F, -1.4F, -0.5414F, 2.0F, 7.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false),
				PartPose.offsetAndRotation(5.4924F, -2.4978F, 1.2147F, 0.3927F, 0.0F, 0.3927F));

		PartDefinition left_arm_r7 = left_arm.addOrReplaceChild("left_arm_r7",
				CubeListBuilder.create().texOffs(1, 2).mirror()
						.addBox(2.0119F, -3.6614F, -0.5621F, 2.0F, 7.0F, 1.0F, new CubeDeformation(-0.05F))
						.mirror(false),
				PartPose.offsetAndRotation(5.4924F, -2.4978F, 1.2147F, 0.6109F, 0.0F, 0.3927F));

		PartDefinition left_arm_r8 = left_arm.addOrReplaceChild("left_arm_r8",
				CubeListBuilder.create().texOffs(1, 2).mirror()
						.addBox(3.5119F, -6.3918F, -0.5F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(5.4924F, -2.4978F, 1.2147F, 0.0F, 0.0F, 0.3927F));

		PartDefinition left_arm_r9 = left_arm.addOrReplaceChild("left_arm_r9",
				CubeListBuilder.create().texOffs(47, 53).mirror()
						.addBox(13.1411F, -1.7016F, 7.3752F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.5035F, 16.3219F, -0.2663F, 1.7762F, -0.0741F, 2.3049F));

		PartDefinition left_arm_r10 = left_arm.addOrReplaceChild("left_arm_r10",
				CubeListBuilder.create().texOffs(47, 53).mirror()
						.addBox(11.2172F, -12.4232F, -2.2016F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.05F))
						.mirror(false),
				PartPose.offsetAndRotation(3.5035F, 16.3219F, -0.2663F, 0.1848F, -0.1166F, 2.5199F));

		PartDefinition left_arm_r11 = left_arm.addOrReplaceChild("left_arm_r11",
				CubeListBuilder.create().texOffs(47, 53).mirror()
						.addBox(-16.4562F, 0.7342F, -2.2337F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.05F))
						.mirror(false).texOffs(47, 53).mirror()
						.addBox(-16.4562F, 0.7342F, -1.2337F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.05F))
						.mirror(false).texOffs(47, 53).mirror()
						.addBox(-16.4562F, 0.7342F, -0.2337F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.05F))
						.mirror(false).texOffs(47, 53).mirror()
						.addBox(-16.4562F, 0.7342F, 0.7663F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.05F))
						.mirror(false),
				PartPose.offsetAndRotation(3.5035F, 16.3219F, -0.2663F, 0.0F, 0.0F, -1.309F));

		PartDefinition left_arm_r12 = left_arm.addOrReplaceChild("left_arm_r12",
				CubeListBuilder.create().texOffs(47, 53).mirror()
						.addBox(16.524F, 3.1536F, -2.2337F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(47, 53).mirror()
						.addBox(16.524F, 3.1536F, -1.2337F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.05F)).mirror(false)
						.texOffs(47, 53).mirror()
						.addBox(16.524F, 3.1536F, -0.2337F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(47, 53).mirror()
						.addBox(16.524F, 3.1536F, 0.7663F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.05F)).mirror(false),
				PartPose.offsetAndRotation(3.5035F, 16.3219F, -0.2663F, 0.0F, 0.0F, 1.4399F));

		PartDefinition left_arm_r13 = left_arm.addOrReplaceChild("left_arm_r13",
				CubeListBuilder.create().texOffs(47, 53).mirror()
						.addBox(4.606F, -17.4119F, -2.2337F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.05F))
						.mirror(false).texOffs(47, 53).mirror()
						.addBox(4.606F, -17.4119F, -1.2337F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.05F))
						.mirror(false).texOffs(47, 53).mirror()
						.addBox(4.606F, -17.4119F, -0.2337F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.05F))
						.mirror(false).texOffs(47, 53).mirror()
						.addBox(4.606F, -17.4119F, 0.7663F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.05F))
						.mirror(false),
				PartPose.offsetAndRotation(3.5035F, 16.3219F, -0.2663F, 0.0F, 0.0F, 3.0107F));

		PartDefinition left_arm_r14 = left_arm.addOrReplaceChild("left_arm_r14",
				CubeListBuilder.create().texOffs(29, 31).mirror()
						.addBox(2.9894F, 4.2597F, 7.9168F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.5035F, 16.3219F, -0.2663F, -1.1345F, 0.0F, 0.1309F));

		PartDefinition left_arm_r15 = left_arm.addOrReplaceChild("left_arm_r15",
				CubeListBuilder.create().texOffs(29, 31).mirror()
						.addBox(2.9894F, 8.5021F, 6.3838F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.5035F, 16.3219F, -0.2663F, -0.7418F, 0.0F, 0.1309F));

		PartDefinition left_arm_r16 = left_arm.addOrReplaceChild("left_arm_r16",
				CubeListBuilder.create().texOffs(29, 31).mirror()
						.addBox(2.9894F, 9.4069F, -0.9139F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.5035F, 16.3219F, -0.2663F, 0.0F, 0.0F, 0.1309F));

		PartDefinition left_arm_r17 = left_arm.addOrReplaceChild("left_arm_r17",
				CubeListBuilder.create().texOffs(29, 31).mirror()
						.addBox(2.9894F, 8.1863F, -8.7284F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.5035F, 16.3219F, -0.2663F, 0.7418F, 0.0F, 0.1309F));

		PartDefinition left_arm_r18 = left_arm.addOrReplaceChild("left_arm_r18",
				CubeListBuilder.create().texOffs(29, 31).mirror()
						.addBox(2.9894F, 3.836F, -10.1143F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.5035F, 16.3219F, -0.2663F, 1.1345F, 0.0F, 0.1309F));

		PartDefinition left_arm_r19 = left_arm.addOrReplaceChild("left_arm_r19",
				CubeListBuilder.create().texOffs(1, 2).mirror()
						.addBox(-7.8028F, 0.0209F, -2.9924F, 7.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(7, 30).mirror()
						.addBox(-0.8028F, 0.0209F, -1.9924F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.3785F, 10.723F, -3.6652F, 0.0F, 1.5708F, 0.0F));

		PartDefinition left_arm_r20 = left_arm.addOrReplaceChild("left_arm_r20",
				CubeListBuilder.create().texOffs(4, 19).mirror()
						.addBox(-1.2443F, -1.8151F, -1.3116F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(7.2717F, 10.723F, 3.1614F, -0.054F, -0.3892F, 0.1415F));

		PartDefinition left_arm_r21 = left_arm.addOrReplaceChild("left_arm_r21",
				CubeListBuilder.create().texOffs(1, 2).mirror()
						.addBox(-1.6717F, -11.4312F, -1.3116F, 1.0F, 10.0F, 2.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(7.2717F, 10.723F, 3.1614F, -0.1572F, -0.3614F, 0.4215F));

		PartDefinition left_arm_r22 = left_arm.addOrReplaceChild("left_arm_r22",
				CubeListBuilder.create().texOffs(7, 30).mirror()
						.addBox(-1.2578F, 0.0209F, -1.3116F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(7.2717F, 10.723F, 3.1614F, 0.0F, -0.3927F, 0.0F));

		PartDefinition left_arm_r23 = left_arm.addOrReplaceChild("left_arm_r23",
				CubeListBuilder.create().texOffs(7, 30).mirror()
						.addBox(-1.151F, 0.0209F, -0.6518F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(6.622F, 10.723F, 3.9582F, 0.0F, -0.7854F, 0.0F));

		PartDefinition left_arm_r24 = left_arm.addOrReplaceChild("left_arm_r24",
				CubeListBuilder.create().texOffs(4, 19).mirror()
						.addBox(-1.1384F, -1.8291F, -0.6518F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(6.622F, 10.723F, 3.9582F, -0.1298F, -0.7769F, 0.1841F));

		PartDefinition left_arm_r25 = left_arm.addOrReplaceChild("left_arm_r25",
				CubeListBuilder.create().texOffs(1, 2).mirror()
						.addBox(-1.573F, -5.4721F, -0.6518F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(6.622F, 10.723F, 3.9582F, -0.3655F, -0.7119F, 0.5299F));

		PartDefinition left_arm_r26 = left_arm.addOrReplaceChild("left_arm_r26",
				CubeListBuilder.create().texOffs(7, 30).mirror()
						.addBox(-0.9913F, 0.0209F, -0.5451F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(5.3632F, 10.723F, 4.7992F, 0.0F, -1.1781F, 0.0F));

		PartDefinition left_arm_r27 = left_arm.addOrReplaceChild("left_arm_r27",
				CubeListBuilder.create().texOffs(4, 19).mirror()
						.addBox(-0.9801F, -1.8499F, -0.5451F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(5.3632F, 10.723F, 4.7992F, -0.3053F, -1.1579F, 0.3313F));

		PartDefinition left_arm_r28 = left_arm.addOrReplaceChild("left_arm_r28",
				CubeListBuilder.create().texOffs(1, 2).mirror()
						.addBox(-1.4255F, -9.5332F, -0.5451F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(5.3632F, 10.723F, 4.7992F, -0.7459F, -1.0228F, 0.8249F));

		PartDefinition left_arm_r29 = left_arm.addOrReplaceChild("left_arm_r29",
				CubeListBuilder.create().texOffs(7, 30).mirror()
						.addBox(-0.8028F, 0.0209F, -1.0076F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.3785F, 10.723F, 5.0946F, 0.0F, -1.5708F, 0.0F));

		PartDefinition left_arm_r30 = left_arm.addOrReplaceChild("left_arm_r30",
				CubeListBuilder.create().texOffs(4, 19).mirror()
						.addBox(-0.7932F, -1.8745F, -1.0076F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(3.3785F, 10.723F, 5.0946F, -1.5708F, -1.4399F, 1.5708F));

		PartDefinition left_arm_r31 = left_arm.addOrReplaceChild("left_arm_r31",
				CubeListBuilder.create().texOffs(1, 2).mirror()
						.addBox(-1.2514F, -6.6053F, -1.0076F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(3.3785F, 10.723F, 5.0946F, -1.5708F, -1.1781F, 1.5708F));

		PartDefinition left_arm_r32 = left_arm.addOrReplaceChild("left_arm_r32",
				CubeListBuilder.create().texOffs(7, 30).addBox(-0.3856F, 0.0209F, -1.4549F, 1.0F, 5.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.3937F, 10.723F, 4.7992F, 0.0F, 1.1781F, 0.0F));

		PartDefinition left_arm_r33 = left_arm.addOrReplaceChild("left_arm_r33",
				CubeListBuilder.create().texOffs(4, 19).addBox(-0.3936F, -1.8991F, -1.4549F, 1.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.3937F, 10.723F, 4.7992F, -0.3053F, 1.1579F, -0.3313F));

		PartDefinition left_arm_r34 = left_arm.addOrReplaceChild("left_arm_r34",
				CubeListBuilder.create().texOffs(1, 2).addBox(0.0773F, -4.6774F, -1.4549F, 1.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.3937F, 10.723F, 4.7992F, -0.7459F, 1.0228F, -0.8249F));

		PartDefinition left_arm_r35 = left_arm.addOrReplaceChild("left_arm_r35",
				CubeListBuilder.create().texOffs(1, 2).addBox(0.0773F, -4.6774F, -0.5451F, 1.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.3937F, 10.723F, -3.3698F, 0.7459F, -1.0228F, -0.8249F));

		PartDefinition left_arm_r36 = left_arm.addOrReplaceChild("left_arm_r36",
				CubeListBuilder.create().texOffs(4, 19).addBox(-0.3936F, -1.8991F, -0.5451F, 1.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.3937F, 10.723F, -3.3698F, 0.3053F, -1.1579F, -0.3313F));

		PartDefinition left_arm_r37 = left_arm.addOrReplaceChild("left_arm_r37",
				CubeListBuilder.create().texOffs(7, 30).addBox(-0.3856F, 0.0209F, -0.5451F, 1.0F, 5.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.3937F, 10.723F, -3.3698F, 0.0F, -1.1781F, 0.0F));

		PartDefinition left_arm_r38 = left_arm.addOrReplaceChild("left_arm_r38",
				CubeListBuilder.create().texOffs(1, 2).mirror()
						.addBox(-1.2514F, -6.6053F, -1.9924F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(3.3785F, 10.723F, -3.6652F, 1.5708F, 1.1781F, 1.5708F));

		PartDefinition left_arm_r39 = left_arm.addOrReplaceChild("left_arm_r39",
				CubeListBuilder.create().texOffs(4, 19).mirror()
						.addBox(-0.7932F, -1.8745F, -1.9924F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(3.3785F, 10.723F, -3.6652F, 1.5708F, 1.4399F, 1.5708F));

		PartDefinition left_arm_r40 = left_arm.addOrReplaceChild("left_arm_r40",
				CubeListBuilder.create().texOffs(1, 2).mirror()
						.addBox(-1.4255F, -9.5332F, -1.4549F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(5.3632F, 10.723F, -3.3698F, 0.7459F, 1.0228F, 0.8249F));

		PartDefinition left_arm_r41 = left_arm.addOrReplaceChild("left_arm_r41",
				CubeListBuilder.create().texOffs(4, 19).mirror()
						.addBox(-0.9801F, -1.8499F, -1.4549F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(5.3632F, 10.723F, -3.3698F, 0.3053F, 1.1579F, 0.3313F));

		PartDefinition left_arm_r42 = left_arm.addOrReplaceChild("left_arm_r42",
				CubeListBuilder.create().texOffs(7, 30).mirror()
						.addBox(-0.9913F, 0.0209F, -1.4549F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(5.3632F, 10.723F, -3.3698F, 0.0F, 1.1781F, 0.0F));

		PartDefinition left_arm_r43 = left_arm.addOrReplaceChild("left_arm_r43",
				CubeListBuilder.create().texOffs(1, 2).mirror()
						.addBox(-1.573F, -5.4721F, -1.3482F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(6.622F, 10.723F, -2.5288F, 0.3655F, 0.7119F, 0.5299F));

		PartDefinition left_arm_r44 = left_arm.addOrReplaceChild("left_arm_r44",
				CubeListBuilder.create().texOffs(4, 19).mirror()
						.addBox(-1.1384F, -1.8291F, -1.3482F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(6.622F, 10.723F, -2.5288F, 0.1298F, 0.7769F, 0.1841F));

		PartDefinition left_arm_r45 = left_arm.addOrReplaceChild("left_arm_r45",
				CubeListBuilder.create().texOffs(7, 30).mirror()
						.addBox(-1.151F, 0.0209F, -1.3482F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(6.622F, 10.723F, -2.5288F, 0.0F, 0.7854F, 0.0F));

		PartDefinition left_arm_r46 = left_arm.addOrReplaceChild("left_arm_r46",
				CubeListBuilder.create().texOffs(7, 30).mirror()
						.addBox(-1.2578F, 0.0209F, -0.6884F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(7.2717F, 10.723F, -1.732F, 0.0F, 0.3927F, 0.0F));

		PartDefinition left_arm_r47 = left_arm.addOrReplaceChild("left_arm_r47",
				CubeListBuilder.create().texOffs(1, 2).mirror()
						.addBox(-1.6717F, -11.4312F, -0.6884F, 1.0F, 10.0F, 2.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(7.2717F, 10.723F, -1.732F, 0.1572F, 0.3614F, 0.4215F));

		PartDefinition left_arm_r48 = left_arm.addOrReplaceChild("left_arm_r48",
				CubeListBuilder.create().texOffs(4, 19).mirror()
						.addBox(-1.2443F, -1.8151F, -0.6884F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(7.2717F, 10.723F, -1.732F, 0.054F, 0.3892F, 0.1415F));

		PartDefinition left_arm_r49 = left_arm.addOrReplaceChild("left_arm_r49",
				CubeListBuilder.create().texOffs(4, 19).mirror()
						.addBox(-0.9995F, -1.0218F, -1.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(7.5818F, 9.9045F, 0.2147F, 0.0F, 0.0F, 0.1309F));

		PartDefinition left_arm_r50 = left_arm.addOrReplaceChild("left_arm_r50",
				CubeListBuilder.create().texOffs(1, 2).mirror()
						.addBox(-1.4881F, -9.8918F, -1.0F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(6.9924F, 12.0022F, 0.2147F, 0.0F, 0.0F, 0.3927F));

		PartDefinition shield = left_arm.addOrReplaceChild("shield", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.7908F, 31.4447F, -0.511F, 0.0F, 0.0F, 0.1309F));

		PartDefinition left_arm_shield_r1 = shield.addOrReplaceChild("left_arm_shield_r1",
				CubeListBuilder.create().texOffs(3, 17).addBox(4.5052F, 15.9133F, 27.9076F, 2.0F, 4.0F, 11.0F,
						new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(3.2121F, -17.4251F, 0.2447F, -1.2217F, 0.0F, 0.1309F));

		PartDefinition left_arm_shield_r2 = shield.addOrReplaceChild("left_arm_shield_r2",
				CubeListBuilder.create().texOffs(3, 16).addBox(5.5052F, 9.401F, 19.5561F, 1.0F, 4.0F, 12.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.2121F, -17.4251F, 0.2447F, -1.4399F, 0.0F, 0.1309F));

		PartDefinition left_arm_shield_r3 = shield.addOrReplaceChild("left_arm_shield_r3",
				CubeListBuilder.create().texOffs(4, 23).addBox(5.5052F, 5.8545F, -7.9504F, 1.0F, 3.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.2121F, -17.4251F, 0.2447F, -0.3927F, 0.0F, 0.1309F));

		PartDefinition left_arm_shield_r4 = shield.addOrReplaceChild("left_arm_shield_r4",
				CubeListBuilder.create().texOffs(4, 23).addBox(4.5052F, 5.7616F, -1.4821F, 2.0F, 4.0F, 5.0F,
						new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(3.2121F, -17.4251F, 0.2447F, -1.1781F, 0.0F, 0.1309F));

		PartDefinition left_arm_shield_r5 = shield.addOrReplaceChild("left_arm_shield_r5",
				CubeListBuilder.create().texOffs(3, 12).addBox(5.5052F, 5.6756F, 4.5186F, 1.0F, 3.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.2121F, -17.4251F, 0.2447F, 0.3927F, 0.0F, 0.1309F));

		PartDefinition left_arm_shield_r6 = shield.addOrReplaceChild("left_arm_shield_r6",
				CubeListBuilder.create().texOffs(3, 17).addBox(4.5052F, 15.474F, -39.0675F, 2.0F, 4.0F, 11.0F,
						new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(3.2121F, -17.4251F, 0.2447F, 1.2217F, 0.0F, 0.1309F));

		PartDefinition left_arm_shield_r7 = shield.addOrReplaceChild("left_arm_shield_r7",
				CubeListBuilder.create().texOffs(3, 16).addBox(5.5052F, 8.9375F, -31.6171F, 1.0F, 4.0F, 12.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.2121F, -17.4251F, 0.2447F, 1.4399F, 0.0F, 0.1309F));

		PartDefinition left_arm_shield_r8 = shield.addOrReplaceChild("left_arm_shield_r8",
				CubeListBuilder.create().texOffs(4, 23).addBox(4.5052F, 5.3297F, -3.6968F, 2.0F, 4.0F, 5.0F,
						new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(3.2121F, -17.4251F, 0.2447F, 1.1781F, 0.0F, 0.1309F));

		PartDefinition left_arm_shield_r9 = shield.addOrReplaceChild("left_arm_shield_r9", CubeListBuilder.create()
				.texOffs(3, 13).addBox(5.5052F, 5.138F, 6.2663F, 1.0F, 16.0F, 4.0F, new CubeDeformation(0.1F))
				.texOffs(3, 13).addBox(5.5052F, 5.138F, -10.7337F, 1.0F, 16.0F, 4.0F, new CubeDeformation(0.1F))
				.texOffs(3, 15).addBox(4.5052F, 35.5529F, -5.4312F, 2.0F, 7.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(47, 53).addBox(5.5052F, 24.738F, -7.7337F, 1.0F, 12.0F, 15.0F, new CubeDeformation(-0.1F))
				.texOffs(47, 53).addBox(5.5052F, 14.938F, -7.7337F, 1.0F, 10.0F, 15.0F, new CubeDeformation(-0.1F))
				.texOffs(47, 53).addBox(5.5052F, 5.138F, -7.7337F, 1.0F, 10.0F, 15.0F, new CubeDeformation(-0.1F))
				.texOffs(4, 16).addBox(4.5052F, 1.138F, -5.7337F, 2.0F, 5.0F, 11.0F, new CubeDeformation(0.0F))
				.texOffs(1, 2).addBox(4.5052F, 16.138F, -3.7337F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.35F))
				.texOffs(1, 2).addBox(1.5052F, 17.138F, -3.7337F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.1F))
				.texOffs(1, 2).addBox(-1.4948F, 17.138F, -3.7337F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.2121F, -17.4251F, 0.2447F, 0.0F, 0.0F, 0.1309F));

		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(),
				PartPose.offset(-2.5F, -19.0F, 1.0F));

		PartDefinition right_leg_dont_select_this = right_leg.addOrReplaceChild("right_leg_dont_select_this",
				CubeListBuilder.create().texOffs(7, 24)
						.addBox(-8.4619F, -6.8087F, -3.0F, 7.0F, 3.0F, 5.0F, new CubeDeformation(-0.1F)).texOffs(6, 20)
						.addBox(-8.9619F, -16.8087F, -5.0F, 8.0F, 11.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.5F, 20.0F, 1.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition right_leg_r1 = right_leg_dont_select_this.addOrReplaceChild("right_leg_r1",
				CubeListBuilder.create().texOffs(2, 1).addBox(-3.3056F, -6.8384F, -2.0381F, 5.0F, 8.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9634F, -12.2946F, -3.5F, -1.5708F, -1.1781F, 1.5708F));

		PartDefinition right_leg_r2 = right_leg_dont_select_this.addOrReplaceChild("right_leg_r2",
				CubeListBuilder.create().texOffs(4, 31)
						.addBox(-3.5F, 0.125F, 3.075F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.1F)).texOffs(4, 31)
						.addBox(-3.5F, -2.125F, 2.075F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.1F)).texOffs(36, 29)
						.addBox(-3.0F, -2.125F, -2.425F, 5.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(47, 49)
						.addBox(-3.0F, -0.125F, -8.075F, 5.0F, 3.0F, 8.0F, new CubeDeformation(0.1F)).texOffs(47, 53)
						.addBox(-3.0F, -4.125F, 0.575F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5369F, 20.5277F, -3.575F, 0.0F, 0.0F, -0.3927F));

		PartDefinition right_leg_r3 = right_leg_dont_select_this.addOrReplaceChild("right_leg_r3",
				CubeListBuilder.create().texOffs(3, 29).addBox(-3.0F, -3.033F, -7.1947F, 5.0F, 2.0F, 9.0F,
						new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(2.5369F, 20.5277F, -3.575F, 0.3927F, 0.0F, -0.3927F));

		PartDefinition right_leg_r4 = right_leg_dont_select_this.addOrReplaceChild("right_leg_r4",
				CubeListBuilder.create().texOffs(47, 53).mirror()
						.addBox(-5.4103F, -1.2325F, -3.8899F, 4.0F, 3.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(-3.0F, -4.0F, 0.0F, 0.0F, 0.0F, -1.4399F));

		PartDefinition right_leg_r5 = right_leg_dont_select_this.addOrReplaceChild("right_leg_r5",
				CubeListBuilder.create().texOffs(47, 53).mirror()
						.addBox(-4.6265F, 2.1726F, -3.8899F, 4.0F, 5.0F, 7.0F, new CubeDeformation(-0.1F))
						.mirror(false),
				PartPose.offsetAndRotation(-3.0F, -4.0F, 0.0F, 0.0F, 0.0F, -1.0472F));

		PartDefinition right_leg_r6 = right_leg_dont_select_this.addOrReplaceChild("right_leg_r6",
				CubeListBuilder.create().texOffs(3, 26).mirror()
						.addBox(3.2037F, 14.0434F, -3.8899F, 4.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition right_leg_r7 = right_leg_dont_select_this.addOrReplaceChild("right_leg_r7",
				CubeListBuilder.create().texOffs(5, 15).mirror()
						.addBox(1.309F, 4.8635F, -3.8899F, 4.0F, 10.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.0F, -4.0F, 0.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition right_leg_r8 = right_leg_dont_select_this.addOrReplaceChild("right_leg_r8",
				CubeListBuilder.create().texOffs(47, 53).addBox(-0.1172F, 2.4551F, -3.8899F, 4.0F, 3.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.9163F));

		PartDefinition right_leg_r9 = right_leg_dont_select_this.addOrReplaceChild("right_leg_r9",
				CubeListBuilder.create().texOffs(47, 53).addBox(-2.1959F, 4.995F, -3.8899F, 4.0F, 5.0F, 7.0F,
						new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(-3.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.5236F));

		PartDefinition right_leg_r10 = right_leg_dont_select_this.addOrReplaceChild("right_leg_r10",
				CubeListBuilder.create().texOffs(3, 26).addBox(-11.0591F, 13.0103F, -3.8899F, 4.0F, 7.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -4.0F, 0.0F, 0.0F, 0.0F, -0.5236F));

		PartDefinition right_leg_r11 = right_leg_dont_select_this.addOrReplaceChild("right_leg_r11",
				CubeListBuilder.create().texOffs(5, 15).addBox(-9.2663F, 4.3425F, -3.8899F, 4.0F, 10.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -4.0F, 0.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition right_leg_r12 = right_leg_dont_select_this.addOrReplaceChild("right_leg_r12",
				CubeListBuilder.create().texOffs(47, 53).addBox(-0.1813F, 3.9804F, -5.9591F, 4.0F, 4.0F, 8.0F,
						new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(-3.0F, -4.0F, 0.0F, 1.5708F, 0.7854F, 1.309F));

		PartDefinition right_leg_r13 = right_leg_dont_select_this.addOrReplaceChild("right_leg_r13",
				CubeListBuilder.create().texOffs(3, 26).addBox(-8.3071F, 13.7477F, -4.9591F, 4.0F, 7.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -4.0F, 0.0F, -1.5708F, 1.309F, -1.8326F));

		PartDefinition right_leg_r14 = right_leg_dont_select_this.addOrReplaceChild("right_leg_r14",
				CubeListBuilder.create().texOffs(5, 15).addBox(-6.4416F, 4.7144F, -5.9591F, 4.0F, 10.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -4.0F, 0.0F, -1.5708F, 1.4399F, -1.8326F));

		PartDefinition right_leg_r15 = right_leg_dont_select_this.addOrReplaceChild("right_leg_r15",
				CubeListBuilder.create().texOffs(5, 15).addBox(-8.4245F, 4.4533F, -2.0409F, 4.0F, 10.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -4.0F, 0.0F, 1.5708F, -1.4399F, -1.8326F));

		PartDefinition right_leg_r16 = right_leg_dont_select_this.addOrReplaceChild("right_leg_r16",
				CubeListBuilder.create().texOffs(3, 26).addBox(-10.239F, 13.23F, -2.0409F, 4.0F, 7.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -4.0F, 0.0F, 1.5708F, -1.309F, -1.8326F));

		PartDefinition right_leg_r17 = right_leg_dont_select_this.addOrReplaceChild("right_leg_r17",
				CubeListBuilder.create().texOffs(47, 53).addBox(-1.5955F, 4.3946F, -2.0409F, 4.0F, 5.0F, 8.0F,
						new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(-3.0F, -4.0F, 0.0F, -1.5708F, -0.7854F, 1.309F));

		PartDefinition right_leg_r18 = right_leg_dont_select_this.addOrReplaceChild("right_leg_r18",
				CubeListBuilder.create().texOffs(2, 1).addBox(-3.7324F, -7.6616F, -2.5F, 7.0F, 9.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.9634F, -12.2946F, -0.5F, 0.0F, 0.0F, 0.3927F));

		PartDefinition right_leg_r19 = right_leg_dont_select_this.addOrReplaceChild("right_leg_r19",
				CubeListBuilder.create().texOffs(18, 25).addBox(-3.867F, -0.8766F, -2.5F, 5.0F, 8.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.9634F, -12.2946F, -0.5F, 0.0F, 0.0F, -0.1745F));

		PartDefinition right_leg_r20 = right_leg_dont_select_this.addOrReplaceChild("right_leg_r20",
				CubeListBuilder.create().texOffs(2, 1).addBox(-3.3056F, -6.8384F, -2.9619F, 5.0F, 8.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9634F, -12.2946F, 2.5F, 1.5708F, 1.1781F, 1.5708F));

		PartDefinition right_leg_r21 = right_leg_dont_select_this.addOrReplaceChild("right_leg_r21",
				CubeListBuilder.create().texOffs(18, 25).addBox(-3.4121F, -0.7964F, -2.9619F, 5.0F, 10.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9634F, -12.2946F, 2.5F, -1.5708F, 1.3963F, -1.5708F));

		PartDefinition right_leg_r22 = right_leg_dont_select_this.addOrReplaceChild("right_leg_r22",
				CubeListBuilder.create().texOffs(47, 53).addBox(-4.4957F, -0.9347F, -3.0F, 5.0F, 21.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -4.0F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition right_leg_r23 = right_leg_dont_select_this.addOrReplaceChild("right_leg_r23",
				CubeListBuilder.create().texOffs(18, 25).addBox(-3.4121F, -0.7964F, -2.0381F, 5.0F, 10.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9634F, -12.2946F, -3.5F, 1.5708F, -1.3963F, -1.5708F));

		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(),
				PartPose.offset(2.5F, -19.0F, 1.0F));

		PartDefinition left_leg_dont_select_this = left_leg.addOrReplaceChild("left_leg_dont_select_this",
				CubeListBuilder.create().texOffs(7, 24).mirror()
						.addBox(0.5381F, -7.1913F, -3.0F, 7.0F, 3.0F, 5.0F, new CubeDeformation(-0.1F)).mirror(false)
						.texOffs(6, 20).mirror()
						.addBox(0.0381F, -17.1913F, -5.0F, 8.0F, 11.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(4.5F, 20.0F, 1.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition left_leg_r1 = left_leg_dont_select_this.addOrReplaceChild("left_leg_r1", CubeListBuilder.create()
				.texOffs(4, 31).mirror().addBox(-3.5F, 0.125F, 3.075F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.1F))
				.mirror(false).texOffs(4, 31).mirror()
				.addBox(-3.5F, -2.125F, 2.075F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.1F)).mirror(false)
				.texOffs(36, 29).mirror().addBox(-3.0F, -2.125F, -2.425F, 5.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(47, 49).mirror()
				.addBox(-3.0F, -0.125F, -8.075F, 5.0F, 3.0F, 8.0F, new CubeDeformation(0.1F)).mirror(false)
				.texOffs(47, 53).mirror().addBox(-3.0F, -4.125F, 0.575F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F))
				.mirror(false), PartPose.offsetAndRotation(-2.5369F, 20.5277F, -3.575F, 0.0F, 0.0F, 0.3927F));

		PartDefinition left_leg_r2 = left_leg_dont_select_this.addOrReplaceChild("left_leg_r2",
				CubeListBuilder.create().texOffs(3, 29).mirror()
						.addBox(-3.0F, -3.033F, -7.1947F, 5.0F, 2.0F, 9.0F, new CubeDeformation(-0.1F)).mirror(false),
				PartPose.offsetAndRotation(-2.5369F, 20.5277F, -3.575F, 0.3927F, 0.0F, 0.3927F));

		PartDefinition left_leg_r3 = left_leg_dont_select_this.addOrReplaceChild(
				"left_leg_r3", CubeListBuilder.create().texOffs(47, 53).addBox(0.9103F, -0.3665F, -3.8899F, 4.0F, 3.0F,
						7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -4.0F, 0.0F, 0.0F, 0.0F, 1.4399F));

		PartDefinition left_leg_r4 = left_leg_dont_select_this.addOrReplaceChild("left_leg_r4",
				CubeListBuilder.create().texOffs(47, 53).addBox(-0.1668F, 2.7814F, -3.8899F, 4.0F, 5.0F, 7.0F,
						new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(3.0F, -4.0F, 0.0F, 0.0F, 0.0F, 1.0472F));

		PartDefinition left_leg_r5 = left_leg_dont_select_this.addOrReplaceChild(
				"left_leg_r5", CubeListBuilder.create().texOffs(3, 26).addBox(-8.1276F, 13.6607F, -3.8899F, 4.0F, 7.0F,
						7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition left_leg_r6 = left_leg_dont_select_this.addOrReplaceChild(
				"left_leg_r6", CubeListBuilder.create().texOffs(5, 15).addBox(-6.275F, 4.6047F, -3.8899F, 4.0F, 10.0F,
						7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition left_leg_r7 = left_leg_dont_select_this.addOrReplaceChild("left_leg_r7",
				CubeListBuilder.create().texOffs(47, 53).mirror()
						.addBox(-4.1416F, 1.4892F, -3.8899F, 4.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.0F, -4.0F, 0.0F, 0.0F, 0.0F, -0.9163F));

		PartDefinition left_leg_r8 = left_leg_dont_select_this.addOrReplaceChild("left_leg_r8",
				CubeListBuilder.create().texOffs(47, 53).mirror()
						.addBox(-2.4129F, 4.2017F, -3.8899F, 4.0F, 5.0F, 7.0F, new CubeDeformation(-0.1F))
						.mirror(false),
				PartPose.offsetAndRotation(3.0F, -4.0F, 0.0F, 0.0F, 0.0F, -0.5236F));

		PartDefinition left_leg_r9 = left_leg_dont_select_this.addOrReplaceChild("left_leg_r9",
				CubeListBuilder.create().texOffs(3, 26).mirror()
						.addBox(6.0677F, 13.1408F, -3.8899F, 4.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.5236F));

		PartDefinition left_leg_r10 = left_leg_dont_select_this.addOrReplaceChild("left_leg_r10",
				CubeListBuilder.create().texOffs(5, 15).mirror()
						.addBox(4.2663F, 4.3425F, -3.8899F, 4.0F, 10.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition left_leg_r11 = left_leg_dont_select_this.addOrReplaceChild("left_leg_r11",
				CubeListBuilder.create().texOffs(47, 53).mirror()
						.addBox(-3.7264F, 3.8881F, -4.9677F, 4.0F, 4.0F, 8.0F, new CubeDeformation(-0.1F))
						.mirror(false),
				PartPose.offsetAndRotation(3.0F, -4.0F, 0.0F, 1.5708F, -0.7854F, -1.309F));

		PartDefinition left_leg_r12 = left_leg_dont_select_this.addOrReplaceChild("left_leg_r12",
				CubeListBuilder.create().texOffs(3, 26).mirror()
						.addBox(4.2734F, 13.6216F, -3.9677F, 4.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.0F, -4.0F, 0.0F, -1.5708F, -1.309F, 1.8326F));

		PartDefinition left_leg_r13 = left_leg_dont_select_this.addOrReplaceChild("left_leg_r13",
				CubeListBuilder.create().texOffs(5, 15).mirror()
						.addBox(2.4246F, 4.585F, -4.9677F, 4.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.0F, -4.0F, 0.0F, -1.5708F, -1.4399F, 1.8326F));

		PartDefinition left_leg_r14 = left_leg_dont_select_this.addOrReplaceChild("left_leg_r14",
				CubeListBuilder.create().texOffs(5, 15).mirror()
						.addBox(4.4075F, 4.3239F, -3.0323F, 4.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.0F, -4.0F, 0.0F, 1.5708F, 1.4399F, 1.8326F));

		PartDefinition left_leg_r15 = left_leg_dont_select_this.addOrReplaceChild("left_leg_r15",
				CubeListBuilder.create().texOffs(3, 26).mirror()
						.addBox(6.2052F, 13.104F, -3.0323F, 4.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.0F, -4.0F, 0.0F, 1.5708F, 1.309F, 1.8326F));

		PartDefinition left_leg_r16 = left_leg_dont_select_this.addOrReplaceChild("left_leg_r16",
				CubeListBuilder.create().texOffs(47, 53).mirror()
						.addBox(-2.3122F, 4.3023F, -3.0323F, 4.0F, 5.0F, 8.0F, new CubeDeformation(-0.1F))
						.mirror(false),
				PartPose.offsetAndRotation(3.0F, -4.0F, 0.0F, -1.5708F, 0.7854F, -1.309F));

		PartDefinition left_leg_r17 = left_leg_dont_select_this.addOrReplaceChild("left_leg_r17",
				CubeListBuilder.create().texOffs(2, 1).mirror()
						.addBox(-3.9747F, -8.3687F, -2.5F, 7.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(6.9634F, -12.2946F, -0.5F, 0.0F, 0.0F, -0.3927F));

		PartDefinition left_leg_r18 = left_leg_dont_select_this.addOrReplaceChild("left_leg_r18",
				CubeListBuilder.create().texOffs(18, 25).mirror()
						.addBox(-2.1093F, -1.0931F, -2.5F, 5.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(6.9634F, -12.2946F, -0.5F, 0.0F, 0.0F, 0.1745F));

		PartDefinition left_leg_r19 = left_leg_dont_select_this.addOrReplaceChild("left_leg_r19",
				CubeListBuilder.create().texOffs(2, 1).mirror()
						.addBox(-1.5479F, -7.1919F, -2.0381F, 5.0F, 8.0F, 5.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(3.9634F, -12.2946F, 2.5F, 1.5708F, -1.1781F, -1.5708F));

		PartDefinition left_leg_r20 = left_leg_dont_select_this.addOrReplaceChild("left_leg_r20",
				CubeListBuilder.create().texOffs(18, 25).mirror()
						.addBox(-1.6544F, -1.1733F, -2.0381F, 5.0F, 10.0F, 5.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(3.9634F, -12.2946F, 2.5F, -1.5708F, -1.3963F, 1.5708F));

		PartDefinition left_leg_r21 = left_leg_dont_select_this.addOrReplaceChild("left_leg_r21",
				CubeListBuilder.create().texOffs(47, 53).mirror()
						.addBox(-1.4957F, -1.0653F, -3.0F, 5.0F, 21.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition left_leg_r22 = left_leg_dont_select_this.addOrReplaceChild("left_leg_r22",
				CubeListBuilder.create().texOffs(18, 25).mirror()
						.addBox(-1.6544F, -1.1733F, -2.9619F, 5.0F, 10.0F, 5.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(3.9634F, -12.2946F, -3.5F, 1.5708F, 1.3963F, 1.5708F));

		PartDefinition left_leg_r23 = left_leg_dont_select_this.addOrReplaceChild("left_leg_r23",
				CubeListBuilder.create().texOffs(2, 1).mirror()
						.addBox(-1.5479F, -7.1919F, -2.9619F, 5.0F, 8.0F, 5.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(3.9634F, -12.2946F, -3.5F, -1.5708F, 1.1781F, -1.5708F));

		return LayerDefinition.create(meshdefinition, 82, 82);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
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