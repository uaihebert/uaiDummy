package com.uaihebert.uaidummy.creditcard;

final class Maestro extends DummyBaseCreditCard {

    @Override
    protected int getLength() {
        return 17;
    }

    @Override
    protected String getPrefix() {
        return "560000";
    }

    @Override
    protected int getSecurityNumberLength() {
        return 3;
    }
}