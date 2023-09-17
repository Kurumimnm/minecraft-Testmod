package com.test.testmod.tab;

import com.test.testmod.TestMod;
import com.test.testmod.init.ItemInit;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class Tabs {

    public static final DeferredRegister<CreativeModeTab> MOD_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TestMod.MODID);

    public static final RegistryObject<CreativeModeTab> TEST_MAIN = MOD_TABS.register("test_main",
            () -> {
                return CreativeModeTab.builder()
                .icon(()->new ItemStack(ItemInit.Testomato.get()))
                .title(Component.translatable("itemGroup.test_main"))
                .displayItems((param,output) -> {
                    for(Item item:MainTab.items) {
                        output.accept(item);
                    }
                })
                .build();
    });
}
