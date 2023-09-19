package com.test.testmod.tabs;

import com.test.testmod.init.ArmorInit;
import com.test.testmod.init.BlockItemInit;
import com.test.testmod.init.ItemInit;
import com.test.testmod.init.ToolInit;
import net.minecraft.world.item.Item;

public class TestSub {
    public static final Item[] items = {
            ItemInit.TESTOMATO.get(),
            BlockItemInit.TESTOMATO_BLOCK.get(),
            ToolInit.TESTOMATO_SWORD.get(),
            ToolInit.TESTOMATO_PICKAXE.get(),
            ToolInit.TESTOMATO_SHOVEL.get(),
            ToolInit.TESTOMATO_AXE.get(),
            ToolInit.TESTOMATO_HOE.get(),
            ArmorInit.TESTOMATO_HELMET.get(),
            ArmorInit.TESTOMATO_CHESTPLATE.get(),
            ArmorInit.TESTOMATO_LEGGINGS.get(),
            ArmorInit.TESTOMATO_BOOTS.get(),
            ItemInit.TEST_ENTITY.get()
    };
}
