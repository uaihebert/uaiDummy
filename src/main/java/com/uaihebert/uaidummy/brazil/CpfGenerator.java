package com.uaihebert.uaidummy.brazil;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CpfGenerator {

    public static void main(String[] args) {
        StringBuilder build = new StringBuilder();
        build.insert(3, '.');
    }

    public static String generate() {
        List<Integer> cpf = createCpf();

        String result = "";
        for(Integer digit : cpf){
            result += digit;
        }

        return result;
    }

    public static String generateMasked() {
       return generateInstance().getFormattedValue();
    }

    public static Cpf generateInstance() {
        return new Cpf(generate());
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

}
