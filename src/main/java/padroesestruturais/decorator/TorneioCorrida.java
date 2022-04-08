package padroesestruturais.decorator;

public class TorneioCorrida extends CompeticaoDecorator {

    public TorneioCorrida(Competicao competicao) {
        super(competicao);
    }

    public float getPercentualBonusDeTempo() {
        return 10.0f;
    }

    public String getNomeEstrutura() {
        return "B";
    }
}
