package com.test.testmod;

import com.test.testmod.init.BlockInit;
import com.test.testmod.init.BlockItemInit;
import com.test.testmod.init.CreativeTabInit;
import com.test.testmod.init.ItemInit;
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
        CreativeTabInit.TABS.register(bus);
    }
}
