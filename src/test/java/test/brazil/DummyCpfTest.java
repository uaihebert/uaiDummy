package test.brazil;

import com.uaihebert.uaidummy.brazil.DummyCpfGenerator;
import com.uaihebert.uaidummy.brazil.DummyCpf;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class DummyCpfTest {
    private static final int TOTAL_OF_LOOPS = 100;

    @Test
    public void isGeneratingValidCpf(){
        for (int i = 0; i < TOTAL_OF_LOOPS; i++) {
            final String cpf = DummyCpfGenerator.generate();

            assertNotNull(cpf);

            ForTestOnlyCpfValidator.isValid(cpf);
        }
    }

    @Test
    public void isGeneratingValidMaskedCpf(){
        for (int i = 0; i < TOTAL_OF_LOOPS; i++) {
            final String cpf = DummyCpfGenerator.generateMasked();

            assertNotNull(cpf);

            ForTestOnlyCpfValidator.isValid(cpf);
        }
    }

    @Test
    public void isGeneratingValidCpfInstance(){
        for (int i = 0; i < TOTAL_OF_LOOPS; i++) {
            final DummyCpf cpf = DummyCpfGenerator.generateInstance();

            assertNotNull(cpf);

            ForTestOnlyCpfValidator.isValid(cpf);
        }
    }
}