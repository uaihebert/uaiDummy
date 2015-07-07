package test.name;

import com.uaihebert.uaidummy.name.DummyNameGenerator;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class DummyNameGeneratorTest {

    @Test
    public void isGeneratingNames() {
        assertNotNull("A name must be generated", DummyNameGenerator.generateFirstName());
        assertNotNull("A name must be generated", DummyNameGenerator.generateFirstName());
        assertNotNull("A name must be generated", DummyNameGenerator.generateFirstName());
        assertNotNull("A name must be generated", DummyNameGenerator.generateFirstName());
        assertNotNull("A name must be generated", DummyNameGenerator.generateFirstName());
    }
}