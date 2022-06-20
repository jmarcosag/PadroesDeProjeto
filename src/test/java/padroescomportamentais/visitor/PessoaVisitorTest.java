package padroescomportamentais.visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PessoaVisitorTest {

    @Test
    void deveExibirAluno() {
        Caixa caixa = new Caixa(123456, "Ana", new Cargo("Caixa"));

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Caixa{cpf=123456, nome='Ana', cargo=Caixa}", visitor.exibir(caixa));
    }

    @Test
    void deveExibirProfessor() {
        Supervisor supervisor = new Supervisor(123456, "Maria", "Gelados");

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Supervisor{cpf=123456, nome='Maria', setor='Gelados'}", visitor.exibir(supervisor));
    }

    @Test
    void deveExibirFuncionario() {
        FuncionarioExtra funcionarioExtra = new FuncionarioExtra(1, "Pedro", 150.0f);

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("FuncionarioExtra{codigo=1, nome='Pedro', diaria=150.0}", visitor.exibir(funcionarioExtra));
    }

}