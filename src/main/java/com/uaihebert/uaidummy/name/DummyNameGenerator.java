package com.uaihebert.uaidummy.name;

import com.uaihebert.uaidummy.utils.DummyFileReader;
import com.uaihebert.uaidummy.utils.RandomUtils;

import java.util.ArrayList;
import java.util.List;

public final class DummyNameGenerator {
    // todo create a configuration for this
    private static int MAX_LAST_NAMES_IN_CACHE = 1000;
    private static int MAX_FIRST_NAMES_IN_CACHE = 1000;

    private static final List<String> FIRST_NAME_LIST = new ArrayList<String>();

    static {
        loadFirstName();
    }

    private static void loadFirstName() {
        FIRST_NAME_LIST.clear();
        FIRST_NAME_LIST.addAll(DummyFileReader.loadFirstNameFile(MAX_FIRST_NAMES_IN_CACHE));
    }

    private DummyNameGenerator() {
    }

    public static String generateFirstName() {
        final int randomIndex = RandomUtils.nextIntBetween(0, FIRST_NAME_LIST.size());
        return FIRST_NAME_LIST.get(randomIndex);
    }

    public static int getMaxLastNamesInCache() {
        return MAX_LAST_NAMES_IN_CACHE;
    }

    public static int getMaxFirstNamesInCache() {
        return MAX_FIRST_NAMES_IN_CACHE;
    }
}