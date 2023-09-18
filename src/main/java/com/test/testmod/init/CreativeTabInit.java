package com.test.testmod.init;

import com.test.testmod.TestMod;
import com.test.testmod.tabs.MainTab;
import com.test.testmod.tabs.TestSub;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CreativeTabInit {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TestMod.MODID);

    public static final RegistryObject<CreativeModeTab> TEST_MAIN = TABS.register("test_main",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ItemInit.TESTOMATO.get()))
                    .title(Component.translatable("itemGroup.test_main"))
                    .withSearchBar()
                    .displayItems((param,output) -> {
                        for(Item item: MainTab.items) {
                            output.accept(item);
                        }
                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> TEST_SUB = TABS.register("test_sub",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(BlockItemInit.TESTOMATO_BLOCK.get()))
                    .title(Component.translatable("itemGroup.test_sub"))
                    .displayItems((param, output) -> {
                        for (Item item: TestSub.items) {
                            output.accept(item);
                        }
                    })
                    .build());
}
