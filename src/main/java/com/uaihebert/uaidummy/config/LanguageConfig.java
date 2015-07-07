package com.uaihebert.uaidummy.config;

public class LanguageConfig {
    private static SupportedLanguage currentLanguage = SupportedLanguage.us_EN;

    public static SupportedLanguage getCurrentLanguage() {
        return currentLanguage;
    }

    public static void setCurrentLanguageUS() {
        currentLanguage = SupportedLanguage.us_EN;
    }
}