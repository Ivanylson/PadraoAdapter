import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SatisfacaoClienteTest {
    @Test
    void deveRetonarSatisfacaoCliente(){
        SatisfacaoCliente satisfacaoCliente = new SatisfacaoCliente();
        satisfacaoCliente.setAvaliacao("Neutro");
        assertEquals("Neutro", satisfacaoCliente.getAvaliacao());
    }

    @Test
    void deveRetonarSatisfacaoClienteClassificacao(){
        SatisfacaoCliente satisfacaoCliente = new SatisfacaoCliente();
        satisfacaoCliente.setAvaliacao("Neutro");
        assertEquals(3, satisfacaoCliente.getClassificacao());
    }

}