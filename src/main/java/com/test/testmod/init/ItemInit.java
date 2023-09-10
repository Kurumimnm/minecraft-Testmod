package com.test.testmod.init;

import com.test.testmod.TestMod;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TestMod.MODID);

    public static final RegistryObject<Item> Testomato = ITEMS.register("testomato",
            () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder().nutrition(2).build())
                    .stacksTo(64)
            )
    );
}
