package com.test.testmod.client.renderer;

import com.test.testmod.TestMod;
import com.test.testmod.client.model.CrocodileModel;
import com.test.testmod.client.model.TestVillagerModel;
import com.test.testmod.entity.Crocodile;
import com.test.testmod.entity.TestVillager;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class TestVillagerRenderer extends MobRenderer<TestVillager, TestVillagerModel<TestVillager>> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(TestMod.MODID, "textures/entity/test_villager.png");

    public TestVillagerRenderer(EntityRendererProvider.Context ctx) {
        super(ctx, new TestVillagerModel<>(ctx.bakeLayer(TestVillagerModel.LAYER_LOCATION)), 1.0f);
    }

    @Override
    public ResourceLocation getTextureLocation(TestVillager entity) {
        return TEXTURE;
    }
}

