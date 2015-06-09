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
        System.out.println(">>" + dummyCreditCard.getExpirationDate());

        ForTestOnlyCreditCardValidator.validate(dummyCreditCard.getNumber());
    }
}