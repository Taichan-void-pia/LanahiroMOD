package net.mcreator.ranahiromod.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.4.3
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelphotpn_seeker<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("ranahiromod", "modelphotpn_seeker"), "main");
	public final ModelPart photon_seeker;

	public Modelphotpn_seeker(ModelPart root) {
		this.photon_seeker = root.getChild("photon_seeker");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition photon_seeker = partdefinition.addOrReplaceChild("photon_seeker", CubeListBuilder.create().texOffs(24, 16).addBox(-1.0F, -6.9801F, -5.4882F, 2.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.0199F, 12.0F, 1.4882F));
		PartDefinition cube_r1 = photon_seeker.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(24, 12).addBox(0.0F, 5.75F, 10.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 12).addBox(0.0F, 5.75F, -14.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 22)
						.addBox(0.0F, 2.75F, 6.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 22).addBox(0.0F, 2.75F, -10.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 20)
						.addBox(0.0F, 2.75F, 2.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 19).addBox(0.0F, 2.75F, -6.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 18)
						.addBox(0.0F, 2.75F, -2.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -1.0085F, -6.2266F, 1.5708F, 0.0F, 0.0F));
		PartDefinition cube_r2 = photon_seeker.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(24, 20).addBox(0.0F, 7.0F, -4.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -1.0085F, -6.2266F, 0.6109F, 0.0F, 0.0F));
		PartDefinition cube_r3 = photon_seeker.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(24, 20).mirror().addBox(0.0F, -17.0F, -4.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 1.0482F, -6.2266F, -0.6109F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		photon_seeker.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
