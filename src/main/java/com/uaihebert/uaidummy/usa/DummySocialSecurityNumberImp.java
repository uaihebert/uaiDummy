package com.uaihebert.uaidummy.usa;

import com.uaihebert.uaidummy.utils.RandomUtils;

import java.util.Arrays;
import java.util.List;

/**
 * Using the rules extracted from here: http://stackoverflow.com/a/18385786
 */
class DummySocialSecurityNumberImp implements DummySocialSecurityNumber {
    private final static List<String> ILLEGAL_VALUE_LIST = Arrays.asList("078051120", "219099999");

    private final String rawValue;
    private final String formattedValue;

    public DummySocialSecurityNumberImp() {
        rawValue = generate();
        formattedValue = format();
    }

    private String format() {
        final StringBuilder builder = new StringBuilder(rawValue);

        builder.insert(3, '-');
        builder.insert(6, '-');

        return builder.toString();
    }

    private String generate() {
        while(true) {
            final Integer number = RandomUtils.nextIntBetween(1000000, 899999999);
            final String filledWithZero = String.format("%09d", number);

            if (
                    !filledWithZero.startsWith("666") &&
                    !filledWithZero.endsWith("0000") &&
                    !ILLEGAL_VALUE_LIST.contains(filledWithZero) &&
                    !filledWithZero.substring(3,5).equals("00")
                ) {
                return filledWithZero;
            }
        }
    }

    @Override
    public String getValue() {
        return rawValue;
    }

    @Override
    public String getFormattedValue() {
        return formattedValue;
    }
}