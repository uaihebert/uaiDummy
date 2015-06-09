package test.creditcard;

/**
 * Class that will validate the credit card.
 *
 *
 */
public class LameCreditCardValidator {
    public static void check(final String cardNumber) {
        int[] digits = new int[cardNumber.length()];

        final char[] cardNumberArray = cardNumber.toCharArray();
        for (int i = 0; i < cardNumberArray.length; i++) {
            digits[i] = Integer.valueOf(String.valueOf(cardNumberArray[i]));
        }

        int sum = 0;
        int length = digits.length;
        for (int i = 0; i < length; i++) {

            // get digits in reverse order
            int digit = digits[length - i - 1];

            // every 2nd number multiply with 2
            if (i % 2 == 1) {
                digit *= 2;
            }
            sum += digit > 9 ? digit - 9 : digit;
        }

        if (sum % 10 != 0) {
            throw new IllegalArgumentException("the credit card is not valid");
        }
    }
}