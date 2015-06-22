package com.uaihebert.uaidummy.creditcard;

import com.uaihebert.uaidummy.utils.RandomUtils;

/**
 * Based on the code of: Josef Galea
 * https://gist.github.com/josefeg/5781824
 */
public abstract class DummyBaseCreditCard implements DummyCreditCard {
    private static String defaultExpirationDateMask = "MM/yy";

    private String number;
    private String expirationDate;
    private String securityNumber;

    public static void setDefaultExpirationDateMask(String defaultExpirationDateMask) {
        DummyBaseCreditCard.defaultExpirationDateMask = defaultExpirationDateMask;
    }

    DummyBaseCreditCard() {
        generate();
    }

    public String getNumber() {
        return number;
    }

    public String getSecurityNumber() {
        return securityNumber;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public String getExpirationYear() {
        return ExpirationDateUtil.extractYear(expirationDate, defaultExpirationDateMask);
    }

    public String getExpirationMonth() {
        return ExpirationDateUtil.extractMonth(expirationDate, defaultExpirationDateMask);
    }

    public String getLastFourDigits() {
        return number.substring(number.length() - 4);
    }

    protected abstract int getLength();
    protected abstract String getPrefix();
    protected abstract int getSecurityNumberLength();

    private void generate() {
        generateNumber();
        generateExpirationDate();
        generateSecurityNumber();
    }

    private void generateExpirationDate() {
       expirationDate = ExpirationDateUtil.generateNonExpirationDate(defaultExpirationDateMask);
    }

    private void generateSecurityNumber() {
        final StringBuilder builder = new StringBuilder();

        for (int i = 0; i < getSecurityNumberLength(); i++) {
            builder.append(RandomUtils.nextInt(10));
        }

        securityNumber = builder.toString();
    }

    private void generateNumber() {
        final String prefix = getPrefix();
        final int length = getLength();

        final int randomNumberLength = length - (prefix.length() + 1);

        final StringBuffer buffer = new StringBuffer(prefix);

        for (int i = 0; i < randomNumberLength; i++) {
            int digit = RandomUtils.nextInt(10);
            buffer.append(digit);
        }

        final int checkDigit = getCheckDigit(buffer.toString());
        buffer.append(checkDigit);

        number = buffer.toString();
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
}