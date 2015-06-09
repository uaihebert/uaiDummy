package com.uaihebert.uaidummy.creditcard.brand;

public class Visa implements CreditCard {

    @Override
    public int getLength() {
        return 16;
    }

    @Override
    public String generate() {
        return CreditCardNumberGenerator.generate(getPrefix(), getLength());
    }

    @Override
    public String getPrefix() {
        return "4";
    }
}