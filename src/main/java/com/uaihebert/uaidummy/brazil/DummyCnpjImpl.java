package com.uaihebert.uaidummy.brazil;

import com.uaihebert.uaidummy.utils.ListUtils;
import com.uaihebert.uaidummy.utils.RandomUtils;

import java.util.List;

class DummyCnpjImpl implements DummyCnpj {

    private String value;

    public DummyCnpjImpl() {
        this.value = generate();
    }

    private static String generate() {
        return ListUtils.elementsToString(createCnpj());
    }

    private static List<Integer> createCnpj(){
        List<Integer> digits = RandomUtils.randomNumberList(12);
        digits.add(calculateFirstVerificationDigit(digits));
        digits.add(calculateSecondVerificationDigit(digits));

        return digits;
    }

    private static Integer calculateFirstVerificationDigit(List<Integer> digits){
        return calculateVerificationDigit(5, digits);
    }

    private static Integer calculateSecondVerificationDigit(List<Integer> digits){
        return calculateVerificationDigit(6, digits);
    }

    private static Integer calculateVerificationDigit(int multiplier, List<Integer> digits) {
        return Modulo11.cnpj(digits, multiplier);
    }

    public String getValue() {
        return value;
    }

    public String getFormattedValue(){
        String formattedValue = "";

        if(value != null) {
            StringBuilder builder = new StringBuilder(value);
            builder.insert(2, '.');
            builder.insert(6, '.');
            builder.insert(10, '/');
            builder.insert(15, '-');
            formattedValue = builder.toString();
        }

        return formattedValue;
    }

    @Override
    public String toString() {
        return getFormattedValue();
    }
}
