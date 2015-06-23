package com.uaihebert.uaidummy.utils;

public class StringHelper {
    private StringHelper() {
    }

    public static String leftFill(final String filling, final Object obj) {
        if (obj == null) {
            return null;
        }

        final String str = String.valueOf(obj);

        if (filling == null || filling.isEmpty()) {
            return str;
        }

        final int fillingLength = filling.length();
        final int strLength = str.length();
        final int lengthDiff = fillingLength - strLength;

        if (lengthDiff < 0) {
            return str;
        }

        final StringBuffer sb = new StringBuffer(filling);

        int strCounter = 0;

        for (int i = lengthDiff; i < fillingLength; i++) {
            sb.setCharAt(i, str.charAt(strCounter++));
        }

        return sb.toString();
    }
}