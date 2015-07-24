package com.uaihebert.uaidummy.creditcard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class DummyCreditCardGenerator {

    private static final Map<String, Class> SUPPORTED_CREDIT_CARD_MAP = new HashMap<>();

    static {
        SUPPORTED_CREDIT_CARD_MAP.put(Jcb.class.getSimpleName(), Jcb.class);
        SUPPORTED_CREDIT_CARD_MAP.put(Visa.class.getSimpleName(), Visa.class);
        SUPPORTED_CREDIT_CARD_MAP.put(Uatp.class.getSimpleName(), Uatp.class);
        SUPPORTED_CREDIT_CARD_MAP.put(Maestro.class.getSimpleName(), Maestro.class);
        SUPPORTED_CREDIT_CARD_MAP.put(Dankort.class.getSimpleName(), Dankort.class);
        SUPPORTED_CREDIT_CARD_MAP.put(MasterCard.class.getSimpleName(), MasterCard.class);
        SUPPORTED_CREDIT_CARD_MAP.put(DiscoverCard.class.getSimpleName(), DiscoverCard.class);
        SUPPORTED_CREDIT_CARD_MAP.put(InstaPayment.class.getSimpleName(), InstaPayment.class);
        SUPPORTED_CREDIT_CARD_MAP.put(ChinaUnionPay.class.getSimpleName(), ChinaUnionPay.class);
        SUPPORTED_CREDIT_CARD_MAP.put(InterPaymentTM.class.getSimpleName(), InterPaymentTM.class);
        SUPPORTED_CREDIT_CARD_MAP.put(AmericanExpress.class.getSimpleName(), AmericanExpress.class);
        SUPPORTED_CREDIT_CARD_MAP.put(DinersClubCarteBlanche.class.getSimpleName(), DinersClubCarteBlanche.class);
        SUPPORTED_CREDIT_CARD_MAP.put(DinersClubInternational.class.getSimpleName(), DinersClubInternational.class);
    }

    public static List<String> listAllSupportedCreditCards() {
        return Collections.unmodifiableList(new ArrayList<>(SUPPORTED_CREDIT_CARD_MAP.keySet()));
    }

    public static DummyCreditCard generateByName(final String byName) {
        final Class aClass = SUPPORTED_CREDIT_CARD_MAP.get(byName);
        return DummyCreditCardReflectionUtil.instantiateDummyCreditCard(aClass);
    }

    public static String generateVisa() {
        return generateVisaInstance().getNumber();
    }

    public static DummyCreditCard generateVisaInstance() {
        return DummyCreditCardReflectionUtil.instantiateDummyCreditCard(Visa.class);
    }

    public static String generateMasterCard() {
        return generateMasterCardInstance().getNumber();
    }

    public static DummyCreditCard generateMasterCardInstance() {
        return DummyCreditCardReflectionUtil.instantiateDummyCreditCard(MasterCard.class);
    }

    public static String generateAmericanExpress() {
        return generateAmericanExpressInstance().getNumber();
    }

    public static DummyCreditCard generateAmericanExpressInstance() {
        return DummyCreditCardReflectionUtil.instantiateDummyCreditCard(AmericanExpress.class);
    }

    public static String generateChinaUnionPay() {
        return generateChinaUnionPayInstance().getNumber();
    }

    public static DummyCreditCard generateChinaUnionPayInstance() {
        return DummyCreditCardReflectionUtil.instantiateDummyCreditCard(ChinaUnionPay.class);
    }

    public static String generateDinersClubCarteBlanche() {
        return generateDinersClubCarteBlancheInstance().getNumber();
    }

    public static DummyCreditCard generateDinersClubCarteBlancheInstance() {
        return DummyCreditCardReflectionUtil.instantiateDummyCreditCard(DinersClubCarteBlanche.class);
    }

    public static String generateDinersClubInternational() {
        return generateDinersClubInternationalInstance().getNumber();
    }

    public static DummyCreditCard generateDinersClubInternationalInstance() {
        return DummyCreditCardReflectionUtil.instantiateDummyCreditCard(DinersClubInternational.class);
    }

    public static String generateDiscoverCard() {
        return generateDiscoverCardInstance().getNumber();
    }

    public static DummyCreditCard generateDiscoverCardInstance() {
        return DummyCreditCardReflectionUtil.instantiateDummyCreditCard(DiscoverCard.class);
    }

    public static String generateInterPaymentTM() {
        return generateInterPaymentTMInstance().getNumber();
    }

    public static DummyCreditCard generateInterPaymentTMInstance() {
        return DummyCreditCardReflectionUtil.instantiateDummyCreditCard(InterPaymentTM.class);
    }

    public static String generateInstaPayment() {
        return generateInstaPaymentInstance().getNumber();
    }

    public static DummyCreditCard generateInstaPaymentInstance() {
        return DummyCreditCardReflectionUtil.instantiateDummyCreditCard(InstaPayment.class);
    }

    public static String generateJcb() {
        return generateJcbInstance().getNumber();
    }

    public static DummyCreditCard generateJcbInstance() {
        return DummyCreditCardReflectionUtil.instantiateDummyCreditCard(Jcb.class);
    }

    public static String generateMaestro() {
        return generateMaestroInstance().getNumber();
    }

    public static DummyCreditCard generateMaestroInstance() {
        return DummyCreditCardReflectionUtil.instantiateDummyCreditCard(Maestro.class);
    }

    public static String generateDankort() {
        return generateDankortInstance().getNumber();
    }

    public static DummyCreditCard generateDankortInstance() {
        return DummyCreditCardReflectionUtil.instantiateDummyCreditCard(Dankort.class);
    }

    public static String generateUatp() {
        return generateUatpInstance().getNumber();
    }

    public static DummyCreditCard generateUatpInstance() {
        return DummyCreditCardReflectionUtil.instantiateDummyCreditCard(Uatp.class);
    }
}