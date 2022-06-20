package padroescomportamentais.memento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class EstadoTest {

    @Test
    void deveArmazenarEstados() {
        Veiculo veiculo = new Veiculo();
        veiculo.setEstado(VeiculoRetido.getInstance());
        veiculo.setEstado(VeiculoDocumentoVencido.getInstance());
        assertEquals(2, veiculo.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicial() {
        Veiculo veiculo = new Veiculo();
        veiculo.setEstado(VeiculoRetido.getInstance());
        veiculo.setEstado(VeiculoDocumentoVencido.getInstance());
        veiculo.restauraEstado(0);
        assertEquals(VeiculoRetido.getInstance(), veiculo.getEstado());
    }

    @Test
    void deveRetornarEstadoAnterior() {
        Veiculo veiculo = new Veiculo();
        veiculo.setEstado(VeiculoRetido.getInstance());
        veiculo.setEstado(VeiculoRetido.getInstance());
        veiculo.setEstado(VeiculoDocumentoVencido.getInstance());
        veiculo.restauraEstado(1);
        assertEquals(VeiculoRetido.getInstance(), veiculo.getEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Veiculo veiculo = new Veiculo();
            veiculo.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }

}