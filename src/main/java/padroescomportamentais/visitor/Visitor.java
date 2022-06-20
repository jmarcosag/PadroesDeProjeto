package padroescomportamentais.visitor;

public interface Visitor {

    String exibirCaixa(Caixa caixa);
    String exibirSupervisor(Supervisor supervisor);
    String exibirFuncionarioExtra(FuncionarioExtra funcionarioExtra);

}
