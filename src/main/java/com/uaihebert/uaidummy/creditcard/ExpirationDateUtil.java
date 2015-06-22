package com.uaihebert.uaidummy.creditcard;

import com.uaihebert.uaidummy.utils.StringHelper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public final class ExpirationDateUtil {
    private ExpirationDateUtil() {
    }

    static String generateNonExpirationDate(final String mask) {
        final Date expirationDate = createNonExpiredDate();

        return new SimpleDateFormat(mask).format(expirationDate);
    }

    static String extractYear(final String date, final String mask) {
        final Calendar calendar = getCalendar(date, mask);

        return String.valueOf(calendar.get(Calendar.YEAR));
    }

    static String extractMonth(final String date, final String mask) {
        final Calendar calendar = getCalendar(date, mask);

        final int month = calendar.get(Calendar.MONTH) + 1;

        return StringHelper.leftFill("00", month);
    }

    private static Calendar getCalendar(String date, String mask) {
        try {
            final Date parsedDate = new SimpleDateFormat(mask).parse(date);
            final Calendar calendar = Calendar.getInstance();
            calendar.setTime(parsedDate);
            return calendar;
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
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