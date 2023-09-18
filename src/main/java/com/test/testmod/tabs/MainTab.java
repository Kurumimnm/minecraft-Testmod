package com.test.testmod.tabs;

import com.test.testmod.init.BlockItemInit;
import com.test.testmod.init.ItemInit;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

public class MainTab {
    public static final Item[] items = {
            Items.COMMAND_BLOCK,
            Items.BARRIER,
            Items.LIGHT,
            ItemInit.TESTOMATO.get(),
            BlockItemInit.TESTOMATO_BLOCK.get()
    };
}
