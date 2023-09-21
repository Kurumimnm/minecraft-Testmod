package com.test.testmod.client.renderer;

import com.test.testmod.TestMod;
import com.test.testmod.client.model.CrocodileModel;
import com.test.testmod.entity.Crocodile;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class CrocodileRenderer extends MobRenderer<Crocodile, CrocodileModel<Crocodile>> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(TestMod.MODID, "textures/entity/crocodile.png");

    public CrocodileRenderer(EntityRendererProvider.Context ctx) {
        super(ctx, new CrocodileModel<>(ctx.bakeLayer(CrocodileModel.LAYER_LOCATION)), 1.0f);
    }

    @Override
    public ResourceLocation getTextureLocation(Crocodile entity) {
        return TEXTURE;
    }
}

