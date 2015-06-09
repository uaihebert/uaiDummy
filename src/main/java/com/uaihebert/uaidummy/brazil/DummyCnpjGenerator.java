package com.uaihebert.uaidummy.brazil;

public class DummyCnpjGenerator {

    public static String generate() {
        return new DummyCnpjImpl().getValue();
    }

    public static String generateMasked() {
       return generateInstance().getFormattedValue();
    }

    public static DummyCnpj generateInstance() {
        return new DummyCnpjImpl();
    }

}
