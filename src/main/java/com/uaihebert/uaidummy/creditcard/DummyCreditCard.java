package com.uaihebert.uaidummy.creditcard;

/**
 * All data will be based on: http://en.wikipedia.org/wiki/Bank_card_number
 */
public interface DummyCreditCard {
    public String getNumber();
    public String getExpirationDate();
    public String getSecurityNumber();
}