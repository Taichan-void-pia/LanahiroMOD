// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelseahorsenightmare<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "seahorsenightmare"), "main");
	private final ModelPart bone;
	private final ModelPart bone3;

	public Modelseahorsenightmare(ModelPart root) {
		this.bone = root.getChild("bone");
		this.bone3 = root.getChild("bone3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(170, 123)
				.addBox(-2.0F, -9.8281F, 14.6137F, 4.0F, 7.0F, 5.0F, new CubeDeformation(-0.2F)),
				PartPose.offset(0.0F, 16.0F, -3.0F));

		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(52, 132).addBox(-3.5F, -11.5F, -7.25F, 6.0F, 9.0F, 8.0F,
						new CubeDeformation(-1.2F)),
				PartPose.offsetAndRotation(0.5F, -26.5F, 0.5F, 0.0873F, 0.7418F, 0.0F));

		PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(137, 51).addBox(-2.5F, -11.5F, -7.25F, 6.0F, 9.0F, 8.0F,
						new CubeDeformation(-1.2F)),
				PartPose.offsetAndRotation(-0.5F, -26.5F, 0.5F, 0.0873F, -0.7418F, 0.0F));

		PartDefinition cube_r3 = bone.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(124, 138).addBox(-2.5F, -11.5F, -7.25F, 6.0F, 9.0F, 8.0F,
						new CubeDeformation(0.4F)),
				PartPose.offsetAndRotation(-0.5F, -26.5F, 0.5F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(32, 123).addBox(-3.5F, -8.5F, -5.5F, 6.0F, 9.0F, 8.0F,
						new CubeDeformation(-1.2F)),
				PartPose.offsetAndRotation(0.5F, -26.5F, 0.5F, 0.2618F, 0.829F, 0.0F));

		PartDefinition cube_r5 = bone.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(133, 95).addBox(-2.5F, -8.5F, -5.5F, 6.0F, 9.0F, 8.0F,
						new CubeDeformation(-1.2F)),
				PartPose.offsetAndRotation(-0.5F, -26.5F, 0.5F, 0.2618F, -0.829F, 0.0F));

		PartDefinition cube_r6 = bone.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(28, 141).addBox(-2.5F, -8.5F, -5.5F, 6.0F, 9.0F, 8.0F,
						new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.5F, -26.5F, 0.5F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r7 = bone.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(123, 121).addBox(-3.5F, -3.5F, -4.5F, 6.0F, 9.0F, 8.0F,
						new CubeDeformation(-1.2F)),
				PartPose.offsetAndRotation(0.5F, -26.5F, 0.5F, 0.48F, 0.7418F, 0.0F));

		PartDefinition cube_r8 = bone.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(0, 134).addBox(-2.5F, -3.5F, -4.5F, 6.0F, 9.0F, 8.0F,
						new CubeDeformation(-1.2F)),
				PartPose.offsetAndRotation(-0.5F, -26.5F, 0.5F, 0.48F, -0.7418F, 0.0F));

		PartDefinition cube_r9 = bone
				.addOrReplaceChild("cube_r9",
						CubeListBuilder.create().texOffs(138, 17).addBox(-2.5F, -3.5F, -4.5F, 6.0F, 9.0F, 8.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(-0.5F, -26.5F, 0.5F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r10 = bone.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(143, 112)
						.addBox(-3.0F, -5.5F, -3.5F, 6.0F, 9.0F, 7.0F, new CubeDeformation(-1.2F)).texOffs(145, 148)
						.addBox(-3.0F, -5.5F, -3.5F, 6.0F, 9.0F, 7.0F, new CubeDeformation(-1.2F)),
				PartPose.offsetAndRotation(0.0F, -19.6367F, 9.1902F, 1.2217F, 0.7418F, 0.0F));

		PartDefinition cube_r11 = bone.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(0, 151)
						.addBox(-3.0F, -5.5F, -3.5F, 6.0F, 9.0F, 7.0F, new CubeDeformation(-1.2F)).texOffs(151, 128)
						.addBox(-3.0F, -5.5F, -3.5F, 6.0F, 9.0F, 7.0F, new CubeDeformation(-1.2F)),
				PartPose.offsetAndRotation(0.0F, -19.6367F, 9.1902F, 1.2217F, -0.7418F, 0.0F));

		PartDefinition cube_r12 = bone.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(49, 153)
						.addBox(-3.0F, -5.5F, -3.5F, 6.0F, 9.0F, 7.0F, new CubeDeformation(-0.4F)).texOffs(153, 83)
						.addBox(-3.0F, -5.5F, -3.5F, 6.0F, 9.0F, 7.0F, new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(0.0F, -19.6367F, 9.1902F, 1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r13 = bone.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(45, 23).addBox(-2.0F, -3.5F, -2.0F, 4.0F, 7.0F, 4.0F,
						new CubeDeformation(-1.2F)),
				PartPose.offsetAndRotation(0.0F, 5.2703F, 9.6051F, -1.309F, 0.7418F, 0.0F));

		PartDefinition cube_r14 = bone.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(63, 171).addBox(-2.0F, -3.5F, -2.0F, 4.0F, 7.0F, 4.0F,
						new CubeDeformation(-1.2F)),
				PartPose.offsetAndRotation(0.0F, 5.2703F, 9.6051F, -1.309F, -0.7418F, 0.0F));

		PartDefinition cube_r15 = bone.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(172, 76).addBox(-2.0F, -3.5F, -2.0F, 4.0F, 7.0F, 4.0F,
						new CubeDeformation(-0.81F)),
				PartPose.offsetAndRotation(0.0F, 5.2703F, 9.6051F, -1.309F, 0.0F, 0.0F));

		PartDefinition cube_r16 = bone.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(99, 0).addBox(-2.0F, -0.5F, -2.5F, 4.0F, 5.0F, 3.0F,
						new CubeDeformation(-1.2F)),
				PartPose.offsetAndRotation(0.0F, 7.21F, 7.4454F, -1.789F, 0.7418F, 0.0F));

		PartDefinition cube_r17 = bone.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(101, 107).addBox(-2.0F, -0.5F, -2.5F, 4.0F, 5.0F, 3.0F,
						new CubeDeformation(-1.2F)),
				PartPose.offsetAndRotation(0.0F, 7.21F, 7.4454F, -1.789F, -0.7418F, 0.0F));

		PartDefinition cube_r18 = bone.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(114, 121).addBox(-2.0F, -0.5F, -2.5F, 4.0F, 5.0F, 3.0F,
						new CubeDeformation(-0.86F)),
				PartPose.offsetAndRotation(0.0F, 7.21F, 7.4454F, -1.789F, 0.0F, 0.0F));

		PartDefinition cube_r19 = bone.addOrReplaceChild("cube_r19",
				CubeListBuilder.create().texOffs(61, 66).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(-1.2F)),
				PartPose.offsetAndRotation(0.05F, 1.3996F, 5.5779F, 0.7854F, 0.7418F, 0.0F));

		PartDefinition cube_r20 = bone.addOrReplaceChild("cube_r20",
				CubeListBuilder.create().texOffs(77, 19).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(-1.2F)),
				PartPose.offsetAndRotation(-0.05F, 1.3996F, 5.5779F, 0.7854F, -0.7418F, 0.0F));

		PartDefinition cube_r21 = bone.addOrReplaceChild("cube_r21",
				CubeListBuilder.create().texOffs(23, 89).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(-0.48F)),
				PartPose.offsetAndRotation(-0.05F, 1.3996F, 5.5779F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r22 = bone.addOrReplaceChild("cube_r22",
				CubeListBuilder.create().texOffs(0, 70).addBox(-1.0F, -1.25F, -0.75F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(-1.2F)),
				PartPose.offsetAndRotation(0.05F, 1.0765F, 3.9444F, 1.5708F, 0.7418F, 0.0F));

		PartDefinition cube_r23 = bone.addOrReplaceChild("cube_r23",
				CubeListBuilder.create().texOffs(36, 78).addBox(-1.0F, -1.25F, -0.75F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(-1.2F)),
				PartPose.offsetAndRotation(-0.05F, 1.0765F, 3.9444F, 1.5708F, -0.7418F, 0.0F));

		PartDefinition cube_r24 = bone.addOrReplaceChild("cube_r24",
				CubeListBuilder.create().texOffs(78, 102).addBox(-1.0F, -1.25F, -0.75F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(-0.47F)),
				PartPose.offsetAndRotation(-0.05F, 1.0765F, 3.9444F, 1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r25 = bone.addOrReplaceChild("cube_r25",
				CubeListBuilder.create().texOffs(61, 71).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(-1.2F)),
				PartPose.offsetAndRotation(0.05F, 1.2916F, 2.8115F, 2.3387F, 0.7418F, 0.0F));

		PartDefinition cube_r26 = bone.addOrReplaceChild("cube_r26",
				CubeListBuilder.create().texOffs(68, 85).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(-1.2F)),
				PartPose.offsetAndRotation(-0.05F, 1.2916F, 2.8115F, 2.3387F, -0.7418F, 0.0F));

		PartDefinition cube_r27 = bone.addOrReplaceChild("cube_r27",
				CubeListBuilder.create().texOffs(0, 106).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(-0.45F)),
				PartPose.offsetAndRotation(-0.05F, 1.2916F, 2.8115F, 2.3387F, 0.0F, 0.0F));

		PartDefinition cube_r28 = bone.addOrReplaceChild("cube_r28",
				CubeListBuilder.create().texOffs(0, 75).addBox(-0.8F, -0.6F, -2.5F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(-1.2F)),
				PartPose.offsetAndRotation(-0.2F, 3.5741F, 0.6535F, 3.1416F, 0.7418F, 0.0F));

		PartDefinition cube_r29 = bone.addOrReplaceChild("cube_r29",
				CubeListBuilder.create().texOffs(0, 89).addBox(-1.2F, -0.6F, -2.5F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(-1.2F)),
				PartPose.offsetAndRotation(0.2F, 3.5741F, 0.6535F, 3.1416F, -0.7418F, 0.0F));

		PartDefinition cube_r30 = bone.addOrReplaceChild("cube_r30",
				CubeListBuilder.create().texOffs(109, 59).addBox(-1.2F, -0.6F, -2.5F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(-0.45F)),
				PartPose.offsetAndRotation(0.2F, 3.5741F, 0.6535F, 3.1416F, 0.0F, 0.0F));

		PartDefinition cube_r31 = bone.addOrReplaceChild("cube_r31",
				CubeListBuilder.create().texOffs(38, 0).addBox(-0.1F, -0.5F, -2.25F, 2.0F, 4.0F, 2.0F,
						new CubeDeformation(-1.2F)),
				PartPose.offsetAndRotation(-0.9F, 6.3257F, 3.4273F, -2.3562F, 0.7418F, 0.0F));

		PartDefinition cube_r32 = bone.addOrReplaceChild("cube_r32",
				CubeListBuilder.create().texOffs(0, 46).addBox(-1.9F, -0.5F, -2.25F, 2.0F, 4.0F, 2.0F,
						new CubeDeformation(-1.2F)),
				PartPose.offsetAndRotation(0.9F, 6.3257F, 3.4273F, -2.3562F, -0.7418F, 0.0F));

		PartDefinition cube_r33 = bone.addOrReplaceChild("cube_r33",
				CubeListBuilder.create().texOffs(0, 52).addBox(-1.9F, -0.5F, -2.25F, 2.0F, 4.0F, 2.0F,
						new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(0.9F, 6.3257F, 3.4273F, -2.3562F, 0.0F, 0.0F));

		PartDefinition cube_r34 = bone.addOrReplaceChild("cube_r34",
				CubeListBuilder.create().texOffs(102, 38).addBox(-2.0F, -0.5F, -2.5F, 4.0F, 5.0F, 3.0F,
						new CubeDeformation(-1.2F)),
				PartPose.offsetAndRotation(0.0F, 6.4282F, 7.6076F, -1.5708F, 0.7418F, 0.0F));

		PartDefinition cube_r35 = bone.addOrReplaceChild("cube_r35",
				CubeListBuilder.create().texOffs(113, 0).addBox(-2.0F, -0.5F, -2.5F, 4.0F, 5.0F, 3.0F,
						new CubeDeformation(-1.2F)),
				PartPose.offsetAndRotation(0.0F, 6.4282F, 7.6076F, -1.5708F, -0.7418F, 0.0F));

		PartDefinition cube_r36 = bone.addOrReplaceChild("cube_r36",
				CubeListBuilder.create().texOffs(123, 95).addBox(-2.0F, -0.5F, -2.5F, 4.0F, 5.0F, 3.0F,
						new CubeDeformation(-0.85F)),
				PartPose.offsetAndRotation(0.0F, 6.4282F, 7.6076F, -1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r37 = bone.addOrReplaceChild("cube_r37",
				CubeListBuilder.create().texOffs(63, 0).addBox(-2.0F, -0.5F, -2.5F, 4.0F, 7.0F, 4.0F,
						new CubeDeformation(-1.2F)),
				PartPose.offsetAndRotation(0.0F, 4.3002F, 12.3059F, -1.1781F, 0.7418F, 0.0F));

		PartDefinition cube_r38 = bone.addOrReplaceChild("cube_r38",
				CubeListBuilder.create().texOffs(169, 171).addBox(-2.0F, -0.5F, -2.5F, 4.0F, 7.0F, 4.0F,
						new CubeDeformation(-1.2F)),
				PartPose.offsetAndRotation(0.0F, 4.3002F, 12.3059F, -1.1781F, -0.7418F, 0.0F));

		PartDefinition cube_r39 = bone.addOrReplaceChild("cube_r39",
				CubeListBuilder.create().texOffs(119, 172).addBox(-2.0F, -0.5F, -2.5F, 4.0F, 7.0F, 4.0F,
						new CubeDeformation(-0.8F)),
				PartPose.offsetAndRotation(0.0F, 4.3002F, 12.3059F, -1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r40 = bone.addOrReplaceChild("cube_r40",
				CubeListBuilder.create().texOffs(161, 99).addBox(-2.0F, -1.0F, -2.5F, 4.0F, 7.0F, 5.0F,
						new CubeDeformation(-1.2F)),
				PartPose.offsetAndRotation(0.0F, 0.932F, 15.4155F, -0.7854F, 0.7418F, 0.0F));

		PartDefinition cube_r41 = bone.addOrReplaceChild("cube_r41",
				CubeListBuilder.create().texOffs(166, 46).addBox(-2.0F, -1.0F, -2.5F, 4.0F, 7.0F, 5.0F,
						new CubeDeformation(-1.2F)),
				PartPose.offsetAndRotation(0.0F, 0.932F, 15.4155F, -0.7854F, -0.7418F, 0.0F));

		PartDefinition cube_r42 = bone.addOrReplaceChild("cube_r42",
				CubeListBuilder.create().texOffs(169, 111).addBox(-2.0F, -1.0F, -2.5F, 4.0F, 7.0F, 5.0F,
						new CubeDeformation(-0.6F)),
				PartPose.offsetAndRotation(0.0F, 0.932F, 15.4155F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r43 = bone.addOrReplaceChild("cube_r43",
				CubeListBuilder.create().texOffs(163, 29).addBox(-2.0F, -0.5F, -2.5F, 4.0F, 7.0F, 5.0F,
						new CubeDeformation(-1.2F)),
				PartPose.offsetAndRotation(0.0F, -4.0931F, 17.3653F, -0.3927F, 0.7418F, 0.0F));

		PartDefinition cube_r44 = bone.addOrReplaceChild("cube_r44",
				CubeListBuilder.create().texOffs(0, 167).addBox(-2.0F, -0.5F, -2.5F, 4.0F, 7.0F, 5.0F,
						new CubeDeformation(-1.2F)),
				PartPose.offsetAndRotation(0.0F, -4.0931F, 17.3653F, -0.3927F, -0.7418F, 0.0F));

		PartDefinition cube_r45 = bone.addOrReplaceChild("cube_r45",
				CubeListBuilder.create().texOffs(169, 159).addBox(-2.0F, -0.5F, -2.5F, 4.0F, 7.0F, 5.0F,
						new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(0.0F, -4.0931F, 17.3653F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r46 = bone.addOrReplaceChild("cube_r46",
				CubeListBuilder.create().texOffs(151, 164).addBox(-2.0F, 0.0F, -2.5F, 4.0F, 7.0F, 5.0F,
						new CubeDeformation(-1.2F)),
				PartPose.offsetAndRotation(0.0F, -9.8281F, 17.1137F, 0.0F, 0.7418F, 0.0F));

		PartDefinition cube_r47 = bone.addOrReplaceChild("cube_r47",
				CubeListBuilder.create().texOffs(101, 167).addBox(-2.0F, 0.0F, -2.5F, 4.0F, 7.0F, 5.0F,
						new CubeDeformation(-1.2F)),
				PartPose.offsetAndRotation(0.0F, -9.8281F, 17.1137F, 0.0F, -0.7418F, 0.0F));

		PartDefinition cube_r48 = bone.addOrReplaceChild("cube_r48",
				CubeListBuilder.create().texOffs(166, 16).addBox(-2.0F, 0.5F, -2.5F, 4.0F, 7.0F, 5.0F,
						new CubeDeformation(-1.2F)),
				PartPose.offsetAndRotation(0.0F, -15.3005F, 14.4339F, 0.3927F, 0.7418F, 0.0F));

		PartDefinition cube_r49 = bone.addOrReplaceChild("cube_r49",
				CubeListBuilder.create().texOffs(45, 169).addBox(-2.0F, 0.5F, -2.5F, 4.0F, 7.0F, 5.0F,
						new CubeDeformation(-1.2F)),
				PartPose.offsetAndRotation(0.0F, -15.3005F, 14.4339F, 0.3927F, -0.7418F, 0.0F));

		PartDefinition cube_r50 = bone.addOrReplaceChild("cube_r50",
				CubeListBuilder.create().texOffs(171, 144).addBox(-2.0F, 0.5F, -2.5F, 4.0F, 7.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -15.3005F, 14.4339F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r51 = bone.addOrReplaceChild("cube_r51",
				CubeListBuilder.create().texOffs(73, 144).addBox(-3.0F, 0.5F, -3.5F, 6.0F, 9.0F, 7.0F,
						new CubeDeformation(-1.2F)),
				PartPose.offsetAndRotation(0.0F, -19.6367F, 9.1902F, 0.7854F, 0.7418F, 0.0F));

		PartDefinition cube_r52 = bone.addOrReplaceChild("cube_r52",
				CubeListBuilder.create().texOffs(99, 151).addBox(-3.0F, 0.5F, -3.5F, 6.0F, 9.0F, 7.0F,
						new CubeDeformation(-1.2F)),
				PartPose.offsetAndRotation(0.0F, -19.6367F, 9.1902F, 0.7854F, -0.7418F, 0.0F));

		PartDefinition cube_r53 = bone.addOrReplaceChild("cube_r53",
				CubeListBuilder.create().texOffs(152, 0).addBox(-3.0F, 0.5F, -3.5F, 6.0F, 9.0F, 7.0F,
						new CubeDeformation(-0.6F)),
				PartPose.offsetAndRotation(0.0F, -19.6367F, 9.1902F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r54 = bone.addOrReplaceChild("cube_r54",
				CubeListBuilder.create().texOffs(124, 0).addBox(-3.5F, 0.25F, -5.25F, 6.0F, 9.0F, 8.0F,
						new CubeDeformation(-1.2F)),
				PartPose.offsetAndRotation(0.5F, -26.5F, 0.5F, 0.9163F, 0.7418F, 0.0873F));

		PartDefinition cube_r55 = bone.addOrReplaceChild("cube_r55",
				CubeListBuilder.create().texOffs(96, 134).addBox(-2.5F, 0.25F, -5.25F, 6.0F, 9.0F, 8.0F,
						new CubeDeformation(-1.2F)),
				PartPose.offsetAndRotation(-0.5F, -26.5F, 0.5F, 0.9163F, -0.7418F, -0.0873F));

		PartDefinition cube_r56 = bone.addOrReplaceChild("cube_r56",
				CubeListBuilder.create().texOffs(143, 34).addBox(-2.5F, 0.25F, -5.25F, 6.0F, 9.0F, 8.0F,
						new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(-0.5F, -26.5F, 0.5F, 0.9163F, 0.0F, 0.0F));

		PartDefinition bone2 = bone.addOrReplaceChild("bone2", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone3 = partdefinition.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(137, 70)
				.addBox(-4.0F, -49.0F, -11.0F, 7.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(91, 121)
				.addBox(-4.0F, -49.0F, -11.0F, 7.0F, 4.0F, 9.0F, new CubeDeformation(-0.7F)).texOffs(79, 175)
				.addBox(-1.5F, -41.4182F, -19.5331F, 2.0F, 14.0F, 1.0F, new CubeDeformation(-0.12F)).texOffs(0, 9)
				.addBox(-1.5F, -28.4182F, -19.5331F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.3F)).texOffs(38, 175)
				.addBox(-1.5F, -41.4182F, -17.4583F, 2.0F, 14.0F, 1.0F, new CubeDeformation(-0.12F)).texOffs(27, 4)
				.addBox(-1.5F, -28.4182F, -16.4583F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.3F)),
				PartPose.offset(0.5F, 24.0F, 0.0F));

		PartDefinition cube_r57 = bone3.addOrReplaceChild("cube_r57",
				CubeListBuilder.create().texOffs(27, 23)
						.addBox(-0.5F, 6.0F, -0.5F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.31F)).texOffs(45, 158)
						.addBox(-0.5F, -7.0F, -0.5F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.12F)),
				PartPose.offsetAndRotation(-1.38F, -34.4182F, -18.8757F, 0.0F, 0.7854F, 0.0F));

		PartDefinition cube_r58 = bone3.addOrReplaceChild("cube_r58",
				CubeListBuilder.create().texOffs(27, 0)
						.addBox(-1.5F, 6.0F, -0.5F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.3F)).texOffs(32, 175)
						.addBox(-1.5F, -7.0F, -0.5F, 2.0F, 14.0F, 1.0F, new CubeDeformation(-0.12F)),
				PartPose.offsetAndRotation(-1.5374F, -34.4182F, -18.4957F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r59 = bone3.addOrReplaceChild("cube_r59",
				CubeListBuilder.create().texOffs(27, 2)
						.addBox(-0.5F, 6.0F, -0.5F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.3F)).texOffs(26, 175)
						.addBox(-0.5F, -7.0F, -0.5F, 2.0F, 14.0F, 1.0F, new CubeDeformation(-0.12F)),
				PartPose.offsetAndRotation(0.5374F, -34.4182F, -18.4957F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r60 = bone3.addOrReplaceChild("cube_r60",
				CubeListBuilder.create().texOffs(27, 9)
						.addBox(-0.5F, 6.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.31F)).texOffs(85, 175)
						.addBox(-0.5F, -7.0F, -0.5F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.12F)),
				PartPose.offsetAndRotation(0.38F, -34.4182F, -18.8757F, 0.0F, -0.7854F, 0.0F));

		PartDefinition cube_r61 = bone3.addOrReplaceChild("cube_r61",
				CubeListBuilder.create().texOffs(6, 23)
						.addBox(-0.5F, 6.0F, 0.5F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.31F)).texOffs(92, 136)
						.addBox(-0.5F, -7.0F, -0.5F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.12F)),
				PartPose.offsetAndRotation(-1.38F, -34.4182F, -17.1157F, 0.0F, -0.7854F, 0.0F));

		PartDefinition cube_r62 = bone3.addOrReplaceChild("cube_r62",
				CubeListBuilder.create().texOffs(160, 61).addBox(-3.0F, -3.1318F, -7.174F, 6.0F, 8.0F, 7.0F,
						new CubeDeformation(-0.7F)),
				PartPose.offsetAndRotation(-0.5F, -42.4182F, -18.5331F, 1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r63 = bone3.addOrReplaceChild("cube_r63",
				CubeListBuilder.create().texOffs(7, 8)
						.addBox(-0.5F, 6.0F, 0.5F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.31F)).texOffs(28, 134)
						.addBox(-0.5F, -7.0F, -0.5F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.12F)),
				PartPose.offsetAndRotation(0.38F, -34.4182F, -17.1157F, 0.0F, 0.7854F, 0.0F));

		PartDefinition cube_r64 = bone3.addOrReplaceChild("cube_r64",
				CubeListBuilder.create().texOffs(32, 89).addBox(-0.12F, 1.0F, 1.1245F, 1.0F, 14.0F, 1.0F,
						new CubeDeformation(-0.7F)),
				PartPose.offsetAndRotation(-0.5F, -42.4182F, -18.5331F, 0.0F, -0.7854F, 0.0F));

		PartDefinition cube_r65 = bone3.addOrReplaceChild("cube_r65",
				CubeListBuilder.create().texOffs(6, 0)
						.addBox(-0.88F, 14.0F, 1.1245F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.7F)).texOffs(118, 59)
						.addBox(-0.88F, 1.0F, 1.1245F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.7F)),
				PartPose.offsetAndRotation(-0.5F, -42.4182F, -18.5331F, 0.0F, 0.7854F, 0.0F));

		PartDefinition cube_r66 = bone3.addOrReplaceChild("cube_r66",
				CubeListBuilder.create().texOffs(125, 157).addBox(-3.0F, -4.0F, -2.25F, 6.0F, 8.0F, 7.0F,
						new CubeDeformation(-0.06F)),
				PartPose.offsetAndRotation(-0.5F, -37.4182F, -18.5331F, -1.7453F, 0.0436F, 3.1416F));

		PartDefinition cube_r67 = bone3.addOrReplaceChild("cube_r67",
				CubeListBuilder.create().texOffs(19, 160).addBox(-3.0F, -4.0F, -2.25F, 6.0F, 8.0F, 7.0F,
						new CubeDeformation(-0.06F)),
				PartPose.offsetAndRotation(-0.5F, -37.4182F, -18.5331F, -1.7453F, -0.0436F, -3.1416F));

		PartDefinition cube_r68 = bone3.addOrReplaceChild("cube_r68",
				CubeListBuilder.create().texOffs(75, 160).addBox(-3.0F, -4.0F, -2.25F, 6.0F, 8.0F, 7.0F,
						new CubeDeformation(-0.06F)),
				PartPose.offsetAndRotation(-0.5F, -37.4182F, -18.5331F, 1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r69 = bone3.addOrReplaceChild("cube_r69",
				CubeListBuilder.create().texOffs(52, 47).addBox(-3.5F, -3.5228F, -3.6651F, 7.0F, 8.0F, 11.0F,
						new CubeDeformation(-0.7F)),
				PartPose.offsetAndRotation(-0.5F, -42.4182F, -18.5331F, 0.5236F, 0.0436F, 3.1416F));

		PartDefinition cube_r70 = bone3.addOrReplaceChild("cube_r70",
				CubeListBuilder.create().texOffs(61, 66).addBox(-3.5F, -3.5228F, -3.6651F, 7.0F, 8.0F, 11.0F,
						new CubeDeformation(-0.7F)),
				PartPose.offsetAndRotation(-0.5F, -42.4182F, -18.5331F, 0.5236F, -0.0436F, -3.1416F));

		PartDefinition cube_r71 = bone3.addOrReplaceChild("cube_r71",
				CubeListBuilder.create().texOffs(74, 0).addBox(-3.5F, -3.5228F, -3.6651F, 7.0F, 8.0F, 11.0F,
						new CubeDeformation(-0.7F)),
				PartPose.offsetAndRotation(-0.5F, -42.4182F, -18.5331F, -2.618F, 0.0F, 0.0F));

		PartDefinition cube_r72 = bone3.addOrReplaceChild("cube_r72",
				CubeListBuilder.create().texOffs(25, 59).addBox(-3.0F, -10.5F, 3.25F, 7.0F, 8.0F, 11.0F,
						new CubeDeformation(-0.12F)),
				PartPose.offsetAndRotation(-1.0F, -51.9182F, -16.0331F, 0.5236F, 0.0436F, 3.1416F));

		PartDefinition cube_r73 = bone3.addOrReplaceChild("cube_r73",
				CubeListBuilder.create().texOffs(0, 70).addBox(-4.0F, -10.5F, 3.25F, 7.0F, 8.0F, 11.0F,
						new CubeDeformation(-0.12F)),
				PartPose.offsetAndRotation(0.0F, -51.9182F, -16.0331F, 0.5236F, -0.0436F, -3.1416F));

		PartDefinition cube_r74 = bone3.addOrReplaceChild("cube_r74",
				CubeListBuilder.create().texOffs(77, 35).addBox(-4.0F, -10.5F, 3.25F, 7.0F, 8.0F, 11.0F,
						new CubeDeformation(-0.12F)),
				PartPose.offsetAndRotation(0.0F, -51.9182F, -16.0331F, -2.618F, 0.0F, 0.0F));

		PartDefinition cube_r75 = bone3.addOrReplaceChild("cube_r75",
				CubeListBuilder.create().texOffs(27, 35).addBox(-3.5F, -3.5835F, -3.0009F, 7.0F, 12.0F, 11.0F,
						new CubeDeformation(-0.7F)),
				PartPose.offsetAndRotation(-0.5F, -42.4182F, -18.5331F, -0.4363F, 0.0436F, 3.1416F));

		PartDefinition cube_r76 = bone3.addOrReplaceChild("cube_r76",
				CubeListBuilder.create().texOffs(38, 0).addBox(-3.5F, -3.5835F, -3.0009F, 7.0F, 12.0F, 11.0F,
						new CubeDeformation(-0.7F)),
				PartPose.offsetAndRotation(-0.5F, -42.4182F, -18.5331F, -0.4363F, -0.0436F, -3.1416F));

		PartDefinition cube_r77 = bone3.addOrReplaceChild("cube_r77",
				CubeListBuilder.create().texOffs(0, 47).addBox(-3.5F, -3.5835F, -3.0009F, 7.0F, 12.0F, 11.0F,
						new CubeDeformation(-0.7F)),
				PartPose.offsetAndRotation(-0.5F, -42.4182F, -18.5331F, 2.7053F, 0.0F, 0.0F));

		PartDefinition cube_r78 = bone3.addOrReplaceChild("cube_r78",
				CubeListBuilder.create().texOffs(121, 25)
						.addBox(-3.75F, -7.25F, -16.75F, 2.0F, 2.0F, 13.0F, new CubeDeformation(-0.1F)).texOffs(0, 23)
						.addBox(-5.0F, -13.25F, -4.75F, 8.0F, 12.0F, 11.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(0.0F, -51.9182F, -16.0331F, -0.4363F, -0.0436F, -3.1416F));

		PartDefinition cube_r79 = bone3.addOrReplaceChild("cube_r79",
				CubeListBuilder.create().texOffs(74, 121)
						.addBox(1.75F, -7.25F, -16.75F, 2.0F, 2.0F, 13.0F, new CubeDeformation(-0.1F)).texOffs(0, 0)
						.addBox(-3.0F, -13.25F, -4.75F, 8.0F, 12.0F, 11.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(-1.0F, -51.9182F, -16.0331F, -0.4363F, 0.0436F, 3.1416F));

		PartDefinition cube_r80 = bone3.addOrReplaceChild("cube_r80",
				CubeListBuilder.create().texOffs(245, 0).addBox(-1.0F, -1.25F, -1.5F, 3.0F, 3.0F, 3.0F,
						new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(-4.0F, -37.5993F, -20.2275F, 2.9234F, 1.0036F, 0.48F));

		PartDefinition cube_r81 = bone3.addOrReplaceChild("cube_r81",
				CubeListBuilder.create().texOffs(245, 0).mirror()
						.addBox(-2.0F, -1.25F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false),
				PartPose.offsetAndRotation(3.0F, -37.5993F, -20.2275F, 2.9234F, -1.0036F, -0.48F));

		PartDefinition cube_r82 = bone3.addOrReplaceChild("cube_r82",
				CubeListBuilder.create().texOffs(52, 23).addBox(-4.0F, -13.25F, -4.75F, 7.0F, 12.0F, 11.0F,
						new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(0.0F, -51.9182F, -16.0331F, 2.7053F, 0.0F, 0.0F));

		PartDefinition cube_r83 = bone3.addOrReplaceChild("cube_r83",
				CubeListBuilder.create().texOffs(86, 57).addBox(-3.5F, 2.2128F, 2.169F, 7.0F, 8.0F, 9.0F,
						new CubeDeformation(-0.7F)),
				PartPose.offsetAndRotation(-0.5F, -42.4182F, -18.5331F, 2.138F, 0.0F, 0.0F));

		PartDefinition cube_r84 = bone3.addOrReplaceChild("cube_r84",
				CubeListBuilder.create().texOffs(36, 78)
						.addBox(-3.0F, -5.0F, -4.5F, 7.0F, 8.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(2.0F, 3.0F, -4.5F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -51.9182F, -16.0331F, -1.0036F, 0.0436F, -3.1416F));

		PartDefinition cube_r85 = bone3.addOrReplaceChild("cube_r85",
				CubeListBuilder.create().texOffs(0, 23)
						.addBox(-4.0F, 3.0F, -4.5F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(68, 85)
						.addBox(-4.0F, -5.0F, -4.5F, 7.0F, 8.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -51.9182F, -16.0331F, -1.0036F, -0.0436F, 3.1416F));

		PartDefinition cube_r86 = bone3.addOrReplaceChild("cube_r86",
				CubeListBuilder.create().texOffs(0, 89).addBox(-4.0F, -5.0F, -4.5F, 7.0F, 8.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -51.9182F, -16.0331F, 2.138F, 0.0F, 0.0F));

		PartDefinition cube_r87 = bone3.addOrReplaceChild("cube_r87",
				CubeListBuilder.create().texOffs(78, 107).addBox(-3.5F, 4.4764F, 5.4255F, 7.0F, 5.0F, 9.0F,
						new CubeDeformation(-0.7F)),
				PartPose.offsetAndRotation(-0.5F, -42.4182F, -18.5331F, 1.7017F, 0.0F, 0.0F));

		PartDefinition cube_r88 = bone3.addOrReplaceChild("cube_r88",
				CubeListBuilder.create().texOffs(91, 76)
						.addBox(-3.0F, -2.0F, -4.5F, 7.0F, 5.0F, 9.0F, new CubeDeformation(-0.04F)).texOffs(27, 0)
						.addBox(2.0F, 1.0F, 3.5F, 2.0F, 2.0F, 7.0F, new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(-1.0F, -53.1042F, -13.4076F, -1.4399F, 0.0436F, -3.1416F));

		PartDefinition cube_r89 = bone3.addOrReplaceChild("cube_r89",
				CubeListBuilder.create().texOffs(77, 19)
						.addBox(-4.0F, -2.0F, -4.5F, 7.0F, 5.0F, 9.0F, new CubeDeformation(-0.04F)).texOffs(27, 23)
						.addBox(-4.0F, 1.0F, 3.5F, 2.0F, 2.0F, 7.0F, new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(0.0F, -53.1042F, -13.4076F, -1.4399F, -0.0436F, 3.1416F));

		PartDefinition cube_r90 = bone3.addOrReplaceChild("cube_r90",
				CubeListBuilder.create().texOffs(114, 65).addBox(-4.0F, -2.0F, -4.5F, 7.0F, 5.0F, 9.0F,
						new CubeDeformation(-0.04F)),
				PartPose.offsetAndRotation(0.0F, -53.1042F, -13.4076F, 1.7017F, 0.0F, 0.0F));

		PartDefinition cube_r91 = bone3.addOrReplaceChild("cube_r91",
				CubeListBuilder.create().texOffs(32, 109).addBox(-3.5F, 0.8984F, 8.2054F, 7.0F, 5.0F, 9.0F,
						new CubeDeformation(-0.7F)),
				PartPose.offsetAndRotation(-0.5F, -42.4182F, -18.5331F, 1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r92 = bone3.addOrReplaceChild("cube_r92",
				CubeListBuilder.create().texOffs(91, 93).addBox(-3.0F, -2.0F, -4.5F, 7.0F, 5.0F, 9.0F,
						new CubeDeformation(-0.07F)),
				PartPose.offsetAndRotation(-1.0F, -53.0473F, -10.9931F, -1.9635F, 0.0436F, -3.1416F));

		PartDefinition cube_r93 = bone3.addOrReplaceChild("cube_r93",
				CubeListBuilder.create().texOffs(102, 24).addBox(-4.0F, -2.0F, -4.5F, 7.0F, 5.0F, 9.0F,
						new CubeDeformation(-0.07F)),
				PartPose.offsetAndRotation(0.0F, -53.0473F, -10.9931F, -1.9635F, -0.0436F, 3.1416F));

		PartDefinition cube_r94 = bone3.addOrReplaceChild("cube_r94",
				CubeListBuilder.create().texOffs(114, 81).addBox(-4.0F, -2.0F, -4.5F, 7.0F, 5.0F, 9.0F,
						new CubeDeformation(-0.07F)),
				PartPose.offsetAndRotation(0.0F, -53.0473F, -10.9931F, 1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r95 = bone3.addOrReplaceChild("cube_r95",
				CubeListBuilder.create().texOffs(109, 45).addBox(-3.5F, -1.2118F, 9.1376F, 7.0F, 5.0F, 9.0F,
						new CubeDeformation(-0.7F)),
				PartPose.offsetAndRotation(-0.5F, -42.4182F, -18.5331F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r96 = bone3.addOrReplaceChild("cube_r96",
				CubeListBuilder.create().texOffs(32, 95)
						.addBox(-3.0F, -2.0F, -4.5F, 7.0F, 5.0F, 9.0F, new CubeDeformation(-0.05F)).texOffs(132, 40)
						.addBox(1.75F, -13.0F, -4.5F, 2.0F, 12.0F, 2.0F, new CubeDeformation(-0.05F)).texOffs(143, 172)
						.addBox(1.75F, -12.0F, 2.5F, 2.0F, 11.0F, 2.0F, new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(-1.0F, -51.5042F, -8.3325F, -2.3562F, 0.0436F, -3.1416F));

		PartDefinition cube_r97 = bone3.addOrReplaceChild("cube_r97",
				CubeListBuilder.create().texOffs(18, 175)
						.addBox(-3.75F, -12.0F, 2.5F, 2.0F, 11.0F, 2.0F, new CubeDeformation(-0.05F)).texOffs(135, 172)
						.addBox(-3.75F, -13.0F, -4.5F, 2.0F, 12.0F, 2.0F, new CubeDeformation(-0.05F)).texOffs(55, 102)
						.addBox(-4.0F, -2.0F, -4.5F, 7.0F, 5.0F, 9.0F, new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(0.0F, -51.5042F, -8.3325F, -2.3562F, -0.0436F, 3.1416F));

		PartDefinition cube_r98 = bone3.addOrReplaceChild("cube_r98",
				CubeListBuilder.create().texOffs(55, 116).addBox(-4.0F, -2.0F, -4.5F, 7.0F, 5.0F, 9.0F,
						new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(0.0F, -51.5042F, -8.3325F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r99 = bone3.addOrReplaceChild("cube_r99",
				CubeListBuilder.create().texOffs(110, 107).addBox(-3.5F, -4.1365F, 8.8694F, 7.0F, 5.0F, 9.0F,
						new CubeDeformation(-0.7F)),
				PartPose.offsetAndRotation(-0.5F, -42.4182F, -18.5331F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r100 = bone3.addOrReplaceChild("cube_r100",
				CubeListBuilder.create().texOffs(101, 10).addBox(-3.0F, -2.0F, -4.5F, 7.0F, 5.0F, 9.0F,
						new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(-1.0F, -49.5084F, -6.9989F, -2.7489F, 0.0436F, 3.1416F));

		PartDefinition cube_r101 = bone3.addOrReplaceChild("cube_r101",
				CubeListBuilder.create().texOffs(0, 106).addBox(-4.0F, -2.0F, -4.5F, 7.0F, 5.0F, 9.0F,
						new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(0.0F, -49.5084F, -6.9989F, -2.7489F, -0.0436F, -3.1416F));

		PartDefinition cube_r102 = bone3.addOrReplaceChild("cube_r102",
				CubeListBuilder.create().texOffs(0, 120).addBox(-4.0F, -2.0F, -4.5F, 7.0F, 5.0F, 9.0F,
						new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(0.0F, -49.5084F, -6.9989F, 0.3927F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}