package com.test.testmod.client.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.test.testmod.TestMod;
import com.test.testmod.client.animation.CrocodileAnimation;
import com.test.testmod.entity.Crocodile;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

public class CrocodileModel<T extends Crocodile> extends HierarchicalModel<T> {
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(TestMod.MODID, "crocodile"), "main");
	private final ModelParts parts;

	public CrocodileModel(ModelPart root) {
		ModelPart loot = root.getChild("loot");
		ModelPart head = loot.getChild("head");
		ModelPart body = loot.getChild("body");
		ModelPart leg = loot.getChild("leg");

		this.parts = new ModelParts(loot, head, body, leg);
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition loot = partdefinition.addOrReplaceChild("loot", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = loot.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -8.0F, -6.0F, 12.0F, 7.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition teil = body.addOrReplaceChild("teil", CubeListBuilder.create().texOffs(30, 35).addBox(-1.0F, -2.0F, 0.5F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F))
				.texOffs(0, 34).addBox(-2.0F, 0.0F, 0.5F, 4.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -5.0F, 7.5F));

		PartDefinition leg = loot.addOrReplaceChild("leg", CubeListBuilder.create().texOffs(24, 21).addBox(-8.0F, -4.0F, -4.0F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 6).addBox(5.0F, -4.0F, -4.0F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(5.0F, -4.0F, 4.0F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 21).addBox(-8.0F, -4.0F, 4.0F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition head = loot.addOrReplaceChild("head", CubeListBuilder.create().texOffs(24, 22).addBox(-3.0F, -7.0F, -18.0F, 6.0F, 1.0F, 12.0F, new CubeDeformation(0.0F))
				.texOffs(0, 21).addBox(-3.0F, -3.0F, -18.0F, 6.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		root().getAllParts().forEach(ModelPart::resetPose);

		animate(entity.idleAnimationState, CrocodileAnimation.IDEL, ageInTicks);
		if (!entity.isInWaterOrBubble()) {
			animateWalk(CrocodileAnimation.WALK, limbSwing, limbSwingAmount, 1.0F, 2.5F);
		} else {
			// TODO: Swim animation
		}

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		this.parts.loot().render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return this.parts.loot();
	}

	private record ModelParts(ModelPart loot,ModelPart head, ModelPart body, ModelPart leg) {}
}