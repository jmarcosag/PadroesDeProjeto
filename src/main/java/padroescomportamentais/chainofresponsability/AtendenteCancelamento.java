package padroescomportamentais.chainofresponsability;

public class AtendenteCancelamento extends Atendente{

    public AtendenteCancelamento(Atendente atendente) {
        atendimentoAtendente.add(Cancelar.getCancelar());
        setAtendenteServico(atendente);
    }

    @Override
    public String getTipoServicoPorAtendente() {
        return "Atendimentos para cancelamentos de planos";
    }
}
