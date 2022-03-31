package padroesestruturais.bridge;

public class Potion extends Item {

    private int qtdCompra;

    public Potion(float valorBase) {
        super(valorBase);
    }

    public void setQtdCompra(int qtdCompra) {
        this.qtdCompra = qtdCompra;
    }

    public float calcularValor() {
        return this.valorBase * this.qtdCompra * (1 + this.qualidade.percentualAumento());
    }
}
