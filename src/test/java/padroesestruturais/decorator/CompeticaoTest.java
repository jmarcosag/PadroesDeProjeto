package padroesestruturais.decorator;

import org.junit.jupiter.api.Test;

class CompeticaoTest {

    @Test
    void deveRetornarOLimiteDeTempo() {
        Competicao competicao = new CompeticaoTriathlon(1000.0f);

        assertEquals(1000.0f, competicao.getLimiteTempo());
    }

    @Test
    void deveRetornarLimiteTempoCorrida() {
        Competicao competicao = new TorneioCorrida(new CompeticaoTriathlon(1000.0f));

        assertEquals(1100.0f, competicao.getLimiteTempo());
    }

    @Test
    void deveRetornarLimiteTempoNatacao() {
        Competicao competicao = new TorneioNatacao(new CompeticaoTriathlon(1000.0f));

        assertEquals(1200.0f, competicao.getLimiteTempo());
    }

}