package com.uaihebert.uaidummy.config;

import com.uaihebert.uaidummy.creditcard.DummyBaseCreditCard;

public class UaiDummyConfig {

    public static void setCreditCardExpirationDateMask(final String mask) {
        DummyBaseCreditCard.setDefaultExpirationDateMask(mask);
    }
}