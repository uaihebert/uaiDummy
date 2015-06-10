package com.uaihebert.uaidummy.creditcard;

final class DinersClubCarteBlanche extends DummyBaseCreditCard {

    @Override
    protected int getLength() {
        return 14;
    }

    @Override
    protected String getPrefix() {
        return "300";
    }

    @Override
    protected int getSecurityNumberLength() {
        return 3;
    }
}