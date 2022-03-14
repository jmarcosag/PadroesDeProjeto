package padroescriacao.factorymethod;

public class ServicoImportacao implements IServico {

    public String executar() {
        return "Importacao realizada";
    }

    public String cancelar() {
        return "Importacao cancelada";
    }
}
