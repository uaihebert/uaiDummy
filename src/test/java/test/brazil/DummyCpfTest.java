package test.brazil;

import com.uaihebert.uaidummy.brazil.DummyCpfGenerator;
import com.uaihebert.uaidummy.brazil.DummyCpf;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class DummyCpfTest {

    @Test
    public void isGeneratingValidCpf(){
        String cpf = DummyCpfGenerator.generate();

        assertNotNull(cpf);

        ForTestOnlyCpfValidator.isValid(cpf);
    }

    @Test
    public void isGeneratingValidMaskedCpf(){
        String cpf = DummyCpfGenerator.generateMasked();

        assertNotNull(cpf);

        ForTestOnlyCpfValidator.isValid(cpf);
    }

    @Test
    public void isGeneratingValidCpfInstance(){
        DummyCpf cpf = DummyCpfGenerator.generateInstance();

        assertNotNull(cpf);

        ForTestOnlyCpfValidator.isValid(cpf);
    }

}
