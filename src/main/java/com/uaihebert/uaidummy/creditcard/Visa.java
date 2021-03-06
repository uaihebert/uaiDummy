package com.uaihebert.uaidummy.creditcard;

final class Visa extends DummyBaseCreditCard {

    @Override
    protected int getLength() {
        return 16;
    }

    @Override
    protected String getPrefix() {
        return "4";
    }

    @Override
    protected int getSecurityNumberLength() {
        return 3;
    }
}