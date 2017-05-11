package com.github.pandacode.reinforcedblocks.items;

import com.github.pandacode.reinforcedblocks.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by paulo on 5/10/2017.
 */
public class ItemRB extends Item{
    public ItemRB (String name){
        super();
        this.setCreativeTab(CreativeTabs.tabMisc);
        this.setUnlocalizedName(name);
        this.setTextureName(Reference.MODID + ":" + name);
    }
}
