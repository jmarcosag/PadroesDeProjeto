package padroesestruturais.facade;

public class CidadaoFacade {

    public static boolean verificarPendenciasEmprestimo(Cidadao cidadao) {
        if (Governo.getInstancia().verificarCidadaoComPendencia(cidadao)) {
            return false;
        }
        if (Receita.getInstancia().verificarCidadaoComPendencia(cidadao)) {
            return false;
        }
        if (Policia.getInstancia().verificarCidadaoComPendencia(cidadao)) {
            return false;
        }
        return true;
    }
}
