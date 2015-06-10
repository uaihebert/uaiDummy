package com.uaihebert.uaidummy.creditcard;

final class Uatp extends DummyBaseCreditCard {

    @Override
    protected int getLength() {
        return 15;
    }

    @Override
    protected String getPrefix() {
        return "1";
    }

    @Override
    protected int getSecurityNumberLength() {
        return 3;
    }
}