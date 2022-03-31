package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PotionTest {

    @Test
    void deveRetornarValorPocaoComum() {
        Qualidade qualidade = new QualidadeComum();
        Potion potion = new Potion(50.0f);
        potion.setQualidade(qualidade);
        potion.setQtdCompra(2);
        assertEquals(100.0f, potion.calcularValor(), 0.01f);
    }

    @Test
    void deveRetornarValorPocaoIncomum() {
        Qualidade qualidade = new QualidadeIncomum();
        Potion potion = new Potion(50.0f);
        potion.setQualidade(qualidade);
        potion.setQtdCompra(2);
        assertEquals(110.0f, potion.calcularValor(), 0.01f);
    }

    @Test
    void deveRetornarValorPocaoRara() {
        Qualidade qualidade = new QualidadeRaro();
        Potion potion = new Potion(50.0f);
        potion.setQualidade(qualidade);
        potion.setQtdCompra(2);
        assertEquals(120.0f, potion.calcularValor(), 0.01f);
    }

    @Test
    void deveRetornarValorPocaoLendaria() {
        Qualidade qualidade = new QualidadeLendario();
        Potion potion = new Potion(50.0f);
        potion.setQualidade(qualidade);
        potion.setQtdCompra(2);
        assertEquals(130.0f, potion.calcularValor(), 0.01f);
    }

}