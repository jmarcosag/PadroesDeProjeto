package padroescomportamentais.chainofresponsability;

public class AtendenteMudanca extends Atendente{

    public AtendenteMudanca(Atendente atendente) {
        atendimentoAtendente.add(Mudanca.getMudanca());
        setAtendenteServico(atendente);
    }

    @Override
    public String getTipoServicoPorAtendente() {
        return "Atendimentos para mudanças de planos";
    }

}