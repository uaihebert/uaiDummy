package com.uaihebert.uaidummy.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomUtils {

    private static final Random random = new Random();

    public static List<Integer> randomNumberList(final int count){
        return randomNumberList(count, 0, 9);
    }

    public static List<Integer> randomNumberList(final int count, final int min, final int max){
        final List<Integer> digits = new ArrayList<Integer>();

        for(int i = 0 ; i < count ; i++){
            digits.add(random.nextInt((max - min) + 1) + min);
        }

        return digits;
    }
}
