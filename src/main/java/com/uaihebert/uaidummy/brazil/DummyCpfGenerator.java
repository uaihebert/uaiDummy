package com.uaihebert.uaidummy.brazil;

public class DummyCpfGenerator {

    public static String generate() {
        return generateInstance().getValue();
    }

    public static String generateMasked() {
       return generateInstance().getFormattedValue();
    }

    public static DummyCpf generateInstance() {
        return new DummyCpfImpl();
    }

}
