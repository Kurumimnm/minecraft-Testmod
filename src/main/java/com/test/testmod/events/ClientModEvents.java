package com.test.testmod.events;

import com.test.testmod.TestMod;
import com.test.testmod.client.model.TestEntityModel;
import com.test.testmod.client.model.CrocodileModel;
import com.test.testmod.client.model.TestVillagerModel;
import com.test.testmod.client.renderer.CrocodileRenderer;
import com.test.testmod.client.renderer.TestEntityRenderer;
import com.test.testmod.client.renderer.TestVillagerRenderer;
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
        event.registerEntityRenderer(EntityInit.CROCODILE.get(), CrocodileRenderer::new);
        event.registerEntityRenderer(EntityInit.TEST_VILLAGER.get(), TestVillagerRenderer::new);
    }

    @SubscribeEvent
    public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(TestEntityModel.LAYER_LOCATION, TestEntityModel::createBodyLayer);
        event.registerLayerDefinition(CrocodileModel.LAYER_LOCATION, CrocodileModel::createBodyLayer);
        event.registerLayerDefinition(TestVillagerModel.LAYER_LOCATION, TestVillagerModel::createBodyLayer);
    }
}
