package com.uaihebert.uaidummy.config;

import com.uaihebert.uaidummy.creditcard.DummyBaseCreditCard;

public final class DummyConfig {

    private DummyConfig() {
    }

    public static void setCreditCardExpirationDateMask(final String mask) {
        DummyBaseCreditCard.setDefaultExpirationDateMask(mask);
    }
}