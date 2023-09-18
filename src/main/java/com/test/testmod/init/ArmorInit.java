package com.test.testmod.init;

import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.test.testmod.TestMod.*;

public class ArmorInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    public static final RegistryObject<ArmorItem> TESTOMATO_HELMET = ITEMS.register("testomato_helmet",
            () -> new ArmorItem(ArmorMaterialInit.TESTOMATO, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<ArmorItem> TESTOMATO_CHESTPLATE = ITEMS.register("testomato_chestplate",
            () -> new ArmorItem(ArmorMaterialInit.TESTOMATO, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<ArmorItem> TESTOMATO_LEGGINGS = ITEMS.register("testomato_leggings",
            () -> new ArmorItem(ArmorMaterialInit.TESTOMATO, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<ArmorItem> TESTOMATO_BOOTS = ITEMS.register("testomato_boots",
            () -> new ArmorItem(ArmorMaterialInit.TESTOMATO, ArmorItem.Type.BOOTS, new Item.Properties()));
}
