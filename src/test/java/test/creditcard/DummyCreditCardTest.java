package test.creditcard;

import com.uaihebert.uaidummy.creditcard.DummyCreditCard;
import com.uaihebert.uaidummy.creditcard.DummyCreditCardGenerator;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class DummyCreditCardTest {

    @Test
    public void isGeneratingValidVisaNumber() {
        validateNumber(DummyCreditCardGenerator.generateVisa());
        validateNumber(DummyCreditCardGenerator.generateMasterCard());
        validateNumber(DummyCreditCardGenerator.generateAmericanExpress());
        validateNumber(DummyCreditCardGenerator.generateChinaUnionPay());
        validateNumber(DummyCreditCardGenerator.generateDinersClubCarteBlanche());
        validateNumber(DummyCreditCardGenerator.generateDinersClubInternational());
        validateNumber(DummyCreditCardGenerator.generateDiscoverCard());
        validateNumber(DummyCreditCardGenerator.generateInterPaymentTM());
        validateNumber(DummyCreditCardGenerator.generateInstaPayment());
        validateNumber(DummyCreditCardGenerator.generateJcb());
        validateNumber(DummyCreditCardGenerator.generateMaestro());
        validateNumber(DummyCreditCardGenerator.generateDankort());
        validateNumber(DummyCreditCardGenerator.generateUatp());
    }

    @Test
    public void isGeneratingValidVisaInstance() {
        validateCreditCardData(DummyCreditCardGenerator.generateVisaInstance());
        validateCreditCardData(DummyCreditCardGenerator.generateMasterCardInstance());
        validateCreditCardData(DummyCreditCardGenerator.generateAmericanExpressInstance());
        validateCreditCardData(DummyCreditCardGenerator.generateChinaUnionPayInstance());
        validateCreditCardData(DummyCreditCardGenerator.generateDinersClubCarteBlancheInstance());
        validateCreditCardData(DummyCreditCardGenerator.generateDinersClubInternationalInstance());
        validateCreditCardData(DummyCreditCardGenerator.generateDiscoverCardInstance());
        validateCreditCardData(DummyCreditCardGenerator.generateInterPaymentTMInstance());
        validateCreditCardData(DummyCreditCardGenerator.generateInstaPaymentInstance());
        validateCreditCardData(DummyCreditCardGenerator.generateJcbInstance());
        validateCreditCardData(DummyCreditCardGenerator.generateMaestroInstance());
        validateCreditCardData(DummyCreditCardGenerator.generateDankortInstance());
        validateCreditCardData(DummyCreditCardGenerator.generateUatpInstance());
    }

    private void validateNumber(String creditCard) {
        assertNotNull(creditCard);

        ForTestOnlyCreditCardValidator.validate(creditCard);
    }

    private void validateCreditCardData(DummyCreditCard dummyCreditCard) {
        assertNotNull(dummyCreditCard);
        assertNotNull(dummyCreditCard.getExpirationDate());
        assertNotNull(dummyCreditCard.getNumber());
        assertNotNull(dummyCreditCard.getSecurityNumber());

        ForTestOnlyCreditCardValidator.validate(dummyCreditCard.getNumber());
    }
}