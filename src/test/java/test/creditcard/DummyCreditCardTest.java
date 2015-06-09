package test.creditcard;

import com.uaihebert.uaidummy.creditcard.DummyCreditCard;
import com.uaihebert.uaidummy.creditcard.DummyCreditCardGenerator;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class DummyCreditCardTest {

    @Test
    public void isGeneratingValidVisaNumber() {
        final String creditCard = DummyCreditCardGenerator.generateVisa();

        assertNotNull(creditCard);

        ForTestOnlyCreditCardValidator.validate(creditCard);
    }

    @Test
    public void isGeneratingValidVisaInstance() {
        final DummyCreditCard dummyCreditCard = DummyCreditCardGenerator.generateVisaInstance();

        assertNotNull(dummyCreditCard);
        assertNotNull(dummyCreditCard.getExpirationDate());
        assertNotNull(dummyCreditCard.getNumber());
        assertNotNull(dummyCreditCard.getSecurityNumber());

        ForTestOnlyCreditCardValidator.validate(dummyCreditCard.getNumber());
    }
}