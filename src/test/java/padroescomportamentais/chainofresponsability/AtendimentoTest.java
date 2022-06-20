package padroescomportamentais.chainofresponsability;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AtendimentoTest {

    AtendenteCancelamento atendenteCancelamento;
    AtendenteContratacao atendenteContratacao;
    AtendenteMudanca atendenteMudanca;

    @BeforeEach
    void setUp() {
        atendenteContratacao = new AtendenteContratacao(atendenteContratacao);
        atendenteMudanca = new AtendenteMudanca(atendenteMudanca);
        atendenteCancelamento = new AtendenteCancelamento(null);
    }

    @Test
    void deveRetornarAtendimentoContratacao() {
        assertEquals("Atendimentos para contratação de planos", atendenteContratacao.realizarServico(new Atendimento(Contratar.getContratacao())));
    }

    @Test
    void deveRetornarAtendimentoMudanca() {
        Atendimento atendimento = new Atendimento(Mudanca.getMudanca());
        assertEquals("Atendimentos para mudanças de planos", atendenteMudanca.realizarServico(atendimento));
    }

    @Test
    void deveRetornarAtendimentoCancelamento() {
        Atendimento atendimento = new Atendimento(Cancelar.getCancelar());
        assertEquals("Atendimentos para cancelamentos de planos", atendenteCancelamento.realizarServico(atendimento));
    }

    @Test
    void deveRetornarAtendimentoIndisponivel() {
        Atendimento atendimento = new Atendimento(Cancelar.getCancelar());
        atendenteCancelamento.atendimentoAtendente.remove(0);
        assertEquals("Atendimento indisponível", atendenteCancelamento.realizarServico(atendimento));
    }

}