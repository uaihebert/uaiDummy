package com.uaihebert.uaidummy.creditcard;

final class MasterCard extends DummyBaseCreditCard {

    @Override
    protected int getLength() {
        return 16;
    }

    @Override
    protected String getPrefix() {
        return "51";
    }

    @Override
    protected int getSecurityNumberLength() {
        return 3;
    }
}