package com.github.pandacode.reinforcedblocks.blocks;

import com.github.pandacode.reinforcedblocks.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by paulo on 5/10/2017.
 */
public class BlockRB extends Block{
    public BlockRB(String name)
    {
        super(Material.rock);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setBlockName(name);
        this.setBlockTextureName(Reference.MODID+ ":" + name);

    }
}
