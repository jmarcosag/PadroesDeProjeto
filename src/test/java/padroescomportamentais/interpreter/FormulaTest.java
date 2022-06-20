package padroescomportamentais.interpreter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FormulaTest {

    @Test
    void deveCalcularExpressaoComFormula() {
        Empresa empresa = new Empresa();
        empresa.setValor1(2.0);
        empresa.setValor2(5.0);

        assertEquals(9.0, empresa.calcularCrescimento());
    }

}