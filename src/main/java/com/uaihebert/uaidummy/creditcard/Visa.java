package com.uaihebert.uaidummy.creditcard;

final class Visa extends DummyBaseCreditCard implements DummyCreditCard {

    protected int getLength() {
        return 16;
    }

    protected String getPrefix() {
        return "4";
    }

    @Override
    protected int getSecurityNumberLength() {
        return 3;
    }
}