package com.uaihebert.uaidummy.creditcard;

public final class CreditCardGenerator {
    private CreditCardGenerator() {

    }

    public static String generateVisa() {
        return new Visa().getNumber();
    }

    public static CreditCard generateVisaInstance() {
        return new Visa();
    }
}