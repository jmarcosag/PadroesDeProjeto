package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SpearTest {

    @Test
    void deveRetornarValorLancaComum() {
        Qualidade qualidade = new QualidadeComum();
        Spear spear = new Spear(1000.0f);
        spear.setQualidade(qualidade);
        assertEquals(1000.0f, spear.calcularValor(), 0.01f);
    }

    @Test
    void deveRetornarValorLancaIncomum() {
        Qualidade qualidade = new QualidadeIncomum();
        Spear spear = new Spear(1000.0f);
        spear.setQualidade(qualidade);
        assertEquals(1000.0f, spear.calcularValor(), 0.01f);
    }

    @Test
    void deveRetornarValorLancaRara() {
        Qualidade qualidade = new QualidadeRaro();
        Spear spear = new Spear(1000.0f);
        spear.setQualidade(qualidade);
        assertEquals(1000.0f, spear.calcularValor(), 0.01f);
    }

    @Test
    void deveRetornarValorLancaLendaria() {
        Qualidade qualidade = new QualidadeLendario();
        Spear spear = new Spear(1000.0f);
        spear.setQualidade(qualidade);
        assertEquals(1000.0f, spear.calcularValor(), 0.01f);
    }

}