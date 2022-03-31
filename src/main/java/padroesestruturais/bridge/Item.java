package padroesestruturais.bridge;

public abstract class Item {

    protected Qualidade qualidade;

    protected float valorBase;

    public Item(float valorBase) {
        this.valorBase = valorBase;
    }

    public void setQualidade(Qualidade qualidade) {
        this.qualidade = qualidade;
    }

    public void setValorBase(float valorBase) {
        this.valorBase = valorBase;
    }

    public abstract float calcularValor();
}
