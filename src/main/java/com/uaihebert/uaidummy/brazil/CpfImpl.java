package com.uaihebert.uaidummy.brazil;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class CpfImpl implements Cpf {

    private String value;

    public CpfImpl() {
        this.value = generate();
    }

    private static String generate() {
        List<Integer> cpf = createCpf();

        String result = "";
        for(Integer digit : cpf){
            result += digit;
        }

        return result;
    }

    private static List<Integer> createCpf(){
        List<Integer> digits = generateRandomDigits();
        digits.add(calculateFirstVerificationDigit(digits));
        digits.add(calculateSecondVerificationDigit(digits));

        return digits;
    }

    private static List<Integer> generateRandomDigits(){
        Random random = new Random();
        List<Integer> digits = new ArrayList<Integer>();
        for(int i = 0 ; i < 9 ; i++){
            digits.add(random.nextInt(10));
        }
        return digits;
    }

    private static Integer calculateFirstVerificationDigit(List<Integer> digits){
        return calculateVerificationDigit(10, digits);
    }

    private static Integer calculateSecondVerificationDigit(List<Integer> digits){
        return calculateVerificationDigit(11, digits);
    }

    private static Integer calculateVerificationDigit(int multiplierStart, List<Integer> digits) {
        List<Integer> temp = new ArrayList<Integer>(digits);
        for(int i = 0 ; i < temp.size() ; i++){
            temp.set(i, temp.get(i) * multiplierStart--);
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
