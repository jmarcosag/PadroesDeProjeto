package padroescriacao.abstractfactory;

public class FabricaFaturaAtrasada implements FabricaAbstrata {

    @Override
    public Fatura createFatura() {
        return new FaturaAtrasada();
    }

    @Override
    public Historico createHistorico() {
        return new HistoricoFaturasAtrasadas();
    }
}
