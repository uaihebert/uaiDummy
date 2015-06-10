package com.uaihebert.uaidummy.brazil;

import com.uaihebert.uaidummy.utils.ListUtils;
import com.uaihebert.uaidummy.utils.RandomUtils;

import java.util.List;

class DummyCpfImpl implements DummyCpf {

    private String value;

    public DummyCpfImpl() {
        this.value = generate();
    }

    private static String generate() {
        return ListUtils.elementsToString(createCpf());
    }

    private static List<Integer> createCpf(){
        List<Integer> digits = RandomUtils.randomNumberList(9);
        digits.add(calculateFirstVerificationDigit(digits));
        digits.add(calculateSecondVerificationDigit(digits));

        return digits;
    }

    private static Integer calculateFirstVerificationDigit(final List<Integer> digits){
        return calculateVerificationDigit(10, digits);
    }

    private static Integer calculateSecondVerificationDigit(final List<Integer> digits){
        return calculateVerificationDigit(11, digits);
    }

    private static Integer calculateVerificationDigit(final int multiplier, final List<Integer> digits) {
        return Modulo11.cpf(digits, multiplier);
    }

    public String getValue() {
        return value;
    }

    public String getFormattedValue(){
        String formattedValue = "";

        if(value != null) {
            StringBuilder builder = new StringBuilder(value);
            builder.insert(3, '.');
            builder.insert(7, '.');
            builder.insert(11, '-');
            formattedValue = builder.toString();
        }

        return formattedValue;
    }

    @Override
    public String toString() {
        return getFormattedValue();
    }
}
