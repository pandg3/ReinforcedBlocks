package com.github.pandacode.reinforcedblocks;

import com.github.pandacode.reinforcedblocks.helpers.RegisterHelper;
import com.github.pandacode.reinforcedblocks.init.ModBlocks;
import com.github.pandacode.reinforcedblocks.init.ModItems;
import com.github.pandacode.reinforcedblocks.proxies.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)

public class Reinforcedblocks {
    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.COMMON_PROXY)
    public static CommonProxy proxy;

    @Mod.Instance(Reference.MODID)
    public static Reinforcedblocks instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ModItems.registerItems();
        ModBlocks.registerBlocks();
    }
    @Mod.EventHandler
    public void init (FMLInitializationEvent event)
    {

    }
    @Mod.EventHandler
    public void postinit (FMLPostInitializationEvent event)
    {

    }
}
