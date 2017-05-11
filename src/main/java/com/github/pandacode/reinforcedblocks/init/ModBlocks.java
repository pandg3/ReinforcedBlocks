package com.github.pandacode.reinforcedblocks.init;

import com.github.pandacode.reinforcedblocks.blocks.BlockRB;
import com.github.pandacode.reinforcedblocks.helpers.RegisterHelper;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRailBase;

/**
 * Created by paulo on 5/10/2017.
 */
public class ModBlocks {
    public static Block blockConcrete = new BlockRB("blockConcrete") {
    };
    public static void registerBlocks()
    {
        RegisterHelper.registerBlock(blockConcrete);
    }
}
