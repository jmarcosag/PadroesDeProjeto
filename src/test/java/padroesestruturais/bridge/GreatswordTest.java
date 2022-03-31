package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GreatswordTest {

    @Test
    void deveRetornarValorGrandeEspadaComum() {
        Qualidade qualidade = new QualidadeComum();
        Greatsword greatsword = new Greatsword(2000.0f);
        greatsword.setQualidade(qualidade);
        assertEquals(2000.0f, greatsword.calcularValor(), 0.01f);
    }

    @Test
    void deveRetornarValorGrandeEspadaIncomum() {
        Qualidade qualidade = new QualidadeIncomum();
        Greatsword greatsword = new Greatsword(2000.0f);
        greatsword.setQualidade(qualidade);
        assertEquals(2200.0f, greatsword.calcularValor(), 0.01f);
    }

    @Test
    void deveRetornarValorGrandeEspadaRara() {
        Qualidade qualidade = new QualidadeRaro();
        Greatsword greatsword = new Greatsword(2000.0f);
        greatsword.setQualidade(qualidade);
        assertEquals(2400.0f, greatsword.calcularValor(), 0.01f);
    }

    @Test
    void deveRetornarValorGrandeEspadaLendaria() {
        Qualidade qualidade = new QualidadeLendario();
        Greatsword greatsword = new Greatsword(2000.0f);
        greatsword.setQualidade(qualidade);
        assertEquals(2600.0f, greatsword.calcularValor(), 0.01f);
    }

}