package test.name;

import com.uaihebert.uaidummy.config.DummyConfig;
import com.uaihebert.uaidummy.name.DummyNameGenerator;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class DummyNameGenerator_pt_BRTest {

    @BeforeClass
    public static void beforeClass() {
        DummyConfig.setCurrentLanguagePT_BR();
    }

    @Test
    public void isGeneratingFirstName() {
        assertNotNull("A name must be generated", DummyNameGenerator.generateFirstName());
        assertNotNull("A name must be generated", DummyNameGenerator.generateFirstName());
        assertNotNull("A name must be generated", DummyNameGenerator.generateFirstName());
        assertNotNull("A name must be generated", DummyNameGenerator.generateFirstName());
        assertNotNull("A name must be generated", DummyNameGenerator.generateFirstName());
    }

    @Test
    public void isGeneratingLastName() {
        assertNotNull("A name must be generated", DummyNameGenerator.generateLastName());
        assertNotNull("A name must be generated", DummyNameGenerator.generateLastName());
        assertNotNull("A name must be generated", DummyNameGenerator.generateLastName());
        assertNotNull("A name must be generated", DummyNameGenerator.generateLastName());
        assertNotNull("A name must be generated", DummyNameGenerator.generateLastName());
    }

    @Test
    public void isGeneratingFullName() {
        assertNotNull("A name must be generated", DummyNameGenerator.generateFullName());
        assertNotNull("A name must be generated", DummyNameGenerator.generateFullName());
        assertNotNull("A name must be generated", DummyNameGenerator.generateFullName());
        assertNotNull("A name must be generated", DummyNameGenerator.generateFullName());
        assertNotNull("A name must be generated", DummyNameGenerator.generateFullName());
    }
}