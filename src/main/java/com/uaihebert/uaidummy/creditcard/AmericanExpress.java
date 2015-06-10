package com.uaihebert.uaidummy.creditcard;

final class AmericanExpress extends DummyBaseCreditCard {

    @Override
    protected int getLength() {
        return 15;
    }

    @Override
    protected String getPrefix() {
        return "34";
    }

    @Override
    protected int getSecurityNumberLength() {
        return 4;
    }
}