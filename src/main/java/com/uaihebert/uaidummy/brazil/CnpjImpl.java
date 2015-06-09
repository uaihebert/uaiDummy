package com.uaihebert.uaidummy.brazil;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class CnpjImpl implements Cnpj {

    private String value;

    public CnpjImpl() {
        this.value = generate();
    }

    private static String generate() {
        List<Integer> cnpj = createCnpj();

        String result = "";
        for(Integer digit : cnpj){
            result += digit;
        }

        return result;
    }

    private static List<Integer> createCnpj(){
        List<Integer> digits = generateRandomDigits();
        digits.add(calculateFirstVerificationDigit(digits));
        digits.add(calculateSecondVerificationDigit(digits));

        return digits;
    }

    private static List<Integer> generateRandomDigits(){
        Random random = new Random();
        List<Integer> digits = new ArrayList<Integer>();
        for(int i = 0 ; i < 12 ; i++){
            digits.add(random.nextInt(10));
        }
        return digits;
    }

    private static Integer calculateFirstVerificationDigit(List<Integer> digits){
        return calculateVerificationDigit(5, digits);
    }

    private static Integer calculateSecondVerificationDigit(List<Integer> digits){
        return calculateVerificationDigit(6, digits);
    }

    private static Integer calculateVerificationDigit(int multiplier, List<Integer> digits) {
        boolean restarted = false;
        List<Integer> temp = new ArrayList<Integer>(digits);
        for(int i = 0 ; i < temp.size() ; i++){
            temp.set(i, temp.get(i) * multiplier--);

            if(!restarted && multiplier == 1){
                multiplier = 9;
                restarted = true;
            }
        }
        int sum = sum(temp);
        int rest = sum % 11;
        return rest < 2 ? 0 : (11 - rest);
    }

    private static Integer sum(List<Integer> numbers){
        int sum = 0;
        for(Integer number : numbers){
            sum += number;
        }
        return sum;
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
