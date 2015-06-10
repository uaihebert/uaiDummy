package com.uaihebert.uaidummy.creditcard;

final class DinersClubUsaAndCanada extends DummyBaseCreditCard {

    @Override
    protected int getLength() {
        return 16;
    }

    @Override
    protected String getPrefix() {
        return "54";
    }

    @Override
    protected int getSecurityNumberLength() {
        return 3;
    }
}