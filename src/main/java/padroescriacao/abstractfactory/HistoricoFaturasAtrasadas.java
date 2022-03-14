package padroescriacao.abstractfactory;

public class HistoricoFaturasAtrasadas implements Historico {

    public String emitir() {
        return "Histórico de Faturas atrasadas";
    }
}
