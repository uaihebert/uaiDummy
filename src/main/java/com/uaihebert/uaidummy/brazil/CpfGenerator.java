package com.uaihebert.uaidummy.brazil;

public class CpfGenerator {

    public static String generate() {
        return new CpfImpl().getValue();
    }

    public static String generateMasked() {
       return generateInstance().getFormattedValue();
    }

    public static Cpf generateInstance() {
        return new CpfImpl();
    }

}
