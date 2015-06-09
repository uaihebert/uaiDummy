package test.brazil;

import com.uaihebert.uaidummy.brazil.Cpf;
import com.uaihebert.uaidummy.brazil.CpfGenerator;
import org.junit.Test;

import static org.junit.Assert.*;

public class CpfTest {

    @Test
    public void isGeneratingValidCpf(){
        String cpf = CpfGenerator.generate();

        assertNotNull(cpf);

        CpfValidator.isValid(cpf);
    }

    @Test
    public void isGeneratingValidMaskedCpf(){
        String cpf = CpfGenerator.generateMasked();

        assertNotNull(cpf);

        CpfValidator.isValid(cpf);
    }

    @Test
    public void isGeneratingValidCpfInstance(){
        Cpf cpf = CpfGenerator.generateInstance();

        assertNotNull(cpf);

        CpfValidator.isValid(cpf);
    }

}
