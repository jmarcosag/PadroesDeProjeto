package padroesestruturais.facade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CidadaoTest {

    @Test
    void deveRetornarPendenciaGovernoEmprestimo() {
        Cidadao cidadao = new Cidadao();
        Receita.getInstancia().addCidadaoPendente(cidadao);

        assertEquals(false, cidadao.solicitarEmprestimo());
    }

    @Test
    void deveRetornarPendenciaReceitaEmprestimo() {
        Cidadao cidadao = new Cidadao();
        Governo.getInstancia().addCidadaoPendente(cidadao);

        assertEquals(false, cidadao.solicitarEmprestimo());
    }

    @Test
    void deveRetornarPendenciaPoliciaEmprestimo() {
        Cidadao cidadao = new Cidadao();
        Policia.getInstancia().addCidadaoPendente(cidadao);

        assertEquals(false, cidadao.solicitarEmprestimo());
    }

    @Test
    void deveRetornarCidadaoSemPendenciaEmprestimo() {
        Cidadao cidadao = new Cidadao();

        assertEquals(true, cidadao.solicitarEmprestimo());
    }

}