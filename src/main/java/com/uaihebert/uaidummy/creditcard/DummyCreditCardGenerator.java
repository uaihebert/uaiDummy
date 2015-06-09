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

    public static String generateMasterCard() {
        return generateMasterCardInstance().getNumber();
    }

    public static DummyCreditCard generateMasterCardInstance() {
        return new MasterCard();
    }
}