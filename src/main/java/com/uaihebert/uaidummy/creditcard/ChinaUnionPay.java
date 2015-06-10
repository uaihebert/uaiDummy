package com.uaihebert.uaidummy.creditcard;

final class ChinaUnionPay extends DummyBaseCreditCard {

    @Override
    protected int getLength() {
        return 19;
    }

    @Override
    protected String getPrefix() {
        return "62";
    }

    @Override
    protected int getSecurityNumberLength() {
        return 3;
    }
}