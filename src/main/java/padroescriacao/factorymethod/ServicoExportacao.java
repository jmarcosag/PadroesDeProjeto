package padroescriacao.factorymethod;

public class ServicoExportacao implements IServico {

    public String executar() {
        return "Exportacao realizada";
    }

    public String cancelar() {
        return "Exportacao cancelada";
    }
}

