package com.test.testmod.init;

import com.test.testmod.TestMod;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ToolInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TestMod.MODID);

    public static final RegistryObject<SwordItem> TESTOMATO_SWORD = ITEMS.register("testomato_sword",
            () -> new SwordItem(TierInit.TESTOMATO, 7, 2.5f, new Item.Properties()));

    public static final RegistryObject<PickaxeItem> TESTOMATO_PICKAXE = ITEMS.register("testomato_pickaxe",
            () -> new PickaxeItem(TierInit.TESTOMATO, 7, 2.5f, new Item.Properties()));

    public static final RegistryObject<ShovelItem> TESTOMATO_SHOVEL = ITEMS.register("testomato_shovel",
            () -> new ShovelItem(TierInit.TESTOMATO, 7, 2.5f, new Item.Properties()));

    public static final RegistryObject<AxeItem> TESTOMATO_AXE = ITEMS.register("testomato_axe",
            () -> new AxeItem(TierInit.TESTOMATO, 7, 2.5f, new Item.Properties()));

    public static final RegistryObject<HoeItem> TESTOMATO_HOE = ITEMS.register("testomato_hoe",
            () -> new HoeItem(TierInit.TESTOMATO, 7, 2.5f, new Item.Properties()));
}
