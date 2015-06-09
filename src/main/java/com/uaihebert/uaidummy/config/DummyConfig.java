package com.uaihebert.uaidummy.config;

import com.uaihebert.uaidummy.creditcard.DummyBaseCreditCard;

public class DummyConfig {

    public static void setCreditCardExpirationDateMask(final String mask) {
        DummyBaseCreditCard.setDefaultExpirationDateMask(mask);
    }
}