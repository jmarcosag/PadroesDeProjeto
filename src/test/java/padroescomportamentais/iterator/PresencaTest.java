package padroescomportamentais.iterator;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PresencaTest {

    @Test
    public void deveContarInscritosPresentesDia(){
        DataEvento dataEvento = new DataEvento(
                new Inscrito("Joao", true),
                new Inscrito("Pedro", true),
                new Inscrito("Tadeu", false)
        );
        assertEquals(2, Presenca.InscritosPresentes(dataEvento));
    }

    @Test
    public void deveContarTotalInscritosMatriculados() {
        DataEvento dataEvento = new DataEvento(
                new Inscrito("Joao", true),
                new Inscrito("Pedro", true),
                new Inscrito("Tadeu", false),
                new Inscrito("Marco", true),
                new Inscrito("Tassio", true)

        );
        assertEquals(5, Presenca.totalInscritosMatriculados(dataEvento));
    }

}