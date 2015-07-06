package test.usa;

import com.uaihebert.uaidummy.usa.DummySocialSecurityNumberGenerator;
import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.fail;

/**
 * Validation regex was found in here:
 * http://www.codeproject.com/Articles/651609/Validating-Social-Security-Numbers-through-Regular
 *     Under: Actual Validation (takes into consideration all of the previous rules)
 */
public class SocialSecurityNumberTest {
    private static final int TOTAL_OF_LOOPS = 3000;

    private static final String SSN_WITH_MASK = "^(?!219-09-9999|078-05-1120)(?!666|000|9\\d{2})\\d{3}-(?!00)\\d{2}-(?!0{4})\\d{4}$";
    private static final String SSN_WITHOUT_MASK = "^(?!219099999|078051120)(?!666|000|9\\d{2})\\d{3}(?!00)\\d{2}(?!0{4})\\d{4}$";

    @Test
    public void isGeneratingCorrectWithoutMask() {
        for (int i = 0; i < TOTAL_OF_LOOPS; i++) {
            final String ssn = DummySocialSecurityNumberGenerator.generate();

            validate(ssn, SSN_WITHOUT_MASK);
        }
    }

    @Test
    public void isGeneratingCorrectWithMask() {
        for (int i = 0; i < TOTAL_OF_LOOPS; i++) {
            final String ssn = DummySocialSecurityNumberGenerator.generateMasked();

            validate(ssn, SSN_WITH_MASK);
        }
    }

    private void validate(final String ssn, final String mask) {
        final Pattern ssnFormat = Pattern.compile(mask);

        Matcher m = ssnFormat.matcher(ssn);

        if (!m.find()) {
            fail("an invalid value was found: " + ssn);
        }
    }
}