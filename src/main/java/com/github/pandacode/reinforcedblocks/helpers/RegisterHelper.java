package com.github.pandacode.reinforcedblocks.helpers;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

/**
 * Created by paulo on 5/9/2017.
 */
public class RegisterHelper {
    public static void registerBlock(Block block)
    {
        GameRegistry.registerBlock(block, block.getUnlocalizedName().substring(5));

    }
    public static void registerItem(Item item){
        GameRegistry.registerItem(item, item.getUnlocalizedName().substring(5));
    }
}
