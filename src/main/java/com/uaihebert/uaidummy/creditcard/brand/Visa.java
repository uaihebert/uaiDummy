package com.uaihebert.uaidummy.creditcard.brand;

import com.uaihebert.uaidummy.creditcard.CreditCard;

public class Visa extends BaseCreditCard implements CreditCard {

    protected int getLength() {
        return 16;
    }

    protected String getPrefix() {
        return "4";
    }
}