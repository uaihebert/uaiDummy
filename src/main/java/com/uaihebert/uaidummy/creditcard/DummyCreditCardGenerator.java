package com.uaihebert.uaidummy.creditcard;

public final class DummyCreditCardGenerator {
    private DummyCreditCardGenerator() {

    }

    public static String generateVisa() {
        return generateVisaInstance().getNumber();
    }

    public static DummyCreditCard generateVisaInstance() {
        return new Visa();
    }
}