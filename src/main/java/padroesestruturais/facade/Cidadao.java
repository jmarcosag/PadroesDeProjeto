package padroesestruturais.facade;

public class Cidadao {

    public boolean solicitarEmprestimo() {
        return CidadaoFacade.verificarPendenciasEmprestimo(this);
    }
}
