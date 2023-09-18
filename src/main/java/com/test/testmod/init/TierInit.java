package com.test.testmod.init;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class TierInit {
    public static final ForgeTier TESTOMATO = new ForgeTier(
            4,
            10,
            1.5f,
            7,
            20,TagInit.NEEDS_TESTOMATO_TOOL,
            () -> Ingredient.of(ItemInit.TESTOMATO::get)
    );
}
