package com.company.infrastructure.utils;

import java.util.Random;

public class StringUtils {

    public enum Mode {
        ALPHA, NUMERIC, ALPHANUMERIC, HEX
    }

    private StringUtils(){}

    public static String randomString(Mode mode, int length) {

        String abc = "";

        switch (mode) {
            case ALPHA:
                abc = "abсdefghijklmnopqrstuvwxyz";
                break;
            case NUMERIC:
                abc = "0123456789";
                break;
            case ALPHANUMERIC:
                abc = "abсdefghijklmnopqrstuvwxyz0123456789";
                break;
            case HEX:
                abc = "0123456789ABCDEF";
                break;
        }

        String resalt = "";
        for (int i = 0; i < length; i++) {
            int index = new Random().nextInt(abc.length());
            resalt += abc.charAt(index);
        }
        return resalt;
    }
}
