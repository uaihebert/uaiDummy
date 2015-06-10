package com.uaihebert.uaidummy.creditcard;

final class Dankort extends DummyBaseCreditCard {

    @Override
    protected int getLength() {
        return 16;
    }

    @Override
    protected String getPrefix() {
        return "5019";
    }

    @Override
    protected int getSecurityNumberLength() {
        return 3;
    }
}