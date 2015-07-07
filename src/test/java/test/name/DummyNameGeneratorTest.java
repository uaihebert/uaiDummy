package test.name;

import com.uaihebert.uaidummy.name.DummyNameGenerator;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class DummyNameGeneratorTest {

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
        for (int i = 0; i < 100; i++) {
            System.out.println(DummyNameGenerator.generateLastName());
        }

        assertNotNull("A name must be generated", DummyNameGenerator.generateLastName());
        assertNotNull("A name must be generated", DummyNameGenerator.generateLastName());
        assertNotNull("A name must be generated", DummyNameGenerator.generateLastName());
        assertNotNull("A name must be generated", DummyNameGenerator.generateLastName());
        assertNotNull("A name must be generated", DummyNameGenerator.generateLastName());
    }
}