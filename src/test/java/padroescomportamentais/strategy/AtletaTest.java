package padroescomportamentais.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class AtletaTest {

    @Test
    void deveSomarNotaAluno() {
        Atleta atleta = new Atleta();
        atleta.somarPontos(80.0f, 20.0f);
        assertEquals(100.0f, atleta.getPontos());
    }

    @Test
    void deveSubtrairNotaAluno() {
        Atleta atleta = new Atleta();
        atleta.subtrairPontos(80.0f, 10.0f);
        assertEquals(70.0f, atleta.getPontos());
    }

    @Test
    void deveMultiplicarNotaAluno() {
        Atleta atleta = new Atleta();
        atleta.multiplicarPontos(80.0f, 1.1f);
        assertEquals(88.0f, atleta.getPontos());
    }

    @Test
    void deveDividirNotaAluno() {
        Atleta atleta = new Atleta();
        atleta.dividirPontos(100.0f, 2.0f);
        assertEquals(50.0f, atleta.getPontos());
    }

    @Test
    void naoDeveDividirNotaAlunoPorZero() {
        try {
            Atleta atleta = new Atleta();
            atleta.dividirPontos(100.0f, 0.0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Divisão por zero", e.getMessage());
        }
    }

    @Test
    void deveCalcularMediaNotaAluno() {
        Atleta atleta = new Atleta();
        atleta.calcularMediaPontos(70.0f, 80.0f);
        assertEquals(75.0f, atleta.getPontos());
    }

}