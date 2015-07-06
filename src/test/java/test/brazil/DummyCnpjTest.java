package test.brazil;

import com.uaihebert.uaidummy.brazil.DummyCnpj;
import com.uaihebert.uaidummy.brazil.DummyCnpjGenerator;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class DummyCnpjTest {
    private static final int TOTAL_OF_LOOPS = 100;

    @Test
    public void isGeneratingValidCpf(){
        for (int i = 0; i < TOTAL_OF_LOOPS; i++) {
            final String cnpj = DummyCnpjGenerator.generate();

            assertNotNull(cnpj);

            ForTestOnlyCnpjValidator.isValid(cnpj);
        }
    }

    @Test
    public void isGeneratingValidMaskedCpf(){
        for (int i = 0; i < TOTAL_OF_LOOPS; i++) {
            final String cnpj = DummyCnpjGenerator.generateMasked();

            assertNotNull(cnpj);

            ForTestOnlyCnpjValidator.isValid(cnpj);
        }
    }

    @Test
    public void isGeneratingValidCpfInstance(){
        for (int i = 0; i < TOTAL_OF_LOOPS; i++) {
            final DummyCnpj cnpj = DummyCnpjGenerator.generateInstance();

            assertNotNull(cnpj);

            ForTestOnlyCnpjValidator.isValid(cnpj);
        }
    }
}