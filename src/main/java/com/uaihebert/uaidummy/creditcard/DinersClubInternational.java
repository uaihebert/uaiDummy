package com.uaihebert.uaidummy.creditcard;

final class DinersClubInternational extends DummyBaseCreditCard {

    @Override
    protected int getLength() {
        return 14;
    }

    @Override
    protected String getPrefix() {
        return "309";
    }

    @Override
    protected int getSecurityNumberLength() {
        return 3;
    }
}