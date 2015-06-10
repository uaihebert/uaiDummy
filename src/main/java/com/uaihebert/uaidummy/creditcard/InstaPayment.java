package com.uaihebert.uaidummy.creditcard;

final class InstaPayment extends DummyBaseCreditCard {

    @Override
    protected int getLength() {
        return 16;
    }

    @Override
    protected String getPrefix() {
        return "3589";
    }

    @Override
    protected int getSecurityNumberLength() {
        return 3;
    }
}