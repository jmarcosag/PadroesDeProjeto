package padroesestruturais.proxy;

import java.util.List;

public class AtletaProxy implements IAtleta {

    private Atleta atleta;

    private Integer codigoInscricao;

    public AtletaProxy(Integer codigoInscricao) {
        this.codigoInscricao = codigoInscricao;
    }

    @Override
    public List<String> obterDadosPessoais() {
        if (this.atleta == null) {
            this.atleta = new Atleta(this.codigoInscricao);
        }
        return this.atleta.obterDadosPessoais();
    }

    @Override
    public List<Float> obterNotas(Funcionario funcionario) {
        if (!funcionario.isAdministrador()) {
            throw new IllegalArgumentException("Funcionário não autorizado");
        }
        if (this.atleta == null) {
            this.atleta = new Atleta(this.codigoInscricao);
        }
        return this.atleta.obterNotas(funcionario);
    }
}
