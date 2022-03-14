package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class ServicoFactoryTest {

    @Test
    void deveRetornarExcecaoParaServicoInexistente() {
        try {
            IServico servico = ServicoFactory.obterServico("Ar");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Serviço inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaServicoInvalido() {
        try {
            IServico servico = ServicoFactory.obterServico("Ecommerce");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Serviço inválido", e.getMessage());
        }
    }
}