package padroescomportamentais.chainofresponsability;

import java.util.ArrayList;

public abstract class Atendente {
    protected ArrayList atendimentoAtendente = new ArrayList();
    private Atendente atendente;

    public Atendente getAtendenteServico(){
        return atendente;
    }

    public void setAtendenteServico(Atendente atendente) {
        this.atendente = atendente;
    }

    public abstract String getTipoServicoPorAtendente();

    public String realizarServico(Atendimento atendimento) {
        if(atendimentoAtendente.contains(atendimento.getTipoServico())) {
            return getTipoServicoPorAtendente();
        } else {
            if (atendente != null) {
                return atendente.realizarServico(atendimento);
            } else {
                return "Atendimento indisponível";
            }
        }
    }

}
