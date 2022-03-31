package padroesestruturais.adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProdutoTest {

    @Test
    void deveRetornarDescontoBonus() {
        Produto produto = new Produto();
        produto.setDesconto("A");

        assertEquals("A", produto.getDesconto());
    }

    @Test
    void deveRetornarQuantidadePontos() {
        Produto produto = new Produto();
        produto.setDesconto("A");

        assertEquals(9.0f, produto.getPontos());
    }

}