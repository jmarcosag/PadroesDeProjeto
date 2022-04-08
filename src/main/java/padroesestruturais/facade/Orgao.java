package padroesestruturais.facade;

import java.util.ArrayList;
import java.util.List;

public abstract class Orgao {

    private List<Cidadao> cidadaoComPendencia = new ArrayList<Cidadao>();

    public void addCidadaoPendente(Cidadao cidadao) {
        this.cidadaoComPendencia.add(cidadao);
    }

    public boolean verificarCidadaoComPendencia(Cidadao cidadao) {
        return this.cidadaoComPendencia.contains(cidadao);
    }

}

