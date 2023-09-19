package com.test.testmod.init;

import com.test.testmod.TestMod;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TestMod.MODID);

    public static final RegistryObject<Item> TESTOMATO = ITEMS.register("testomato",
            () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder().nutrition(2).build())
                    .stacksTo(64)
            )
    );

    public static final RegistryObject<ForgeSpawnEggItem> TEST_ENTITY = ITEMS.register("test_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityInit.TEST_ENTITY, 0xF0ABD1, 0xAE4C82, new Item.Properties()));
}
