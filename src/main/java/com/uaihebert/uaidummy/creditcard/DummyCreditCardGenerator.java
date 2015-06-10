package com.uaihebert.uaidummy.creditcard;

public final class DummyCreditCardGenerator {
    private DummyCreditCardGenerator() {

    }

    public static String generateVisa() {
        return generateVisaInstance().getNumber();
    }

    public static DummyCreditCard generateVisaInstance() {
        return new Visa();
    }

    public static String generateMasterCard() {
        return generateMasterCardInstance().getNumber();
    }

    public static DummyCreditCard generateMasterCardInstance() {
        return new MasterCard();
    }

    public static String generateAmericanExpress() {
        return generateAmericanExpressInstance().getNumber();
    }

    public static DummyCreditCard generateAmericanExpressInstance() {
        return new AmericanExpress();
    }

    public static String generateChinaUnionPay() {
        return generateChinaUnionPayInstance().getNumber();
    }

    public static DummyCreditCard generateChinaUnionPayInstance() {
        return new ChinaUnionPay();
    }

    public static String generateDinersClubCarteBlanche() {
        return generateDinersClubCarteBlancheInstance().getNumber();
    }

    public static DummyCreditCard generateDinersClubCarteBlancheInstance() {
        return new DinersClubCarteBlanche();
    }

    public static String generateDinersClubInternational() {
        return generateDinersClubInternationalInstance().getNumber();
    }

    public static DummyCreditCard generateDinersClubInternationalInstance() {
        return new DinersClubInternational();
    }

    public static String generateDiscoverCard() {
        return generateDiscoverCardInstance().getNumber();
    }

    public static DummyCreditCard generateDiscoverCardInstance() {
        return new DiscoverCard();
    }

    public static String generateInterPaymentTM() {
        return generateInterPaymentTMInstance().getNumber();
    }

    public static DummyCreditCard generateInterPaymentTMInstance() {
        return new InterPaymentTM();
    }

    public static String generateInstaPayment() {
        return generateInstaPaymentInstance().getNumber();
    }

    public static DummyCreditCard generateInstaPaymentInstance() {
        return new InstaPayment();
    }

    public static String generateJcb() {
        return generateJcbInstance().getNumber();
    }

    public static DummyCreditCard generateJcbInstance() {
        return new Jcb();
    }

    public static String generateMaestro() {
        return generateMaestroInstance().getNumber();
    }

    public static DummyCreditCard generateMaestroInstance() {
        return new Maestro();
    }

    public static String generateDankort() {
        return generateDankortInstance().getNumber();
    }

    public static DummyCreditCard generateDankortInstance() {
        return new Dankort();
    }

    public static String generateUatp() {
        return generateUatpInstance().getNumber();
    }

    public static DummyCreditCard generateUatpInstance() {
        return new Uatp();
    }
}