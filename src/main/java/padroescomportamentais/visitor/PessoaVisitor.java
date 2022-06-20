package padroescomportamentais.visitor;

public class PessoaVisitor implements Visitor {

    public String exibir(Pessoa pessoa) {
        return pessoa.aceitar(this);
    }

    @Override
    public String exibirCaixa(Caixa caixa) {
        return "Caixa{" +
                "cpf=" + caixa.getCpf() +
                ", nome='" + caixa.getNome() + '\'' +
                ", cargo=" + caixa.getNomeCargo() +
                '}';
    }

    @Override
    public String exibirSupervisor(Supervisor supervisor) {
        return "Supervisor{" +
                "cpf=" + supervisor.getCpf() +
                ", nome='" + supervisor.getNome() + '\'' +
                ", setor='" + supervisor.getSetor() + '\'' +
                '}';
    }

    @Override
    public String exibirFuncionarioExtra(FuncionarioExtra funcionarioExtra) {
        return "FuncionarioExtra{" +
                "codigo=" + funcionarioExtra.getCodigo() +
                ", nome='" + funcionarioExtra.getNome() + '\'' +
                ", diaria=" + funcionarioExtra.getValorDiaria() +
                '}';
    }
}
