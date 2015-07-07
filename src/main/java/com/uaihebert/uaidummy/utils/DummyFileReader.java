package com.uaihebert.uaidummy.utils;

import com.uaihebert.uaidummy.config.LanguageConfig;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public final class DummyFileReader {
    private DummyFileReader() {
    }

    public static List<String> loadFirstNameFile(final int amountToLoad) {
        final String filePath = "/names/" + LanguageConfig.getCurrentLanguage().name() + "/first_name.txt";

        return loadFileByLine(amountToLoad, filePath);
    }

    private static List<String> loadFileByLine(final int amountToLoad, final String filePath) {
        final List<String> result = new ArrayList<String>();

        final InputStream input = DummyFileReader.class.getResourceAsStream(filePath);

        final Scanner scanner = new Scanner(input);

        try {
            int count = 0;

            while (scanner.hasNext()) {
                result.add(scanner.next());

                ++count;

                if (count == amountToLoad) {
                    break;
                }
            }
        } finally {
            scanner.close();
        }

        return result;
    }
}