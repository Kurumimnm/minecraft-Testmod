package com.test.testmod.iteminit;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class ItemTestomato extends Item {

    public ItemTestomato() {
        super(new Properties()
                .food(new FoodProperties.Builder().build())
                .stacksTo(64)
                .rarity(Rarity.UNCOMMON)

        );
    }

}
