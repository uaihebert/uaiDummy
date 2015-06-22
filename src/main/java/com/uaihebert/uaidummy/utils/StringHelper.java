package com.uaihebert.uaidummy.utils;

public class StringHelper {

    public static void main(String[] args) {
        System.out.println(String.valueOf(null));
    }

    private StringHelper(){}

    public static String leftFill(final String filling, final Object obj){
        if(obj == null){
            return null;
        }

        String str = String.valueOf(obj);

        if(filling == null || filling.isEmpty()){
            return str;
        }

        int fillingLength = filling.length();
        int strLength = str.length();
        int lengthDiff = fillingLength - strLength;

        if(lengthDiff < 0){
            return str;
        }

        StringBuffer sb = new StringBuffer(filling);
        int strCounter = 0;

        for(int i = lengthDiff; i < fillingLength ; i++){
            sb.setCharAt(i, str.charAt(strCounter++));
        }

        return sb.toString();
    }

}
