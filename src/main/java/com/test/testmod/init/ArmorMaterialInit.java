package com.test.testmod.init;

import com.test.testmod.init.tiers.ModArmorMaterial;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.crafting.Ingredient;

public class ArmorMaterialInit {
    public static final ModArmorMaterial TESTOMATO = new ModArmorMaterial(
            new int[] { 500, 1200, 600, 400},
            new int[] { 11, 16, 15, 13},
            20,
            SoundEvents.FOX_TELEPORT,
            () -> Ingredient.of(ItemInit.TESTOMATO::get),
            "testomato",
            0.25f,
            0.15f
    );
}
