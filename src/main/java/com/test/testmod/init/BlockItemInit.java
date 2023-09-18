package com.test.testmod.init;

import com.test.testmod.TestMod;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TestMod.MODID);

    public static final RegistryObject<BlockItem> TESTOMATO_BLOCK = ITEMS.register("testomato_block",
            () -> new BlockItem(BlockInit.TESTOMATO_BLOCK.get(),
                    new Item.Properties()
                            .food(new FoodProperties.Builder().nutrition(8).build())
            )
    );
}
