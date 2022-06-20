package padroescomportamentais.mediator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MensagemTest {

    @Test
    void deveElogiarSecretaria() {
        Cliente cliente = new Cliente();
        assertEquals("A Ouvidoria agradece seu contato.\nO Suporte respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>O Suporte agradece a mensagem: Ótimo atendimento",
                cliente.elogiarSuporte("Ótimo atendimento"));
    }

    @Test
    void deveReclamarSecretaria() {
        Cliente cliente = new Cliente();
        assertEquals("A Ouvidoria agradece seu contato.\nO Suporte respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>O Suporte vai procurar melhorar o serviço da reclamação: Lentidão no atendimento",
                cliente.reclamarSuporte("Lentidão no atendimento"));
    }

    @Test
    void deveSugerirSecretaria() {
        Cliente cliente = new Cliente();
        assertEquals("A Ouvidoria agradece seu contato.\nO Suporte respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>O Suporte vai analisar a sugestão: Ampliar horário funcionamento",
                cliente.sugerirSuporte("Ampliar horário funcionamento"));
    }

}