package com.github.pandacode.reinforcedblocks.helpers;



import com.github.pandacode.reinforcedblocks.Reference;
import cpw.mods.fml.common.FMLLog;

import java.util.logging.Level;




/**
 * Created by paulo on 5/9/2017.
 */
public class LogHelper {
    public static void log(Level logLevel, Object object){FMLLog.log(Reference.NAME, logLevel, String.valueOf(object));}
    public static void all(Object object) {log(Level.ALL, object);}
    public static void info(Object object){log(Level.INFO, object);}
    public static void off(Object object){log(Level.OFF, object);}
    public static void warn(Object object){log(Level.WARNING, object);}
}
