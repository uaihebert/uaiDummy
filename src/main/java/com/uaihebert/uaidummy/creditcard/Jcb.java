package com.uaihebert.uaidummy.creditcard;

final class Jcb extends DummyBaseCreditCard {

    @Override
    protected int getLength() {
        return 16;
    }

    @Override
    protected String getPrefix() {
        return "3528";
    }

    @Override
    protected int getSecurityNumberLength() {
        return 3;
    }
}