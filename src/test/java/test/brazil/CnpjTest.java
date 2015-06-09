package test.brazil;

import com.uaihebert.uaidummy.brazil.Cnpj;
import com.uaihebert.uaidummy.brazil.CnpjGenerator;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class CnpjTest {

    @Test
    public void isGeneratingValidCpf(){
        String cnpj = CnpjGenerator.generate();

        assertNotNull(cnpj);

        CnpjValidator.isValid(cnpj);
    }

    @Test
    public void isGeneratingValidMaskedCpf(){
        String cnpj = CnpjGenerator.generateMasked();

        assertNotNull(cnpj);

        CnpjValidator.isValid(cnpj);
    }

    @Test
    public void isGeneratingValidCpfInstance(){
        Cnpj cnpj = CnpjGenerator.generateInstance();

        assertNotNull(cnpj);

        CnpjValidator.isValid(cnpj);
    }

}
