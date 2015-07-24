package com.uaihebert.uaidummy.creditcard;

import java.lang.reflect.Constructor;

final class DummyCreditCardReflectionUtil {
    private DummyCreditCardReflectionUtil() {
    }

    public static <T> DummyCreditCard instantiateDummyCreditCard(final Class<T> aClass) {
        final Constructor declaredConstructor;
        try {
            declaredConstructor = aClass.getDeclaredConstructor(new Class[0]);
            return (DummyCreditCard) declaredConstructor.newInstance(new Object[0]);
        } catch (final Exception e) {
            throw new IllegalStateException(e);
        }
    }
}