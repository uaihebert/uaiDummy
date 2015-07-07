package test.utils;

import com.uaihebert.uaidummy.name.DummyNameGenerator;
import com.uaihebert.uaidummy.utils.DummyFileReader;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public final class DummyFileReaderTest {

    @Test
    public void isReadingFile() {
        final List<String> firstNameList = DummyFileReader.loadFirstNameFile(DummyNameGenerator.getMaxFirstNamesInCache());
        assertFalse("should have values" , firstNameList.isEmpty());
    }

    @Test
    public void isLoadingWIthMaxValueDefined() {
        final List<String> firstNameList = DummyFileReader.loadFirstNameFile(DummyNameGenerator.getMaxFirstNamesInCache());
        assertEquals("should load the same amount of the defined cache value", DummyNameGenerator.getMaxFirstNamesInCache(), firstNameList.size());
    }
}