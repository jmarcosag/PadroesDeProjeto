package padroesestruturais.composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VeiculoTest {

    @Test
    void deveRetornarPartesDoVeiculo() {
        Categoria categoria1 = new Categoria("Forro");
        Categoria categoria2 = new Categoria("Elétrica");
        Categoria categoria3 = new Categoria("Locomoção");
        Especificacao especificacao1 = new Especificacao("Pneus", 4);
        Especificacao especificacao2 = new Especificacao("Circuito do Painel", 20);
        Especificacao especificacao3 = new Especificacao("Tecido do teto", 1);
        categoria3.addConteudo(especificacao1);
        categoria2.addConteudo(especificacao2);
        categoria1.addConteudo(especificacao3);

        Categoria componentes = new Categoria("Carro1");
        componentes.addConteudo(categoria1);
        componentes.addConteudo(categoria2);
        componentes.addConteudo(categoria3);

        Veiculo veiculo = new Veiculo();
        veiculo.setParte(componentes);

        assertEquals("Categoria: Carro1\n" +
                "Categoria: Forro\n" +
                "Especificação: Tecido do teto - Quantidade: 1\n" +
                "Categoria: Elétrica\n" +
                "Especificação: Circuito do Painel - Quantidade: 20\n" +
                "Categoria: Locomoção\n" +
                "Especificação: Pneus - Quantidade: 4\n", veiculo.getParte());
    }

    @Test
    void deveRetornarExcecaoCarroSemPecas() {
        try {
            Veiculo veiculo = new Veiculo();
            veiculo.getParte();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Veiculo sem parte", e.getMessage());
        }
    }
}