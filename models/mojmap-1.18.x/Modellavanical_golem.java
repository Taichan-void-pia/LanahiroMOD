// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modellavanical_golem<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "lavanical_golem"), "main");
	private final ModelPart body;
	private final ModelPart right_arm;
	private final ModelPart left_arm;
	private final ModelPart rotation_parts;

	public Modellavanical_golem(ModelPart root) {
		this.body = root.getChild("body");
		this.right_arm = root.getChild("right_arm");
		this.left_arm = root.getChild("left_arm");
		this.rotation_parts = root.getChild("rotation_parts");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(63, 39)
				.addBox(-6.0822F, -9.112F, -6.3713F, 12.0F, 9.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(62, 38)
				.addBox(-4.0822F, -14.112F, -3.3713F, 8.0F, 10.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(63, 39)
				.addBox(-5.0822F, -0.112F, -3.3713F, 10.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(97, 72)
				.addBox(-4.0822F, 3.888F, -2.3713F, 8.0F, 7.0F, 6.0F, new CubeDeformation(-0.25F)).texOffs(63, 39)
				.addBox(-6.0822F, 6.888F, -3.3713F, 12.0F, 5.0F, 8.0F, new CubeDeformation(-0.5F)).texOffs(97, 67)
				.addBox(-4.0822F, 9.888F, -2.3713F, 8.0F, 12.0F, 6.0F, new CubeDeformation(-0.75F)).texOffs(63, 39)
				.addBox(-5.0822F, 12.888F, -3.3713F, 10.0F, 5.0F, 8.0F, new CubeDeformation(-1.0F)).texOffs(63, 39)
				.addBox(-5.0822F, 14.888F, -3.3713F, 10.0F, 5.0F, 8.0F, new CubeDeformation(-1.2F)).texOffs(97, 67)
				.addBox(-4.0822F, 13.888F, -2.3713F, 8.0F, 18.0F, 6.0F, new CubeDeformation(-2.0F)),
				PartPose.offset(0.0822F, -6.888F, 0.6213F));

		PartDefinition body_r1 = body.addOrReplaceChild("body_r1",
				CubeListBuilder.create().texOffs(63, 39)
						.addBox(-1.0F, -1.625F, 6.5F, 2.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(63, 39)
						.addBox(-1.0F, -2.375F, 8.5F, 2.0F, 8.0F, 3.0F, new CubeDeformation(-0.2F)).texOffs(63, 39)
						.addBox(-1.0F, -3.375F, 10.5F, 2.0F, 7.0F, 3.0F, new CubeDeformation(-0.4F)).texOffs(63, 39)
						.addBox(-1.0F, -4.375F, 12.5F, 2.0F, 6.0F, 3.0F, new CubeDeformation(-0.6F)).texOffs(63, 39)
						.addBox(-1.0F, -5.375F, 13.5F, 2.0F, 5.0F, 3.0F, new CubeDeformation(-0.8F)).texOffs(63, 39)
						.addBox(-1.0F, -1.625F, -9.0F, 2.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(63, 39)
						.addBox(-1.0F, -2.375F, -11.0F, 2.0F, 8.0F, 3.0F, new CubeDeformation(-0.2F)).texOffs(63, 39)
						.addBox(-1.0F, -5.375F, -16.0F, 2.0F, 5.0F, 3.0F, new CubeDeformation(-0.8F)).texOffs(63, 39)
						.addBox(-1.0F, -4.375F, -15.0F, 2.0F, 6.0F, 3.0F, new CubeDeformation(-0.6F)).texOffs(63, 39)
						.addBox(-1.0F, -3.375F, -13.0F, 2.0F, 7.0F, 3.0F, new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(-0.0822F, 4.513F, 0.6287F, -3.1416F, 0.7854F, 3.1416F));

		PartDefinition body_r2 = body.addOrReplaceChild("body_r2",
				CubeListBuilder.create().texOffs(63, 39)
						.addBox(-1.0F, -1.625F, 6.5F, 2.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(63, 39)
						.addBox(-1.0F, -2.375F, 8.5F, 2.0F, 8.0F, 3.0F, new CubeDeformation(-0.2F)).texOffs(63, 39)
						.addBox(-1.0F, -3.375F, 10.5F, 2.0F, 7.0F, 3.0F, new CubeDeformation(-0.4F)).texOffs(63, 39)
						.addBox(-1.0F, -4.375F, 12.5F, 2.0F, 6.0F, 3.0F, new CubeDeformation(-0.6F)).texOffs(63, 39)
						.addBox(-1.0F, -5.375F, 13.5F, 2.0F, 5.0F, 3.0F, new CubeDeformation(-0.8F)).texOffs(63, 39)
						.addBox(-1.0F, -5.375F, -16.0F, 2.0F, 5.0F, 3.0F, new CubeDeformation(-0.8F)).texOffs(63, 39)
						.addBox(-1.0F, -4.375F, -15.0F, 2.0F, 6.0F, 3.0F, new CubeDeformation(-0.6F)).texOffs(63, 39)
						.addBox(-1.0F, -3.375F, -13.0F, 2.0F, 7.0F, 3.0F, new CubeDeformation(-0.4F)).texOffs(63, 39)
						.addBox(-1.0F, -2.375F, -11.0F, 2.0F, 8.0F, 3.0F, new CubeDeformation(-0.2F)).texOffs(63, 39)
						.addBox(-1.0F, -1.625F, -9.0F, 2.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0822F, 4.513F, 0.6287F, 0.0F, 0.7854F, 0.0F));

		PartDefinition body_r3 = body.addOrReplaceChild("body_r3",
				CubeListBuilder.create().texOffs(63, 39).addBox(1.8547F, -3.6344F, -5.369F, 14.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0822F, -10.3128F, -1.6943F, -0.155F, -0.263F, 0.7426F));

		PartDefinition body_r4 = body.addOrReplaceChild("body_r4",
				CubeListBuilder.create().texOffs(63, 39).addBox(-1.2798F, 1.4738F, -5.369F, 16.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0822F, -10.3128F, -1.6943F, 0.082F, -0.2934F, -0.0754F));

		PartDefinition body_r5 = body.addOrReplaceChild("body_r5",
				CubeListBuilder.create().texOffs(63, 39).addBox(0.91F, 1.572F, -5.369F, 16.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0822F, -10.3128F, -1.6943F, 0.1896F, -0.2395F, -0.4789F));

		PartDefinition body_r6 = body.addOrReplaceChild("body_r6",
				CubeListBuilder.create().texOffs(63, 39).addBox(4.3541F, -0.2177F, -5.369F, 16.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0822F, -10.3128F, -1.6943F, 0.2281F, -0.2032F, -0.6539F));

		PartDefinition body_r7 = body.addOrReplaceChild("body_r7", CubeListBuilder.create().texOffs(59, 82).mirror()
				.addBox(-5.7598F, 2.3957F, -0.9548F, 16.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-5.6054F, -18.1052F, 1.6146F, 0.0683F, 0.4075F, 0.6511F));

		PartDefinition body_r8 = body.addOrReplaceChild("body_r8", CubeListBuilder.create().texOffs(59, 82).mirror()
				.addBox(-8.0814F, -0.2875F, -1.0452F, 16.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-5.6054F, -18.1052F, 1.6146F, 0.2249F, 0.3492F, 1.0695F));

		PartDefinition body_r9 = body.addOrReplaceChild("body_r9", CubeListBuilder.create().texOffs(59, 82).mirror()
				.addBox(-11.9825F, -3.582F, -1.0452F, 16.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-5.6054F, -18.1052F, 1.6146F, 0.2824F, 0.3053F, 1.2479F));

		PartDefinition body_r10 = body.addOrReplaceChild("body_r10",
				CubeListBuilder.create().texOffs(59, 82).addBox(-4.0175F, -3.582F, -1.0452F, 16.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.441F, -18.1052F, 1.6146F, 0.2824F, -0.3053F, -1.2479F));

		PartDefinition body_r11 = body.addOrReplaceChild("body_r11",
				CubeListBuilder.create().texOffs(59, 82).addBox(-7.9186F, -0.2875F, -1.0452F, 16.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.441F, -18.1052F, 1.6146F, 0.2249F, -0.3492F, -1.0695F));

		PartDefinition body_r12 = body.addOrReplaceChild("body_r12",
				CubeListBuilder.create().texOffs(59, 82).addBox(-10.2402F, 2.3957F, -0.9548F, 16.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.441F, -18.1052F, 1.6146F, 0.0683F, -0.4075F, -0.6511F));

		PartDefinition body_r13 = body.addOrReplaceChild("body_r13",
				CubeListBuilder.create().texOffs(63, 39).addBox(-14.7202F, 1.4738F, -5.369F, 16.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0822F, -10.3128F, -1.6943F, 0.082F, 0.2934F, 0.0754F));

		PartDefinition body_r14 = body.addOrReplaceChild("body_r14",
				CubeListBuilder.create().texOffs(63, 39).addBox(-15.8547F, -3.6344F, -5.369F, 14.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0822F, -10.3128F, -1.6943F, -0.155F, 0.263F, -0.7426F));

		PartDefinition body_r15 = body.addOrReplaceChild("body_r15",
				CubeListBuilder.create().texOffs(63, 39).addBox(-16.91F, 1.572F, -5.369F, 16.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0822F, -10.3128F, -1.6943F, 0.1896F, 0.2395F, 0.4789F));

		PartDefinition body_r16 = body.addOrReplaceChild("body_r16",
				CubeListBuilder.create().texOffs(63, 39).addBox(-20.3541F, -0.2177F, -5.369F, 16.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0822F, -10.3128F, -1.6943F, 0.2281F, 0.2032F, 0.6539F));

		PartDefinition body_r17 = body.addOrReplaceChild("body_r17",
				CubeListBuilder.create().texOffs(63, 39)
						.addBox(-7.0F, 5.2007F, -5.777F, 14.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(73, 30)
						.addBox(-3.0F, -2.7993F, -6.927F, 6.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(63, 1)
						.addBox(-9.0F, -5.7993F, -5.927F, 18.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0822F, -10.3128F, -1.6943F, 0.1309F, 0.0F, 0.0F));

		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(),
				PartPose.offset(-17.0F, -17.25F, 2.25F));

		PartDefinition right_arm_r1 = right_arm.addOrReplaceChild("right_arm_r1", CubeListBuilder.create()
				.texOffs(59, 70).addBox(-3.2179F, 0.9353F, -16.2508F, 9.0F, 11.0F, 9.0F, new CubeDeformation(-0.5F))
				.texOffs(4, 40).addBox(-6.2179F, -1.0647F, -15.2508F, 11.0F, 11.0F, 9.0F, new CubeDeformation(-0.2F))
				.texOffs(4, 40).addBox(-8.2179F, -3.0647F, -15.2508F, 12.0F, 11.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 0.0F, 3.0F, 0.014F, 0.9615F, -0.1448F));

		PartDefinition right_arm_r2 = right_arm.addOrReplaceChild("right_arm_r2", CubeListBuilder.create()
				.texOffs(100, 78).addBox(-14.3806F, 14.7711F, -28.0891F, 10.0F, 9.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(4, 40).addBox(-12.575F, 12.6043F, -28.3947F, 4.0F, 3.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(4, 40).addBox(-12.575F, 23.0491F, -28.3947F, 4.0F, 3.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(13, 8).addBox(-11.3806F, 23.7711F, -29.5891F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(13, 8).addBox(-11.3806F, 11.7711F, -29.5891F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(4, 40).addBox(-14.8806F, 14.5211F, -27.5891F, 10.0F, 9.0F, 9.0F, new CubeDeformation(0.0F))
				.texOffs(4, 40).addBox(-14.8806F, 14.5211F, -17.5891F, 10.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(4, 40).addBox(-13.8806F, 15.5211F, -24.5891F, 8.0F, 7.0F, 14.0F, new CubeDeformation(0.0F))
				.texOffs(4, 40).addBox(-12.3806F, 16.5211F, -12.5891F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -2.0F, 3.0F, 0.2182F, -0.3054F, 0.0F));

		PartDefinition right_arm_r3 = right_arm.addOrReplaceChild("right_arm_r3", CubeListBuilder.create()
				.texOffs(4, 40).addBox(-19.3069F, 7.3345F, -28.3947F, 4.0F, 3.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(4, 40).addBox(-19.2796F, 17.7847F, -28.3947F, 4.0F, 3.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(13, 8).addBox(-17.9875F, 18.5261F, -29.5891F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(13, 8).addBox(-18.0189F, 6.5199F, -29.5891F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -2.0F, 3.0F, 0.3173F, -0.2002F, -0.3911F));

		PartDefinition right_arm_r4 = right_arm.addOrReplaceChild("right_arm_r4", CubeListBuilder.create()
				.texOffs(4, 40).addBox(-23.5097F, -0.1104F, -28.3947F, 4.0F, 3.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(4, 40).addBox(-23.4593F, 10.3553F, -28.3947F, 4.0F, 3.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(13, 8).addBox(-22.0843F, 11.1521F, -29.5891F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(13, 8).addBox(-22.1423F, -0.8719F, -29.5891F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -2.0F, 3.0F, 0.3676F, -0.0667F, -0.7641F));

		PartDefinition right_arm_r5 = right_arm.addOrReplaceChild("right_arm_r5", CubeListBuilder.create()
				.texOffs(4, 40).addBox(-24.5436F, -8.5969F, -28.3947F, 4.0F, 3.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(4, 40).addBox(-24.4777F, 1.892F, -28.3947F, 4.0F, 3.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(13, 8).addBox(-23.0474F, 2.7716F, -29.5891F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(13, 8).addBox(-23.1232F, -9.2791F, -29.5891F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -2.0F, 3.0F, 0.3659F, 0.0757F, -1.1304F));

		PartDefinition right_arm_r6 = right_arm.addOrReplaceChild("right_arm_r6", CubeListBuilder.create()
				.texOffs(4, 40).addBox(-22.2511F, -16.8331F, -28.3947F, 4.0F, 3.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(13, 8).addBox(-20.8121F, -17.4216F, -29.5891F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -2.0F, 3.0F, 0.3124F, 0.2079F, -1.5042F));

		PartDefinition right_arm_r7 = right_arm.addOrReplaceChild("right_arm_r7", CubeListBuilder.create()
				.texOffs(4, 40).addBox(16.8623F, 2.9281F, -28.3947F, 4.0F, 3.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(13, 8).addBox(17.8121F, 2.3396F, -29.5891F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -2.0F, 3.0F, -0.3124F, -0.2079F, 1.6374F));

		PartDefinition right_arm_r8 = right_arm.addOrReplaceChild("right_arm_r8", CubeListBuilder.create()
				.texOffs(4, 40).addBox(-4.3388F, 14.8967F, -28.3947F, 4.0F, 3.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(4, 40).addBox(-4.3661F, 25.347F, -28.3947F, 4.0F, 3.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(13, 8).addBox(-3.2694F, 26.0884F, -29.5891F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(13, 8).addBox(-3.2381F, 14.0821F, -29.5891F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -2.0F, 3.0F, 0.0811F, -0.3649F, 0.4114F));

		PartDefinition right_arm_r9 = right_arm.addOrReplaceChild("right_arm_r9", CubeListBuilder.create()
				.texOffs(4, 40).addBox(4.1477F, 13.8628F, -28.3947F, 4.0F, 3.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(4, 40).addBox(4.0972F, 24.3286F, -28.3947F, 4.0F, 3.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(13, 8).addBox(5.1111F, 25.1253F, -29.5891F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(13, 8).addBox(5.1691F, 13.1013F, -29.5891F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -2.0F, 3.0F, -0.0715F, -0.3668F, 0.8324F));

		PartDefinition right_arm_r10 = right_arm.addOrReplaceChild("right_arm_r10", CubeListBuilder.create()
				.texOffs(4, 40).addBox(11.5925F, 9.66F, -28.3947F, 4.0F, 3.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(4, 40).addBox(11.5266F, 20.1489F, -28.3947F, 4.0F, 3.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(13, 8).addBox(12.4851F, 21.0285F, -29.5891F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(13, 8).addBox(12.5609F, 8.9779F, -29.5891F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -2.0F, 3.0F, -0.2104F, -0.3108F, 1.2449F));

		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(),
				PartPose.offset(17.0F, -17.25F, 2.25F));

		PartDefinition left_arm_r1 = left_arm.addOrReplaceChild("left_arm_r1", CubeListBuilder.create().texOffs(59, 70)
				.addBox(-5.7821F, 0.9353F, -16.2508F, 9.0F, 11.0F, 9.0F, new CubeDeformation(-0.5F)).texOffs(4, 40)
				.addBox(-4.7821F, -1.0647F, -15.2508F, 11.0F, 11.0F, 9.0F, new CubeDeformation(-0.2F)).texOffs(4, 40)
				.addBox(-3.7821F, -3.0647F, -15.2508F, 12.0F, 11.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, 0.0F, 3.0F, 0.014F, -0.9615F, 0.1448F));

		PartDefinition left_arm_r2 = left_arm.addOrReplaceChild("left_arm_r2", CubeListBuilder.create().texOffs(100, 78)
				.addBox(4.3806F, 14.7711F, -28.0891F, 10.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 40)
				.addBox(8.575F, 12.6043F, -28.3947F, 4.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(4, 40)
				.addBox(8.575F, 23.0491F, -28.3947F, 4.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(13, 8)
				.addBox(8.3806F, 23.7711F, -29.5891F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(13, 8)
				.addBox(8.3806F, 11.7711F, -29.5891F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(4, 40)
				.addBox(4.8806F, 14.5211F, -27.5891F, 10.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(4, 40)
				.addBox(4.8806F, 14.5211F, -17.5891F, 10.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(4, 40)
				.addBox(5.8806F, 15.5211F, -24.5891F, 8.0F, 7.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(4, 40)
				.addBox(7.3806F, 16.5211F, -12.5891F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, 3.0F, 0.2182F, 0.3054F, 0.0F));

		PartDefinition left_arm_r3 = left_arm.addOrReplaceChild("left_arm_r3", CubeListBuilder.create().texOffs(4, 40)
				.addBox(15.3069F, 7.3345F, -28.3947F, 4.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(4, 40)
				.addBox(15.2796F, 17.7847F, -28.3947F, 4.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(13, 8)
				.addBox(14.9875F, 18.5261F, -29.5891F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(13, 8)
				.addBox(15.0189F, 6.5199F, -29.5891F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, 3.0F, 0.3173F, 0.2002F, 0.3911F));

		PartDefinition left_arm_r4 = left_arm.addOrReplaceChild("left_arm_r4", CubeListBuilder.create().texOffs(4, 40)
				.addBox(19.5097F, -0.1104F, -28.3947F, 4.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(4, 40)
				.addBox(19.4593F, 10.3553F, -28.3947F, 4.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(13, 8)
				.addBox(19.0843F, 11.1521F, -29.5891F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(13, 8)
				.addBox(19.1423F, -0.8719F, -29.5891F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, 3.0F, 0.3676F, 0.0667F, 0.7641F));

		PartDefinition left_arm_r5 = left_arm.addOrReplaceChild("left_arm_r5", CubeListBuilder.create().texOffs(4, 40)
				.addBox(20.5436F, -8.5969F, -28.3947F, 4.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(4, 40)
				.addBox(20.4777F, 1.892F, -28.3947F, 4.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(13, 8)
				.addBox(20.0474F, 2.7716F, -29.5891F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(13, 8)
				.addBox(20.1232F, -9.2791F, -29.5891F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, 3.0F, 0.3659F, -0.0757F, 1.1304F));

		PartDefinition left_arm_r6 = left_arm.addOrReplaceChild("left_arm_r6", CubeListBuilder.create().texOffs(4, 40)
				.addBox(18.2511F, -16.8331F, -28.3947F, 4.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(13, 8)
				.addBox(17.8121F, -17.4216F, -29.5891F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, 3.0F, 0.3124F, -0.2079F, 1.5042F));

		PartDefinition left_arm_r7 = left_arm.addOrReplaceChild("left_arm_r7", CubeListBuilder.create().texOffs(4, 40)
				.addBox(-20.8623F, 2.9281F, -28.3947F, 4.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(13, 8)
				.addBox(-20.8121F, 2.3396F, -29.5891F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, 3.0F, -0.3124F, 0.2079F, -1.6374F));

		PartDefinition left_arm_r8 = left_arm.addOrReplaceChild("left_arm_r8", CubeListBuilder.create().texOffs(4, 40)
				.addBox(0.3388F, 14.8967F, -28.3947F, 4.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(4, 40)
				.addBox(0.3661F, 25.347F, -28.3947F, 4.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(13, 8)
				.addBox(0.2694F, 26.0884F, -29.5891F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(13, 8)
				.addBox(0.2381F, 14.0821F, -29.5891F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, 3.0F, 0.0811F, 0.3649F, -0.4114F));

		PartDefinition left_arm_r9 = left_arm.addOrReplaceChild("left_arm_r9", CubeListBuilder.create().texOffs(4, 40)
				.addBox(-8.1477F, 13.8628F, -28.3947F, 4.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(4, 40)
				.addBox(-8.0972F, 24.3286F, -28.3947F, 4.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(13, 8)
				.addBox(-8.1111F, 25.1253F, -29.5891F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(13, 8)
				.addBox(-8.1691F, 13.1013F, -29.5891F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, 3.0F, -0.0715F, 0.3668F, -0.8324F));

		PartDefinition left_arm_r10 = left_arm.addOrReplaceChild("left_arm_r10", CubeListBuilder.create().texOffs(4, 40)
				.addBox(-15.5925F, 9.66F, -28.3947F, 4.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(4, 40)
				.addBox(-15.5266F, 20.1489F, -28.3947F, 4.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(13, 8)
				.addBox(-15.4851F, 21.0285F, -29.5891F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(13, 8)
				.addBox(-15.5609F, 8.9779F, -29.5891F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, 3.0F, -0.2104F, 0.3108F, -1.2449F));

		PartDefinition rotation_parts = partdefinition.addOrReplaceChild("rotation_parts",
				CubeListBuilder.create().texOffs(104, 77)
						.addBox(14.0856F, -2.0F, 0.0F, 9.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(104, 77)
						.addBox(-23.0788F, -2.0F, 0.0F, 9.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2466F, 7.112F, 1.6213F, -1.0908F, 0.0F, 0.0F));

		PartDefinition rotation_parts_r1 = rotation_parts.addOrReplaceChild("rotation_parts_r1",
				CubeListBuilder.create().texOffs(104, 77).addBox(-2.0F, -4.0F, 0.0F, 4.0F, 8.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.8996F, -16.7309F, 0.0F, 0.0F, 0.0F, 1.1781F));

		PartDefinition rotation_parts_r2 = rotation_parts.addOrReplaceChild("rotation_parts_r2",
				CubeListBuilder.create().texOffs(104, 77).addBox(-5.0F, -2.0F, 0.0F, 9.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.7747F, -12.8052F, 0.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition rotation_parts_r3 = rotation_parts.addOrReplaceChild("rotation_parts_r3",
				CubeListBuilder.create().texOffs(104, 77).addBox(-2.0F, -4.0F, 0.0F, 4.0F, 8.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-16.7003F, -6.9302F, 0.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition rotation_parts_r4 = rotation_parts.addOrReplaceChild("rotation_parts_r4",
				CubeListBuilder.create().texOffs(104, 77).addBox(-2.0F, -4.0F, 0.0F, 4.0F, 8.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-16.7003F, 6.9302F, 0.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition rotation_parts_r5 = rotation_parts.addOrReplaceChild("rotation_parts_r5",
				CubeListBuilder.create().texOffs(104, 77).addBox(-5.0F, -2.0F, 0.0F, 9.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.7747F, 12.8052F, 0.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition rotation_parts_r6 = rotation_parts.addOrReplaceChild("rotation_parts_r6",
				CubeListBuilder.create().texOffs(104, 77).addBox(-2.0F, -4.0F, 0.0F, 4.0F, 8.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.8996F, 16.7309F, 0.0F, 0.0F, 0.0F, -1.1781F));

		PartDefinition rotation_parts_r7 = rotation_parts.addOrReplaceChild("rotation_parts_r7",
				CubeListBuilder.create().texOffs(104, 77).addBox(-4.0F, -2.0F, 0.0F, 9.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0237F, 18.1094F, 0.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition rotation_parts_r8 = rotation_parts.addOrReplaceChild("rotation_parts_r8",
				CubeListBuilder.create().texOffs(104, 77).addBox(-2.0F, -4.0F, 0.0F, 4.0F, 8.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.9064F, 16.7309F, 0.0F, 0.0F, 0.0F, 1.1781F));

		PartDefinition rotation_parts_r9 = rotation_parts.addOrReplaceChild("rotation_parts_r9",
				CubeListBuilder.create().texOffs(104, 77).addBox(-4.0F, -2.0F, 0.0F, 9.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.7815F, 12.8052F, 0.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition rotation_parts_r10 = rotation_parts.addOrReplaceChild("rotation_parts_r10",
				CubeListBuilder.create().texOffs(104, 77).addBox(-2.0F, -4.0F, 0.0F, 4.0F, 8.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(16.7071F, 6.9302F, 0.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition rotation_parts_r11 = rotation_parts.addOrReplaceChild("rotation_parts_r11",
				CubeListBuilder.create().texOffs(104, 77).addBox(-2.0F, -4.0F, 0.0F, 4.0F, 8.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(16.7071F, -6.9302F, 0.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition rotation_parts_r12 = rotation_parts.addOrReplaceChild("rotation_parts_r12",
				CubeListBuilder.create().texOffs(104, 77).addBox(-4.0F, -2.0F, 0.0F, 9.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.7815F, -12.8052F, 0.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition rotation_parts_r13 = rotation_parts.addOrReplaceChild("rotation_parts_r13",
				CubeListBuilder.create().texOffs(104, 77).addBox(-2.0F, -4.0F, 0.0F, 4.0F, 8.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.9064F, -16.7309F, 0.0F, 0.0F, 0.0F, -1.1781F));

		PartDefinition rotation_parts_r14 = rotation_parts.addOrReplaceChild("rotation_parts_r14",
				CubeListBuilder.create().texOffs(104, 77).addBox(-4.0F, -2.0F, 0.0F, 9.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0237F, -18.1094F, 0.0F, 0.0F, 0.0F, -1.5708F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rotation_parts.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.rotation_parts.yRot = ageInTicks;
	}
}