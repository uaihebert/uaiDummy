package com.uaihebert.uaidummy.config;

import com.uaihebert.uaidummy.creditcard.DummyBaseCreditCard;
import com.uaihebert.uaidummy.name.DummyNameGenerator;

public final class DummyConfig {
    private DummyConfig() {
    }

    public static void setCreditCardExpirationDateMask(final String mask) {
        DummyBaseCreditCard.setDefaultExpirationDateMask(mask);
    }

    public static void setMaxLastNamesInCache(final int maxLastNamesInCache) {
        DummyNameGenerator.setMaxLastNamesInCache(maxLastNamesInCache);
    }

    public static void setMaxFirstNamesInCache(final int maxFirstNamesInCache) {
        DummyNameGenerator.setMaxLastNamesInCache(maxFirstNamesInCache);
    }

    public static void setTotalLastNamesInFullName(final int totalLastNamesInFullName) {
        DummyNameGenerator.setTotalLastNamesInFullName(totalLastNamesInFullName);
    }

    public static void setCurrentLanguageUS_EN() {
        LanguageConfig.setCurrentLanguageUS_EN();
    }

    public static void setCurrentLanguagePT_BR() {
        LanguageConfig.setCurrentLanguagePT_BR();
    }
}