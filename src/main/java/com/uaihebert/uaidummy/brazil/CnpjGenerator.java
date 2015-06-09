package com.uaihebert.uaidummy.brazil;

public class CnpjGenerator {

    public static String generate() {
        return new CnpjImpl().getValue();
    }

    public static String generateMasked() {
       return generateInstance().getFormattedValue();
    }

    public static Cnpj generateInstance() {
        return new CnpjImpl();
    }

}
