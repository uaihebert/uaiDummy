package test.creditcard;

import com.uaihebert.uaidummy.creditcard.CreditCardGenerator;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class CreditCardTest {

    @Test
    public void isGeneratingValidVisa() {
        final String creditCard = CreditCardGenerator.VISA.generate();

        assertNotNull(creditCard);

        LameCreditCardValidator.check(creditCard);
    }
}