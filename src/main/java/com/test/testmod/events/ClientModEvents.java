package com.test.testmod.events;

import com.test.testmod.TestMod;
import com.test.testmod.client.model.TestEntityModel;
import com.test.testmod.client.renderer.TestEntityRenderer;
import com.test.testmod.init.EntityInit;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = TestMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientModEvents {
    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(EntityInit.TEST_ENTITY.get(), TestEntityRenderer::new);
    }

    @SubscribeEvent
    public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(TestEntityModel.LAYER_LOCATION, TestEntityModel::createBodyLayer);
    }
}
