package com.uaihebert.uaidummy.creditcard;

/**
 * All credit card types will be based on: http://en.wikipedia.org/wiki/Bank_card_number
 */
public interface DummyCreditCard {
    public String getNumber();
    public String getExpirationYear();
    public String getExpirationMonth();
    public String getExpirationDate();
    public String getSecurityNumber();
    public String getLastFourDigits();
}