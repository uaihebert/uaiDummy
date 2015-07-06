package com.uaihebert.uaidummy.utils;

public class StringHelper {
    private StringHelper() {
    }

    /**
     * Will replace the lasts chars:
     *      rightReplace("aaa", "3") will generate "aa3"
     *      rightReplace("aaa", "33") will generate "a33"
     *
     * @param target the target string
     * @param obj the object to extract the value
     * @return
     */
    public static String rightReplace(final String target, final Object obj) {
        if (obj == null) {
            return null;
        }

        final String str = String.valueOf(obj);

        if (target == null || target.isEmpty()) {
            return str;
        }

        final int fillingLength = target.length();
        final int strLength = str.length();
        final int lengthDiff = fillingLength - strLength;

        if (lengthDiff < 0) {
            return str;
        }

        final StringBuffer sb = new StringBuffer(target);

        int strCounter = 0;

        for (int i = lengthDiff; i < fillingLength; i++) {
            sb.setCharAt(i, str.charAt(strCounter++));
        }

        return sb.toString();
    }
}