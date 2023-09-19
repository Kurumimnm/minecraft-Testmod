package com.test.testmod.client.renderer;

import com.test.testmod.TestMod;
import com.test.testmod.client.model.TestEntityModel;
import com.test.testmod.entity.TestEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class TestEntityRenderer extends MobRenderer<TestEntity, TestEntityModel<TestEntity>> {

    public static final ResourceLocation TEXTURE = new ResourceLocation(TestMod.MODID, "textures/entity/test_entity.png");

    public TestEntityRenderer(EntityRendererProvider.Context ctx) {
        super(ctx, new TestEntityModel<>(ctx.bakeLayer(TestEntityModel.LAYER_LOCATION)), 1.0f);
    }

    @Override
    public ResourceLocation getTextureLocation(TestEntity entity) {
        return TEXTURE;
    }
}
