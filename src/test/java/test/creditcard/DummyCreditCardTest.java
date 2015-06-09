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
    }

    @Test
    public void isGeneratingValidVisaInstance() {
        validateCreditCardData(DummyCreditCardGenerator.generateVisaInstance());
        validateCreditCardData(DummyCreditCardGenerator.generateMasterCardInstance());
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