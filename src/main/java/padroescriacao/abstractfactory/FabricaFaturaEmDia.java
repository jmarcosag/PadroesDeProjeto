package padroescriacao.abstractfactory;

public class FabricaFaturaEmDia implements FabricaAbstrata {

    @Override
    public Fatura createFatura() {
        return new FaturaEmDia();
    }

    @Override
    public Historico createHistorico() {
        return new HistoricoFaturasEmDia();
    }
}
