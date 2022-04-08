package padroesestruturais.decorator;

public class TorneioCiclismo extends CompeticaoDecorator {

    public TorneioCiclismo(Competicao competicao) {
        super(competicao);
    }

    public float getPercentualBonusDeTempo() {
        return 15.0f;
    }

    public String getNomeEstrutura() {
        return "C";
    }
}
