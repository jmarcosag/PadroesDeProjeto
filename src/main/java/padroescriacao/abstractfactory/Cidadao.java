package padroescriacao.abstractfactory;

public class Cidadao {

    private Fatura fatura;
    private Historico historico;

    public Cidadao(FabricaAbstrata fabrica) {
        this.fatura = fabrica.createFatura();
        this.historico = fabrica.createHistorico();
    }

    public String emitirFatura() {
        return this.fatura.emitir();
    }

    public String emitirHistorico() {
        return this.historico.emitir();
    }
}
