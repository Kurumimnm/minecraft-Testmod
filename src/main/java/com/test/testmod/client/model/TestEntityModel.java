package com.test.testmod.client.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.test.testmod.TestMod;
import com.test.testmod.entity.TestEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

public class TestEntityModel<T extends TestEntity> extends EntityModel<T> {
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(TestMod.MODID, "test_entity"), "main");
	private final ModelPart bb_main;

	public TestEntityModel(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(30, 30).addBox(3.0F, -8.0F, -7.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(24, 22).addBox(-5.0F, -8.0F, -7.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(8, 0).addBox(3.0F, -8.0F, 5.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-5.0F, -8.0F, 5.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-6.0F, -13.0F, -8.0F, 12.0F, 5.0F, 17.0F, new CubeDeformation(0.0F))
		.texOffs(0, 22).addBox(-3.0F, -19.0F, -12.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}