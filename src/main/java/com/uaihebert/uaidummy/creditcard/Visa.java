package com.uaihebert.uaidummy.creditcard;

final class Visa extends BaseCreditCard implements CreditCard {

    protected int getLength() {
        return 16;
    }

    protected String getPrefix() {
        return "4";
    }
}