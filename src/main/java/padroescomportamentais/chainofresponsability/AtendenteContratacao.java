package padroescomportamentais.chainofresponsability;

public class AtendenteContratacao extends Atendente{

    public AtendenteContratacao(Atendente atendente) {
        atendimentoAtendente.add(Contratar.getContratacao());
        setAtendenteServico(atendente);
    }

    @Override
    public String getTipoServicoPorAtendente() {
        return "Atendimentos para contratação de planos";
    }
}