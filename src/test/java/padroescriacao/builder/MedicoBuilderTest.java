package padroescriacao.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedicoBuilderTest {

    @Test
    void deveRetornarExcecaoParaMedicoSemCrm() {
        try {
            MedicoBuilder medicoBuilder = new MedicoBuilder();
            Medico medico = medicoBuilder
                    .setNome("Medico 1")
                    .setEmail("medico1@email.com")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("CRM inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaMedicoSemNome() {
        try {
            MedicoBuilder medicoBuilder = new MedicoBuilder();
            Medico medico = medicoBuilder
                    .setMatricula(1)
                    .setEmail("medico1@email.com")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarMedicoValido() {
        MedicoBuilder medicoBuilder = new MedicoBuilder();
        Medico medico = medicoBuilder
                .setMatricula(1)
                .setNome("Medico 1")
                .setEmail("medico1@email.com")
                .build();

        assertNotNull(medico);
    }
}