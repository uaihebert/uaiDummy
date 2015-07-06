package com.uaihebert.uaidummy.brazil;

import com.uaihebert.uaidummy.utils.ListUtils;
import com.uaihebert.uaidummy.utils.RandomUtils;

import java.util.List;

class DummyCpfImpl implements DummyCpf {

    private final String rawValue;
    private final String formattedValue;

    public DummyCpfImpl() {
        rawValue = generate();
        formattedValue = formatValue();
    }

    private String formatValue() {
        final StringBuilder builder = new StringBuilder(rawValue);

        builder.insert(3, '.');
        builder.insert(7, '.');
        builder.insert(11, '-');

        return builder.toString();
    }

    private String generate() {
        return ListUtils.elementsToString(createCpf());
    }

    private List<Integer> createCpf(){
        final List<Integer> digitList = RandomUtils.randomNumberList(9);

        digitList.add(calculateFirstVerificationDigit(digitList));
        digitList.add(calculateSecondVerificationDigit(digitList));

        return digitList;
    }

    private Integer calculateFirstVerificationDigit(final List<Integer> digits){
        return calculateVerificationDigit(10, digits);
    }

    private Integer calculateSecondVerificationDigit(final List<Integer> digits){
        return calculateVerificationDigit(11, digits);
    }

    private Integer calculateVerificationDigit(final int multiplier, final List<Integer> digits) {
        return Modulo11.cpf(digits, multiplier);
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