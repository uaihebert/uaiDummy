package com.uaihebert.uaidummy.brazil;

import com.uaihebert.uaidummy.utils.ListUtils;
import com.uaihebert.uaidummy.utils.RandomUtils;

import java.util.List;

class DummyCnpjImpl implements DummyCnpj {

    private final String rawValue;
    private final String formattedValue;

    public DummyCnpjImpl() {
        rawValue = generate();
        formattedValue = format();
    }

    private String format() {
        final StringBuilder builder = new StringBuilder(rawValue);

        builder.insert(2, '.');
        builder.insert(6, '.');
        builder.insert(10, '/');
        builder.insert(15, '-');

        return builder.toString();
    }

    private String generate() {
        return ListUtils.elementsToString(createCnpj());
    }

    private List<Integer> createCnpj(){
        final List<Integer> digits = RandomUtils.randomNumberList(12);

        digits.add(calculateFirstVerificationDigit(digits));
        digits.add(calculateSecondVerificationDigit(digits));

        return digits;
    }

    private Integer calculateFirstVerificationDigit(final List<Integer> digits){
        return calculateVerificationDigit(5, digits);
    }

    private Integer calculateSecondVerificationDigit(final List<Integer> digits){
        return calculateVerificationDigit(6, digits);
    }

    private Integer calculateVerificationDigit(final int multiplier, final List<Integer> digits) {
        return Modulo11.cnpj(digits, multiplier);
    }

    public String getRawValue() {
        return rawValue;
    }

    public String getFormattedValue(){
        return formattedValue;
    }

    @Override
    public String toString() {
        return formattedValue;
    }
}
