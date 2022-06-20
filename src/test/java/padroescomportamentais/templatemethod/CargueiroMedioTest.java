package padroescomportamentais.templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class CargueiroMedioTest {

    @Test
    void deveRetonarAprovado() {
        CargueiroMedio cargueiroMedio = new CargueiroMedio();
        cargueiroMedio.setPesoAviao(22);
        cargueiroMedio.setPesoCarga(25);
        assertEquals("Peso permitido para decolagem", cargueiroMedio.verificacao());
    }

    @Test
    void deveRetonarReprovado() {
        CargueiroMedio cargueiroMedio = new CargueiroMedio();
        cargueiroMedio.setPesoAviao(22);
        cargueiroMedio.setPesoCarga(41);
        assertEquals("Peso acima do permitido!", cargueiroMedio.verificacao());
    }

    @Test
    void deveRetornarInformacoes() {
        CargueiroMedio cargueiroMedio = new CargueiroMedio();
        cargueiroMedio.setPesoAviao(10);
        cargueiroMedio.setPesoCarga(20);
        cargueiroMedio.setMontadora("Embraer");
        assertEquals("Cargueiro Médio{montadora='Embraer', resultado=Peso permitido para decolagem}", cargueiroMedio.getInformacoes());
    }
}