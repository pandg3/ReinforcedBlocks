package com.github.pandacode.reinforcedblocks.init;

import com.github.pandacode.reinforcedblocks.helpers.RegisterHelper;
import com.github.pandacode.reinforcedblocks.items.ItemRB;
import net.minecraft.item.Item;

/**
 * Created by paulo on 5/10/2017.
 */
public class ModItems {

    public static Item itemTest = new ItemRB("test");

    public static void registerItems()
    {
        RegisterHelper.registerItem(itemTest);
    }
}
