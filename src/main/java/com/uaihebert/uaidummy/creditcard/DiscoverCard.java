package com.uaihebert.uaidummy.creditcard;

final class DiscoverCard extends DummyBaseCreditCard {

    @Override
    protected int getLength() {
        return 16;
    }

    @Override
    protected String getPrefix() {
        return "649";
    }

    @Override
    protected int getSecurityNumberLength() {
        return 3;
    }
}