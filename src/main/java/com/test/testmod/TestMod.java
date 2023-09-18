package com.test.testmod;

import com.test.testmod.init.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(TestMod.MODID)
public class TestMod {
    public static final String MODID = "testmod";

    public TestMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ItemInit.ITEMS.register(bus);
        BlockItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);
        ToolInit.ITEMS.register(bus);
        ArmorInit.ITEMS.register(bus);
        CreativeTabInit.TABS.register(bus);
    }
}
