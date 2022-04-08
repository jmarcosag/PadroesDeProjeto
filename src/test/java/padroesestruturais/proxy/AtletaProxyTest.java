package padroesestruturais.proxy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class AtletaProxyTest {

    @BeforeEach
    void setUp() {
        BD.addAluno(new Atleta(1, "Eduardo", "Rio de janeiro", 6.0f, 7.0f));
        BD.addAluno(new Atleta(2, "Carolina", "Vassouras", 10.0f, 9.0f));
    }

    @Test
    void deveRetornarDadosPessoaisAluno() {
        AtletaProxy aluno = new AtletaProxy(1);

        assertEquals(Arrays.asList("Eduardo", "Rio de janeiro"), aluno.obterDadosPessoais());
    }

    @Test
    void deveRetonarNotasAluno() {
        Funcionario funcionario = new Funcionario("Mariana", true);
        AtletaProxy aluno = new AtletaProxy(2);

        assertEquals(Arrays.asList(10.0f, 9.0f), aluno.obterNotas(funcionario));
    }

    @Test
    void deveRetonarExcecaoUsuarioNaoAutorizadoConsultarNotasAluno() {
        try {
            Funcionario funcionario = new Funcionario("Carla", false);
            AtletaProxy aluno = new AtletaProxy(2);

            aluno.obterNotas(funcionario);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Funcionário não autorizado", e.getMessage());
        }
    }
}