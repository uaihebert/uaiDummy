package com.uaihebert.uaidummy.config;

import com.uaihebert.uaidummy.creditcard.DummyBaseCreditCard;

public final class DummyConfig {
    private DummyConfig() {
    }

    public static void setCreditCardExpirationDateMask(final String mask) {
        DummyBaseCreditCard.setDefaultExpirationDateMask(mask);
    }

    public static void setCurrentLanguageUS_EN() {
        LanguageConfig.setCurrentLanguageUS_EN();
    }

    public static void setCurrentLanguagePT_BR() {
        LanguageConfig.setCurrentLanguagePT_BR();
    }
}