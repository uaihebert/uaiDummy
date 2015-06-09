package com.uaihebert.uaidummy.creditcard;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

final class ExpirationDateUtil {
    private ExpirationDateUtil() {
    }

    static String generateNonExpirationDate(final String mask) {
        final Date expirationDate = createNonExpiredDate();

        return new SimpleDateFormat(mask).format(expirationDate);
    }

    private static Date createNonExpiredDate() {
        int year = getRandomYear();
        int month = getRandomMonth();
        int day = getRandomDay();

        final Calendar calendar = Calendar.getInstance();

        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month);
        calendar.set(Calendar.DAY_OF_MONTH, day);

        return calendar.getTime();
    }

    private static int getRandomYear() {
        final Calendar now = Calendar.getInstance();
        now.add(Calendar.YEAR, 1);

        final int startYear = now.get(Calendar.YEAR);
        final int endYear = startYear + 7;

        return getRandom(startYear, endYear);
    }

    private static int getRandomMonth() {
        return getRandom(1, 12);
    }

    private static int getRandomDay() {
        return getRandom(1, 28);
    }

    private static int getRandom(final int start, final int end) {
        return start + (int)Math.round(Math.random() * (end - start));
    }
}