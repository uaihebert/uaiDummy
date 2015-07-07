package com.uaihebert.uaidummy.us;

public final class DummySocialSecurityNumberGenerator {
    private DummySocialSecurityNumberGenerator() {
    }

    public static String generate() {
        return new DummySocialSecurityNumberImp().getValue();
    }

    public static String generateMasked() {
        return new DummySocialSecurityNumberImp().getFormattedValue();
    }
}