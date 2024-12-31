package dev.ole.lib;

import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class NettyLib {

    public static final UUID SYSTEM_UUID = UUID.fromString("0f0f0f0f-0f0f-0f0f-f0f0-0f0f0f0f0f0f");
    public static String BRANDING = "NettyLib";
    public static Logger LOGGER = Logger.getLogger(BRANDING);
    public static boolean debugEnabled = false;

    public static void debug(String info) {
        if (debugEnabled) {
            LOGGER.log(Level.INFO, info);
        }
    }

    public static void log(String info) {
        LOGGER.log(Level.INFO, info);
    }

}