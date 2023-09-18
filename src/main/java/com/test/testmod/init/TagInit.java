package com.test.testmod.init;

import com.test.testmod.TestMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class TagInit {
    public static final TagKey<Block> NEEDS_TESTOMATO_TOOL = tag("needs_testomato_tool");

    private static TagKey<Block> tag(String name) {
        return BlockTags.create(new ResourceLocation(TestMod.MODID, name));
    }


}
