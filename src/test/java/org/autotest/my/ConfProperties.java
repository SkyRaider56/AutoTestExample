package org.autotest.my;

import java.util.Properties;

public class ConfProperties {
    protected static Properties PROPERTIES;

    public static String getProperty(String key) {
        return PROPERTIES.getProperty(key);
    }
}

