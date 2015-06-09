package com.uaihebert.uaidummy.creditcard.brand;

import java.util.Random;

/**
 * Based on the code of: Josef Galea
 * https://gist.github.com/josefeg/5781824
 */
abstract class BaseCreditCard {
    private static final Random random = new Random(System.currentTimeMillis());

    public String generate() {
        final String prefix = getPrefix();
        final int length = getLength();

        final int randomNumberLength = length - (prefix.length() + 1);

        final StringBuffer buffer = new StringBuffer(prefix);

        for (int i = 0; i < randomNumberLength; i++) {
            int digit = random.nextInt(10);
            buffer.append(digit);
        }

        final int checkDigit = getCheckDigit(buffer.toString());
        buffer.append(checkDigit);

        return buffer.toString();
    }

    private static int getCheckDigit(String number) {
        final int remainder = (number.length() + 1) % 2;

        int sum = 0;

        for (int i = 0; i < number.length(); i++) {

            int digit = Integer.parseInt(number.substring(i, (i + 1)));

            if ((i % 2) == remainder) {
                digit = digit * 2;
                if (digit > 9) {
                    digit = (digit / 10) + (digit % 10);
                }
            }

            sum += digit;
        }

        final int mod = sum % 10;
        final int checkDigit = ((mod == 0) ? 0 : 10 - mod);

        return checkDigit;
    }

    protected abstract int getLength();
    protected abstract String getPrefix();
}