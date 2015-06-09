package test.brazil;

import com.uaihebert.uaidummy.brazil.DummyCnpj;
import com.uaihebert.uaidummy.brazil.DummyCnpjGenerator;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class DummyCnpjTest {

    @Test
    public void isGeneratingValidCpf(){
        String cnpj = DummyCnpjGenerator.generate();

        assertNotNull(cnpj);

        ForTestOnlyCnpjValidator.isValid(cnpj);
    }

    @Test
    public void isGeneratingValidMaskedCpf(){
        String cnpj = DummyCnpjGenerator.generateMasked();

        assertNotNull(cnpj);

        ForTestOnlyCnpjValidator.isValid(cnpj);
    }

    @Test
    public void isGeneratingValidCpfInstance(){
        DummyCnpj cnpj = DummyCnpjGenerator.generateInstance();

        assertNotNull(cnpj);

        ForTestOnlyCnpjValidator.isValid(cnpj);
    }

}
