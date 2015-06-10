package com.uaihebert.uaidummy.utils;

import java.util.Collection;

public final class ListUtils {
    private ListUtils() {
    }

    public static <E> String elementsToString(final Collection<E> collection){
        final StringBuilder sb = new StringBuilder();
        for(E e : collection){
            sb.append(String.valueOf(e));
        }
        return sb.toString();
    }

    public static <E extends Number> Integer sum(final Collection<E> collection){
        Integer sum = 0;

        for(E e : collection){
            sum += e.intValue();
        }

        return sum;
    }

}
