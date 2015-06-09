package test.creditcard;

import com.uaihebert.uaidummy.creditcard.CreditCard;
import com.uaihebert.uaidummy.creditcard.CreditCardGenerator;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class CreditCardTest {

    @Test
    public void isGeneratingValidVisaNumber() {
        final String creditCard = CreditCardGenerator.generateVisa();

        assertNotNull(creditCard);

        ForTestOnlyCreditCardValidator.validate(creditCard);
    }

    @Test
    public void isGeneratingValidVisaInstance() {
        final CreditCard creditCard = CreditCardGenerator.generateVisaInstance();

        assertNotNull(creditCard);

        ForTestOnlyCreditCardValidator.validate(creditCard.getNumber());
    }
}