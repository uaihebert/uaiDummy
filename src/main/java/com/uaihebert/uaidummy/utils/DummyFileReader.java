package com.uaihebert.uaidummy.utils;

import com.uaihebert.uaidummy.config.LanguageConfig;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class DummyFileReader {
    private static final Logger LOGGER = Logger.getLogger("DummyFileReader");

    private DummyFileReader() {
    }

    public static List<String> loadFirstNameFile(final int amountToLoad) {
        final String filePath = "/names/" + LanguageConfig.getCurrentLanguage().name() + "/first_name.txt";

        return loadFileByLine(amountToLoad, filePath);
    }

    private static List<String> loadFileByLine(final int amountToLoad, final String filePath) {
        final List<String> result = new ArrayList<>();

        try (
                final InputStream input = DummyFileReader.class.getResourceAsStream(filePath);
                final Scanner scanner = new Scanner(input)
        ) {
            int count = 0;

            while (scanner.hasNext()) {
                result.add(scanner.next());

                ++count;

                if (count == amountToLoad) {
                    break;
                }
            }
        } catch (final IOException ex) {
            LOGGER.log(Level.WARNING, "error reading file: " + filePath, ex);
        }

        return result;
    }
}