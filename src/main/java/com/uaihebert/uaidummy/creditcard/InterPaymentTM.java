package com.uaihebert.uaidummy.creditcard;

final class InterPaymentTM extends DummyBaseCreditCard {

    @Override
    protected int getLength() {
        return 18;
    }

    @Override
    protected String getPrefix() {
        return "636";
    }

    @Override
    protected int getSecurityNumberLength() {
        return 3;
    }
}