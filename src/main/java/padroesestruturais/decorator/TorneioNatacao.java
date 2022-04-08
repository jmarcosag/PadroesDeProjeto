package padroesestruturais.decorator;

public class TorneioNatacao extends CompeticaoDecorator {

    public TorneioNatacao(Competicao competicao) {
        super(competicao);
    }

    public float getPercentualBonusDeTempo() {
        return 20.0f;
    }

    public String getNomeEstrutura() {
        return "A";
    }
}
