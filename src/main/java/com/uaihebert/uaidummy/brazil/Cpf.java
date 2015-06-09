package com.uaihebert.uaidummy.brazil;

public class Cpf {

    private String value;

    public Cpf(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public String getFormattedValue(){
        String formattedValue = "";

        if(value != null) {
            StringBuilder builder = new StringBuilder(value);
            builder.insert(3, '.');
            builder.insert(7, '.');
            builder.insert(11, '-');
            formattedValue = builder.toString();
        }

        return formattedValue;
    }

    @Override
    public String toString() {
        return getFormattedValue();
    }
}
